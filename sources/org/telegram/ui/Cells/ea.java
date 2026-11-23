package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fj;
import org.telegram.messenger.jc;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.LaunchActivity;
public final class ea implements sj0, bg.q, jc, org.telegram.messenger.h9, mp, q10 {
    public final int f30673a;
    public final Object f30674b;

    public ea(Object obj, int i7) {
        this.f30673a = i7;
        this.f30674b = obj;
    }

    @Override
    public void J(int i7, Drawable drawable) {
        int i10 = this.f30673a;
    }

    @Override
    public void a() {
        switch (this.f30673a) {
            case 4:
                p4 p4Var = (p4) this.f30674b;
                float progress = 1.0f - (p4Var.f31322w.getProgress() * 0.143f);
                org.telegram.ui.Components.p9 p9Var = p4Var.f31314a;
                p9Var.setScaleX(progress);
                p9Var.setScaleY(progress);
                p4Var.invalidate();
                return;
            default:
                d7 d7Var = (d7) this.f30674b;
                float progress2 = 1.0f - (d7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.p9 p9Var2 = d7Var.f30631a;
                p9Var2.setScaleX(progress2);
                p9Var2.setScaleY(progress2);
                d7Var.invalidate();
                return;
        }
    }

    @Override
    public boolean b(int i7, View view) {
        ja jaVar = (ja) this.f30674b;
        jaVar.getClass();
        jaVar.C1(((ThemesHorizontalListCell$InnerThemeView) view).f30433b);
        return true;
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) number;
        return (CharSequence) ((ci.y) this.f30674b).a((Integer) obj);
    }

    @Override
    public void g(long j3) {
        ((l) this.f30674b).b(j3);
    }

    @Override
    public void r(ImageReceiver imageReceiver) {
        int i7 = this.f30673a;
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        m4 m4Var;
        r1 r1Var = (r1) this.f30674b;
        fj fjVar = r1Var.Q5;
        if (fjVar != null && (message = fjVar.f24073k) != null) {
            if (fjVar.D != 29 || ((m4Var = r1Var.X5) != null && m4Var.f31135i)) {
                if ((message.noforwards && !fj.c3(message)) || r1Var.Q5.S4() || r1Var.Q5.y2()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        nh0 C;
        s0 s0Var;
        int w10;
        fj fjVar;
        switch (this.f30673a) {
            case 2:
                v0 v0Var = (v0) this.f30674b;
                if (z10 && (C = v0Var.J.C()) != null) {
                    fj fjVar2 = v0Var.Q0;
                    if (fjVar2 != null && !fjVar2.f24090o1) {
                        fjVar2.f24090o1 = true;
                        C.N(0, false, false);
                        org.telegram.messenger.g0.g3(new p0(C, 0));
                        if (fjVar2.n1 || v0Var.M1) {
                            fjVar2.n1 = false;
                            v0Var.M1 = false;
                            try {
                                v0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (v0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) v0Var.getContext()).f43228w0.c(false);
                            }
                            TLRPC.VideoSize videoSize = v0Var.J1;
                            if (videoSize != null && (s0Var = v0Var.f32163g1) != null) {
                                s0Var.K(v0Var, v0Var.I1, videoSize);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (C.f37801b0 < 1) {
                        C.stop();
                        C.N(C.f37805e[0] - 1, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                o7 o7Var = (o7) this.f30674b;
                ImageReceiver imageReceiver2 = o7Var.d;
                ImageReceiver imageReceiver3 = o7Var.f31263c;
                if (z10 && !z11 && (fjVar = o7Var.f31276n) != null && fjVar.t2() && imageReceiver3.n() != null) {
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.n().recycle();
                    }
                    imageReceiver2.w0(Utilities.D(imageReceiver3.n(), false));
                }
                if (z10 && !z11 && o7Var.f31291x0 && imageReceiver3.n() != null) {
                    int J0 = org.telegram.messenger.g0.J0(imageReceiver3.n());
                    o7Var.f31259a = J0;
                    CheckBoxBase checkBoxBase = o7Var.Q;
                    if (checkBoxBase != null && checkBoxBase.f32944x != (w10 = org.telegram.ui.ActionBar.n6.w(J0, org.telegram.ui.ActionBar.n6.r1(0.25f, -1)))) {
                        checkBoxBase.f32944x = w10;
                        checkBoxBase.b();
                        return;
                    }
                    return;
                }
                return;
        }
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
