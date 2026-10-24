package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class nt {
    public int f29032a;
    public Object f29033b;

    public boolean a(int i10) {
        if (((zf.i) this.f29033b) != null && this.f29032a == i10) {
            return false;
        }
        this.f29032a = i10;
        this.f29033b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
