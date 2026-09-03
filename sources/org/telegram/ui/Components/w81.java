package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class w81 implements Runnable {
    public final int f32687a;
    public final e91 f32688b;

    public w81(e91 e91Var, int i10) {
        this.f32687a = i10;
        this.f32688b = e91Var;
    }

    @Override
    public final void run() {
        switch (this.f32687a) {
            case 0:
                e91 e91Var = this.f32688b;
                a91 a91Var = e91Var.f26521c0;
                j71 j71Var = e91Var.f26516a;
                if (j71Var != null && j71Var.y()) {
                    a91Var.c((int) (j71Var.n() / 1000));
                    a91Var.f25203w = (int) (j71Var.j() / 1000);
                    a91Var.invalidate();
                    AndroidUtilities.runOnUIThread(e91Var.f26526f0, 1000L);
                    return;
                }
                return;
            default:
                e91 e91Var2 = this.f32688b;
                a91 a91Var2 = e91Var2.f26521c0;
                ImageView imageView = e91Var2.f26523e;
                TextureView textureView = e91Var2.d;
                e91Var2.T = false;
                Bitmap bitmap = e91Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    e91Var2.h = null;
                }
                e91Var2.P = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        e91Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = e91Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            e91Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (e91Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(e91Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                e91Var2.R = true;
                e91Var2.n();
                e91Var2.o();
                e91Var2.k();
                e91Var2.m();
                ViewGroup viewGroup = (ViewGroup) a91Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(a91Var2);
                }
                b91 b91Var = e91Var2.v;
                a91 a91Var3 = e91Var2.f26521c0;
                boolean z4 = e91Var2.R;
                int i10 = e91Var2.f26522d0;
                int i11 = e91Var2.f26524e0;
                e91Var2.f26520c.getVideoRotation();
                TextureView f10 = b91Var.f(a91Var3, z4, i10, i11, e91Var2.F);
                e91Var2.f26529n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                a91Var2.d(false, false);
                return;
        }
    }
}
