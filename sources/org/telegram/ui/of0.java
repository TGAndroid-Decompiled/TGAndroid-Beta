package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class of0 implements org.telegram.ui.Components.ki0 {
    public final org.telegram.ui.ActionBar.d2 f48282a;
    public final vf0 f48283b;

    public of0(vf0 vf0Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f48283b = vf0Var;
        this.f48282a = d2Var;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void z(View view, dh.n0 n0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect Z0;
        dh.n0 n0Var2;
        org.telegram.ui.ActionBar.d2 d2Var;
        boolean z14;
        long j10;
        long j11;
        dh.n0 n0Var3;
        dh.n0 n0Var4 = n0Var;
        if (n0Var4 != null) {
            vf0 vf0Var = this.f48283b;
            mf0 mf0Var = vf0Var.f50480e0;
            kf0 kf0Var = vf0Var.f50473a0;
            int i3 = vf0Var.f50476c;
            if (mf0Var != null) {
                boolean z15 = true;
                if (!org.telegram.messenger.h10.i(i3).q() && n0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.q1 q1Var = vf0Var.Q;
                if (q1Var != null) {
                    org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.f26868k;
                        long j12 = message.effect;
                        long j13 = n0Var4.f9095c;
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
                            org.telegram.ui.Cells.q1 q1Var2 = vf0Var.Q;
                            org.telegram.messenger.ui k10 = vf0Var.k(messageObject);
                            if (vf0Var.N.size() <= 1) {
                                z15 = false;
                            }
                            j10 = 0;
                            j11 = j12;
                            q1Var2.u3(messageObject, k10, z15, false, false, false);
                            mf0 mf0Var2 = vf0Var.f50480e0;
                            if (z14) {
                                n0Var3 = null;
                            } else {
                                n0Var3 = n0Var4;
                            }
                            mf0Var2.setSelectedReactionAnimated(n0Var3);
                            if (vf0Var.f50480e0.getReactionsWindow() != null && vf0Var.f50480e0.getReactionsWindow().f8941m != null) {
                                dh.v vVar = vf0Var.f50480e0.getReactionsWindow().f8941m;
                                if (z14) {
                                    n0Var4 = null;
                                }
                                vVar.setSelectedReaction(n0Var4);
                                vf0Var.f50480e0.getReactionsWindow().f8931a.invalidate();
                            }
                        } else {
                            j10 = 0;
                            j11 = j12;
                        }
                        kf0Var.c();
                        if (!z14) {
                            kf0Var.n(vf0Var.Q, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.f26868k;
                            message2.effect = j11;
                            if (j11 == j10) {
                                message2.flags2 &= -5;
                            }
                        }
                        lf0 lf0Var = vf0Var.X;
                        if (lf0Var != null) {
                            lf0Var.setEffect(messageObject.f26868k.effect);
                        }
                        vf0Var.l(messageObject.f26868k.effect);
                    } else {
                        return;
                    }
                } else if (vf0Var.f50488l0 != null) {
                    long j14 = n0Var4.f9095c;
                    if (j14 == vf0Var.I) {
                        vf0Var.I = 0L;
                        z13 = true;
                    } else {
                        vf0Var.I = j14;
                        z13 = false;
                    }
                    lf0 lf0Var2 = vf0Var.X;
                    if (lf0Var2 != null) {
                        lf0Var2.setEffect(vf0Var.I);
                    }
                    vf0Var.l(vf0Var.I);
                    if (!z12) {
                        if (vf0Var.I == 0) {
                            Z0 = null;
                        } else {
                            Z0 = org.telegram.messenger.hp.s1(i3).Z0(vf0Var.I);
                        }
                        org.telegram.ui.Components.e5 e5Var = vf0Var.J;
                        if (e5Var != null) {
                            if (vf0Var.I != 0 && Z0 != null) {
                                e5Var.g(org.telegram.messenger.i6.g(Z0.emoticon), true);
                            } else {
                                e5Var.g(null, true);
                            }
                        }
                        mf0 mf0Var3 = vf0Var.f50480e0;
                        if (z13) {
                            n0Var2 = null;
                        } else {
                            n0Var2 = n0Var4;
                        }
                        mf0Var3.setSelectedReactionAnimated(n0Var2);
                        if (vf0Var.f50480e0.getReactionsWindow() != null && vf0Var.f50480e0.getReactionsWindow().f8941m != null) {
                            dh.v vVar2 = vf0Var.f50480e0.getReactionsWindow().f8941m;
                            if (z13) {
                                n0Var4 = null;
                            }
                            vVar2.setSelectedReaction(n0Var4);
                            vf0Var.f50480e0.getReactionsWindow().f8931a.invalidate();
                        }
                    }
                    kf0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j15 = vf0Var.I;
                        tL_message.effect = j15;
                        if (j15 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        vf0Var.f50473a0.d(null, 0, null, new org.telegram.messenger.zi(i3, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (d2Var = this.f48282a) != null) {
                    new org.telegram.ui.Components.fc(vf0Var.G, vf0Var.f50474b).Q(2131624216, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.bd.M0(2131754253, null), new nf0(0, d2Var))).j();
                }
                vf0Var.H.invalidate();
            }
        }
    }

    @Override
    public final void J() {
    }

    @Override
    public final void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
    }
}
