package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class nn0 implements org.telegram.ui.Components.r4, org.telegram.ui.ActionBar.q1, org.telegram.messenger.kc, r0.m {
    public final PhotoViewer f49587a;

    public nn0(PhotoViewer photoViewer) {
        this.f49587a = photoViewer;
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        sq0 sq0Var;
        int i7;
        Bitmap n10;
        boolean z13;
        int i10;
        PhotoViewer photoViewer = this.f49587a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f42877s1 && ((photoViewer.f42896u4 == 1 || (i10 = photoViewer.d2) == 1 || i10 == 11) && photoViewer.D1 != null && (n10 = imageReceiver.n()) != null)) {
                org.telegram.ui.Components.gd0 gd0Var = photoViewer.D1;
                int i11 = imageReceiver.V;
                int i12 = photoViewer.d2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                gd0Var.b(n10, i11, z13, true, photoViewer.E1, null, null);
            }
            if (photoViewer.f42935y4.getVisibility() == 0) {
                photoViewer.f42763f0.requestLayout();
            }
            photoViewer.K0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (sq0Var = photoViewer.d) != null && sq0Var.K() && !photoViewer.f42810k5 && (i7 = photoViewer.d2) != 1 && i7 != 11) {
            if (!photoViewer.T5) {
                photoViewer.U5 = true;
            } else {
                photoViewer.L2();
            }
        }
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.Z8;
        this.f49587a.u2(z10, i7, i10, false, false, false);
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        PhotoViewer photoViewer = this.f49587a;
        en0 en0Var = photoViewer.f42905v4;
        Rect rect = photoViewer.f42886t2;
        Rect rect2 = new Rect(rect);
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = k1Var.f55682a.f(647).d;
        int i10 = I0.f15574a;
        int i11 = I0.f15575b;
        int i12 = I0.f15576c;
        rect.set(i10, i11, i12, i7);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f42834n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f42789i0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f42809k4[0][2] = photoViewer.f42789i0.getTranslationX();
            }
            tq0 tq0Var = photoViewer.f42781h0;
            if (tq0Var != null) {
                tq0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f42805k0;
        if (view2 != null) {
            photoViewer.f42814l0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f42814l0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f42805k0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f42763f0.setPadding(i10, 0, i12, 0);
        if (photoViewer.G != null) {
            org.telegram.messenger.g0.r(en0Var);
            if (photoViewer.f42752e && photoViewer.f42834n4 == 0) {
                org.telegram.messenger.g0.i3(en0Var, 200L);
            }
        }
        return r0.k1.f55681b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        Drawable[] drawableArr = PhotoViewer.Z8;
        this.f49587a.c3(0);
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
    }

    @Override
    public void O(int i7, Drawable drawable) {
    }
}
