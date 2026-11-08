package org.telegram.ui.Components;

import android.opengl.GLES20;
public final class o30 extends e4.b {
    public final int f36530g;
    public final int h;

    public o30() {
        super(2131624182);
        this.f36530g = GLES20.glGetUniformLocation(this.f10666a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f10666a, "center");
    }
}
