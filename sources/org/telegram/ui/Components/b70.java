package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class b70 extends FrameLayout {
    public static final int f24575e = 0;
    public x60 f24576a;
    public a70 f24577b;
    public z60 f24578c;
    public boolean d;

    public abstract void a(boolean z10);

    public abstract void b(float f7, int i10);

    public abstract void c(boolean z10);

    public abstract boolean d();

    public abstract void e(float f7);

    public abstract void f(int i10, int i11, int i12, long j3, long j10, boolean z10);

    public abstract void g(ah.c cVar, org.telegram.ui.oj ojVar);

    public abstract View getButtonsLayout();

    public abstract y60 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(boolean z10);

    public abstract void i();

    public final void setAnimationCallback(x60 x60Var) {
        this.f24576a = x60Var;
    }

    public abstract void setInternalPadding(int i10);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(z60 z60Var) {
        this.f24578c = z60Var;
        if (z60Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.sk skVar = ((org.telegram.ui.wj) z60Var).f43542a.Y;
            if (skVar != null) {
                skVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(a70 a70Var) {
        this.f24577b = a70Var;
    }
}
