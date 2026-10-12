package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class ut {
    public int f29767a;
    public Object f29768b;

    public boolean a(int i10) {
        if (((zf.j) this.f29768b) != null && this.f29767a == i10) {
            return false;
        }
        this.f29767a = i10;
        this.f29768b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
