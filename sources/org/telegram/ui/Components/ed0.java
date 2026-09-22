package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.EmojiData;
public final class ed0 implements Runnable {
    public final int f23938a = 0;
    public int f23939b;
    public int f23940c;
    public final Object d;

    public ed0(org.telegram.ui.gz gzVar, int i10, int i11) {
        this.d = gzVar;
        this.f23939b = i10;
        this.f23940c = i11;
    }

    public void a() {
        this.f23940c = 0;
        this.f23939b = 0;
        fd0 fd0Var = (fd0) this.d;
        fd0Var.removeCallbacks(this);
        if (fd0Var.f24192n0) {
            fd0Var.f24192n0 = false;
            fd0Var.invalidate(0, fd0Var.m0, fd0Var.getRight(), fd0Var.getBottom());
        }
        fd0Var.f24193o0 = false;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.zn znVar;
        switch (this.f23938a) {
            case 0:
                fd0 fd0Var = (fd0) this.d;
                int i10 = this.f23940c;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = this.f23939b;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (!fd0Var.f24193o0) {
                                    fd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                                }
                                fd0Var.f24193o0 = (byte) (!fd0Var.f24193o0 ? 1 : 0);
                                fd0Var.invalidate(0, 0, fd0Var.getRight(), fd0Var.f24190l0);
                                return;
                            }
                            return;
                        }
                        if (!fd0Var.f24192n0) {
                            fd0Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        fd0Var.f24192n0 = (byte) (!fd0Var.f24192n0 ? 1 : 0);
                        fd0Var.invalidate(0, fd0Var.m0, fd0Var.getRight(), fd0Var.getBottom());
                        return;
                    }
                    return;
                }
                int i12 = this.f23939b;
                if (i12 != 1) {
                    if (i12 == 2) {
                        fd0Var.f24193o0 = true;
                        fd0Var.invalidate(0, 0, fd0Var.getRight(), fd0Var.f24190l0);
                        return;
                    }
                    return;
                }
                fd0Var.f24192n0 = true;
                fd0Var.invalidate(0, fd0Var.m0, fd0Var.getRight(), fd0Var.getBottom());
                return;
            default:
                org.telegram.ui.gz gzVar = (org.telegram.ui.gz) this.d;
                int i13 = this.f23939b;
                int i14 = this.f23940c;
                yl0 yl0Var = gzVar.H;
                if (gzVar.f34025n) {
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
                    if (u1Var != null && (znVar = gzVar.f34021a) != null) {
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

    public ed0(fd0 fd0Var) {
        this.d = fd0Var;
    }
}
