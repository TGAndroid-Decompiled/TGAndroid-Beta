package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class gd0 implements Runnable {
    public final int f24554a = 0;
    public int f24555b;
    public int f24556c;
    public final Object d;

    public gd0(org.telegram.ui.cz czVar, int i10, int i11) {
        this.d = czVar;
        this.f24555b = i10;
        this.f24556c = i11;
    }

    public void a() {
        this.f24556c = 0;
        this.f24555b = 0;
        hd0 hd0Var = (hd0) this.d;
        hd0Var.removeCallbacks(this);
        if (hd0Var.f24831n0) {
            hd0Var.f24831n0 = false;
            hd0Var.invalidate(0, hd0Var.m0, hd0Var.getRight(), hd0Var.getBottom());
        }
        hd0Var.f24832o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.wn wnVar;
        switch (this.f24554a) {
            case 0:
                hd0 hd0Var = (hd0) this.d;
                int i10 = this.f24556c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f24555b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!hd0Var.f24832o0) {
                                    hd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                hd0Var.f24832o0 = (byte) (!hd0Var.f24832o0 ? 1 : 0);
                                hd0Var.invalidate(0, 0, hd0Var.getRight(), hd0Var.f24829l0);
                                return;
                            }
                            return;
                        }
                        if (!hd0Var.f24831n0) {
                            hd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        hd0Var.f24831n0 = (byte) (!hd0Var.f24831n0 ? 1 : 0);
                        hd0Var.invalidate(0, hd0Var.m0, hd0Var.getRight(), hd0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f24555b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        hd0Var.f24832o0 = true;
                        hd0Var.invalidate(0, 0, hd0Var.getRight(), hd0Var.f24829l0);
                        return;
                    }
                    return;
                }
                hd0Var.f24831n0 = true;
                hd0Var.invalidate(0, hd0Var.m0, hd0Var.getRight(), hd0Var.getBottom());
                return;
            default:
                org.telegram.ui.cz czVar = (org.telegram.ui.cz) this.d;
                int i13 = this.f24555b;
                int i14 = this.f24556c;
                zl0 zl0Var = czVar.H;
                if (czVar.f32902n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < zl0Var.getChildCount()) {
                            View childAt = zl0Var.getChildAt(i15);
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
                    if (u1Var != null && (wnVar = czVar.f32898a) != null) {
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

    public gd0(hd0 hd0Var) {
        this.d = hd0Var;
    }
}
