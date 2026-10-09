package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class r50 extends s50 {
    public final int f30358g;
    public final int h;

    public r50() {
        super(R.raw.round_blur_stage_2_frag);
        this.f30358g = GLES20.glGetUniformLocation(this.f30660a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f30660a, "center");
    }
}
