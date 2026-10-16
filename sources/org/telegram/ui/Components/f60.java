package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class f60 implements Runnable {
    public final int f24637a;
    public final i60 f24638b;

    public f60(i60 i60Var, int i10) {
        this.f24637a = i10;
        this.f24638b = i60Var;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.f24637a;
        i60 i60Var = this.f24638b;
        switch (i10) {
            case 0:
                i60Var.H0.r(false, false);
                return;
            case 1:
                p60 p60Var = i60Var.H0;
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                p60Var.S = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = p60Var.M;
                videoEditedInfo2.encryptedFile = p60Var.N;
                videoEditedInfo2.key = p60Var.O;
                videoEditedInfo2.iv = p60Var.P;
                videoEditedInfo2.estimatedSize = Math.max(1L, p60Var.Q);
                VideoEditedInfo videoEditedInfo3 = p60Var.S;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = p60Var.f27864g0.getAbsolutePath();
                i60Var.h(p60Var.f27864g0);
                p60Var.S.estimatedDuration = p60Var.f27872k0;
                NotificationCenter.getInstance(p60Var.f27861f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(p60Var.V), p60Var.S, p60Var.f27864g0.getAbsolutePath(), i60Var.A0);
                return;
            case 2:
                if (i60Var.G0 && (videoEditedInfo = i60Var.H0.S) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                i60Var.c(i60Var.f25526a, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            case 3:
                i60Var.H0.f27869i1 = null;
                return;
            case 4:
                i60Var.H0.f27881r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
            default:
                i60Var.H0.f27881r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                return;
        }
    }
}
