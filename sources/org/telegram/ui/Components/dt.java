package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class dt {
    public int f24364a;
    public Object f24365b;

    public boolean a(int i10) {
        if (((lf.k) this.f24365b) != null && this.f24364a == i10) {
            return false;
        }
        this.f24364a = i10;
        this.f24365b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
