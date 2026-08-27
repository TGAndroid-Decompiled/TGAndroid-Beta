package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.Build;
import java.lang.ref.WeakReference;

public final class rb0 {

    public final Shader.TileMode f32121a;

    public final Matrix f32122b = new Matrix();

    public boolean f32123c;
    public BitmapShader d;

    public WeakReference f32124e;

    public rb0(Shader.TileMode tileMode) {
        this.f32121a = tileMode;
    }

    public final void a(boolean z10) {
        BitmapShader bitmapShader;
        if (this.f32123c != z10) {
            this.f32123c = z10;
            if (Build.VERSION.SDK_INT < 33 || (bitmapShader = this.d) == null) {
                return;
            }
            bitmapShader.setFilterMode(z10 ? 1 : 2);
        }
    }

    public final boolean b(Bitmap bitmap) {
        WeakReference weakReference = this.f32124e;
        if (weakReference != null && weakReference.get() == bitmap) {
            return false;
        }
        this.f32124e = new WeakReference(bitmap);
        Shader.TileMode tileMode = this.f32121a;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.d = bitmapShader;
        bitmapShader.setLocalMatrix(this.f32122b);
        if (Build.VERSION.SDK_INT >= 33) {
            this.d.setFilterMode(this.f32123c ? 1 : 2);
        }
        return true;
    }
}
