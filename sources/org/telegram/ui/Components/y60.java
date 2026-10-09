package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class y60 extends FrameLayout {
    public static final int f33126e = 0;
    public u60 f33127a;
    public x60 f33128b;
    public w60 f33129c;
    public boolean d;

    public abstract void a(boolean z10);

    public abstract void b(float f7, int i10);

    public abstract void c(boolean z10);

    public abstract boolean d();

    public abstract void e(float f7);

    public abstract void f(int i10, int i11, int i12, long j3, long j10, boolean z10);

    public abstract void g(ah.c cVar, org.telegram.ui.kj kjVar);

    public abstract View getButtonsLayout();

    public abstract v60 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(boolean z10);

    public abstract void i();

    public final void setAnimationCallback(u60 u60Var) {
        this.f33127a = u60Var;
    }

    public abstract void setInternalPadding(int i10);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(w60 w60Var) {
        this.f33129c = w60Var;
        if (w60Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.ok okVar = ((org.telegram.ui.sj) w60Var).f41707a.Y;
            if (okVar != null) {
                okVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(x60 x60Var) {
        this.f33128b = x60Var;
    }
}
