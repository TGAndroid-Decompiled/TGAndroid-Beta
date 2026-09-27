package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class lr0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.b2, ImageReceiver.ImageReceiverDelegate, r0.n {
    public final PhotoViewer f35443a;

    public lr0(PhotoViewer photoViewer) {
        this.f35443a = photoViewer;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f35443a.v2(z10, i10, i11, false, false, false);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        PhotoViewer photoViewer = this.f35443a;
        dr0 dr0Var = photoViewer.f31378v4;
        Rect rect = photoViewer.f31349s2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f10579a;
        int i11 = defaultWindowInsets.f10580b;
        int i12 = defaultWindowInsets.f10581c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f31306n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f31251h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f31281k4[0][2] = photoViewer.f31251h0.getTranslationX();
            }
            xu0 xu0Var = photoViewer.f31242g0;
            if (xu0Var != null) {
                xu0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f31269j0;
        if (view2 != null) {
            photoViewer.f31277k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f31277k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f31269j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f31225e0.setPadding(defaultWindowInsets.f10579a, 0, i12, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(dr0Var);
            if (photoViewer.e && photoViewer.f31306n4 == 0) {
                AndroidUtilities.runOnUIThread(dr0Var, 200L);
            }
        }
        return r0.l1.f42184b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        wu0 wu0Var;
        int i10;
        Bitmap bitmap;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f35443a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f31338r1 && ((photoViewer.f31369u4 == 1 || (i11 = photoViewer.f31209c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.ef0 ef0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.f31209c2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ef0Var.b(bitmap, orientation, z13, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f31407y4.getVisibility() == 0) {
                photoViewer.f31225e0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (wu0Var = photoViewer.d) != null && wu0Var.J() && !photoViewer.f31282k5 && (i10 = photoViewer.f31209c2) != 1 && i10 != 11) {
            if (!photoViewer.T5) {
                photoViewer.U5 = true;
            } else {
                photoViewer.M2();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f35443a.d3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }
}
