package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class md0 implements Runnable {
    public final int f30508a = 0;
    public int f30509b;
    public int f30510c;
    public final Object d;

    public md0(org.telegram.ui.qy qyVar, int i10, int i11) {
        this.d = qyVar;
        this.f30509b = i10;
        this.f30510c = i11;
    }

    public void a() {
        this.f30510c = 0;
        this.f30509b = 0;
        nd0 nd0Var = (nd0) this.d;
        nd0Var.removeCallbacks(this);
        if (nd0Var.f30886o0) {
            nd0Var.f30886o0 = false;
            nd0Var.invalidate(0, nd0Var.f30885n0, nd0Var.getRight(), nd0Var.getBottom());
        }
        nd0Var.f30887p0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.wn wnVar;
        switch (this.f30508a) {
            case 0:
                nd0 nd0Var = (nd0) this.d;
                int i10 = this.f30510c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f30509b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!nd0Var.f30887p0) {
                                    nd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                nd0Var.f30887p0 = (byte) (!nd0Var.f30887p0 ? 1 : 0);
                                nd0Var.invalidate(0, 0, nd0Var.getRight(), nd0Var.m0);
                                return;
                            }
                            return;
                        }
                        if (!nd0Var.f30886o0) {
                            nd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        nd0Var.f30886o0 = (byte) (!nd0Var.f30886o0 ? 1 : 0);
                        nd0Var.invalidate(0, nd0Var.f30885n0, nd0Var.getRight(), nd0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f30509b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        nd0Var.f30887p0 = true;
                        nd0Var.invalidate(0, 0, nd0Var.getRight(), nd0Var.m0);
                        return;
                    }
                    return;
                }
                nd0Var.f30886o0 = true;
                nd0Var.invalidate(0, nd0Var.f30885n0, nd0Var.getRight(), nd0Var.getBottom());
                return;
            default:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.d;
                int i13 = this.f30509b;
                int i14 = this.f30510c;
                nm0 nm0Var = qyVar.H;
                if (qyVar.f42810n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < nm0Var.getChildCount()) {
                            View childAt = nm0Var.getChildAt(i15);
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
                    if (s1Var != null && (wnVar = qyVar.f42806a) != null) {
                        wnVar.Za(s1Var);
                        if (!EmojiData.hasEmojiSupportVibration(s1Var.getMessageObject().getStickerEmoji()) && !s1Var.getMessageObject().isPremiumSticker() && !s1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                s1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        qyVar.n(s1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public md0(nd0 nd0Var) {
        this.d = nd0Var;
    }
}
