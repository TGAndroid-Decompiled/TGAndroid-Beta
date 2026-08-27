package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

public final class j7 implements Runnable {

    public final int f29638a;

    public final k7 f29639b;

    public j7(k7 k7Var, int i10) {
        this.f29638a = i10;
        this.f29639b = k7Var;
    }

    @Override
    public final void run() {
        switch (this.f29638a) {
            case 0:
                k7 k7Var = this.f29639b;
                int i10 = k7Var.v + 1;
                k7Var.v = i10;
                if (i10 == 1) {
                    b8 b8Var = k7Var.D;
                    b8Var.D0 = -1;
                    b8Var.E0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    k7Var.f30020w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(k7Var.A);
                } else if (i10 == 2) {
                    AndroidUtilities.runOnUIThread(this, 2000L);
                }
                break;
            default:
                k7 k7Var2 = this.f29639b;
                b8 b8Var2 = k7Var2.D;
                long duration = MediaController.getInstance().getDuration();
                if (duration == 0 || duration == -9223372036854775807L) {
                    k7Var2.f30020w = System.currentTimeMillis();
                    break;
                } else {
                    float f10 = b8Var2.E0;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j10 = jCurrentTimeMillis - k7Var2.f30020w;
                    k7Var2.f30020w = jCurrentTimeMillis;
                    long j11 = jCurrentTimeMillis - k7Var2.f30021x;
                    int i11 = k7Var2.v;
                    float f11 = duration;
                    float f12 = ((long) ((f10 * f11) - (j10 * (i11 == 1 ? 3L : i11 == 2 ? 6L : 12L)))) / f11;
                    if (f12 < 0.0f) {
                        f12 = 0.0f;
                    }
                    b8Var2.E0 = f12;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        b8Var2.G0(playingMessageObject, false);
                    }
                    if (b8Var2.D0 == -1 && k7Var2.v > 0) {
                        if (j11 > 200 || b8Var2.E0 == 0.0f) {
                            k7Var2.f30021x = jCurrentTimeMillis;
                            if (b8Var2.E0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f12);
                            }
                        }
                        if (k7Var2.v > 0 && b8Var2.E0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(k7Var2.A, 16L);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
