package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class o50 implements Runnable {
    public final int f31260a;
    public final r50 f31261b;

    public o50(r50 r50Var, int i10) {
        this.f31260a = i10;
        this.f31261b = r50Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f31260a;
        r50 r50Var = this.f31261b;
        switch (i10) {
            case 0:
                r50Var.D0.m(false, false);
                return;
            case 1:
                NotificationCenter.getInstance(r50Var.D0.f32493a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 2:
                s50 s50Var = r50Var.D0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                s50Var.J = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = s50Var.D;
                videoEditedInfo2.encryptedFile = s50Var.E;
                videoEditedInfo2.key = s50Var.F;
                videoEditedInfo2.iv = s50Var.G;
                videoEditedInfo2.estimatedSize = Math.max(1L, s50Var.H);
                VideoEditedInfo videoEditedInfo3 = s50Var.J;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = s50Var.U.getAbsolutePath();
                r50Var.h(s50Var.U);
                s50Var.J.estimatedDuration = s50Var.f32496b0;
                NotificationCenter.getInstance(s50Var.f32493a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(s50Var.M), s50Var.J, s50Var.U.getAbsolutePath(), r50Var.f32214w0);
                return;
            case 3:
                if (r50Var.C0 && (videoEditedInfo = r50Var.D0.J) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                r50Var.c(r50Var.f32184a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 4:
                r50Var.D0.U0 = null;
                return;
            case 5:
                NotificationCenter.getInstance(r50Var.D0.f32493a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                return;
            case 6:
                r50Var.D0.f32506i0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                r50Var.D0.f32506i0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
