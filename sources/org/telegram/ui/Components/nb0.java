package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.Build;
import java.lang.ref.WeakReference;
public final class nb0 {
    public final Shader.TileMode f31060a;
    public final Matrix f31061b = new Matrix();
    public boolean f31062c;
    public BitmapShader d;
    public WeakReference f31063e;

    public nb0(Shader.TileMode tileMode) {
        this.f31060a = tileMode;
    }

    public final void a(boolean z10) {
        BitmapShader bitmapShader;
        int i9;
        if (this.f31062c != z10) {
            this.f31062c = z10;
            if (Build.VERSION.SDK_INT >= 33 && (bitmapShader = this.d) != null) {
                if (z10) {
                    i9 = 1;
                } else {
                    i9 = 2;
                }
                bitmapShader.setFilterMode(i9);
            }
        }
    }

    public final boolean b(Bitmap bitmap) {
        int i9;
        WeakReference weakReference = this.f31063e;
        if (weakReference != null && weakReference.get() == bitmap) {
            return false;
        }
        this.f31063e = new WeakReference(bitmap);
        Shader.TileMode tileMode = this.f31060a;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.d = bitmapShader;
        bitmapShader.setLocalMatrix(this.f31061b);
        if (Build.VERSION.SDK_INT >= 33) {
            BitmapShader bitmapShader2 = this.d;
            if (this.f31062c) {
                i9 = 1;
            } else {
                i9 = 2;
            }
            bitmapShader2.setFilterMode(i9);
        }
        return true;
    }
}
