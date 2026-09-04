package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.Build;
import java.lang.ref.WeakReference;
public final class hc0 {
    public final Shader.TileMode f26705a;
    public final Matrix f26706b = new Matrix();
    public boolean f26707c;
    public BitmapShader d;
    public WeakReference f26708e;

    public hc0(Shader.TileMode tileMode) {
        this.f26705a = tileMode;
    }

    public final void a(boolean z10) {
        BitmapShader bitmapShader;
        int i10;
        if (this.f26707c != z10) {
            this.f26707c = z10;
            if (Build.VERSION.SDK_INT >= 33 && (bitmapShader = this.d) != null) {
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                bitmapShader.setFilterMode(i10);
            }
        }
    }

    public final boolean b(Bitmap bitmap) {
        int i10;
        WeakReference weakReference = this.f26708e;
        if (weakReference != null && weakReference.get() == bitmap) {
            return false;
        }
        this.f26708e = new WeakReference(bitmap);
        Shader.TileMode tileMode = this.f26705a;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.d = bitmapShader;
        bitmapShader.setLocalMatrix(this.f26706b);
        if (Build.VERSION.SDK_INT >= 33) {
            BitmapShader bitmapShader2 = this.d;
            if (this.f26707c) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            bitmapShader2.setFilterMode(i10);
        }
        return true;
    }
}
