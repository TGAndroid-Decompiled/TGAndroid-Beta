package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ms0 extends org.telegram.ui.Components.bd {
    public final Path f36197q1;
    public final PhotoViewer f36198r1;

    public ms0(PhotoViewer photoViewer, Context context, pu0 pu0Var, org.telegram.ui.Components.qv0 qv0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ba baVar, tq0 tq0Var) {
        super(context, pu0Var, qv0Var, frameLayout, f6Var, baVar, tq0Var);
        this.f36198r1 = photoViewer;
        this.f36197q1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f36198r1);
    }

    @Override
    public final void B() {
        z();
        ns0 ns0Var = this.f36198r1.S1;
        if (ns0Var != null) {
            ns0Var.z();
        }
    }

    @Override
    public final boolean G() {
        ou0 ou0Var = this.f36198r1.d;
        if (ou0Var != null && ou0Var.l()) {
            return true;
        }
        return false;
    }

    public final void I() {
        boolean z4;
        PhotoViewer photoViewer = this.f36198r1;
        ou0 ou0Var = photoViewer.d;
        if (ou0Var != null && ou0Var.l() && (photoViewer.R1.I.c() || (!photoViewer.f31796o1 && !TextUtils.isEmpty(photoViewer.f1().getText())))) {
            z4 = true;
        } else {
            z4 = false;
        }
        D(z4, true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f36198r1;
        org.telegram.ui.Components.ic icVar = photoViewer.f31767k7;
        if (icVar != null && org.telegram.ui.Components.ic.f25664w == icVar) {
            return false;
        }
        return photoViewer.T2(photoViewer.f31679b0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z4, float f11, float f12, boolean z10) {
        int i10;
        int i11;
        boolean z11;
        canvas.save();
        Path path = this.f36197q1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f36198r1;
        if (z10) {
            canvas.translate(((-getX()) - photoViewer.U1.getX()) + f11, ((-getY()) - photoViewer.U1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        if (z4) {
            i10 = -8882056;
        } else {
            i10 = -14277082;
        }
        int l1 = org.telegram.ui.ActionBar.j6.l1(1.0f, i10);
        if (z10) {
            if (z4) {
                i11 = 0;
            } else {
                i11 = 855638016;
            }
        } else {
            i11 = 1140850688;
        }
        int l12 = org.telegram.ui.ActionBar.j6.l1(1.0f, i11);
        boolean z12 = !z4;
        if (!z4 && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        photoViewer.T0(canvas, faVar, l1, l12, false, z12, z11);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f36198r1.f31764k4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        if (!this.m0 && this.f36198r1.f31827r4 != 0) {
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
        int i10;
        int i11;
        super.u(f10);
        PhotoViewer photoViewer = this.f36198r1;
        org.telegram.ui.ActionBar.l0 l0Var = photoViewer.f31680b1;
        float f11 = 1.0f - f10;
        int i12 = 0;
        if (l0Var.getTag() != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        l0Var.setAlpha(i10 * f11);
        org.telegram.ui.Components.h90 h90Var = photoViewer.f31690c1;
        if (h90Var.getTag() != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        h90Var.setAlpha(i11 * f11);
        FrameLayout frameLayout = photoViewer.N7;
        if (frameLayout.getTag() != null) {
            i12 = 1;
        }
        frameLayout.setAlpha(f11 * i12);
    }

    @Override
    public final void w() {
        this.J.getAdapter().f44901c = false;
        this.J.getAdapter().d = false;
        this.J.getAdapter().e = false;
        PhotoViewer photoViewer = this.f36198r1;
        boolean z4 = true;
        if (photoViewer.f31746i4 != null) {
            this.J.getAdapter().f44910j0 = false;
            this.J.getAdapter().W(photoViewer.f31746i4.W7);
            tf.u0 adapter = this.J.getAdapter();
            if (photoViewer.f31746i4.e == null) {
                z4 = false;
            }
            adapter.f44900b0 = z4;
        } else {
            this.J.getAdapter().f44910j0 = true;
            this.J.getAdapter().W(null);
            this.J.getAdapter().f44900b0 = false;
        }
        this.J.getAdapter().f44902c0 = false;
    }

    @Override
    public final void x(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ms0.x(int):void");
    }

    @Override
    public final void y() {
        org.telegram.ui.Components.zh zhVar = this.J;
        if (zhVar != null) {
            zhVar.setTranslationY(((-getEditTextHeight()) - AndroidUtilities.dp(14.0f)) - this.I.f41779l);
        }
    }
}
