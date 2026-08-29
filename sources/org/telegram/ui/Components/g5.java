package org.telegram.ui.Components;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class g5 implements Runnable {
    public final int f28758a;

    public g5(int i10) {
        this.f28758a = i10;
    }

    @Override
    public final void run() {
        switch (this.f28758a) {
            case 0:
                AndroidUtilities.cancelRunOnUIThread(p5.v);
                try {
                    if (p5.f31579q != null) {
                        for (int i10 = 0; i10 < p5.f31579q.size(); i10++) {
                            LongSparseArray longSparseArray = (LongSparseArray) p5.f31579q.valueAt(i10);
                            int i11 = 0;
                            while (i11 < longSparseArray.size()) {
                                if (!((p5) longSparseArray.valueAt(i11)).f31585a) {
                                    longSparseArray.removeAt(i11);
                                    i11--;
                                }
                                i11++;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        FileLog.e(e10);
                        return;
                    }
                    return;
                }
            case 1:
                g8 g8Var = g8.P0;
                return;
            case 2:
                SavedMessagesController.openSavedMessages();
                return;
            case 3:
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.C1.startActivity(intent);
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
                int i12 = on.f31399i1;
                return;
            case 9:
                PhotoViewer.t1().G0(false, false);
                return;
            case 10:
                PhotoViewer.t1().G0(false, false);
                return;
            case 11:
                int i13 = st.f32718b;
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
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != 0) {
                    ?? obj = new Object();
                    obj.f23673a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 15:
                int i14 = a01.f26610f;
                return;
            case 16:
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                p01.f31532f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 17:
                SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
                p01.f31532f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 18:
                int i15 = m21.f30549b0;
                return;
            case 19:
                SavedMessagesController.openSavedMessages();
                return;
            case 20:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 21:
                org.telegram.ui.Components.voip.o2.i();
                return;
            case 22:
                lh.q5.p();
                return;
            case 23:
                org.telegram.ui.r50 r50Var = org.telegram.ui.r50.f41867z3;
                if (r50Var != null) {
                    r50Var.show();
                    return;
                }
                return;
            case 24:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 25:
                Pattern pattern = LaunchActivity.f35560x1;
                return;
            case 26:
                Pattern pattern2 = LaunchActivity.f35560x1;
                return;
            case 27:
                Pattern pattern3 = LaunchActivity.f35560x1;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                return;
            case 28:
                return;
            default:
                CallReceiver.checkLastReceivedCall();
                return;
        }
    }

    public g5(Object obj, int i10) {
        this.f28758a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
