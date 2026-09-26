package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class s50 implements Runnable {
    public final int f28158a;
    public final w50 f28159b;

    public s50(w50 w50Var, int i10) {
        this.f28158a = i10;
        this.f28159b = w50Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f28158a;
        w50 w50Var = this.f28159b;
        switch (i10) {
            case 0:
                w50Var.H0.q(false, false);
                return;
            case 1:
                d60 d60Var = w50Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                d60Var.S = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = d60Var.M;
                videoEditedInfo2.encryptedFile = d60Var.N;
                videoEditedInfo2.key = d60Var.O;
                videoEditedInfo2.iv = d60Var.P;
                videoEditedInfo2.estimatedSize = Math.max(1L, d60Var.Q);
                VideoEditedInfo videoEditedInfo3 = d60Var.S;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = d60Var.f23562g0.getAbsolutePath();
                w50Var.h(d60Var.f23562g0);
                d60Var.S.estimatedDuration = d60Var.f23567k0;
                NotificationCenter.getInstance(d60Var.f23559f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(d60Var.V), d60Var.S, d60Var.f23562g0.getAbsolutePath(), w50Var.A0);
                return;
            case 2:
                if (w50Var.G0 && (videoEditedInfo = w50Var.H0.S) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                w50Var.c(w50Var.f29854a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 3:
                w50Var.H0.f23556d1 = null;
                return;
            case 4:
                w50Var.H0.f23575r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                w50Var.H0.f23575r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
