package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mg implements vk, org.telegram.ui.ActionBar.r1, te.i, ej0, oi.n, gh.d, oi.m, org.telegram.ui.ActionBar.m0, an, t4, ki {
    public final int f36083a;
    public final di f36084b;

    public mg(di diVar, int i7) {
        this.f36083a = i7;
        this.f36084b = diVar;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        long j3;
        boolean u12;
        switch (this.f36083a) {
            case 14:
                di diVar = this.f36084b;
                vh vhVar = diVar.f33047s2;
                if (vhVar != diVar.f32987a2 && vhVar != diVar.f33007h2) {
                    if (!vhVar.L(z9, i7, i10, 0L, diVar.f1())) {
                        diVar.f33069x4 = true;
                        diVar.dismiss();
                        return;
                    }
                    return;
                }
                diVar.u1(z9, i7, 0, diVar.H2, diVar.f1());
                return;
            default:
                di diVar2 = this.f36084b;
                ue ueVar = diVar2.Y1;
                if (ueVar != null) {
                    j3 = ueVar.j();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                lh lhVar = diVar2.C2;
                diVar2.H2 = j10;
                lhVar.setEffect(j10);
                vh vhVar2 = diVar2.f33047s2;
                if (vhVar2 != diVar2.f32987a2 && vhVar2 != diVar2.f33007h2) {
                    if (!vhVar2.L(z9, i7, i10, j10, diVar2.f1())) {
                        diVar2.dismiss();
                    }
                    u12 = false;
                } else {
                    u12 = diVar2.u1(z9, i7, i10, j10, diVar2.f1());
                }
                ue ueVar2 = diVar2.Y1;
                if (ueVar2 != null) {
                    ueVar2.g(!u12);
                    diVar2.Y1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(org.telegram.tgnet.TLRPC.MessageMedia r86, android.text.Editable r87, sh.e r88, java.util.ArrayList r89, final boolean r90, final int r91, final long r92) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mg.b(org.telegram.tgnet.TLRPC$MessageMedia, android.text.Editable, sh.e, java.util.ArrayList, boolean, int, long):void");
    }

    @Override
    public boolean c(int i7, View view) {
        TLRPC.User user;
        if (view instanceof wh) {
            wh whVar = (wh) view;
            di diVar = this.f36084b;
            if (!diVar.M1 && (user = whVar.f40055b) != null) {
                diVar.k1(whVar.f40056c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        switch (this.f36083a) {
            case 0:
                ((org.telegram.ui.cn) this.f36084b.W1).d(messageMedia, i7, z9, i10, 0L);
                return;
            case 12:
                ((org.telegram.ui.cn) this.f36084b.W1).d(messageMedia, i7, z9, i10, j3);
                return;
            default:
                ((org.telegram.ui.cn) this.f36084b.W1).d(messageMedia, i7, z9, i10, j3);
                return;
        }
    }

    @Override
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
        CharSequence charSequence2;
        di diVar = this.f36084b;
        ki kiVar = diVar.P1;
        if (kiVar != null) {
            kiVar.e(arrayList, charSequence, z9, i7, i10, j3, z10, j10);
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        if (f2Var != null && (f2Var instanceof org.telegram.ui.cn)) {
            org.telegram.ui.cn cnVar = (org.telegram.ui.cn) f2Var;
            if (cnVar.u7()) {
                cnVar.C8(charSequence, null);
                org.telegram.messenger.c accountInstance = cnVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                long j11 = cnVar.f44504j6;
                org.telegram.messenger.ij ijVar = cnVar.D5;
                org.telegram.messenger.ij ijVar2 = cnVar.f44527l4;
                org.telegram.messenger.ij ijVar3 = cnVar.F5;
                org.telegram.messenger.hw X8 = cnVar.X8();
                org.telegram.messenger.p5 p5Var = org.telegram.messenger.gz.I;
                new Thread(new org.telegram.messenger.ow(null, arrayList, j11, accountInstance, charSequence2, false, null, ijVar3, ijVar, ijVar2, z9, i7, i10, null, X8, j3, z10, j10, null)).start();
                cnVar.L6();
                return;
            }
            return;
        }
        bi biVar = diVar.T3;
        if (biVar != null) {
            biVar.M1(arrayList, charSequence, z9, i7, i10, j3, z10, j10);
        }
    }

    @Override
    public void f(te.j jVar) {
        this.f36084b.i1();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        di diVar = this.f36084b;
        diVar.f33069x4 = true;
        diVar.dismiss();
    }

    @Override
    public int h() {
        di diVar = this.f36084b;
        diVar.getClass();
        return org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, diVar.I0);
    }

    @Override
    public void i(int i7) {
        this.f36084b.R2.getActionBarMenuOnItemClick().b(i7);
    }

    @Override
    public int k(org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        float f10;
        int i7;
        switch (this.f36083a) {
            case 5:
                if (org.telegram.messenger.sc.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                if (z9) {
                    i7 = org.telegram.ui.ActionBar.l6.f27809a7;
                } else {
                    i7 = org.telegram.ui.ActionBar.l6.f27956i5;
                }
                int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
                int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, g6Var);
                di diVar = this.f36084b;
                if (diVar.f33006g4) {
                    return i0.a.f(0.75f, w03, diVar.f33009h4);
                }
                return c8.g0.m(f10, w02, w03);
            case 6:
                if (this.f36084b.f33006g4) {
                    return 0;
                }
                if (z9) {
                    return 687865855;
                }
                return -1;
            case 7:
                if (this.f36084b.f33006g4) {
                    return 0;
                }
                if (z9) {
                    return 352321535;
                }
                return -1;
            default:
                di diVar2 = this.f36084b;
                if (diVar2.f33006g4) {
                    if (org.telegram.messenger.g0.B(diVar2.f33009h4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z9) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void l(int i7) {
        di diVar = this.f36084b;
        dh.g gVar = diVar.f33077z4;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.zc.a(i7, 4)) {
                qi.a e10 = diVar.X0.e();
                e10.b(diVar.f28624b.getY(), diVar.f28624b.getWidth(), diVar.f28624b.getY() + diVar.f28624b.getHeight());
                gVar.h(e10);
            }
            gVar.e(diVar.D4, diVar.f28624b.getWidth(), diVar.f28624b.getHeight());
        }
    }

    @Override
    public void a() {
    }
}
