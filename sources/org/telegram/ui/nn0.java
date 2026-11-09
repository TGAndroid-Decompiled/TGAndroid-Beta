package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class nn0 implements org.telegram.ui.Components.t4, org.telegram.ui.ActionBar.r1, org.telegram.messenger.lc, r0.m {
    public final PhotoViewer f48210a;

    public nn0(PhotoViewer photoViewer) {
        this.f48210a = photoViewer;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        Drawable[] drawableArr = PhotoViewer.Y8;
        this.f48210a.t2(z9, i7, i10, false, false, false);
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        PhotoViewer photoViewer = this.f48210a;
        en0 en0Var = photoViewer.f41534u4;
        Rect rect = photoViewer.f41516s2;
        Rect rect2 = new Rect(rect);
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = k1Var.f54214a.f(647).d;
        int i10 = I0.f15120a;
        int i11 = I0.f15121b;
        int i12 = I0.f15122c;
        rect.set(i10, i11, i12, i7);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f41463m4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f41419h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f41438j4[0][2] = photoViewer.f41419h0.getTranslationX();
            }
            xq0 xq0Var = photoViewer.f41410g0;
            if (xq0Var != null) {
                xq0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f41435j0;
        if (view2 != null) {
            photoViewer.f41443k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f41443k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f41435j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f41391e0.setPadding(i10, 0, i12, 0);
        if (photoViewer.F != null) {
            org.telegram.messenger.g0.r(en0Var);
            if (photoViewer.f41390e && photoViewer.f41463m4 == 0) {
                org.telegram.messenger.g0.i3(en0Var, 200L);
            }
        }
        return r0.k1.f54213b;
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        wq0 wq0Var;
        int i7;
        Bitmap n10;
        boolean z12;
        int i10;
        PhotoViewer photoViewer = this.f48210a;
        if (imageReceiver == photoViewer.B4 && z9 && !z10) {
            if (!photoViewer.f41505r1 && ((photoViewer.f41526t4 == 1 || (i10 = photoViewer.f41375c2) == 1 || i10 == 11) && photoViewer.C1 != null && (n10 = imageReceiver.n()) != null)) {
                org.telegram.ui.Components.gd0 gd0Var = photoViewer.C1;
                int i11 = imageReceiver.U;
                int i12 = photoViewer.f41375c2;
                if (i12 != 1 && i12 != 11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                gd0Var.b(n10, i11, z12, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f41563x4.getVisibility() == 0) {
                photoViewer.f41391e0.requestLayout();
            }
            photoViewer.K0();
        }
        if (imageReceiver == photoViewer.B4 && z9 && (wq0Var = photoViewer.d) != null && wq0Var.K() && !photoViewer.f41439j5 && (i7 = photoViewer.f41375c2) != 1 && i7 != 11) {
            if (!photoViewer.S5) {
                photoViewer.T5 = true;
            } else {
                photoViewer.K2();
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        Drawable[] drawableArr = PhotoViewer.Y8;
        this.f48210a.b3(0);
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
    }

    @Override
    public void t0(int i7, Drawable drawable) {
    }
}
