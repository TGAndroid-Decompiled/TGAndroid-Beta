package org.telegram.ui.Components.voip;

import android.content.Context;
import org.webrtc.TextureViewRenderer;
public final class q2 extends TextureViewRenderer {
    public final r2 f33766a;

    public q2(r2 r2Var, Context context) {
        super(context);
        this.f33766a = r2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        super.onFirstFrameRendered();
        this.f33766a.b();
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
    }
}
