package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class jt {
    public int f25541a;
    public Object f25542b;

    public boolean a(int i10) {
        if (((yf.i) this.f25542b) != null && this.f25541a == i10) {
            return false;
        }
        this.f25541a = i10;
        this.f25542b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
