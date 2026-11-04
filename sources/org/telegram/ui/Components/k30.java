package org.telegram.ui.Components;

import android.opengl.GLES20;
public final class k30 extends d4.b {
    public final int f35261g;
    public final int h;

    public k30() {
        super(2131624182);
        this.f35261g = GLES20.glGetUniformLocation(this.f8529a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f8529a, "center");
    }
}
