package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class e71 implements Runnable {
    public final int f34249a;
    public final m71 f34250b;

    public e71(m71 m71Var, int i7) {
        this.f34249a = i7;
        this.f34250b = m71Var;
    }

    @Override
    public final void run() {
        switch (this.f34249a) {
            case 0:
                m71 m71Var = this.f34250b;
                i71 i71Var = m71Var.f37149g0;
                u51 u51Var = m71Var.f37138a;
                if (u51Var != null && u51Var.d0()) {
                    i71Var.c((int) (u51Var.S() / 1000));
                    i71Var.f35498x = (int) (u51Var.K() / 1000);
                    i71Var.invalidate();
                    org.telegram.messenger.g0.i3(m71Var.f37152j0, 1000L);
                    return;
                }
                return;
            default:
                m71 m71Var2 = this.f34250b;
                i71 i71Var2 = m71Var2.f37149g0;
                ImageView imageView = m71Var2.f37145e;
                TextureView textureView = m71Var2.d;
                m71Var2.f37139a0 = false;
                Bitmap bitmap = m71Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    m71Var2.h = null;
                }
                m71Var2.T = true;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c10 = org.telegram.messenger.xr.c(width, height);
                        m71Var2.h = c10;
                        textureView.getBitmap(c10);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = m71Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            m71Var2.h = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    if (m71Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(m71Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                m71Var2.V = true;
                m71Var2.n();
                m71Var2.o();
                m71Var2.k();
                m71Var2.m();
                ViewGroup viewGroup = (ViewGroup) i71Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(i71Var2);
                }
                j71 j71Var = m71Var2.f37158w;
                i71 i71Var3 = m71Var2.f37149g0;
                boolean z10 = m71Var2.V;
                int i7 = m71Var2.f37150h0;
                int i10 = m71Var2.f37151i0;
                m71Var2.f37142c.getVideoRotation();
                TextureView f10 = j71Var.f(i71Var3, z10, i7, i10, m71Var2.J);
                m71Var2.f37155n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                i71Var2.d(false, false);
                return;
        }
    }
}
