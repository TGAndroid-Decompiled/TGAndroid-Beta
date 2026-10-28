package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class fa1 implements Runnable {
    public final int f28089a;
    public final na1 f28090b;

    public fa1(na1 na1Var, int i10) {
        this.f28089a = i10;
        this.f28090b = na1Var;
    }

    @Override
    public final void run() {
        switch (this.f28089a) {
            case 0:
                na1 na1Var = this.f28090b;
                ja1 ja1Var = na1Var.f30816f0;
                t81 t81Var = na1Var.f30807a;
                if (t81Var != null && t81Var.y()) {
                    ja1Var.c((int) (t81Var.n() / 1000));
                    ja1Var.f29609w = (int) (t81Var.j() / 1000);
                    ja1Var.invalidate();
                    AndroidUtilities.runOnUIThread(na1Var.f30819i0, 1000L);
                    return;
                }
                return;
            default:
                na1 na1Var2 = this.f28090b;
                ja1 ja1Var2 = na1Var2.f30816f0;
                ImageView imageView = na1Var2.e;
                TextureView textureView = na1Var2.d;
                na1Var2.W = false;
                Bitmap bitmap = na1Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    na1Var2.h = null;
                }
                na1Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        na1Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = na1Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            na1Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (na1Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(na1Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                na1Var2.U = true;
                na1Var2.n();
                na1Var2.o();
                na1Var2.k();
                na1Var2.m();
                ViewGroup viewGroup = (ViewGroup) ja1Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(ja1Var2);
                }
                ka1 ka1Var = na1Var2.v;
                ja1 ja1Var3 = na1Var2.f30816f0;
                boolean z10 = na1Var2.U;
                int i10 = na1Var2.f30817g0;
                int i11 = na1Var2.f30818h0;
                na1Var2.f30811c.getVideoRotation();
                TextureView f7 = ka1Var.f(ja1Var3, z10, i10, i11, na1Var2.I);
                na1Var2.f30822n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                ja1Var2.d(false, false);
                return;
        }
    }
}
