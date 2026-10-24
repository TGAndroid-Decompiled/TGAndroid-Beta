package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class b50 implements org.telegram.ui.Components.b50 {
    public float f35927a;
    public TLRPC.FileLocation f35928b;
    public TLRPC.FileLocation f35929c;
    public ImageLocation d;
    public final long e;
    public final u50 f35930f;

    public b50(u50 u50Var, long j10) {
        this.f35930f = u50Var;
        this.e = j10;
    }

    @Override
    public final void E(float f7) {
        this.f35930f.f42219b.O(this.d, f7);
        a(f7);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new hi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f7) {
        this.f35927a = f7;
        z40 z40Var = this.f35930f.Q;
        if (z40Var != null) {
            for (int i10 = 0; i10 < z40Var.getChildCount(); i10++) {
                View childAt = z40Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.d4) {
                    org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                    if (d4Var.c()) {
                        org.telegram.ui.Cells.y3 y3Var = d4Var.f22273x;
                        y3Var.setProgress(f7);
                        if (f7 < 1.0f) {
                            AndroidUtilities.updateViewVisibilityAnimated(y3Var, true, 1.0f, true);
                        } else {
                            AndroidUtilities.updateViewVisibilityAnimated(y3Var, false, 1.0f, true);
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
    public final lu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void P() {
    }

    @Override
    public final void K(boolean z10, boolean z11) {
    }
}
