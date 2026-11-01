package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class bh0 implements org.telegram.ui.Components.mj0 {
    public final org.telegram.ui.ActionBar.k2 f36057a;
    public final ih0 f36058b;

    public bh0(ih0 ih0Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f36058b = ih0Var;
        this.f36057a = k2Var;
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
            ih0 ih0Var = this.f36058b;
            zg0 zg0Var = ih0Var.f38064d0;
            xg0 xg0Var = ih0Var.Z;
            int i10 = ih0Var.f38062c;
            if (zg0Var != null) {
                boolean z15 = true;
                if (!org.telegram.messenger.e20.i(i10).q() && o0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.q1 q1Var = ih0Var.P;
                if (q1Var != null) {
                    org.telegram.messenger.kj messageObject = q1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.f16690k;
                        long j12 = message.effect;
                        long j13 = o0Var4.f48444c;
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
                            org.telegram.ui.Cells.q1 q1Var2 = ih0Var.P;
                            org.telegram.messenger.fj k10 = ih0Var.k(messageObject);
                            if (ih0Var.M.size() <= 1) {
                                z15 = false;
                            }
                            j10 = 0;
                            j11 = j12;
                            q1Var2.s3(messageObject, k10, z15, false, false, false);
                            zg0 zg0Var2 = ih0Var.f38064d0;
                            if (z14) {
                                o0Var3 = null;
                            } else {
                                o0Var3 = o0Var4;
                            }
                            zg0Var2.setSelectedReactionAnimated(o0Var3);
                            if (ih0Var.f38064d0.getReactionsWindow() != null && ih0Var.f38064d0.getReactionsWindow().f48295m != null) {
                                sg.w wVar = ih0Var.f38064d0.getReactionsWindow().f48295m;
                                if (z14) {
                                    o0Var4 = null;
                                }
                                wVar.setSelectedReaction(o0Var4);
                                ih0Var.f38064d0.getReactionsWindow().f48286a.invalidate();
                            }
                        } else {
                            j10 = 0;
                            j11 = j12;
                        }
                        xg0Var.c();
                        if (!z14) {
                            xg0Var.n(ih0Var.P, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.f16690k;
                            message2.effect = j11;
                            if (j11 == j10) {
                                message2.flags2 &= -5;
                            }
                        }
                        yg0 yg0Var = ih0Var.W;
                        if (yg0Var != null) {
                            yg0Var.setEffect(messageObject.f16690k.effect);
                        }
                        ih0Var.l(messageObject.f16690k.effect);
                    } else {
                        return;
                    }
                } else if (ih0Var.f38072k0 != null) {
                    long j14 = o0Var4.f48444c;
                    if (j14 == ih0Var.H) {
                        ih0Var.H = 0L;
                        z13 = true;
                    } else {
                        ih0Var.H = j14;
                        z13 = false;
                    }
                    yg0 yg0Var2 = ih0Var.W;
                    if (yg0Var2 != null) {
                        yg0Var2.setEffect(ih0Var.H);
                    }
                    ih0Var.l(ih0Var.H);
                    if (!z12) {
                        if (ih0Var.H == 0) {
                            Y0 = null;
                        } else {
                            Y0 = org.telegram.messenger.wp.r1(i10).Y0(ih0Var.H);
                        }
                        org.telegram.ui.Components.d5 d5Var = ih0Var.I;
                        if (d5Var != null) {
                            if (ih0Var.H != 0 && Y0 != null) {
                                d5Var.g(org.telegram.messenger.k6.g(Y0.emoticon), true);
                            } else {
                                d5Var.g(null, true);
                            }
                        }
                        zg0 zg0Var3 = ih0Var.f38064d0;
                        if (z13) {
                            o0Var2 = null;
                        } else {
                            o0Var2 = o0Var4;
                        }
                        zg0Var3.setSelectedReactionAnimated(o0Var2);
                        if (ih0Var.f38064d0.getReactionsWindow() != null && ih0Var.f38064d0.getReactionsWindow().f48295m != null) {
                            sg.w wVar2 = ih0Var.f38064d0.getReactionsWindow().f48295m;
                            if (z13) {
                                o0Var4 = null;
                            }
                            wVar2.setSelectedReaction(o0Var4);
                            ih0Var.f38064d0.getReactionsWindow().f48286a.invalidate();
                        }
                    }
                    xg0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j15 = ih0Var.H;
                        tL_message.effect = j15;
                        if (j15 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        ih0Var.Z.d(null, 0, null, new org.telegram.messenger.kj(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (k2Var = this.f36057a) != null) {
                    new org.telegram.ui.Components.cc(ih0Var.F, ih0Var.f38060b).Q(2131624214, 36, org.telegram.messenger.i0.x2(org.telegram.messenger.dd.L0(2131754253, null), new ah0(0, k2Var))).j();
                }
                ih0Var.G.invalidate();
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
