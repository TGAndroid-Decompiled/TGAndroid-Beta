package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class c50 extends e50 {
    public final int f25772g;

    public c50() {
        super(R.raw.round_blur_stage_1_frag);
        this.f25772g = GLES20.glGetUniformLocation(this.f26446a, "texOffset");
    }
}
