package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class k50 implements org.telegram.ui.Components.v40 {
    public float f35572a;
    public TLRPC.FileLocation f35573b;
    public TLRPC.FileLocation f35574c;
    public ImageLocation d;
    public final long e;
    public final c60 f35575f;

    public k50(c60 c60Var, long j10) {
        this.f35575f = c60Var;
        this.e = j10;
    }

    @Override
    public final void D(float f10) {
        this.f35575f.f33101b.O(this.d, f10);
        a(f10);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new cd(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 2));
    }

    public final void a(float f10) {
        this.f35572a = f10;
        j50 j50Var = this.f35575f.N;
        if (j50Var != null) {
            for (int i10 = 0; i10 < j50Var.getChildCount(); i10++) {
                View childAt = j50Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.e4) {
                    org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                    if (e4Var.c()) {
                        org.telegram.ui.Cells.y3 y3Var = e4Var.f21011x;
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
    public final ju0 getCloseIntoObject() {
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
    public final void I(boolean z4, boolean z10) {
    }
}
