package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.View;
import android.webkit.JsPromptResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rm implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.z10, org.telegram.messenger.oi, z4, org.telegram.messenger.jc, org.telegram.messenger.lr, p4.m0, m9.q, w5.b, v5.e, h2.j {
    public final int f39350a;
    public final Object f39351b;
    public final Object f39352c;
    public final Object d;

    public rm(Object obj, Object obj2, Object obj3, int i7) {
        this.f39350a = i7;
        this.f39351b = obj;
        this.f39352c = obj2;
        this.d = obj3;
    }

    @Override
    public void I(int r14, int r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rm.I(int, int, boolean):void");
    }

    @Override
    public void a(int i7, TLObject tLObject) {
        xr xrVar = (xr) this.f39351b;
        ArrayList arrayList = (ArrayList) this.f39352c;
        ArrayList arrayList2 = (ArrayList) this.d;
        long d = org.telegram.messenger.n5.d(tLObject);
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            org.telegram.messenger.mp.u1(xrVar.f30223a).h0(-xrVar.U1.f28492id, ((Integer) arrayList.get(i11)).intValue(), d);
        }
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj = arrayList2.get(i10);
            i10++;
            org.telegram.messenger.mp.u1(xrVar.f30223a).h0(xrVar.Y1, ((Integer) obj).intValue(), d);
        }
    }

    @Override
    public void accept(Object obj) {
        ((x2.k0) obj).C(((a8.xa) this.f39351b).f713b, (x2.g0) this.f39352c, (x2.c0) this.d);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rm.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        switch (this.f39350a) {
            case 2:
                Runnable runnable = (Runnable) this.d;
                px pxVar = ((ox) this.f39351b).f38273a;
                if (((String) this.f39352c).equals(pxVar.f38607w)) {
                    pxVar.f38608x = str;
                    pxVar.f38604n.addAll(arrayList);
                    runnable.run();
                    return;
                }
                return;
            default:
                ky kyVar = (ky) this.f39351b;
                HashMap hashMap = (HashMap) this.f39352c;
                Runnable runnable2 = (Runnable) this.d;
                HashMap hashMap2 = kyVar.f36924f;
                if (kyVar.f36929x.N == kyVar.f36921b) {
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        String str2 = ((org.telegram.messenger.ni) arrayList.get(i7)).f26023a;
                        ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
                        if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                            hashMap2.put(arrayList2, str2);
                            kyVar.h.add(arrayList2);
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
        Bundle bundle = (Bundle) this.f39352c;
        ResultReceiver resultReceiver = (ResultReceiver) this.d;
        p4.d0 d0Var = ((p4.n0) this.f39351b).h;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        m9.w n10 = d0Var.n(vVar);
        if (resultReceiver != null) {
            n10.b(new org.telegram.ui.web.t1(5, n10, resultReceiver), m9.r.f21045a);
        }
    }

    @Override
    public Object h() {
        t5.a aVar = (t5.a) this.f39351b;
        o5.i iVar = (o5.i) this.f39352c;
        o5.h hVar = (o5.h) this.d;
        v5.g gVar = (v5.g) aVar.d;
        gVar.getClass();
        l5.d dVar = iVar.f21806c;
        String str = hVar.f21796a;
        String str2 = iVar.f21804a;
        String c10 = c8.hc.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            StringBuilder sb2 = new StringBuilder("Storing event with priority=");
            sb2.append(dVar);
            sb2.append(", name=");
            sb2.append(str);
            sb2.append(" for destination ");
            p5.c.t(sb2, str2, c10);
        }
        ((Long) gVar.c(new rm(gVar, hVar, iVar, 14))).getClass();
        aVar.f57738a.N(iVar, 1, false);
        return null;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.f39350a;
        Object obj = this.d;
        Object obj2 = this.f39352c;
        Object obj3 = this.f39351b;
        switch (i10) {
            case 0:
                qn qnVar = (qn) obj3;
                View view = (View) obj2;
                qnVar.getClass();
                view.setTag(null);
                qnVar.c0(view, (org.telegram.ui.Cells.a6) obj, false);
                return;
            case 5:
                it0 it0Var = (it0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                ((fi.a6) obj2).F(arrayList);
                kc.b0(it0Var.f36166y1).Q(2131624052, 36, org.telegram.messenger.gd.G(arrayList.size(), "BotPreviewsDeleted", new Object[0])).j();
                it0Var.V(false);
                return;
            case 8:
                boolean[] zArr = (boolean[]) obj3;
                JsPromptResult jsPromptResult = (JsPromptResult) obj2;
                mt mtVar = (mt) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(mtVar.getText().toString());
                    return;
                }
                return;
            default:
                ug.k0 k0Var = (ug.k0) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                k0Var.dismiss();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                    org.telegram.messenger.mp.u1(k0Var.f30223a).X3(chat, false);
                    org.telegram.messenger.mp.u1(k0Var.f30223a).f0(chat.f28492id, user);
                }
                return;
        }
    }

    @Override
    public void q(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f39351b;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f39352c;
        org.telegram.ui.Components.voip.c2.l(chat, null, true, null, g2Var.getParentActivity(), g2Var, (org.telegram.messenger.c) this.d);
    }

    @Override
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        int i7;
        j01 j01Var = (j01) this.f39351b;
        jp jpVar = (jp) this.f39352c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        org.telegram.messenger.hc p10 = imageReceiver.p();
        if (z10 && p10 != null && (bitmap = p10.f24522c) != null) {
            Drawable drawable = jpVar.f36473b;
            if (drawable instanceof za0) {
                za0 za0Var = (za0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i7 = -100;
                } else {
                    i7 = 100;
                }
                za0Var.s(i7, j01.e(bitmap));
                za0Var.t(j01Var.M);
                j01Var.invalidate();
            }
        }
    }

    public rm(p4.n0 n0Var, p4.j1 j1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.f39350a = 9;
        this.f39351b = n0Var;
        this.f39352c = bundle;
        this.d = resultReceiver;
    }

    @Override
    public void r(ImageReceiver imageReceiver) {
    }

    @Override
    public void J(int i7, Drawable drawable) {
    }

    @Override
    public m9.y apply(Object obj) {
        int i7 = this.f39350a;
        Object obj2 = this.d;
        Object obj3 = this.f39352c;
        Object obj4 = this.f39351b;
        switch (i7) {
            case 10:
                p4.d0 d0Var = (p4.d0) obj4;
                Handler handler = d0Var.f55316l;
                org.telegram.ui.web.t1 t1Var = new org.telegram.ui.web.t1(d0Var, (p4.v) obj3, new as0(d0Var, (p4.r0) obj2, (p4.w) obj, 22));
                p4.n1 n1Var = new p4.n1(0);
                String str = h2.l0.f13778a;
                ?? obj5 = new Object();
                h2.l0.W(handler, new di.a8(obj5, t1Var, n1Var, 11));
                return obj5;
            default:
                p4.d0 d0Var2 = (p4.d0) obj4;
                p4.v vVar = (p4.v) obj3;
                List list = (List) obj;
                Handler handler2 = d0Var2.f55316l;
                org.telegram.ui.web.t1 t1Var2 = new org.telegram.ui.web.t1(d0Var2, vVar, new p4.l0(d0Var2, (p4.a1) obj2, vVar, list, 3));
                p4.n1 n1Var2 = new p4.n1(0);
                String str2 = h2.l0.f13778a;
                ?? obj6 = new Object();
                h2.l0.W(handler2, new di.a8(obj6, t1Var2, n1Var2, 11));
                return obj6;
        }
    }
}
