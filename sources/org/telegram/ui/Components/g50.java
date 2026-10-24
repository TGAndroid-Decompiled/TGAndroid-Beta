package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class g50 extends i50 {
    public final int f26563g;

    public g50() {
        super(R.raw.round_blur_stage_1_frag);
        this.f26563g = GLES20.glGetUniformLocation(this.f27294a, "texOffset");
    }
}
