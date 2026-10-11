package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public final class bt0 extends org.telegram.ui.Components.od {
    public final Path f36456t1;
    public final PhotoViewer f36457u1;

    public bt0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, cv0 cv0Var, org.telegram.ui.Components.uw0 uw0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.la laVar, hr0 hr0Var) {
        super(contextThemeWrapper, cv0Var, uw0Var, frameLayout, d6Var, laVar, hr0Var);
        this.f36457u1 = photoViewer;
        this.f36456t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f36457u1);
    }

    @Override
    public final void B() {
        z();
        at0 at0Var = this.f36457u1.U1;
        if (at0Var != null) {
            at0Var.z();
        }
    }

    @Override
    public final boolean G() {
        bv0 bv0Var = this.f36457u1.d;
        if (bv0Var != null && bv0Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f36457u1;
        org.telegram.ui.Components.sc scVar = photoViewer.f34016n7;
        if (scVar != null && org.telegram.ui.Components.sc.f30703w == scVar) {
            return false;
        }
        return photoViewer.T2(photoViewer.f33932e0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.pa paVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        int i10;
        int i11;
        boolean z12;
        canvas.save();
        Path path = this.f36456t1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f36457u1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.Y1.getX()) + f10, ((-getY()) - photoViewer.Y1.getY()) + f11);
        } else {
            canvas.translate(f10, f11);
        }
        if (z10) {
            i10 = -8882056;
        } else {
            i10 = -14277082;
        }
        int m12 = org.telegram.ui.ActionBar.h6.m1(1.0f, i10);
        if (z11) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 855638016;
            }
        } else {
            i11 = 1140850688;
        }
        int m13 = org.telegram.ui.ActionBar.h6.m1(1.0f, i11);
        boolean z13 = !z10;
        if (!z10 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        photoViewer.T0(canvas, paVar, m12, m13, false, z13, z12);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f36457u1.f34013n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f7, float f10) {
        if (!this.f5565p0 && this.f36457u1.f34076u4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w() {
        boolean z10 = true;
        this.M.setReversed(true);
        this.M.getAdapter().f10667c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().f10670e = false;
        PhotoViewer photoViewer = this.f36457u1;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.Z7);
            gg.j1 adapter = this.M.getAdapter();
            if (photoViewer.l4.f44752e == null) {
                z10 = false;
            }
            adapter.f10671e0 = z10;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().f10671e0 = false;
        }
        this.M.getAdapter().f10673f0 = false;
        this.M.setLayoutParams(w7.x5.e(-1, -1, 51));
    }

    @Override
    public final void x(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bt0.x(int):void");
    }

    @Override
    public final void y() {
        ci.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
