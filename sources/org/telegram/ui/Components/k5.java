package org.telegram.ui.Components;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class k5 implements Runnable {
    public final int f29859a;

    public k5(int i10) {
        this.f29859a = i10;
    }

    @Override
    public final void run() {
        switch (this.f29859a) {
            case 0:
                AndroidUtilities.cancelRunOnUIThread(t5.f32851w);
                try {
                    if (t5.f32847r != null) {
                        for (int i10 = 0; i10 < t5.f32847r.size(); i10++) {
                            LongSparseArray longSparseArray = (LongSparseArray) t5.f32847r.valueAt(i10);
                            int i11 = 0;
                            while (i11 < longSparseArray.size()) {
                                if (!((t5) longSparseArray.valueAt(i11)).f32853a) {
                                    longSparseArray.removeAt(i11);
                                    i11--;
                                }
                                i11++;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        FileLog.e(e);
                        return;
                    }
                    return;
                }
            case 1:
                m8 m8Var = m8.Y0;
                return;
            case 2:
                SavedMessagesController.openSavedMessages();
                return;
            case 3:
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.I1.startActivity(intent);
                    return;
                }
                return;
            case 4:
                SavedMessagesController.openSavedMessagesReminders();
                return;
            case 5:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                return;
            case 6:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                return;
            case 7:
                return;
            case 8:
                int i12 = go.f28660r1;
                return;
            case 9:
                PhotoViewer.v1().H0(false, false);
                return;
            case 10:
                PhotoViewer.v1().H0(false, false);
                return;
            case 11:
                int i13 = ju.f29768b;
                return;
            case 12:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 13:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 14:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 15:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 16:
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != 0) {
                    ?? obj = new Object();
                    obj.f22929a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 17:
                int i14 = s11.f32459f;
                return;
            case 18:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                h21.f28834f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 19:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                h21.f28834f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 20:
                int i15 = f41.f28010i0;
                return;
            case 21:
                SavedMessagesController.openSavedMessages();
                return;
            case 22:
                jb1.j();
                return;
            case 23:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 24:
                org.telegram.ui.Components.voip.n2.i();
                return;
            case 25:
                di.f6.p();
                return;
            case 26:
                org.telegram.ui.x50 x50Var = org.telegram.ui.x50.D3;
                if (x50Var != null) {
                    x50Var.show();
                    return;
                }
                return;
            case 27:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 28:
                Pattern pattern = LaunchActivity.D1;
                return;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                return;
        }
    }

    public k5(TLRPC.TL_error tL_error) {
        this.f29859a = 29;
    }

    private final void a() {
    }
}
