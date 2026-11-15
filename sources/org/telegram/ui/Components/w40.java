package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class w40 extends FrameLayout {
    public s40 f41255a;
    public v40 f41256b;
    public u40 f41257c;
    public boolean d;

    public static boolean e(int i7) {
        aj.a aVar = aj.e.d;
        aVar.a();
        if (aVar.f1650c) {
            aVar.a();
            return aVar.d;
        } else if (!((org.telegram.messenger.h0) org.telegram.messenger.np.s1(i7).f25451y7.f25849g0.f14544b).f24009c) {
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

    public abstract t40 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(int i7, int i10, int i11, long j3, long j10, boolean z10);

    public abstract void i(dh.c cVar, org.telegram.ui.oi oiVar);

    public abstract void j(boolean z10);

    public abstract void k();

    public final void setAnimationCallback(s40 s40Var) {
        this.f41255a = s40Var;
    }

    public abstract void setInternalPadding(int i7);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(u40 u40Var) {
        this.f41257c = u40Var;
        if (u40Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.qj qjVar = ((org.telegram.ui.wi) u40Var).f52917a.f45117a0;
            if (qjVar != null) {
                qjVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(v40 v40Var) {
        this.f41256b = v40Var;
    }
}
