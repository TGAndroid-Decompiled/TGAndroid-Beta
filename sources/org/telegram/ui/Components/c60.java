package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class c60 implements Runnable {
    public final int f25249a;
    public final f60 f25250b;

    public c60(f60 f60Var, int i10) {
        this.f25249a = i10;
        this.f25250b = f60Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f25249a;
        f60 f60Var = this.f25250b;
        switch (i10) {
            case 0:
                f60Var.H0.r(false, false);
                return;
            case 1:
                n60 n60Var = f60Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                n60Var.S = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = n60Var.M;
                videoEditedInfo2.encryptedFile = n60Var.N;
                videoEditedInfo2.key = n60Var.O;
                videoEditedInfo2.iv = n60Var.P;
                videoEditedInfo2.estimatedSize = Math.max(1L, n60Var.Q);
                VideoEditedInfo videoEditedInfo3 = n60Var.S;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = n60Var.f28857g0.getAbsolutePath();
                f60Var.h(n60Var.f28857g0);
                n60Var.S.estimatedDuration = n60Var.f28865k0;
                NotificationCenter.getInstance(n60Var.f28854f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(n60Var.V), n60Var.S, n60Var.f28857g0.getAbsolutePath(), f60Var.A0);
                return;
            case 2:
                if (f60Var.G0 && (videoEditedInfo = f60Var.H0.S) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                f60Var.c(f60Var.f26186a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 3:
                f60Var.H0.f28862i1 = null;
                return;
            case 4:
                f60Var.H0.f28874r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                f60Var.H0.f28874r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
