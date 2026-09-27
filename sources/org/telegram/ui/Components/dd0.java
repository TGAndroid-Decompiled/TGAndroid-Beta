package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class dd0 implements Runnable {
    public final int f23645a = 0;
    public int f23646b;
    public int f23647c;
    public final Object d;

    public dd0(org.telegram.ui.fz fzVar, int i10, int i11) {
        this.d = fzVar;
        this.f23646b = i10;
        this.f23647c = i11;
    }

    public void a() {
        this.f23647c = 0;
        this.f23646b = 0;
        ed0 ed0Var = (ed0) this.d;
        ed0Var.removeCallbacks(this);
        if (ed0Var.f24034n0) {
            ed0Var.f24034n0 = false;
            ed0Var.invalidate(0, ed0Var.m0, ed0Var.getRight(), ed0Var.getBottom());
        }
        ed0Var.f24035o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.xn xnVar;
        switch (this.f23645a) {
            case 0:
                ed0 ed0Var = (ed0) this.d;
                int i10 = this.f23647c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f23646b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!ed0Var.f24035o0) {
                                    ed0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                ed0Var.f24035o0 = (byte) (!ed0Var.f24035o0 ? 1 : 0);
                                ed0Var.invalidate(0, 0, ed0Var.getRight(), ed0Var.f24032l0);
                                return;
                            }
                            return;
                        }
                        if (!ed0Var.f24034n0) {
                            ed0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        ed0Var.f24034n0 = (byte) (!ed0Var.f24034n0 ? 1 : 0);
                        ed0Var.invalidate(0, ed0Var.m0, ed0Var.getRight(), ed0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f23646b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        ed0Var.f24035o0 = true;
                        ed0Var.invalidate(0, 0, ed0Var.getRight(), ed0Var.f24032l0);
                        return;
                    }
                    return;
                }
                ed0Var.f24034n0 = true;
                ed0Var.invalidate(0, ed0Var.m0, ed0Var.getRight(), ed0Var.getBottom());
                return;
            default:
                org.telegram.ui.fz fzVar = (org.telegram.ui.fz) this.d;
                int i13 = this.f23646b;
                int i14 = this.f23647c;
                yl0 yl0Var = fzVar.H;
                if (fzVar.f33661n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < yl0Var.getChildCount()) {
                            View childAt = yl0Var.getChildAt(i15);
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
                    if (u1Var != null && (xnVar = fzVar.f33657a) != null) {
                        xnVar.Na(u1Var);
                        if (!EmojiData.hasEmojiSupportVibration(u1Var.getMessageObject().getStickerEmoji()) && !u1Var.getMessageObject().isPremiumSticker() && !u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                u1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        fzVar.o(u1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public dd0(ed0 ed0Var) {
        this.d = ed0Var;
    }
}
