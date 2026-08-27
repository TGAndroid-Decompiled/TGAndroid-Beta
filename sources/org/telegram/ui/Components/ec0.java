package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;

public final class ec0 implements Runnable {

    public final int f28032a = 0;

    public int f28033b;

    public int f28034c;
    public final Object d;

    public ec0(org.telegram.ui.sy syVar, int i10, int i11) {
        this.d = syVar;
        this.f28033b = i10;
        this.f28034c = i11;
    }

    public void a() {
        this.f28034c = 0;
        this.f28033b = 0;
        fc0 fc0Var = (fc0) this.d;
        fc0Var.removeCallbacks(this);
        if (fc0Var.f28362j0) {
            fc0Var.f28362j0 = false;
            fc0Var.invalidate(0, fc0Var.f28361i0, fc0Var.getRight(), fc0Var.getBottom());
        }
        fc0Var.f28363k0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.rn rnVar;
        switch (this.f28032a) {
            case 0:
                fc0 fc0Var = (fc0) this.d;
                int i10 = this.f28034c;
                if (i10 == 1) {
                    int i11 = this.f28033b;
                    if (i11 == 1) {
                        fc0Var.f28362j0 = true;
                        fc0Var.invalidate(0, fc0Var.f28361i0, fc0Var.getRight(), fc0Var.getBottom());
                        break;
                    } else if (i11 == 2) {
                        fc0Var.f28363k0 = true;
                        fc0Var.invalidate(0, 0, fc0Var.getRight(), fc0Var.f28360h0);
                        break;
                    }
                } else if (i10 == 2) {
                    int i12 = this.f28033b;
                    if (i12 == 1) {
                        if (!fc0Var.f28362j0) {
                            fc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        fc0Var.f28362j0 = (byte) (!fc0Var.f28362j0 ? 1 : 0);
                        fc0Var.invalidate(0, fc0Var.f28361i0, fc0Var.getRight(), fc0Var.getBottom());
                        break;
                    } else if (i12 == 2) {
                        if (!fc0Var.f28363k0) {
                            fc0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        fc0Var.f28363k0 = (byte) (!fc0Var.f28363k0 ? 1 : 0);
                        fc0Var.invalidate(0, 0, fc0Var.getRight(), fc0Var.f28360h0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.sy syVar = (org.telegram.ui.sy) this.d;
                int i13 = this.f28033b;
                int i14 = this.f28034c;
                zk0 zk0Var = syVar.D;
                if (syVar.f42717n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < zk0Var.getChildCount()) {
                            View childAt = zk0Var.getChildAt(i15);
                            if (childAt instanceof org.telegram.ui.Cells.s1) {
                                s1Var = (org.telegram.ui.Cells.s1) childAt;
                                String stickerEmoji = s1Var.getMessageObject().getStickerEmoji();
                                if (stickerEmoji == null) {
                                    stickerEmoji = s1Var.getMessageObject().messageOwner.message;
                                }
                                if (!s1Var.getPhotoImage().hasNotThumb() || stickerEmoji == null || s1Var.getMessageObject().getId() != i13) {
                                }
                            }
                            i15++;
                        } else {
                            s1Var = null;
                        }
                    }
                    if (s1Var != null && (rnVar = syVar.f42712a) != null) {
                        rnVar.Na(s1Var);
                        if (!EmojiData.hasEmojiSupportVibration(s1Var.getMessageObject().getStickerEmoji()) && !s1Var.getMessageObject().isPremiumSticker() && !s1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                s1Var.performHapticFeedback(3);
                                break;
                            } catch (Exception unused) {
                            }
                        }
                        syVar.o(s1Var, i14, false, true);
                        break;
                    }
                }
                break;
        }
    }

    public ec0(fc0 fc0Var) {
        this.d = fc0Var;
    }
}
