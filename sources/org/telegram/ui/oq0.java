package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class oq0 implements org.telegram.ui.Components.x4, org.telegram.ui.ActionBar.b2, ImageReceiver.ImageReceiverDelegate, r0.o {
    public final PhotoViewer f41231a;

    public oq0(PhotoViewer photoViewer) {
        this.f41231a = photoViewer;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.P8;
        this.f41231a.w2(z10, i9, i10, false, false, false);
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        PhotoViewer photoViewer = this.f41231a;
        gq0 gq0Var = photoViewer.f35737r4;
        Rect rect = photoViewer.f35709o2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i9 = defaultWindowInsets.f10848a;
        int i10 = defaultWindowInsets.f10849b;
        int i11 = defaultWindowInsets.f10850c;
        rect.set(i9, i10, i11, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i12 = photoViewer.f35667j4;
            if (i12 == 1 || i12 == 3) {
                ClippingImageView clippingImageView = photoViewer.f35607d0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f35640g4[0][2] = photoViewer.f35607d0.getTranslationX();
            }
            au0 au0Var = photoViewer.f35598c0;
            if (au0Var != null) {
                au0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f35627f0;
        if (view2 != null) {
            photoViewer.f35636g0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i13 = photoViewer.f35636g0;
            marginLayoutParams.height = i13;
            marginLayoutParams.bottomMargin = (-i13) / 2;
            photoViewer.f35627f0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f35580a0.setPadding(defaultWindowInsets.f10848a, 0, i11, 0);
        if (photoViewer.B != null) {
            AndroidUtilities.cancelRunOnUIThread(gq0Var);
            if (photoViewer.f35616e && photoViewer.f35667j4 == 0) {
                AndroidUtilities.runOnUIThread(gq0Var, 200L);
            }
        }
        return r0.m1.f46928b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        zt0 zt0Var;
        int i9;
        Bitmap bitmap;
        boolean z13;
        int i10;
        PhotoViewer photoViewer = this.f41231a;
        if (imageReceiver == photoViewer.f35802y4 && z10 && !z11) {
            if (!photoViewer.f35699n1 && ((photoViewer.f35727q4 == 1 || (i10 = photoViewer.Y1) == 1 || i10 == 11) && photoViewer.f35799y1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.be0 be0Var = photoViewer.f35799y1;
                int orientation = imageReceiver.getOrientation();
                int i11 = photoViewer.Y1;
                if (i11 != 1 && i11 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                be0Var.b(bitmap, orientation, z13, true, photoViewer.f35808z1, null, null);
            }
            if (photoViewer.f35765u4.getVisibility() == 0) {
                photoViewer.f35580a0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver == photoViewer.f35802y4 && z10 && (zt0Var = photoViewer.d) != null && zt0Var.J() && !photoViewer.f35641g5 && (i9 = photoViewer.Y1) != 1 && i9 != 11) {
            if (!photoViewer.P5) {
                photoViewer.Q5 = true;
            } else {
                photoViewer.N2();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i9, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        Drawable[] drawableArr = PhotoViewer.P8;
        this.f41231a.e3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.g5.b(this, imageReceiver);
    }
}
