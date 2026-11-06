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
    public final int f38307a;
    public final KeyEvent.Callback f38308b;
    public final Object f38309c;
    public final Object d;

    public td0(KeyEvent.Callback callback, Object obj, Object obj2, int i7) {
        this.f38307a = i7;
        this.f38308b = callback;
        this.f38309c = obj;
        this.d = obj2;
    }

    @Override
    public final void onClick(View view) {
        View view2;
        String M0;
        int i7 = this.f38307a;
        Object obj = this.d;
        Object obj2 = this.f38309c;
        KeyEvent.Callback callback = this.f38308b;
        switch (i7) {
            case 0:
                ud0 ud0Var = (ud0) callback;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                if (ud0Var.h == null) {
                    fi.j3 j3Var = new fi.j3(context, f6Var, org.telegram.messenger.hd.M0(2131743608, null), ud0Var.f38602f);
                    ud0Var.h = j3Var;
                    j3Var.n(new ob0(ud0Var, 5));
                    ud0Var.h.f12224m1 = ud0Var.f38603n;
                }
                ud0Var.h.show();
                return;
            case 1:
                i21 i21Var = (i21) callback;
                org.telegram.messenger.ed edVar = (org.telegram.messenger.ed) obj;
                k21 k21Var = i21Var.f34472n;
                Runnable runnable = ((Runnable[]) obj2)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = k21Var.f35145r1;
                j21 j21Var = k21Var.E1;
                if (!TextUtils.equals(str, edVar.f22185f)) {
                    View view3 = j21Var.d;
                    if (view3 == k21Var.f35149v1 || view3 == k21Var.f35143p1) {
                        k21Var.f35146s1 = k21Var.f35145r1;
                    }
                    g21 g21Var = i21Var.f34470e;
                    String str2 = edVar.f22185f;
                    k21Var.f35145r1 = str2;
                    g21Var.setText(k21.K0(k21.O0(str2, null, null)));
                    if (k21Var.n1 != null) {
                        view2 = k21Var.f35142o1;
                    } else {
                        view2 = k21Var.f35148u1;
                    }
                    j21Var.D(view2);
                    k21.S0(k21Var.f35145r1);
                    k21Var.W0();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.bk bkVar = (org.telegram.ui.bk) callback;
                org.telegram.messenger.f10 f10Var = (org.telegram.messenger.f10) obj2;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj;
                long j3 = bkVar.f31670b;
                f10Var.J(j3, true, false);
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(bkVar.f31669a).M0(Long.valueOf(-j3));
                if (M02 != null && org.telegram.messenger.t3.V(M02)) {
                    M0 = org.telegram.messenger.hd.M0(2131743951, null);
                } else if (M02 != null) {
                    M0 = org.telegram.messenger.hd.M0(2131743949, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131743950, null);
                }
                hc.a0(bkVar.f31671c).K(2131624103, org.telegram.messenger.g0.X2(M0), org.telegram.messenger.hd.M0(2131743886, null), new v80(27, bkVar, f10Var)).j();
                g1Var.d(true);
                return;
            case 3:
                org.telegram.ui.up0 up0Var = (org.telegram.ui.up0) callback;
                Context context2 = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (up0Var.f55602u1) {
                    sg.q qVar = new sg.q(context2, up0Var.f55612z1);
                    qVar.I0(up0Var.f55600t1.f55016a, 2);
                    qVar.f55093o1 = new androidx.activity.n(up0Var, bitmap, 6);
                    qVar.n1 = new tg.m(up0Var, 1);
                    qVar.show();
                    return;
                }
                Runnable runnable2 = up0Var.D1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 4:
                new zh.m((Context) obj2, null, null, (org.telegram.messenger.s9) obj).show();
                ((zh.f) callback).dismiss();
                return;
            case 5:
                zh.m mVar = (zh.m) callback;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    org.telegram.messenger.w9.c(mVar.f28613a).e(mVar.P1, new bi.v3(mVar, zArr, f6Var2, 12));
                    return;
                }
                return;
            case 6:
                zh.v vVar = (zh.v) callback;
                int i10 = vVar.f28613a;
                org.telegram.messenger.s9 s9Var = vVar.f60456e2;
                new bi.w1((Context) obj2, (org.telegram.ui.ActionBar.f6) obj, i10, s9Var.d.title, s9Var.h, false).show();
                vVar.dismiss();
                return;
            case 7:
                zh.v vVar2 = (zh.v) callback;
                boolean[] zArr2 = (boolean[]) obj2;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    org.telegram.messenger.w9.c(vVar2.f28613a).e(vVar2.Q1, new bi.v3(vVar2, zArr2, f6Var3, 13));
                    return;
                }
                return;
            default:
                zh.a2 a2Var = (zh.a2) callback;
                ((k60) obj2).u();
                up0 up0Var2 = a2Var.f60105a;
                zh.t1 t1Var = new zh.t1(a2Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = zh.f2.U;
                up0Var2.h(null, t1Var);
                return;
        }
    }
}
