package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class l30 implements org.telegram.ui.Components.i30 {
    public float f47400a;
    public TLRPC.FileLocation f47401b;
    public TLRPC.FileLocation f47402c;
    public org.telegram.messenger.hc d;
    public final long f47403e;
    public final c40 f47404f;

    public l30(c40 c40Var, long j3) {
        this.f47404f = c40Var;
        this.f47403e = j3;
    }

    @Override
    public final void H(float f10) {
        this.f47404f.f44579i1.O(this.d, f10);
        a(f10);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ii.l(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f10) {
        this.f47400a = f10;
        k30 k30Var = this.f47404f.H1;
        if (k30Var != null) {
            for (int i7 = 0; i7 < k30Var.getChildCount(); i7++) {
                View childAt = k30Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.f4) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                    if (f4Var.c()) {
                        org.telegram.ui.Cells.b4 b4Var = f4Var.f29117y;
                        b4Var.setProgress(f10);
                        if (f10 < 1.0f) {
                            org.telegram.messenger.g0.Z3(b4Var, true, 1.0f, true, true);
                        } else {
                            org.telegram.messenger.g0.Z3(b4Var, false, 1.0f, true, true);
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
    public final void T() {
    }

    @Override
    public final void O(boolean z9, boolean z10) {
    }
}
