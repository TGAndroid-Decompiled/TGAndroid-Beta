package org.telegram.ui.Components.voip;

import android.content.Context;
import org.webrtc.TextureViewRenderer;
public final class n2 extends TextureViewRenderer {
    public final o2 f41088a;

    public n2(o2 o2Var, Context context) {
        super(context);
        this.f41088a = o2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        super.onFirstFrameRendered();
        this.f41088a.b();
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
    }
}
