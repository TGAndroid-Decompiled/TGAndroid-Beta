package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public final class gs0 extends org.telegram.ui.Components.bd {
    public final Path f34671q1;
    public final PhotoViewer f34672r1;

    public gs0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, iu0 iu0Var, org.telegram.ui.Components.qv0 qv0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ba baVar, mq0 mq0Var) {
        super(contextThemeWrapper, iu0Var, qv0Var, frameLayout, f6Var, baVar, mq0Var);
        this.f34672r1 = photoViewer;
        this.f34671q1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f34672r1);
    }

    @Override
    public final void B() {
        z();
        fs0 fs0Var = this.f34672r1.R1;
        if (fs0Var != null) {
            fs0Var.z();
        }
    }

    @Override
    public final boolean G() {
        hu0 hu0Var = this.f34672r1.d;
        if (hu0Var != null && hu0Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f34672r1;
        org.telegram.ui.Components.ic icVar = photoViewer.f31793k7;
        if (icVar != null && org.telegram.ui.Components.ic.f25665w == icVar) {
            return false;
        }
        return photoViewer.T2(photoViewer.f31705b0);
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
        Path path = this.f34671q1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f34672r1;
        if (z10) {
            canvas.translate(((-getX()) - photoViewer.V1.getX()) + f11, ((-getY()) - photoViewer.V1.getY()) + f12);
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
        if (SharedConfig.photoViewerBlur && ((i10 = this.f34672r1.f31790k4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        if (!this.m0 && this.f34672r1.f31853r4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w() {
        boolean z4 = true;
        this.J.setReversed(true);
        this.J.getAdapter().f44839c = false;
        this.J.getAdapter().d = false;
        this.J.getAdapter().e = false;
        PhotoViewer photoViewer = this.f34672r1;
        if (photoViewer.f31772i4 != null) {
            this.J.getAdapter().f44848j0 = false;
            this.J.getAdapter().W(photoViewer.f31772i4.W7);
            tf.u0 adapter = this.J.getAdapter();
            if (photoViewer.f31772i4.e == null) {
                z4 = false;
            }
            adapter.f44838b0 = z4;
        } else {
            this.J.getAdapter().f44848j0 = true;
            this.J.getAdapter().W(null);
            this.J.getAdapter().f44838b0 = false;
        }
        this.J.getAdapter().f44840c0 = false;
        this.J.setLayoutParams(k7.b6.e(-1, -1, 51));
    }

    @Override
    public final void x(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gs0.x(int):void");
    }

    @Override
    public final void y() {
        org.telegram.ui.Components.zh zhVar = this.J;
        if (zhVar != null) {
            zhVar.setTranslationY(getEditTextHeight());
        }
    }
}
