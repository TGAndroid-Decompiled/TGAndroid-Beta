package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class dh0 implements org.telegram.ui.Components.lj0 {
    public final org.telegram.ui.ActionBar.k2 f36768a;
    public final kh0 f36769b;

    public dh0(kh0 kh0Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f36769b = kh0Var;
        this.f36768a = k2Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect Y0;
        sg.o0 o0Var2;
        org.telegram.ui.ActionBar.k2 k2Var;
        boolean z14;
        long j10;
        long j11;
        sg.o0 o0Var3;
        sg.o0 o0Var4 = o0Var;
        if (o0Var4 != null) {
            kh0 kh0Var = this.f36769b;
            bh0 bh0Var = kh0Var.f38834d0;
            zg0 zg0Var = kh0Var.Z;
            int i10 = kh0Var.f38832c;
            if (bh0Var != null) {
                boolean z15 = true;
                if (!org.telegram.messenger.d20.i(i10).q() && o0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.q1 q1Var = kh0Var.P;
                if (q1Var != null) {
                    org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.f16337k;
                        long j12 = message.effect;
                        long j13 = o0Var4.f48433c;
                        if (j13 == j12) {
                            message.flags2 &= -5;
                            message.effect = 0L;
                            z14 = true;
                        } else {
                            message.flags2 |= 4;
                            message.effect = j13;
                            z14 = false;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.q1 q1Var2 = kh0Var.P;
                            org.telegram.messenger.ej k10 = kh0Var.k(messageObject);
                            if (kh0Var.M.size() <= 1) {
                                z15 = false;
                            }
                            j10 = 0;
                            j11 = j12;
                            q1Var2.s3(messageObject, k10, z15, false, false, false);
                            bh0 bh0Var2 = kh0Var.f38834d0;
                            if (z14) {
                                o0Var3 = null;
                            } else {
                                o0Var3 = o0Var4;
                            }
                            bh0Var2.setSelectedReactionAnimated(o0Var3);
                            if (kh0Var.f38834d0.getReactionsWindow() != null && kh0Var.f38834d0.getReactionsWindow().f48284m != null) {
                                sg.w wVar = kh0Var.f38834d0.getReactionsWindow().f48284m;
                                if (z14) {
                                    o0Var4 = null;
                                }
                                wVar.setSelectedReaction(o0Var4);
                                kh0Var.f38834d0.getReactionsWindow().f48275a.invalidate();
                            }
                        } else {
                            j10 = 0;
                            j11 = j12;
                        }
                        zg0Var.c();
                        if (!z14) {
                            zg0Var.n(kh0Var.P, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.f16337k;
                            message2.effect = j11;
                            if (j11 == j10) {
                                message2.flags2 &= -5;
                            }
                        }
                        ah0 ah0Var = kh0Var.W;
                        if (ah0Var != null) {
                            ah0Var.setEffect(messageObject.f16337k.effect);
                        }
                        kh0Var.l(messageObject.f16337k.effect);
                    } else {
                        return;
                    }
                } else if (kh0Var.f38842k0 != null) {
                    long j14 = o0Var4.f48433c;
                    if (j14 == kh0Var.H) {
                        kh0Var.H = 0L;
                        z13 = true;
                    } else {
                        kh0Var.H = j14;
                        z13 = false;
                    }
                    ah0 ah0Var2 = kh0Var.W;
                    if (ah0Var2 != null) {
                        ah0Var2.setEffect(kh0Var.H);
                    }
                    kh0Var.l(kh0Var.H);
                    if (!z12) {
                        if (kh0Var.H == 0) {
                            Y0 = null;
                        } else {
                            Y0 = org.telegram.messenger.vp.r1(i10).Y0(kh0Var.H);
                        }
                        org.telegram.ui.Components.d5 d5Var = kh0Var.I;
                        if (d5Var != null) {
                            if (kh0Var.H != 0 && Y0 != null) {
                                d5Var.g(org.telegram.messenger.k6.g(Y0.emoticon), true);
                            } else {
                                d5Var.g(null, true);
                            }
                        }
                        bh0 bh0Var3 = kh0Var.f38834d0;
                        if (z13) {
                            o0Var2 = null;
                        } else {
                            o0Var2 = o0Var4;
                        }
                        bh0Var3.setSelectedReactionAnimated(o0Var2);
                        if (kh0Var.f38834d0.getReactionsWindow() != null && kh0Var.f38834d0.getReactionsWindow().f48284m != null) {
                            sg.w wVar2 = kh0Var.f38834d0.getReactionsWindow().f48284m;
                            if (z13) {
                                o0Var4 = null;
                            }
                            wVar2.setSelectedReaction(o0Var4);
                            kh0Var.f38834d0.getReactionsWindow().f48275a.invalidate();
                        }
                    }
                    zg0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j15 = kh0Var.H;
                        tL_message.effect = j15;
                        if (j15 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        kh0Var.Z.d(null, 0, null, new org.telegram.messenger.jj(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (k2Var = this.f36768a) != null) {
                    new org.telegram.ui.Components.cc(kh0Var.F, kh0Var.f38830b).Q(2131624214, 36, org.telegram.messenger.i0.x2(org.telegram.messenger.cd.L0(2131754253, null), new ch0(0, k2Var))).j();
                }
                kh0Var.G.invalidate();
            }
        }
    }

    @Override
    public final void t() {
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
