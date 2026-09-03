package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.Build;
import java.lang.ref.WeakReference;
public final class jc0 {
    public final Shader.TileMode f28080a;
    public final Matrix f28081b = new Matrix();
    public boolean f28082c;
    public BitmapShader d;
    public WeakReference f28083e;

    public jc0(Shader.TileMode tileMode) {
        this.f28080a = tileMode;
    }

    public final void a(boolean z4) {
        BitmapShader bitmapShader;
        int i10;
        if (this.f28082c != z4) {
            this.f28082c = z4;
            if (Build.VERSION.SDK_INT >= 33 && (bitmapShader = this.d) != null) {
                if (z4) {
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
        WeakReference weakReference = this.f28083e;
        if (weakReference != null && weakReference.get() == bitmap) {
            return false;
        }
        this.f28083e = new WeakReference(bitmap);
        Shader.TileMode tileMode = this.f28080a;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.d = bitmapShader;
        bitmapShader.setLocalMatrix(this.f28081b);
        if (Build.VERSION.SDK_INT >= 33) {
            BitmapShader bitmapShader2 = this.d;
            if (this.f28082c) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            bitmapShader2.setFilterMode(i10);
        }
        return true;
    }
}
