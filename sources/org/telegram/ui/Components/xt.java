package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class xt {
    public int f33004a;
    public Object f33005b;

    public boolean a(int i10) {
        if (((yf.i) this.f33005b) != null && this.f33004a == i10) {
            return false;
        }
        this.f33004a = i10;
        this.f33005b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
