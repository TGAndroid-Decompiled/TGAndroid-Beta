package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class cd0 implements Runnable {
    public final int f23258a = 0;
    public int f23259b;
    public int f23260c;
    public final Object d;

    public cd0(org.telegram.ui.gz gzVar, int i10, int i11) {
        this.d = gzVar;
        this.f23259b = i10;
        this.f23260c = i11;
    }

    public void a() {
        this.f23260c = 0;
        this.f23259b = 0;
        dd0 dd0Var = (dd0) this.d;
        dd0Var.removeCallbacks(this);
        if (dd0Var.f23551n0) {
            dd0Var.f23551n0 = false;
            dd0Var.invalidate(0, dd0Var.m0, dd0Var.getRight(), dd0Var.getBottom());
        }
        dd0Var.f23552o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.zn znVar;
        switch (this.f23258a) {
            case 0:
                dd0 dd0Var = (dd0) this.d;
                int i10 = this.f23260c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f23259b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!dd0Var.f23552o0) {
                                    dd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                dd0Var.f23552o0 = (byte) (!dd0Var.f23552o0 ? 1 : 0);
                                dd0Var.invalidate(0, 0, dd0Var.getRight(), dd0Var.f23549l0);
                                return;
                            }
                            return;
                        }
                        if (!dd0Var.f23551n0) {
                            dd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        dd0Var.f23551n0 = (byte) (!dd0Var.f23551n0 ? 1 : 0);
                        dd0Var.invalidate(0, dd0Var.m0, dd0Var.getRight(), dd0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f23259b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        dd0Var.f23552o0 = true;
                        dd0Var.invalidate(0, 0, dd0Var.getRight(), dd0Var.f23549l0);
                        return;
                    }
                    return;
                }
                dd0Var.f23551n0 = true;
                dd0Var.invalidate(0, dd0Var.m0, dd0Var.getRight(), dd0Var.getBottom());
                return;
            default:
                org.telegram.ui.gz gzVar = (org.telegram.ui.gz) this.d;
                int i13 = this.f23259b;
                int i14 = this.f23260c;
                wl0 wl0Var = gzVar.H;
                if (gzVar.f33973n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < wl0Var.getChildCount()) {
                            View childAt = wl0Var.getChildAt(i15);
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
                    if (u1Var != null && (znVar = gzVar.f33969a) != null) {
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

    public cd0(dd0 dd0Var) {
        this.d = dd0Var;
    }
}
