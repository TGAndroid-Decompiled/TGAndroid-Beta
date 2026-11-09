package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
public final class cp0 extends org.telegram.ui.Components.uc {
    public final Path f44733s1;
    public final PhotoViewer f44734t1;

    public cp0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, xq0 xq0Var, org.telegram.ui.Components.tt0 tt0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.y9 y9Var, en0 en0Var) {
        super(contextThemeWrapper, xq0Var, tt0Var, frameLayout, g6Var, y9Var, en0Var);
        this.f44734t1 = photoViewer;
        this.f44733s1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.O(this.f44734t1);
    }

    @Override
    public final void B() {
        z();
        bp0 bp0Var = this.f44734t1.U1;
        if (bp0Var != null) {
            bp0Var.z();
        }
    }

    @Override
    public final boolean G() {
        wq0 wq0Var = this.f44734t1.d;
        if (wq0Var != null && wq0Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f44734t1;
        org.telegram.ui.Components.cc ccVar = photoViewer.f41466m7;
        if (ccVar != null && org.telegram.ui.Components.cc.f32619w == ccVar) {
            return false;
        }
        return photoViewer.Q2(photoViewer.f41391e0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.ca caVar, Canvas canvas, RectF rectF, float f10, boolean z9, float f11, float f12, boolean z10) {
        int i7;
        int i10;
        boolean z11;
        canvas.save();
        Path path = this.f44733s1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f44734t1;
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
        int r12 = org.telegram.ui.ActionBar.l6.r1(1.0f, i7);
        if (z10) {
            if (z9) {
                i10 = 0;
            } else {
                i10 = 855638016;
            }
        } else {
            i10 = 1140850688;
        }
        int r13 = org.telegram.ui.ActionBar.l6.r1(1.0f, i10);
        boolean z12 = !z9;
        if (!z9 && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        photoViewer.N0(canvas, caVar, r12, r13, false, z12, z11);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.iz.f23392c0 && ((i7 = this.f44734t1.f41463m4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        if (!this.f12376o0 && this.f44734t1.f41526t4 != 0) {
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
        PhotoViewer photoViewer = this.f44734t1;
        if (photoViewer.f41447k4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.f41447k4.f44579p8);
            jg.i1 adapter = this.M.getAdapter();
            if (photoViewer.f41447k4.f44432e == null) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cp0.x(int):void");
    }

    @Override
    public final void y() {
        fi.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
