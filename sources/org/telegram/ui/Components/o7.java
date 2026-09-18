package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class o7 implements Runnable {
    public final int f26649a;
    public final p7 f26650b;

    public o7(p7 p7Var, int i10) {
        this.f26649a = i10;
        this.f26650b = p7Var;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f26649a) {
            case 0:
                p7 p7Var = this.f26650b;
                int i10 = p7Var.v + 1;
                p7Var.v = i10;
                if (i10 == 1) {
                    h8 h8Var = p7Var.H;
                    h8Var.H0 = -1;
                    h8Var.I0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    p7Var.f26952w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(p7Var.E);
                    return;
                } else if (i10 == 2) {
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                p7 p7Var2 = this.f26650b;
                h8 h8Var2 = p7Var2.H;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f7 = h8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - p7Var2.f26952w;
                    p7Var2.f26952w = currentTimeMillis;
                    long j11 = currentTimeMillis - p7Var2.f26953x;
                    int i11 = p7Var2.v;
                    if (i11 == 1) {
                        j3 = 3;
                    } else if (i11 == 2) {
                        j3 = 6;
                    } else {
                        j3 = 12;
                    }
                    float f10 = (float) duration;
                    float f11 = ((f7 * f10) - ((float) (j10 * j3))) / f10;
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    h8Var2.I0 = f11;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        h8Var2.G0(playingMessageObject, false);
                    }
                    if (h8Var2.H0 == -1 && p7Var2.v > 0) {
                        if (j11 > 200 || h8Var2.I0 == 0.0f) {
                            p7Var2.f26953x = currentTimeMillis;
                            if (h8Var2.I0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f11);
                            }
                        }
                        if (p7Var2.v > 0 && h8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(p7Var2.E, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                p7Var2.f26952w = System.currentTimeMillis();
                return;
        }
    }
}
