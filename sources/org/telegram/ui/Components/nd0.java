package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class nd0 implements Runnable {
    public final int f28739a = 0;
    public int f28740b;
    public int f28741c;
    public final Object d;

    public nd0(org.telegram.ui.qy qyVar, int i10, int i11) {
        this.d = qyVar;
        this.f28740b = i10;
        this.f28741c = i11;
    }

    public void a() {
        this.f28741c = 0;
        this.f28740b = 0;
        od0 od0Var = (od0) this.d;
        od0Var.removeCallbacks(this);
        if (od0Var.f28952n0) {
            od0Var.f28952n0 = false;
            od0Var.invalidate(0, od0Var.m0, od0Var.getRight(), od0Var.getBottom());
        }
        od0Var.f28953o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.sn snVar;
        switch (this.f28739a) {
            case 0:
                od0 od0Var = (od0) this.d;
                int i10 = this.f28741c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f28740b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!od0Var.f28953o0) {
                                    od0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                od0Var.f28953o0 = (byte) (!od0Var.f28953o0 ? 1 : 0);
                                od0Var.invalidate(0, 0, od0Var.getRight(), od0Var.f28950l0);
                                return;
                            }
                            return;
                        }
                        if (!od0Var.f28952n0) {
                            od0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        od0Var.f28952n0 = (byte) (!od0Var.f28952n0 ? 1 : 0);
                        od0Var.invalidate(0, od0Var.m0, od0Var.getRight(), od0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f28740b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        od0Var.f28953o0 = true;
                        od0Var.invalidate(0, 0, od0Var.getRight(), od0Var.f28950l0);
                        return;
                    }
                    return;
                }
                od0Var.f28952n0 = true;
                od0Var.invalidate(0, od0Var.m0, od0Var.getRight(), od0Var.getBottom());
                return;
            default:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.d;
                int i13 = this.f28740b;
                int i14 = this.f28741c;
                im0 im0Var = qyVar.H;
                if (qyVar.f40515n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < im0Var.getChildCount()) {
                            View childAt = im0Var.getChildAt(i15);
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
                    if (u1Var != null && (snVar = qyVar.f40511a) != null) {
                        snVar.Ra(u1Var);
                        if (!EmojiData.hasEmojiSupportVibration(u1Var.getMessageObject().getStickerEmoji()) && !u1Var.getMessageObject().isPremiumSticker() && !u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                u1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        qyVar.n(u1Var, i14, false, true);
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
