package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n30 implements org.telegram.ui.Components.t30 {
    public float f50183a;
    public TLRPC.FileLocation f50184b;
    public TLRPC.FileLocation f50185c;
    public org.telegram.messenger.fc d;
    public final long f50186e;
    public final e40 f50187f;

    public n30(e40 e40Var, long j3) {
        this.f50187f = e40Var;
        this.f50186e = j3;
    }

    @Override
    public final void H(float f10) {
        this.f50187f.f47367m1.O(this.d, f10);
        a(f10);
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new li.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f10) {
        this.f50183a = f10;
        m30 m30Var = this.f50187f.L1;
        if (m30Var != null) {
            for (int i7 = 0; i7 < m30Var.getChildCount(); i7++) {
                View childAt = m30Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) childAt;
                    if (g4Var.c()) {
                        org.telegram.ui.Cells.c4 c4Var = g4Var.f30753y;
                        c4Var.setProgress(f10);
                        if (f10 < 1.0f) {
                            org.telegram.messenger.g0.X3(c4Var, true, 1.0f, true, true);
                        } else {
                            org.telegram.messenger.g0.X3(c4Var, false, 1.0f, true, true);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final boolean f() {
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
    public final void P(boolean z10, boolean z11) {
    }
}
