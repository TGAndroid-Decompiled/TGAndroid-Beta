package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class td0 implements Runnable {
    public final int f29044a = 0;
    public int f29045b;
    public int f29046c;
    public final Object d;

    public td0(org.telegram.ui.kz kzVar, int i10, int i11) {
        this.d = kzVar;
        this.f29045b = i10;
        this.f29046c = i11;
    }

    public void a() {
        this.f29046c = 0;
        this.f29045b = 0;
        ud0 ud0Var = (ud0) this.d;
        ud0Var.removeCallbacks(this);
        if (ud0Var.f29346n0) {
            ud0Var.f29346n0 = false;
            ud0Var.invalidate(0, ud0Var.m0, ud0Var.getRight(), ud0Var.getBottom());
        }
        ud0Var.f29347o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.fo foVar;
        switch (this.f29044a) {
            case 0:
                ud0 ud0Var = (ud0) this.d;
                int i10 = this.f29046c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f29045b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!ud0Var.f29347o0) {
                                    ud0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                ud0Var.f29347o0 = (byte) (!ud0Var.f29347o0 ? 1 : 0);
                                ud0Var.invalidate(0, 0, ud0Var.getRight(), ud0Var.f29344l0);
                                return;
                            }
                            return;
                        }
                        if (!ud0Var.f29346n0) {
                            ud0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        ud0Var.f29346n0 = (byte) (!ud0Var.f29346n0 ? 1 : 0);
                        ud0Var.invalidate(0, ud0Var.m0, ud0Var.getRight(), ud0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f29045b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        ud0Var.f29347o0 = true;
                        ud0Var.invalidate(0, 0, ud0Var.getRight(), ud0Var.f29344l0);
                        return;
                    }
                    return;
                }
                ud0Var.f29346n0 = true;
                ud0Var.invalidate(0, ud0Var.m0, ud0Var.getRight(), ud0Var.getBottom());
                return;
            default:
                org.telegram.ui.kz kzVar = (org.telegram.ui.kz) this.d;
                int i13 = this.f29045b;
                int i14 = this.f29046c;
                mm0 mm0Var = kzVar.H;
                if (kzVar.f37553n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < mm0Var.getChildCount()) {
                            View childAt = mm0Var.getChildAt(i15);
                            if (childAt instanceof org.telegram.ui.Cells.u1) {
                                u1Var = (org.telegram.ui.Cells.u1) childAt;
                                String stickerEmoji = u1Var.getMessageObject().getStickerEmoji();
                                if (stickerEmoji == null) {
                                    stickerEmoji = u1Var.getMessageObject().messageOwner.message;
                                }
                                if (u1Var.getPhotoImage().hasNotThumb() && stickerEmoji != null && u1Var.getMessageObject().getId() == i13) {
                                }
                            }
                            i15++;
                        } else {
                            u1Var = null;
                        }
                    }
                    if (u1Var != null && (foVar = kzVar.f37549a) != null) {
                        foVar.Ra(u1Var);
                        if (!EmojiData.hasEmojiSupportVibration(u1Var.getMessageObject().getStickerEmoji()) && !u1Var.getMessageObject().isPremiumSticker() && !u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                u1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        kzVar.n(u1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public td0(ud0 ud0Var) {
        this.d = ud0Var;
    }
}
