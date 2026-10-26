package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class fr0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.b2, ImageReceiver.ImageReceiverDelegate, r0.n {
    public final PhotoViewer f39440a;

    public fr0(PhotoViewer photoViewer) {
        this.f39440a = photoViewer;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f39440a.y2(z10, i10, i11, false, false, false);
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        PhotoViewer photoViewer = this.f39440a;
        xq0 xq0Var = photoViewer.f35800v4;
        Rect rect = photoViewer.f35771s2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.f13450a;
        int i11 = defaultWindowInsets.f13451b;
        int i12 = defaultWindowInsets.f13452c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f35728n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f35672h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f35703k4[0][2] = photoViewer.f35672h0.getTranslationX();
            }
            pu0 pu0Var = photoViewer.f35664g0;
            if (pu0Var != null) {
                pu0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f35690j0;
        if (view2 != null) {
            photoViewer.f35699k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f35699k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f35690j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f35646e0.setPadding(defaultWindowInsets.f13450a, 0, i12, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(xq0Var);
            if (photoViewer.e && photoViewer.f35728n4 == 0) {
                AndroidUtilities.runOnUIThread(xq0Var, 200L);
            }
        }
        return r0.k1.f47117b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ou0 ou0Var;
        int i10;
        Bitmap bitmap;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f39440a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f35761r1 && ((photoViewer.f35791u4 == 1 || (i11 = photoViewer.f35630c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.of0 of0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.f35630c2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                of0Var.b(bitmap, orientation, z13, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f35829y4.getVisibility() == 0) {
                photoViewer.f35646e0.requestLayout();
            }
            photoViewer.R0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (ou0Var = photoViewer.d) != null && ou0Var.K() && !photoViewer.f35704k5 && (i10 = photoViewer.f35630c2) != 1 && i10 != 11) {
            if (!photoViewer.T5) {
                photoViewer.U5 = true;
            } else {
                photoViewer.P2();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.o5.a(this, i10, str, drawable);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f39440a.g3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.o5.b(this, imageReceiver);
    }
}
