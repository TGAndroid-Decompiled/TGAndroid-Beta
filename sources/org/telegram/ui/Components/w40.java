package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class w40 extends y40 {
    public final int f34292g;

    public w40() {
        super(R.raw.round_blur_stage_1_frag);
        this.f34292g = GLES20.glGetUniformLocation(this.f34917a, "texOffset");
    }
}
