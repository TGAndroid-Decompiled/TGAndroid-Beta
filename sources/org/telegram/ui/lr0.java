package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class lr0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.a2, ImageReceiver.ImageReceiverDelegate, r0.n {
    public final PhotoViewer f38388a;

    public lr0(PhotoViewer photoViewer) {
        this.f38388a = photoViewer;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f38388a.w2(z10, i10, i11, false, false, false);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        PhotoViewer photoViewer = this.f38388a;
        dr0 dr0Var = photoViewer.f34067v4;
        Rect rect = photoViewer.f34038s2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f11526a;
        int i11 = defaultWindowInsets.f11527b;
        int i12 = defaultWindowInsets.f11528c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f33995n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f33940h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f33970k4[0][2] = photoViewer.f33940h0.getTranslationX();
            }
            xu0 xu0Var = photoViewer.f33931g0;
            if (xu0Var != null) {
                xu0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f33958j0;
        if (view2 != null) {
            photoViewer.f33966k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f33966k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f33958j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f33914e0.setPadding(defaultWindowInsets.f11526a, 0, i12, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(dr0Var);
            if (photoViewer.f33913e && photoViewer.f33995n4 == 0) {
                AndroidUtilities.runOnUIThread(dr0Var, 200L);
            }
        }
        return r0.l1.f45623b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        wu0 wu0Var;
        int i10;
        Bitmap bitmap;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f38388a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f34027r1 && ((photoViewer.f34058u4 == 1 || (i11 = photoViewer.f33897c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.gf0 gf0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.f33897c2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                gf0Var.b(bitmap, orientation, z13, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f34096y4.getVisibility() == 0) {
                photoViewer.f33914e0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (wu0Var = photoViewer.d) != null && wu0Var.J() && !photoViewer.f33971k5 && (i10 = photoViewer.f33897c2) != 1 && i10 != 11) {
            if (!photoViewer.T5) {
                photoViewer.U5 = true;
            } else {
                photoViewer.N2();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f38388a.e3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }
}
