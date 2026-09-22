package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class j91 implements Runnable {
    public final int f25331a;
    public final r91 f25332b;

    public j91(r91 r91Var, int i10) {
        this.f25331a = i10;
        this.f25332b = r91Var;
    }

    @Override
    public final void run() {
        switch (this.f25331a) {
            case 0:
                r91 r91Var = this.f25332b;
                n91 n91Var = r91Var.f27899f0;
                v71 v71Var = r91Var.f27890a;
                if (v71Var != null && v71Var.y()) {
                    n91Var.c((int) (v71Var.n() / 1000));
                    n91Var.f26713w = (int) (v71Var.j() / 1000);
                    n91Var.invalidate();
                    AndroidUtilities.runOnUIThread(r91Var.f27902i0, 1000L);
                    return;
                }
                return;
            default:
                r91 r91Var2 = this.f25332b;
                n91 n91Var2 = r91Var2.f27899f0;
                ImageView imageView = r91Var2.e;
                TextureView textureView = r91Var2.d;
                r91Var2.W = false;
                Bitmap bitmap = r91Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    r91Var2.h = null;
                }
                r91Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        r91Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = r91Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            r91Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (r91Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(r91Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                r91Var2.U = true;
                r91Var2.n();
                r91Var2.o();
                r91Var2.k();
                r91Var2.m();
                ViewGroup viewGroup = (ViewGroup) n91Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(n91Var2);
                }
                o91 o91Var = r91Var2.v;
                n91 n91Var3 = r91Var2.f27899f0;
                boolean z10 = r91Var2.U;
                int i10 = r91Var2.f27900g0;
                int i11 = r91Var2.f27901h0;
                r91Var2.f27894c.getVideoRotation();
                TextureView f7 = o91Var.f(n91Var3, z10, i10, i11, r91Var2.I);
                r91Var2.f27905n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                n91Var2.d(false, false);
                return;
        }
    }
}
