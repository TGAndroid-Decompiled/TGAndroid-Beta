package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class t40 extends FrameLayout {
    public p40 f38207a;
    public s40 f38208b;
    public r40 f38209c;
    public boolean d;

    public static boolean d(int i7) {
        xi.a aVar = xi.e.d;
        aVar.a();
        if (aVar.f58754c) {
            aVar.a();
            return aVar.d;
        } else if (!((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(i7).f24935x7.f24437g0.f13889b).f22774c) {
            return true;
        } else {
            return false;
        }
    }

    public abstract void a(boolean z9);

    public abstract void b(float f10, int i7);

    public abstract void c(boolean z9);

    public abstract boolean e();

    public abstract void f(float f10);

    public abstract void g(int i7, int i10, int i11, long j3, long j10, boolean z9);

    public abstract View getButtonsLayout();

    public abstract q40 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(dh.c cVar, org.telegram.ui.oi oiVar);

    public abstract void i(boolean z9);

    public abstract void j();

    public final void setAnimationCallback(p40 p40Var) {
        this.f38207a = p40Var;
    }

    public abstract void setInternalPadding(int i7);

    public abstract void setIsMessageTransition(boolean z9);

    public final void setRecordingUiFrameCallback(r40 r40Var) {
        this.f38209c = r40Var;
        if (r40Var != null) {
            boolean z9 = this.d;
            org.telegram.ui.qj qjVar = ((org.telegram.ui.wi) r40Var).f51445a.Z;
            if (qjVar != null) {
                qjVar.setRoundVideoUiFrameClockActive(z9);
            }
        }
    }

    public final void setTrimCallback(s40 s40Var) {
        this.f38208b = s40Var;
    }
}
