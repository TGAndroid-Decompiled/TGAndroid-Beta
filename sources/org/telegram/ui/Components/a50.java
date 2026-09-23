package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class a50 extends b50 {
    public final int f22365g;
    public final int h;

    public a50() {
        super(R.raw.round_blur_stage_2_frag);
        this.f22365g = GLES20.glGetUniformLocation(this.f22576a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f22576a, "center");
    }
}
