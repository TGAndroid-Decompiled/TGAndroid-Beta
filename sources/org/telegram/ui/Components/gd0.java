package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.Build;
import java.lang.ref.WeakReference;
public final class gd0 {
    public final Shader.TileMode f24942a;
    public final Matrix f24943b = new Matrix();
    public boolean f24944c;
    public BitmapShader d;
    public WeakReference e;

    public gd0(Shader.TileMode tileMode) {
        this.f24942a = tileMode;
    }

    public final void a(boolean z10) {
        BitmapShader bitmapShader;
        int i10;
        if (this.f24944c != z10) {
            this.f24944c = z10;
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
        WeakReference weakReference = this.e;
        if (weakReference != null && weakReference.get() == bitmap) {
            return false;
        }
        this.e = new WeakReference(bitmap);
        Shader.TileMode tileMode = this.f24942a;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.d = bitmapShader;
        bitmapShader.setLocalMatrix(this.f24943b);
        if (Build.VERSION.SDK_INT >= 33) {
            BitmapShader bitmapShader2 = this.d;
            if (this.f24944c) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            bitmapShader2.setFilterMode(i10);
        }
        return true;
    }
}
