package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class c60 implements Runnable {
    public final int f25111a;
    public final f60 f25112b;

    public c60(f60 f60Var, int i10) {
        this.f25111a = i10;
        this.f25112b = f60Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f25111a;
        f60 f60Var = this.f25112b;
        switch (i10) {
            case 0:
                f60Var.H0.r(false, false);
                return;
            case 1:
                m60 m60Var = f60Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                m60Var.S = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = m60Var.M;
                videoEditedInfo2.encryptedFile = m60Var.N;
                videoEditedInfo2.key = m60Var.O;
                videoEditedInfo2.iv = m60Var.P;
                videoEditedInfo2.estimatedSize = Math.max(1L, m60Var.Q);
                VideoEditedInfo videoEditedInfo3 = m60Var.S;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = m60Var.f28414g0.getAbsolutePath();
                f60Var.h(m60Var.f28414g0);
                m60Var.S.estimatedDuration = m60Var.f28422k0;
                NotificationCenter.getInstance(m60Var.f28411f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(m60Var.V), m60Var.S, m60Var.f28414g0.getAbsolutePath(), f60Var.A0);
                return;
            case 2:
                if (f60Var.G0 && (videoEditedInfo = f60Var.H0.S) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                f60Var.c(f60Var.f26096a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 3:
                f60Var.H0.f28419i1 = null;
                return;
            case 4:
                f60Var.H0.f28431r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                f60Var.H0.f28431r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
