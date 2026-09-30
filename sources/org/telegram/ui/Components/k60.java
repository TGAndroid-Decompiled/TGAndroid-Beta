package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class k60 extends FrameLayout {
    public static final int e = 0;
    public g60 f25655a;
    public j60 f25656b;
    public i60 f25657c;
    public boolean d;

    public static void setUseCamera2Implementation(boolean z10) {
        pi.a aVar = pi.e.f41458b;
        synchronized (aVar) {
            aVar.f41450c = z10;
            aVar.f41449b = true;
            pi.d.f41456a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
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

    public abstract h60 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(boolean z10);

    public abstract void i();

    public final void setAnimationCallback(g60 g60Var) {
        this.f25655a = g60Var;
    }

    public abstract void setInternalPadding(int i10);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(i60 i60Var) {
        this.f25657c = i60Var;
        if (i60Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.jk jkVar = ((org.telegram.ui.nj) i60Var).f36015a.Y;
            if (jkVar != null) {
                jkVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(j60 j60Var) {
        this.f25656b = j60Var;
    }
}
