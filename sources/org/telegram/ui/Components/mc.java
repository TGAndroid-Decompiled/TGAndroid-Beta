package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import java.util.regex.Pattern;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class mc implements Runnable {
    public final int f26995a;

    public mc(int i10) {
        this.f26995a = i10;
    }

    @Override
    public final void run() {
        switch (this.f26995a) {
            case 0:
                SavedMessagesController.openSavedMessagesReminders();
                return;
            case 1:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                return;
            case 2:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                return;
            case 3:
                return;
            case 4:
                int i10 = qn.f28159j1;
                return;
            case 5:
                PhotoViewer.t1().G0(false, false);
                return;
            case 6:
                PhotoViewer.t1().G0(false, false);
                return;
            case 7:
                int i11 = vt.f30084b;
                return;
            case 8:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 9:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 10:
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != 0) {
                    ?? obj = new Object();
                    obj.f20478a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 11:
                int i12 = l01.f26504f;
                return;
            case 12:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                a11.f23261f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 13:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                a11.f23261f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 14:
                int i13 = w21.f30171c0;
                return;
            case 15:
                SavedMessagesController.openSavedMessages();
                return;
            case 16:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 17:
                org.telegram.ui.Components.voip.m2.i();
                return;
            case 18:
                nh.r5.p();
                return;
            case 19:
                org.telegram.ui.c60 c60Var = org.telegram.ui.c60.A3;
                if (c60Var != null) {
                    c60Var.show();
                    return;
                }
                return;
            case 20:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 21:
                Pattern pattern = LaunchActivity.f31612y1;
                return;
            case 22:
                Pattern pattern2 = LaunchActivity.f31612y1;
                return;
            case 23:
                Pattern pattern3 = LaunchActivity.f31612y1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                return;
            case 24:
                return;
            case 25:
                CallReceiver.checkLastReceivedCall();
                return;
            case 26:
                CallReceiver.checkLastReceivedCall();
                return;
            case 27:
                qc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 28:
                qc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.Q8;
                return;
        }
    }

    public mc(Object obj, int i10) {
        this.f26995a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
