package org.telegram.ui.Components;

import android.graphics.Shader;

public final class ts {

    public int f32870a;

    public Object f32871b;

    public boolean a(int i10) {
        if (((gf.l) this.f32871b) != null && this.f32870a == i10) {
            return false;
        }
        this.f32870a = i10;
        this.f32871b = new gf.l(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, null, Shader.TileMode.CLAMP);
        return true;
    }
}
