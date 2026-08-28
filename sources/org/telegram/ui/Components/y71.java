package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class y71 implements Runnable {
    public final int f34883a;
    public final g81 f34884b;

    public y71(g81 g81Var, int i9) {
        this.f34883a = i9;
        this.f34884b = g81Var;
    }

    @Override
    public final void run() {
        switch (this.f34883a) {
            case 0:
                g81 g81Var = this.f34884b;
                c81 c81Var = g81Var.f28695b0;
                k61 k61Var = g81Var.f28692a;
                if (k61Var != null && k61Var.z()) {
                    c81Var.c((int) (k61Var.o() / 1000));
                    c81Var.f27422w = (int) (k61Var.k() / 1000);
                    c81Var.invalidate();
                    AndroidUtilities.runOnUIThread(g81Var.f28700e0, 1000L);
                    return;
                }
                return;
            default:
                g81 g81Var2 = this.f34884b;
                c81 c81Var2 = g81Var2.f28695b0;
                ImageView imageView = g81Var2.f28699e;
                TextureView textureView = g81Var2.d;
                g81Var2.S = false;
                Bitmap bitmap = g81Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    g81Var2.h = null;
                }
                g81Var2.O = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        g81Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th) {
                        Bitmap bitmap2 = g81Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            g81Var2.h = null;
                        }
                        FileLog.e(th);
                    }
                    if (g81Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(g81Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                g81Var2.Q = true;
                g81Var2.n();
                g81Var2.o();
                g81Var2.k();
                g81Var2.m();
                ViewGroup viewGroup = (ViewGroup) c81Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(c81Var2);
                }
                d81 d81Var = g81Var2.v;
                c81 c81Var3 = g81Var2.f28695b0;
                boolean z10 = g81Var2.Q;
                int i9 = g81Var2.f28697c0;
                int i10 = g81Var2.f28698d0;
                g81Var2.f28696c.getVideoRotation();
                TextureView f10 = d81Var.f(c81Var3, z10, i9, i10, g81Var2.E);
                g81Var2.f28704n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                c81Var2.d(false, false);
                return;
        }
    }
}
