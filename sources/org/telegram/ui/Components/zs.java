package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class zs {
    public int f35409a;
    public Object f35410b;

    public boolean a(int i10) {
        if (((jf.k) this.f35410b) != null && this.f35409a == i10) {
            return false;
        }
        this.f35409a = i10;
        this.f35410b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
