package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i40 implements org.telegram.ui.Components.a40 {
    public float f37933a;
    public TLRPC.FileLocation f37934b;
    public TLRPC.FileLocation f37935c;
    public org.telegram.messenger.jc d;
    public final long e;
    public final a50 f37936f;

    public i40(a50 a50Var, long j10) {
        this.f37936f = a50Var;
        this.e = j10;
    }

    @Override
    public final void I(float f7) {
        this.f37936f.f35610i1.O(this.d, f7);
        a(f7);
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new ed(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 2));
    }

    public final void a(float f7) {
        this.f37933a = f7;
        h40 h40Var = this.f37936f.H1;
        if (h40Var != null) {
            for (int i10 = 0; i10 < h40Var.getChildCount(); i10++) {
                View childAt = h40Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.h4) {
                    org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) childAt;
                    if (h4Var.c()) {
                        org.telegram.ui.Cells.d4 d4Var = h4Var.f21988y;
                        d4Var.setProgress(f7);
                        if (f7 < 1.0f) {
                            org.telegram.messenger.i0.Y3(d4Var, true, 1.0f, true, true);
                        } else {
                            org.telegram.messenger.i0.Y3(d4Var, false, 1.0f, true, true);
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
    public final fs0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean y() {
        return false;
    }

    @Override
    public final void U() {
    }

    @Override
    public final void P(boolean z10, boolean z11) {
    }
}
