package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class d71 implements Runnable {
    public final int f32829a;
    public final l71 f32830b;

    public d71(l71 l71Var, int i7) {
        this.f32829a = i7;
        this.f32830b = l71Var;
    }

    @Override
    public final void run() {
        switch (this.f32829a) {
            case 0:
                l71 l71Var = this.f32830b;
                h71 h71Var = l71Var.f35580f0;
                t51 t51Var = l71Var.f35570a;
                if (t51Var != null && t51Var.d0()) {
                    h71Var.c((int) (t51Var.S() / 1000));
                    h71Var.f34159x = (int) (t51Var.K() / 1000);
                    h71Var.invalidate();
                    org.telegram.messenger.g0.i3(l71Var.f35583i0, 1000L);
                    return;
                }
                return;
            default:
                l71 l71Var2 = this.f32830b;
                h71 h71Var2 = l71Var2.f35580f0;
                ImageView imageView = l71Var2.f35577e;
                TextureView textureView = l71Var2.d;
                l71Var2.W = false;
                Bitmap bitmap = l71Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    l71Var2.h = null;
                }
                l71Var2.S = true;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c10 = org.telegram.messenger.as.c(width, height);
                        l71Var2.h = c10;
                        textureView.getBitmap(c10);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = l71Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            l71Var2.h = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    if (l71Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(l71Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                l71Var2.U = true;
                l71Var2.n();
                l71Var2.o();
                l71Var2.k();
                l71Var2.m();
                ViewGroup viewGroup = (ViewGroup) h71Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(h71Var2);
                }
                i71 i71Var = l71Var2.f35589w;
                h71 h71Var3 = l71Var2.f35580f0;
                boolean z9 = l71Var2.U;
                int i7 = l71Var2.f35581g0;
                int i10 = l71Var2.f35582h0;
                l71Var2.f35574c.getVideoRotation();
                TextureView f10 = i71Var.f(h71Var3, z9, i7, i10, l71Var2.I);
                l71Var2.f35586n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                h71Var2.d(false, false);
                return;
        }
    }
}
