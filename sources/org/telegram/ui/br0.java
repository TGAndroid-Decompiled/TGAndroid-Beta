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
    public final PhotoViewer f35592a;

    public br0(PhotoViewer photoViewer) {
        this.f35592a = photoViewer;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        Drawable[] drawableArr = PhotoViewer.Q8;
        this.f35592a.w2(z4, i10, i11, false, false, false);
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        PhotoViewer photoViewer = this.f35592a;
        tq0 tq0Var = photoViewer.f34389s4;
        Rect rect = photoViewer.f34358p2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.f7757a;
        int i11 = defaultWindowInsets.f7758b;
        int i12 = defaultWindowInsets.f7759c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f34316k4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f34258e0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f34289h4[0][2] = photoViewer.f34258e0.getTranslationX();
            }
            pu0 pu0Var = photoViewer.f34248d0;
            if (pu0Var != null) {
                pu0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f34276g0;
        if (view2 != null) {
            photoViewer.f34285h0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f34285h0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f34276g0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f34230b0.setPadding(defaultWindowInsets.f7757a, 0, i12, 0);
        if (photoViewer.C != null) {
            AndroidUtilities.cancelRunOnUIThread(tq0Var);
            if (photoViewer.f34257e && photoViewer.f34316k4 == 0) {
                AndroidUtilities.runOnUIThread(tq0Var, 200L);
            }
        }
        return r0.m1.f46482b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        ou0 ou0Var;
        int i10;
        Bitmap bitmap;
        boolean z12;
        int i11;
        PhotoViewer photoViewer = this.f35592a;
        if (imageReceiver == photoViewer.z4 && z4 && !z10) {
            if (!photoViewer.f34348o1 && ((photoViewer.f34379r4 == 1 || (i11 = photoViewer.Z1) == 1 || i11 == 11) && photoViewer.f34450z1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.af0 af0Var = photoViewer.f34450z1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.Z1;
                if (i12 != 1 && i12 != 11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                af0Var.b(bitmap, orientation, z12, true, photoViewer.A1, null, null);
            }
            if (photoViewer.f34414v4.getVisibility() == 0) {
                photoViewer.f34230b0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver == photoViewer.z4 && z4 && (ou0Var = photoViewer.d) != null && ou0Var.J() && !photoViewer.f34290h5 && (i10 = photoViewer.Z1) != 1 && i10 != 11) {
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
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.Q8;
        this.f35592a.e3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }
}
