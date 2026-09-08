package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class z40 extends a50 {
    public final int f33102g;
    public final int h;

    public z40() {
        super(R.raw.round_blur_stage_2_frag);
        this.f33102g = GLES20.glGetUniformLocation(this.f24305a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f24305a, "center");
    }
}
