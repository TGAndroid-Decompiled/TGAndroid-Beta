package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationRepeat;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;

public final class LaunchActivity$$ExternalSyntheticLambda42 implements Runnable {
    public final int $r8$classId;
    public final int f$0;

    public LaunchActivity$$ExternalSyntheticLambda42(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                int i = this.f$0;
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                ApplicationLoader.mainInterfacePausedStageQueue = true;
                ApplicationLoader.mainInterfacePausedStageQueueTime = 0L;
                if (VoIPService.getSharedInstance() == null) {
                    MessagesController.getInstance(i).ignoreSetOnline = false;
                }
                break;
            case 1:
                MediaController.lambda$loadGalleryPhotosAlbums$57(this.f$0);
                break;
            case 2:
                MediaController.lambda$checkGallery$1(this.f$0);
                break;
            case 3:
                NotificationRepeat.lambda$onHandleIntent$0(this.f$0);
                break;
            case 4:
                PushListenerController.lambda$processRemoteMessage$4(this.f$0);
                break;
            case 5:
                PushListenerController.lambda$processRemoteMessage$3(this.f$0);
                break;
            case 6:
                SharedConfig.lambda$checkLogsToDelete$3(this.f$0);
                break;
            case 7:
                ConnectionsManager.lambda$onUpdate$13(this.f$0);
                break;
            case 8:
                ConnectionsManager.lambda$onSessionCreated$14(this.f$0);
                break;
            case 9:
                ConnectionsManager.lambda$onLogout$16(this.f$0);
                break;
            case 10:
                MediaDataController.getInstance(this.f$0).checkStickers(5);
                break;
            default:
                MediaDataController.getInstance(this.f$0).loadAttachMenuBots(false, true);
                break;
        }
    }
}
