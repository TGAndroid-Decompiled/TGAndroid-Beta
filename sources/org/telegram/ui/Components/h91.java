package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class h91 implements Runnable {
    public final int f24583a;
    public final p91 f24584b;

    public h91(p91 p91Var, int i10) {
        this.f24583a = i10;
        this.f24584b = p91Var;
    }

    @Override
    public final void run() {
        switch (this.f24583a) {
            case 0:
                p91 p91Var = this.f24584b;
                l91 l91Var = p91Var.f27220f0;
                t71 t71Var = p91Var.f27211a;
                if (t71Var != null && t71Var.y()) {
                    l91Var.c((int) (t71Var.n() / 1000));
                    l91Var.f26086w = (int) (t71Var.j() / 1000);
                    l91Var.invalidate();
                    AndroidUtilities.runOnUIThread(p91Var.f27223i0, 1000L);
                    return;
                }
                return;
            default:
                p91 p91Var2 = this.f24584b;
                l91 l91Var2 = p91Var2.f27220f0;
                ImageView imageView = p91Var2.e;
                TextureView textureView = p91Var2.d;
                p91Var2.W = false;
                Bitmap bitmap = p91Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    p91Var2.h = null;
                }
                p91Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        p91Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = p91Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            p91Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (p91Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(p91Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                p91Var2.U = true;
                p91Var2.n();
                p91Var2.o();
                p91Var2.k();
                p91Var2.m();
                ViewGroup viewGroup = (ViewGroup) l91Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(l91Var2);
                }
                m91 m91Var = p91Var2.v;
                l91 l91Var3 = p91Var2.f27220f0;
                boolean z10 = p91Var2.U;
                int i10 = p91Var2.f27221g0;
                int i11 = p91Var2.f27222h0;
                p91Var2.f27215c.getVideoRotation();
                TextureView f7 = m91Var.f(l91Var3, z10, i10, i11, p91Var2.I);
                p91Var2.f27226n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                l91Var2.d(false, false);
                return;
        }
    }
}
