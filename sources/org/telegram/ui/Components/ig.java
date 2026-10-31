package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ig implements wk, org.telegram.ui.ActionBar.u1, fe.l, ik0, ei.o, wg.c, ei.n, org.telegram.ui.ActionBar.o0, in, q4, ji {
    public final int f26975a;
    public final bi f26976b;

    public ig(bi biVar, int i10) {
        this.f26975a = i10;
        this.f26976b = biVar;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        long j10;
        boolean t12;
        switch (this.f26975a) {
            case 14:
                bi biVar = this.f26976b;
                uh uhVar = biVar.f24721s2;
                if (uhVar != biVar.a2 && uhVar != biVar.f24679h2) {
                    if (!uhVar.J(z10, i10, i11, 0L, biVar.e1())) {
                        biVar.f24743x4 = true;
                        biVar.dismiss();
                        return;
                    }
                    return;
                }
                biVar.t1(z10, i10, 0, biVar.H2, biVar.e1());
                return;
            default:
                bi biVar2 = this.f26976b;
                pe peVar = biVar2.Y1;
                if (peVar != null) {
                    j10 = peVar.j();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                ih ihVar = biVar2.C2;
                biVar2.H2 = j11;
                ihVar.setEffect(j11);
                uh uhVar2 = biVar2.f24721s2;
                if (uhVar2 != biVar2.a2 && uhVar2 != biVar2.f24679h2) {
                    if (!uhVar2.J(z10, i10, i11, j11, biVar2.e1())) {
                        biVar2.dismiss();
                    }
                    t12 = false;
                } else {
                    t12 = biVar2.t1(z10, i10, i11, j11, biVar2.e1());
                }
                pe peVar2 = biVar2.Y1;
                if (peVar2 != null) {
                    peVar2.g(!t12);
                    biVar2.Y1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(fe.m mVar) {
        this.f26976b.h1();
    }

    @Override
    public int c() {
        bi biVar = this.f26976b;
        biVar.getClass();
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, biVar.I0);
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.f26975a) {
            case 0:
                ((org.telegram.ui.un) this.f26976b.W1).d(messageMedia, i10, z10, i11, 0L);
                return;
            case 12:
                ((org.telegram.ui.un) this.f26976b.W1).d(messageMedia, i10, z10, i11, j10);
                return;
            default:
                ((org.telegram.ui.un) this.f26976b.W1).d(messageMedia, i10, z10, i11, j10);
                return;
        }
    }

    @Override
    public void e(org.telegram.tgnet.TLRPC.MessageMedia r86, android.text.Editable r87, ih.g r88, java.util.ArrayList r89, final boolean r90, final int r91, final long r92) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ig.e(org.telegram.tgnet.TLRPC$MessageMedia, android.text.Editable, ih.g, java.util.ArrayList, boolean, int, long):void");
    }

    @Override
    public boolean f(int i10, View view) {
        TLRPC.User user;
        if (view instanceof vh) {
            vh vhVar = (vh) view;
            bi biVar = this.f26976b;
            if (!biVar.M1 && (user = vhVar.f31256b) != null) {
                biVar.j1(vhVar.f31257c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int g(org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        float f7;
        int i10;
        switch (this.f26975a) {
            case 5:
                if (org.telegram.messenger.sc.e(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.t6.f20872a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.t6.f21019i5;
                }
                int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
                int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, p6Var);
                bi biVar = this.f26976b;
                if (biVar.f24678g4) {
                    return i0.b.f(0.75f, w03, biVar.f24681h4);
                }
                return w7.b9.n(f7, w02, w03);
            case 6:
                if (this.f26976b.f24678g4) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 7:
                if (this.f26976b.f24678g4) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                bi biVar2 = this.f26976b;
                if (biVar2.f24678g4) {
                    if (org.telegram.messenger.i0.B(biVar2.f24681h4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        bi biVar = this.f26976b;
        biVar.f24743x4 = true;
        biVar.dismiss();
    }

    @Override
    public void j(int i10) {
        bi biVar = this.f26976b;
        tg.f fVar = biVar.f24750z4;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (v7.u7.a(i10, 4)) {
                gi.a e = biVar.X0.e();
                e.b(biVar.f21586b.getY(), biVar.f21586b.getWidth(), biVar.f21586b.getY() + biVar.f21586b.getHeight());
                fVar.h(e);
            }
            fVar.e(biVar.D4, biVar.f21586b.getWidth(), biVar.f21586b.getHeight());
        }
    }

    @Override
    public void k(int i10) {
        this.f26976b.R2.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void l(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        CharSequence charSequence2;
        bi biVar = this.f26976b;
        ji jiVar = biVar.P1;
        if (jiVar != null) {
            jiVar.l(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if (k2Var != null && (k2Var instanceof org.telegram.ui.un)) {
            org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var;
            if (unVar.n7()) {
                unVar.u8(charSequence, null);
                org.telegram.messenger.c accountInstance = unVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                long j12 = unVar.f42297j6;
                org.telegram.messenger.jj jjVar = unVar.D5;
                org.telegram.messenger.jj jjVar2 = unVar.l4;
                org.telegram.messenger.jj jjVar3 = unVar.F5;
                org.telegram.messenger.sw P8 = unVar.P8();
                org.telegram.messenger.r5 r5Var = org.telegram.messenger.qz.I;
                new Thread(new org.telegram.messenger.ax(null, arrayList, j12, accountInstance, charSequence2, false, null, jjVar3, jjVar, jjVar2, z10, i10, i11, null, P8, j10, z11, j11, null)).start();
                unVar.F6();
                return;
            }
            return;
        }
        ai aiVar = biVar.T3;
        if (aiVar != null) {
            aiVar.b1(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
        }
    }

    @Override
    public void a() {
    }
}
