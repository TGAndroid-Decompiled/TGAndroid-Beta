package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class u40 extends FrameLayout {
    public q40 f38589a;
    public t40 f38590b;
    public s40 f38591c;
    public boolean d;

    public static boolean e(int i7) {
        xi.a aVar = xi.e.d;
        aVar.a();
        if (aVar.f58859c) {
            aVar.a();
            return aVar.d;
        } else if (!((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(i7).f24942x7.f24441g0.f13889b).f22780c) {
            return true;
        } else {
            return false;
        }
    }

    public abstract void a(boolean z9);

    public abstract void b(float f10, int i7);

    public abstract void c(boolean z9);

    public abstract void d(boolean z9);

    public abstract boolean f();

    public abstract void g(float f10);

    public abstract View getButtonsLayout();

    public abstract r40 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(int i7, int i10, int i11, long j3, long j10, boolean z9);

    public abstract void i(dh.c cVar, org.telegram.ui.qi qiVar);

    public abstract void j(boolean z9);

    public abstract void k();

    public final void setAnimationCallback(q40 q40Var) {
        this.f38589a = q40Var;
    }

    public abstract void setInternalPadding(int i7);

    public abstract void setIsMessageTransition(boolean z9);

    public final void setRecordingUiFrameCallback(s40 s40Var) {
        this.f38591c = s40Var;
        if (s40Var != null) {
            boolean z9 = this.d;
            org.telegram.ui.sj sjVar = ((org.telegram.ui.yi) s40Var).f52128a.Z;
            if (sjVar != null) {
                sjVar.setRoundVideoUiFrameClockActive(z9);
            }
        }
    }

    public final void setTrimCallback(t40 t40Var) {
        this.f38590b = t40Var;
    }
}
