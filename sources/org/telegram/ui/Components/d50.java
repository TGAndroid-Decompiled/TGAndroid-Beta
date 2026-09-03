package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class d50 extends e50 {
    public final int f26185g;
    public final int h;

    public d50() {
        super(R.raw.round_blur_stage_2_frag);
        this.f26185g = GLES20.glGetUniformLocation(this.f26446a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f26446a, "center");
    }
}
