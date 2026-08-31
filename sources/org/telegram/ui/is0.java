package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public final class is0 extends org.telegram.ui.Components.bd {
    public final Path f37924q1;
    public final PhotoViewer f37925r1;

    public is0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, ku0 ku0Var, org.telegram.ui.Components.qv0 qv0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.ba baVar, oq0 oq0Var) {
        super(contextThemeWrapper, ku0Var, qv0Var, frameLayout, g6Var, baVar, oq0Var);
        this.f37925r1 = photoViewer;
        this.f37924q1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f37925r1);
    }

    @Override
    public final void B() {
        z();
        hs0 hs0Var = this.f37925r1.R1;
        if (hs0Var != null) {
            hs0Var.z();
        }
    }

    @Override
    public final boolean G() {
        ju0 ju0Var = this.f37925r1.d;
        if (ju0Var != null && ju0Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f37925r1;
        org.telegram.ui.Components.ic icVar = photoViewer.f34319k7;
        if (icVar != null && org.telegram.ui.Components.ic.f27737w == icVar) {
            return false;
        }
        return photoViewer.T2(photoViewer.f34230b0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z4, float f11, float f12, boolean z10) {
        int i10;
        int i11;
        boolean z11;
        canvas.save();
        Path path = this.f37924q1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f37925r1;
        if (z10) {
            canvas.translate(((-getX()) - photoViewer.V1.getX()) + f11, ((-getY()) - photoViewer.V1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        if (z4) {
            i10 = -8882056;
        } else {
            i10 = -14277082;
        }
        int l1 = org.telegram.ui.ActionBar.k6.l1(1.0f, i10);
        if (z10) {
            if (z4) {
                i11 = 0;
            } else {
                i11 = 855638016;
            }
        } else {
            i11 = 1140850688;
        }
        int l12 = org.telegram.ui.ActionBar.k6.l1(1.0f, i11);
        boolean z12 = !z4;
        if (!z4 && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        photoViewer.T0(canvas, faVar, l1, l12, false, z12, z11);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f37925r1.f34316k4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        if (!this.m0 && this.f37925r1.f34379r4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w() {
        boolean z4 = true;
        this.J.setReversed(true);
        this.J.getAdapter().f48695c = false;
        this.J.getAdapter().d = false;
        this.J.getAdapter().f48698e = false;
        PhotoViewer photoViewer = this.f37925r1;
        if (photoViewer.f34298i4 != null) {
            this.J.getAdapter().f48705j0 = false;
            this.J.getAdapter().W(photoViewer.f34298i4.W7);
            uf.u0 adapter = this.J.getAdapter();
            if (photoViewer.f34298i4.f43165e == null) {
                z4 = false;
            }
            adapter.f48694b0 = z4;
        } else {
            this.J.getAdapter().f48705j0 = true;
            this.J.getAdapter().W(null);
            this.J.getAdapter().f48694b0 = false;
        }
        this.J.getAdapter().f48696c0 = false;
        this.J.setLayoutParams(k7.c6.e(-1, -1, 51));
    }

    @Override
    public final void x(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.is0.x(int):void");
    }

    @Override
    public final void y() {
        org.telegram.ui.Components.zh zhVar = this.J;
        if (zhVar != null) {
            zhVar.setTranslationY(getEditTextHeight());
        }
    }
}
