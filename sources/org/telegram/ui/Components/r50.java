package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class r50 implements Runnable {
    public final int f29934a;
    public final v50 f29935b;

    public r50(v50 v50Var, int i10) {
        this.f29934a = i10;
        this.f29935b = v50Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f29934a;
        v50 v50Var = this.f29935b;
        switch (i10) {
            case 0:
                v50Var.H0.m(false, false);
                return;
            case 1:
                NotificationCenter.getInstance(v50Var.H0.f32124a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 2:
                w50 w50Var = v50Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                w50Var.N = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = w50Var.H;
                videoEditedInfo2.encryptedFile = w50Var.I;
                videoEditedInfo2.key = w50Var.J;
                videoEditedInfo2.iv = w50Var.K;
                videoEditedInfo2.estimatedSize = Math.max(1L, w50Var.L);
                VideoEditedInfo videoEditedInfo3 = w50Var.N;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = w50Var.f32128b0.getAbsolutePath();
                v50Var.h(w50Var.f32128b0);
                w50Var.N.estimatedDuration = w50Var.f32136f0;
                NotificationCenter.getInstance(w50Var.f32124a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(w50Var.Q), w50Var.N, w50Var.f32128b0.getAbsolutePath(), v50Var.A0);
                return;
            case 3:
                if (v50Var.G0 && (videoEditedInfo = v50Var.H0.N) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                v50Var.c(v50Var.f31096a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 4:
                v50Var.H0.Y0 = null;
                return;
            case 5:
                NotificationCenter.getInstance(v50Var.H0.f32124a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 6:
                v50Var.H0.m0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                v50Var.H0.m0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
