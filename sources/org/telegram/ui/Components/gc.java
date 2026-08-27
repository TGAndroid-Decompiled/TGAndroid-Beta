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

public final class gc implements Runnable {

    public final int f28591a;

    public gc(int i10) {
        this.f28591a = i10;
    }

    @Override
    public final void run() {
        switch (this.f28591a) {
            case 0:
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.C1.startActivity(intent);
                    break;
                }
                break;
            case 1:
                SavedMessagesController.openSavedMessagesReminders();
                break;
            case 2:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                break;
            case 3:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                break;
            case 4:
                break;
            case 5:
                int i10 = in.f29409i1;
                break;
            case 6:
                PhotoViewer.t1().G0(false, false);
                break;
            case 7:
                PhotoViewer.t1().G0(false, false);
                break;
            case 8:
                int i11 = lt.f30461b;
                break;
            case 9:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 10:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                if (n2VarR != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.f23619a = true;
                    n2VarR.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), l2Var);
                }
                break;
            case 12:
                int i12 = qz0.f32008f;
                break;
            case 13:
                SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                f01.f28220f = Boolean.TRUE;
                editorEdit.putBoolean("nothanos", true).apply();
                break;
            case 14:
                SharedPreferences.Editor editorEdit2 = MessagesController.getGlobalMainSettings().edit();
                f01.f28220f = Boolean.TRUE;
                editorEdit2.putBoolean("nothanos", true).apply();
                break;
            case 15:
                int i13 = d21.f27622b0;
                break;
            case 16:
                SavedMessagesController.openSavedMessages();
                break;
            case 17:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 18:
                org.telegram.ui.Components.voip.l2.i();
                break;
            case 19:
                jh.o5.q();
                break;
            case 20:
                org.telegram.ui.s50 s50Var = org.telegram.ui.s50.f42409z3;
                if (s50Var != null) {
                    s50Var.show();
                }
                break;
            case 21:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 22:
                Pattern pattern = LaunchActivity.f35496x1;
                break;
            case 23:
                Pattern pattern2 = LaunchActivity.f35496x1;
                break;
            case 24:
                Pattern pattern3 = LaunchActivity.f35496x1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                break;
            case 25:
                break;
            case 26:
                CallReceiver.checkLastReceivedCall();
                break;
            case 27:
                CallReceiver.checkLastReceivedCall();
                break;
            case 28:
                mc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            default:
                mc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
        }
    }

    public gc(Object obj, int i10) {
        this.f28591a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
