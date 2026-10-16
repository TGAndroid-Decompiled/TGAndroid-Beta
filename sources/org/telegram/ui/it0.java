package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public final class it0 extends org.telegram.ui.Components.md {
    public final Path f36866t1;
    public final PhotoViewer f36867u1;

    public it0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, iv0 iv0Var, org.telegram.ui.Components.ow0 ow0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.la laVar, mr0 mr0Var) {
        super(contextThemeWrapper, iv0Var, ow0Var, frameLayout, c6Var, laVar, mr0Var);
        this.f36867u1 = photoViewer;
        this.f36866t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f36867u1);
    }

    @Override
    public final void B() {
        z();
        ht0 ht0Var = this.f36867u1.U1;
        if (ht0Var != null) {
            ht0Var.z();
        }
    }

    @Override
    public final boolean G() {
        hv0 hv0Var = this.f36867u1.d;
        if (hv0Var != null && hv0Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f36867u1;
        org.telegram.ui.Components.sc scVar = photoViewer.f32013n7;
        if (scVar != null && org.telegram.ui.Components.sc.f28798w == scVar) {
            return false;
        }
        return photoViewer.T2(photoViewer.f31928e0);
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
        Path path = this.f36866t1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f36867u1;
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
        if (SharedConfig.photoViewerBlur && ((i10 = this.f36867u1.f32010n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f7, float f10) {
        if (!this.f7396p0 && this.f36867u1.f32073u4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w() {
        boolean z10 = true;
        this.M.setReversed(true);
        this.M.getAdapter().f10617c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        PhotoViewer photoViewer = this.f36867u1;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.Z7);
            hg.j1 adapter = this.M.getAdapter();
            if (photoViewer.l4.e == null) {
                z10 = false;
            }
            adapter.f10620e0 = z10;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().f10620e0 = false;
        }
        this.M.getAdapter().f10622f0 = false;
        this.M.setLayoutParams(w7.z5.e(-1, -1, 51));
    }

    @Override
    public final void x(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.it0.x(int):void");
    }

    @Override
    public final void y() {
        di.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
