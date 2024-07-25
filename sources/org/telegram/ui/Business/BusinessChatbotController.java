package org.telegram.ui.Business;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_account_connectedBots;
import org.telegram.tgnet.TLRPC$TL_error;
public class BusinessChatbotController {
    private static volatile BusinessChatbotController[] Instance = new BusinessChatbotController[4];
    private static final Object[] lockObjects = new Object[4];
    private ArrayList<Utilities.Callback<TLRPC$TL_account_connectedBots>> callbacks = new ArrayList<>();
    private final int currentAccount;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private TLRPC$TL_account_connectedBots value;

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    public static BusinessChatbotController getInstance(int i) {
        BusinessChatbotController businessChatbotController = Instance[i];
        if (businessChatbotController == null) {
            synchronized (lockObjects[i]) {
                businessChatbotController = Instance[i];
                if (businessChatbotController == null) {
                    BusinessChatbotController[] businessChatbotControllerArr = Instance;
                    BusinessChatbotController businessChatbotController2 = new BusinessChatbotController(i);
                    businessChatbotControllerArr[i] = businessChatbotController2;
                    businessChatbotController = businessChatbotController2;
                }
            }
        }
        return businessChatbotController;
    }

    private BusinessChatbotController(int i) {
        this.currentAccount = i;
    }

    public void load(Utilities.Callback<TLRPC$TL_account_connectedBots> callback) {
        boolean z;
        this.callbacks.add(callback);
        if (this.loading) {
            return;
        }
        if (System.currentTimeMillis() - this.lastTime > 60000 || !(z = this.loaded)) {
            this.loading = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
                public static int constructor = 1319421967;

                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z2) {
                    return TLRPC$TL_account_connectedBots.TLdeserialize(abstractSerializedData, i, z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    BusinessChatbotController.this.lambda$load$1(tLObject, tLRPC$TL_error);
                }
            });
        } else if (z) {
            for (int i = 0; i < this.callbacks.size(); i++) {
                if (this.callbacks.get(i) != null) {
                    this.callbacks.get(i).run(this.value);
                }
            }
            this.callbacks.clear();
        }
    }

    public void lambda$load$1(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BusinessChatbotController.this.lambda$load$0(tLObject);
            }
        });
    }

    public void lambda$load$0(TLObject tLObject) {
        this.loading = false;
        TLRPC$TL_account_connectedBots tLRPC$TL_account_connectedBots = tLObject instanceof TLRPC$TL_account_connectedBots ? (TLRPC$TL_account_connectedBots) tLObject : null;
        this.value = tLRPC$TL_account_connectedBots;
        if (tLRPC$TL_account_connectedBots != null) {
            MessagesController.getInstance(this.currentAccount).putUsers(this.value.users, false);
        }
        this.lastTime = System.currentTimeMillis();
        this.loaded = true;
        for (int i = 0; i < this.callbacks.size(); i++) {
            if (this.callbacks.get(i) != null) {
                this.callbacks.get(i).run(this.value);
            }
        }
        this.callbacks.clear();
    }

    public void invalidate(boolean z) {
        this.loaded = false;
        if (z) {
            load(null);
        }
    }
}
