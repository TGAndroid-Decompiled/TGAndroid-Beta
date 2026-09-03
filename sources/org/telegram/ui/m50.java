package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class m50 implements org.telegram.ui.Components.w40 {
    public float f35980a;
    public TLRPC.FileLocation f35981b;
    public TLRPC.FileLocation f35982c;
    public ImageLocation d;
    public final long e;
    public final e60 f35983f;

    public m50(e60 e60Var, long j10) {
        this.f35983f = e60Var;
        this.e = j10;
    }

    @Override
    public final void D(float f10) {
        this.f35983f.f33620b.O(this.d, f10);
        a(f10);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ed(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 2));
    }

    public final void a(float f10) {
        this.f35980a = f10;
        l50 l50Var = this.f35983f.N;
        if (l50Var != null) {
            for (int i10 = 0; i10 < l50Var.getChildCount(); i10++) {
                View childAt = l50Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.d4) {
                    org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                    if (d4Var.c()) {
                        org.telegram.ui.Cells.x3 x3Var = d4Var.f20928x;
                        x3Var.setProgress(f10);
                        if (f10 < 1.0f) {
                            AndroidUtilities.updateViewVisibilityAnimated(x3Var, true, 1.0f, true);
                        } else {
                            AndroidUtilities.updateViewVisibilityAnimated(x3Var, false, 1.0f, true);
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
    public final void P() {
    }

    @Override
    public final void K(boolean z4, boolean z10) {
    }
}
