package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j40 implements org.telegram.ui.Components.a40 {
    public float f38423a;
    public TLRPC.FileLocation f38424b;
    public TLRPC.FileLocation f38425c;
    public org.telegram.messenger.ic d;
    public final long e;
    public final b50 f38426f;

    public j40(b50 b50Var, long j10) {
        this.f38426f = b50Var;
        this.e = j10;
    }

    @Override
    public final void H(float f7) {
        this.f38426f.f36026i1.O(this.d, f7);
        a(f7);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new ed(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 2));
    }

    public final void a(float f7) {
        this.f38423a = f7;
        i40 i40Var = this.f38426f.H1;
        if (i40Var != null) {
            for (int i10 = 0; i10 < i40Var.getChildCount(); i10++) {
                View childAt = i40Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.h4) {
                    org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) childAt;
                    if (h4Var.c()) {
                        org.telegram.ui.Cells.d4 d4Var = h4Var.f21987y;
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
    public final gs0 getCloseIntoObject() {
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
    public final void O(boolean z10, boolean z11) {
    }
}
