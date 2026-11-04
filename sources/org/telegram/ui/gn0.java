package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class gn0 implements org.telegram.ui.Components.r4, org.telegram.ui.ActionBar.p1, org.telegram.messenger.ec, r0.m {
    public final PhotoViewer f45683a;

    public gn0(PhotoViewer photoViewer) {
        this.f45683a = photoViewer;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.V8;
        this.f45683a.z2(z10, i3, i10, false, false, false);
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        PhotoViewer photoViewer = this.f45683a;
        xm0 xm0Var = photoViewer.f41572w4;
        Rect rect = photoViewer.f41542t2;
        Rect rect2 = new Rect(rect);
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i3 = k1Var.f54026a.f(647).d;
        int i10 = I0.f14495a;
        int i11 = I0.f14496b;
        int i12 = I0.f14497c;
        rect.set(i10, i11, i12, i3);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f41499o4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f41445i0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f41474l4[0][2] = photoViewer.f41445i0.getTranslationX();
            }
            lq0 lq0Var = photoViewer.f41437h0;
            if (lq0Var != null) {
                lq0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f41462k0;
        if (view2 != null) {
            photoViewer.f41470l0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f41470l0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f41462k0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f41420f0.setPadding(i10, 0, i12, 0);
        if (photoViewer.G != null) {
            org.telegram.messenger.g0.r(xm0Var);
            if (photoViewer.f41409e && photoViewer.f41499o4 == 0) {
                org.telegram.messenger.g0.i3(xm0Var, 200L);
            }
        }
        return r0.k1.f54025b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        Drawable[] drawableArr = PhotoViewer.V8;
        this.f45683a.h3(0);
    }

    @Override
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        kq0 kq0Var;
        int i3;
        Bitmap n4;
        boolean z13;
        int i10;
        PhotoViewer photoViewer = this.f45683a;
        if (imageReceiver == photoViewer.D4 && z10 && !z11) {
            if (!photoViewer.f41533s1 && ((photoViewer.f41562v4 == 1 || (i10 = photoViewer.f41402d2) == 1 || i10 == 11) && photoViewer.D1 != null && (n4 = imageReceiver.n()) != null)) {
                org.telegram.ui.Components.ad0 ad0Var = photoViewer.D1;
                int i11 = imageReceiver.V;
                int i12 = photoViewer.f41402d2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ad0Var.b(n4, i11, z13, true, photoViewer.E1, null, null);
            }
            if (photoViewer.f41601z4.getVisibility() == 0) {
                photoViewer.f41420f0.requestLayout();
            }
            photoViewer.R0();
        }
        if (imageReceiver == photoViewer.D4 && z10 && (kq0Var = photoViewer.d) != null && kq0Var.K() && !photoViewer.f41475l5 && (i3 = photoViewer.f41402d2) != 1 && i3 != 11) {
            if (!photoViewer.U5) {
                photoViewer.V5 = true;
            } else {
                photoViewer.Q2();
            }
        }
    }

    @Override
    public void D(ImageReceiver imageReceiver) {
    }

    @Override
    public void F0(int i3, Drawable drawable) {
    }
}
