package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class e50 extends FrameLayout {
    public a50 f34572a;
    public d50 f34573b;
    public c50 f34574c;
    public boolean d;

    public static boolean e(int i7) {
        aj.a aVar = aj.e.d;
        aVar.a();
        if (aVar.f1613c) {
            aVar.a();
            return aVar.d;
        } else if (!((org.telegram.messenger.h0) org.telegram.messenger.mp.u1(i7).A7.m0.f17372b).f24439c) {
            return true;
        } else {
            return false;
        }
    }

    public abstract void a(boolean z10);

    public abstract void b(float f10, int i7);

    public abstract void c(boolean z10);

    public abstract void d(boolean z10);

    public abstract boolean f();

    public abstract void g(float f10);

    public abstract View getButtonsLayout();

    public abstract b50 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(int i7, int i10, int i11, long j3, long j10, boolean z10);

    public abstract void i(dh.c cVar, org.telegram.ui.pi piVar);

    public abstract void j(boolean z10);

    public abstract void k();

    public final void setAnimationCallback(a50 a50Var) {
        this.f34572a = a50Var;
    }

    public abstract void setInternalPadding(int i7);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(c50 c50Var) {
        this.f34574c = c50Var;
        if (c50Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.rj rjVar = ((org.telegram.ui.xi) c50Var).f53978a.f46118a0;
            if (rjVar != null) {
                rjVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(d50 d50Var) {
        this.f34573b = d50Var;
    }
}
