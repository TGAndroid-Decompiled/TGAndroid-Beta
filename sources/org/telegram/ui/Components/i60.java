package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class i60 extends FrameLayout {
    public static final int e = 0;
    public e60 f24983a;
    public h60 f24984b;
    public g60 f24985c;
    public boolean d;

    public static void setUseCamera2Implementation(boolean z10) {
        pi.a aVar = pi.e.f41358b;
        synchronized (aVar) {
            aVar.f41350c = z10;
            aVar.f41349b = true;
            pi.d.f41356a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
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

    public abstract f60 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(boolean z10);

    public abstract void i();

    public final void setAnimationCallback(e60 e60Var) {
        this.f24983a = e60Var;
    }

    public abstract void setInternalPadding(int i10);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(g60 g60Var) {
        this.f24985c = g60Var;
        if (g60Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.jk jkVar = ((org.telegram.ui.nj) g60Var).f35903a.Y;
            if (jkVar != null) {
                jkVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(h60 h60Var) {
        this.f24984b = h60Var;
    }
}
