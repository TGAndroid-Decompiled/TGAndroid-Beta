package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class v91 implements Runnable {
    public final int f31388a;
    public final da1 f31389b;

    public v91(da1 da1Var, int i10) {
        this.f31388a = i10;
        this.f31389b = da1Var;
    }

    @Override
    public final void run() {
        switch (this.f31388a) {
            case 0:
                da1 da1Var = this.f31389b;
                z91 z91Var = da1Var.f25678f0;
                j81 j81Var = da1Var.f25669a;
                if (j81Var != null && j81Var.y()) {
                    z91Var.c((int) (j81Var.n() / 1000));
                    z91Var.f33206w = (int) (j81Var.j() / 1000);
                    z91Var.invalidate();
                    AndroidUtilities.runOnUIThread(da1Var.f25681i0, 1000L);
                    return;
                }
                return;
            default:
                da1 da1Var2 = this.f31389b;
                z91 z91Var2 = da1Var2.f25678f0;
                ImageView imageView = da1Var2.e;
                TextureView textureView = da1Var2.d;
                da1Var2.W = false;
                Bitmap bitmap = da1Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    da1Var2.h = null;
                }
                da1Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        da1Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = da1Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            da1Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (da1Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(da1Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                da1Var2.U = true;
                da1Var2.n();
                da1Var2.o();
                da1Var2.k();
                da1Var2.m();
                ViewGroup viewGroup = (ViewGroup) z91Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(z91Var2);
                }
                aa1 aa1Var = da1Var2.v;
                z91 z91Var3 = da1Var2.f25678f0;
                boolean z10 = da1Var2.U;
                int i10 = da1Var2.f25679g0;
                int i11 = da1Var2.f25680h0;
                da1Var2.f25673c.getVideoRotation();
                TextureView f7 = aa1Var.f(z91Var3, z10, i10, i11, da1Var2.I);
                da1Var2.f25684n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                z91Var2.d(false, false);
                return;
        }
    }
}
