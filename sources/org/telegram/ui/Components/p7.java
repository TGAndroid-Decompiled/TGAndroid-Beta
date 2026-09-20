package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class p7 implements Runnable {
    public final int f27177a;
    public final q7 f27178b;

    public p7(q7 q7Var, int i10) {
        this.f27177a = i10;
        this.f27178b = q7Var;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f27177a) {
            case 0:
                q7 q7Var = this.f27178b;
                int i10 = q7Var.v + 1;
                q7Var.v = i10;
                if (i10 == 1) {
                    i8 i8Var = q7Var.H;
                    i8Var.H0 = -1;
                    i8Var.I0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    q7Var.f27529w = System.currentTimeMillis();
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
                q7 q7Var2 = this.f27178b;
                i8 i8Var2 = q7Var2.H;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f7 = i8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - q7Var2.f27529w;
                    q7Var2.f27529w = currentTimeMillis;
                    long j11 = currentTimeMillis - q7Var2.f27530x;
                    int i11 = q7Var2.v;
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
                    i8Var2.I0 = f11;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        i8Var2.G0(playingMessageObject, false);
                    }
                    if (i8Var2.H0 == -1 && q7Var2.v > 0) {
                        if (j11 > 200 || i8Var2.I0 == 0.0f) {
                            q7Var2.f27530x = currentTimeMillis;
                            if (i8Var2.I0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f11);
                            }
                        }
                        if (q7Var2.v > 0 && i8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(q7Var2.E, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                q7Var2.f27529w = System.currentTimeMillis();
                return;
        }
    }
}
