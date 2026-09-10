package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class mt {
    public int f25284a;
    public Object f25285b;

    public boolean a(int i10) {
        if (((xf.i) this.f25285b) != null && this.f25284a == i10) {
            return false;
        }
        this.f25284a = i10;
        this.f25285b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
