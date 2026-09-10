package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class q50 implements org.telegram.ui.Components.d50 {
    public float f35971a;
    public TLRPC.FileLocation f35972b;
    public TLRPC.FileLocation f35973c;
    public ImageLocation d;
    public final long e;
    public final j60 f35974f;

    public q50(j60 j60Var, long j3) {
        this.f35974f = j60Var;
        this.e = j3;
    }

    @Override
    public final void C(float f7) {
        this.f35974f.f33938b.O(this.d, f7);
        a(f7);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ei.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f7) {
        this.f35971a = f7;
        p50 p50Var = this.f35974f.Q;
        if (p50Var != null) {
            for (int i10 = 0; i10 < p50Var.getChildCount(); i10++) {
                View childAt = p50Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.d4) {
                    org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                    if (d4Var.c()) {
                        org.telegram.ui.Cells.y3 y3Var = d4Var.f18995x;
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
    public final ev0 getCloseIntoObject() {
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
    public final void P() {
    }

    @Override
    public final void K(boolean z10, boolean z11) {
    }
}
