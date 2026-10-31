package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class j50 extends FrameLayout {
    public f50 f27232a;
    public i50 f27233b;
    public h50 f27234c;
    public boolean d;

    public static boolean d(int i10) {
        mi.a aVar = mi.e.d;
        aVar.a();
        if (aVar.f13377c) {
            aVar.a();
            return aVar.d;
        } else if (!((org.telegram.messenger.j0) org.telegram.messenger.vp.r1(i10).f18957y7.f17836g0.f11587b).f16204c) {
            return true;
        } else {
            return false;
        }
    }

    public abstract void a(boolean z10);

    public abstract void b(float f7, int i10);

    public abstract void c(boolean z10);

    public abstract boolean e();

    public abstract void f(float f7);

    public abstract void g(int i10, int i11, int i12, long j10, long j11, boolean z10);

    public abstract View getButtonsLayout();

    public abstract g50 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(tg.b bVar, org.telegram.ui.jj jjVar);

    public abstract void i(boolean z10);

    public abstract void j();

    public final void setAnimationCallback(f50 f50Var) {
        this.f27232a = f50Var;
    }

    public abstract void setInternalPadding(int i10);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(h50 h50Var) {
        this.f27234c = h50Var;
        if (h50Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.mk mkVar = ((org.telegram.ui.rj) h50Var).f41239a.Z;
            if (mkVar != null) {
                mkVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(i50 i50Var) {
        this.f27233b = i50Var;
    }
}
