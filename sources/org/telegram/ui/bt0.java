package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class bt0 extends org.telegram.ui.Components.od {
    public final Path f36428t1;
    public final PhotoViewer f36429u1;

    public bt0(PhotoViewer photoViewer, Context context, dv0 dv0Var, org.telegram.ui.Components.sw0 sw0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ma maVar, ir0 ir0Var) {
        super(context, dv0Var, sw0Var, frameLayout, e6Var, maVar, ir0Var);
        this.f36429u1 = photoViewer;
        this.f36428t1 = new Path();
    }

    @Override
    public final void A() {
        PhotoViewer.W(this.f36429u1);
    }

    @Override
    public final void B() {
        z();
        ct0 ct0Var = this.f36429u1.V1;
        if (ct0Var != null) {
            ct0Var.z();
        }
    }

    @Override
    public final boolean G() {
        cv0 cv0Var = this.f36429u1.d;
        if (cv0Var != null && cv0Var.l()) {
            return true;
        }
        return false;
    }

    public final void I() {
        boolean z10;
        PhotoViewer photoViewer = this.f36429u1;
        cv0 cv0Var = photoViewer.d;
        if (cv0Var != null && cv0Var.l() && (photoViewer.U1.L.c() || (!photoViewer.f34017r1 && !TextUtils.isEmpty(photoViewer.f1().getText())))) {
            z10 = true;
        } else {
            z10 = false;
        }
        D(z10, true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.f36429u1;
        org.telegram.ui.Components.tc tcVar = photoViewer.f33988n7;
        if (tcVar != null && org.telegram.ui.Components.tc.f31122w == tcVar) {
            return false;
        }
        return photoViewer.T2(photoViewer.f33904e0);
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
        Path path = this.f36428t1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.f36429u1;
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
        if (SharedConfig.photoViewerBlur && ((i10 = this.f36429u1.f33985n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f7, float f10) {
        if (!this.f5566p0 && this.f36429u1.f34048u4 != 0) {
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
        PhotoViewer photoViewer = this.f36429u1;
        org.telegram.ui.ActionBar.k0 k0Var = photoViewer.f33905e1;
        float f10 = 1.0f - f7;
        int i12 = 0;
        if (k0Var.getTag() != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        k0Var.setAlpha(i10 * f10);
        org.telegram.ui.Components.ga0 ga0Var = photoViewer.f33914f1;
        if (ga0Var.getTag() != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        ga0Var.setAlpha(i11 * f10);
        FrameLayout frameLayout = photoViewer.R7;
        if (frameLayout.getTag() != null) {
            i12 = 1;
        }
        frameLayout.setAlpha(f10 * i12);
    }

    @Override
    public final void w() {
        this.M.getAdapter().f10668c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().f10671e = false;
        PhotoViewer photoViewer = this.f36429u1;
        boolean z10 = true;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.Z7);
            gg.j1 adapter = this.M.getAdapter();
            if (photoViewer.l4.f44753e == null) {
                z10 = false;
            }
            adapter.f10672e0 = z10;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().f10672e0 = false;
        }
        this.M.getAdapter().f10674f0 = false;
    }

    @Override
    public final void x(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bt0.x(int):void");
    }

    @Override
    public final void y() {
        ci.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - AndroidUtilities.dp(14.0f)) - this.L.f5167l);
        }
    }
}
