package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class r50 implements Runnable {
    public final int f27870a;
    public final v50 f27871b;

    public r50(v50 v50Var, int i10) {
        this.f27870a = i10;
        this.f27871b = v50Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f27870a;
        v50 v50Var = this.f27871b;
        switch (i10) {
            case 0:
                v50Var.H0.q(false, false);
                return;
            case 1:
                c60 c60Var = v50Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                c60Var.S = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = c60Var.M;
                videoEditedInfo2.encryptedFile = c60Var.N;
                videoEditedInfo2.key = c60Var.O;
                videoEditedInfo2.iv = c60Var.P;
                videoEditedInfo2.estimatedSize = Math.max(1L, c60Var.Q);
                VideoEditedInfo videoEditedInfo3 = c60Var.S;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = c60Var.f23225g0.getAbsolutePath();
                v50Var.h(c60Var.f23225g0);
                c60Var.S.estimatedDuration = c60Var.f23230k0;
                NotificationCenter.getInstance(c60Var.f23222f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(c60Var.V), c60Var.S, c60Var.f23225g0.getAbsolutePath(), v50Var.A0);
                return;
            case 2:
                if (v50Var.G0 && (videoEditedInfo = v50Var.H0.S) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                v50Var.c(v50Var.f29008a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 3:
                v50Var.H0.f23219d1 = null;
                return;
            case 4:
                v50Var.H0.f23238r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                v50Var.H0.f23238r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
