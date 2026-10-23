package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class pd0 implements Runnable {
    public final int f29520a = 0;
    public int f29521b;
    public int f29522c;
    public final Object d;

    public pd0(org.telegram.ui.qy qyVar, int i10, int i11) {
        this.d = qyVar;
        this.f29521b = i10;
        this.f29522c = i11;
    }

    public void a() {
        this.f29522c = 0;
        this.f29521b = 0;
        qd0 qd0Var = (qd0) this.d;
        qd0Var.removeCallbacks(this);
        if (qd0Var.f29875o0) {
            qd0Var.f29875o0 = false;
            qd0Var.invalidate(0, qd0Var.f29874n0, qd0Var.getRight(), qd0Var.getBottom());
        }
        qd0Var.f29876p0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.sn snVar;
        switch (this.f29520a) {
            case 0:
                qd0 qd0Var = (qd0) this.d;
                int i10 = this.f29522c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f29521b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!qd0Var.f29876p0) {
                                    qd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                qd0Var.f29876p0 = (byte) (!qd0Var.f29876p0 ? 1 : 0);
                                qd0Var.invalidate(0, 0, qd0Var.getRight(), qd0Var.m0);
                                return;
                            }
                            return;
                        }
                        if (!qd0Var.f29875o0) {
                            qd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        qd0Var.f29875o0 = (byte) (!qd0Var.f29875o0 ? 1 : 0);
                        qd0Var.invalidate(0, qd0Var.f29874n0, qd0Var.getRight(), qd0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f29521b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        qd0Var.f29876p0 = true;
                        qd0Var.invalidate(0, 0, qd0Var.getRight(), qd0Var.m0);
                        return;
                    }
                    return;
                }
                qd0Var.f29875o0 = true;
                qd0Var.invalidate(0, qd0Var.f29874n0, qd0Var.getRight(), qd0Var.getBottom());
                return;
            default:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.d;
                int i13 = this.f29521b;
                int i14 = this.f29522c;
                mm0 mm0Var = qyVar.H;
                if (qyVar.f40938n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < mm0Var.getChildCount()) {
                            View childAt = mm0Var.getChildAt(i15);
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
                    if (t1Var != null && (snVar = qyVar.f40934a) != null) {
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

    public pd0(qd0 qd0Var) {
        this.d = qd0Var;
    }
}
