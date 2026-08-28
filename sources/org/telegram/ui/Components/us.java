package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class us {
    public int f33116a;
    public Object f33117b;

    public boolean a(int i9) {
        if (((ff.l) this.f33117b) != null && this.f33116a == i9) {
            return false;
        }
        this.f33116a = i9;
        this.f33117b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i9, i9}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }
}
