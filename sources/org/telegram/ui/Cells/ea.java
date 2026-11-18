package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fj;
import org.telegram.messenger.jc;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.LaunchActivity;
public final class ea implements qj0, bg.q, jc, org.telegram.messenger.h9, np, r10 {
    public final int f30590a;
    public final Object f30591b;

    public ea(Object obj, int i7) {
        this.f30590a = i7;
        this.f30591b = obj;
    }

    @Override
    public void G0(int i7, Drawable drawable) {
        int i10 = this.f30590a;
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
        int i7 = this.f30590a;
    }

    @Override
    public void a() {
        switch (this.f30590a) {
            case 4:
                p4 p4Var = (p4) this.f30591b;
                float progress = 1.0f - (p4Var.f31214w.getProgress() * 0.143f);
                org.telegram.ui.Components.q9 q9Var = p4Var.f31206a;
                q9Var.setScaleX(progress);
                q9Var.setScaleY(progress);
                p4Var.invalidate();
                return;
            default:
                e7 e7Var = (e7) this.f30591b;
                float progress2 = 1.0f - (e7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.q9 q9Var2 = e7Var.f30574a;
                q9Var2.setScaleX(progress2);
                q9Var2.setScaleY(progress2);
                e7Var.invalidate();
                return;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        ia iaVar = (ia) this.f30591b;
        iaVar.getClass();
        iaVar.C1(((ThemesHorizontalListCell$InnerThemeView) view).f30343b);
        return true;
    }

    @Override
    public Object g(Number number, Object obj) {
        Integer num = (Integer) number;
        return (CharSequence) ((ci.y) this.f30591b).a((Integer) obj);
    }

    @Override
    public void i(long j3) {
        ((l) this.f30591b).b(j3);
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        mh0 B;
        s0 s0Var;
        int w10;
        fj fjVar;
        switch (this.f30590a) {
            case 2:
                v0 v0Var = (v0) this.f30591b;
                if (z10 && (B = v0Var.J.B()) != null) {
                    fj fjVar2 = v0Var.Q0;
                    if (fjVar2 != null && !fjVar2.f23982o1) {
                        fjVar2.f23982o1 = true;
                        B.N(0, false, false);
                        org.telegram.messenger.g0.g3(new p0(B, 0));
                        if (fjVar2.n1 || v0Var.M1) {
                            fjVar2.n1 = false;
                            v0Var.M1 = false;
                            try {
                                v0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (v0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) v0Var.getContext()).f43108w0.c(false);
                            }
                            TLRPC.VideoSize videoSize = v0Var.J1;
                            if (videoSize != null && (s0Var = v0Var.f32083g1) != null) {
                                s0Var.Q(v0Var, v0Var.I1, videoSize);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (B.f37482b0 < 1) {
                        B.stop();
                        B.N(B.f37486e[0] - 1, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                p7 p7Var = (p7) this.f30591b;
                ImageReceiver imageReceiver2 = p7Var.d;
                ImageReceiver imageReceiver3 = p7Var.f31226c;
                if (z10 && !z11 && (fjVar = p7Var.f31239n) != null && fjVar.t2() && imageReceiver3.n() != null) {
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.n().recycle();
                    }
                    imageReceiver2.v0(Utilities.D(imageReceiver3.n(), false));
                }
                if (z10 && !z11 && p7Var.f31254x0 && imageReceiver3.n() != null) {
                    int J0 = org.telegram.messenger.g0.J0(imageReceiver3.n());
                    p7Var.f31222a = J0;
                    CheckBoxBase checkBoxBase = p7Var.Q;
                    if (checkBoxBase != null && checkBoxBase.f32844x != (w10 = org.telegram.ui.ActionBar.n6.w(J0, org.telegram.ui.ActionBar.n6.r1(0.25f, -1)))) {
                        checkBoxBase.f32844x = w10;
                        checkBoxBase.b();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        m4 m4Var;
        r1 r1Var = (r1) this.f30591b;
        fj fjVar = r1Var.Q5;
        if (fjVar != null && (message = fjVar.f23965k) != null) {
            if (fjVar.D != 29 || ((m4Var = r1Var.X5) != null && m4Var.f31059i)) {
                if ((message.noforwards && !fj.c3(message)) || r1Var.Q5.S4() || r1Var.Q5.y2()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    private final void e(ImageReceiver imageReceiver) {
    }

    private final void f(ImageReceiver imageReceiver) {
    }

    private final void b(int i7, Drawable drawable) {
    }

    private final void d(int i7, Drawable drawable) {
    }
}
