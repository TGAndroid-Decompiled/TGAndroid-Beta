package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class yt {
    public int f33330a;
    public Object f33331b;

    public boolean a(int i10) {
        if (((yf.i) this.f33331b) != null && this.f33330a == i10) {
            return false;
        }
        this.f33330a = i10;
        this.f33331b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
