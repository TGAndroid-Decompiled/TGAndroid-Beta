package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class wc0 implements Runnable {
    public final int f30217a = 0;
    public int f30218b;
    public int f30219c;
    public final Object d;

    public wc0(org.telegram.ui.dz dzVar, int i10, int i11) {
        this.d = dzVar;
        this.f30218b = i10;
        this.f30219c = i11;
    }

    public void a() {
        this.f30219c = 0;
        this.f30218b = 0;
        xc0 xc0Var = (xc0) this.d;
        xc0Var.removeCallbacks(this);
        if (xc0Var.f30611k0) {
            xc0Var.f30611k0 = false;
            xc0Var.invalidate(0, xc0Var.f30610j0, xc0Var.getRight(), xc0Var.getBottom());
        }
        xc0Var.f30612l0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.zn znVar;
        switch (this.f30217a) {
            case 0:
                xc0 xc0Var = (xc0) this.d;
                int i10 = this.f30219c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f30218b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!xc0Var.f30612l0) {
                                    xc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                xc0Var.f30612l0 = (byte) (!xc0Var.f30612l0 ? 1 : 0);
                                xc0Var.invalidate(0, 0, xc0Var.getRight(), xc0Var.f30609i0);
                                return;
                            }
                            return;
                        }
                        if (!xc0Var.f30611k0) {
                            xc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        xc0Var.f30611k0 = (byte) (!xc0Var.f30611k0 ? 1 : 0);
                        xc0Var.invalidate(0, xc0Var.f30610j0, xc0Var.getRight(), xc0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f30218b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        xc0Var.f30612l0 = true;
                        xc0Var.invalidate(0, 0, xc0Var.getRight(), xc0Var.f30609i0);
                        return;
                    }
                    return;
                }
                xc0Var.f30611k0 = true;
                xc0Var.invalidate(0, xc0Var.f30610j0, xc0Var.getRight(), xc0Var.getBottom());
                return;
            default:
                org.telegram.ui.dz dzVar = (org.telegram.ui.dz) this.d;
                int i13 = this.f30218b;
                int i14 = this.f30219c;
                rl0 rl0Var = dzVar.E;
                if (dzVar.f33561n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < rl0Var.getChildCount()) {
                            View childAt = rl0Var.getChildAt(i15);
                            if (childAt instanceof org.telegram.ui.Cells.s1) {
                                s1Var = (org.telegram.ui.Cells.s1) childAt;
                                String stickerEmoji = s1Var.getMessageObject().getStickerEmoji();
                                if (stickerEmoji == null) {
                                    stickerEmoji = s1Var.getMessageObject().messageOwner.message;
                                }
                                if (s1Var.getPhotoImage().hasNotThumb() && stickerEmoji != null && s1Var.getMessageObject().getId() == i13) {
                                }
                            }
                            i15++;
                        } else {
                            s1Var = null;
                        }
                    }
                    if (s1Var != null && (znVar = dzVar.f33557a) != null) {
                        znVar.Na(s1Var);
                        if (!EmojiData.hasEmojiSupportVibration(s1Var.getMessageObject().getStickerEmoji()) && !s1Var.getMessageObject().isPremiumSticker() && !s1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                s1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        dzVar.o(s1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public wc0(xc0 xc0Var) {
        this.d = xc0Var;
    }
}
