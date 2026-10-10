package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class j60 implements Runnable {
    public final int f27565a;
    public final m60 f27566b;

    public j60(m60 m60Var, int i10) {
        this.f27565a = i10;
        this.f27566b = m60Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f27565a;
        m60 m60Var = this.f27566b;
        switch (i10) {
            case 0:
                m60Var.H0.r(false, false);
                return;
            case 1:
                u60 u60Var = m60Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                u60Var.S = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = u60Var.M;
                videoEditedInfo2.encryptedFile = u60Var.N;
                videoEditedInfo2.key = u60Var.O;
                videoEditedInfo2.iv = u60Var.P;
                videoEditedInfo2.estimatedSize = Math.max(1L, u60Var.Q);
                VideoEditedInfo videoEditedInfo3 = u60Var.S;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = u60Var.f31349g0.getAbsolutePath();
                m60Var.h(u60Var.f31349g0);
                u60Var.S.estimatedDuration = u60Var.f31357k0;
                NotificationCenter.getInstance(u60Var.f31346f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(u60Var.V), u60Var.S, u60Var.f31349g0.getAbsolutePath(), m60Var.A0);
                return;
            case 2:
                if (m60Var.G0 && (videoEditedInfo = m60Var.H0.S) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                m60Var.c(m60Var.f28644a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 3:
                m60Var.H0.f31354i1 = null;
                return;
            case 4:
                m60Var.H0.f31366r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                m60Var.H0.f31366r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
