package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class fd0 implements Runnable {
    public final int f24212a = 0;
    public int f24213b;
    public int f24214c;
    public final Object d;

    public fd0(org.telegram.ui.cz czVar, int i10, int i11) {
        this.d = czVar;
        this.f24213b = i10;
        this.f24214c = i11;
    }

    public void a() {
        this.f24214c = 0;
        this.f24213b = 0;
        gd0 gd0Var = (gd0) this.d;
        gd0Var.removeCallbacks(this);
        if (gd0Var.f24517n0) {
            gd0Var.f24517n0 = false;
            gd0Var.invalidate(0, gd0Var.m0, gd0Var.getRight(), gd0Var.getBottom());
        }
        gd0Var.f24518o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.wn wnVar;
        switch (this.f24212a) {
            case 0:
                gd0 gd0Var = (gd0) this.d;
                int i10 = this.f24214c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f24213b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!gd0Var.f24518o0) {
                                    gd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                gd0Var.f24518o0 = (byte) (!gd0Var.f24518o0 ? 1 : 0);
                                gd0Var.invalidate(0, 0, gd0Var.getRight(), gd0Var.f24515l0);
                                return;
                            }
                            return;
                        }
                        if (!gd0Var.f24517n0) {
                            gd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        gd0Var.f24517n0 = (byte) (!gd0Var.f24517n0 ? 1 : 0);
                        gd0Var.invalidate(0, gd0Var.m0, gd0Var.getRight(), gd0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f24213b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        gd0Var.f24518o0 = true;
                        gd0Var.invalidate(0, 0, gd0Var.getRight(), gd0Var.f24515l0);
                        return;
                    }
                    return;
                }
                gd0Var.f24517n0 = true;
                gd0Var.invalidate(0, gd0Var.m0, gd0Var.getRight(), gd0Var.getBottom());
                return;
            default:
                org.telegram.ui.cz czVar = (org.telegram.ui.cz) this.d;
                int i13 = this.f24213b;
                int i14 = this.f24214c;
                yl0 yl0Var = czVar.H;
                if (czVar.f32824n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < yl0Var.getChildCount()) {
                            View childAt = yl0Var.getChildAt(i15);
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
                    if (u1Var != null && (wnVar = czVar.f32820a) != null) {
                        wnVar.Na(u1Var);
                        if (!EmojiData.hasEmojiSupportVibration(u1Var.getMessageObject().getStickerEmoji()) && !u1Var.getMessageObject().isPremiumSticker() && !u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                u1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        czVar.o(u1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public fd0(gd0 gd0Var) {
        this.d = gd0Var;
    }
}
