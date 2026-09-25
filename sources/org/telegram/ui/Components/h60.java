package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class h60 extends FrameLayout {
    public static final int e = 0;
    public d60 f24647a;
    public g60 f24648b;
    public f60 f24649c;
    public boolean d;

    public static void setUseCamera2Implementation(boolean z10) {
        pi.a aVar = pi.e.f41360b;
        synchronized (aVar) {
            aVar.f41352c = z10;
            aVar.f41351b = true;
            pi.d.f41358a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
        }
    }

    public abstract void a(boolean z10);

    public abstract void b(float f7, int i10);

    public abstract void c(boolean z10);

    public abstract boolean d();

    public abstract void e(float f7);

    public abstract void f(int i10, int i11, int i12, long j3, long j10, boolean z10);

    public abstract void g(ah.c cVar, org.telegram.ui.gj gjVar);

    public abstract View getButtonsLayout();

    public abstract e60 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(boolean z10);

    public abstract void i();

    public final void setAnimationCallback(d60 d60Var) {
        this.f24647a = d60Var;
    }

    public abstract void setInternalPadding(int i10);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(f60 f60Var) {
        this.f24649c = f60Var;
        if (f60Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.jk jkVar = ((org.telegram.ui.nj) f60Var).f35905a.Y;
            if (jkVar != null) {
                jkVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(g60 g60Var) {
        this.f24648b = g60Var;
    }
}
