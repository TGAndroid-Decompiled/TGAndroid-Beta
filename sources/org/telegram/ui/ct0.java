package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public final class ct0 extends org.telegram.ui.Components.od {
    public final Path f36781t1;
    public final PhotoViewer f36782u1;

    public ct0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, dv0 dv0Var, org.telegram.ui.Components.tw0 tw0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ma maVar, ir0 ir0Var) {
        super(contextThemeWrapper, dv0Var, tw0Var, frameLayout, e6Var, maVar, ir0Var);
        this.f36782u1 = photoViewer;
        this.f36781t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f36782u1);
    }

    @Override
    public final void B() {
        z();
        bt0 bt0Var = this.f36782u1.U1;
        if (bt0Var != null) {
            bt0Var.z();
        }
    }

    @Override
    public final boolean G() {
        cv0 cv0Var = this.f36782u1.d;
        if (cv0Var != null && cv0Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f36782u1;
        org.telegram.ui.Components.tc tcVar = photoViewer.f34026n7;
        if (tcVar != null && org.telegram.ui.Components.tc.f31088w == tcVar) {
            return false;
        }
        return photoViewer.T2(photoViewer.f33942e0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.qa qaVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        int i10;
        int i11;
        boolean z12;
        canvas.save();
        Path path = this.f36781t1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f36782u1;
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
        int m12 = org.telegram.ui.ActionBar.i6.m1(1.0f, i10);
        if (z11) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 855638016;
            }
        } else {
            i11 = 1140850688;
        }
        int m13 = org.telegram.ui.ActionBar.i6.m1(1.0f, i11);
        boolean z13 = !z10;
        if (!z10 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        photoViewer.T0(canvas, qaVar, m12, m13, false, z13, z12);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f36782u1.f34023n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f7, float f10) {
        if (!this.f5566p0 && this.f36782u1.f34086u4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w() {
        boolean z10 = true;
        this.M.setReversed(true);
        this.M.getAdapter().f10668c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().f10671e = false;
        PhotoViewer photoViewer = this.f36782u1;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.Z7);
            gg.j1 adapter = this.M.getAdapter();
            if (photoViewer.l4.f44797e == null) {
                z10 = false;
            }
            adapter.f10672e0 = z10;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().f10672e0 = false;
        }
        this.M.getAdapter().f10674f0 = false;
        this.M.setLayoutParams(w7.x5.e(-1, -1, 51));
    }

    @Override
    public final void x(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ct0.x(int):void");
    }

    @Override
    public final void y() {
        ci.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
