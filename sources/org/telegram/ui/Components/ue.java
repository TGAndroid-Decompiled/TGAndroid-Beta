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
public final class ue implements Runnable {
    public final int f30867a;

    public ue(int i10) {
        this.f30867a = i10;
    }

    @Override
    public final void run() {
        switch (this.f30867a) {
            case 0:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                return;
            case 1:
                return;
            case 2:
                int i10 = tn.f30623m1;
                return;
            case 3:
                PhotoViewer.t1().G0(false, false);
                return;
            case 4:
                PhotoViewer.t1().G0(false, false);
                return;
            case 5:
                int i11 = zt.f33230b;
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
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != 0) {
                    ?? obj = new Object();
                    obj.f21142a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 9:
                int i12 = g01.f26223f;
                return;
            case 10:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                w01.f32051f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 11:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                w01.f32051f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 12:
                int i13 = w21.f32090f0;
                return;
            case 13:
                SavedMessagesController.openSavedMessages();
                return;
            case 14:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 15:
                org.telegram.ui.Components.voip.k2.i();
                return;
            case 16:
                bi.f7.p();
                return;
            case 17:
                org.telegram.ui.j60 j60Var = org.telegram.ui.j60.D3;
                if (j60Var != null) {
                    j60Var.show();
                    return;
                }
                return;
            case 18:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 19:
                Pattern pattern = LaunchActivity.B1;
                return;
            case 20:
                Pattern pattern2 = LaunchActivity.B1;
                return;
            case 21:
                Pattern pattern3 = LaunchActivity.B1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                return;
            case 22:
                return;
            case 23:
                CallReceiver.checkLastReceivedCall();
                return;
            case 24:
                CallReceiver.checkLastReceivedCall();
                return;
            case 25:
                yc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 26:
                yc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 27:
                Drawable[] drawableArr = PhotoViewer.T8;
                return;
            case 28:
                yc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                yc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
        }
    }

    public ue(Object obj, int i10) {
        this.f30867a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
