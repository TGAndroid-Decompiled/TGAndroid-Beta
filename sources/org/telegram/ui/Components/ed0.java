package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class ed0 implements Runnable {
    public final int f23932a = 0;
    public int f23933b;
    public int f23934c;
    public final Object d;

    public ed0(org.telegram.ui.cz czVar, int i10, int i11) {
        this.d = czVar;
        this.f23933b = i10;
        this.f23934c = i11;
    }

    public void a() {
        this.f23934c = 0;
        this.f23933b = 0;
        fd0 fd0Var = (fd0) this.d;
        fd0Var.removeCallbacks(this);
        if (fd0Var.f24243n0) {
            fd0Var.f24243n0 = false;
            fd0Var.invalidate(0, fd0Var.m0, fd0Var.getRight(), fd0Var.getBottom());
        }
        fd0Var.f24244o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.wn wnVar;
        switch (this.f23932a) {
            case 0:
                fd0 fd0Var = (fd0) this.d;
                int i10 = this.f23934c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f23933b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!fd0Var.f24244o0) {
                                    fd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                fd0Var.f24244o0 = (byte) (!fd0Var.f24244o0 ? 1 : 0);
                                fd0Var.invalidate(0, 0, fd0Var.getRight(), fd0Var.f24241l0);
                                return;
                            }
                            return;
                        }
                        if (!fd0Var.f24243n0) {
                            fd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        fd0Var.f24243n0 = (byte) (!fd0Var.f24243n0 ? 1 : 0);
                        fd0Var.invalidate(0, fd0Var.m0, fd0Var.getRight(), fd0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f23933b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        fd0Var.f24244o0 = true;
                        fd0Var.invalidate(0, 0, fd0Var.getRight(), fd0Var.f24241l0);
                        return;
                    }
                    return;
                }
                fd0Var.f24243n0 = true;
                fd0Var.invalidate(0, fd0Var.m0, fd0Var.getRight(), fd0Var.getBottom());
                return;
            default:
                org.telegram.ui.cz czVar = (org.telegram.ui.cz) this.d;
                int i13 = this.f23933b;
                int i14 = this.f23934c;
                xl0 xl0Var = czVar.H;
                if (czVar.f32823n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < xl0Var.getChildCount()) {
                            View childAt = xl0Var.getChildAt(i15);
                            if (childAt instanceof org.telegram.ui.Cells.u1) {
                                u1Var = (org.telegram.ui.Cells.u1) childAt;
                                String stickerEmoji = u1Var.getMessageObject().getStickerEmoji();
                                if (stickerEmoji == null) {
                                    stickerEmoji = u1Var.getMessageObject().messageOwner.message;
                                }
                                if (u1Var.getPhotoImage().hasNotThumb() && stickerEmoji != null && u1Var.getMessageObject().getId() == i13) {
                                }
                            }
                            i15++;
                        } else {
                            u1Var = null;
                        }
                    }
                    if (u1Var != null && (wnVar = czVar.f32819a) != null) {
                        wnVar.Na(u1Var);
                        if (!EmojiData.hasEmojiSupportVibration(u1Var.getMessageObject().getStickerEmoji()) && !u1Var.getMessageObject().isPremiumSticker() && !u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                u1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        czVar.o(u1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ed0(fd0 fd0Var) {
        this.d = fd0Var;
    }
}
