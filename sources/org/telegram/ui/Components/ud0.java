package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class ud0 implements Runnable {
    public final int f31398a = 0;
    public int f31399b;
    public int f31400c;
    public final Object d;

    public ud0(org.telegram.ui.ez ezVar, int i10, int i11) {
        this.d = ezVar;
        this.f31399b = i10;
        this.f31400c = i11;
    }

    public void a() {
        this.f31400c = 0;
        this.f31399b = 0;
        vd0 vd0Var = (vd0) this.d;
        vd0Var.removeCallbacks(this);
        if (vd0Var.f31765n0) {
            vd0Var.f31765n0 = false;
            vd0Var.invalidate(0, vd0Var.m0, vd0Var.getRight(), vd0Var.getBottom());
        }
        vd0Var.f31766o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.zn znVar;
        switch (this.f31398a) {
            case 0:
                vd0 vd0Var = (vd0) this.d;
                int i10 = this.f31400c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f31399b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!vd0Var.f31766o0) {
                                    vd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                vd0Var.f31766o0 = (byte) (!vd0Var.f31766o0 ? 1 : 0);
                                vd0Var.invalidate(0, 0, vd0Var.getRight(), vd0Var.f31763l0);
                                return;
                            }
                            return;
                        }
                        if (!vd0Var.f31765n0) {
                            vd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        vd0Var.f31765n0 = (byte) (!vd0Var.f31765n0 ? 1 : 0);
                        vd0Var.invalidate(0, vd0Var.m0, vd0Var.getRight(), vd0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f31399b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        vd0Var.f31766o0 = true;
                        vd0Var.invalidate(0, 0, vd0Var.getRight(), vd0Var.f31763l0);
                        return;
                    }
                    return;
                }
                vd0Var.f31765n0 = true;
                vd0Var.invalidate(0, vd0Var.m0, vd0Var.getRight(), vd0Var.getBottom());
                return;
            default:
                org.telegram.ui.ez ezVar = (org.telegram.ui.ez) this.d;
                int i13 = this.f31399b;
                int i14 = this.f31400c;
                sm0 sm0Var = ezVar.H;
                if (ezVar.f37485n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < sm0Var.getChildCount()) {
                            View childAt = sm0Var.getChildAt(i15);
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
                    if (u1Var != null && (znVar = ezVar.f37480a) != null) {
                        znVar.Ra(u1Var);
                        if (!EmojiData.hasEmojiSupportVibration(u1Var.getMessageObject().getStickerEmoji()) && !u1Var.getMessageObject().isPremiumSticker() && !u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                u1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        ezVar.n(u1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ud0(vd0 vd0Var) {
        this.d = vd0Var;
    }
}
