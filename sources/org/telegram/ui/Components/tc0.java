package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class tc0 implements Runnable {
    public final int f28097a = 0;
    public int f28098b;
    public int f28099c;
    public final Object d;

    public tc0(org.telegram.ui.gz gzVar, int i10, int i11) {
        this.d = gzVar;
        this.f28098b = i10;
        this.f28099c = i11;
    }

    public void a() {
        this.f28099c = 0;
        this.f28098b = 0;
        uc0 uc0Var = (uc0) this.d;
        uc0Var.removeCallbacks(this);
        if (uc0Var.f28359n0) {
            uc0Var.f28359n0 = false;
            uc0Var.invalidate(0, uc0Var.m0, uc0Var.getRight(), uc0Var.getBottom());
        }
        uc0Var.f28360o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.bo boVar;
        switch (this.f28097a) {
            case 0:
                uc0 uc0Var = (uc0) this.d;
                int i10 = this.f28099c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f28098b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!uc0Var.f28360o0) {
                                    uc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                uc0Var.f28360o0 = (byte) (!uc0Var.f28360o0 ? 1 : 0);
                                uc0Var.invalidate(0, 0, uc0Var.getRight(), uc0Var.f28357l0);
                                return;
                            }
                            return;
                        }
                        if (!uc0Var.f28359n0) {
                            uc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        uc0Var.f28359n0 = (byte) (!uc0Var.f28359n0 ? 1 : 0);
                        uc0Var.invalidate(0, uc0Var.m0, uc0Var.getRight(), uc0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f28098b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        uc0Var.f28360o0 = true;
                        uc0Var.invalidate(0, 0, uc0Var.getRight(), uc0Var.f28357l0);
                        return;
                    }
                    return;
                }
                uc0Var.f28359n0 = true;
                uc0Var.invalidate(0, uc0Var.m0, uc0Var.getRight(), uc0Var.getBottom());
                return;
            default:
                org.telegram.ui.gz gzVar = (org.telegram.ui.gz) this.d;
                int i13 = this.f28098b;
                int i14 = this.f28099c;
                ll0 ll0Var = gzVar.H;
                if (gzVar.f33980n) {
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
                    if (t1Var != null && (boVar = gzVar.f33976a) != null) {
                        boVar.Na(t1Var);
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

    public tc0(uc0 uc0Var) {
        this.d = uc0Var;
    }
}
