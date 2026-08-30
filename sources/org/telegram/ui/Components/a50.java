package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class a50 extends c50 {
    public final int f23295g;

    public a50() {
        super(R.raw.round_blur_stage_1_frag);
        this.f23295g = GLES20.glGetUniformLocation(this.f23843a, "texOffset");
    }
}
