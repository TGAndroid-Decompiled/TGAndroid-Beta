package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.Build;
import java.lang.ref.WeakReference;
public final class ua0 {
    public final Shader.TileMode f39983a;
    public final Matrix f39984b = new Matrix();
    public boolean f39985c;
    public BitmapShader d;
    public WeakReference f39986e;

    public ua0(Shader.TileMode tileMode) {
        this.f39983a = tileMode;
    }

    public final void a(boolean z10) {
        BitmapShader bitmapShader;
        int i7;
        if (this.f39985c != z10) {
            this.f39985c = z10;
            if (Build.VERSION.SDK_INT >= 33 && (bitmapShader = this.d) != null) {
                if (z10) {
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
        WeakReference weakReference = this.f39986e;
        if (weakReference != null && weakReference.get() == bitmap) {
            return false;
        }
        this.f39986e = new WeakReference(bitmap);
        Shader.TileMode tileMode = this.f39983a;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.d = bitmapShader;
        bitmapShader.setLocalMatrix(this.f39984b);
        if (Build.VERSION.SDK_INT >= 33) {
            BitmapShader bitmapShader2 = this.d;
            if (this.f39985c) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            bitmapShader2.setFilterMode(i7);
        }
        return true;
    }
}
