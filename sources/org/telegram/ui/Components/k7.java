package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class k7 implements Runnable {
    public final int f26177a;
    public final l7 f26178b;

    public k7(l7 l7Var, int i10) {
        this.f26177a = i10;
        this.f26178b = l7Var;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f26177a) {
            case 0:
                l7 l7Var = this.f26178b;
                int i10 = l7Var.v + 1;
                l7Var.v = i10;
                if (i10 == 1) {
                    c8 c8Var = l7Var.E;
                    c8Var.E0 = -1;
                    c8Var.F0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    l7Var.f26604w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(l7Var.B);
                    return;
                } else if (i10 == 2) {
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                l7 l7Var2 = this.f26178b;
                c8 c8Var2 = l7Var2.E;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f10 = c8Var2.F0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = currentTimeMillis - l7Var2.f26604w;
                    l7Var2.f26604w = currentTimeMillis;
                    long j12 = currentTimeMillis - l7Var2.f26605x;
                    int i11 = l7Var2.v;
                    if (i11 == 1) {
                        j10 = 3;
                    } else if (i11 == 2) {
                        j10 = 6;
                    } else {
                        j10 = 12;
                    }
                    float f11 = (float) duration;
                    float f12 = ((f10 * f11) - ((float) (j11 * j10))) / f11;
                    if (f12 < 0.0f) {
                        f12 = 0.0f;
                    }
                    c8Var2.F0 = f12;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        c8Var2.G0(playingMessageObject, false);
                    }
                    if (c8Var2.E0 == -1 && l7Var2.v > 0) {
                        if (j12 > 200 || c8Var2.F0 == 0.0f) {
                            l7Var2.f26605x = currentTimeMillis;
                            if (c8Var2.F0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f12);
                            }
                        }
                        if (l7Var2.v > 0 && c8Var2.F0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(l7Var2.B, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                l7Var2.f26604w = System.currentTimeMillis();
                return;
        }
    }
}
