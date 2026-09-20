package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class q50 implements Runnable {
    public final int f27521a;
    public final u50 f27522b;

    public q50(u50 u50Var, int i10) {
        this.f27521a = i10;
        this.f27522b = u50Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f27521a;
        u50 u50Var = this.f27522b;
        switch (i10) {
            case 0:
                u50Var.H0.q(false, false);
                return;
            case 1:
                a60 a60Var = u50Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                a60Var.Q = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = a60Var.K;
                videoEditedInfo2.encryptedFile = a60Var.L;
                videoEditedInfo2.key = a60Var.M;
                videoEditedInfo2.iv = a60Var.N;
                videoEditedInfo2.estimatedSize = Math.max(1L, a60Var.O);
                VideoEditedInfo videoEditedInfo3 = a60Var.Q;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = a60Var.f22541e0.getAbsolutePath();
                u50Var.h(a60Var.f22541e0);
                a60Var.Q.estimatedDuration = a60Var.f22547i0;
                NotificationCenter.getInstance(a60Var.d).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(a60Var.T), a60Var.Q, a60Var.f22541e0.getAbsolutePath(), u50Var.A0);
                return;
            case 2:
                if (u50Var.G0 && (videoEditedInfo = u50Var.H0.Q) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                u50Var.c(u50Var.f28556a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 3:
                u50Var.H0.f22536b1 = null;
                return;
            case 4:
                u50Var.H0.f22554p0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                u50Var.H0.f22554p0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
