package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class j40 extends k40 {
    public final int f29626g;
    public final int h;

    public j40() {
        super(R.raw.round_blur_stage_2_frag);
        this.f29626g = GLES20.glGetUniformLocation(this.f29932a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f29932a, "center");
    }
}
