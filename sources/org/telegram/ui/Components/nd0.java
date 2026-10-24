package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class nd0 implements Runnable {
    public final int f28876a = 0;
    public int f28877b;
    public int f28878c;
    public final Object d;

    public nd0(org.telegram.ui.qy qyVar, int i10, int i11) {
        this.d = qyVar;
        this.f28877b = i10;
        this.f28878c = i11;
    }

    public void a() {
        this.f28878c = 0;
        this.f28877b = 0;
        od0 od0Var = (od0) this.d;
        od0Var.removeCallbacks(this);
        if (od0Var.f29246o0) {
            od0Var.f29246o0 = false;
            od0Var.invalidate(0, od0Var.f29245n0, od0Var.getRight(), od0Var.getBottom());
        }
        od0Var.f29247p0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.sn snVar;
        switch (this.f28876a) {
            case 0:
                od0 od0Var = (od0) this.d;
                int i10 = this.f28878c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f28877b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!od0Var.f29247p0) {
                                    od0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                od0Var.f29247p0 = (byte) (!od0Var.f29247p0 ? 1 : 0);
                                od0Var.invalidate(0, 0, od0Var.getRight(), od0Var.m0);
                                return;
                            }
                            return;
                        }
                        if (!od0Var.f29246o0) {
                            od0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        od0Var.f29246o0 = (byte) (!od0Var.f29246o0 ? 1 : 0);
                        od0Var.invalidate(0, od0Var.f29245n0, od0Var.getRight(), od0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f28877b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        od0Var.f29247p0 = true;
                        od0Var.invalidate(0, 0, od0Var.getRight(), od0Var.m0);
                        return;
                    }
                    return;
                }
                od0Var.f29246o0 = true;
                od0Var.invalidate(0, od0Var.f29245n0, od0Var.getRight(), od0Var.getBottom());
                return;
            default:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.d;
                int i13 = this.f28877b;
                int i14 = this.f28878c;
                lm0 lm0Var = qyVar.H;
                if (qyVar.f40954n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < lm0Var.getChildCount()) {
                            View childAt = lm0Var.getChildAt(i15);
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
                    if (t1Var != null && (snVar = qyVar.f40950a) != null) {
                        snVar.Ra(t1Var);
                        if (!EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                t1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        qyVar.n(t1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public nd0(od0 od0Var) {
        this.d = od0Var;
    }
}
