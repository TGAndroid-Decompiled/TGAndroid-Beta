package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class pt {
    public int f29401a;
    public Object f29402b;

    public boolean a(int i10) {
        if (((zf.i) this.f29402b) != null && this.f29401a == i10) {
            return false;
        }
        this.f29401a = i10;
        this.f29402b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
