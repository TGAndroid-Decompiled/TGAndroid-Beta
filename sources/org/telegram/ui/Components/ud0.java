package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ud0 implements View.OnClickListener {
    public final int f38703a;
    public final KeyEvent.Callback f38704b;
    public final Object f38705c;
    public final Object d;

    public ud0(KeyEvent.Callback callback, Object obj, Object obj2, int i7) {
        this.f38703a = i7;
        this.f38704b = callback;
        this.f38705c = obj;
        this.d = obj2;
    }

    @Override
    public final void onClick(View view) {
        View view2;
        String M0;
        int i7 = this.f38703a;
        Object obj = this.d;
        Object obj2 = this.f38705c;
        KeyEvent.Callback callback = this.f38704b;
        switch (i7) {
            case 0:
                vd0 vd0Var = (vd0) callback;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                if (vd0Var.h == null) {
                    fi.j3 j3Var = new fi.j3(context, g6Var, org.telegram.messenger.id.M0(2131743607, null), vd0Var.f39043f);
                    vd0Var.h = j3Var;
                    j3Var.n(new pb0(vd0Var, 5));
                    vd0Var.h.f12224m1 = vd0Var.f39044n;
                }
                vd0Var.h.show();
                return;
            case 1:
                j21 j21Var = (j21) callback;
                org.telegram.messenger.fd fdVar = (org.telegram.messenger.fd) obj;
                l21 l21Var = j21Var.f34921n;
                Runnable runnable = ((Runnable[]) obj2)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = l21Var.f35562r1;
                k21 k21Var = l21Var.E1;
                if (!TextUtils.equals(str, fdVar.f22400f)) {
                    View view3 = k21Var.d;
                    if (view3 == l21Var.f35566v1 || view3 == l21Var.f35560p1) {
                        l21Var.f35563s1 = l21Var.f35562r1;
                    }
                    h21 h21Var = j21Var.f34919e;
                    String str2 = fdVar.f22400f;
                    l21Var.f35562r1 = str2;
                    h21Var.setText(l21.K0(l21.O0(str2, null, null)));
                    if (l21Var.n1 != null) {
                        view2 = l21Var.f35559o1;
                    } else {
                        view2 = l21Var.f35565u1;
                    }
                    k21Var.D(view2);
                    l21.S0(l21Var.f35562r1);
                    l21Var.W0();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.dk dkVar = (org.telegram.ui.dk) callback;
                org.telegram.messenger.f10 f10Var = (org.telegram.messenger.f10) obj2;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj;
                long j3 = dkVar.f32077b;
                f10Var.J(j3, true, false);
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(dkVar.f32076a).M0(Long.valueOf(-j3));
                if (M02 != null && org.telegram.messenger.t3.V(M02)) {
                    M0 = org.telegram.messenger.id.M0(2131743950, null);
                } else if (M02 != null) {
                    M0 = org.telegram.messenger.id.M0(2131743948, null);
                } else {
                    M0 = org.telegram.messenger.id.M0(2131743949, null);
                }
                hc.a0(dkVar.f32078c).K(2131624103, org.telegram.messenger.g0.X2(M0), org.telegram.messenger.id.M0(2131743885, null), new w80(27, dkVar, f10Var)).j();
                g1Var.d(true);
                return;
            case 3:
                org.telegram.ui.wp0 wp0Var = (org.telegram.ui.wp0) callback;
                Context context2 = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (wp0Var.f55707u1) {
                    sg.q qVar = new sg.q(context2, wp0Var.f55717z1);
                    qVar.I0(wp0Var.f55705t1.f55094a, 2);
                    qVar.f55196o1 = new androidx.activity.n(wp0Var, bitmap, 6);
                    qVar.n1 = new tg.m(wp0Var, 1);
                    qVar.show();
                    return;
                }
                Runnable runnable2 = wp0Var.D1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 4:
                new zh.l((Context) obj2, null, null, (org.telegram.messenger.s9) obj).show();
                ((zh.f) callback).dismiss();
                return;
            case 5:
                zh.l lVar = (zh.l) callback;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    org.telegram.messenger.w9.c(lVar.f28621a).e(lVar.P1, new bi.v3(lVar, zArr, g6Var2, 12));
                    return;
                }
                return;
            case 6:
                zh.u uVar = (zh.u) callback;
                int i10 = uVar.f28621a;
                org.telegram.messenger.s9 s9Var = uVar.f60554e2;
                new bi.w1((Context) obj2, (org.telegram.ui.ActionBar.g6) obj, i10, s9Var.d.title, s9Var.h, false).show();
                uVar.dismiss();
                return;
            case 7:
                zh.u uVar2 = (zh.u) callback;
                boolean[] zArr2 = (boolean[]) obj2;
                org.telegram.ui.ActionBar.g6 g6Var3 = (org.telegram.ui.ActionBar.g6) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    org.telegram.messenger.w9.c(uVar2.f28621a).e(uVar2.Q1, new bi.v3(uVar2, zArr2, g6Var3, 13));
                    return;
                }
                return;
            default:
                zh.z1 z1Var = (zh.z1) callback;
                ((l60) obj2).u();
                vp0 vp0Var = z1Var.f60639a;
                zh.s1 s1Var = new zh.s1(z1Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = zh.d2.U;
                vp0Var.h(null, s1Var);
                return;
        }
    }
}
