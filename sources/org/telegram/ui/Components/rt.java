package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class rt {
    public int f32362a;
    public Object f32363b;

    public boolean a(int i10) {
        if (((ag.o) this.f32363b) != null && this.f32362a == i10) {
            return false;
        }
        this.f32362a = i10;
        this.f32363b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
