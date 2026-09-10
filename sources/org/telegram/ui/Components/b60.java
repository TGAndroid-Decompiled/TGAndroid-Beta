package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class b60 implements Runnable {
    public final int f21733a;
    public final e60 f21734b;

    public b60(e60 e60Var, int i10) {
        this.f21733a = i10;
        this.f21734b = e60Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f21733a;
        e60 e60Var = this.f21734b;
        switch (i10) {
            case 0:
                e60Var.H0.m(false, false);
                return;
            case 1:
                NotificationCenter.getInstance(e60Var.H0.f22873a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 2:
                f60 f60Var = e60Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                f60Var.N = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = f60Var.H;
                videoEditedInfo2.encryptedFile = f60Var.I;
                videoEditedInfo2.key = f60Var.J;
                videoEditedInfo2.iv = f60Var.K;
                videoEditedInfo2.estimatedSize = Math.max(1L, f60Var.L);
                VideoEditedInfo videoEditedInfo3 = f60Var.N;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = f60Var.f22877b0.getAbsolutePath();
                e60Var.h(f60Var.f22877b0);
                f60Var.N.estimatedDuration = f60Var.f22884f0;
                NotificationCenter.getInstance(f60Var.f22873a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(f60Var.Q), f60Var.N, f60Var.f22877b0.getAbsolutePath(), e60Var.A0);
                return;
            case 3:
                if (e60Var.G0 && (videoEditedInfo = e60Var.H0.N) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                e60Var.c(e60Var.f22568a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 4:
                e60Var.H0.Y0 = null;
                return;
            case 5:
                NotificationCenter.getInstance(e60Var.H0.f22873a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 6:
                e60Var.H0.m0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                e60Var.H0.m0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
