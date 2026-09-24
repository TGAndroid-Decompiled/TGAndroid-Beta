package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class dd0 implements Runnable {
    public final int f23587a = 0;
    public int f23588b;
    public int f23589c;
    public final Object d;

    public dd0(org.telegram.ui.cz czVar, int i10, int i11) {
        this.d = czVar;
        this.f23588b = i10;
        this.f23589c = i11;
    }

    public void a() {
        this.f23589c = 0;
        this.f23588b = 0;
        ed0 ed0Var = (ed0) this.d;
        ed0Var.removeCallbacks(this);
        if (ed0Var.f23911n0) {
            ed0Var.f23911n0 = false;
            ed0Var.invalidate(0, ed0Var.m0, ed0Var.getRight(), ed0Var.getBottom());
        }
        ed0Var.f23912o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.wn wnVar;
        switch (this.f23587a) {
            case 0:
                ed0 ed0Var = (ed0) this.d;
                int i10 = this.f23589c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f23588b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!ed0Var.f23912o0) {
                                    ed0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                ed0Var.f23912o0 = (byte) (!ed0Var.f23912o0 ? 1 : 0);
                                ed0Var.invalidate(0, 0, ed0Var.getRight(), ed0Var.f23909l0);
                                return;
                            }
                            return;
                        }
                        if (!ed0Var.f23911n0) {
                            ed0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        ed0Var.f23911n0 = (byte) (!ed0Var.f23911n0 ? 1 : 0);
                        ed0Var.invalidate(0, ed0Var.m0, ed0Var.getRight(), ed0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f23588b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        ed0Var.f23912o0 = true;
                        ed0Var.invalidate(0, 0, ed0Var.getRight(), ed0Var.f23909l0);
                        return;
                    }
                    return;
                }
                ed0Var.f23911n0 = true;
                ed0Var.invalidate(0, ed0Var.m0, ed0Var.getRight(), ed0Var.getBottom());
                return;
            default:
                org.telegram.ui.cz czVar = (org.telegram.ui.cz) this.d;
                int i13 = this.f23588b;
                int i14 = this.f23589c;
                wl0 wl0Var = czVar.H;
                if (czVar.f32808n) {
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
                    if (u1Var != null && (wnVar = czVar.f32804a) != null) {
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

    public dd0(ed0 ed0Var) {
        this.d = ed0Var;
    }
}
