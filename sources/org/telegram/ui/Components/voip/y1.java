package org.telegram.ui.Components.voip;

import android.content.Context;
import org.webrtc.TextureViewRenderer;
public final class y1 extends TextureViewRenderer {
    public final z1 f31843a;

    public y1(z1 z1Var, Context context) {
        super(context);
        this.f31843a = z1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        super.onFirstFrameRendered();
        this.f31843a.b();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }
}
