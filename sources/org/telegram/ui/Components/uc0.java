package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class uc0 implements Runnable {
    public final int f30887a = 0;
    public int f30888b;
    public int f30889c;
    public final Object d;

    public uc0(org.telegram.ui.gz gzVar, int i10, int i11) {
        this.d = gzVar;
        this.f30888b = i10;
        this.f30889c = i11;
    }

    public void a() {
        this.f30889c = 0;
        this.f30888b = 0;
        vc0 vc0Var = (vc0) this.d;
        vc0Var.removeCallbacks(this);
        if (vc0Var.f31215n0) {
            vc0Var.f31215n0 = false;
            vc0Var.invalidate(0, vc0Var.m0, vc0Var.getRight(), vc0Var.getBottom());
        }
        vc0Var.f31216o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.co coVar;
        switch (this.f30887a) {
            case 0:
                vc0 vc0Var = (vc0) this.d;
                int i10 = this.f30889c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f30888b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!vc0Var.f31216o0) {
                                    vc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                vc0Var.f31216o0 = (byte) (!vc0Var.f31216o0 ? 1 : 0);
                                vc0Var.invalidate(0, 0, vc0Var.getRight(), vc0Var.f31213l0);
                                return;
                            }
                            return;
                        }
                        if (!vc0Var.f31215n0) {
                            vc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        vc0Var.f31215n0 = (byte) (!vc0Var.f31215n0 ? 1 : 0);
                        vc0Var.invalidate(0, vc0Var.m0, vc0Var.getRight(), vc0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f30888b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        vc0Var.f31216o0 = true;
                        vc0Var.invalidate(0, 0, vc0Var.getRight(), vc0Var.f31213l0);
                        return;
                    }
                    return;
                }
                vc0Var.f31215n0 = true;
                vc0Var.invalidate(0, vc0Var.m0, vc0Var.getRight(), vc0Var.getBottom());
                return;
            default:
                org.telegram.ui.gz gzVar = (org.telegram.ui.gz) this.d;
                int i13 = this.f30888b;
                int i14 = this.f30889c;
                ll0 ll0Var = gzVar.H;
                if (gzVar.f36844n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < ll0Var.getChildCount()) {
                            View childAt = ll0Var.getChildAt(i15);
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
                    if (t1Var != null && (coVar = gzVar.f36839a) != null) {
                        coVar.Na(t1Var);
                        if (!EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                t1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        gzVar.o(t1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public uc0(vc0 vc0Var) {
        this.d = vc0Var;
    }
}
