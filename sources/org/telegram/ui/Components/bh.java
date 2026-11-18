package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bh implements jl, org.telegram.ui.ActionBar.r1, te.i, qj0, ri.n, gh.d, ri.m, org.telegram.ui.ActionBar.m0, qn, z4, zi {
    public final int f33686a;
    public final si f33687b;

    public bh(si siVar, int i7) {
        this.f33686a = i7;
        this.f33687b = siVar;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        long j3;
        boolean v12;
        switch (this.f33686a) {
            case 14:
                si siVar = this.f33687b;
                ki kiVar = siVar.f39732w2;
                if (kiVar != siVar.f39670e2 && kiVar != siVar.f39690l2) {
                    if (!kiVar.M(z10, i7, i10, 0L, siVar.g1())) {
                        siVar.B4 = true;
                        siVar.dismiss();
                        return;
                    }
                    return;
                }
                siVar.v1(z10, i7, 0, siVar.L2, siVar.g1());
                return;
            default:
                si siVar2 = this.f33687b;
                df dfVar = siVar2.f39665c2;
                if (dfVar != null) {
                    j3 = dfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                ai aiVar = siVar2.G2;
                siVar2.L2 = j10;
                aiVar.setEffect(j10);
                ki kiVar2 = siVar2.f39732w2;
                if (kiVar2 != siVar2.f39670e2 && kiVar2 != siVar2.f39690l2) {
                    if (!kiVar2.M(z10, i7, i10, j10, siVar2.g1())) {
                        siVar2.dismiss();
                    }
                    v12 = false;
                } else {
                    v12 = siVar2.v1(z10, i7, i10, j10, siVar2.g1());
                }
                df dfVar2 = siVar2.f39665c2;
                if (dfVar2 != null) {
                    dfVar2.h(!v12);
                    siVar2.f39665c2 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        switch (this.f33686a) {
            case 0:
                ((org.telegram.ui.bn) this.f33687b.f39659a2).b(messageMedia, i7, z10, i10, 0L);
                return;
            case 12:
                ((org.telegram.ui.bn) this.f33687b.f39659a2).b(messageMedia, i7, z10, i10, j3);
                return;
            default:
                ((org.telegram.ui.bn) this.f33687b.f39659a2).b(messageMedia, i7, z10, i10, j3);
                return;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        TLRPC.User user;
        if (view instanceof li) {
            li liVar = (li) view;
            si siVar = this.f33687b;
            if (!siVar.Q1 && (user = liVar.f37129b) != null) {
                siVar.l1(liVar.f37130c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void d(org.telegram.tgnet.TLRPC.MessageMedia r86, android.text.Editable r87, sh.e r88, java.util.ArrayList r89, final boolean r90, final int r91, final long r92) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bh.d(org.telegram.tgnet.TLRPC$MessageMedia, android.text.Editable, sh.e, java.util.ArrayList, boolean, int, long):void");
    }

    @Override
    public int e() {
        si siVar = this.f33687b;
        siVar.getClass();
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394d6, siVar.J0);
    }

    @Override
    public void f(te.j jVar) {
        this.f33687b.j1();
    }

    @Override
    public void g(int i7) {
        this.f33687b.V2.getActionBarMenuOnItemClick().b(i7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        si siVar = this.f33687b;
        siVar.B4 = true;
        siVar.dismiss();
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        CharSequence charSequence2;
        si siVar = this.f33687b;
        zi ziVar = siVar.T1;
        if (ziVar != null) {
            ziVar.i(arrayList, charSequence, z10, i7, i10, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
        if (h2Var != null && (h2Var instanceof org.telegram.ui.bn)) {
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) h2Var;
            if (bnVar.u7()) {
                bnVar.D8(charSequence, null);
                org.telegram.messenger.c accountInstance = bnVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                long j11 = bnVar.f46076l6;
                org.telegram.messenger.fj fjVar = bnVar.F5;
                org.telegram.messenger.fj fjVar2 = bnVar.f46087m4;
                org.telegram.messenger.fj fjVar3 = bnVar.H5;
                org.telegram.messenger.bw Y8 = bnVar.Y8();
                org.telegram.messenger.q5 q5Var = org.telegram.messenger.zy.J;
                new Thread(new org.telegram.messenger.iw(null, arrayList, j11, accountInstance, charSequence2, false, null, fjVar3, fjVar, fjVar2, z10, i7, i10, null, Y8, j3, z11, j10, null)).start();
                bnVar.L6();
                return;
            }
            return;
        }
        qi qiVar = siVar.X3;
        if (qiVar != null) {
            qiVar.b2(arrayList, charSequence, z10, i7, i10, j3, z11, j10);
        }
    }

    @Override
    public int j(org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        float f10;
        int i7;
        switch (this.f33686a) {
            case 5:
                if (org.telegram.messenger.pc.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                if (z10) {
                    i7 = org.telegram.ui.ActionBar.n6.f29337a7;
                } else {
                    i7 = org.telegram.ui.ActionBar.n6.f29485i5;
                }
                int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
                int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394d6, i6Var);
                si siVar = this.f33687b;
                if (siVar.f39689k4) {
                    return i0.a.f(0.75f, w03, siVar.f39692l4);
                }
                return c8.i0.n(f10, w02, w03);
            case 6:
                if (this.f33687b.f39689k4) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 7:
                if (this.f33687b.f39689k4) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                si siVar2 = this.f33687b;
                if (siVar2.f39689k4) {
                    if (org.telegram.messenger.g0.B(siVar2.f39692l4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void l(int i7) {
        si siVar = this.f33687b;
        dh.g gVar = siVar.D4;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.dd.a(i7, 4)) {
                ti.a e10 = siVar.Y0.e();
                e10.b(siVar.f30190b.getY(), siVar.f30190b.getWidth(), siVar.f30190b.getY() + siVar.f30190b.getHeight());
                gVar.h(e10);
            }
            gVar.e(siVar.H4, siVar.f30190b.getWidth(), siVar.f30190b.getHeight());
        }
    }

    @Override
    public void a() {
    }
}
