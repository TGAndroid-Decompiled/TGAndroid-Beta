package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class hq0 extends org.telegram.ui.Components.nc {
    public final Path f37850s1;
    public final PhotoViewer f37851t1;

    public hq0(PhotoViewer photoViewer, Context context, es0 es0Var, org.telegram.ui.Components.vu0 vu0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.Components.s9 s9Var, oo0 oo0Var) {
        super(context, es0Var, vu0Var, frameLayout, p6Var, s9Var, oo0Var);
        this.f37851t1 = photoViewer;
        this.f37850s1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.X(this.f37851t1);
    }

    @Override
    public final void B() {
        z();
        iq0 iq0Var = this.f37851t1.V1;
        if (iq0Var != null) {
            iq0Var.z();
        }
    }

    @Override
    public final boolean G() {
        ds0 ds0Var = this.f37851t1.d;
        if (ds0Var != null && ds0Var.l()) {
            return true;
        }
        return false;
    }

    public final void I() {
        boolean z10;
        PhotoViewer photoViewer = this.f37851t1;
        ds0 ds0Var = photoViewer.d;
        if (ds0Var != null && ds0Var.l() && (photoViewer.U1.L.c() || (!photoViewer.f33591r1 && !TextUtils.isEmpty(photoViewer.h1().getText())))) {
            z10 = true;
        } else {
            z10 = false;
        }
        D(z10, true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f37851t1;
        org.telegram.ui.Components.wb wbVar = photoViewer.f33562n7;
        if (wbVar != null && org.telegram.ui.Components.wb.f32194w == wbVar) {
            return false;
        }
        return photoViewer.W2(photoViewer.f33477e0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.w9 w9Var, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        int i10;
        int i11;
        boolean z12;
        canvas.save();
        Path path = this.f37850s1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f37851t1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.X1.getX()) + f10, ((-getY()) - photoViewer.X1.getY()) + f11);
        } else {
            canvas.translate(f10, f11);
        }
        if (z10) {
            i10 = -8882056;
        } else {
            i10 = -14277082;
        }
        int r12 = org.telegram.ui.ActionBar.t6.r1(1.0f, i10);
        if (z11) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 855638016;
            }
        } else {
            i11 = 1140850688;
        }
        int r13 = org.telegram.ui.ActionBar.t6.r1(1.0f, i11);
        boolean z13 = !z10;
        if (!z10 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        photoViewer.U0(canvas, w9Var, r12, r13, false, z13, z12);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (org.telegram.messenger.uz.f18507c0 && ((i10 = this.f37851t1.f33559n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f7, float f10) {
        if (!this.f51365o0 && this.f37851t1.f33622u4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        I();
    }

    @Override
    public final void u(float f7) {
        int i10;
        int i11;
        super.u(f7);
        PhotoViewer photoViewer = this.f37851t1;
        org.telegram.ui.ActionBar.g0 g0Var = photoViewer.f33478e1;
        float f10 = 1.0f - f7;
        int i12 = 0;
        if (g0Var.getTag() != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        g0Var.setAlpha(i10 * f10);
        org.telegram.ui.Components.r80 r80Var = photoViewer.f33487f1;
        if (r80Var.getTag() != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        r80Var.setAlpha(i11 * f10);
        FrameLayout frameLayout = photoViewer.R7;
        if (frameLayout.getTag() != null) {
            i12 = 1;
        }
        frameLayout.setAlpha(f10 * i12);
    }

    @Override
    public final void w() {
        this.M.getAdapter().f55665c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        PhotoViewer photoViewer = this.f37851t1;
        boolean z10 = true;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.f42185p8);
            zf.x0 adapter = this.M.getAdapter();
            if (photoViewer.l4.e == null) {
                z10 = false;
            }
            adapter.f55668e0 = z10;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().f55668e0 = false;
        }
        this.M.getAdapter().f55670f0 = false;
    }

    @Override
    public final void x(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hq0.x(int):void");
    }

    @Override
    public final void y() {
        org.telegram.ui.Components.oh ohVar = this.M;
        if (ohVar != null) {
            ohVar.setTranslationY(((-getEditTextHeight()) - org.telegram.messenger.i0.L(14.0f)) - this.L.f51832l);
        }
    }
}
