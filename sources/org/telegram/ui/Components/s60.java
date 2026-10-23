package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class s60 extends FrameLayout {
    public static final int e = 0;
    public o60 f30389a;
    public r60 f30390b;
    public q60 f30391c;
    public boolean d;

    public abstract void a(boolean z10);

    public abstract void b(float f7, int i10);

    public abstract void c(boolean z10);

    public abstract boolean d();

    public abstract void e(float f7);

    public abstract void f(int i10, int i11, int i12, long j10, long j11, boolean z10);

    public abstract void g(bh.b bVar, org.telegram.ui.bj bjVar);

    public abstract View getButtonsLayout();

    public abstract p60 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(boolean z10);

    public abstract void i();

    public final void setAnimationCallback(o60 o60Var) {
        this.f30389a = o60Var;
    }

    public abstract void setInternalPadding(int i10);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(q60 q60Var) {
        this.f30391c = q60Var;
        if (q60Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.gk gkVar = ((org.telegram.ui.jj) q60Var).f38591a.Y;
            if (gkVar != null) {
                gkVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(r60 r60Var) {
        this.f30390b = r60Var;
    }
}
