package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class c71 implements Runnable {
    public final int f32450a;
    public final k71 f32451b;

    public c71(k71 k71Var, int i7) {
        this.f32450a = i7;
        this.f32451b = k71Var;
    }

    @Override
    public final void run() {
        switch (this.f32450a) {
            case 0:
                k71 k71Var = this.f32451b;
                g71 g71Var = k71Var.f35222f0;
                s51 s51Var = k71Var.f35212a;
                if (s51Var != null && s51Var.d0()) {
                    g71Var.c((int) (s51Var.S() / 1000));
                    g71Var.f33840x = (int) (s51Var.K() / 1000);
                    g71Var.invalidate();
                    org.telegram.messenger.g0.i3(k71Var.f35225i0, 1000L);
                    return;
                }
                return;
            default:
                k71 k71Var2 = this.f32451b;
                g71 g71Var2 = k71Var2.f35222f0;
                ImageView imageView = k71Var2.f35219e;
                TextureView textureView = k71Var2.d;
                k71Var2.W = false;
                Bitmap bitmap = k71Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    k71Var2.h = null;
                }
                k71Var2.S = true;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c10 = org.telegram.messenger.as.c(width, height);
                        k71Var2.h = c10;
                        textureView.getBitmap(c10);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = k71Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            k71Var2.h = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    if (k71Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(k71Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                k71Var2.U = true;
                k71Var2.n();
                k71Var2.o();
                k71Var2.k();
                k71Var2.m();
                ViewGroup viewGroup = (ViewGroup) g71Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(g71Var2);
                }
                h71 h71Var = k71Var2.f35231w;
                g71 g71Var3 = k71Var2.f35222f0;
                boolean z9 = k71Var2.U;
                int i7 = k71Var2.f35223g0;
                int i10 = k71Var2.f35224h0;
                k71Var2.f35216c.getVideoRotation();
                TextureView f10 = h71Var.f(g71Var3, z9, i7, i10, k71Var2.I);
                k71Var2.f35228n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                g71Var2.d(false, false);
                return;
        }
    }
}
