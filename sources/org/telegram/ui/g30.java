package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g30 implements org.telegram.ui.Components.e30 {
    public float f45507a;
    public TLRPC.FileLocation f45508b;
    public TLRPC.FileLocation f45509c;
    public org.telegram.messenger.ac d;
    public final long f45510e;
    public final x30 f45511f;

    public g30(x30 x30Var, long j10) {
        this.f45511f = x30Var;
        this.f45510e = j10;
    }

    @Override
    public final void H(float f10) {
        this.f45511f.f51750j1.O(this.d, f10);
        a(f10);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ji.j(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f10) {
        this.f45507a = f10;
        f30 f30Var = this.f45511f.I1;
        if (f30Var != null) {
            for (int i3 = 0; i3 < f30Var.getChildCount(); i3++) {
                View childAt = f30Var.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.f4) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                    if (f4Var.c()) {
                        org.telegram.ui.Cells.b4 b4Var = f4Var.f29173y;
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
    public final mq0 getCloseIntoObject() {
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
