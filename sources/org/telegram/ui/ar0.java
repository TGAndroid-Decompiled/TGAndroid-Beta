package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class ar0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.a2, ImageReceiver.ImageReceiverDelegate, r0.n {
    public final PhotoViewer f35507a;

    public ar0(PhotoViewer photoViewer) {
        this.f35507a = photoViewer;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        PhotoViewer photoViewer = this.f35507a;
        sq0 sq0Var = photoViewer.f33427v4;
        Rect rect = photoViewer.f33398s2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.f12286a;
        int i11 = defaultWindowInsets.f12287b;
        int i12 = defaultWindowInsets.f12288c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f33355n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f33299h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f33330k4[0][2] = photoViewer.f33299h0.getTranslationX();
            }
            ku0 ku0Var = photoViewer.f33290g0;
            if (ku0Var != null) {
                ku0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f33317j0;
        if (view2 != null) {
            photoViewer.f33326k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f33326k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f33317j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f33273e0.setPadding(defaultWindowInsets.f12286a, 0, i12, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(sq0Var);
            if (photoViewer.e && photoViewer.f33355n4 == 0) {
                AndroidUtilities.runOnUIThread(sq0Var, 200L);
            }
        }
        return r0.k1.f44872b;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f35507a.w2(z10, i10, i11, false, false, false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ju0 ju0Var;
        int i10;
        Bitmap bitmap;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f35507a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f33387r1 && ((photoViewer.f33418u4 == 1 || (i11 = photoViewer.f33257c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.nf0 nf0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.f33257c2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                nf0Var.b(bitmap, orientation, z13, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f33456y4.getVisibility() == 0) {
                photoViewer.f33273e0.requestLayout();
            }
            photoViewer.R0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (ju0Var = photoViewer.d) != null && ju0Var.K() && !photoViewer.f33331k5 && (i10 = photoViewer.f33257c2) != 1 && i10 != 11) {
            if (!photoViewer.T5) {
                photoViewer.U5 = true;
            } else {
                photoViewer.N2();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.k5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f35507a.e3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.k5.b(this, imageReceiver);
    }
}
