package org.telegram.ui.Components;

import android.opengl.GLES20;
public final class z30 extends e4.b {
    public final int f42653g;
    public final int h;

    public z30() {
        super(2131624183);
        this.f42653g = GLES20.glGetUniformLocation(this.f10810a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f10810a, "center");
    }
}
