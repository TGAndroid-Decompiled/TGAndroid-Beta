package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class aa1 implements Runnable {
    public final int f24482a;
    public final ia1 f24483b;

    public aa1(ia1 ia1Var, int i10) {
        this.f24482a = i10;
        this.f24483b = ia1Var;
    }

    @Override
    public final void run() {
        switch (this.f24482a) {
            case 0:
                ia1 ia1Var = this.f24483b;
                ea1 ea1Var = ia1Var.f27256f0;
                m81 m81Var = ia1Var.f27246a;
                if (m81Var != null && m81Var.y()) {
                    ea1Var.c((int) (m81Var.n() / 1000));
                    ea1Var.f25950w = (int) (m81Var.j() / 1000);
                    ea1Var.invalidate();
                    AndroidUtilities.runOnUIThread(ia1Var.f27259i0, 1000L);
                    return;
                }
                return;
            default:
                ia1 ia1Var2 = this.f24483b;
                ea1 ea1Var2 = ia1Var2.f27256f0;
                ImageView imageView = ia1Var2.f27253e;
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
                ViewGroup viewGroup = (ViewGroup) ea1Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(ea1Var2);
                }
                fa1 fa1Var = ia1Var2.v;
                ea1 ea1Var3 = ia1Var2.f27256f0;
                boolean z10 = ia1Var2.U;
                int i10 = ia1Var2.f27257g0;
                int i11 = ia1Var2.f27258h0;
                ia1Var2.f27250c.getVideoRotation();
                TextureView f7 = fa1Var.f(ea1Var3, z10, i10, i11, ia1Var2.I);
                ia1Var2.f27262n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                ea1Var2.d(false, false);
                return;
        }
    }
}
