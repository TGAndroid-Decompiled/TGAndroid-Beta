package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.Build;
import java.lang.ref.WeakReference;
public final class pa0 {
    public final Shader.TileMode f37106a;
    public final Matrix f37107b = new Matrix();
    public boolean f37108c;
    public BitmapShader d;
    public WeakReference f37109e;

    public pa0(Shader.TileMode tileMode) {
        this.f37106a = tileMode;
    }

    public final void a(boolean z10) {
        BitmapShader bitmapShader;
        int i3;
        if (this.f37108c != z10) {
            this.f37108c = z10;
            if (Build.VERSION.SDK_INT >= 33 && (bitmapShader = this.d) != null) {
                if (z10) {
                    i3 = 1;
                } else {
                    i3 = 2;
                }
                bitmapShader.setFilterMode(i3);
            }
        }
    }

    public final boolean b(Bitmap bitmap) {
        int i3;
        WeakReference weakReference = this.f37109e;
        if (weakReference != null && weakReference.get() == bitmap) {
            return false;
        }
        this.f37109e = new WeakReference(bitmap);
        Shader.TileMode tileMode = this.f37106a;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.d = bitmapShader;
        bitmapShader.setLocalMatrix(this.f37107b);
        if (Build.VERSION.SDK_INT >= 33) {
            BitmapShader bitmapShader2 = this.d;
            if (this.f37108c) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            bitmapShader2.setFilterMode(i3);
        }
        return true;
    }
}
