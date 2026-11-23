package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.Build;
import java.lang.ref.WeakReference;
public final class cb0 {
    public final Shader.TileMode f34008a;
    public final Matrix f34009b = new Matrix();
    public boolean f34010c;
    public BitmapShader d;
    public WeakReference f34011e;

    public cb0(Shader.TileMode tileMode) {
        this.f34008a = tileMode;
    }

    public final void a(boolean z10) {
        BitmapShader bitmapShader;
        int i7;
        if (this.f34010c != z10) {
            this.f34010c = z10;
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
        WeakReference weakReference = this.f34011e;
        if (weakReference != null && weakReference.get() == bitmap) {
            return false;
        }
        this.f34011e = new WeakReference(bitmap);
        Shader.TileMode tileMode = this.f34008a;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.d = bitmapShader;
        bitmapShader.setLocalMatrix(this.f34009b);
        if (Build.VERSION.SDK_INT >= 33) {
            BitmapShader bitmapShader2 = this.d;
            if (this.f34010c) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            bitmapShader2.setFilterMode(i7);
        }
        return true;
    }
}
