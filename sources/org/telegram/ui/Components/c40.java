package org.telegram.ui.Components;

import android.opengl.GLES20;
public final class c40 extends e4.b {
    public final int f34017g;
    public final int h;

    public c40() {
        super(2131624183);
        this.f34017g = GLES20.glGetUniformLocation(this.f10846a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f10846a, "center");
    }
}
