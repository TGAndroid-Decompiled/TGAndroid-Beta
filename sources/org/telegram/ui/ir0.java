package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class ir0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.z1, ImageReceiver.ImageReceiverDelegate, r0.n {
    public final PhotoViewer f34572a;

    public ir0(PhotoViewer photoViewer) {
        this.f34572a = photoViewer;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f34572a.v2(z10, i10, i11, false, false, false);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        PhotoViewer photoViewer = this.f34572a;
        ar0 ar0Var = photoViewer.f31375v4;
        Rect rect = photoViewer.f31346s2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f10576a;
        int i11 = defaultWindowInsets.f10577b;
        int i12 = defaultWindowInsets.f10578c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f31303n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f31248h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f31278k4[0][2] = photoViewer.f31248h0.getTranslationX();
            }
            uu0 uu0Var = photoViewer.f31239g0;
            if (uu0Var != null) {
                uu0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f31266j0;
        if (view2 != null) {
            photoViewer.f31274k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f31274k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f31266j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f31222e0.setPadding(defaultWindowInsets.f10576a, 0, i12, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(ar0Var);
            if (photoViewer.e && photoViewer.f31303n4 == 0) {
                AndroidUtilities.runOnUIThread(ar0Var, 200L);
            }
        }
        return r0.l1.f42138b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        tu0 tu0Var;
        int i10;
        Bitmap bitmap;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f34572a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f31335r1 && ((photoViewer.f31366u4 == 1 || (i11 = photoViewer.f31206c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.ff0 ff0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.f31206c2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ff0Var.b(bitmap, orientation, z13, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f31404y4.getVisibility() == 0) {
                photoViewer.f31222e0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (tu0Var = photoViewer.d) != null && tu0Var.J() && !photoViewer.f31279k5 && (i10 = photoViewer.f31206c2) != 1 && i10 != 11) {
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
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f34572a.d3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }
}
