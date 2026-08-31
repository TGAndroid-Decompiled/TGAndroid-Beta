package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class l50 implements org.telegram.ui.Components.x40 {
    public float f38640a;
    public TLRPC.FileLocation f38641b;
    public TLRPC.FileLocation f38642c;
    public ImageLocation d;
    public final long f38643e;
    public final d60 f38644f;

    public l50(d60 d60Var, long j10) {
        this.f38644f = d60Var;
        this.f38643e = j10;
    }

    @Override
    public final void D(float f10) {
        this.f38644f.f36014b.O(this.d, f10);
        a(f10);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new cd(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 2));
    }

    public final void a(float f10) {
        this.f38640a = f10;
        k50 k50Var = this.f38644f.N;
        if (k50Var != null) {
            for (int i10 = 0; i10 < k50Var.getChildCount(); i10++) {
                View childAt = k50Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.e4) {
                    org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                    if (e4Var.c()) {
                        org.telegram.ui.Cells.y3 y3Var = e4Var.f22751x;
                        y3Var.setProgress(f10);
                        if (f10 < 1.0f) {
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
