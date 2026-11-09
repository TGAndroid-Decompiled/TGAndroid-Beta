package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n30 implements org.telegram.ui.Components.j30 {
    public float f48069a;
    public TLRPC.FileLocation f48070b;
    public TLRPC.FileLocation f48071c;
    public org.telegram.messenger.hc d;
    public final long f48072e;
    public final e40 f48073f;

    public n30(e40 e40Var, long j3) {
        this.f48073f = e40Var;
        this.f48072e = j3;
    }

    @Override
    public final void H(float f10) {
        this.f48073f.f45219i1.O(this.d, f10);
        a(f10);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ii.l(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f10) {
        this.f48069a = f10;
        m30 m30Var = this.f48073f.H1;
        if (m30Var != null) {
            for (int i7 = 0; i7 < m30Var.getChildCount(); i7++) {
                View childAt = m30Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.f4) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                    if (f4Var.c()) {
                        org.telegram.ui.Cells.b4 b4Var = f4Var.f29121y;
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
    public final yq0 getCloseIntoObject() {
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
