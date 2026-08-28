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
public final class hc implements Runnable {
    public final int f29033a;

    public hc(int i9) {
        this.f29033a = i9;
    }

    @Override
    public final void run() {
        switch (this.f29033a) {
            case 0:
                SavedMessagesController.openSavedMessages();
                return;
            case 1:
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.C1.startActivity(intent);
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
                int i9 = jn.f29763i1;
                return;
            case 7:
                PhotoViewer.t1().F0(false, false);
                return;
            case 8:
                PhotoViewer.t1().F0(false, false);
                return;
            case 9:
                int i10 = mt.f30918b;
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
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != 0) {
                    ?? obj = new Object();
                    obj.f23653a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 13:
                int i11 = oz0.f31478f;
                return;
            case 14:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                d01.f27619f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 15:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                d01.f27619f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 16:
                int i12 = b21.f26998b0;
                return;
            case 17:
                SavedMessagesController.openSavedMessages();
                return;
            case 18:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 19:
                org.telegram.ui.Components.voip.l2.i();
                return;
            case 20:
                ih.s5.p();
                return;
            case 21:
                org.telegram.ui.o50 o50Var = org.telegram.ui.o50.f40880z3;
                if (o50Var != null) {
                    o50Var.show();
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
                Pattern pattern = LaunchActivity.f35493x1;
                return;
            case 24:
                Pattern pattern2 = LaunchActivity.f35493x1;
                return;
            case 25:
                Pattern pattern3 = LaunchActivity.f35493x1;
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
                oc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
        }
    }

    public hc(Object obj, int i9) {
        this.f29033a = i9;
    }

    private final void a() {
    }

    private final void b() {
    }
}
