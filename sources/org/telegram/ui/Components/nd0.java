package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class nd0 implements Runnable {
    public final int f28788a = 0;
    public int f28789b;
    public int f28790c;
    public final Object d;

    public nd0(org.telegram.ui.oy oyVar, int i10, int i11) {
        this.d = oyVar;
        this.f28789b = i10;
        this.f28790c = i11;
    }

    public void a() {
        this.f28790c = 0;
        this.f28789b = 0;
        od0 od0Var = (od0) this.d;
        od0Var.removeCallbacks(this);
        if (od0Var.f29021n0) {
            od0Var.f29021n0 = false;
            od0Var.invalidate(0, od0Var.m0, od0Var.getRight(), od0Var.getBottom());
        }
        od0Var.f29022o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.qn qnVar;
        switch (this.f28788a) {
            case 0:
                od0 od0Var = (od0) this.d;
                int i10 = this.f28790c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f28789b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!od0Var.f29022o0) {
                                    od0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                od0Var.f29022o0 = (byte) (!od0Var.f29022o0 ? 1 : 0);
                                od0Var.invalidate(0, 0, od0Var.getRight(), od0Var.f29019l0);
                                return;
                            }
                            return;
                        }
                        if (!od0Var.f29021n0) {
                            od0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        od0Var.f29021n0 = (byte) (!od0Var.f29021n0 ? 1 : 0);
                        od0Var.invalidate(0, od0Var.m0, od0Var.getRight(), od0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f28789b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        od0Var.f29022o0 = true;
                        od0Var.invalidate(0, 0, od0Var.getRight(), od0Var.f29019l0);
                        return;
                    }
                    return;
                }
                od0Var.f29021n0 = true;
                od0Var.invalidate(0, od0Var.m0, od0Var.getRight(), od0Var.getBottom());
                return;
            default:
                org.telegram.ui.oy oyVar = (org.telegram.ui.oy) this.d;
                int i13 = this.f28789b;
                int i14 = this.f28790c;
                jm0 jm0Var = oyVar.H;
                if (oyVar.f40008n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < jm0Var.getChildCount()) {
                            View childAt = jm0Var.getChildAt(i15);
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
                    if (u1Var != null && (qnVar = oyVar.f40004a) != null) {
                        qnVar.Ra(u1Var);
                        if (!EmojiData.hasEmojiSupportVibration(u1Var.getMessageObject().getStickerEmoji()) && !u1Var.getMessageObject().isPremiumSticker() && !u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                u1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        oyVar.n(u1Var, i14, false, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public nd0(od0 od0Var) {
        this.d = od0Var;
    }
}
