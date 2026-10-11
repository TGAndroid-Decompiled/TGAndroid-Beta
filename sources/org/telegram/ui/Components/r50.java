package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class r50 extends t50 {
    public final int f30340g;

    public r50() {
        super(R.raw.round_blur_stage_1_frag);
        this.f30340g = GLES20.glGetUniformLocation(this.f30997a, "texOffset");
    }
}
