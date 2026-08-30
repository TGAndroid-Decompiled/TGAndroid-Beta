package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class t50 implements Runnable {
    public final int f28902a;
    public final w50 f28903b;

    public t50(w50 w50Var, int i10) {
        this.f28902a = i10;
        this.f28903b = w50Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f28902a;
        w50 w50Var = this.f28903b;
        switch (i10) {
            case 0:
                w50Var.E0.m(false, false);
                return;
            case 1:
                NotificationCenter.getInstance(w50Var.E0.f30546a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 2:
                x50 x50Var = w50Var.E0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                x50Var.K = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = x50Var.E;
                videoEditedInfo2.encryptedFile = x50Var.F;
                videoEditedInfo2.key = x50Var.G;
                videoEditedInfo2.iv = x50Var.H;
                videoEditedInfo2.estimatedSize = Math.max(1L, x50Var.I);
                VideoEditedInfo videoEditedInfo3 = x50Var.K;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = x50Var.V.getAbsolutePath();
                w50Var.h(x50Var.V);
                x50Var.K.estimatedDuration = x50Var.f30551c0;
                NotificationCenter.getInstance(x50Var.f30546a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(x50Var.N), x50Var.K, x50Var.V.getAbsolutePath(), w50Var.f30234x0);
                return;
            case 3:
                if (w50Var.D0 && (videoEditedInfo = w50Var.E0.K) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                w50Var.c(w50Var.f30203a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 4:
                w50Var.E0.V0 = null;
                return;
            case 5:
                NotificationCenter.getInstance(w50Var.E0.f30546a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 6:
                w50Var.E0.f30559j0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                w50Var.E0.f30559j0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
