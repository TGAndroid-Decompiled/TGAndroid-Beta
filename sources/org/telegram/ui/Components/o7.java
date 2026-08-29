package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class o7 implements Runnable {
    public final int f31276a;
    public final p7 f31277b;

    public o7(p7 p7Var, int i10) {
        this.f31276a = i10;
        this.f31277b = p7Var;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f31276a) {
            case 0:
                p7 p7Var = this.f31277b;
                int i10 = p7Var.v + 1;
                p7Var.v = i10;
                if (i10 == 1) {
                    g8 g8Var = p7Var.D;
                    g8Var.D0 = -1;
                    g8Var.E0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    p7Var.f31608w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(p7Var.A);
                    return;
                } else if (i10 == 2) {
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                p7 p7Var2 = this.f31277b;
                g8 g8Var2 = p7Var2.D;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f9 = g8Var2.E0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = currentTimeMillis - p7Var2.f31608w;
                    p7Var2.f31608w = currentTimeMillis;
                    long j12 = currentTimeMillis - p7Var2.f31609x;
                    int i11 = p7Var2.v;
                    if (i11 == 1) {
                        j10 = 3;
                    } else if (i11 == 2) {
                        j10 = 6;
                    } else {
                        j10 = 12;
                    }
                    float f10 = (float) duration;
                    float f11 = ((f9 * f10) - ((float) (j11 * j10))) / f10;
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    g8Var2.E0 = f11;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        g8Var2.G0(playingMessageObject, false);
                    }
                    if (g8Var2.D0 == -1 && p7Var2.v > 0) {
                        if (j12 > 200 || g8Var2.E0 == 0.0f) {
                            p7Var2.f31609x = currentTimeMillis;
                            if (g8Var2.E0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f11);
                            }
                        }
                        if (p7Var2.v > 0 && g8Var2.E0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(p7Var2.A, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                p7Var2.f31608w = System.currentTimeMillis();
                return;
        }
    }
}
