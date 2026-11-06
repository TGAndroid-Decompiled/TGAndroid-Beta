package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.Build;
import java.lang.ref.WeakReference;
public final class ua0 {
    public final Shader.TileMode f38576a;
    public final Matrix f38577b = new Matrix();
    public boolean f38578c;
    public BitmapShader d;
    public WeakReference f38579e;

    public ua0(Shader.TileMode tileMode) {
        this.f38576a = tileMode;
    }

    public final void a(boolean z9) {
        BitmapShader bitmapShader;
        int i7;
        if (this.f38578c != z9) {
            this.f38578c = z9;
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
        WeakReference weakReference = this.f38579e;
        if (weakReference != null && weakReference.get() == bitmap) {
            return false;
        }
        this.f38579e = new WeakReference(bitmap);
        Shader.TileMode tileMode = this.f38576a;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.d = bitmapShader;
        bitmapShader.setLocalMatrix(this.f38577b);
        if (Build.VERSION.SDK_INT >= 33) {
            BitmapShader bitmapShader2 = this.d;
            if (this.f38578c) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            bitmapShader2.setFilterMode(i7);
        }
        return true;
    }
}
