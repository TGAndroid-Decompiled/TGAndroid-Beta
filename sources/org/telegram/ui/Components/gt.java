package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class gt {
    public int f24486a;
    public Object f24487b;

    public boolean a(int i10) {
        if (((yf.i) this.f24487b) != null && this.f24486a == i10) {
            return false;
        }
        this.f24486a = i10;
        this.f24487b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
