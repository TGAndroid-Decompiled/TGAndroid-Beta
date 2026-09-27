package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class j60 extends FrameLayout {
    public static final int e = 0;
    public f60 f25333a;
    public i60 f25334b;
    public h60 f25335c;
    public boolean d;

    public static void setUseCamera2Implementation(boolean z10) {
        qi.a aVar = qi.e.f42134b;
        synchronized (aVar) {
            aVar.f42126c = z10;
            aVar.f42125b = true;
            qi.d.f42132a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
        }
    }

    public abstract void a(boolean z10);

    public abstract void b(float f7, int i10);

    public abstract void c(boolean z10);

    public abstract boolean d();

    public abstract void e(float f7);

    public abstract void f(int i10, int i11, int i12, long j3, long j10, boolean z10);

    public abstract void g(ah.c cVar, org.telegram.ui.ij ijVar);

    public abstract View getButtonsLayout();

    public abstract g60 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(boolean z10);

    public abstract void i();

    public final void setAnimationCallback(f60 f60Var) {
        this.f25333a = f60Var;
    }

    public abstract void setInternalPadding(int i10);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(h60 h60Var) {
        this.f25335c = h60Var;
        if (h60Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.lk lkVar = ((org.telegram.ui.pj) h60Var).f36496a.Y;
            if (lkVar != null) {
                lkVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(i60 i60Var) {
        this.f25334b = i60Var;
    }
}
