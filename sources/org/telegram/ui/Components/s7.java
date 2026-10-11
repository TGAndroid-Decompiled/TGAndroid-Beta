package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class s7 implements Runnable {
    public final int f30656a;
    public final t7 f30657b;

    public s7(t7 t7Var, int i10) {
        this.f30656a = i10;
        this.f30657b = t7Var;
    }

    @Override
    public final void run() {
        long j3;
        float f7;
        switch (this.f30656a) {
            case 0:
                t7 t7Var = this.f30657b;
                int i10 = t7Var.v + 1;
                t7Var.v = i10;
                if (i10 == 1) {
                    l8 l8Var = t7Var.H;
                    l8Var.H0 = -1;
                    l8Var.I0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    t7Var.f31041w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(t7Var.E);
                    return;
                } else if (i10 == 2) {
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                t7 t7Var2 = this.f30657b;
                l8 l8Var2 = t7Var2.H;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f10 = l8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - t7Var2.f31041w;
                    t7Var2.f31041w = currentTimeMillis;
                    long j11 = currentTimeMillis - t7Var2.f31042x;
                    int i11 = t7Var2.v;
                    if (i11 == 1) {
                        j3 = 3;
                    } else if (i11 == 2) {
                        j3 = 6;
                    } else {
                        j3 = 12;
                    }
                    float f11 = ((f10 * f7) - ((float) (j10 * j3))) / ((float) duration);
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    l8Var2.I0 = f11;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        l8Var2.G0(playingMessageObject, false);
                    }
                    if (l8Var2.H0 == -1 && t7Var2.v > 0) {
                        if (j11 > 200 || l8Var2.I0 == 0.0f) {
                            t7Var2.f31042x = currentTimeMillis;
                            if (l8Var2.I0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f11);
                            }
                        }
                        if (t7Var2.v > 0 && l8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(t7Var2.E, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                t7Var2.f31041w = System.currentTimeMillis();
                return;
        }
    }
}
