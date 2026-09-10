package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class g91 implements Runnable {
    public final int f23311a;
    public final o91 f23312b;

    public g91(o91 o91Var, int i10) {
        this.f23311a = i10;
        this.f23312b = o91Var;
    }

    @Override
    public final void run() {
        switch (this.f23311a) {
            case 0:
                o91 o91Var = this.f23312b;
                k91 k91Var = o91Var.f25724f0;
                t71 t71Var = o91Var.f25715a;
                if (t71Var != null && t71Var.y()) {
                    k91Var.c((int) (t71Var.n() / 1000));
                    k91Var.f24683w = (int) (t71Var.j() / 1000);
                    k91Var.invalidate();
                    AndroidUtilities.runOnUIThread(o91Var.f25727i0, 1000L);
                    return;
                }
                return;
            default:
                o91 o91Var2 = this.f23312b;
                k91 k91Var2 = o91Var2.f25724f0;
                ImageView imageView = o91Var2.e;
                TextureView textureView = o91Var2.d;
                o91Var2.W = false;
                Bitmap bitmap = o91Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    o91Var2.h = null;
                }
                o91Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        o91Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = o91Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            o91Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (o91Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(o91Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                o91Var2.U = true;
                o91Var2.n();
                o91Var2.o();
                o91Var2.k();
                o91Var2.m();
                ViewGroup viewGroup = (ViewGroup) k91Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(k91Var2);
                }
                l91 l91Var = o91Var2.v;
                k91 k91Var3 = o91Var2.f25724f0;
                boolean z10 = o91Var2.U;
                int i10 = o91Var2.f25725g0;
                int i11 = o91Var2.f25726h0;
                o91Var2.f25719c.getVideoRotation();
                TextureView f7 = l91Var.f(k91Var3, z10, i10, i11, o91Var2.I);
                o91Var2.f25730n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                k91Var2.d(false, false);
                return;
        }
    }
}
