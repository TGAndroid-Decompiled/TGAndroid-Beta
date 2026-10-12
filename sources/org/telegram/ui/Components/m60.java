package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class m60 implements Runnable {
    public final int f28407a;
    public final p60 f28408b;

    public m60(p60 p60Var, int i10) {
        this.f28407a = i10;
        this.f28408b = p60Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f28407a;
        p60 p60Var = this.f28408b;
        switch (i10) {
            case 0:
                p60Var.H0.r(false, false);
                return;
            case 1:
                w60 w60Var = p60Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                w60Var.S = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = w60Var.M;
                videoEditedInfo2.encryptedFile = w60Var.N;
                videoEditedInfo2.key = w60Var.O;
                videoEditedInfo2.iv = w60Var.P;
                videoEditedInfo2.estimatedSize = Math.max(1L, w60Var.Q);
                VideoEditedInfo videoEditedInfo3 = w60Var.S;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = w60Var.f32286g0.getAbsolutePath();
                p60Var.h(w60Var.f32286g0);
                w60Var.S.estimatedDuration = w60Var.f32294k0;
                NotificationCenter.getInstance(w60Var.f32283f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(w60Var.V), w60Var.S, w60Var.f32286g0.getAbsolutePath(), p60Var.A0);
                return;
            case 2:
                if (p60Var.G0 && (videoEditedInfo = p60Var.H0.S) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                p60Var.c(p60Var.f29394a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 3:
                p60Var.H0.f32291i1 = null;
                return;
            case 4:
                p60Var.H0.f32303r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                p60Var.H0.f32303r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
