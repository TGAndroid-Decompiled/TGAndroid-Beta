package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class br0 implements org.telegram.ui.Components.y4, org.telegram.ui.ActionBar.c2, ImageReceiver.ImageReceiverDelegate, r0.o {
    public final PhotoViewer f32939a;

    public br0(PhotoViewer photoViewer) {
        this.f32939a = photoViewer;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        Drawable[] drawableArr = PhotoViewer.Q8;
        this.f32939a.w2(z4, i10, i11, false, false, false);
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        PhotoViewer photoViewer = this.f32939a;
        tq0 tq0Var = photoViewer.f31837s4;
        Rect rect = photoViewer.f31806p2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.f7196a;
        int i11 = defaultWindowInsets.f7197b;
        int i12 = defaultWindowInsets.f7198c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f31764k4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f31706e0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f31737h4[0][2] = photoViewer.f31706e0.getTranslationX();
            }
            pu0 pu0Var = photoViewer.f31697d0;
            if (pu0Var != null) {
                pu0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f31724g0;
        if (view2 != null) {
            photoViewer.f31733h0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f31733h0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f31724g0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f31679b0.setPadding(defaultWindowInsets.f7196a, 0, i12, 0);
        if (photoViewer.C != null) {
            AndroidUtilities.cancelRunOnUIThread(tq0Var);
            if (photoViewer.e && photoViewer.f31764k4 == 0) {
                AndroidUtilities.runOnUIThread(tq0Var, 200L);
            }
        }
        return r0.m1.f43153b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        ou0 ou0Var;
        int i10;
        Bitmap bitmap;
        boolean z12;
        int i11;
        PhotoViewer photoViewer = this.f32939a;
        if (imageReceiver == photoViewer.z4 && z4 && !z10) {
            if (!photoViewer.f31796o1 && ((photoViewer.f31827r4 == 1 || (i11 = photoViewer.Z1) == 1 || i11 == 11) && photoViewer.f31898z1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.ze0 ze0Var = photoViewer.f31898z1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.Z1;
                if (i12 != 1 && i12 != 11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ze0Var.b(bitmap, orientation, z12, true, photoViewer.A1, null, null);
            }
            if (photoViewer.f31862v4.getVisibility() == 0) {
                photoViewer.f31679b0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver == photoViewer.z4 && z4 && (ou0Var = photoViewer.d) != null && ou0Var.J() && !photoViewer.f31738h5 && (i10 = photoViewer.Z1) != 1 && i10 != 11) {
            if (!photoViewer.Q5) {
                photoViewer.R5 = true;
            } else {
                photoViewer.N2();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.Q8;
        this.f32939a.e3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }
}
