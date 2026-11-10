package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
public final class dp0 extends org.telegram.ui.Components.tc {
    public final Path f45033s1;
    public final PhotoViewer f45034t1;

    public dp0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, yq0 yq0Var, org.telegram.ui.Components.st0 st0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.x9 x9Var, fn0 fn0Var) {
        super(contextThemeWrapper, yq0Var, st0Var, frameLayout, h6Var, x9Var, fn0Var);
        this.f45034t1 = photoViewer;
        this.f45033s1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.O(this.f45034t1);
    }

    @Override
    public final void B() {
        z();
        cp0 cp0Var = this.f45034t1.U1;
        if (cp0Var != null) {
            cp0Var.z();
        }
    }

    @Override
    public final boolean G() {
        xq0 xq0Var = this.f45034t1.d;
        if (xq0Var != null && xq0Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f45034t1;
        org.telegram.ui.Components.bc bcVar = photoViewer.f41457m7;
        if (bcVar != null && org.telegram.ui.Components.bc.f32195w == bcVar) {
            return false;
        }
        return photoViewer.Q2(photoViewer.f41382e0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.ba baVar, Canvas canvas, RectF rectF, float f10, boolean z9, float f11, float f12, boolean z10) {
        int i7;
        int i10;
        boolean z11;
        canvas.save();
        Path path = this.f45033s1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f45034t1;
        if (z10) {
            canvas.translate(((-getX()) - photoViewer.Y1.getX()) + f11, ((-getY()) - photoViewer.Y1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        if (z9) {
            i7 = -8882056;
        } else {
            i7 = -14277082;
        }
        int r12 = org.telegram.ui.ActionBar.m6.r1(1.0f, i7);
        if (z10) {
            if (z9) {
                i10 = 0;
            } else {
                i10 = 855638016;
            }
        } else {
            i10 = 1140850688;
        }
        int r13 = org.telegram.ui.ActionBar.m6.r1(1.0f, i10);
        boolean z12 = !z9;
        if (!z9 && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        photoViewer.N0(canvas, baVar, r12, r13, false, z12, z11);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.iz.f23396c0 && ((i7 = this.f45034t1.f41454m4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        if (!this.f12377o0 && this.f45034t1.f41517t4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w() {
        boolean z9 = true;
        this.M.setReversed(true);
        this.M.getAdapter().f16776c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().f16779e = false;
        PhotoViewer photoViewer = this.f45034t1;
        if (photoViewer.f41438k4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.f41438k4.f44620p8);
            jg.i1 adapter = this.M.getAdapter();
            if (photoViewer.f41438k4.f44473e == null) {
                z9 = false;
            }
            adapter.f16780e0 = z9;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().f16780e0 = false;
        }
        this.M.getAdapter().f16782f0 = false;
        this.M.setLayoutParams(c8.ha.e(-1, -1, 51));
    }

    @Override
    public final void x(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dp0.x(int):void");
    }

    @Override
    public final void y() {
        fi.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
