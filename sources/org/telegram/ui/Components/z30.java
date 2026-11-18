package org.telegram.ui.Components;

import android.opengl.GLES20;
public final class z30 extends e4.b {
    public final int f42759g;
    public final int h;

    public z30() {
        super(2131624183);
        this.f42759g = GLES20.glGetUniformLocation(this.f10820a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f10820a, "center");
    }
}
