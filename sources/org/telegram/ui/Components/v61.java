package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class v61 implements Runnable {
    public final int f39021a;
    public final d71 f39022b;

    public v61(d71 d71Var, int i3) {
        this.f39021a = i3;
        this.f39022b = d71Var;
    }

    @Override
    public final void run() {
        switch (this.f39021a) {
            case 0:
                d71 d71Var = this.f39022b;
                z61 z61Var = d71Var.f33007g0;
                m51 m51Var = d71Var.f32996a;
                if (m51Var != null && m51Var.d0()) {
                    z61Var.c((int) (m51Var.S() / 1000));
                    z61Var.f40938x = (int) (m51Var.K() / 1000);
                    z61Var.invalidate();
                    org.telegram.messenger.g0.i3(d71Var.f33010j0, 1000L);
                    return;
                }
                return;
            default:
                d71 d71Var2 = this.f39022b;
                z61 z61Var2 = d71Var2.f33007g0;
                ImageView imageView = d71Var2.f33003e;
                TextureView textureView = d71Var2.d;
                d71Var2.f32997a0 = false;
                Bitmap bitmap = d71Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    d71Var2.h = null;
                }
                d71Var2.T = true;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c2 = org.telegram.messenger.sr.c(width, height);
                        d71Var2.h = c2;
                        textureView.getBitmap(c2);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = d71Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            d71Var2.h = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    if (d71Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(d71Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                d71Var2.V = true;
                d71Var2.n();
                d71Var2.o();
                d71Var2.k();
                d71Var2.m();
                ViewGroup viewGroup = (ViewGroup) z61Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(z61Var2);
                }
                a71 a71Var = d71Var2.f33016w;
                z61 z61Var3 = d71Var2.f33007g0;
                boolean z10 = d71Var2.V;
                int i3 = d71Var2.f33008h0;
                int i10 = d71Var2.f33009i0;
                d71Var2.f33000c.getVideoRotation();
                TextureView f10 = a71Var.f(z61Var3, z10, i3, i10, d71Var2.J);
                d71Var2.f33013n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                z61Var2.d(false, false);
                return;
        }
    }
}
