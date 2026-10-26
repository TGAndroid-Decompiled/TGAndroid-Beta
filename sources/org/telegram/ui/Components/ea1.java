package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class ea1 implements Runnable {
    public final int f27795a;
    public final ma1 f27796b;

    public ea1(ma1 ma1Var, int i10) {
        this.f27795a = i10;
        this.f27796b = ma1Var;
    }

    @Override
    public final void run() {
        switch (this.f27795a) {
            case 0:
                ma1 ma1Var = this.f27796b;
                ia1 ia1Var = ma1Var.f30497f0;
                s81 s81Var = ma1Var.f30488a;
                if (s81Var != null && s81Var.y()) {
                    ia1Var.c((int) (s81Var.n() / 1000));
                    ia1Var.f29252w = (int) (s81Var.j() / 1000);
                    ia1Var.invalidate();
                    AndroidUtilities.runOnUIThread(ma1Var.f30500i0, 1000L);
                    return;
                }
                return;
            default:
                ma1 ma1Var2 = this.f27796b;
                ia1 ia1Var2 = ma1Var2.f30497f0;
                ImageView imageView = ma1Var2.e;
                TextureView textureView = ma1Var2.d;
                ma1Var2.W = false;
                Bitmap bitmap = ma1Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    ma1Var2.h = null;
                }
                ma1Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        ma1Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = ma1Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            ma1Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (ma1Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(ma1Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                ma1Var2.U = true;
                ma1Var2.n();
                ma1Var2.o();
                ma1Var2.k();
                ma1Var2.m();
                ViewGroup viewGroup = (ViewGroup) ia1Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(ia1Var2);
                }
                ja1 ja1Var = ma1Var2.v;
                ia1 ia1Var3 = ma1Var2.f30497f0;
                boolean z10 = ma1Var2.U;
                int i10 = ma1Var2.f30498g0;
                int i11 = ma1Var2.f30499h0;
                ma1Var2.f30492c.getVideoRotation();
                TextureView f7 = ja1Var.f(ia1Var3, z10, i10, i11, ma1Var2.I);
                ma1Var2.f30503n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                ia1Var2.d(false, false);
                return;
        }
    }
}
