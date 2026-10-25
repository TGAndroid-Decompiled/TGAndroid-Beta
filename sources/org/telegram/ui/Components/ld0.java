package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class ld0 implements Runnable {
    public final int f30176a = 0;
    public int f30177b;
    public int f30178c;
    public final Object d;

    public ld0(org.telegram.ui.oy oyVar, int i10, int i11) {
        this.d = oyVar;
        this.f30177b = i10;
        this.f30178c = i11;
    }

    public void a() {
        this.f30178c = 0;
        this.f30177b = 0;
        md0 md0Var = (md0) this.d;
        md0Var.removeCallbacks(this);
        if (md0Var.f30550o0) {
            md0Var.f30550o0 = false;
            md0Var.invalidate(0, md0Var.f30549n0, md0Var.getRight(), md0Var.getBottom());
        }
        md0Var.f30551p0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.un unVar;
        switch (this.f30176a) {
            case 0:
                md0 md0Var = (md0) this.d;
                int i10 = this.f30178c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f30177b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!md0Var.f30551p0) {
                                    md0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                md0Var.f30551p0 = (byte) (!md0Var.f30551p0 ? 1 : 0);
                                md0Var.invalidate(0, 0, md0Var.getRight(), md0Var.m0);
                                return;
                            }
                            return;
                        }
                        if (!md0Var.f30550o0) {
                            md0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        md0Var.f30550o0 = (byte) (!md0Var.f30550o0 ? 1 : 0);
                        md0Var.invalidate(0, md0Var.f30549n0, md0Var.getRight(), md0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f30177b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        md0Var.f30551p0 = true;
                        md0Var.invalidate(0, 0, md0Var.getRight(), md0Var.m0);
                        return;
                    }
                    return;
                }
                md0Var.f30550o0 = true;
                md0Var.invalidate(0, md0Var.f30549n0, md0Var.getRight(), md0Var.getBottom());
                return;
            default:
                org.telegram.ui.oy oyVar = (org.telegram.ui.oy) this.d;
                int i13 = this.f30177b;
                int i14 = this.f30178c;
                mm0 mm0Var = oyVar.H;
                if (oyVar.f42305n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < mm0Var.getChildCount()) {
                            View childAt = mm0Var.getChildAt(i15);
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
                    if (s1Var != null && (unVar = oyVar.f42301a) != null) {
                        unVar.Wa(s1Var);
                        if (!EmojiData.hasEmojiSupportVibration(s1Var.getMessageObject().getStickerEmoji()) && !s1Var.getMessageObject().isPremiumSticker() && !s1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                s1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        oyVar.n(s1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ld0(md0 md0Var) {
        this.d = md0Var;
    }
}
