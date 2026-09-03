package org.telegram.messenger;

import android.net.Uri;
import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yg implements Runnable {
    public final int f20714a;
    public final Object f20715b;
    public final Object f20716c;

    public yg(int i10, Object obj, Object obj2) {
        this.f20714a = i10;
        this.f20715b = obj;
        this.f20716c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f20714a) {
            case 0:
                ((NotificationBadge.ZukHomeBadger) this.f20715b).lambda$executeBadge$0((Bundle) this.f20716c);
                return;
            case 1:
                NotificationsController.lambda$showExtraNotifications$45((Uri) this.f20715b, (File) this.f20716c);
                return;
            case 2:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$53((Consumer) this.f20715b, (HashSet) this.f20716c);
                return;
            case 3:
                ((NotificationsController) this.f20715b).lambda$didReceivedNotification$38((String) this.f20716c);
                return;
            case 4:
                ((NotificationsController) this.f20715b).lambda$processEditedMessages$22((a0.h) this.f20716c);
                return;
            case 5:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.f20715b, (Throwable) this.f20716c);
                return;
            case 6:
                ((SavedMessagesController) this.f20715b).lambda$deleteCache$13((MessagesStorage) this.f20716c);
                return;
            case 7:
                ((SecretChatHelper) this.f20715b).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.f20716c);
                return;
            case 8:
                ((SendMessagesHelper) this.f20715b).lambda$performSendMessageRequest$90((TLRPC.TL_updateShortSentMessage) this.f20716c);
                return;
            case 9:
                ((SendMessagesHelper) this.f20715b).lambda$sendMessage$16((ArrayList) this.f20716c);
                return;
            case 10:
                ((SendMessagesHelper.ImportingStickers) this.f20715b).lambda$onMediaImport$0((String) this.f20716c);
                return;
            case 11:
                ((TopicsController) this.f20715b).lambda$processUpdate$22((List) this.f20716c);
                return;
            case 12:
                ((TopicsController) this.f20715b).lambda$pinTopic$19((org.telegram.ui.ActionBar.p2) this.f20716c);
                return;
            case 13:
                ((TopicsController) this.f20715b).lambda$onTopicsDeletedServerSide$23((ArrayList) this.f20716c);
                return;
            case 14:
                ((TopicsController) this.f20715b).lambda$updateReadOutbox$26((HashMap) this.f20716c);
                return;
            default:
                ((UserConfig) this.f20715b).lambda$loadGlobalTTl$3((TLObject) this.f20716c);
                return;
        }
    }
}
