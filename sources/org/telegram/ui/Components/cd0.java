package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class cd0 implements Runnable {
    public final int f22115a = 0;
    public int f22116b;
    public int f22117c;
    public final Object d;

    public cd0(org.telegram.ui.iz izVar, int i10, int i11) {
        this.d = izVar;
        this.f22116b = i10;
        this.f22117c = i11;
    }

    public void a() {
        this.f22117c = 0;
        this.f22116b = 0;
        dd0 dd0Var = (dd0) this.d;
        dd0Var.removeCallbacks(this);
        if (dd0Var.f22383n0) {
            dd0Var.f22383n0 = false;
            dd0Var.invalidate(0, dd0Var.m0, dd0Var.getRight(), dd0Var.getBottom());
        }
        dd0Var.f22384o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.eo eoVar;
        switch (this.f22115a) {
            case 0:
                dd0 dd0Var = (dd0) this.d;
                int i10 = this.f22117c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f22116b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!dd0Var.f22384o0) {
                                    dd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                dd0Var.f22384o0 = (byte) (!dd0Var.f22384o0 ? 1 : 0);
                                dd0Var.invalidate(0, 0, dd0Var.getRight(), dd0Var.f22381l0);
                                return;
                            }
                            return;
                        }
                        if (!dd0Var.f22383n0) {
                            dd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        dd0Var.f22383n0 = (byte) (!dd0Var.f22383n0 ? 1 : 0);
                        dd0Var.invalidate(0, dd0Var.m0, dd0Var.getRight(), dd0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f22116b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        dd0Var.f22384o0 = true;
                        dd0Var.invalidate(0, 0, dd0Var.getRight(), dd0Var.f22381l0);
                        return;
                    }
                    return;
                }
                dd0Var.f22383n0 = true;
                dd0Var.invalidate(0, dd0Var.m0, dd0Var.getRight(), dd0Var.getBottom());
                return;
            default:
                org.telegram.ui.iz izVar = (org.telegram.ui.iz) this.d;
                int i13 = this.f22116b;
                int i14 = this.f22117c;
                vl0 vl0Var = izVar.H;
                if (izVar.f33819n) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < vl0Var.getChildCount()) {
                            View childAt = vl0Var.getChildAt(i15);
                            if (childAt instanceof org.telegram.ui.Cells.t1) {
                                t1Var = (org.telegram.ui.Cells.t1) childAt;
                                String stickerEmoji = t1Var.getMessageObject().getStickerEmoji();
                                if (stickerEmoji == null) {
                                    stickerEmoji = t1Var.getMessageObject().messageOwner.message;
                                }
                                if (t1Var.getPhotoImage().hasNotThumb() && stickerEmoji != null && t1Var.getMessageObject().getId() == i13) {
                                }
                            }
                            i15++;
                        } else {
                            t1Var = null;
                        }
                    }
                    if (t1Var != null && (eoVar = izVar.f33815a) != null) {
                        eoVar.Na(t1Var);
                        if (!EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                            try {
                                t1Var.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        izVar.o(t1Var, i14, false, true);
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
