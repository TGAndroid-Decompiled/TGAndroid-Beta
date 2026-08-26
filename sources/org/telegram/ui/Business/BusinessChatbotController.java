package org.telegram.ui.Business;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;

public final class BusinessChatbotController {
    public static volatile BusinessChatbotController[] Instance = new BusinessChatbotController[4];
    public static final Object[] lockObjects = new Object[4];
    public final ArrayList callbacks = new ArrayList();
    public final int currentAccount;
    public long lastTime;
    public boolean loaded;
    public boolean loading;
    public TL_account.connectedBots value;

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    public BusinessChatbotController(int i) {
        this.currentAccount = i;
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

    public final void load(Utilities.Callback callback) {
        boolean z;
        ArrayList arrayList = this.callbacks;
        if (callback != null) {
            arrayList.add(callback);
        }
        if (this.loading) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.lastTime;
        int i = this.currentAccount;
        if (jCurrentTimeMillis > 60000 || !(z = this.loaded)) {
            this.loading = true;
            ConnectionsManager.getInstance(i).sendRequest(new TL_account.getConnectedBots(), new RichMediaUploader$$ExternalSyntheticLambda0(this, 6));
        } else if (z) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (arrayList.get(i2) != null) {
                    ((Utilities.Callback) arrayList.get(i2)).run(this.value);
                }
            }
            arrayList.clear();
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updatedChatbot, new Object[0]);
        }
    }
}
