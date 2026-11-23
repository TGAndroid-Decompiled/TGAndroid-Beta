package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class s71 implements Runnable {
    public final int f39527a;
    public final a81 f39528b;

    public s71(a81 a81Var, int i7) {
        this.f39527a = i7;
        this.f39528b = a81Var;
    }

    @Override
    public final void run() {
        switch (this.f39527a) {
            case 0:
                a81 a81Var = this.f39528b;
                w71 w71Var = a81Var.f33408g0;
                h61 h61Var = a81Var.f33397a;
                if (h61Var != null && h61Var.d0()) {
                    w71Var.c((int) (h61Var.S() / 1000));
                    w71Var.f41533x = (int) (h61Var.K() / 1000);
                    w71Var.invalidate();
                    org.telegram.messenger.g0.h3(a81Var.f33411j0, 1000L);
                    return;
                }
                return;
            default:
                a81 a81Var2 = this.f39528b;
                w71 w71Var2 = a81Var2.f33408g0;
                ImageView imageView = a81Var2.f33404e;
                TextureView textureView = a81Var2.d;
                a81Var2.f33398a0 = false;
                Bitmap bitmap = a81Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    a81Var2.h = null;
                }
                a81Var2.T = true;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c10 = org.telegram.messenger.vr.c(width, height);
                        a81Var2.h = c10;
                        textureView.getBitmap(c10);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = a81Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            a81Var2.h = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    if (a81Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(a81Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                a81Var2.V = true;
                a81Var2.n();
                a81Var2.o();
                a81Var2.k();
                a81Var2.m();
                ViewGroup viewGroup = (ViewGroup) w71Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(w71Var2);
                }
                x71 x71Var = a81Var2.f33417w;
                w71 w71Var3 = a81Var2.f33408g0;
                boolean z10 = a81Var2.V;
                int i7 = a81Var2.f33409h0;
                int i10 = a81Var2.f33410i0;
                a81Var2.f33401c.getVideoRotation();
                TextureView f10 = x71Var.f(w71Var3, z10, i7, i10, a81Var2.J);
                a81Var2.f33414n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                w71Var2.d(false, false);
                return;
        }
    }
}
