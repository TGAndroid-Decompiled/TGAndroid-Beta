package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class rt {
    public int f32323a;
    public Object f32324b;

    public boolean a(int i10) {
        if (((ag.o) this.f32324b) != null && this.f32323a == i10) {
            return false;
        }
        this.f32323a = i10;
        this.f32324b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
