package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class ft {
    public int f26995a;
    public Object f26996b;

    public boolean a(int i10) {
        if (((lf.k) this.f26996b) != null && this.f26995a == i10) {
            return false;
        }
        this.f26995a = i10;
        this.f26996b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
