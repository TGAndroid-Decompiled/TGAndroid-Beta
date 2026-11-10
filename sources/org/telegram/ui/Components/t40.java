package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class t40 extends FrameLayout {
    public p40 f38161a;
    public s40 f38162b;
    public r40 f38163c;
    public boolean d;

    public static boolean e(int i7) {
        xi.a aVar = xi.e.d;
        aVar.a();
        if (aVar.f58857c) {
            aVar.a();
            return aVar.d;
        } else if (!((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(i7).f24946x7.f24445g0.f13891b).f22784c) {
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

    public abstract void i(dh.c cVar, org.telegram.ui.qi qiVar);

    public abstract void j(boolean z9);

    public abstract void k();

    public final void setAnimationCallback(p40 p40Var) {
        this.f38161a = p40Var;
    }

    public abstract void setInternalPadding(int i7);

    public abstract void setIsMessageTransition(boolean z9);

    public final void setRecordingUiFrameCallback(r40 r40Var) {
        this.f38163c = r40Var;
        if (r40Var != null) {
            boolean z9 = this.d;
            org.telegram.ui.sj sjVar = ((org.telegram.ui.yi) r40Var).f52049a.Z;
            if (sjVar != null) {
                sjVar.setRoundVideoUiFrameClockActive(z9);
            }
        }
    }

    public final void setTrimCallback(s40 s40Var) {
        this.f38162b = s40Var;
    }
}
