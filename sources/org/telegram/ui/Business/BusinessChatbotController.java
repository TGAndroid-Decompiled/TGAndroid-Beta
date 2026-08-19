package org.telegram.ui.Business;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public class BusinessChatbotController {
    private static volatile BusinessChatbotController[] Instance = new BusinessChatbotController[4];
    private static final Object[] lockObjects = new Object[4];
    private ArrayList callbacks = new ArrayList();
    private final int currentAccount;
    private long lastTime;
    private boolean loaded;
    private boolean loading;
    private TL_account.connectedBots value;

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    public static BusinessChatbotController getInstance(int i) {
        BusinessChatbotController businessChatbotController;
        BusinessChatbotController businessChatbotController2 = Instance[i];
        if (businessChatbotController2 != null) {
            return businessChatbotController2;
        }
        synchronized (lockObjects[i]) {
            try {
                businessChatbotController = Instance[i];
                if (businessChatbotController == null) {
                    BusinessChatbotController[] businessChatbotControllerArr = Instance;
                    BusinessChatbotController businessChatbotController3 = new BusinessChatbotController(i);
                    businessChatbotControllerArr[i] = businessChatbotController3;
                    businessChatbotController = businessChatbotController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return businessChatbotController;
    }

    private BusinessChatbotController(int i) {
        this.currentAccount = i;
    }

    public TL_account.connectedBots getValue() {
        return this.value;
    }

    public void load(Utilities.Callback callback) {
        boolean z;
        if (callback != null) {
            this.callbacks.add(callback);
        }
        if (this.loading) {
            return;
        }
        if (System.currentTimeMillis() - this.lastTime > 60000 || !(z = this.loaded)) {
            this.loading = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getConnectedBots(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    BusinessChatbotController.$r8$lambda$O1b91JEoRK8MmFOdNHZsGSrLz6U(this.f$0, tLObject, tL_error);
                }
            });
        } else if (z) {
            notifyUpdate();
        }
    }

    public static void $r8$lambda$O1b91JEoRK8MmFOdNHZsGSrLz6U(final BusinessChatbotController businessChatbotController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        businessChatbotController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BusinessChatbotController.$r8$lambda$mZYsdZa5WLypcxQMXICc8BElgCg(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$mZYsdZa5WLypcxQMXICc8BElgCg(BusinessChatbotController businessChatbotController, TLObject tLObject) {
        businessChatbotController.loading = false;
        TL_account.connectedBots connectedbots = tLObject instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject : null;
        businessChatbotController.value = connectedbots;
        if (connectedbots != null) {
            MessagesController.getInstance(businessChatbotController.currentAccount).putUsers(businessChatbotController.value.users, false);
        }
        businessChatbotController.lastTime = System.currentTimeMillis();
        businessChatbotController.loaded = true;
        businessChatbotController.notifyUpdate();
    }

    public void notifyUpdate() {
        for (int i = 0; i < this.callbacks.size(); i++) {
            if (this.callbacks.get(i) != null) {
                ((Utilities.Callback) this.callbacks.get(i)).run(this.value);
            }
        }
        this.callbacks.clear();
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.updatedChatbot, new Object[0]);
    }

    public void invalidate(boolean z) {
        this.loaded = false;
        if (z) {
            load(null);
        }
    }
}
