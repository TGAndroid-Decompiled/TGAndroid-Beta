package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class v50 implements Runnable {
    public final int f31810a;
    public final y50 f31811b;

    public v50(y50 y50Var, int i10) {
        this.f31810a = i10;
        this.f31811b = y50Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f31810a;
        y50 y50Var = this.f31811b;
        switch (i10) {
            case 0:
                y50Var.E0.m(false, false);
                return;
            case 1:
                NotificationCenter.getInstance(y50Var.E0.f33732a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 2:
                z50 z50Var = y50Var.E0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                z50Var.K = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = z50Var.E;
                videoEditedInfo2.encryptedFile = z50Var.F;
                videoEditedInfo2.key = z50Var.G;
                videoEditedInfo2.iv = z50Var.H;
                videoEditedInfo2.estimatedSize = Math.max(1L, z50Var.I);
                VideoEditedInfo videoEditedInfo3 = z50Var.K;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = z50Var.V.getAbsolutePath();
                y50Var.h(z50Var.V);
                z50Var.K.estimatedDuration = z50Var.f33737c0;
                NotificationCenter.getInstance(z50Var.f33732a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(z50Var.N), z50Var.K, z50Var.V.getAbsolutePath(), y50Var.f33374x0);
                return;
            case 3:
                if (y50Var.D0 && (videoEditedInfo = y50Var.E0.K) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                y50Var.c(y50Var.f33342a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 4:
                y50Var.E0.V0 = null;
                return;
            case 5:
                NotificationCenter.getInstance(y50Var.E0.f33732a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 6:
                y50Var.E0.f33746j0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                y50Var.E0.f33746j0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
