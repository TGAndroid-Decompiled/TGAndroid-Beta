package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class td0 implements View.OnClickListener {
    public final int f38291a;
    public final KeyEvent.Callback f38292b;
    public final Object f38293c;
    public final Object d;

    public td0(KeyEvent.Callback callback, Object obj, Object obj2, int i7) {
        this.f38291a = i7;
        this.f38292b = callback;
        this.f38293c = obj;
        this.d = obj2;
    }

    @Override
    public final void onClick(View view) {
        View view2;
        String M0;
        int i7 = this.f38291a;
        Object obj = this.d;
        Object obj2 = this.f38293c;
        KeyEvent.Callback callback = this.f38292b;
        switch (i7) {
            case 0:
                ud0 ud0Var = (ud0) callback;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                if (ud0Var.h == null) {
                    fi.j3 j3Var = new fi.j3(context, h6Var, org.telegram.messenger.id.M0(2131743607, null), ud0Var.f38628f);
                    ud0Var.h = j3Var;
                    j3Var.n(new ob0(ud0Var, 5));
                    ud0Var.h.f12227p1 = ud0Var.f38629n;
                }
                ud0Var.h.show();
                return;
            case 1:
                i21 i21Var = (i21) callback;
                org.telegram.messenger.fd fdVar = (org.telegram.messenger.fd) obj;
                k21 k21Var = i21Var.f34522n;
                Runnable runnable = ((Runnable[]) obj2)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = k21Var.f35153u1;
                j21 j21Var = k21Var.H1;
                if (!TextUtils.equals(str, fdVar.f22404f)) {
                    View view3 = j21Var.d;
                    if (view3 == k21Var.f35157y1 || view3 == k21Var.f35151s1) {
                        k21Var.f35154v1 = k21Var.f35153u1;
                    }
                    g21 g21Var = i21Var.f34520e;
                    String str2 = fdVar.f22404f;
                    k21Var.f35153u1 = str2;
                    g21Var.setText(k21.K0(k21.O0(str2, null, null)));
                    if (k21Var.f35149q1 != null) {
                        view2 = k21Var.f35150r1;
                    } else {
                        view2 = k21Var.f35156x1;
                    }
                    j21Var.D(view2);
                    k21.S0(k21Var.f35153u1);
                    k21Var.W0();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.dk dkVar = (org.telegram.ui.dk) callback;
                org.telegram.messenger.f10 f10Var = (org.telegram.messenger.f10) obj2;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj;
                long j3 = dkVar.f31682b;
                f10Var.J(j3, true, false);
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(dkVar.f31681a).M0(Long.valueOf(-j3));
                if (M02 != null && org.telegram.messenger.t3.V(M02)) {
                    M0 = org.telegram.messenger.id.M0(2131743950, null);
                } else if (M02 != null) {
                    M0 = org.telegram.messenger.id.M0(2131743948, null);
                } else {
                    M0 = org.telegram.messenger.id.M0(2131743949, null);
                }
                gc.a0(dkVar.f31683c).K(2131624103, org.telegram.messenger.g0.X2(M0), org.telegram.messenger.id.M0(2131743885, null), new r80(28, dkVar, f10Var)).j();
                g1Var.d(true);
                return;
            case 3:
                org.telegram.ui.xp0 xp0Var = (org.telegram.ui.xp0) callback;
                Context context2 = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (xp0Var.f55706u1) {
                    sg.q qVar = new sg.q(context2, xp0Var.f55716z1);
                    qVar.I0(xp0Var.f55704t1.f55093a, 2);
                    qVar.f55195r1 = new androidx.activity.n(xp0Var, bitmap, 6);
                    qVar.f55194q1 = new tg.m(xp0Var, 1);
                    qVar.show();
                    return;
                }
                Runnable runnable2 = xp0Var.D1;
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
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    org.telegram.messenger.w9.c(lVar.f28669a).e(lVar.S1, new bi.v3(lVar, zArr, h6Var2, 12));
                    return;
                }
                return;
            case 6:
                zh.u uVar = (zh.u) callback;
                int i10 = uVar.f28669a;
                org.telegram.messenger.s9 s9Var = uVar.f60566h2;
                new bi.w1((Context) obj2, (org.telegram.ui.ActionBar.h6) obj, i10, s9Var.d.title, s9Var.h, false).show();
                uVar.dismiss();
                return;
            case 7:
                zh.u uVar2 = (zh.u) callback;
                boolean[] zArr2 = (boolean[]) obj2;
                org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    org.telegram.messenger.w9.c(uVar2.f28669a).e(uVar2.T1, new bi.v3(uVar2, zArr2, h6Var3, 13));
                    return;
                }
                return;
            default:
                zh.z1 z1Var = (zh.z1) callback;
                ((k60) obj2).u();
                up0 up0Var = z1Var.f60651a;
                zh.s1 s1Var = new zh.s1(z1Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = zh.d2.U;
                up0Var.h(null, s1Var);
                return;
        }
    }
}
