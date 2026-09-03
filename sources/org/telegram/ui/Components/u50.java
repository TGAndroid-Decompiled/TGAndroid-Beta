package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class u50 implements Runnable {
    public final int f29110a;
    public final x50 f29111b;

    public u50(x50 x50Var, int i10) {
        this.f29110a = i10;
        this.f29111b = x50Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f29110a;
        x50 x50Var = this.f29111b;
        switch (i10) {
            case 0:
                x50Var.E0.m(false, false);
                return;
            case 1:
                NotificationCenter.getInstance(x50Var.E0.f30871a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 2:
                y50 y50Var = x50Var.E0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                y50Var.K = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = y50Var.E;
                videoEditedInfo2.encryptedFile = y50Var.F;
                videoEditedInfo2.key = y50Var.G;
                videoEditedInfo2.iv = y50Var.H;
                videoEditedInfo2.estimatedSize = Math.max(1L, y50Var.I);
                VideoEditedInfo videoEditedInfo3 = y50Var.K;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = y50Var.V.getAbsolutePath();
                x50Var.h(y50Var.V);
                y50Var.K.estimatedDuration = y50Var.f30876c0;
                NotificationCenter.getInstance(y50Var.f30871a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(y50Var.N), y50Var.K, y50Var.V.getAbsolutePath(), x50Var.f30510x0);
                return;
            case 3:
                if (x50Var.D0 && (videoEditedInfo = x50Var.E0.K) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                x50Var.c(x50Var.f30479a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 4:
                x50Var.E0.V0 = null;
                return;
            case 5:
                NotificationCenter.getInstance(x50Var.E0.f30871a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 6:
                x50Var.E0.f30884j0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                x50Var.E0.f30884j0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
