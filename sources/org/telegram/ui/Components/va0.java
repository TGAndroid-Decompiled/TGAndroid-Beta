package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.Build;
import java.lang.ref.WeakReference;
public final class va0 {
    public final Shader.TileMode f39019a;
    public final Matrix f39020b = new Matrix();
    public boolean f39021c;
    public BitmapShader d;
    public WeakReference f39022e;

    public va0(Shader.TileMode tileMode) {
        this.f39019a = tileMode;
    }

    public final void a(boolean z9) {
        BitmapShader bitmapShader;
        int i7;
        if (this.f39021c != z9) {
            this.f39021c = z9;
            if (Build.VERSION.SDK_INT >= 33 && (bitmapShader = this.d) != null) {
                if (z9) {
                    i7 = 1;
                } else {
                    i7 = 2;
                }
                bitmapShader.setFilterMode(i7);
            }
        }
    }

    public final boolean b(Bitmap bitmap) {
        int i7;
        WeakReference weakReference = this.f39022e;
        if (weakReference != null && weakReference.get() == bitmap) {
            return false;
        }
        this.f39022e = new WeakReference(bitmap);
        Shader.TileMode tileMode = this.f39019a;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.d = bitmapShader;
        bitmapShader.setLocalMatrix(this.f39020b);
        if (Build.VERSION.SDK_INT >= 33) {
            BitmapShader bitmapShader2 = this.d;
            if (this.f39021c) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            bitmapShader2.setFilterMode(i7);
        }
        return true;
    }
}
