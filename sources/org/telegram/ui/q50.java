package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class q50 implements org.telegram.ui.Components.t40 {
    public float f39731a;
    public TLRPC.FileLocation f39732b;
    public TLRPC.FileLocation f39733c;
    public ImageLocation d;
    public final long f39734e;
    public final j60 f39735f;

    public q50(j60 j60Var, long j3) {
        this.f39735f = j60Var;
        this.f39734e = j3;
    }

    @Override
    public final void C(float f7) {
        this.f39735f.f37515b.O(this.d, f7);
        a(f7);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new gi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f7) {
        this.f39731a = f7;
        p50 p50Var = this.f39735f.Q;
        if (p50Var != null) {
            for (int i10 = 0; i10 < p50Var.getChildCount(); i10++) {
                View childAt = p50Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.d4) {
                    org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                    if (d4Var.c()) {
                        org.telegram.ui.Cells.y3 y3Var = d4Var.f21742x;
                        y3Var.setProgress(f7);
                        if (f7 < 1.0f) {
                            AndroidUtilities.updateViewVisibilityAnimated(y3Var, true, 1.0f, true);
                        } else {
                            AndroidUtilities.updateViewVisibilityAnimated(y3Var, false, 1.0f, true);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final cv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void P() {
    }

    @Override
    public final void L(boolean z10, boolean z11) {
    }
}
