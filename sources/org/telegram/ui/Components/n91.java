package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class n91 implements Runnable {
    public final int f28704a;
    public final v91 f28705b;

    public n91(v91 v91Var, int i10) {
        this.f28704a = i10;
        this.f28705b = v91Var;
    }

    @Override
    public final void run() {
        switch (this.f28704a) {
            case 0:
                v91 v91Var = this.f28705b;
                r91 r91Var = v91Var.f31230f0;
                b81 b81Var = v91Var.f31221a;
                if (b81Var != null && b81Var.y()) {
                    r91Var.c((int) (b81Var.n() / 1000));
                    r91Var.f29911w = (int) (b81Var.j() / 1000);
                    r91Var.invalidate();
                    AndroidUtilities.runOnUIThread(v91Var.f31233i0, 1000L);
                    return;
                }
                return;
            default:
                v91 v91Var2 = this.f28705b;
                r91 r91Var2 = v91Var2.f31230f0;
                ImageView imageView = v91Var2.e;
                TextureView textureView = v91Var2.d;
                v91Var2.W = false;
                Bitmap bitmap = v91Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    v91Var2.h = null;
                }
                v91Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        v91Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = v91Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            v91Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (v91Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(v91Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                v91Var2.U = true;
                v91Var2.n();
                v91Var2.o();
                v91Var2.k();
                v91Var2.m();
                ViewGroup viewGroup = (ViewGroup) r91Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(r91Var2);
                }
                s91 s91Var = v91Var2.v;
                r91 r91Var3 = v91Var2.f31230f0;
                boolean z10 = v91Var2.U;
                int i10 = v91Var2.f31231g0;
                int i11 = v91Var2.f31232h0;
                v91Var2.f31225c.getVideoRotation();
                TextureView f7 = s91Var.f(r91Var3, z10, i10, i11, v91Var2.I);
                v91Var2.f31236n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                r91Var2.d(false, false);
                return;
        }
    }
}
