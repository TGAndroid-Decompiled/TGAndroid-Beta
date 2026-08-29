package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class k81 implements Runnable {
    public final int f29967a;
    public final s81 f29968b;

    public k81(s81 s81Var, int i10) {
        this.f29967a = i10;
        this.f29968b = s81Var;
    }

    @Override
    public final void run() {
        switch (this.f29967a) {
            case 0:
                s81 s81Var = this.f29968b;
                o81 o81Var = s81Var.f32572b0;
                x61 x61Var = s81Var.f32569a;
                if (x61Var != null && x61Var.z()) {
                    o81Var.c((int) (x61Var.o() / 1000));
                    o81Var.f31291w = (int) (x61Var.k() / 1000);
                    o81Var.invalidate();
                    AndroidUtilities.runOnUIThread(s81Var.f32577e0, 1000L);
                    return;
                }
                return;
            default:
                s81 s81Var2 = this.f29968b;
                o81 o81Var2 = s81Var2.f32572b0;
                ImageView imageView = s81Var2.f32576e;
                TextureView textureView = s81Var2.d;
                s81Var2.S = false;
                Bitmap bitmap = s81Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    s81Var2.h = null;
                }
                s81Var2.O = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        s81Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = s81Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            s81Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (s81Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(s81Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                s81Var2.Q = true;
                s81Var2.n();
                s81Var2.o();
                s81Var2.k();
                s81Var2.m();
                ViewGroup viewGroup = (ViewGroup) o81Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(o81Var2);
                }
                p81 p81Var = s81Var2.v;
                o81 o81Var3 = s81Var2.f32572b0;
                boolean z10 = s81Var2.Q;
                int i10 = s81Var2.f32574c0;
                int i11 = s81Var2.f32575d0;
                s81Var2.f32573c.getVideoRotation();
                TextureView f9 = p81Var.f(o81Var3, z10, i10, i11, s81Var2.E);
                s81Var2.f32581n = f9;
                f9.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                o81Var2.d(false, false);
                return;
        }
    }
}
