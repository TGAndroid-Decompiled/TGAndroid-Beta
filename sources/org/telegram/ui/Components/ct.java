package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class ct {
    public int f24028a;
    public Object f24029b;

    public boolean a(int i10) {
        if (((kf.k) this.f24029b) != null && this.f24028a == i10) {
            return false;
        }
        this.f24028a = i10;
        this.f24029b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
