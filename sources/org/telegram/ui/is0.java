package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public final class is0 extends org.telegram.ui.Components.kd {
    public final Path f38108t1;
    public final PhotoViewer f38109u1;

    public is0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, iu0 iu0Var, org.telegram.ui.Components.lw0 lw0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ja jaVar, qq0 qq0Var) {
        super(contextThemeWrapper, iu0Var, lw0Var, frameLayout, d6Var, jaVar, qq0Var);
        this.f38109u1 = photoViewer;
        this.f38108t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.X(this.f38109u1);
    }

    @Override
    public final void B() {
        z();
        hs0 hs0Var = this.f38109u1.U1;
        if (hs0Var != null) {
            hs0Var.z();
        }
    }

    @Override
    public final boolean G() {
        hu0 hu0Var = this.f38109u1.d;
        if (hu0Var != null && hu0Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f38109u1;
        org.telegram.ui.Components.qc qcVar = photoViewer.f33363n7;
        if (qcVar != null && org.telegram.ui.Components.qc.f29523w == qcVar) {
            return false;
        }
        return photoViewer.V2(photoViewer.f33278e0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.na naVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        int i10;
        int i11;
        boolean z12;
        canvas.save();
        Path path = this.f38108t1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f38109u1;
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
        photoViewer.V0(canvas, naVar, m12, m13, false, z13, z12);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f38109u1.f33360n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f7, float f10) {
        if (!this.f9410p0 && this.f38109u1.f33423u4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w() {
        boolean z10 = true;
        this.M.setReversed(true);
        this.M.getAdapter().f11921c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        PhotoViewer photoViewer = this.f38109u1;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.Z7);
            hg.j1 adapter = this.M.getAdapter();
            if (photoViewer.l4.e == null) {
                z10 = false;
            }
            adapter.f11924e0 = z10;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().f11924e0 = false;
        }
        this.M.getAdapter().f11926f0 = false;
        this.M.setLayoutParams(w7.z5.e(-1, -1, 51));
    }

    @Override
    public final void x(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.is0.x(int):void");
    }

    @Override
    public final void y() {
        ei.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
