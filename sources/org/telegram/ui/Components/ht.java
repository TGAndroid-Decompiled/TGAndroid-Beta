package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class ht {
    public int f24865a;
    public Object f24866b;

    public boolean a(int i10) {
        if (((yf.i) this.f24866b) != null && this.f24865a == i10) {
            return false;
        }
        this.f24865a = i10;
        this.f24866b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
