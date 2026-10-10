package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class ud0 implements Runnable {
    public final int f31466a = 0;
    public int f31467b;
    public int f31468c;
    public final Object d;

    public ud0(org.telegram.ui.fz fzVar, int i10, int i11) {
        this.d = fzVar;
        this.f31467b = i10;
        this.f31468c = i11;
    }

    public void a() {
        this.f31468c = 0;
        this.f31467b = 0;
        vd0 vd0Var = (vd0) this.d;
        vd0Var.removeCallbacks(this);
        if (vd0Var.f31818n0) {
            vd0Var.f31818n0 = false;
            vd0Var.invalidate(0, vd0Var.m0, vd0Var.getRight(), vd0Var.getBottom());
        }
        vd0Var.f31819o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.zn znVar;
        switch (this.f31466a) {
            case 0:
                vd0 vd0Var = (vd0) this.d;
                int i10 = this.f31468c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f31467b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!vd0Var.f31819o0) {
                                    vd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                vd0Var.f31819o0 = (byte) (!vd0Var.f31819o0 ? 1 : 0);
                                vd0Var.invalidate(0, 0, vd0Var.getRight(), vd0Var.f31816l0);
                                return;
                            }
                            return;
                        }
                        if (!vd0Var.f31818n0) {
                            vd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        vd0Var.f31818n0 = (byte) (!vd0Var.f31818n0 ? 1 : 0);
                        vd0Var.invalidate(0, vd0Var.m0, vd0Var.getRight(), vd0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f31467b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        vd0Var.f31819o0 = true;
                        vd0Var.invalidate(0, 0, vd0Var.getRight(), vd0Var.f31816l0);
                        return;
                    }
                    return;
                }
                vd0Var.f31818n0 = true;
                vd0Var.invalidate(0, vd0Var.m0, vd0Var.getRight(), vd0Var.getBottom());
                return;
            default:
                org.telegram.ui.fz fzVar = (org.telegram.ui.fz) this.d;
                int i13 = this.f31467b;
                int i14 = this.f31468c;
                rm0 rm0Var = fzVar.H;
                if (fzVar.f37768n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < rm0Var.getChildCount()) {
                            View childAt = rm0Var.getChildAt(i15);
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
                    if (u1Var != null && (znVar = fzVar.f37763a) != null) {
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

    public ud0(vd0 vd0Var) {
        this.d = vd0Var;
    }
}
