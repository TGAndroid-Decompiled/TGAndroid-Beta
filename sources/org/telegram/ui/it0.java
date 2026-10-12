package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class it0 extends org.telegram.ui.Components.md {
    public final Path f37201t1;
    public final PhotoViewer f37202u1;

    public it0(PhotoViewer photoViewer, Context context, jv0 jv0Var, org.telegram.ui.Components.ow0 ow0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.la laVar, or0 or0Var) {
        super(context, jv0Var, ow0Var, frameLayout, c6Var, laVar, or0Var);
        this.f37202u1 = photoViewer;
        this.f37201t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f37202u1);
    }

    @Override
    public final void B() {
        z();
        jt0 jt0Var = this.f37202u1.V1;
        if (jt0Var != null) {
            jt0Var.z();
        }
    }

    @Override
    public final boolean G() {
        iv0 iv0Var = this.f37202u1.d;
        if (iv0Var != null && iv0Var.l()) {
            return true;
        }
        return false;
    }

    public final void I() {
        boolean z10;
        PhotoViewer photoViewer = this.f37202u1;
        iv0 iv0Var = photoViewer.d;
        if (iv0Var != null && iv0Var.l() && (photoViewer.U1.L.c() || (!photoViewer.f32340r1 && !TextUtils.isEmpty(photoViewer.f1().getText())))) {
            z10 = true;
        } else {
            z10 = false;
        }
        D(z10, true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f37202u1;
        org.telegram.ui.Components.sc scVar = photoViewer.f32311n7;
        if (scVar != null && org.telegram.ui.Components.sc.f29095w == scVar) {
            return false;
        }
        return photoViewer.T2(photoViewer.f32226e0);
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
        Path path = this.f37201t1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f37202u1;
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
        int m12 = org.telegram.ui.ActionBar.g6.m1(1.0f, i10);
        if (z11) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 855638016;
            }
        } else {
            i11 = 1140850688;
        }
        int m13 = org.telegram.ui.ActionBar.g6.m1(1.0f, i11);
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
        if (SharedConfig.photoViewerBlur && ((i10 = this.f37202u1.f32308n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f7, float f10) {
        if (!this.f7393p0 && this.f37202u1.f32371u4 != 0) {
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
        PhotoViewer photoViewer = this.f37202u1;
        org.telegram.ui.ActionBar.j0 j0Var = photoViewer.f32227e1;
        float f10 = 1.0f - f7;
        int i12 = 0;
        if (j0Var.getTag() != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        j0Var.setAlpha(i10 * f10);
        org.telegram.ui.Components.fa0 fa0Var = photoViewer.f32236f1;
        if (fa0Var.getTag() != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        fa0Var.setAlpha(i11 * f10);
        FrameLayout frameLayout = photoViewer.R7;
        if (frameLayout.getTag() != null) {
            i12 = 1;
        }
        frameLayout.setAlpha(f10 * i12);
    }

    @Override
    public final void w() {
        this.M.getAdapter().f10613c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        PhotoViewer photoViewer = this.f37202u1;
        boolean z10 = true;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.Z7);
            hg.j1 adapter = this.M.getAdapter();
            if (photoViewer.l4.e == null) {
                z10 = false;
            }
            adapter.f10616e0 = z10;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().f10616e0 = false;
        }
        this.M.getAdapter().f10618f0 = false;
    }

    @Override
    public final void x(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.it0.x(int):void");
    }

    @Override
    public final void y() {
        di.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - AndroidUtilities.dp(14.0f)) - this.L.f7000l);
        }
    }
}
