package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class bp0 extends org.telegram.ui.Components.yc {
    public final Path f46259t1;
    public final PhotoViewer f46260u1;

    public bp0(PhotoViewer photoViewer, Context context, wq0 wq0Var, org.telegram.ui.Components.du0 du0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.ca caVar, hn0 hn0Var) {
        super(context, wq0Var, du0Var, frameLayout, h6Var, caVar, hn0Var);
        this.f46260u1 = photoViewer;
        this.f46259t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.P(this.f46260u1);
    }

    @Override
    public final void B() {
        z();
        cp0 cp0Var = this.f46260u1.W1;
        if (cp0Var != null) {
            cp0Var.z();
        }
    }

    @Override
    public final boolean G() {
        vq0 vq0Var = this.f46260u1.d;
        if (vq0Var != null && vq0Var.l()) {
            return true;
        }
        return false;
    }

    public final void I() {
        boolean z10;
        PhotoViewer photoViewer = this.f46260u1;
        vq0 vq0Var = photoViewer.d;
        if (vq0Var != null && vq0Var.l() && (photoViewer.V1.M.c() || (!photoViewer.f43332s1 && !TextUtils.isEmpty(photoViewer.b1().getText())))) {
            z10 = true;
        } else {
            z10 = false;
        }
        D(z10, true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f46260u1;
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
        Path path = this.f46259t1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f46260u1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.Y1.getX()) + f11, ((-getY()) - photoViewer.Y1.getY()) + f12);
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
        if (org.telegram.messenger.cz.f23361c0 && ((i7 = this.f46260u1.f43289n4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        if (!this.f14982p0 && this.f46260u1.f43351u4 != 0) {
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
    public final void u(float f10) {
        int i7;
        int i10;
        super.u(f10);
        PhotoViewer photoViewer = this.f46260u1;
        org.telegram.ui.ActionBar.f0 f0Var = photoViewer.f43219f1;
        float f11 = 1.0f - f10;
        int i11 = 0;
        if (f0Var.getTag() != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        f0Var.setAlpha(i7 * f11);
        org.telegram.ui.Components.o80 o80Var = photoViewer.f43228g1;
        if (o80Var.getTag() != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        o80Var.setAlpha(i10 * f11);
        FrameLayout frameLayout = photoViewer.R7;
        if (frameLayout.getTag() != null) {
            i11 = 1;
        }
        frameLayout.setAlpha(f11 * i11);
    }

    @Override
    public final void w() {
        this.N.getAdapter().f17496c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().f17499e = false;
        PhotoViewer photoViewer = this.f46260u1;
        boolean z10 = true;
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
    }

    @Override
    public final void x(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bp0.x(int):void");
    }

    @Override
    public final void y() {
        hi.i iVar = this.N;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - org.telegram.messenger.g0.L(14.0f)) - this.M.f15114l);
        }
    }
}
