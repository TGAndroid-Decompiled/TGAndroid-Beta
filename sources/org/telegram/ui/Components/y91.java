package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class y91 implements Runnable {
    public final int f33182a;
    public final ha1 f33183b;

    public y91(ha1 ha1Var, int i10) {
        this.f33182a = i10;
        this.f33183b = ha1Var;
    }

    @Override
    public final void run() {
        switch (this.f33182a) {
            case 0:
                ha1 ha1Var = this.f33183b;
                ca1 ca1Var = ha1Var.f27022f0;
                k81 k81Var = ha1Var.f27012a;
                if (k81Var != null && k81Var.y()) {
                    ca1Var.c((int) (k81Var.n() / 1000));
                    ca1Var.f25315w = (int) (k81Var.j() / 1000);
                    ca1Var.invalidate();
                    AndroidUtilities.runOnUIThread(ha1Var.f27025i0, 1000L);
                    return;
                }
                return;
            default:
                ha1 ha1Var2 = this.f33183b;
                ca1 ca1Var2 = ha1Var2.f27022f0;
                ImageView imageView = ha1Var2.f27019e;
                TextureView textureView = ha1Var2.d;
                ha1Var2.W = false;
                Bitmap bitmap = ha1Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    ha1Var2.h = null;
                }
                ha1Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        ha1Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = ha1Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            ha1Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (ha1Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(ha1Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                ha1Var2.U = true;
                ha1Var2.n();
                ha1Var2.o();
                ha1Var2.k();
                ha1Var2.m();
                ViewGroup viewGroup = (ViewGroup) ca1Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(ca1Var2);
                }
                da1 da1Var = ha1Var2.v;
                ca1 ca1Var3 = ha1Var2.f27022f0;
                boolean z10 = ha1Var2.U;
                int i10 = ha1Var2.f27023g0;
                int i11 = ha1Var2.f27024h0;
                ha1Var2.f27016c.getVideoRotation();
                TextureView f7 = da1Var.f(ca1Var3, z10, i10, i11, ha1Var2.I);
                ha1Var2.f27028n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                ca1Var2.d(false, false);
                return;
        }
    }
}
