package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class q50 implements Runnable {
    public final int f27467a;
    public final u50 f27468b;

    public q50(u50 u50Var, int i10) {
        this.f27467a = i10;
        this.f27468b = u50Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f27467a;
        u50 u50Var = this.f27468b;
        switch (i10) {
            case 0:
                u50Var.H0.r(false, false);
                return;
            case 1:
                NotificationCenter.getInstance(u50Var.H0.d).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 2:
                b60 b60Var = u50Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                b60Var.Q = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = b60Var.K;
                videoEditedInfo2.encryptedFile = b60Var.L;
                videoEditedInfo2.key = b60Var.M;
                videoEditedInfo2.iv = b60Var.N;
                videoEditedInfo2.estimatedSize = Math.max(1L, b60Var.O);
                VideoEditedInfo videoEditedInfo3 = b60Var.Q;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = b60Var.f22836e0.getAbsolutePath();
                u50Var.h(b60Var.f22836e0);
                b60Var.Q.estimatedDuration = b60Var.f22842i0;
                NotificationCenter.getInstance(b60Var.d).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(b60Var.T), b60Var.Q, b60Var.f22836e0.getAbsolutePath(), u50Var.A0);
                return;
            case 3:
                if (u50Var.G0 && (videoEditedInfo = u50Var.H0.Q) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                u50Var.c(u50Var.f28578a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 4:
                u50Var.H0.f22831b1 = null;
                return;
            case 5:
                NotificationCenter.getInstance(u50Var.H0.d).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 6:
                u50Var.H0.f22849p0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                u50Var.H0.f22849p0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
