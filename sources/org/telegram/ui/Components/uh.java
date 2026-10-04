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
public final class uh implements Runnable {
    public final int f31368a;

    public uh(int i10) {
        this.f31368a = i10;
    }

    @Override
    public final void run() {
        switch (this.f31368a) {
            case 0:
                return;
            case 1:
                int i10 = xn.f32905m1;
                return;
            case 2:
                PhotoViewer.t1().G0(false, false);
                return;
            case 3:
                PhotoViewer.t1().G0(false, false);
                return;
            case 4:
                int i11 = eu.f26130b;
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
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 8:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 9:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != 0) {
                    ?? obj = new Object();
                    obj.f21349a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 10:
                int i12 = f11.f26228f;
                return;
            case 11:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                v11.f31498f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 12:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                v11.f31498f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 13:
                int i13 = v31.f31542f0;
                return;
            case 14:
                SavedMessagesController.openSavedMessages();
                return;
            case 15:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 16:
                org.telegram.ui.Components.voip.n2.i();
                return;
            case 17:
                ai.x7.p();
                return;
            case 18:
                org.telegram.ui.h60 h60Var = org.telegram.ui.h60.D3;
                if (h60Var != null) {
                    h60Var.show();
                    return;
                }
                return;
            case 19:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 20:
                Pattern pattern = LaunchActivity.B1;
                return;
            case 21:
                Pattern pattern2 = LaunchActivity.B1;
                return;
            case 22:
                Pattern pattern3 = LaunchActivity.B1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                return;
            case 23:
                return;
            case 24:
                CallReceiver.checkLastReceivedCall();
                return;
            case 25:
                CallReceiver.checkLastReceivedCall();
                return;
            case 26:
                yc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 27:
                yc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 28:
                Drawable[] drawableArr = PhotoViewer.U8;
                return;
            default:
                yc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
        }
    }

    public uh(Object obj, int i10) {
        this.f31368a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
