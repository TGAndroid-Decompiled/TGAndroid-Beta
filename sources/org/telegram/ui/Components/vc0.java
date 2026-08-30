package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class vc0 implements Runnable {
    public final int f29423a = 0;
    public int f29424b;
    public int f29425c;
    public final Object d;

    public vc0(org.telegram.ui.bz bzVar, int i10, int i11) {
        this.d = bzVar;
        this.f29424b = i10;
        this.f29425c = i11;
    }

    public void a() {
        this.f29425c = 0;
        this.f29424b = 0;
        wc0 wc0Var = (wc0) this.d;
        wc0Var.removeCallbacks(this);
        if (wc0Var.f30321k0) {
            wc0Var.f30321k0 = false;
            wc0Var.invalidate(0, wc0Var.f30320j0, wc0Var.getRight(), wc0Var.getBottom());
        }
        wc0Var.f30322l0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.xn xnVar;
        switch (this.f29423a) {
            case 0:
                wc0 wc0Var = (wc0) this.d;
                int i10 = this.f29425c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f29424b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!wc0Var.f30322l0) {
                                    wc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                wc0Var.f30322l0 = (byte) (!wc0Var.f30322l0 ? 1 : 0);
                                wc0Var.invalidate(0, 0, wc0Var.getRight(), wc0Var.f30319i0);
                                return;
                            }
                            return;
                        }
                        if (!wc0Var.f30321k0) {
                            wc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        wc0Var.f30321k0 = (byte) (!wc0Var.f30321k0 ? 1 : 0);
                        wc0Var.invalidate(0, wc0Var.f30320j0, wc0Var.getRight(), wc0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f29424b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        wc0Var.f30322l0 = true;
                        wc0Var.invalidate(0, 0, wc0Var.getRight(), wc0Var.f30319i0);
                        return;
                    }
                    return;
                }
                wc0Var.f30321k0 = true;
                wc0Var.invalidate(0, wc0Var.f30320j0, wc0Var.getRight(), wc0Var.getBottom());
                return;
            default:
                org.telegram.ui.bz bzVar = (org.telegram.ui.bz) this.d;
                int i13 = this.f29424b;
                int i14 = this.f29425c;
                sl0 sl0Var = bzVar.E;
                if (bzVar.f33052n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < sl0Var.getChildCount()) {
                            View childAt = sl0Var.getChildAt(i15);
                            if (childAt instanceof org.telegram.ui.Cells.t1) {
                                t1Var = (org.telegram.ui.Cells.t1) childAt;
                                String stickerEmoji = t1Var.getMessageObject().getStickerEmoji();
                                if (stickerEmoji == null) {
                                    stickerEmoji = t1Var.getMessageObject().messageOwner.message;
                                }
                                if (t1Var.getPhotoImage().hasNotThumb() && stickerEmoji != null && t1Var.getMessageObject().getId() == i13) {
                                }
                            }
                            i15++;
                        } else {
                            t1Var = null;
                        }
                    }
                    if (t1Var != null && (xnVar = bzVar.f33048a) != null) {
                        xnVar.Na(t1Var);
                        if (!EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                t1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        bzVar.o(t1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public vc0(wc0 wc0Var) {
        this.d = wc0Var;
    }
}
