package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class t7 implements Runnable {
    public final int f32889a;
    public final u7 f32890b;

    public t7(u7 u7Var, int i10) {
        this.f32889a = i10;
        this.f32890b = u7Var;
    }

    @Override
    public final void run() {
        long j10;
        float f7;
        switch (this.f32889a) {
            case 0:
                u7 u7Var = this.f32890b;
                int i10 = u7Var.v + 1;
                u7Var.v = i10;
                if (i10 == 1) {
                    m8 m8Var = u7Var.H;
                    m8Var.G0 = -1;
                    m8Var.H0 = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                    u7Var.f33263w = System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    AndroidUtilities.runOnUIThread(u7Var.E);
                    return;
                } else if (i10 == 2) {
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                u7 u7Var2 = this.f32890b;
                m8 m8Var2 = u7Var2.H;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f10 = m8Var2.H0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = currentTimeMillis - u7Var2.f33263w;
                    u7Var2.f33263w = currentTimeMillis;
                    long j12 = currentTimeMillis - u7Var2.f33264x;
                    int i11 = u7Var2.v;
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
                    m8Var2.H0 = f11;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        m8Var2.M0(playingMessageObject, false);
                    }
                    if (m8Var2.G0 == -1 && u7Var2.v > 0) {
                        if (j12 > 200 || m8Var2.H0 == 0.0f) {
                            u7Var2.f33264x = currentTimeMillis;
                            if (m8Var2.H0 == 0.0f) {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), 0.0f);
                                MediaController.getInstance().pauseByRewind();
                            } else {
                                MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f11);
                            }
                        }
                        if (u7Var2.v > 0 && m8Var2.H0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(u7Var2.E, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                u7Var2.f33263w = System.currentTimeMillis();
                return;
        }
    }
}
