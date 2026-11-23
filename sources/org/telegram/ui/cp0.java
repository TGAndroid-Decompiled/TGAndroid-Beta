package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
public final class cp0 extends org.telegram.ui.Components.yc {
    public final Path f46619t1;
    public final PhotoViewer f46620u1;

    public cp0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, wq0 wq0Var, org.telegram.ui.Components.du0 du0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.ca caVar, hn0 hn0Var) {
        super(contextThemeWrapper, wq0Var, du0Var, frameLayout, h6Var, caVar, hn0Var);
        this.f46620u1 = photoViewer;
        this.f46619t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.P(this.f46620u1);
    }

    @Override
    public final void B() {
        z();
        bp0 bp0Var = this.f46620u1.V1;
        if (bp0Var != null) {
            bp0Var.z();
        }
    }

    @Override
    public final boolean G() {
        vq0 vq0Var = this.f46620u1.d;
        if (vq0Var != null && vq0Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f46620u1;
        org.telegram.ui.Components.gc gcVar = photoViewer.f43292n7;
        if (gcVar != null && org.telegram.ui.Components.gc.f35481w == gcVar) {
            return false;
        }
        return photoViewer.R2(photoViewer.f43218f0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.ga gaVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        int i7;
        int i10;
        boolean z12;
        canvas.save();
        Path path = this.f46619t1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f46620u1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.Z1.getX()) + f11, ((-getY()) - photoViewer.Z1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        if (z10) {
            i7 = -8882056;
        } else {
            i7 = -14277082;
        }
        int r12 = org.telegram.ui.ActionBar.m6.r1(1.0f, i7);
        if (z11) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 855638016;
            }
        } else {
            i10 = 1140850688;
        }
        int r13 = org.telegram.ui.ActionBar.m6.r1(1.0f, i10);
        boolean z13 = !z10;
        if (!z10 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        photoViewer.N0(canvas, gaVar, r12, r13, false, z13, z12);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.cz.f23361c0 && ((i7 = this.f46620u1.f43289n4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        if (!this.f14982p0 && this.f46620u1.f43351u4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w() {
        boolean z10 = true;
        this.N.setReversed(true);
        this.N.getAdapter().f17496c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().f17499e = false;
        PhotoViewer photoViewer = this.f46620u1;
        if (photoViewer.f43272l4 != null) {
            this.N.getAdapter().f17510n0 = false;
            this.N.getAdapter().W(photoViewer.f43272l4.f46134r8);
            jg.h1 adapter = this.N.getAdapter();
            if (photoViewer.f43272l4.f45958e == null) {
                z10 = false;
            }
            adapter.f17502f0 = z10;
        } else {
            this.N.getAdapter().f17510n0 = true;
            this.N.getAdapter().W(null);
            this.N.getAdapter().f17502f0 = false;
        }
        this.N.getAdapter().f17503g0 = false;
        this.N.setLayoutParams(c8.na.e(-1, -1, 51));
    }

    @Override
    public final void x(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cp0.x(int):void");
    }

    @Override
    public final void y() {
        hi.i iVar = this.N;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
