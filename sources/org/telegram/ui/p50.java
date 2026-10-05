package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class p50 implements org.telegram.ui.Components.x40 {
    public float f39355a;
    public TLRPC.FileLocation f39356b;
    public TLRPC.FileLocation f39357c;
    public ImageLocation d;
    public final long f39358e;
    public final h60 f39359f;

    public p50(h60 h60Var, long j3) {
        this.f39359f = h60Var;
        this.f39358e = j3;
    }

    @Override
    public final void B(float f7) {
        this.f39359f.f36908b.O(this.d, f7);
        a(f7);
    }

    @Override
    public final void O(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new fi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f7) {
        this.f39355a = f7;
        o50 o50Var = this.f39359f.Q;
        if (o50Var != null) {
            for (int i10 = 0; i10 < o50Var.getChildCount(); i10++) {
                View childAt = o50Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.e4) {
                    org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                    if (e4Var.c()) {
                        org.telegram.ui.Cells.z3 z3Var = e4Var.f22038x;
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
    public final void N() {
    }

    @Override
    public final void I(boolean z10, boolean z11) {
    }
}
