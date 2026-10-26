package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class c50 implements org.telegram.ui.Components.f50 {
    public float f38269a;
    public TLRPC.FileLocation f38270b;
    public TLRPC.FileLocation f38271c;
    public ImageLocation d;
    public final long e;
    public final v50 f38272f;

    public c50(v50 v50Var, long j10) {
        this.f38272f = v50Var;
        this.e = j10;
    }

    @Override
    public final void F(float f7) {
        this.f38272f.f44612b.O(this.d, f7);
        a(f7);
    }

    @Override
    public final void R(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ii.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f7) {
        this.f38269a = f7;
        b50 b50Var = this.f38272f.Q;
        if (b50Var != null) {
            for (int i10 = 0; i10 < b50Var.getChildCount(); i10++) {
                View childAt = b50Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.i4) {
                    org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) childAt;
                    if (i4Var.c()) {
                        org.telegram.ui.Cells.d4 d4Var = i4Var.f24235x;
                        d4Var.setProgress(f7);
                        if (f7 < 1.0f) {
                            AndroidUtilities.updateViewVisibilityAnimated(d4Var, true, 1.0f, true);
                        } else {
                            AndroidUtilities.updateViewVisibilityAnimated(d4Var, false, 1.0f, true);
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
    public final qu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void Q() {
    }

    @Override
    public final void L(boolean z10, boolean z11) {
    }
}
