package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class i91 implements Runnable {
    public final int f24880a;
    public final q91 f24881b;

    public i91(q91 q91Var, int i10) {
        this.f24880a = i10;
        this.f24881b = q91Var;
    }

    @Override
    public final void run() {
        switch (this.f24880a) {
            case 0:
                q91 q91Var = this.f24881b;
                m91 m91Var = q91Var.f27518f0;
                u71 u71Var = q91Var.f27509a;
                if (u71Var != null && u71Var.y()) {
                    m91Var.c((int) (u71Var.n() / 1000));
                    m91Var.f26386w = (int) (u71Var.j() / 1000);
                    m91Var.invalidate();
                    AndroidUtilities.runOnUIThread(q91Var.f27521i0, 1000L);
                    return;
                }
                return;
            default:
                q91 q91Var2 = this.f24881b;
                m91 m91Var2 = q91Var2.f27518f0;
                ImageView imageView = q91Var2.e;
                TextureView textureView = q91Var2.d;
                q91Var2.W = false;
                Bitmap bitmap = q91Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    q91Var2.h = null;
                }
                q91Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        q91Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = q91Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            q91Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (q91Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(q91Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                q91Var2.U = true;
                q91Var2.n();
                q91Var2.o();
                q91Var2.k();
                q91Var2.m();
                ViewGroup viewGroup = (ViewGroup) m91Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(m91Var2);
                }
                n91 n91Var = q91Var2.v;
                m91 m91Var3 = q91Var2.f27518f0;
                boolean z10 = q91Var2.U;
                int i10 = q91Var2.f27519g0;
                int i11 = q91Var2.f27520h0;
                q91Var2.f27513c.getVideoRotation();
                TextureView f7 = n91Var.f(m91Var3, z10, i10, i11, q91Var2.I);
                q91Var2.f27524n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                m91Var2.d(false, false);
                return;
        }
    }
}
