package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class x61 implements Runnable {
    public final int f40179a;
    public final f71 f40180b;

    public x61(f71 f71Var, int i7) {
        this.f40179a = i7;
        this.f40180b = f71Var;
    }

    @Override
    public final void run() {
        switch (this.f40179a) {
            case 0:
                f71 f71Var = this.f40180b;
                b71 b71Var = f71Var.f33525f0;
                n51 n51Var = f71Var.f33515a;
                if (n51Var != null && n51Var.d0()) {
                    b71Var.c((int) (n51Var.S() / 1000));
                    b71Var.f32032x = (int) (n51Var.K() / 1000);
                    b71Var.invalidate();
                    org.telegram.messenger.g0.i3(f71Var.f33528i0, 1000L);
                    return;
                }
                return;
            default:
                f71 f71Var2 = this.f40180b;
                b71 b71Var2 = f71Var2.f33525f0;
                ImageView imageView = f71Var2.f33522e;
                TextureView textureView = f71Var2.d;
                f71Var2.W = false;
                Bitmap bitmap = f71Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    f71Var2.h = null;
                }
                f71Var2.S = true;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c10 = org.telegram.messenger.as.c(width, height);
                        f71Var2.h = c10;
                        textureView.getBitmap(c10);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = f71Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            f71Var2.h = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    if (f71Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(f71Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                f71Var2.U = true;
                f71Var2.n();
                f71Var2.o();
                f71Var2.k();
                f71Var2.m();
                ViewGroup viewGroup = (ViewGroup) b71Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(b71Var2);
                }
                c71 c71Var = f71Var2.f33534w;
                b71 b71Var3 = f71Var2.f33525f0;
                boolean z9 = f71Var2.U;
                int i7 = f71Var2.f33526g0;
                int i10 = f71Var2.f33527h0;
                f71Var2.f33519c.getVideoRotation();
                TextureView f10 = c71Var.f(b71Var3, z9, i7, i10, f71Var2.I);
                f71Var2.f33531n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                b71Var2.d(false, false);
                return;
        }
    }
}
