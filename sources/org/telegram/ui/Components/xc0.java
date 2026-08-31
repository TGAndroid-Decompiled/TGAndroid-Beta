package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class xc0 implements Runnable {
    public final int f33036a = 0;
    public int f33037b;
    public int f33038c;
    public final Object d;

    public xc0(org.telegram.ui.cz czVar, int i10, int i11) {
        this.d = czVar;
        this.f33037b = i10;
        this.f33038c = i11;
    }

    public void a() {
        this.f33038c = 0;
        this.f33037b = 0;
        yc0 yc0Var = (yc0) this.d;
        yc0Var.removeCallbacks(this);
        if (yc0Var.f33481k0) {
            yc0Var.f33481k0 = false;
            yc0Var.invalidate(0, yc0Var.f33480j0, yc0Var.getRight(), yc0Var.getBottom());
        }
        yc0Var.f33482l0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.xn xnVar;
        switch (this.f33036a) {
            case 0:
                yc0 yc0Var = (yc0) this.d;
                int i10 = this.f33038c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f33037b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!yc0Var.f33482l0) {
                                    yc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                yc0Var.f33482l0 = (byte) (!yc0Var.f33482l0 ? 1 : 0);
                                yc0Var.invalidate(0, 0, yc0Var.getRight(), yc0Var.f33479i0);
                                return;
                            }
                            return;
                        }
                        if (!yc0Var.f33481k0) {
                            yc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        yc0Var.f33481k0 = (byte) (!yc0Var.f33481k0 ? 1 : 0);
                        yc0Var.invalidate(0, yc0Var.f33480j0, yc0Var.getRight(), yc0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f33037b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        yc0Var.f33482l0 = true;
                        yc0Var.invalidate(0, 0, yc0Var.getRight(), yc0Var.f33479i0);
                        return;
                    }
                    return;
                }
                yc0Var.f33481k0 = true;
                yc0Var.invalidate(0, yc0Var.f33480j0, yc0Var.getRight(), yc0Var.getBottom());
                return;
            default:
                org.telegram.ui.cz czVar = (org.telegram.ui.cz) this.d;
                int i13 = this.f33037b;
                int i14 = this.f33038c;
                tl0 tl0Var = czVar.E;
                if (czVar.f35941n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < tl0Var.getChildCount()) {
                            View childAt = tl0Var.getChildAt(i15);
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
                    if (t1Var != null && (xnVar = czVar.f35936a) != null) {
                        xnVar.Na(t1Var);
                        if (!EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                t1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        czVar.o(t1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public xc0(yc0 yc0Var) {
        this.d = yc0Var;
    }
}
