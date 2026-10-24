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
public final class pc implements Runnable {
    public final int f29536a;

    public pc(int i10) {
        this.f29536a = i10;
    }

    @Override
    public final void run() {
        switch (this.f29536a) {
            case 0:
                SavedMessagesController.openSavedMessages();
                return;
            case 1:
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.I1.startActivity(intent);
                    return;
                }
                return;
            case 2:
                SavedMessagesController.openSavedMessagesReminders();
                return;
            case 3:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                return;
            case 4:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                return;
            case 5:
                return;
            case 6:
                int i10 = co.f25356r1;
                return;
            case 7:
                PhotoViewer.u1().H0(false, false);
                return;
            case 8:
                PhotoViewer.u1().H0(false, false);
                return;
            case 9:
                int i11 = gu.f26790b;
                return;
            case 10:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 11:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 12:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 13:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 14:
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != 0) {
                    ?? obj = new Object();
                    obj.f21637a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 15:
                int i12 = i11.f27247f;
                return;
            case 16:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                x11.f32478f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 17:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                x11.f32478f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 18:
                int i13 = v31.f31295i0;
                return;
            case 19:
                SavedMessagesController.openSavedMessages();
                return;
            case 20:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 21:
                org.telegram.ui.Components.voip.k2.i();
                return;
            case 22:
                ci.f6.q();
                return;
            case 23:
                org.telegram.ui.u50 u50Var = org.telegram.ui.u50.D3;
                if (u50Var != null) {
                    u50Var.show();
                    return;
                }
                return;
            case 24:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 25:
                Pattern pattern = LaunchActivity.D1;
                return;
            case 26:
                Pattern pattern2 = LaunchActivity.D1;
                return;
            case 27:
                Pattern pattern3 = LaunchActivity.D1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                return;
            case 28:
                return;
            default:
                CallReceiver.checkLastReceivedCall();
                return;
        }
    }

    public pc(Object obj, int i10) {
        this.f29536a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
