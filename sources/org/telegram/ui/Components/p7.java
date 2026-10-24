package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class p7 implements Runnable {
    public final int f29501a;
    public final q7 f29502b;

    public p7(q7 q7Var, int i10) {
        this.f29501a = i10;
        this.f29502b = q7Var;
    }

    @Override
    public final void run() {
        long j10;
        float f7;
        switch (this.f29501a) {
            case 0:
                q7 q7Var = this.f29502b;
                int i10 = q7Var.v + 1;
                q7Var.v = i10;
                if (i10 == 1) {
                    i8 i8Var = q7Var.H;
                    i8Var.G0 = -1;
                    i8Var.H0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    q7Var.f29815w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(q7Var.E);
                    return;
                } else if (i10 == 2) {
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                q7 q7Var2 = this.f29502b;
                i8 i8Var2 = q7Var2.H;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f10 = i8Var2.H0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = currentTimeMillis - q7Var2.f29815w;
                    q7Var2.f29815w = currentTimeMillis;
                    long j12 = currentTimeMillis - q7Var2.f29816x;
                    int i11 = q7Var2.v;
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
                    i8Var2.H0 = f11;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        i8Var2.M0(playingMessageObject, false);
                    }
                    if (i8Var2.G0 == -1 && q7Var2.v > 0) {
                        if (j12 > 200 || i8Var2.H0 == 0.0f) {
                            q7Var2.f29816x = currentTimeMillis;
                            if (i8Var2.H0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f11);
                            }
                        }
                        if (q7Var2.v > 0 && i8Var2.H0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(q7Var2.E, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                q7Var2.f29815w = System.currentTimeMillis();
                return;
        }
    }
}
