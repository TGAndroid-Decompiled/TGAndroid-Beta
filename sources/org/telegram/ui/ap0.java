package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
public final class ap0 extends org.telegram.ui.Components.yc {
    public final Path f45784t1;
    public final PhotoViewer f45785u1;

    public ap0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, vq0 vq0Var, org.telegram.ui.Components.cu0 cu0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.ba baVar, kn0 kn0Var) {
        super(contextThemeWrapper, vq0Var, cu0Var, frameLayout, i6Var, baVar, kn0Var);
        this.f45785u1 = photoViewer;
        this.f45784t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.P(this.f45785u1);
    }

    @Override
    public final void B() {
        z();
        zo0 zo0Var = this.f45785u1.V1;
        if (zo0Var != null) {
            zo0Var.z();
        }
    }

    @Override
    public final boolean G() {
        uq0 uq0Var = this.f45785u1.d;
        if (uq0Var != null && uq0Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f45785u1;
        org.telegram.ui.Components.fc fcVar = photoViewer.f43461t7;
        if (fcVar != null && org.telegram.ui.Components.fc.f35083w == fcVar) {
            return false;
        }
        return photoViewer.S2(photoViewer.f43334f0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        int i7;
        int i10;
        boolean z12;
        canvas.save();
        Path path = this.f45784t1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f45785u1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.Z1.getX()) + f11, ((-getY()) - photoViewer.Z1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        if (z10) {
            i7 = -8882056;
        } else {
            i7 = -14277082;
        }
        int r12 = org.telegram.ui.ActionBar.n6.r1(1.0f, i7);
        if (z11) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 855638016;
            }
        } else {
            i10 = 1140850688;
        }
        int r13 = org.telegram.ui.ActionBar.n6.r1(1.0f, i10);
        boolean z13 = !z10;
        if (!z10 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        photoViewer.N0(canvas, faVar, r12, r13, false, z13, z12);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.bz.f23277c0 && ((i7 = this.f45785u1.f43405n4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f10, float f11) {
        if (!this.f14947p0 && this.f45785u1.f43467u4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w() {
        boolean z10 = true;
        this.N.setReversed(true);
        this.N.getAdapter().f17598c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().f17601e = false;
        PhotoViewer photoViewer = this.f45785u1;
        if (photoViewer.f43388l4 != null) {
            this.N.getAdapter().f17612n0 = false;
            this.N.getAdapter().W(photoViewer.f43388l4.f46349r8);
            jg.h1 adapter = this.N.getAdapter();
            if (photoViewer.f43388l4.f46173e == null) {
                z10 = false;
            }
            adapter.f17604f0 = z10;
        } else {
            this.N.getAdapter().f17612n0 = true;
            this.N.getAdapter().W(null);
            this.N.getAdapter().f17604f0 = false;
        }
        this.N.getAdapter().f17605g0 = false;
        this.N.setLayoutParams(c8.na.e(-1, -1, 51));
    }

    @Override
    public final void x(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ap0.x(int):void");
    }

    @Override
    public final void y() {
        hi.j jVar = this.N;
        if (jVar != null) {
            jVar.setTranslationY(getEditTextHeight());
        }
    }
}
