package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class z60 extends FrameLayout {
    public static final int f33509e = 0;
    public v60 f33510a;
    public y60 f33511b;
    public x60 f33512c;
    public boolean d;

    public abstract void a(boolean z10);

    public abstract void b(float f7, int i10);

    public abstract void c(boolean z10);

    public abstract boolean d();

    public abstract void e(float f7);

    public abstract void f(int i10, int i11, int i12, long j3, long j10, boolean z10);

    public abstract void g(ah.c cVar, org.telegram.ui.kj kjVar);

    public abstract View getButtonsLayout();

    public abstract w60 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(boolean z10);

    public abstract void i();

    public final void setAnimationCallback(v60 v60Var) {
        this.f33510a = v60Var;
    }

    public abstract void setInternalPadding(int i10);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(x60 x60Var) {
        this.f33512c = x60Var;
        if (x60Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.ok okVar = ((org.telegram.ui.sj) x60Var).f41751a.Y;
            if (okVar != null) {
                okVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(y60 y60Var) {
        this.f33511b = y60Var;
    }
}
