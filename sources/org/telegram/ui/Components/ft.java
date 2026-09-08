package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class ft {
    public int f26208a;
    public Object f26209b;

    public boolean a(int i10) {
        if (((yf.i) this.f26209b) != null && this.f26208a == i10) {
            return false;
        }
        this.f26208a = i10;
        this.f26209b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
