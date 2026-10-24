package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class ar0 implements org.telegram.ui.Components.b5, org.telegram.ui.ActionBar.z1, ImageReceiver.ImageReceiverDelegate, r0.n {
    public final PhotoViewer f35828a;

    public ar0(PhotoViewer photoViewer) {
        this.f35828a = photoViewer;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        PhotoViewer photoViewer = this.f35828a;
        sq0 sq0Var = photoViewer.f33736v4;
        Rect rect = photoViewer.f33707s2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.f12315a;
        int i11 = defaultWindowInsets.f12316b;
        int i12 = defaultWindowInsets.f12317c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f33664n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f33608h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f33639k4[0][2] = photoViewer.f33608h0.getTranslationX();
            }
            ku0 ku0Var = photoViewer.f33599g0;
            if (ku0Var != null) {
                ku0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f33626j0;
        if (view2 != null) {
            photoViewer.f33635k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f33635k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f33626j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f33582e0.setPadding(defaultWindowInsets.f12315a, 0, i12, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(sq0Var);
            if (photoViewer.e && photoViewer.f33664n4 == 0) {
                AndroidUtilities.runOnUIThread(sq0Var, 200L);
            }
        }
        return r0.k1.f45249b;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f35828a.y2(z10, i10, i11, false, false, false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ju0 ju0Var;
        int i10;
        Bitmap bitmap;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f35828a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f33696r1 && ((photoViewer.f33727u4 == 1 || (i11 = photoViewer.f33566c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.qf0 qf0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.f33566c2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                qf0Var.b(bitmap, orientation, z13, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f33765y4.getVisibility() == 0) {
                photoViewer.f33582e0.requestLayout();
            }
            photoViewer.S0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (ju0Var = photoViewer.d) != null && ju0Var.K() && !photoViewer.f33640k5 && (i10 = photoViewer.f33566c2) != 1 && i10 != 11) {
            if (!photoViewer.T5) {
                photoViewer.U5 = true;
            } else {
                photoViewer.P2();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.n5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f35828a.g3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.n5.b(this, imageReceiver);
    }
}
