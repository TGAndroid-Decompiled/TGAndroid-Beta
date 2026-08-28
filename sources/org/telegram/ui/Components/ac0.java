package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class ac0 implements Runnable {
    public final int f26757a = 0;
    public int f26758b;
    public int f26759c;
    public final Object d;

    public ac0(org.telegram.ui.py pyVar, int i9, int i10) {
        this.d = pyVar;
        this.f26758b = i9;
        this.f26759c = i10;
    }

    public void a() {
        this.f26759c = 0;
        this.f26758b = 0;
        bc0 bc0Var = (bc0) this.d;
        bc0Var.removeCallbacks(this);
        if (bc0Var.f27160j0) {
            bc0Var.f27160j0 = false;
            bc0Var.invalidate(0, bc0Var.f27159i0, bc0Var.getRight(), bc0Var.getBottom());
        }
        bc0Var.f27161k0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.qn qnVar;
        switch (this.f26757a) {
            case 0:
                bc0 bc0Var = (bc0) this.d;
                int i9 = this.f26759c;
                if (i9 != 1) {
                    if (i9 == 2) {
                        int i10 = this.f26758b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                if (!bc0Var.f27161k0) {
                                    bc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                bc0Var.f27161k0 = (byte) (!bc0Var.f27161k0 ? 1 : 0);
                                bc0Var.invalidate(0, 0, bc0Var.getRight(), bc0Var.f27158h0);
                                return;
                            }
                            return;
                        }
                        if (!bc0Var.f27160j0) {
                            bc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        bc0Var.f27160j0 = (byte) (!bc0Var.f27160j0 ? 1 : 0);
                        bc0Var.invalidate(0, bc0Var.f27159i0, bc0Var.getRight(), bc0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i11 = this.f26758b;
                if (i11 != 1) {
                    if (i11 == 2) {
                        bc0Var.f27161k0 = true;
                        bc0Var.invalidate(0, 0, bc0Var.getRight(), bc0Var.f27158h0);
                        return;
                    }
                    return;
                }
                bc0Var.f27160j0 = true;
                bc0Var.invalidate(0, bc0Var.f27159i0, bc0Var.getRight(), bc0Var.getBottom());
                return;
            default:
                org.telegram.ui.py pyVar = (org.telegram.ui.py) this.d;
                int i12 = this.f26758b;
                int i13 = this.f26759c;
                wk0 wk0Var = pyVar.D;
                if (pyVar.f41621n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < wk0Var.getChildCount()) {
                            View childAt = wk0Var.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.t1) {
                                t1Var = (org.telegram.ui.Cells.t1) childAt;
                                String stickerEmoji = t1Var.getMessageObject().getStickerEmoji();
                                if (stickerEmoji == null) {
                                    stickerEmoji = t1Var.getMessageObject().messageOwner.message;
                                }
                                if (t1Var.getPhotoImage().hasNotThumb() && stickerEmoji != null && t1Var.getMessageObject().getId() == i12) {
                                }
                            }
                            i14++;
                        } else {
                            t1Var = null;
                        }
                    }
                    if (t1Var != null && (qnVar = pyVar.f41616a) != null) {
                        qnVar.Na(t1Var);
                        if (!EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                t1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        pyVar.o(t1Var, i13, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ac0(bc0 bc0Var) {
        this.d = bc0Var;
    }
}
