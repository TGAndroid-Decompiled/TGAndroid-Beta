package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class e60 implements Runnable {
    public final int f27749a;
    public final h60 f27750b;

    public e60(h60 h60Var, int i10) {
        this.f27749a = i10;
        this.f27750b = h60Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f27749a;
        h60 h60Var = this.f27750b;
        switch (i10) {
            case 0:
                h60Var.H0.r(false, false);
                return;
            case 1:
                o60 o60Var = h60Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                o60Var.S = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = o60Var.M;
                videoEditedInfo2.encryptedFile = o60Var.N;
                videoEditedInfo2.key = o60Var.O;
                videoEditedInfo2.iv = o60Var.P;
                videoEditedInfo2.estimatedSize = Math.max(1L, o60Var.Q);
                VideoEditedInfo videoEditedInfo3 = o60Var.S;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = o60Var.f31181g0.getAbsolutePath();
                h60Var.h(o60Var.f31181g0);
                o60Var.S.estimatedDuration = o60Var.f31189k0;
                NotificationCenter.getInstance(o60Var.f31178f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(o60Var.V), o60Var.S, o60Var.f31181g0.getAbsolutePath(), h60Var.A0);
                return;
            case 2:
                if (h60Var.G0 && (videoEditedInfo = h60Var.H0.S) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                h60Var.c(h60Var.f28817a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 3:
                h60Var.H0.f31186i1 = null;
                return;
            case 4:
                h60Var.H0.f31198r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                h60Var.H0.f31198r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
