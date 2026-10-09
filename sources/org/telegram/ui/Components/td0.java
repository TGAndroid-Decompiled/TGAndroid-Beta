package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class td0 implements Runnable {
    public final int f31152a = 0;
    public int f31153b;
    public int f31154c;
    public final Object d;

    public td0(org.telegram.ui.fz fzVar, int i10, int i11) {
        this.d = fzVar;
        this.f31153b = i10;
        this.f31154c = i11;
    }

    public void a() {
        this.f31154c = 0;
        this.f31153b = 0;
        ud0 ud0Var = (ud0) this.d;
        ud0Var.removeCallbacks(this);
        if (ud0Var.f31465n0) {
            ud0Var.f31465n0 = false;
            ud0Var.invalidate(0, ud0Var.m0, ud0Var.getRight(), ud0Var.getBottom());
        }
        ud0Var.f31466o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.zn znVar;
        switch (this.f31152a) {
            case 0:
                ud0 ud0Var = (ud0) this.d;
                int i10 = this.f31154c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f31153b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!ud0Var.f31466o0) {
                                    ud0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                ud0Var.f31466o0 = (byte) (!ud0Var.f31466o0 ? 1 : 0);
                                ud0Var.invalidate(0, 0, ud0Var.getRight(), ud0Var.f31463l0);
                                return;
                            }
                            return;
                        }
                        if (!ud0Var.f31465n0) {
                            ud0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        ud0Var.f31465n0 = (byte) (!ud0Var.f31465n0 ? 1 : 0);
                        ud0Var.invalidate(0, ud0Var.m0, ud0Var.getRight(), ud0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f31153b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        ud0Var.f31466o0 = true;
                        ud0Var.invalidate(0, 0, ud0Var.getRight(), ud0Var.f31463l0);
                        return;
                    }
                    return;
                }
                ud0Var.f31465n0 = true;
                ud0Var.invalidate(0, ud0Var.m0, ud0Var.getRight(), ud0Var.getBottom());
                return;
            default:
                org.telegram.ui.fz fzVar = (org.telegram.ui.fz) this.d;
                int i13 = this.f31153b;
                int i14 = this.f31154c;
                qm0 qm0Var = fzVar.H;
                if (fzVar.f37722n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < qm0Var.getChildCount()) {
                            View childAt = qm0Var.getChildAt(i15);
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
                    if (u1Var != null && (znVar = fzVar.f37717a) != null) {
                        znVar.Ra(u1Var);
                        if (!EmojiData.hasEmojiSupportVibration(u1Var.getMessageObject().getStickerEmoji()) && !u1Var.getMessageObject().isPremiumSticker() && !u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                u1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        fzVar.n(u1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public td0(ud0 ud0Var) {
        this.d = ud0Var;
    }
}
