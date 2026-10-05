package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class u50 implements Runnable {
    public final int f31355a;
    public final y50 f31356b;

    public u50(y50 y50Var, int i10) {
        this.f31355a = i10;
        this.f31356b = y50Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f31355a;
        y50 y50Var = this.f31356b;
        switch (i10) {
            case 0:
                y50Var.H0.q(false, false);
                return;
            case 1:
                f60 f60Var = y50Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                f60Var.S = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = f60Var.M;
                videoEditedInfo2.encryptedFile = f60Var.N;
                videoEditedInfo2.key = f60Var.O;
                videoEditedInfo2.iv = f60Var.P;
                videoEditedInfo2.estimatedSize = Math.max(1L, f60Var.Q);
                VideoEditedInfo videoEditedInfo3 = f60Var.S;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = f60Var.f26364g0.getAbsolutePath();
                y50Var.h(f60Var.f26364g0);
                f60Var.S.estimatedDuration = f60Var.f26369k0;
                NotificationCenter.getInstance(f60Var.f26361f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(f60Var.V), f60Var.S, f60Var.f26364g0.getAbsolutePath(), y50Var.A0);
                return;
            case 2:
                if (y50Var.G0 && (videoEditedInfo = y50Var.H0.S) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                y50Var.c(y50Var.f33185a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 3:
                y50Var.H0.f26358d1 = null;
                return;
            case 4:
                y50Var.H0.f26377r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                y50Var.H0.f26377r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
