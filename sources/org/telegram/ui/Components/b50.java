package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class b50 implements Runnable {
    public final int f27043a;
    public final e50 f27044b;

    public b50(e50 e50Var, int i9) {
        this.f27043a = i9;
        this.f27044b = e50Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i9 = this.f27043a;
        e50 e50Var = this.f27044b;
        switch (i9) {
            case 0:
                e50Var.D0.m(false, false);
                return;
            case 1:
                NotificationCenter.getInstance(e50Var.D0.f28272a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 2:
                f50 f50Var = e50Var.D0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                f50Var.J = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = f50Var.D;
                videoEditedInfo2.encryptedFile = f50Var.E;
                videoEditedInfo2.key = f50Var.F;
                videoEditedInfo2.iv = f50Var.G;
                videoEditedInfo2.estimatedSize = Math.max(1L, f50Var.H);
                VideoEditedInfo videoEditedInfo3 = f50Var.J;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = f50Var.U.getAbsolutePath();
                e50Var.h(f50Var.U);
                f50Var.J.estimatedDuration = f50Var.f28275b0;
                NotificationCenter.getInstance(f50Var.f28272a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(f50Var.M), f50Var.J, f50Var.U.getAbsolutePath(), e50Var.f27954w0);
                return;
            case 3:
                if (e50Var.C0 && (videoEditedInfo = e50Var.D0.J) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                e50Var.c(e50Var.f27924a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 4:
                e50Var.D0.U0 = null;
                return;
            case 5:
                NotificationCenter.getInstance(e50Var.D0.f28272a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 6:
                e50Var.D0.f28285i0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                e50Var.D0.f28285i0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
