package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;

public final class as0 extends org.telegram.ui.Components.xc {

    public final Path f36632p1;

    public final PhotoViewer f36633q1;

    public as0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, bu0 bu0Var, org.telegram.ui.Components.zu0 zu0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.z9 z9Var, hq0 hq0Var) {
        super(contextThemeWrapper, bu0Var, zu0Var, frameLayout, c6Var, z9Var, hq0Var);
        this.f36633q1 = photoViewer;
        this.f36632p1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f36633q1);
    }

    @Override
    public final void B() {
        z();
        zr0 zr0Var = this.f36633q1.Q1;
        if (zr0Var != null) {
            zr0Var.z();
        }
    }

    @Override
    public final boolean G() {
        au0 au0Var = this.f36633q1.d;
        return au0Var != null && au0Var.l();
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f36633q1;
        org.telegram.ui.Components.ec ecVar = photoViewer.f35673j7;
        if (ecVar == null || org.telegram.ui.Components.ec.f28012w != ecVar) {
            return photoViewer.T2(photoViewer.f35583a0);
        }
        return false;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.da daVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        int i10;
        canvas.save();
        Path path = this.f36632p1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f36633q1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.U1.getX()) + f11, ((-getY()) - photoViewer.U1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        int iL1 = org.telegram.ui.ActionBar.g6.l1(1.0f, z10 ? -8882056 : -14277082);
        if (z11) {
            i10 = z10 ? 0 : 855638016;
        } else {
            i10 = 1140850688;
        }
        photoViewer.T0(canvas, daVar, iL1, org.telegram.ui.ActionBar.g6.l1(1.0f, i10), false, !z10, !z10 && z11);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f36633q1.f35670j4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        return (this.f16345l0 || this.f36633q1.f35731q4 == 0) ? false : true;
    }

    @Override
    public final void w() {
        this.I.setReversed(true);
        this.I.getAdapter().f45923c = false;
        this.I.getAdapter().d = false;
        this.I.getAdapter().f45926e = false;
        PhotoViewer photoViewer = this.f36633q1;
        if (photoViewer.f35652h4 != null) {
            this.I.getAdapter().f45932i0 = false;
            this.I.getAdapter().W(photoViewer.f35652h4.V7);
            this.I.getAdapter().f45921a0 = photoViewer.f35652h4.f42026e != null;
        } else {
            this.I.getAdapter().f45932i0 = true;
            this.I.getAdapter().W(null);
            this.I.getAdapter().f45921a0 = false;
        }
        this.I.getAdapter().f45922b0 = false;
        this.I.setLayoutParams(h7.z5.e(-1, -1, 51));
    }

    @Override
    public final void x(int i10) {
        float f10;
        boolean z10;
        PhotoViewer photoViewer = this.f36633q1;
        super.x(i10 - photoViewer.f35712o2.bottom);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = photoViewer.B.animate();
        if (photoViewer.F) {
            org.telegram.ui.Components.xc xcVarF1 = photoViewer.f1();
            as0 as0Var = photoViewer.R1;
            if (xcVarF1 == as0Var && as0Var.H.c()) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
        } else {
            f10 = 0.0f;
        }
        viewPropertyAnimatorAnimate.alpha(f10).start();
        if (photoViewer.L0.getVisibility() == 0) {
            if (photoViewer.F) {
                org.telegram.ui.Components.xc xcVarF2 = photoViewer.f1();
                as0 as0Var2 = photoViewer.R1;
                if (xcVarF2 == as0Var2 && as0Var2.H.c()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            photoViewer.o3(z10);
        }
    }

    @Override
    public final void y() {
        lh.i iVar = this.I;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
