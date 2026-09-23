package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class kr0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.a2, ImageReceiver.ImageReceiverDelegate, r0.n {
    public final PhotoViewer f34794a;

    public kr0(PhotoViewer photoViewer) {
        this.f34794a = photoViewer;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f34794a.v2(z10, i10, i11, false, false, false);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        PhotoViewer photoViewer = this.f34794a;
        cr0 cr0Var = photoViewer.f31061v4;
        Rect rect = photoViewer.f31032s2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f10576a;
        int i11 = defaultWindowInsets.f10577b;
        int i12 = defaultWindowInsets.f10578c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f30989n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f30934h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f30964k4[0][2] = photoViewer.f30934h0.getTranslationX();
            }
            vu0 vu0Var = photoViewer.f30925g0;
            if (vu0Var != null) {
                vu0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f30952j0;
        if (view2 != null) {
            photoViewer.f30960k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f30960k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f30952j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f30908e0.setPadding(defaultWindowInsets.f10576a, 0, i12, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(cr0Var);
            if (photoViewer.e && photoViewer.f30989n4 == 0) {
                AndroidUtilities.runOnUIThread(cr0Var, 200L);
            }
        }
        return r0.l1.f41806b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        uu0 uu0Var;
        int i10;
        Bitmap bitmap;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f34794a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f31021r1 && ((photoViewer.f31052u4 == 1 || (i11 = photoViewer.f30892c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.f30892c2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ue0Var.b(bitmap, orientation, z13, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f31090y4.getVisibility() == 0) {
                photoViewer.f30908e0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (uu0Var = photoViewer.d) != null && uu0Var.J() && !photoViewer.f30965k5 && (i10 = photoViewer.f30892c2) != 1 && i10 != 11) {
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
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f34794a.d3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }
}
