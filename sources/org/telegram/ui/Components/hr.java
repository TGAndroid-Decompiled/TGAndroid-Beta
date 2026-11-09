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
public final class hr implements org.telegram.messenger.f20, org.telegram.messenger.ri, t4, org.telegram.ui.ActionBar.r1, org.telegram.messenger.lc, org.telegram.messenger.qr, p4.l0, m9.q, w5.b, v5.e, h2.j {
    public final int f34367a;
    public final Object f34368b;
    public final Object f34369c;
    public final Object d;

    public hr(Object obj, Object obj2, Object obj3, int i7) {
        this.f34367a = i7;
        this.f34368b = obj;
        this.f34369c = obj2;
        this.d = obj3;
    }

    @Override
    public void L(int r14, int r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hr.L(int, int, boolean):void");
    }

    @Override
    public void a(int i7, TLObject tLObject) {
        lr lrVar = (lr) this.f34368b;
        ArrayList arrayList = (ArrayList) this.f34369c;
        ArrayList arrayList2 = (ArrayList) this.d;
        long d = org.telegram.messenger.m5.d(tLObject);
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            org.telegram.messenger.qp.s1(lrVar.f28621a).h0(-lrVar.Q1.f26956id, ((Integer) arrayList.get(i11)).intValue(), d);
        }
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj = arrayList2.get(i10);
            i10++;
            org.telegram.messenger.qp.s1(lrVar.f28621a).h0(lrVar.U1, ((Integer) obj).intValue(), d);
        }
    }

    @Override
    public void accept(Object obj) {
        ((x2.k0) obj).E(((a8.wa) this.f34368b).f700b, (x2.g0) this.f34369c, (x2.c0) this.d);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hr.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        switch (this.f34367a) {
            case 1:
                Runnable runnable = (Runnable) this.d;
                hx hxVar = ((gx) this.f34368b).f34069a;
                if (((String) this.f34369c).equals(hxVar.f34400w)) {
                    hxVar.f34401x = str;
                    hxVar.f34397n.addAll(arrayList);
                    runnable.run();
                    return;
                }
                return;
            default:
                ay ayVar = (ay) this.f34368b;
                HashMap hashMap = (HashMap) this.f34369c;
                Runnable runnable2 = (Runnable) this.d;
                HashMap hashMap2 = ayVar.f32012f;
                if (ayVar.f32017x.M == ayVar.f32009b) {
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        String str2 = ((org.telegram.messenger.qi) arrayList.get(i7)).f24701a;
                        ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
                        if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                            hashMap2.put(arrayList2, str2);
                            ayVar.h.add(arrayList2);
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
        Bundle bundle = (Bundle) this.f34369c;
        ResultReceiver resultReceiver = (ResultReceiver) this.d;
        p4.d0 d0Var = ((p4.m0) this.f34368b).h;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        m9.w n10 = d0Var.n(vVar);
        if (resultReceiver != null) {
            n10.b(new org.telegram.ui.web.s(12, n10, resultReceiver), m9.r.f19994a);
        }
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        Bitmap bitmap;
        int i7;
        a01 a01Var = (a01) this.f34368b;
        uo uoVar = (uo) this.f34369c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        org.telegram.messenger.jc p10 = imageReceiver.p();
        if (z9 && p10 != null && (bitmap = p10.f23535c) != null) {
            Drawable drawable = uoVar.f38761b;
            if (drawable instanceof ra0) {
                ra0 ra0Var = (ra0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i7 = -100;
                } else {
                    i7 = 100;
                }
                ra0Var.s(i7, a01.e(bitmap));
                ra0Var.t(a01Var.L);
                a01Var.invalidate();
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.f34367a;
        Object obj = this.d;
        Object obj2 = this.f34369c;
        Object obj3 = this.f34368b;
        switch (i10) {
            case 4:
                zs0 zs0Var = (zs0) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ((di.k6) obj).F(arrayList);
                hc.a0(zs0Var.f41127x1).Q(2131624051, 36, org.telegram.messenger.id.G(arrayList.size(), "BotPreviewsDeleted", new Object[0])).j();
                zs0Var.V(false);
                return;
            case 7:
                boolean[] zArr = (boolean[]) obj3;
                JsPromptResult jsPromptResult = (JsPromptResult) obj2;
                zs zsVar = (zs) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(zsVar.getText().toString());
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
                    org.telegram.messenger.qp.s1(i0Var.f28621a).Q3(chat, false);
                    org.telegram.messenger.qp.s1(i0Var.f28621a).f0(chat.f26956id, user);
                }
                return;
        }
    }

    @Override
    public Object h() {
        t5.a aVar = (t5.a) this.f34368b;
        o5.i iVar = (o5.i) this.f34369c;
        o5.h hVar = (o5.h) this.d;
        v5.g gVar = (v5.g) aVar.d;
        gVar.getClass();
        l5.d dVar = iVar.f20828c;
        String str = hVar.f20818a;
        String str2 = iVar.f20826a;
        String c10 = c8.cc.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            StringBuilder sb2 = new StringBuilder("Storing event with priority=");
            sb2.append(dVar);
            sb2.append(", name=");
            sb2.append(str);
            sb2.append(" for destination ");
            rf.b.p(sb2, str2, c10);
        }
        ((Long) gVar.c(new hr(gVar, hVar, iVar, 13))).getClass();
        aVar.f55458a.J(iVar, 1, false);
        return null;
    }

    @Override
    public void k(boolean z9) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f34368b;
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f34369c;
        org.telegram.ui.Components.voip.y1.l(chat, null, true, null, f2Var.getParentActivity(), f2Var, (org.telegram.messenger.c) this.d);
    }

    public hr(zs0 zs0Var, di.k6 k6Var, ArrayList arrayList) {
        this.f34367a = 4;
        this.f34368b = zs0Var;
        this.d = k6Var;
        this.f34369c = arrayList;
    }

    public hr(p4.m0 m0Var, p4.i1 i1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.f34367a = 8;
        this.f34368b = m0Var;
        this.f34369c = bundle;
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
        int i7 = this.f34367a;
        Object obj2 = this.d;
        Object obj3 = this.f34369c;
        Object obj4 = this.f34368b;
        switch (i7) {
            case 9:
                p4.d0 d0Var = (p4.d0) obj4;
                Handler handler = d0Var.f53222l;
                org.telegram.ui.web.s sVar = new org.telegram.ui.web.s(d0Var, (p4.v) obj3, new s31(d0Var, (p4.r0) obj2, (p4.w) obj, 14));
                p4.m1 m1Var = new p4.m1(0);
                String str = h2.m0.f14112a;
                ?? obj5 = new Object();
                h2.m0.W(handler, new fi.x1(obj5, sVar, m1Var, 10));
                return obj5;
            default:
                p4.d0 d0Var2 = (p4.d0) obj4;
                p4.v vVar = (p4.v) obj3;
                List list = (List) obj;
                Handler handler2 = d0Var2.f53222l;
                org.telegram.ui.web.s sVar2 = new org.telegram.ui.web.s(d0Var2, vVar, new org.telegram.ui.lo0(d0Var2, (p4.z0) obj2, vVar, list, 25));
                p4.m1 m1Var2 = new p4.m1(0);
                String str2 = h2.m0.f14112a;
                ?? obj6 = new Object();
                h2.m0.W(handler2, new fi.x1(obj6, sVar2, m1Var2, 10));
                return obj6;
        }
    }
}
