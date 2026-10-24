package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class q60 extends FrameLayout {
    public static final int e = 0;
    public m60 f29810a;
    public p60 f29811b;
    public o60 f29812c;
    public boolean d;

    public abstract void a(boolean z10);

    public abstract void b(float f7, int i10);

    public abstract void c(boolean z10);

    public abstract boolean d();

    public abstract void e(float f7);

    public abstract void f(int i10, int i11, int i12, long j10, long j11, boolean z10);

    public abstract void g(bh.b bVar, org.telegram.ui.bj bjVar);

    public abstract View getButtonsLayout();

    public abstract n60 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(boolean z10);

    public abstract void i();

    public final void setAnimationCallback(m60 m60Var) {
        this.f29810a = m60Var;
    }

    public abstract void setInternalPadding(int i10);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(o60 o60Var) {
        this.f29812c = o60Var;
        if (o60Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.gk gkVar = ((org.telegram.ui.jj) o60Var).f38579a.Y;
            if (gkVar != null) {
                gkVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(p60 p60Var) {
        this.f29811b = p60Var;
    }
}
