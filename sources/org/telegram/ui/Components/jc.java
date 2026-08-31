package org.telegram.ui.Components;

import android.content.Intent;
import android.content.SharedPreferences;
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
public final class jc implements Runnable {
    public final int f28092a;

    public jc(int i10) {
        this.f28092a = i10;
    }

    @Override
    public final void run() {
        switch (this.f28092a) {
            case 0:
                SavedMessagesController.openSavedMessages();
                return;
            case 1:
                LaunchActivity launchActivity = LaunchActivity.D1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.D1.startActivity(intent);
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
                int i10 = sn.f31093j1;
                return;
            case 7:
                PhotoViewer.t1().G0(false, false);
                return;
            case 8:
                PhotoViewer.t1().G0(false, false);
                return;
            case 9:
                int i11 = xt.f33180b;
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
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != 0) {
                    ?? obj = new Object();
                    obj.f22156a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 13:
                int i12 = m01.f28876f;
                return;
            case 14:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                b11.f25454f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 15:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                b11.f25454f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 16:
                int i13 = x21.f32925c0;
                return;
            case 17:
                SavedMessagesController.openSavedMessages();
                return;
            case 18:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 19:
                org.telegram.ui.Components.voip.n2.i();
                return;
            case 20:
                oh.r5.p();
                return;
            case 21:
                org.telegram.ui.d60 d60Var = org.telegram.ui.d60.A3;
                if (d60Var != null) {
                    d60Var.show();
                    return;
                }
                return;
            case 22:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 23:
                Pattern pattern = LaunchActivity.f34134y1;
                return;
            case 24:
                Pattern pattern2 = LaunchActivity.f34134y1;
                return;
            case 25:
                Pattern pattern3 = LaunchActivity.f34134y1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                return;
            case 26:
                return;
            case 27:
                CallReceiver.checkLastReceivedCall();
                return;
            case 28:
                CallReceiver.checkLastReceivedCall();
                return;
            default:
                qc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
        }
    }

    public jc(Object obj, int i10) {
        this.f28092a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
