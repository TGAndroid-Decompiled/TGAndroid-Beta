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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.x91;
public final class c30 implements Runnable {
    public final int f21983a;

    public c30(int i10) {
        this.f21983a = i10;
    }

    @Override
    public final void run() {
        wc a02;
        switch (this.f21983a) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 1:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != 0) {
                    ?? obj = new Object();
                    obj.f18485a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 3:
                int i10 = u01.f27540f;
                return;
            case 4:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                k11.f24561f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 5:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                k11.f24561f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 6:
                int i11 = k31.f24585f0;
                return;
            case 7:
                SavedMessagesController.openSavedMessages();
                return;
            case 8:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 9:
                org.telegram.ui.Components.voip.l2.i();
                return;
            case 10:
                zh.i4.p();
                return;
            case 11:
                org.telegram.ui.j60 j60Var = org.telegram.ui.j60.D3;
                if (j60Var != null) {
                    j60Var.show();
                    return;
                }
                return;
            case 12:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 13:
                Pattern pattern = LaunchActivity.B1;
                return;
            case 14:
                Pattern pattern2 = LaunchActivity.B1;
                return;
            case 15:
                Pattern pattern3 = LaunchActivity.B1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                return;
            case 16:
                return;
            case 17:
                CallReceiver.checkLastReceivedCall();
                return;
            case 18:
                CallReceiver.checkLastReceivedCall();
                return;
            case 19:
                wc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 20:
                wc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 21:
                Drawable[] drawableArr = PhotoViewer.T8;
                return;
            case 22:
                wc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 23:
                wc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 24:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null && (a02 = wc.a0(U)) != null) {
                    pc M = a02.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                    M.f26081j = 5000;
                    M.j();
                    return;
                }
                return;
            case 25:
                int i12 = x91.f38646d0;
                return;
            case 26:
                org.telegram.ui.ActionBar.j6.N = false;
                org.telegram.ui.ActionBar.j6.E(false);
                return;
            case 27:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    return;
                }
                return;
            case 28:
                int[][] iArr = WallpapersListActivity.f30730k0;
                PhotoViewer.t1().G0(false, false);
                return;
            default:
                Utilities.globalQueue.postRunnable(new org.telegram.ui.web.d1(1));
                return;
        }
    }

    public c30(Object obj, int i10) {
        this.f21983a = i10;
    }

    private final void a() {
    }
}
