package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class l30 implements org.telegram.ui.Components.l30 {
    public float f48819a;
    public TLRPC.FileLocation f48820b;
    public TLRPC.FileLocation f48821c;
    public org.telegram.messenger.gc d;
    public final long f48822e;
    public final c40 f48823f;

    public l30(c40 c40Var, long j3) {
        this.f48823f = c40Var;
        this.f48822e = j3;
    }

    @Override
    public final void I(float f10) {
        this.f48823f.f45942m1.O(this.d, f10);
        a(f10);
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new li.j(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f10) {
        this.f48819a = f10;
        k30 k30Var = this.f48823f.L1;
        if (k30Var != null) {
            for (int i7 = 0; i7 < k30Var.getChildCount(); i7++) {
                View childAt = k30Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.f4) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                    if (f4Var.c()) {
                        org.telegram.ui.Cells.b4 b4Var = f4Var.f30232y;
                        b4Var.setProgress(f10);
                        if (f10 < 1.0f) {
                            org.telegram.messenger.g0.Y3(b4Var, true, 1.0f, true, true);
                        } else {
                            org.telegram.messenger.g0.Y3(b4Var, false, 1.0f, true, true);
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
    public final uq0 getCloseIntoObject() {
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
    public final void O(boolean z10, boolean z11) {
    }
}
