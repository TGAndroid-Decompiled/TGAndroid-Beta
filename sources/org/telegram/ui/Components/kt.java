package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class kt {
    public int f28193a;
    public Object f28194b;

    public boolean a(int i10) {
        if (((yf.i) this.f28194b) != null && this.f28193a == i10) {
            return false;
        }
        this.f28193a = i10;
        this.f28194b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
