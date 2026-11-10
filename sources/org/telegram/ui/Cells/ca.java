package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ij;
import org.telegram.messenger.lc;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.xo;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
public final class ca implements dj0, bg.p, lc, org.telegram.messenger.j9, xo, w10 {
    public final int f29020a;
    public final Object f29021b;

    public ca(Object obj, int i7) {
        this.f29020a = i7;
        this.f29021b = obj;
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
        int i7 = this.f29020a;
    }

    @Override
    public void a() {
        switch (this.f29020a) {
            case 4:
                o4 o4Var = (o4) this.f29021b;
                float progress = 1.0f - (o4Var.f29669w.getProgress() * 0.143f);
                org.telegram.ui.Components.k9 k9Var = o4Var.f29661a;
                k9Var.setScaleX(progress);
                k9Var.setScaleY(progress);
                o4Var.invalidate();
                return;
            default:
                d7 d7Var = (d7) this.f29021b;
                float progress2 = 1.0f - (d7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.k9 k9Var2 = d7Var.f29038a;
                k9Var2.setScaleX(progress2);
                k9Var2.setScaleY(progress2);
                d7Var.invalidate();
                return;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        ga gaVar = (ga) this.f29021b;
        gaVar.getClass();
        gaVar.C1(((ThemesHorizontalListCell$InnerThemeView) view).f28869b);
        return true;
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) number;
        return (CharSequence) ((ai.c0) this.f29021b).a((Integer) obj);
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        zg0 B;
        q0 q0Var;
        int w10;
        ij ijVar;
        switch (this.f29020a) {
            case 2:
                t0 t0Var = (t0) this.f29021b;
                if (z9 && (B = t0Var.I.B()) != null) {
                    ij ijVar2 = t0Var.P0;
                    if (ijVar2 != null && !ijVar2.f23274m1) {
                        ijVar2.f23274m1 = true;
                        B.N(0, false, false);
                        org.telegram.messenger.g0.h3(new o0(B, 0));
                        if (ijVar2.l1 || t0Var.L1) {
                            ijVar2.l1 = false;
                            t0Var.L1 = false;
                            try {
                                t0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (t0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) t0Var.getContext()).f41291v0.c(false);
                            }
                            TLRPC.VideoSize videoSize = t0Var.I1;
                            if (videoSize != null && (q0Var = t0Var.f30327f1) != null) {
                                q0Var.D(t0Var, t0Var.H1, videoSize);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (B.f40962a0 < 1) {
                        B.stop();
                        B.N(B.f40968e[0] - 1, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                o7 o7Var = (o7) this.f29021b;
                ImageReceiver imageReceiver2 = o7Var.d;
                ImageReceiver imageReceiver3 = o7Var.f29679c;
                if (z9 && !z10 && (ijVar = o7Var.f29692n) != null && ijVar.t2() && imageReceiver3.n() != null) {
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.n().recycle();
                    }
                    imageReceiver2.v0(Utilities.D(imageReceiver3.n(), false));
                }
                if (z9 && !z10 && o7Var.f29705w0 && imageReceiver3.n() != null) {
                    int J0 = org.telegram.messenger.g0.J0(imageReceiver3.n());
                    o7Var.f29675a = J0;
                    CheckBoxBase checkBoxBase = o7Var.P;
                    if (checkBoxBase != null && checkBoxBase.f31285x != (w10 = org.telegram.ui.ActionBar.m6.w(J0, org.telegram.ui.ActionBar.m6.r1(0.25f, -1)))) {
                        checkBoxBase.f31285x = w10;
                        checkBoxBase.b();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void j(long j3) {
        ((l) this.f29021b).b(j3);
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        l4 l4Var;
        q1 q1Var = (q1) this.f29021b;
        ij ijVar = q1Var.P5;
        if (ijVar != null && (message = ijVar.f23266k) != null) {
            if (ijVar.D != 29 || ((l4Var = q1Var.W5) != null && l4Var.f29512i)) {
                if ((message.noforwards && !ij.c3(message)) || q1Var.P5.S4() || q1Var.P5.y2()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public void t0(int i7, Drawable drawable) {
        int i10 = this.f29020a;
    }

    private final void f(ImageReceiver imageReceiver) {
    }

    private final void g(ImageReceiver imageReceiver) {
    }

    private final void b(int i7, Drawable drawable) {
    }

    private final void e(int i7, Drawable drawable) {
    }
}
