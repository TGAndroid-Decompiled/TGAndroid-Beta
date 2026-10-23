package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class r7 implements Runnable {
    public final int f29859a;
    public final s7 f29860b;

    public r7(s7 s7Var, int i10) {
        this.f29859a = i10;
        this.f29860b = s7Var;
    }

    @Override
    public final void run() {
        long j10;
        float f7;
        switch (this.f29859a) {
            case 0:
                s7 s7Var = this.f29860b;
                int i10 = s7Var.v + 1;
                s7Var.v = i10;
                if (i10 == 1) {
                    k8 k8Var = s7Var.H;
                    k8Var.H0 = -1;
                    k8Var.I0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    s7Var.f30214w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(s7Var.E);
                    return;
                } else if (i10 == 2) {
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                s7 s7Var2 = this.f29860b;
                k8 k8Var2 = s7Var2.H;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f10 = k8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = currentTimeMillis - s7Var2.f30214w;
                    s7Var2.f30214w = currentTimeMillis;
                    long j12 = currentTimeMillis - s7Var2.f30215x;
                    int i11 = s7Var2.v;
                    if (i11 == 1) {
                        j10 = 3;
                    } else if (i11 == 2) {
                        j10 = 6;
                    } else {
                        j10 = 12;
                    }
                    float f11 = ((f10 * f7) - ((float) (j11 * j10))) / ((float) duration);
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    k8Var2.I0 = f11;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        k8Var2.G0(playingMessageObject, false);
                    }
                    if (k8Var2.H0 == -1 && s7Var2.v > 0) {
                        if (j12 > 200 || k8Var2.I0 == 0.0f) {
                            s7Var2.f30215x = currentTimeMillis;
                            if (k8Var2.I0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f11);
                            }
                        }
                        if (s7Var2.v > 0 && k8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(s7Var2.E, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                s7Var2.f30214w = System.currentTimeMillis();
                return;
        }
    }
}
