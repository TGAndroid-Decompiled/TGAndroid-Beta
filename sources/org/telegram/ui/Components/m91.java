package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class m91 implements Runnable {
    public final int f28484a;
    public final u91 f28485b;

    public m91(u91 u91Var, int i10) {
        this.f28484a = i10;
        this.f28485b = u91Var;
    }

    @Override
    public final void run() {
        switch (this.f28484a) {
            case 0:
                u91 u91Var = this.f28485b;
                q91 q91Var = u91Var.f30942f0;
                a81 a81Var = u91Var.f30933a;
                if (a81Var != null && a81Var.y()) {
                    q91Var.c((int) (a81Var.n() / 1000));
                    q91Var.f29620w = (int) (a81Var.j() / 1000);
                    q91Var.invalidate();
                    AndroidUtilities.runOnUIThread(u91Var.f30945i0, 1000L);
                    return;
                }
                return;
            default:
                u91 u91Var2 = this.f28485b;
                q91 q91Var2 = u91Var2.f30942f0;
                ImageView imageView = u91Var2.e;
                TextureView textureView = u91Var2.d;
                u91Var2.W = false;
                Bitmap bitmap = u91Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    u91Var2.h = null;
                }
                u91Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        u91Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = u91Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            u91Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (u91Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(u91Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                u91Var2.U = true;
                u91Var2.n();
                u91Var2.o();
                u91Var2.k();
                u91Var2.m();
                ViewGroup viewGroup = (ViewGroup) q91Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(q91Var2);
                }
                r91 r91Var = u91Var2.v;
                q91 q91Var3 = u91Var2.f30942f0;
                boolean z10 = u91Var2.U;
                int i10 = u91Var2.f30943g0;
                int i11 = u91Var2.f30944h0;
                u91Var2.f30937c.getVideoRotation();
                TextureView f7 = r91Var.f(q91Var3, z10, i10, i11, u91Var2.I);
                u91Var2.f30948n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                q91Var2.d(false, false);
                return;
        }
    }
}
