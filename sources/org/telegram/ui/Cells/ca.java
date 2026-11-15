package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.messenger.kc;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.LaunchActivity;
public final class ca implements ij0, bg.p, kc, org.telegram.messenger.i9, gp, t10 {
    public final int f30125a;
    public final Object f30126b;

    public ca(Object obj, int i7) {
        this.f30125a = i7;
        this.f30126b = obj;
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
        int i7 = this.f30125a;
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ch0 B;
        q0 q0Var;
        int w10;
        gj gjVar;
        switch (this.f30125a) {
            case 2:
                t0 t0Var = (t0) this.f30126b;
                if (z10 && (B = t0Var.J.B()) != null) {
                    gj gjVar2 = t0Var.Q0;
                    if (gjVar2 != null && !gjVar2.f23834o1) {
                        gjVar2.f23834o1 = true;
                        B.N(0, false, false);
                        org.telegram.messenger.g0.h3(new o0(B, 0));
                        if (gjVar2.n1 || t0Var.M1) {
                            gjVar2.n1 = false;
                            t0Var.M1 = false;
                            try {
                                t0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (t0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) t0Var.getContext()).f42663w0.c(false);
                            }
                            TLRPC.VideoSize videoSize = t0Var.J1;
                            if (videoSize != null && (q0Var = t0Var.f31465g1) != null) {
                                q0Var.W(t0Var, t0Var.I1, videoSize);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (B.f33573b0 < 1) {
                        B.stop();
                        B.N(B.f33577e[0] - 1, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                n7 n7Var = (n7) this.f30126b;
                ImageReceiver imageReceiver2 = n7Var.d;
                ImageReceiver imageReceiver3 = n7Var.f30744c;
                if (z10 && !z11 && (gjVar = n7Var.f30757n) != null && gjVar.t2() && imageReceiver3.n() != null) {
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.n().recycle();
                    }
                    imageReceiver2.v0(Utilities.D(imageReceiver3.n(), false));
                }
                if (z10 && !z11 && n7Var.f30772x0 && imageReceiver3.n() != null) {
                    int J0 = org.telegram.messenger.g0.J0(imageReceiver3.n());
                    n7Var.f30740a = J0;
                    CheckBoxBase checkBoxBase = n7Var.Q;
                    if (checkBoxBase != null && checkBoxBase.f32447x != (w10 = org.telegram.ui.ActionBar.j6.w(J0, org.telegram.ui.ActionBar.j6.r1(0.25f, -1)))) {
                        checkBoxBase.f32447x = w10;
                        checkBoxBase.b();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void O(int i7, Drawable drawable) {
        int i10 = this.f30125a;
    }

    @Override
    public void a() {
        switch (this.f30125a) {
            case 4:
                o4 o4Var = (o4) this.f30126b;
                float progress = 1.0f - (o4Var.f30806w.getProgress() * 0.143f);
                org.telegram.ui.Components.i9 i9Var = o4Var.f30798a;
                i9Var.setScaleX(progress);
                i9Var.setScaleY(progress);
                o4Var.invalidate();
                return;
            default:
                c7 c7Var = (c7) this.f30126b;
                float progress2 = 1.0f - (c7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.i9 i9Var2 = c7Var.f30109a;
                i9Var2.setScaleX(progress2);
                i9Var2.setScaleY(progress2);
                c7Var.invalidate();
                return;
        }
    }

    @Override
    public boolean b(int i7, View view) {
        ga gaVar = (ga) this.f30126b;
        gaVar.getClass();
        gaVar.C1(((ThemesHorizontalListCell$InnerThemeView) view).f29968b);
        return true;
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) number;
        return (CharSequence) ((ci.x) this.f30126b).a((Integer) obj);
    }

    @Override
    public void g(long j3) {
        ((l) this.f30126b).b(j3);
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        l4 l4Var;
        q1 q1Var = (q1) this.f30126b;
        gj gjVar = q1Var.Q5;
        if (gjVar != null && (message = gjVar.f23817k) != null) {
            if (gjVar.D != 29 || ((l4Var = q1Var.X5) != null && l4Var.f30615i)) {
                if ((message.noforwards && !gj.c3(message)) || q1Var.Q5.S4() || q1Var.Q5.y2()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    private final void f(ImageReceiver imageReceiver) {
    }

    private final void h(ImageReceiver imageReceiver) {
    }

    private final void c(int i7, Drawable drawable) {
    }

    private final void e(int i7, Drawable drawable) {
    }
}
