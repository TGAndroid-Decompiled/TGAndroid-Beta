package org.telegram.messenger;

import android.content.Intent;
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
    public final int f19054a;
    public final Object f19055b;
    public final Object f19056c;

    public yg(int i10, Object obj, Object obj2) {
        this.f19054a = i10;
        this.f19055b = obj;
        this.f19056c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19054a) {
            case 0:
                NotificationBadge.NewHtcHomeBadger.lambda$executeBadge$0((Intent) this.f19055b, (Intent) this.f19056c);
                return;
            case 1:
                ((NotificationBadge.ZukHomeBadger) this.f19055b).lambda$executeBadge$0((Bundle) this.f19056c);
                return;
            case 2:
                NotificationsController.lambda$showExtraNotifications$45((Uri) this.f19055b, (File) this.f19056c);
                return;
            case 3:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$53((Consumer) this.f19055b, (HashSet) this.f19056c);
                return;
            case 4:
                ((NotificationsController) this.f19055b).lambda$didReceivedNotification$38((String) this.f19056c);
                return;
            case 5:
                ((NotificationsController) this.f19055b).lambda$processEditedMessages$22((a0.h) this.f19056c);
                return;
            case 6:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.f19055b, (Throwable) this.f19056c);
                return;
            case 7:
                ((SavedMessagesController) this.f19055b).lambda$deleteCache$13((MessagesStorage) this.f19056c);
                return;
            case 8:
                ((SecretChatHelper) this.f19055b).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.f19056c);
                return;
            case 9:
                ((SendMessagesHelper) this.f19055b).lambda$performSendMessageRequest$90((TLRPC.TL_updateShortSentMessage) this.f19056c);
                return;
            case 10:
                ((SendMessagesHelper) this.f19055b).lambda$sendMessage$16((ArrayList) this.f19056c);
                return;
            case 11:
                ((SendMessagesHelper.ImportingStickers) this.f19055b).lambda$onMediaImport$0((String) this.f19056c);
                return;
            case 12:
                ((TopicsController) this.f19055b).lambda$processUpdate$22((List) this.f19056c);
                return;
            case 13:
                ((TopicsController) this.f19055b).lambda$pinTopic$19((org.telegram.ui.ActionBar.p2) this.f19056c);
                return;
            case 14:
                ((TopicsController) this.f19055b).lambda$onTopicsDeletedServerSide$23((ArrayList) this.f19056c);
                return;
            case 15:
                ((TopicsController) this.f19055b).lambda$updateReadOutbox$26((HashMap) this.f19056c);
                return;
            case 16:
                ((UserConfig) this.f19055b).lambda$loadGlobalTTl$3((TLObject) this.f19056c);
                return;
            default:
                ((WebProxyTransport) this.f19055b).lambda$onWebMessage$3((byte[]) this.f19056c);
                return;
        }
    }
}
