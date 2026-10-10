package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class z91 implements Runnable {
    public final int f33560a;
    public final ia1 f33561b;

    public z91(ia1 ia1Var, int i10) {
        this.f33560a = i10;
        this.f33561b = ia1Var;
    }

    @Override
    public final void run() {
        switch (this.f33560a) {
            case 0:
                ia1 ia1Var = this.f33561b;
                da1 da1Var = ia1Var.f27328f0;
                l81 l81Var = ia1Var.f27318a;
                if (l81Var != null && l81Var.y()) {
                    da1Var.c((int) (l81Var.n() / 1000));
                    da1Var.f25632w = (int) (l81Var.j() / 1000);
                    da1Var.invalidate();
                    AndroidUtilities.runOnUIThread(ia1Var.f27331i0, 1000L);
                    return;
                }
                return;
            default:
                ia1 ia1Var2 = this.f33561b;
                da1 da1Var2 = ia1Var2.f27328f0;
                ImageView imageView = ia1Var2.f27325e;
                TextureView textureView = ia1Var2.d;
                ia1Var2.W = false;
                Bitmap bitmap = ia1Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    ia1Var2.h = null;
                }
                ia1Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        ia1Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = ia1Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            ia1Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (ia1Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(ia1Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                ia1Var2.U = true;
                ia1Var2.n();
                ia1Var2.o();
                ia1Var2.k();
                ia1Var2.m();
                ViewGroup viewGroup = (ViewGroup) da1Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(da1Var2);
                }
                ea1 ea1Var = ia1Var2.v;
                da1 da1Var3 = ia1Var2.f27328f0;
                boolean z10 = ia1Var2.U;
                int i10 = ia1Var2.f27329g0;
                int i11 = ia1Var2.f27330h0;
                ia1Var2.f27322c.getVideoRotation();
                TextureView f7 = ea1Var.f(da1Var3, z10, i10, i11, ia1Var2.I);
                ia1Var2.f27334n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                da1Var2.d(false, false);
                return;
        }
    }
}
