package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class x40 extends y40 {
    public final int f34569g;
    public final int h;

    public x40() {
        super(R.raw.round_blur_stage_2_frag);
        this.f34569g = GLES20.glGetUniformLocation(this.f34917a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f34917a, "center");
    }
}
