package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class ln0 implements org.telegram.ui.Components.t4, org.telegram.ui.ActionBar.r1, org.telegram.messenger.lc, r0.m {
    public final PhotoViewer f47537a;

    public ln0(PhotoViewer photoViewer) {
        this.f47537a = photoViewer;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        Drawable[] drawableArr = PhotoViewer.Y8;
        this.f47537a.t2(z9, i7, i10, false, false, false);
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        PhotoViewer photoViewer = this.f47537a;
        cn0 cn0Var = photoViewer.f41499u4;
        Rect rect = photoViewer.f41481s2;
        Rect rect2 = new Rect(rect);
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = k1Var.f54084a.f(647).d;
        int i10 = I0.f15117a;
        int i11 = I0.f15118b;
        int i12 = I0.f15119c;
        rect.set(i10, i11, i12, i7);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f41428m4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f41384h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f41403j4[0][2] = photoViewer.f41384h0.getTranslationX();
            }
            uq0 uq0Var = photoViewer.f41375g0;
            if (uq0Var != null) {
                uq0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f41400j0;
        if (view2 != null) {
            photoViewer.f41408k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f41408k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f41400j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f41356e0.setPadding(i10, 0, i12, 0);
        if (photoViewer.F != null) {
            org.telegram.messenger.g0.r(cn0Var);
            if (photoViewer.f41355e && photoViewer.f41428m4 == 0) {
                org.telegram.messenger.g0.i3(cn0Var, 200L);
            }
        }
        return r0.k1.f54083b;
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        tq0 tq0Var;
        int i7;
        Bitmap n10;
        boolean z12;
        int i10;
        PhotoViewer photoViewer = this.f47537a;
        if (imageReceiver == photoViewer.B4 && z9 && !z10) {
            if (!photoViewer.f41470r1 && ((photoViewer.f41491t4 == 1 || (i10 = photoViewer.f41340c2) == 1 || i10 == 11) && photoViewer.C1 != null && (n10 = imageReceiver.n()) != null)) {
                org.telegram.ui.Components.fd0 fd0Var = photoViewer.C1;
                int i11 = imageReceiver.U;
                int i12 = photoViewer.f41340c2;
                if (i12 != 1 && i12 != 11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                fd0Var.b(n10, i11, z12, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f41528x4.getVisibility() == 0) {
                photoViewer.f41356e0.requestLayout();
            }
            photoViewer.K0();
        }
        if (imageReceiver == photoViewer.B4 && z9 && (tq0Var = photoViewer.d) != null && tq0Var.K() && !photoViewer.f41404j5 && (i7 = photoViewer.f41340c2) != 1 && i7 != 11) {
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
        this.f47537a.b3(0);
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
    }

    @Override
    public void t0(int i7, Drawable drawable) {
    }
}
