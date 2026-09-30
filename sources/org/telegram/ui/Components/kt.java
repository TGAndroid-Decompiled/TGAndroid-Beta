package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class kt {
    public int f25822a;
    public Object f25823b;

    public boolean a(int i10) {
        if (((yf.i) this.f25823b) != null && this.f25822a == i10) {
            return false;
        }
        this.f25822a = i10;
        this.f25823b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
