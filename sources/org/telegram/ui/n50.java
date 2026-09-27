package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class n50 implements org.telegram.ui.Components.w40 {
    public float f35815a;
    public TLRPC.FileLocation f35816b;
    public TLRPC.FileLocation f35817c;
    public ImageLocation d;
    public final long e;
    public final g60 f35818f;

    public n50(g60 g60Var, long j3) {
        this.f35818f = g60Var;
        this.e = j3;
    }

    @Override
    public final void B(float f7) {
        this.f35818f.f33728b.O(this.d, f7);
        a(f7);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new fi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f7) {
        this.f35815a = f7;
        m50 m50Var = this.f35818f.Q;
        if (m50Var != null) {
            for (int i10 = 0; i10 < m50Var.getChildCount(); i10++) {
                View childAt = m50Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.e4) {
                    org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                    if (e4Var.c()) {
                        org.telegram.ui.Cells.z3 z3Var = e4Var.f20240x;
                        z3Var.setProgress(f7);
                        if (f7 < 1.0f) {
                            AndroidUtilities.updateViewVisibilityAnimated(z3Var, true, 1.0f, true);
                        } else {
                            AndroidUtilities.updateViewVisibilityAnimated(z3Var, false, 1.0f, true);
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
    public final yu0 getCloseIntoObject() {
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
