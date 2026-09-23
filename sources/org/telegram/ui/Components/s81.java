package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class s81 implements Runnable {
    public final int f27875a;
    public final b91 f27876b;

    public s81(b91 b91Var, int i10) {
        this.f27875a = i10;
        this.f27876b = b91Var;
    }

    @Override
    public final void run() {
        switch (this.f27875a) {
            case 0:
                b91 b91Var = this.f27876b;
                x81 x81Var = b91Var.f22628f0;
                f71 f71Var = b91Var.f22619a;
                if (f71Var != null && f71Var.y()) {
                    x81Var.c((int) (f71Var.n() / 1000));
                    x81Var.f29965w = (int) (f71Var.j() / 1000);
                    x81Var.invalidate();
                    AndroidUtilities.runOnUIThread(b91Var.f22631i0, 1000L);
                    return;
                }
                return;
            default:
                b91 b91Var2 = this.f27876b;
                x81 x81Var2 = b91Var2.f22628f0;
                ImageView imageView = b91Var2.e;
                TextureView textureView = b91Var2.d;
                b91Var2.W = false;
                Bitmap bitmap = b91Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    b91Var2.h = null;
                }
                b91Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        b91Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = b91Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            b91Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (b91Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(b91Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                b91Var2.U = true;
                b91Var2.n();
                b91Var2.o();
                b91Var2.k();
                b91Var2.m();
                ViewGroup viewGroup = (ViewGroup) x81Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(x81Var2);
                }
                y81 y81Var = b91Var2.v;
                x81 x81Var3 = b91Var2.f22628f0;
                boolean z10 = b91Var2.U;
                int i10 = b91Var2.f22629g0;
                int i11 = b91Var2.f22630h0;
                b91Var2.f22623c.getVideoRotation();
                TextureView f7 = y81Var.f(x81Var3, z10, i10, i11, b91Var2.I);
                b91Var2.f22634n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                x81Var2.d(false, false);
                return;
        }
    }
}
