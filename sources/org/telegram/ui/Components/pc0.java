package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class pc0 implements Runnable {
    public final int f31644a = 0;
    public int f31645b;
    public int f31646c;
    public final Object d;

    public pc0(org.telegram.ui.ry ryVar, int i10, int i11) {
        this.d = ryVar;
        this.f31645b = i10;
        this.f31646c = i11;
    }

    public void a() {
        this.f31646c = 0;
        this.f31645b = 0;
        qc0 qc0Var = (qc0) this.d;
        qc0Var.removeCallbacks(this);
        if (qc0Var.f31908j0) {
            qc0Var.f31908j0 = false;
            qc0Var.invalidate(0, qc0Var.f31907i0, qc0Var.getRight(), qc0Var.getBottom());
        }
        qc0Var.f31909k0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.tn tnVar;
        switch (this.f31644a) {
            case 0:
                qc0 qc0Var = (qc0) this.d;
                int i10 = this.f31646c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f31645b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!qc0Var.f31909k0) {
                                    qc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                qc0Var.f31909k0 = (byte) (!qc0Var.f31909k0 ? 1 : 0);
                                qc0Var.invalidate(0, 0, qc0Var.getRight(), qc0Var.f31906h0);
                                return;
                            }
                            return;
                        }
                        if (!qc0Var.f31908j0) {
                            qc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        qc0Var.f31908j0 = (byte) (!qc0Var.f31908j0 ? 1 : 0);
                        qc0Var.invalidate(0, qc0Var.f31907i0, qc0Var.getRight(), qc0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f31645b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        qc0Var.f31909k0 = true;
                        qc0Var.invalidate(0, 0, qc0Var.getRight(), qc0Var.f31906h0);
                        return;
                    }
                    return;
                }
                qc0Var.f31908j0 = true;
                qc0Var.invalidate(0, qc0Var.f31907i0, qc0Var.getRight(), qc0Var.getBottom());
                return;
            default:
                org.telegram.ui.ry ryVar = (org.telegram.ui.ry) this.d;
                int i13 = this.f31645b;
                int i14 = this.f31646c;
                jl0 jl0Var = ryVar.D;
                if (ryVar.f42230n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < jl0Var.getChildCount()) {
                            View childAt = jl0Var.getChildAt(i15);
                            if (childAt instanceof org.telegram.ui.Cells.s1) {
                                s1Var = (org.telegram.ui.Cells.s1) childAt;
                                String stickerEmoji = s1Var.getMessageObject().getStickerEmoji();
                                if (stickerEmoji == null) {
                                    stickerEmoji = s1Var.getMessageObject().messageOwner.message;
                                }
                                if (s1Var.getPhotoImage().hasNotThumb() && stickerEmoji != null && s1Var.getMessageObject().getId() == i13) {
                                }
                            }
                            i15++;
                        } else {
                            s1Var = null;
                        }
                    }
                    if (s1Var != null && (tnVar = ryVar.f42225a) != null) {
                        tnVar.Na(s1Var);
                        if (!EmojiData.hasEmojiSupportVibration(s1Var.getMessageObject().getStickerEmoji()) && !s1Var.getMessageObject().isPremiumSticker() && !s1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                s1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        ryVar.o(s1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public pc0(qc0 qc0Var) {
        this.d = qc0Var;
    }
}
