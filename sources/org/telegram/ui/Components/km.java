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
public final class km implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.c20, org.telegram.messenger.pi, r4, org.telegram.messenger.kc, org.telegram.messenger.nr, p4.l0, m9.q, w5.b, v5.e, h2.j {
    public final int f36551a;
    public final Object f36552b;
    public final Object f36553c;
    public final Object d;

    public km(Object obj, Object obj2, Object obj3, int i7) {
        this.f36551a = i7;
        this.f36552b = obj;
        this.f36553c = obj2;
        this.d = obj3;
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        int i7;
        b01 b01Var = (b01) this.f36552b;
        dp dpVar = (dp) this.f36553c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        org.telegram.messenger.ic p10 = imageReceiver.p();
        if (z10 && p10 != null && (bitmap = p10.f24374c) != null) {
            Drawable drawable = dpVar.f34010b;
            if (drawable instanceof ra0) {
                ra0 ra0Var = (ra0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i7 = -100;
                } else {
                    i7 = 100;
                }
                ra0Var.s(i7, b01.e(bitmap));
                ra0Var.t(b01Var.M);
                b01Var.invalidate();
            }
        }
    }

    @Override
    public void L(int r14, int r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.km.L(int, int, boolean):void");
    }

    @Override
    public void a(int i7, TLObject tLObject) {
        rr rrVar = (rr) this.f36552b;
        ArrayList arrayList = (ArrayList) this.f36553c;
        ArrayList arrayList2 = (ArrayList) this.d;
        long d = org.telegram.messenger.m5.d(tLObject);
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            org.telegram.messenger.np.s1(rrVar.f29679a).h0(-rrVar.U1.f28051id, ((Integer) arrayList.get(i11)).intValue(), d);
        }
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj = arrayList2.get(i10);
            i10++;
            org.telegram.messenger.np.s1(rrVar.f29679a).h0(rrVar.Y1, ((Integer) obj).intValue(), d);
        }
    }

    @Override
    public void accept(Object obj) {
        ((x2.j0) obj).C(((a8.xa) this.f36552b).f713b, (x2.f0) this.f36553c, (x2.b0) this.d);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.km.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        switch (this.f36551a) {
            case 2:
                Runnable runnable = (Runnable) this.d;
                lx lxVar = ((kx) this.f36552b).f36635a;
                if (((String) this.f36553c).equals(lxVar.f36924w)) {
                    lxVar.f36925x = str;
                    lxVar.f36921n.addAll(arrayList);
                    runnable.run();
                    return;
                }
                return;
            default:
                fy fyVar = (fy) this.f36552b;
                HashMap hashMap = (HashMap) this.f36553c;
                Runnable runnable2 = (Runnable) this.d;
                HashMap hashMap2 = fyVar.f34743f;
                if (fyVar.f34748x.N == fyVar.f34740b) {
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        String str2 = ((org.telegram.messenger.oi) arrayList.get(i7)).f25765a;
                        ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
                        if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                            hashMap2.put(arrayList2, str2);
                            fyVar.h.add(arrayList2);
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
        Bundle bundle = (Bundle) this.f36553c;
        ResultReceiver resultReceiver = (ResultReceiver) this.d;
        p4.d0 d0Var = ((p4.m0) this.f36552b).h;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        m9.w n10 = d0Var.n(vVar);
        if (resultReceiver != null) {
            n10.b(new org.telegram.ui.web.e1(7, n10, resultReceiver), m9.r.f20591a);
        }
    }

    @Override
    public Object g() {
        t5.b bVar = (t5.b) this.f36552b;
        o5.i iVar = (o5.i) this.f36553c;
        o5.h hVar = (o5.h) this.d;
        v5.g gVar = (v5.g) bVar.d;
        gVar.getClass();
        l5.d dVar = iVar.f21349c;
        String str = hVar.f21339a;
        String str2 = iVar.f21347a;
        String c10 = c8.dc.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            StringBuilder sb2 = new StringBuilder("Storing event with priority=");
            sb2.append(dVar);
            sb2.append(", name=");
            sb2.append(str);
            sb2.append(" for destination ");
            r.b.t(sb2, str2, c10);
        }
        ((Long) gVar.c(new km(gVar, hVar, iVar, 14))).getClass();
        bVar.f57044a.H(iVar, 1, false);
        return null;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.f36551a;
        Object obj = this.d;
        Object obj2 = this.f36553c;
        Object obj3 = this.f36552b;
        switch (i10) {
            case 0:
                jn jnVar = (jn) obj3;
                View view = (View) obj2;
                jnVar.getClass();
                view.setTag(null);
                jnVar.c0(view, (org.telegram.ui.Cells.z5) obj, false);
                return;
            case 5:
                ys0 ys0Var = (ys0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                ((fi.c6) obj2).F(arrayList);
                cc.a0(ys0Var.f42152y1).Q(2131624052, 36, org.telegram.messenger.hd.G(arrayList.size(), "BotPreviewsDeleted", new Object[0])).j();
                ys0Var.V(false);
                return;
            case 8:
                boolean[] zArr = (boolean[]) obj3;
                JsPromptResult jsPromptResult = (JsPromptResult) obj2;
                ft ftVar = (ft) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(ftVar.getText().toString());
                    return;
                }
                return;
            default:
                ug.j0 j0Var = (ug.j0) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                j0Var.dismiss();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                    org.telegram.messenger.np.s1(j0Var.f29679a).Q3(chat, false);
                    org.telegram.messenger.np.s1(j0Var.f29679a).f0(chat.f28051id, user);
                }
                return;
        }
    }

    @Override
    public void j(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f36552b;
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f36553c;
        org.telegram.ui.Components.voip.c2.l(chat, null, true, null, e2Var.getParentActivity(), e2Var, (org.telegram.messenger.c) this.d);
    }

    public km(p4.m0 m0Var, p4.i1 i1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.f36551a = 9;
        this.f36552b = m0Var;
        this.f36553c = bundle;
        this.d = resultReceiver;
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
    }

    @Override
    public void O(int i7, Drawable drawable) {
    }

    @Override
    public m9.y apply(Object obj) {
        int i7 = this.f36551a;
        Object obj2 = this.d;
        Object obj3 = this.f36553c;
        Object obj4 = this.f36552b;
        switch (i7) {
            case 10:
                p4.d0 d0Var = (p4.d0) obj4;
                Handler handler = d0Var.f54627l;
                org.telegram.ui.web.e1 e1Var = new org.telegram.ui.web.e1(d0Var, (p4.v) obj3, new lv0(d0Var, (p4.q0) obj2, (p4.w) obj, 16));
                p4.m1 m1Var = new p4.m1(0);
                String str = h2.l0.f13471a;
                ?? obj5 = new Object();
                h2.l0.W(handler, new fi.s5((Object) obj5, e1Var, m1Var, 6));
                return obj5;
            default:
                p4.d0 d0Var2 = (p4.d0) obj4;
                p4.v vVar = (p4.v) obj3;
                List list = (List) obj;
                Handler handler2 = d0Var2.f54627l;
                org.telegram.ui.web.e1 e1Var2 = new org.telegram.ui.web.e1(d0Var2, vVar, new org.telegram.ui.ok0(d0Var2, (p4.z0) obj2, vVar, list, 29));
                p4.m1 m1Var2 = new p4.m1(0);
                String str2 = h2.l0.f13471a;
                ?? obj6 = new Object();
                h2.l0.W(handler2, new fi.s5((Object) obj6, e1Var2, m1Var2, 6));
                return obj6;
        }
    }
}
