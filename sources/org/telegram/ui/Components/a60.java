package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class a60 implements Runnable {
    public final int f24635a;
    public final d60 f24636b;

    public a60(d60 d60Var, int i10) {
        this.f24635a = i10;
        this.f24636b = d60Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f24635a;
        d60 d60Var = this.f24636b;
        switch (i10) {
            case 0:
                d60Var.H0.r(false, false);
                return;
            case 1:
                l60 l60Var = d60Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                l60Var.S = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = l60Var.M;
                videoEditedInfo2.encryptedFile = l60Var.N;
                videoEditedInfo2.key = l60Var.O;
                videoEditedInfo2.iv = l60Var.P;
                videoEditedInfo2.estimatedSize = Math.max(1L, l60Var.Q);
                VideoEditedInfo videoEditedInfo3 = l60Var.S;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = l60Var.f28191g0.getAbsolutePath();
                d60Var.h(l60Var.f28191g0);
                l60Var.S.estimatedDuration = l60Var.f28199k0;
                NotificationCenter.getInstance(l60Var.f28188f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(l60Var.V), l60Var.S, l60Var.f28191g0.getAbsolutePath(), d60Var.A0);
                return;
            case 2:
                if (d60Var.G0 && (videoEditedInfo = d60Var.H0.S) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                d60Var.c(d60Var.f25574a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 3:
                d60Var.H0.f28196i1 = null;
                return;
            case 4:
                d60Var.H0.f28208r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                d60Var.H0.f28208r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
