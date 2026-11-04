package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public abstract class p40 extends FrameLayout {
    public l40 f37060a;
    public o40 f37061b;
    public n40 f37062c;
    public boolean d;

    public static boolean d(int i3) {
        xi.a aVar = xi.e.d;
        aVar.a();
        if (aVar.f58870c) {
            aVar.a();
            return aVar.d;
        } else if (!((org.telegram.messenger.h0) org.telegram.messenger.hp.s1(i3).f23167x7.f24657g0.f13688b).f22814c) {
            return true;
        } else {
            return false;
        }
    }

    public abstract void a(boolean z10);

    public abstract void b(float f10, int i3);

    public abstract void c(boolean z10);

    public abstract boolean e();

    public abstract void f(float f10);

    public abstract void g(int i3, int i10, int i11, long j10, long j11, boolean z10);

    public abstract View getButtonsLayout();

    public abstract m40 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(eh.c cVar, org.telegram.ui.ki kiVar);

    public abstract void i(boolean z10);

    public abstract void j();

    public final void setAnimationCallback(l40 l40Var) {
        this.f37060a = l40Var;
    }

    public abstract void setInternalPadding(int i3);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(n40 n40Var) {
        this.f37062c = n40Var;
        if (n40Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.mj mjVar = ((org.telegram.ui.si) n40Var).f49516a.f51237a0;
            if (mjVar != null) {
                mjVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(o40 o40Var) {
        this.f37061b = o40Var;
    }
}
