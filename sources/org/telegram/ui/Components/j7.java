package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class j7 implements Runnable {
    public final int f29661a;
    public final k7 f29662b;

    public j7(k7 k7Var, int i9) {
        this.f29661a = i9;
        this.f29662b = k7Var;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f29661a) {
            case 0:
                k7 k7Var = this.f29662b;
                int i9 = k7Var.v + 1;
                k7Var.v = i9;
                if (i9 == 1) {
                    c8 c8Var = k7Var.D;
                    c8Var.D0 = -1;
                    c8Var.E0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    k7Var.f30016w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(k7Var.A);
                    return;
                } else if (i9 == 2) {
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                k7 k7Var2 = this.f29662b;
                c8 c8Var2 = k7Var2.D;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f10 = c8Var2.E0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = currentTimeMillis - k7Var2.f30016w;
                    k7Var2.f30016w = currentTimeMillis;
                    long j12 = currentTimeMillis - k7Var2.f30017x;
                    int i10 = k7Var2.v;
                    if (i10 == 1) {
                        j10 = 3;
                    } else if (i10 == 2) {
                        j10 = 6;
                    } else {
                        j10 = 12;
                    }
                    float f11 = (float) duration;
                    float f12 = ((f10 * f11) - ((float) (j11 * j10))) / f11;
                    if (f12 < 0.0f) {
                        f12 = 0.0f;
                    }
                    c8Var2.E0 = f12;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        c8Var2.F0(playingMessageObject, false);
                    }
                    if (c8Var2.D0 == -1 && k7Var2.v > 0) {
                        if (j12 > 200 || c8Var2.E0 == 0.0f) {
                            k7Var2.f30017x = currentTimeMillis;
                            if (c8Var2.E0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f12);
                            }
                        }
                        if (k7Var2.v > 0 && c8Var2.E0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(k7Var2.A, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                k7Var2.f30016w = System.currentTimeMillis();
                return;
        }
    }
}
