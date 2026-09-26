package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class jt {
    public int f25522a;
    public Object f25523b;

    public boolean a(int i10) {
        if (((yf.i) this.f25523b) != null && this.f25522a == i10) {
            return false;
        }
        this.f25522a = i10;
        this.f25523b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
