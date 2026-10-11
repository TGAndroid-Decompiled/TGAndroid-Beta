package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class j60 implements Runnable {
    public final int f27622a;
    public final m60 f27623b;

    public j60(m60 m60Var, int i10) {
        this.f27622a = i10;
        this.f27623b = m60Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f27622a;
        m60 m60Var = this.f27623b;
        switch (i10) {
            case 0:
                m60Var.H0.r(false, false);
                return;
            case 1:
                t60 t60Var = m60Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                t60Var.S = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = t60Var.M;
                videoEditedInfo2.encryptedFile = t60Var.N;
                videoEditedInfo2.key = t60Var.O;
                videoEditedInfo2.iv = t60Var.P;
                videoEditedInfo2.estimatedSize = Math.max(1L, t60Var.Q);
                VideoEditedInfo videoEditedInfo3 = t60Var.S;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = t60Var.f31095g0.getAbsolutePath();
                m60Var.h(t60Var.f31095g0);
                t60Var.S.estimatedDuration = t60Var.f31103k0;
                NotificationCenter.getInstance(t60Var.f31092f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(t60Var.V), t60Var.S, t60Var.f31095g0.getAbsolutePath(), m60Var.A0);
                return;
            case 2:
                if (m60Var.G0 && (videoEditedInfo = m60Var.H0.S) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                m60Var.c(m60Var.f28720a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 3:
                m60Var.H0.f31100i1 = null;
                return;
            case 4:
                m60Var.H0.f31112r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                m60Var.H0.f31112r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
