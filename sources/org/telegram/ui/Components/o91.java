package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class o91 implements Runnable {
    public final int f28968a;
    public final w91 f28969b;

    public o91(w91 w91Var, int i10) {
        this.f28968a = i10;
        this.f28969b = w91Var;
    }

    @Override
    public final void run() {
        switch (this.f28968a) {
            case 0:
                w91 w91Var = this.f28969b;
                s91 s91Var = w91Var.f32029f0;
                c81 c81Var = w91Var.f32020a;
                if (c81Var != null && c81Var.y()) {
                    s91Var.c((int) (c81Var.n() / 1000));
                    s91Var.f30233w = (int) (c81Var.j() / 1000);
                    s91Var.invalidate();
                    AndroidUtilities.runOnUIThread(w91Var.f32032i0, 1000L);
                    return;
                }
                return;
            default:
                w91 w91Var2 = this.f28969b;
                s91 s91Var2 = w91Var2.f32029f0;
                ImageView imageView = w91Var2.e;
                TextureView textureView = w91Var2.d;
                w91Var2.W = false;
                Bitmap bitmap = w91Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    w91Var2.h = null;
                }
                w91Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        w91Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = w91Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            w91Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (w91Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(w91Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                w91Var2.U = true;
                w91Var2.n();
                w91Var2.o();
                w91Var2.k();
                w91Var2.m();
                ViewGroup viewGroup = (ViewGroup) s91Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(s91Var2);
                }
                t91 t91Var = w91Var2.v;
                s91 s91Var3 = w91Var2.f32029f0;
                boolean z10 = w91Var2.U;
                int i10 = w91Var2.f32030g0;
                int i11 = w91Var2.f32031h0;
                w91Var2.f32024c.getVideoRotation();
                TextureView f7 = t91Var.f(s91Var3, z10, i10, i11, w91Var2.I);
                w91Var2.f32035n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                s91Var2.d(false, false);
                return;
        }
    }
}
