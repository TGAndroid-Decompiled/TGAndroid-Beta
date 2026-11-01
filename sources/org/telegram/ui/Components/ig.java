package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ig implements wk, org.telegram.ui.ActionBar.u1, fe.l, jk0, ei.o, wg.c, ei.n, org.telegram.ui.ActionBar.o0, in, q4, ji {
    public final int f27090a;
    public final bi f27091b;

    public ig(bi biVar, int i10) {
        this.f27090a = i10;
        this.f27091b = biVar;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        long j10;
        boolean t12;
        switch (this.f27090a) {
            case 14:
                bi biVar = this.f27091b;
                uh uhVar = biVar.f24812s2;
                if (uhVar != biVar.a2 && uhVar != biVar.f24770h2) {
                    if (!uhVar.J(z10, i10, i11, 0L, biVar.e1())) {
                        biVar.f24834x4 = true;
                        biVar.dismiss();
                        return;
                    }
                    return;
                }
                biVar.t1(z10, i10, 0, biVar.H2, biVar.e1());
                return;
            default:
                bi biVar2 = this.f27091b;
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
                uh uhVar2 = biVar2.f24812s2;
                if (uhVar2 != biVar2.a2 && uhVar2 != biVar2.f24770h2) {
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
        this.f27091b.h1();
    }

    @Override
    public int c() {
        bi biVar = this.f27091b;
        biVar.getClass();
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, biVar.I0);
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.f27090a) {
            case 0:
                ((org.telegram.ui.un) this.f27091b.W1).d(messageMedia, i10, z10, i11, 0L);
                return;
            case 12:
                ((org.telegram.ui.un) this.f27091b.W1).d(messageMedia, i10, z10, i11, j10);
                return;
            default:
                ((org.telegram.ui.un) this.f27091b.W1).d(messageMedia, i10, z10, i11, j10);
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
            bi biVar = this.f27091b;
            if (!biVar.M1 && (user = vhVar.f31305b) != null) {
                biVar.j1(vhVar.f31306c, user);
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
        switch (this.f27090a) {
            case 5:
                if (org.telegram.messenger.tc.e(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.t6.f20873a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.t6.f21020i5;
                }
                int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
                int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, p6Var);
                bi biVar = this.f27091b;
                if (biVar.f24769g4) {
                    return i0.b.f(0.75f, w03, biVar.f24772h4);
                }
                return w7.b9.n(f7, w02, w03);
            case 6:
                if (this.f27091b.f24769g4) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 7:
                if (this.f27091b.f24769g4) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                bi biVar2 = this.f27091b;
                if (biVar2.f24769g4) {
                    if (org.telegram.messenger.i0.B(biVar2.f24772h4) <= 0.72f) {
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
        bi biVar = this.f27091b;
        biVar.f24834x4 = true;
        biVar.dismiss();
    }

    @Override
    public void j(int i10) {
        bi biVar = this.f27091b;
        tg.f fVar = biVar.f24841z4;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (v7.u7.a(i10, 4)) {
                gi.a e = biVar.X0.e();
                e.b(biVar.f21587b.getY(), biVar.f21587b.getWidth(), biVar.f21587b.getY() + biVar.f21587b.getHeight());
                fVar.h(e);
            }
            fVar.e(biVar.D4, biVar.f21587b.getWidth(), biVar.f21587b.getHeight());
        }
    }

    @Override
    public void k(int i10) {
        this.f27091b.R2.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void l(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        CharSequence charSequence2;
        bi biVar = this.f27091b;
        ji jiVar = biVar.P1;
        if (jiVar != null) {
            jiVar.l(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if (k2Var != null && (k2Var instanceof org.telegram.ui.un)) {
            org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var;
            if (unVar.r7()) {
                unVar.y8(charSequence, null);
                org.telegram.messenger.c accountInstance = unVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                long j12 = unVar.f42108j6;
                org.telegram.messenger.kj kjVar = unVar.D5;
                org.telegram.messenger.kj kjVar2 = unVar.l4;
                org.telegram.messenger.kj kjVar3 = unVar.F5;
                org.telegram.messenger.tw T8 = unVar.T8();
                org.telegram.messenger.r5 r5Var = org.telegram.messenger.rz.I;
                new Thread(new org.telegram.messenger.bx(null, arrayList, j12, accountInstance, charSequence2, false, null, kjVar3, kjVar, kjVar2, z10, i10, i11, null, T8, j10, z11, j11, null)).start();
                unVar.I6();
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
