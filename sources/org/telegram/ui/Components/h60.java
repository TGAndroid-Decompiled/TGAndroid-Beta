package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedSettings;
public abstract class h60 extends FrameLayout {
    public static final int e = 0;
    public d60 f24695a;
    public g60 f24696b;
    public f60 f24697c;
    public boolean d;

    public static void setUseCamera2Implementation(boolean z10) {
        SharedSettings.roundVideoCamera2Enabled.set(z10);
    }

    public abstract void a(boolean z10);

    public abstract void b(float f7, int i10);

    public abstract void c(boolean z10);

    public abstract boolean d();

    public abstract void e(float f7);

    public abstract void f(int i10, int i11, int i12, long j3, long j10, boolean z10);

    public abstract void g(ah.c cVar, org.telegram.ui.jj jjVar);

    public abstract View getButtonsLayout();

    public abstract e60 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(boolean z10);

    public abstract void i();

    public final void setAnimationCallback(d60 d60Var) {
        this.f24695a = d60Var;
    }

    public abstract void setInternalPadding(int i10);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(f60 f60Var) {
        this.f24697c = f60Var;
        if (f60Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.mk mkVar = ((org.telegram.ui.qj) f60Var).f36947a.Y;
            if (mkVar != null) {
                mkVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(g60 g60Var) {
        this.f24696b = g60Var;
    }
}
