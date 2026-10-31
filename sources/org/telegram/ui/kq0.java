package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
public final class kq0 extends org.telegram.ui.Components.nc {
    public final Path f38926s1;
    public final PhotoViewer f38927t1;

    public kq0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, fs0 fs0Var, org.telegram.ui.Components.uu0 uu0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.Components.s9 s9Var, qo0 qo0Var) {
        super(contextThemeWrapper, fs0Var, uu0Var, frameLayout, p6Var, s9Var, qo0Var);
        this.f38927t1 = photoViewer;
        this.f38926s1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.X(this.f38927t1);
    }

    @Override
    public final void B() {
        z();
        jq0 jq0Var = this.f38927t1.U1;
        if (jq0Var != null) {
            jq0Var.z();
        }
    }

    @Override
    public final boolean G() {
        es0 es0Var = this.f38927t1.d;
        if (es0Var != null && es0Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f38927t1;
        org.telegram.ui.Components.wb wbVar = photoViewer.f33555n7;
        if (wbVar != null && org.telegram.ui.Components.wb.f32128w == wbVar) {
            return false;
        }
        return photoViewer.W2(photoViewer.f33470e0);
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
        Path path = this.f38926s1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f38927t1;
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
        if (org.telegram.messenger.tz.f18138c0 && ((i10 = this.f38927t1.f33552n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f7, float f10) {
        if (!this.f51350o0 && this.f38927t1.f33615u4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w() {
        boolean z10 = true;
        this.M.setReversed(true);
        this.M.getAdapter().f55647c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        PhotoViewer photoViewer = this.f38927t1;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.f42374p8);
            zf.x0 adapter = this.M.getAdapter();
            if (photoViewer.l4.e == null) {
                z10 = false;
            }
            adapter.f55650e0 = z10;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().f55650e0 = false;
        }
        this.M.getAdapter().f55652f0 = false;
        this.M.setLayoutParams(w7.b6.e(-1, -1, 51));
    }

    @Override
    public final void x(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kq0.x(int):void");
    }

    @Override
    public final void y() {
        org.telegram.ui.Components.oh ohVar = this.M;
        if (ohVar != null) {
            ohVar.setTranslationY(getEditTextHeight());
        }
    }
}
