package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

public final class g50 implements Runnable {

    public final int f28535a;

    public final j50 f28536b;

    public g50(j50 j50Var, int i10) {
        this.f28535a = i10;
        this.f28536b = j50Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f28535a;
        j50 j50Var = this.f28536b;
        switch (i10) {
            case 0:
                j50Var.D0.m(false, false);
                break;
            case 1:
                NotificationCenter.getInstance(j50Var.D0.f29967a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 2:
                k50 k50Var = j50Var.D0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                k50Var.J = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = k50Var.D;
                videoEditedInfo2.encryptedFile = k50Var.E;
                videoEditedInfo2.key = k50Var.F;
                videoEditedInfo2.iv = k50Var.G;
                videoEditedInfo2.estimatedSize = Math.max(1L, k50Var.H);
                VideoEditedInfo videoEditedInfo3 = k50Var.J;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = k50Var.U.getAbsolutePath();
                j50Var.h(k50Var.U);
                k50Var.J.estimatedDuration = k50Var.f29970b0;
                NotificationCenter.getInstance(k50Var.f29967a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(k50Var.M), k50Var.J, k50Var.U.getAbsolutePath(), j50Var.f29624w0);
                break;
            case 3:
                if (j50Var.C0 && (videoEditedInfo = j50Var.D0.J) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                j50Var.c(j50Var.f29594a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                break;
            case 4:
                j50Var.D0.U0 = null;
                break;
            case 5:
                NotificationCenter.getInstance(j50Var.D0.f29967a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 6:
                j50Var.D0.f29980i0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                j50Var.D0.f29980i0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}
