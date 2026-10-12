package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class zt {
    public int f33489a;
    public Object f33490b;

    public boolean a(int i10) {
        if (((yf.i) this.f33490b) != null && this.f33489a == i10) {
            return false;
        }
        this.f33489a = i10;
        this.f33490b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
