package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class xd0 implements Runnable {
    public final int f32729a = 0;
    public int f32730b;
    public int f32731c;
    public final Object d;

    public xd0(org.telegram.ui.hz hzVar, int i10, int i11) {
        this.d = hzVar;
        this.f32730b = i10;
        this.f32731c = i11;
    }

    public void a() {
        this.f32731c = 0;
        this.f32730b = 0;
        yd0 yd0Var = (yd0) this.d;
        yd0Var.removeCallbacks(this);
        if (yd0Var.f33078n0) {
            yd0Var.f33078n0 = false;
            yd0Var.invalidate(0, yd0Var.m0, yd0Var.getRight(), yd0Var.getBottom());
        }
        yd0Var.f33079o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.eo eoVar;
        switch (this.f32729a) {
            case 0:
                yd0 yd0Var = (yd0) this.d;
                int i10 = this.f32731c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f32730b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!yd0Var.f33079o0) {
                                    yd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                yd0Var.f33079o0 = (byte) (!yd0Var.f33079o0 ? 1 : 0);
                                yd0Var.invalidate(0, 0, yd0Var.getRight(), yd0Var.f33076l0);
                                return;
                            }
                            return;
                        }
                        if (!yd0Var.f33078n0) {
                            yd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        yd0Var.f33078n0 = (byte) (!yd0Var.f33078n0 ? 1 : 0);
                        yd0Var.invalidate(0, yd0Var.m0, yd0Var.getRight(), yd0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f32730b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        yd0Var.f33079o0 = true;
                        yd0Var.invalidate(0, 0, yd0Var.getRight(), yd0Var.f33076l0);
                        return;
                    }
                    return;
                }
                yd0Var.f33078n0 = true;
                yd0Var.invalidate(0, yd0Var.m0, yd0Var.getRight(), yd0Var.getBottom());
                return;
            default:
                org.telegram.ui.hz hzVar = (org.telegram.ui.hz) this.d;
                int i13 = this.f32730b;
                int i14 = this.f32731c;
                wm0 wm0Var = hzVar.H;
                if (hzVar.f38566n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < wm0Var.getChildCount()) {
                            View childAt = wm0Var.getChildAt(i15);
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
                    if (u1Var != null && (eoVar = hzVar.f38561a) != null) {
                        eoVar.Ra(u1Var);
                        if (!EmojiData.hasEmojiSupportVibration(u1Var.getMessageObject().getStickerEmoji()) && !u1Var.getMessageObject().isPremiumSticker() && !u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                u1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        hzVar.n(u1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public xd0(yd0 yd0Var) {
        this.d = yd0Var;
    }
}
