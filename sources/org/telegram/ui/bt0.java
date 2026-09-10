package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public final class bt0 extends org.telegram.ui.Components.jd {
    public final Path f31398t1;
    public final PhotoViewer f31399u1;

    public bt0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, dv0 dv0Var, org.telegram.ui.Components.aw0 aw0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ia iaVar, ir0 ir0Var) {
        super(contextThemeWrapper, dv0Var, aw0Var, frameLayout, f6Var, iaVar, ir0Var);
        this.f31399u1 = photoViewer;
        this.f31398t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f31399u1);
    }

    @Override
    public final void B() {
        z();
        at0 at0Var = this.f31399u1.U1;
        if (at0Var != null) {
            at0Var.z();
        }
    }

    @Override
    public final boolean G() {
        cv0 cv0Var = this.f31399u1.d;
        if (cv0Var != null && cv0Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f31399u1;
        org.telegram.ui.Components.pc pcVar = photoViewer.f30133n7;
        if (pcVar != null && org.telegram.ui.Components.pc.f26074w == pcVar) {
            return false;
        }
        return photoViewer.T2(photoViewer.f30049e0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(org.telegram.ui.Components.ma maVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        int i10;
        int i11;
        boolean z12;
        canvas.save();
        Path path = this.f31398t1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f31399u1;
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
        int l1 = org.telegram.ui.ActionBar.j6.l1(1.0f, i10);
        if (z11) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 855638016;
            }
        } else {
            i11 = 1140850688;
        }
        int l12 = org.telegram.ui.ActionBar.j6.l1(1.0f, i11);
        boolean z13 = !z10;
        if (!z10 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        photoViewer.T0(canvas, maVar, l1, l12, false, z13, z12);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f31399u1.f30130n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f7, float f10) {
        if (!this.f3279p0 && this.f31399u1.f30193u4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w() {
        boolean z10 = true;
        this.M.setReversed(true);
        this.M.getAdapter().f8104c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        PhotoViewer photoViewer = this.f31399u1;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.Z7);
            fg.l1 adapter = this.M.getAdapter();
            if (photoViewer.l4.e == null) {
                z10 = false;
            }
            adapter.f8107e0 = z10;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().f8107e0 = false;
        }
        this.M.getAdapter().f8109f0 = false;
        this.M.setLayoutParams(w7.a6.e(-1, -1, 51));
    }

    @Override
    public final void x(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bt0.x(int):void");
    }

    @Override
    public final void y() {
        bi.k kVar = this.M;
        if (kVar != null) {
            kVar.setTranslationY(getEditTextHeight());
        }
    }
}
