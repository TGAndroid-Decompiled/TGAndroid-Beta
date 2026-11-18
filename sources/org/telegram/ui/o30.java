package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class o30 implements org.telegram.ui.Components.t30 {
    public float f50437a;
    public TLRPC.FileLocation f50438b;
    public TLRPC.FileLocation f50439c;
    public org.telegram.messenger.fc d;
    public final long f50440e;
    public final f40 f50441f;

    public o30(f40 f40Var, long j3) {
        this.f50441f = f40Var;
        this.f50440e = j3;
    }

    @Override
    public final void I(float f10) {
        this.f50441f.f47489m1.O(this.d, f10);
        a(f10);
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new li.l(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f10) {
        this.f50437a = f10;
        n30 n30Var = this.f50441f.L1;
        if (n30Var != null) {
            for (int i7 = 0; i7 < n30Var.getChildCount(); i7++) {
                View childAt = n30Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.f4) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                    if (f4Var.c()) {
                        org.telegram.ui.Cells.b4 b4Var = f4Var.f30608y;
                        b4Var.setProgress(f10);
                        if (f10 < 1.0f) {
                            org.telegram.messenger.g0.X3(b4Var, true, 1.0f, true, true);
                        } else {
                            org.telegram.messenger.g0.X3(b4Var, false, 1.0f, true, true);
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
    public final wq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void U() {
    }

    @Override
    public final void Q(boolean z10, boolean z11) {
    }
}
