package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class xc0 implements Runnable {
    public final int f33030a = 0;
    public int f33031b;
    public int f33032c;
    public final Object d;

    public xc0(org.telegram.ui.cz czVar, int i10, int i11) {
        this.d = czVar;
        this.f33031b = i10;
        this.f33032c = i11;
    }

    public void a() {
        this.f33032c = 0;
        this.f33031b = 0;
        yc0 yc0Var = (yc0) this.d;
        yc0Var.removeCallbacks(this);
        if (yc0Var.f33502k0) {
            yc0Var.f33502k0 = false;
            yc0Var.invalidate(0, yc0Var.f33501j0, yc0Var.getRight(), yc0Var.getBottom());
        }
        yc0Var.f33503l0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.xn xnVar;
        switch (this.f33030a) {
            case 0:
                yc0 yc0Var = (yc0) this.d;
                int i10 = this.f33032c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f33031b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!yc0Var.f33503l0) {
                                    yc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                yc0Var.f33503l0 = (byte) (!yc0Var.f33503l0 ? 1 : 0);
                                yc0Var.invalidate(0, 0, yc0Var.getRight(), yc0Var.f33500i0);
                                return;
                            }
                            return;
                        }
                        if (!yc0Var.f33502k0) {
                            yc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        yc0Var.f33502k0 = (byte) (!yc0Var.f33502k0 ? 1 : 0);
                        yc0Var.invalidate(0, yc0Var.f33501j0, yc0Var.getRight(), yc0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f33031b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        yc0Var.f33503l0 = true;
                        yc0Var.invalidate(0, 0, yc0Var.getRight(), yc0Var.f33500i0);
                        return;
                    }
                    return;
                }
                yc0Var.f33502k0 = true;
                yc0Var.invalidate(0, yc0Var.f33501j0, yc0Var.getRight(), yc0Var.getBottom());
                return;
            default:
                org.telegram.ui.cz czVar = (org.telegram.ui.cz) this.d;
                int i13 = this.f33031b;
                int i14 = this.f33032c;
                sl0 sl0Var = czVar.E;
                if (czVar.f35908n) {
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
                    if (t1Var != null && (xnVar = czVar.f35903a) != null) {
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
