package org.telegram.ui.Components.voip;

import android.content.Context;
import org.webrtc.TextureViewRenderer;
public final class y1 extends TextureViewRenderer {
    public final z1 f39726a;

    public y1(z1 z1Var, Context context) {
        super(context);
        this.f39726a = z1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        super.onFirstFrameRendered();
        this.f39726a.b();
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
    }
}
