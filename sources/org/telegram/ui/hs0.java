package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class hs0 extends org.telegram.ui.Components.bd {
    public final Path f37612q1;
    public final PhotoViewer f37613r1;

    public hs0(PhotoViewer photoViewer, Context context, ku0 ku0Var, org.telegram.ui.Components.qv0 qv0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.ba baVar, oq0 oq0Var) {
        super(context, ku0Var, qv0Var, frameLayout, g6Var, baVar, oq0Var);
        this.f37613r1 = photoViewer;
        this.f37612q1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f37613r1);
    }

    @Override
    public final void B() {
        z();
        is0 is0Var = this.f37613r1.S1;
        if (is0Var != null) {
            is0Var.z();
        }
    }

    @Override
    public final boolean G() {
        ju0 ju0Var = this.f37613r1.d;
        if (ju0Var != null && ju0Var.l()) {
            return true;
        }
        return false;
    }

    public final void I() {
        boolean z4;
        PhotoViewer photoViewer = this.f37613r1;
        ju0 ju0Var = photoViewer.d;
        if (ju0Var != null && ju0Var.l() && (photoViewer.R1.I.c() || (!photoViewer.f34348o1 && !TextUtils.isEmpty(photoViewer.f1().getText())))) {
            z4 = true;
        } else {
            z4 = false;
        }
        D(z4, true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f37613r1;
        org.telegram.ui.Components.ic icVar = photoViewer.f34319k7;
        if (icVar != null && org.telegram.ui.Components.ic.f27737w == icVar) {
            return false;
        }
        return photoViewer.T2(photoViewer.f34230b0);
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
        Path path = this.f37612q1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f37613r1;
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
        int l1 = org.telegram.ui.ActionBar.k6.l1(1.0f, i10);
        if (z10) {
            if (z4) {
                i11 = 0;
            } else {
                i11 = 855638016;
            }
        } else {
            i11 = 1140850688;
        }
        int l12 = org.telegram.ui.ActionBar.k6.l1(1.0f, i11);
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
        if (SharedConfig.photoViewerBlur && ((i10 = this.f37613r1.f34316k4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        if (!this.m0 && this.f37613r1.f34379r4 != 0) {
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
        PhotoViewer photoViewer = this.f37613r1;
        org.telegram.ui.ActionBar.l0 l0Var = photoViewer.f34231b1;
        float f11 = 1.0f - f10;
        int i12 = 0;
        if (l0Var.getTag() != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        l0Var.setAlpha(i10 * f11);
        org.telegram.ui.Components.i90 i90Var = photoViewer.f34241c1;
        if (i90Var.getTag() != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        i90Var.setAlpha(i11 * f11);
        FrameLayout frameLayout = photoViewer.N7;
        if (frameLayout.getTag() != null) {
            i12 = 1;
        }
        frameLayout.setAlpha(f11 * i12);
    }

    @Override
    public final void w() {
        this.J.getAdapter().f48695c = false;
        this.J.getAdapter().d = false;
        this.J.getAdapter().f48698e = false;
        PhotoViewer photoViewer = this.f37613r1;
        boolean z4 = true;
        if (photoViewer.f34298i4 != null) {
            this.J.getAdapter().f48705j0 = false;
            this.J.getAdapter().W(photoViewer.f34298i4.W7);
            uf.u0 adapter = this.J.getAdapter();
            if (photoViewer.f34298i4.f43165e == null) {
                z4 = false;
            }
            adapter.f48694b0 = z4;
        } else {
            this.J.getAdapter().f48705j0 = true;
            this.J.getAdapter().W(null);
            this.J.getAdapter().f48694b0 = false;
        }
        this.J.getAdapter().f48696c0 = false;
    }

    @Override
    public final void x(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hs0.x(int):void");
    }

    @Override
    public final void y() {
        org.telegram.ui.Components.zh zhVar = this.J;
        if (zhVar != null) {
            zhVar.setTranslationY(((-getEditTextHeight()) - AndroidUtilities.dp(14.0f)) - this.I.f45418l);
        }
    }
}
