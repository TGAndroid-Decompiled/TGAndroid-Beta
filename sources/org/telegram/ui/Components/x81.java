package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class x81 implements Runnable {
    public final int f32976a;
    public final f91 f32977b;

    public x81(f91 f91Var, int i10) {
        this.f32976a = i10;
        this.f32977b = f91Var;
    }

    @Override
    public final void run() {
        switch (this.f32976a) {
            case 0:
                f91 f91Var = this.f32977b;
                b91 b91Var = f91Var.f26817c0;
                k71 k71Var = f91Var.f26812a;
                if (k71Var != null && k71Var.y()) {
                    b91Var.c((int) (k71Var.n() / 1000));
                    b91Var.f25537w = (int) (k71Var.j() / 1000);
                    b91Var.invalidate();
                    AndroidUtilities.runOnUIThread(f91Var.f26822f0, 1000L);
                    return;
                }
                return;
            default:
                f91 f91Var2 = this.f32977b;
                b91 b91Var2 = f91Var2.f26817c0;
                ImageView imageView = f91Var2.f26819e;
                TextureView textureView = f91Var2.d;
                f91Var2.T = false;
                Bitmap bitmap = f91Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    f91Var2.h = null;
                }
                f91Var2.P = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        f91Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = f91Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            f91Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (f91Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(f91Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                f91Var2.R = true;
                f91Var2.n();
                f91Var2.o();
                f91Var2.k();
                f91Var2.m();
                ViewGroup viewGroup = (ViewGroup) b91Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(b91Var2);
                }
                c91 c91Var = f91Var2.v;
                b91 b91Var3 = f91Var2.f26817c0;
                boolean z4 = f91Var2.R;
                int i10 = f91Var2.f26818d0;
                int i11 = f91Var2.f26820e0;
                f91Var2.f26816c.getVideoRotation();
                TextureView f10 = c91Var.f(b91Var3, z4, i10, i11, f91Var2.F);
                f91Var2.f26825n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                b91Var2.d(false, false);
                return;
        }
    }
}
