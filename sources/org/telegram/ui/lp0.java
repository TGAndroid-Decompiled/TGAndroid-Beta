package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
public final class lp0 extends ug.f0 {
    public final PhotoViewer Y1;

    public lp0(PhotoViewer photoViewer, Context context, Activity activity, int i3, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, org.telegram.messenger.re reVar, xm0 xm0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, activity, i3, bitmap, bitmap2, i10, arrayList, reVar, xm0Var, e6Var);
        this.Y1 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        gi.p3 p3Var = this.Y1.L1;
        if (p3Var != null) {
            return p3Var.f13367l;
        }
        return 0;
    }

    @Override
    public final void o0(boolean z10) {
        PhotoViewer photoViewer = this.Y1;
        if (photoViewer.G2 != null) {
            photoViewer.I2 = false;
            photoViewer.v0();
            if (z10) {
                photoViewer.G2.g0();
            } else if (photoViewer.K4 && photoViewer.T1() && photoViewer.f41402d2 != 1) {
            } else {
                photoViewer.G2.h0();
            }
        }
    }
}
