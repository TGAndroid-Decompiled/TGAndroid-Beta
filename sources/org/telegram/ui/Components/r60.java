package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class r60 extends FrameLayout {
    public static final int e = 0;
    public n60 f29863a;
    public q60 f29864b;
    public p60 f29865c;
    public boolean d;

    public abstract void a(boolean z10);

    public abstract void b(float f7, int i10);

    public abstract void c(boolean z10);

    public abstract boolean d();

    public abstract void e(float f7);

    public abstract void f(int i10, int i11, int i12, long j10, long j11, boolean z10);

    public abstract void g(bh.b bVar, org.telegram.ui.bj bjVar);

    public abstract View getButtonsLayout();

    public abstract o60 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(boolean z10);

    public abstract void i();

    public final void setAnimationCallback(n60 n60Var) {
        this.f29863a = n60Var;
    }

    public abstract void setInternalPadding(int i10);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(p60 p60Var) {
        this.f29865c = p60Var;
        if (p60Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.fk fkVar = ((org.telegram.ui.jj) p60Var).f38264a.Y;
            if (fkVar != null) {
                fkVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(q60 q60Var) {
        this.f29864b = q60Var;
    }
}
