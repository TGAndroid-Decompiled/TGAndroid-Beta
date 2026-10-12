package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class au {
    public int f24477a;
    public Object f24478b;

    public boolean a(int i10) {
        if (((yf.i) this.f24478b) != null && this.f24477a == i10) {
            return false;
        }
        this.f24477a = i10;
        this.f24478b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
