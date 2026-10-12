package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class u91 implements Runnable {
    public final int f29612a;
    public final ca1 f29613b;

    public u91(ca1 ca1Var, int i10) {
        this.f29612a = i10;
        this.f29613b = ca1Var;
    }

    @Override
    public final void run() {
        switch (this.f29612a) {
            case 0:
                ca1 ca1Var = this.f29613b;
                y91 y91Var = ca1Var.f23999f0;
                h81 h81Var = ca1Var.f23990a;
                if (h81Var != null && h81Var.y()) {
                    y91Var.c((int) (h81Var.n() / 1000));
                    y91Var.f31526w = (int) (h81Var.j() / 1000);
                    y91Var.invalidate();
                    AndroidUtilities.runOnUIThread(ca1Var.f24002i0, 1000L);
                    return;
                }
                return;
            default:
                ca1 ca1Var2 = this.f29613b;
                y91 y91Var2 = ca1Var2.f23999f0;
                ImageView imageView = ca1Var2.e;
                TextureView textureView = ca1Var2.d;
                ca1Var2.W = false;
                Bitmap bitmap = ca1Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    ca1Var2.h = null;
                }
                ca1Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        ca1Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = ca1Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            ca1Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (ca1Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(ca1Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                ca1Var2.U = true;
                ca1Var2.n();
                ca1Var2.o();
                ca1Var2.k();
                ca1Var2.m();
                ViewGroup viewGroup = (ViewGroup) y91Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(y91Var2);
                }
                z91 z91Var = ca1Var2.v;
                y91 y91Var3 = ca1Var2.f23999f0;
                boolean z10 = ca1Var2.U;
                int i10 = ca1Var2.f24000g0;
                int i11 = ca1Var2.f24001h0;
                ca1Var2.f23994c.getVideoRotation();
                TextureView f7 = z91Var.f(y91Var3, z10, i10, i11, ca1Var2.I);
                ca1Var2.f24005n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                y91Var2.d(false, false);
                return;
        }
    }
}
