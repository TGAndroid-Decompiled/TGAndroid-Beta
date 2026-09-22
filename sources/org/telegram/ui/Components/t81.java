package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class t81 implements Runnable {
    public final int f28066a;
    public final c91 f28067b;

    public t81(c91 c91Var, int i10) {
        this.f28066a = i10;
        this.f28067b = c91Var;
    }

    @Override
    public final void run() {
        switch (this.f28066a) {
            case 0:
                c91 c91Var = this.f28067b;
                y81 y81Var = c91Var.f23024f0;
                g71 g71Var = c91Var.f23015a;
                if (g71Var != null && g71Var.y()) {
                    y81Var.c((int) (g71Var.n() / 1000));
                    y81Var.f30184w = (int) (g71Var.j() / 1000);
                    y81Var.invalidate();
                    AndroidUtilities.runOnUIThread(c91Var.f23027i0, 1000L);
                    return;
                }
                return;
            default:
                c91 c91Var2 = this.f28067b;
                y81 y81Var2 = c91Var2.f23024f0;
                ImageView imageView = c91Var2.e;
                TextureView textureView = c91Var2.d;
                c91Var2.W = false;
                Bitmap bitmap = c91Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    c91Var2.h = null;
                }
                c91Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        c91Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = c91Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            c91Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (c91Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(c91Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                c91Var2.U = true;
                c91Var2.n();
                c91Var2.o();
                c91Var2.k();
                c91Var2.m();
                ViewGroup viewGroup = (ViewGroup) y81Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(y81Var2);
                }
                z81 z81Var = c91Var2.v;
                y81 y81Var3 = c91Var2.f23024f0;
                boolean z10 = c91Var2.U;
                int i10 = c91Var2.f23025g0;
                int i11 = c91Var2.f23026h0;
                c91Var2.f23019c.getVideoRotation();
                TextureView f7 = z81Var.f(y81Var3, z10, i10, i11, c91Var2.I);
                c91Var2.f23030n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                y81Var2.d(false, false);
                return;
        }
    }
}
