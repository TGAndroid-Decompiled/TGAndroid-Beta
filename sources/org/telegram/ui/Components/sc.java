package org.telegram.ui.Components;

import android.content.Intent;
import android.content.SharedPreferences;
import java.util.regex.Pattern;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class sc implements Runnable {
    public final int f30235a;

    public sc(int i10) {
        this.f30235a = i10;
    }

    @Override
    public final void run() {
        switch (this.f30235a) {
            case 0:
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.H1.startActivity(intent);
                    return;
                }
                return;
            case 1:
                SavedMessagesController.openSavedMessagesReminders();
                return;
            case 2:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                return;
            case 3:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                return;
            case 4:
                return;
            case 5:
                int i10 = fo.f26277m1;
                return;
            case 6:
                PhotoViewer.t1().G0(false, false);
                return;
            case 7:
                PhotoViewer.t1().G0(false, false);
                return;
            case 8:
                int i11 = iu.f27351b;
                return;
            case 9:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 10:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 11:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 12:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 13:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != 0) {
                    ?? obj = new Object();
                    obj.f21552a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 14:
                int i12 = e11.f25777f;
                return;
            case 15:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                t11.f30429f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 16:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                t11.f30429f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 17:
                int i13 = q31.f29555f0;
                return;
            case 18:
                SavedMessagesController.openSavedMessages();
                return;
            case 19:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 20:
                org.telegram.ui.Components.voip.k2.i();
                return;
            case 21:
                ci.f6.q();
                return;
            case 22:
                org.telegram.ui.s50 s50Var = org.telegram.ui.s50.D3;
                if (s50Var != null) {
                    s50Var.show();
                    return;
                }
                return;
            case 23:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 24:
                Pattern pattern = LaunchActivity.C1;
                return;
            case 25:
                Pattern pattern2 = LaunchActivity.C1;
                return;
            case 26:
                Pattern pattern3 = LaunchActivity.C1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                return;
            case 27:
                return;
            case 28:
                CallReceiver.checkLastReceivedCall();
                return;
            default:
                CallReceiver.checkLastReceivedCall();
                return;
        }
    }

    public sc(Object obj, int i10) {
        this.f30235a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
