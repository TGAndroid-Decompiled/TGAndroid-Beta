package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class t40 extends FrameLayout {
    public p40 f38235a;
    public s40 f38236b;
    public r40 f38237c;
    public boolean d;

    public static boolean e(int i7) {
        xi.a aVar = xi.e.d;
        aVar.a();
        if (aVar.f58850c) {
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

    public abstract q40 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(int i7, int i10, int i11, long j3, long j10, boolean z9);

    public abstract void i(dh.c cVar, org.telegram.ui.oi oiVar);

    public abstract void j(boolean z9);

    public abstract void k();

    public final void setAnimationCallback(p40 p40Var) {
        this.f38235a = p40Var;
    }

    public abstract void setInternalPadding(int i7);

    public abstract void setIsMessageTransition(boolean z9);

    public final void setRecordingUiFrameCallback(r40 r40Var) {
        this.f38237c = r40Var;
        if (r40Var != null) {
            boolean z9 = this.d;
            org.telegram.ui.qj qjVar = ((org.telegram.ui.wi) r40Var).f51452a.Z;
            if (qjVar != null) {
                qjVar.setRoundVideoUiFrameClockActive(z9);
            }
        }
    }

    public final void setTrimCallback(s40 s40Var) {
        this.f38236b = s40Var;
    }
}
