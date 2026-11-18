package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class o71 implements Runnable {
    public final int f38010a;
    public final w71 f38011b;

    public o71(w71 w71Var, int i7) {
        this.f38010a = i7;
        this.f38011b = w71Var;
    }

    @Override
    public final void run() {
        switch (this.f38010a) {
            case 0:
                w71 w71Var = this.f38011b;
                s71 s71Var = w71Var.f41603g0;
                f61 f61Var = w71Var.f41592a;
                if (f61Var != null && f61Var.d0()) {
                    s71Var.c((int) (f61Var.S() / 1000));
                    s71Var.f39517x = (int) (f61Var.K() / 1000);
                    s71Var.invalidate();
                    org.telegram.messenger.g0.h3(w71Var.f41606j0, 1000L);
                    return;
                }
                return;
            default:
                w71 w71Var2 = this.f38011b;
                s71 s71Var2 = w71Var2.f41603g0;
                ImageView imageView = w71Var2.f41599e;
                TextureView textureView = w71Var2.d;
                w71Var2.f41593a0 = false;
                Bitmap bitmap = w71Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    w71Var2.h = null;
                }
                w71Var2.T = true;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c10 = org.telegram.messenger.vr.c(width, height);
                        w71Var2.h = c10;
                        textureView.getBitmap(c10);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = w71Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            w71Var2.h = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    if (w71Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(w71Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                w71Var2.V = true;
                w71Var2.n();
                w71Var2.o();
                w71Var2.k();
                w71Var2.m();
                ViewGroup viewGroup = (ViewGroup) s71Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(s71Var2);
                }
                t71 t71Var = w71Var2.f41612w;
                s71 s71Var3 = w71Var2.f41603g0;
                boolean z10 = w71Var2.V;
                int i7 = w71Var2.f41604h0;
                int i10 = w71Var2.f41605i0;
                w71Var2.f41596c.getVideoRotation();
                TextureView f10 = t71Var.f(s71Var3, z10, i7, i10, w71Var2.J);
                w71Var2.f41609n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                s71Var2.d(false, false);
                return;
        }
    }
}
