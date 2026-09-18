package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class u81 implements Runnable {
    public final int f28302a;
    public final d91 f28303b;

    public u81(d91 d91Var, int i10) {
        this.f28302a = i10;
        this.f28303b = d91Var;
    }

    @Override
    public final void run() {
        switch (this.f28302a) {
            case 0:
                d91 d91Var = this.f28303b;
                z81 z81Var = d91Var.f23276f0;
                h71 h71Var = d91Var.f23267a;
                if (h71Var != null && h71Var.y()) {
                    z81Var.c((int) (h71Var.n() / 1000));
                    z81Var.f30427w = (int) (h71Var.j() / 1000);
                    z81Var.invalidate();
                    AndroidUtilities.runOnUIThread(d91Var.f23279i0, 1000L);
                    return;
                }
                return;
            default:
                d91 d91Var2 = this.f28303b;
                z81 z81Var2 = d91Var2.f23276f0;
                ImageView imageView = d91Var2.e;
                TextureView textureView = d91Var2.d;
                d91Var2.W = false;
                Bitmap bitmap = d91Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    d91Var2.h = null;
                }
                d91Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        d91Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = d91Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            d91Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (d91Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(d91Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                d91Var2.U = true;
                d91Var2.n();
                d91Var2.o();
                d91Var2.k();
                d91Var2.m();
                ViewGroup viewGroup = (ViewGroup) z81Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(z81Var2);
                }
                a91 a91Var = d91Var2.v;
                z81 z81Var3 = d91Var2.f23276f0;
                boolean z10 = d91Var2.U;
                int i10 = d91Var2.f23277g0;
                int i11 = d91Var2.f23278h0;
                d91Var2.f23271c.getVideoRotation();
                TextureView f7 = a91Var.f(z81Var3, z10, i10, i11, d91Var2.I);
                d91Var2.f23282n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                z81Var2.d(false, false);
                return;
        }
    }
}
