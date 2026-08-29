package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class oq0 implements org.telegram.ui.Components.b5, org.telegram.ui.ActionBar.b2, ImageReceiver.ImageReceiverDelegate, r0.o {
    public final PhotoViewer f41212a;

    public oq0(PhotoViewer photoViewer) {
        this.f41212a = photoViewer;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.P8;
        this.f41212a.w2(z10, i10, i11, false, false, false);
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        PhotoViewer photoViewer = this.f41212a;
        gq0 gq0Var = photoViewer.f35804r4;
        Rect rect = photoViewer.f35775o2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.f8186a;
        int i11 = defaultWindowInsets.f8187b;
        int i12 = defaultWindowInsets.f8188c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f35733j4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f35673d0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f35706g4[0][2] = photoViewer.f35673d0.getTranslationX();
            }
            yt0 yt0Var = photoViewer.f35666c0;
            if (yt0Var != null) {
                yt0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f35693f0;
        if (view2 != null) {
            photoViewer.f35702g0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f35702g0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f35693f0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f35647a0.setPadding(defaultWindowInsets.f8186a, 0, i12, 0);
        if (photoViewer.B != null) {
            AndroidUtilities.cancelRunOnUIThread(gq0Var);
            if (photoViewer.f35682e && photoViewer.f35733j4 == 0) {
                AndroidUtilities.runOnUIThread(gq0Var, 200L);
            }
        }
        return r0.m1.f46842b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xt0 xt0Var;
        int i10;
        Bitmap bitmap;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f41212a;
        if (imageReceiver == photoViewer.f35869y4 && z10 && !z11) {
            if (!photoViewer.f35765n1 && ((photoViewer.f35795q4 == 1 || (i11 = photoViewer.Y1) == 1 || i11 == 11) && photoViewer.f35866y1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.pe0 pe0Var = photoViewer.f35866y1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.Y1;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                pe0Var.b(bitmap, orientation, z13, true, photoViewer.f35874z1, null, null);
            }
            if (photoViewer.f35831u4.getVisibility() == 0) {
                photoViewer.f35647a0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver == photoViewer.f35869y4 && z10 && (xt0Var = photoViewer.d) != null && xt0Var.J() && !photoViewer.f35707g5 && (i10 = photoViewer.Y1) != 1 && i10 != 11) {
            if (!photoViewer.P5) {
                photoViewer.Q5 = true;
            } else {
                photoViewer.N2();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.P8;
        this.f41212a.e3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }
}
