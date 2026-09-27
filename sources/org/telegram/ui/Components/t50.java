package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class t50 implements Runnable {
    public final int f28482a;
    public final x50 f28483b;

    public t50(x50 x50Var, int i10) {
        this.f28482a = i10;
        this.f28483b = x50Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f28482a;
        x50 x50Var = this.f28483b;
        switch (i10) {
            case 0:
                x50Var.H0.q(false, false);
                return;
            case 1:
                e60 e60Var = x50Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                e60Var.S = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = e60Var.M;
                videoEditedInfo2.encryptedFile = e60Var.N;
                videoEditedInfo2.key = e60Var.O;
                videoEditedInfo2.iv = e60Var.P;
                videoEditedInfo2.estimatedSize = Math.max(1L, e60Var.Q);
                VideoEditedInfo videoEditedInfo3 = e60Var.S;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = e60Var.f23910g0.getAbsolutePath();
                x50Var.h(e60Var.f23910g0);
                e60Var.S.estimatedDuration = e60Var.f23915k0;
                NotificationCenter.getInstance(e60Var.f23907f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(e60Var.V), e60Var.S, e60Var.f23910g0.getAbsolutePath(), x50Var.A0);
                return;
            case 2:
                if (x50Var.G0 && (videoEditedInfo = x50Var.H0.S) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                x50Var.c(x50Var.f30261a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 3:
                x50Var.H0.f23904d1 = null;
                return;
            case 4:
                x50Var.H0.f23923r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                x50Var.H0.f23923r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
