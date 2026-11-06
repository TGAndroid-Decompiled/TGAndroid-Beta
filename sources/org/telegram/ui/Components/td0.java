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
    public final int f38327a;
    public final KeyEvent.Callback f38328b;
    public final Object f38329c;
    public final Object d;

    public td0(KeyEvent.Callback callback, Object obj, Object obj2, int i7) {
        this.f38327a = i7;
        this.f38328b = callback;
        this.f38329c = obj;
        this.d = obj2;
    }

    @Override
    public final void onClick(View view) {
        View view2;
        String M0;
        int i7 = this.f38327a;
        Object obj = this.d;
        Object obj2 = this.f38329c;
        KeyEvent.Callback callback = this.f38328b;
        switch (i7) {
            case 0:
                ud0 ud0Var = (ud0) callback;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                if (ud0Var.h == null) {
                    fi.j3 j3Var = new fi.j3(context, f6Var, org.telegram.messenger.hd.M0(2131743608, null), ud0Var.f38615f);
                    ud0Var.h = j3Var;
                    j3Var.n(new ob0(ud0Var, 5));
                    ud0Var.h.f12224m1 = ud0Var.f38616n;
                }
                ud0Var.h.show();
                return;
            case 1:
                c21 c21Var = (c21) callback;
                org.telegram.messenger.ed edVar = (org.telegram.messenger.ed) obj;
                e21 e21Var = c21Var.f32386n;
                Runnable runnable = ((Runnable[]) obj2)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = e21Var.f33109r1;
                d21 d21Var = e21Var.E1;
                if (!TextUtils.equals(str, edVar.f22178f)) {
                    View view3 = d21Var.d;
                    if (view3 == e21Var.f33113v1 || view3 == e21Var.f33107p1) {
                        e21Var.f33110s1 = e21Var.f33109r1;
                    }
                    a21 a21Var = c21Var.f32384e;
                    String str2 = edVar.f22178f;
                    e21Var.f33109r1 = str2;
                    a21Var.setText(e21.K0(e21.O0(str2, null, null)));
                    if (e21Var.n1 != null) {
                        view2 = e21Var.f33106o1;
                    } else {
                        view2 = e21Var.f33112u1;
                    }
                    d21Var.D(view2);
                    e21.S0(e21Var.f33109r1);
                    e21Var.W0();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.bk bkVar = (org.telegram.ui.bk) callback;
                org.telegram.messenger.f10 f10Var = (org.telegram.messenger.f10) obj2;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj;
                long j3 = bkVar.f38505b;
                f10Var.J(j3, true, false);
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(bkVar.f38504a).M0(Long.valueOf(-j3));
                if (M02 != null && org.telegram.messenger.t3.V(M02)) {
                    M0 = org.telegram.messenger.hd.M0(2131743951, null);
                } else if (M02 != null) {
                    M0 = org.telegram.messenger.hd.M0(2131743949, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131743950, null);
                }
                hc.a0(bkVar.f38506c).K(2131624103, org.telegram.messenger.g0.X2(M0), org.telegram.messenger.hd.M0(2131743886, null), new v80(27, bkVar, f10Var)).j();
                g1Var.d(true);
                return;
            case 3:
                org.telegram.ui.tp0 tp0Var = (org.telegram.ui.tp0) callback;
                Context context2 = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (tp0Var.f55578u1) {
                    sg.q qVar = new sg.q(context2, tp0Var.f55588z1);
                    qVar.I0(tp0Var.f55576t1.f54992a, 2);
                    qVar.f55069o1 = new androidx.activity.n(tp0Var, bitmap, 6);
                    qVar.n1 = new tg.m(tp0Var, 1);
                    qVar.show();
                    return;
                }
                Runnable runnable2 = tp0Var.D1;
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
                    org.telegram.messenger.w9.c(mVar.f28612a).e(mVar.P1, new bi.v3(mVar, zArr, f6Var2, 12));
                    return;
                }
                return;
            case 6:
                zh.v vVar = (zh.v) callback;
                int i10 = vVar.f28612a;
                org.telegram.messenger.s9 s9Var = vVar.f60432e2;
                new bi.w1((Context) obj2, (org.telegram.ui.ActionBar.f6) obj, i10, s9Var.d.title, s9Var.h, false).show();
                vVar.dismiss();
                return;
            case 7:
                zh.v vVar2 = (zh.v) callback;
                boolean[] zArr2 = (boolean[]) obj2;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    org.telegram.messenger.w9.c(vVar2.f28612a).e(vVar2.Q1, new bi.v3(vVar2, zArr2, f6Var3, 13));
                    return;
                }
                return;
            default:
                zh.a2 a2Var = (zh.a2) callback;
                ((k60) obj2).u();
                up0 up0Var = a2Var.f60081a;
                zh.t1 t1Var = new zh.t1(a2Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = zh.f2.U;
                up0Var.h(null, t1Var);
                return;
        }
    }
}
