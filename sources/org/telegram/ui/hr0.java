package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class hr0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.b2, ImageReceiver.ImageReceiverDelegate, r0.n {
    public final PhotoViewer f39955a;

    public hr0(PhotoViewer photoViewer) {
        this.f39955a = photoViewer;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f39955a.z2(z10, i10, i11, false, false, false);
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        PhotoViewer photoViewer = this.f39955a;
        zq0 zq0Var = photoViewer.f35824v4;
        Rect rect = photoViewer.f35795s2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = k1Var.f47153a.f(647).d;
        int i11 = defaultWindowInsets.f13449a;
        int i12 = defaultWindowInsets.f13450b;
        int i13 = defaultWindowInsets.f13451c;
        rect.set(i11, i12, i13, i10);
        if (!rect2.equals(rect)) {
            int i14 = photoViewer.f35752n4;
            if (i14 == 1 || i14 == 3) {
                ClippingImageView clippingImageView = photoViewer.f35696h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f35727k4[0][2] = photoViewer.f35696h0.getTranslationX();
            }
            ru0 ru0Var = photoViewer.f35688g0;
            if (ru0Var != null) {
                ru0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f35714j0;
        if (view2 != null) {
            photoViewer.f35723k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i15 = photoViewer.f35723k0;
            marginLayoutParams.height = i15;
            marginLayoutParams.bottomMargin = (-i15) / 2;
            photoViewer.f35714j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f35670e0.setPadding(defaultWindowInsets.f13449a, 0, i13, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(zq0Var);
            if (photoViewer.e && photoViewer.f35752n4 == 0) {
                AndroidUtilities.runOnUIThread(zq0Var, 200L);
            }
        }
        return r0.k1.f47152b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        qu0 qu0Var;
        int i10;
        Bitmap bitmap;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f39955a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f35785r1 && ((photoViewer.f35815u4 == 1 || (i11 = photoViewer.f35654c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.pf0 pf0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.f35654c2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                pf0Var.b(bitmap, orientation, z13, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f35853y4.getVisibility() == 0) {
                photoViewer.f35670e0.requestLayout();
            }
            photoViewer.R0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (qu0Var = photoViewer.d) != null && qu0Var.K() && !photoViewer.f35728k5 && (i10 = photoViewer.f35654c2) != 1 && i10 != 11) {
            if (!photoViewer.T5) {
                photoViewer.U5 = true;
            } else {
                photoViewer.Q2();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f39955a.h3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.p5.b(this, imageReceiver);
    }
}
