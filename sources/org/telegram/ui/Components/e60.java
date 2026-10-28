package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class e60 implements Runnable {
    public final int f27723a;
    public final h60 f27724b;

    public e60(h60 h60Var, int i10) {
        this.f27723a = i10;
        this.f27724b = h60Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f27723a;
        h60 h60Var = this.f27724b;
        switch (i10) {
            case 0:
                h60Var.H0.s(false, false);
                return;
            case 1:
                p60 p60Var = h60Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                p60Var.R = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = p60Var.L;
                videoEditedInfo2.encryptedFile = p60Var.M;
                videoEditedInfo2.key = p60Var.N;
                videoEditedInfo2.iv = p60Var.O;
                videoEditedInfo2.estimatedSize = Math.max(1L, p60Var.P);
                VideoEditedInfo videoEditedInfo3 = p60Var.R;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = p60Var.f31478f0.getAbsolutePath();
                h60Var.h(p60Var.f31478f0);
                p60Var.R.estimatedDuration = p60Var.f31486j0;
                NotificationCenter.getInstance(p60Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(p60Var.U), p60Var.R, p60Var.f31478f0.getAbsolutePath(), h60Var.A0);
                return;
            case 2:
                if (h60Var.G0 && (videoEditedInfo = h60Var.H0.R) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                h60Var.c(h60Var.f28870a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 3:
                h60Var.H0.f31483h1 = null;
                return;
            case 4:
                h60Var.H0.f31495q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                h60Var.H0.f31495q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
