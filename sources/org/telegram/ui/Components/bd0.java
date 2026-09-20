package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class bd0 implements Runnable {
    public final int f22985a = 0;
    public int f22986b;
    public int f22987c;
    public final Object d;

    public bd0(org.telegram.ui.gz gzVar, int i10, int i11) {
        this.d = gzVar;
        this.f22986b = i10;
        this.f22987c = i11;
    }

    public void a() {
        this.f22987c = 0;
        this.f22986b = 0;
        cd0 cd0Var = (cd0) this.d;
        cd0Var.removeCallbacks(this);
        if (cd0Var.f23257n0) {
            cd0Var.f23257n0 = false;
            cd0Var.invalidate(0, cd0Var.m0, cd0Var.getRight(), cd0Var.getBottom());
        }
        cd0Var.f23258o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.zn znVar;
        switch (this.f22985a) {
            case 0:
                cd0 cd0Var = (cd0) this.d;
                int i10 = this.f22987c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f22986b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!cd0Var.f23258o0) {
                                    cd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                cd0Var.f23258o0 = (byte) (!cd0Var.f23258o0 ? 1 : 0);
                                cd0Var.invalidate(0, 0, cd0Var.getRight(), cd0Var.f23255l0);
                                return;
                            }
                            return;
                        }
                        if (!cd0Var.f23257n0) {
                            cd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        cd0Var.f23257n0 = (byte) (!cd0Var.f23257n0 ? 1 : 0);
                        cd0Var.invalidate(0, cd0Var.m0, cd0Var.getRight(), cd0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f22986b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        cd0Var.f23258o0 = true;
                        cd0Var.invalidate(0, 0, cd0Var.getRight(), cd0Var.f23255l0);
                        return;
                    }
                    return;
                }
                cd0Var.f23257n0 = true;
                cd0Var.invalidate(0, cd0Var.m0, cd0Var.getRight(), cd0Var.getBottom());
                return;
            default:
                org.telegram.ui.gz gzVar = (org.telegram.ui.gz) this.d;
                int i13 = this.f22986b;
                int i14 = this.f22987c;
                vl0 vl0Var = gzVar.H;
                if (gzVar.f34009n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < vl0Var.getChildCount()) {
                            View childAt = vl0Var.getChildAt(i15);
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
                    if (u1Var != null && (znVar = gzVar.f34005a) != null) {
                        znVar.Na(u1Var);
                        if (!EmojiData.hasEmojiSupportVibration(u1Var.getMessageObject().getStickerEmoji()) && !u1Var.getMessageObject().isPremiumSticker() && !u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                u1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        gzVar.o(u1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public bd0(cd0 cd0Var) {
        this.d = cd0Var;
    }
}
