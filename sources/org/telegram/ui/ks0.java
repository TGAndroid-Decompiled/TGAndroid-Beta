package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public final class ks0 extends org.telegram.ui.Components.id {
    public final Path f39029t1;
    public final PhotoViewer f39030u1;

    public ks0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, ku0 ku0Var, org.telegram.ui.Components.nw0 nw0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.ha haVar, sq0 sq0Var) {
        super(contextThemeWrapper, ku0Var, nw0Var, frameLayout, g6Var, haVar, sq0Var);
        this.f39030u1 = photoViewer;
        this.f39029t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.X(this.f39030u1);
    }

    @Override
    public final void B() {
        z();
        js0 js0Var = this.f39030u1.U1;
        if (js0Var != null) {
            js0Var.z();
        }
    }

    @Override
    public final boolean G() {
        ju0 ju0Var = this.f39030u1.d;
        if (ju0Var != null && ju0Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f39030u1;
        org.telegram.ui.Components.oc ocVar = photoViewer.f33667n7;
        if (ocVar != null && org.telegram.ui.Components.oc.f29196w == ocVar) {
            return false;
        }
        return photoViewer.V2(photoViewer.f33582e0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.la laVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        int i10;
        int i11;
        boolean z12;
        canvas.save();
        Path path = this.f39029t1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f39030u1;
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
        int o12 = org.telegram.ui.ActionBar.k6.o1(1.0f, i10);
        if (z11) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 855638016;
            }
        } else {
            i11 = 1140850688;
        }
        int o13 = org.telegram.ui.ActionBar.k6.o1(1.0f, i11);
        boolean z13 = !z10;
        if (!z10 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        photoViewer.V0(canvas, laVar, o12, o13, false, z13, z12);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f39030u1.f33664n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f7, float f10) {
        if (!this.f9421p0 && this.f39030u1.f33727u4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w() {
        boolean z10 = true;
        this.M.setReversed(true);
        this.M.getAdapter().f11949c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        PhotoViewer photoViewer = this.f39030u1;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.f41589l8);
            hg.j1 adapter = this.M.getAdapter();
            if (photoViewer.l4.e == null) {
                z10 = false;
            }
            adapter.f11952e0 = z10;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().f11952e0 = false;
        }
        this.M.getAdapter().f11954f0 = false;
        this.M.setLayoutParams(w7.z5.e(-1, -1, 51));
    }

    @Override
    public final void x(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ks0.x(int):void");
    }

    @Override
    public final void y() {
        ei.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
