package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileNotFoundException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;

public final class pq0 implements org.telegram.ui.Components.x4, org.telegram.ui.ActionBar.a2, ImageReceiver.ImageReceiverDelegate, r0.o {

    public final PhotoViewer f41411a;

    public pq0(PhotoViewer photoViewer) {
        this.f41411a = photoViewer;
    }

    @Override
    public void I(int i10, int i11, boolean z10) throws FileNotFoundException {
        Drawable[] drawableArr = PhotoViewer.P8;
        this.f41411a.w2(z10, i10, i11, false, false, false);
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        PhotoViewer photoViewer = this.f41411a;
        hq0 hq0Var = photoViewer.f35740r4;
        Rect rect = photoViewer.f35712o2;
        Rect rect2 = new Rect(rect);
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.f10489a;
        int i11 = defaultWindowInsets.f10490b;
        int i12 = defaultWindowInsets.f10491c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f35670j4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f35610d0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f35643g4[0][2] = photoViewer.f35610d0.getTranslationX();
            }
            bu0 bu0Var = photoViewer.f35601c0;
            if (bu0Var != null) {
                bu0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f35630f0;
        if (view2 != null) {
            photoViewer.f35639g0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f35639g0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f35630f0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f35583a0.setPadding(defaultWindowInsets.f10489a, 0, i12, 0);
        if (photoViewer.B != null) {
            AndroidUtilities.cancelRunOnUIThread(hq0Var);
            if (photoViewer.f35619e && photoViewer.f35670j4 == 0) {
                AndroidUtilities.runOnUIThread(hq0Var, 200L);
            }
        }
        return r0.m1.f46618b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        au0 au0Var;
        int i10;
        Bitmap bitmap;
        int i11;
        PhotoViewer photoViewer = this.f41411a;
        if (imageReceiver == photoViewer.f35805y4 && z10 && !z11) {
            if (!photoViewer.f35702n1 && ((photoViewer.f35731q4 == 1 || (i11 = photoViewer.Y1) == 1 || i11 == 11) && photoViewer.f35802y1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.ge0 ge0Var = photoViewer.f35802y1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.Y1;
                ge0Var.b(bitmap, orientation, (i12 == 1 || i12 == 11) ? false : true, true, photoViewer.f35811z1, null, null);
            }
            if (photoViewer.f35768u4.getVisibility() == 0) {
                photoViewer.f35583a0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver != photoViewer.f35805y4 || !z10 || (au0Var = photoViewer.d) == null || !au0Var.J() || photoViewer.f35644g5 || (i10 = photoViewer.Y1) == 1 || i10 == 11) {
            return;
        }
        if (photoViewer.P5) {
            photoViewer.N2();
        } else {
            photoViewer.Q5 = true;
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.P8;
        this.f41411a.e3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }
}
