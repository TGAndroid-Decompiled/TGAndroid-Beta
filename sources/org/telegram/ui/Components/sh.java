package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import java.util.regex.Pattern;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class sh implements Runnable {
    public final int f27861a;

    public sh(int i10) {
        this.f27861a = i10;
    }

    @Override
    public final void run() {
        vc a02;
        switch (this.f27861a) {
            case 0:
                return;
            case 1:
                int i10 = un.f28410m1;
                return;
            case 2:
                PhotoViewer.t1().G0(false, false);
                return;
            case 3:
                PhotoViewer.t1().G0(false, false);
                return;
            case 4:
                int i11 = bu.f22803b;
                return;
            case 5:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 6:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != 0) {
                    ?? obj = new Object();
                    obj.f19397a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 8:
                int i12 = i01.f24785f;
                return;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                y01.f30066f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 10:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                y01.f30066f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 11:
                int i13 = y21.f30095f0;
                return;
            case 12:
                SavedMessagesController.openSavedMessages();
                return;
            case 13:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 14:
                org.telegram.ui.Components.voip.m2.i();
                return;
            case 15:
                ai.w7.p();
                return;
            case 16:
                org.telegram.ui.k60 k60Var = org.telegram.ui.k60.D3;
                if (k60Var != null) {
                    k60Var.show();
                    return;
                }
                return;
            case 17:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 18:
                Pattern pattern = LaunchActivity.B1;
                return;
            case 19:
                Pattern pattern2 = LaunchActivity.B1;
                return;
            case 20:
                Pattern pattern3 = LaunchActivity.B1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                return;
            case 21:
                return;
            case 22:
                CallReceiver.checkLastReceivedCall();
                return;
            case 23:
                CallReceiver.checkLastReceivedCall();
                return;
            case 24:
                vc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 25:
                vc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 26:
                Drawable[] drawableArr = PhotoViewer.T8;
                return;
            case 27:
                vc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 28:
                vc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null && (a02 = vc.a0(U)) != null) {
                    oc M = a02.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                    M.f26702j = 5000;
                    M.j();
                    return;
                }
                return;
        }
    }

    public sh(Object obj, int i10) {
        this.f27861a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
