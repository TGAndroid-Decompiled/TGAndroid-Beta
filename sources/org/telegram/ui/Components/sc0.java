package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class sc0 implements Runnable {
    public final int f27907a = 0;
    public int f27908b;
    public int f27909c;
    public final Object d;

    public sc0(org.telegram.ui.dz dzVar, int i10, int i11) {
        this.d = dzVar;
        this.f27908b = i10;
        this.f27909c = i11;
    }

    public void a() {
        this.f27909c = 0;
        this.f27908b = 0;
        tc0 tc0Var = (tc0) this.d;
        tc0Var.removeCallbacks(this);
        if (tc0Var.f28165n0) {
            tc0Var.f28165n0 = false;
            tc0Var.invalidate(0, tc0Var.m0, tc0Var.getRight(), tc0Var.getBottom());
        }
        tc0Var.f28166o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.xn xnVar;
        switch (this.f27907a) {
            case 0:
                tc0 tc0Var = (tc0) this.d;
                int i10 = this.f27909c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f27908b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!tc0Var.f28166o0) {
                                    tc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                tc0Var.f28166o0 = (byte) (!tc0Var.f28166o0 ? 1 : 0);
                                tc0Var.invalidate(0, 0, tc0Var.getRight(), tc0Var.f28163l0);
                                return;
                            }
                            return;
                        }
                        if (!tc0Var.f28165n0) {
                            tc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        tc0Var.f28165n0 = (byte) (!tc0Var.f28165n0 ? 1 : 0);
                        tc0Var.invalidate(0, tc0Var.m0, tc0Var.getRight(), tc0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f27908b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        tc0Var.f28166o0 = true;
                        tc0Var.invalidate(0, 0, tc0Var.getRight(), tc0Var.f28163l0);
                        return;
                    }
                    return;
                }
                tc0Var.f28165n0 = true;
                tc0Var.invalidate(0, tc0Var.m0, tc0Var.getRight(), tc0Var.getBottom());
                return;
            default:
                org.telegram.ui.dz dzVar = (org.telegram.ui.dz) this.d;
                int i13 = this.f27908b;
                int i14 = this.f27909c;
                ml0 ml0Var = dzVar.H;
                if (dzVar.f32746n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < ml0Var.getChildCount()) {
                            View childAt = ml0Var.getChildAt(i15);
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
                    if (t1Var != null && (xnVar = dzVar.f32742a) != null) {
                        xnVar.Na(t1Var);
                        if (!EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                t1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        dzVar.o(t1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public sc0(tc0 tc0Var) {
        this.d = tc0Var;
    }
}
