package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kj;
import org.telegram.messenger.l20;
import org.telegram.messenger.nc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zh;
public final class ca implements jk0, rf.l, nc, org.telegram.messenger.k9, fp, l20 {
    public final int f21799a;
    public final Object f21800b;

    public ca(Object obj, int i10) {
        this.f21799a = i10;
        this.f21800b = obj;
    }

    @Override
    public void a() {
        switch (this.f21799a) {
            case 4:
                q4 q4Var = (q4) this.f21800b;
                float progress = 1.0f - (q4Var.f22829w.getProgress() * 0.143f);
                org.telegram.ui.Components.g9 g9Var = q4Var.f22822a;
                g9Var.setScaleX(progress);
                g9Var.setScaleY(progress);
                q4Var.invalidate();
                return;
            default:
                h7 h7Var = (h7) this.f21800b;
                float progress2 = 1.0f - (h7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.g9 g9Var2 = h7Var.f21992a;
                g9Var2.setScaleX(progress2);
                g9Var2.setScaleY(progress2);
                h7Var.invalidate();
                return;
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) number;
        return (CharSequence) ((zh) this.f21800b).a((Integer) obj);
    }

    @Override
    public boolean f(int i10, View view) {
        ga gaVar = (ga) this.f21800b;
        gaVar.getClass();
        gaVar.C1(((ThemesHorizontalListCell$InnerThemeView) view).f21645b);
        return true;
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
        int i10 = this.f21799a;
    }

    @Override
    public void l(long j10) {
        ((k) this.f21800b).b(j10);
    }

    @Override
    public void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ci0 B;
        q0 q0Var;
        int w9;
        kj kjVar;
        switch (this.f21799a) {
            case 2:
                s0 s0Var = (s0) this.f21800b;
                if (z10 && (B = s0Var.I.B()) != null) {
                    kj kjVar2 = s0Var.P0;
                    if (kjVar2 != null && !kjVar2.f16698m1) {
                        kjVar2.f16698m1 = true;
                        B.N(0, false, false);
                        org.telegram.messenger.i0.g3(new o0(B, 0));
                        if (kjVar2.l1 || s0Var.L1) {
                            kjVar2.l1 = false;
                            s0Var.L1 = false;
                            try {
                                s0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (s0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) s0Var.getContext()).f33398x0.c(false);
                            }
                            TLRPC.VideoSize videoSize = s0Var.I1;
                            if (videoSize != null && (q0Var = s0Var.f22908f1) != null) {
                                q0Var.t0(s0Var, s0Var.H1, videoSize);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (B.f25131a0 < 1) {
                        B.stop();
                        B.N(B.e[0] - 1, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                s7 s7Var = (s7) this.f21800b;
                ImageReceiver imageReceiver2 = s7Var.d;
                ImageReceiver imageReceiver3 = s7Var.f23022c;
                if (z10 && !z11 && (kjVar = s7Var.f23034n) != null && kjVar.t2() && imageReceiver3.n() != null) {
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.n().recycle();
                    }
                    imageReceiver2.v0(Utilities.D(imageReceiver3.n(), false));
                }
                if (z10 && !z11 && s7Var.f23047w0 && imageReceiver3.n() != null) {
                    int J0 = org.telegram.messenger.i0.J0(imageReceiver3.n());
                    s7Var.f23018a = J0;
                    CheckBoxBase checkBoxBase = s7Var.P;
                    if (checkBoxBase != null && checkBoxBase.f23926x != (w9 = org.telegram.ui.ActionBar.t6.w(J0, org.telegram.ui.ActionBar.t6.r1(0.25f, -1)))) {
                        checkBoxBase.f23926x = w9;
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
        n4 n4Var;
        q1 q1Var = (q1) this.f21800b;
        kj kjVar = q1Var.O5;
        if (kjVar != null && (message = kjVar.f16690k) != null) {
            if (kjVar.D != 29 || ((n4Var = q1Var.V5) != null && n4Var.f22343i)) {
                if ((message.noforwards && !kj.c3(message)) || q1Var.O5.S4() || q1Var.O5.y2()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public void s(int i10, Drawable drawable) {
        int i11 = this.f21799a;
    }

    private final void e(ImageReceiver imageReceiver) {
    }

    private final void g(ImageReceiver imageReceiver) {
    }

    private final void b(int i10, Drawable drawable) {
    }

    private final void c(int i10, Drawable drawable) {
    }
}
