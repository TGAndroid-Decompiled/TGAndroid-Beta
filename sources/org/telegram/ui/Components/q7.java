package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class q7 implements Runnable {
    public final int f26331a;
    public final r7 f26332b;

    public q7(r7 r7Var, int i10) {
        this.f26331a = i10;
        this.f26332b = r7Var;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f26331a) {
            case 0:
                r7 r7Var = this.f26332b;
                int i10 = r7Var.v + 1;
                r7Var.v = i10;
                if (i10 == 1) {
                    j8 j8Var = r7Var.H;
                    j8Var.H0 = -1;
                    j8Var.I0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    r7Var.f26611w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(r7Var.E);
                    return;
                } else if (i10 == 2) {
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                r7 r7Var2 = this.f26332b;
                j8 j8Var2 = r7Var2.H;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f7 = j8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - r7Var2.f26611w;
                    r7Var2.f26611w = currentTimeMillis;
                    long j11 = currentTimeMillis - r7Var2.f26612x;
                    int i11 = r7Var2.v;
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
                    j8Var2.I0 = f11;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        j8Var2.G0(playingMessageObject, false);
                    }
                    if (j8Var2.H0 == -1 && r7Var2.v > 0) {
                        if (j11 > 200 || j8Var2.I0 == 0.0f) {
                            r7Var2.f26612x = currentTimeMillis;
                            if (j8Var2.I0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f11);
                            }
                        }
                        if (r7Var2.v > 0 && j8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(r7Var2.E, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                r7Var2.f26611w = System.currentTimeMillis();
                return;
        }
    }
}
