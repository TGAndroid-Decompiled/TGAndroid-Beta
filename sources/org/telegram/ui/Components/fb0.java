package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.Build;
import java.lang.ref.WeakReference;
public final class fb0 {
    public final Shader.TileMode f35194a;
    public final Matrix f35195b = new Matrix();
    public boolean f35196c;
    public BitmapShader d;
    public WeakReference f35197e;

    public fb0(Shader.TileMode tileMode) {
        this.f35194a = tileMode;
    }

    public final void a(boolean z10) {
        BitmapShader bitmapShader;
        int i7;
        if (this.f35196c != z10) {
            this.f35196c = z10;
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
        WeakReference weakReference = this.f35197e;
        if (weakReference != null && weakReference.get() == bitmap) {
            return false;
        }
        this.f35197e = new WeakReference(bitmap);
        Shader.TileMode tileMode = this.f35194a;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.d = bitmapShader;
        bitmapShader.setLocalMatrix(this.f35195b);
        if (Build.VERSION.SDK_INT >= 33) {
            BitmapShader bitmapShader2 = this.d;
            if (this.f35196c) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            bitmapShader2.setFilterMode(i7);
        }
        return true;
    }
}
