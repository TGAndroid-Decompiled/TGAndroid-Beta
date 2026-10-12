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
public final class ve implements Runnable {
    public final int f29945a;

    public ve(int i10) {
        this.f29945a = i10;
    }

    @Override
    public final void run() {
        switch (this.f29945a) {
            case 0:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                return;
            case 1:
                return;
            case 2:
                int i10 = io.f26000m1;
                return;
            case 3:
                PhotoViewer.t1().G0(false, false);
                return;
            case 4:
                PhotoViewer.t1().G0(false, false);
                return;
            case 5:
                int i11 = nu.f27715b;
                return;
            case 6:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 7:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 8:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 9:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 10:
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != 0) {
                    ?? obj = new Object();
                    obj.f20469a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 11:
                int i12 = i11.f25794f;
                return;
            case 12:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                y11.f31450f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 13:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                y11.f31450f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 14:
                int i13 = y31.f31469f0;
                return;
            case 15:
                SavedMessagesController.openSavedMessages();
                return;
            case 16:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 17:
                org.telegram.ui.Components.voip.k2.i();
                return;
            case 18:
                bi.j7.r();
                return;
            case 19:
                org.telegram.ui.n60 n60Var = org.telegram.ui.n60.D3;
                if (n60Var != null) {
                    n60Var.show();
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
                Pattern pattern = LaunchActivity.B1;
                return;
            case 22:
                Pattern pattern2 = LaunchActivity.B1;
                return;
            case 23:
                Pattern pattern3 = LaunchActivity.B1;
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
                zc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 28:
                zc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                return;
        }
    }

    public ve(Object obj, int i10) {
        this.f29945a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
