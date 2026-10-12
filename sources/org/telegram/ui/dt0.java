package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class dt0 extends org.telegram.ui.Components.od {
    public final Path f36901t1;
    public final PhotoViewer f36902u1;

    public dt0(PhotoViewer photoViewer, Context context, fv0 fv0Var, org.telegram.ui.Components.yw0 yw0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.la laVar, kr0 kr0Var) {
        super(context, fv0Var, yw0Var, frameLayout, c6Var, laVar, kr0Var);
        this.f36902u1 = photoViewer;
        this.f36901t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f36902u1);
    }

    @Override
    public final void B() {
        z();
        et0 et0Var = this.f36902u1.V1;
        if (et0Var != null) {
            et0Var.z();
        }
    }

    @Override
    public final boolean G() {
        ev0 ev0Var = this.f36902u1.d;
        if (ev0Var != null && ev0Var.l()) {
            return true;
        }
        return false;
    }

    public final void I() {
        boolean z10;
        PhotoViewer photoViewer = this.f36902u1;
        ev0 ev0Var = photoViewer.d;
        if (ev0Var != null && ev0Var.l() && (photoViewer.U1.L.c() || (!photoViewer.f33854r1 && !TextUtils.isEmpty(photoViewer.f1().getText())))) {
            z10 = true;
        } else {
            z10 = false;
        }
        D(z10, true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f36902u1;
        org.telegram.ui.Components.sc scVar = photoViewer.f33825n7;
        if (scVar != null && org.telegram.ui.Components.sc.f30532w == scVar) {
            return false;
        }
        return photoViewer.T2(photoViewer.f33741e0);
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
        Path path = this.f36901t1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f36902u1;
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
        if (SharedConfig.photoViewerBlur && ((i10 = this.f36902u1.f33822n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f7, float f10) {
        if (!this.f5564p0 && this.f36902u1.f33885u4 != 0) {
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
        PhotoViewer photoViewer = this.f36902u1;
        org.telegram.ui.ActionBar.j0 j0Var = photoViewer.f33742e1;
        float f10 = 1.0f - f7;
        int i12 = 0;
        if (j0Var.getTag() != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        j0Var.setAlpha(i10 * f10);
        org.telegram.ui.Components.ka0 ka0Var = photoViewer.f33751f1;
        if (ka0Var.getTag() != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        ka0Var.setAlpha(i11 * f10);
        FrameLayout frameLayout = photoViewer.R7;
        if (frameLayout.getTag() != null) {
            i12 = 1;
        }
        frameLayout.setAlpha(f10 * i12);
    }

    @Override
    public final void w() {
        this.M.getAdapter().f10666c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().f10669e = false;
        PhotoViewer photoViewer = this.f36902u1;
        boolean z10 = true;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.Z7);
            gg.j1 adapter = this.M.getAdapter();
            if (photoViewer.l4.f37241e == null) {
                z10 = false;
            }
            adapter.f10670e0 = z10;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().f10670e0 = false;
        }
        this.M.getAdapter().f10672f0 = false;
    }

    @Override
    public final void x(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dt0.x(int):void");
    }

    @Override
    public final void y() {
        ci.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - AndroidUtilities.dp(14.0f)) - this.L.f5165l);
        }
    }
}
