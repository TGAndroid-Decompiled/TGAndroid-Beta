package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import android.webkit.JsPromptResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gr implements org.telegram.messenger.f20, org.telegram.messenger.ri, s4, org.telegram.ui.ActionBar.r1, org.telegram.messenger.lc, org.telegram.messenger.qr, p4.l0, m9.q, w5.b, v5.e, h2.j {
    public final int f33968a;
    public final Object f33969b;
    public final Object f33970c;
    public final Object d;

    public gr(Object obj, Object obj2, Object obj3, int i7) {
        this.f33968a = i7;
        this.f33969b = obj;
        this.f33970c = obj2;
        this.d = obj3;
    }

    @Override
    public void L(int r14, int r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gr.L(int, int, boolean):void");
    }

    @Override
    public void a(int i7, TLObject tLObject) {
        kr krVar = (kr) this.f33969b;
        ArrayList arrayList = (ArrayList) this.f33970c;
        ArrayList arrayList2 = (ArrayList) this.d;
        long d = org.telegram.messenger.m5.d(tLObject);
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            org.telegram.messenger.qp.s1(krVar.f28669a).h0(-krVar.T1.f26960id, ((Integer) arrayList.get(i11)).intValue(), d);
        }
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj = arrayList2.get(i10);
            i10++;
            org.telegram.messenger.qp.s1(krVar.f28669a).h0(krVar.X1, ((Integer) obj).intValue(), d);
        }
    }

    @Override
    public void accept(Object obj) {
        ((x2.j0) obj).E(((a8.wa) this.f33969b).f700b, (x2.f0) this.f33970c, (x2.b0) this.d);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gr.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        switch (this.f33968a) {
            case 1:
                Runnable runnable = (Runnable) this.d;
                gx gxVar = ((fx) this.f33969b).f33663a;
                if (((String) this.f33970c).equals(gxVar.f34001w)) {
                    gxVar.f34002x = str;
                    gxVar.f33998n.addAll(arrayList);
                    runnable.run();
                    return;
                }
                return;
            default:
                zx zxVar = (zx) this.f33969b;
                HashMap hashMap = (HashMap) this.f33970c;
                Runnable runnable2 = (Runnable) this.d;
                HashMap hashMap2 = zxVar.f41149f;
                if (zxVar.f41154x.M == zxVar.f41146b) {
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        String str2 = ((org.telegram.messenger.qi) arrayList.get(i7)).f24705a;
                        ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
                        if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                            hashMap2.put(arrayList2, str2);
                            zxVar.h.add(arrayList2);
                        }
                    }
                    runnable2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void f(p4.v vVar) {
        Bundle bundle = (Bundle) this.f33970c;
        ResultReceiver resultReceiver = (ResultReceiver) this.d;
        p4.d0 d0Var = ((p4.m0) this.f33969b).h;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        m9.w n10 = d0Var.n(vVar);
        if (resultReceiver != null) {
            n10.b(new org.telegram.ui.web.s(12, n10, resultReceiver), m9.r.f19999a);
        }
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        Bitmap bitmap;
        int i7;
        zz0 zz0Var = (zz0) this.f33969b;
        uo uoVar = (uo) this.f33970c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        org.telegram.messenger.jc p10 = imageReceiver.p();
        if (z9 && p10 != null && (bitmap = p10.f23539c) != null) {
            Drawable drawable = uoVar.f38726b;
            if (drawable instanceof qa0) {
                qa0 qa0Var = (qa0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i7 = -100;
                } else {
                    i7 = 100;
                }
                qa0Var.s(i7, zz0.e(bitmap));
                qa0Var.t(zz0Var.L);
                zz0Var.invalidate();
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.f33968a;
        Object obj = this.d;
        Object obj2 = this.f33970c;
        Object obj3 = this.f33969b;
        switch (i10) {
            case 4:
                ys0 ys0Var = (ys0) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ((di.k6) obj).F(arrayList);
                gc.a0(ys0Var.f40719x1).Q(2131624051, 36, org.telegram.messenger.id.G(arrayList.size(), "BotPreviewsDeleted", new Object[0])).j();
                ys0Var.V(false);
                return;
            case 7:
                boolean[] zArr = (boolean[]) obj3;
                JsPromptResult jsPromptResult = (JsPromptResult) obj2;
                ys ysVar = (ys) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(ysVar.getText().toString());
                    return;
                }
                return;
            default:
                ug.i0 i0Var = (ug.i0) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                i0Var.dismiss();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                    org.telegram.messenger.qp.s1(i0Var.f28669a).Q3(chat, false);
                    org.telegram.messenger.qp.s1(i0Var.f28669a).f0(chat.f26960id, user);
                }
                return;
        }
    }

    @Override
    public Object h() {
        t5.a aVar = (t5.a) this.f33969b;
        o5.i iVar = (o5.i) this.f33970c;
        o5.h hVar = (o5.h) this.d;
        v5.g gVar = (v5.g) aVar.d;
        gVar.getClass();
        l5.d dVar = iVar.f20833c;
        String str = hVar.f20823a;
        String str2 = iVar.f20831a;
        String c10 = c8.cc.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            StringBuilder sb2 = new StringBuilder("Storing event with priority=");
            sb2.append(dVar);
            sb2.append(", name=");
            sb2.append(str);
            sb2.append(" for destination ");
            rf.b.p(sb2, str2, c10);
        }
        ((Long) gVar.c(new gr(gVar, hVar, iVar, 13))).getClass();
        aVar.f55457a.J(iVar, 1, false);
        return null;
    }

    @Override
    public void k(boolean z9) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f33969b;
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f33970c;
        org.telegram.ui.Components.voip.y1.l(chat, null, true, null, f2Var.getParentActivity(), f2Var, (org.telegram.messenger.c) this.d);
    }

    public gr(ys0 ys0Var, di.k6 k6Var, ArrayList arrayList) {
        this.f33968a = 4;
        this.f33969b = ys0Var;
        this.d = k6Var;
        this.f33970c = arrayList;
    }

    public gr(p4.m0 m0Var, p4.i1 i1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.f33968a = 8;
        this.f33969b = m0Var;
        this.f33970c = bundle;
        this.d = resultReceiver;
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
    }

    @Override
    public void t0(int i7, Drawable drawable) {
    }

    @Override
    public m9.y apply(Object obj) {
        int i7 = this.f33968a;
        Object obj2 = this.d;
        Object obj3 = this.f33970c;
        Object obj4 = this.f33969b;
        switch (i7) {
            case 9:
                p4.d0 d0Var = (p4.d0) obj4;
                Handler handler = d0Var.f53221l;
                org.telegram.ui.web.s sVar = new org.telegram.ui.web.s(d0Var, (p4.v) obj3, new r31(d0Var, (p4.r0) obj2, (p4.w) obj, 14));
                p4.m1 m1Var = new p4.m1(0);
                String str = h2.m0.f14114a;
                ?? obj5 = new Object();
                h2.m0.W(handler, new fi.x1(obj5, sVar, m1Var, 10));
                return obj5;
            default:
                p4.d0 d0Var2 = (p4.d0) obj4;
                p4.v vVar = (p4.v) obj3;
                List list = (List) obj;
                Handler handler2 = d0Var2.f53221l;
                org.telegram.ui.web.s sVar2 = new org.telegram.ui.web.s(d0Var2, vVar, new org.telegram.ui.mo0(d0Var2, (p4.z0) obj2, vVar, list, 25));
                p4.m1 m1Var2 = new p4.m1(0);
                String str2 = h2.m0.f14114a;
                ?? obj6 = new Object();
                h2.m0.W(handler2, new fi.x1(obj6, sVar2, m1Var2, 10));
                return obj6;
        }
    }
}
