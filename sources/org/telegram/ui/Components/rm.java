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
public final class rm implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.a20, org.telegram.messenger.oi, z4, org.telegram.messenger.jc, org.telegram.messenger.lr, p4.l0, m9.q, w5.b, v5.e, h2.j {
    public final int f39176a;
    public final Object f39177b;
    public final Object f39178c;
    public final Object d;

    public rm(Object obj, Object obj2, Object obj3, int i7) {
        this.f39176a = i7;
        this.f39177b = obj;
        this.f39178c = obj2;
        this.d = obj3;
    }

    @Override
    public void O(int r14, int r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rm.O(int, int, boolean):void");
    }

    @Override
    public void a(int i7, TLObject tLObject) {
        yr yrVar = (yr) this.f39177b;
        ArrayList arrayList = (ArrayList) this.f39178c;
        ArrayList arrayList2 = (ArrayList) this.d;
        long d = org.telegram.messenger.n5.d(tLObject);
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            org.telegram.messenger.mp.u1(yrVar.f30187a).h0(-yrVar.U1.f28403id, ((Integer) arrayList.get(i11)).intValue(), d);
        }
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj = arrayList2.get(i10);
            i10++;
            org.telegram.messenger.mp.u1(yrVar.f30187a).h0(yrVar.Y1, ((Integer) obj).intValue(), d);
        }
    }

    @Override
    public void accept(Object obj) {
        ((x2.k0) obj).C(((a8.xa) this.f39177b).f713b, (x2.g0) this.f39178c, (x2.c0) this.d);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rm.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public void d(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f39177b;
        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f39178c;
        org.telegram.ui.Components.voip.b2.l(chat, null, true, null, h2Var.getParentActivity(), h2Var, (org.telegram.messenger.c) this.d);
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        switch (this.f39176a) {
            case 2:
                Runnable runnable = (Runnable) this.d;
                qx qxVar = ((px) this.f39177b).f38591a;
                if (((String) this.f39178c).equals(qxVar.f38931w)) {
                    qxVar.f38932x = str;
                    qxVar.f38928n.addAll(arrayList);
                    runnable.run();
                    return;
                }
                return;
            default:
                ly lyVar = (ly) this.f39177b;
                HashMap hashMap = (HashMap) this.f39178c;
                Runnable runnable2 = (Runnable) this.d;
                HashMap hashMap2 = lyVar.f37263f;
                if (lyVar.f37268x.N == lyVar.f37260b) {
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        String str2 = ((org.telegram.messenger.ni) arrayList.get(i7)).f25927a;
                        ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
                        if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                            hashMap2.put(arrayList2, str2);
                            lyVar.h.add(arrayList2);
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
        Bundle bundle = (Bundle) this.f39178c;
        ResultReceiver resultReceiver = (ResultReceiver) this.d;
        p4.d0 d0Var = ((p4.m0) this.f39177b).h;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        m9.w n10 = d0Var.n(vVar);
        if (resultReceiver != null) {
            n10.b(new org.telegram.ui.Wallet.c5(29, n10, resultReceiver), m9.r.f20952a);
        }
    }

    @Override
    public Object g() {
        t5.a aVar = (t5.a) this.f39177b;
        o5.i iVar = (o5.i) this.f39178c;
        o5.h hVar = (o5.h) this.d;
        v5.g gVar = (v5.g) aVar.d;
        gVar.getClass();
        l5.d dVar = iVar.f21713c;
        String str = hVar.f21703a;
        String str2 = iVar.f21711a;
        String c10 = c8.gc.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            StringBuilder sb2 = new StringBuilder("Storing event with priority=");
            sb2.append(dVar);
            sb2.append(", name=");
            sb2.append(str);
            sb2.append(" for destination ");
            p5.c.t(sb2, str2, c10);
        }
        ((Long) gVar.c(new rm(gVar, hVar, iVar, 14))).getClass();
        aVar.f57616a.H(iVar, 1, false);
        return null;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.f39176a;
        Object obj = this.d;
        Object obj2 = this.f39178c;
        Object obj3 = this.f39177b;
        switch (i10) {
            case 0:
                rn rnVar = (rn) obj3;
                View view = (View) obj2;
                rnVar.getClass();
                view.setTag(null);
                rnVar.c0(view, (org.telegram.ui.Cells.b6) obj, false);
                return;
            case 5:
                gt0 gt0Var = (gt0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                ((fi.z5) obj2).F(arrayList);
                lc.b0(gt0Var.f35642y1).Q(2131624052, 36, org.telegram.messenger.gd.G(arrayList.size(), "BotPreviewsDeleted", new Object[0])).j();
                gt0Var.V(false);
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
                ug.l0 l0Var = (ug.l0) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                l0Var.dismiss();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                    org.telegram.messenger.mp.u1(l0Var.f30187a).X3(chat, false);
                    org.telegram.messenger.mp.u1(l0Var.f30187a).f0(chat.f28403id, user);
                }
                return;
        }
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        int i7;
        j01 j01Var = (j01) this.f39177b;
        kp kpVar = (kp) this.f39178c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        org.telegram.messenger.hc p10 = imageReceiver.p();
        if (z10 && p10 != null && (bitmap = p10.f24423c) != null) {
            Drawable drawable = kpVar.f36838b;
            if (drawable instanceof bb0) {
                bb0 bb0Var = (bb0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i7 = -100;
                } else {
                    i7 = 100;
                }
                bb0Var.s(i7, j01.e(bitmap));
                bb0Var.t(j01Var.M);
                j01Var.invalidate();
            }
        }
    }

    public rm(p4.m0 m0Var, p4.k1 k1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.f39176a = 9;
        this.f39177b = m0Var;
        this.f39178c = bundle;
        this.d = resultReceiver;
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }

    @Override
    public m9.y apply(Object obj) {
        int i7 = this.f39176a;
        Object obj2 = this.d;
        Object obj3 = this.f39178c;
        Object obj4 = this.f39177b;
        switch (i7) {
            case 10:
                p4.d0 d0Var = (p4.d0) obj4;
                Handler handler = d0Var.f55187l;
                org.telegram.ui.Wallet.c5 c5Var = new org.telegram.ui.Wallet.c5(d0Var, (p4.v) obj3, new sv0(d0Var, (p4.r0) obj2, (p4.w) obj, 20));
                p4.o1 o1Var = new p4.o1(0);
                String str = h2.l0.f13783a;
                ?? obj5 = new Object();
                h2.l0.W(handler, new di.ga(obj5, c5Var, o1Var, 10));
                return obj5;
            default:
                p4.d0 d0Var2 = (p4.d0) obj4;
                p4.v vVar = (p4.v) obj3;
                List list = (List) obj;
                Handler handler2 = d0Var2.f55187l;
                org.telegram.ui.Wallet.c5 c5Var2 = new org.telegram.ui.Wallet.c5(d0Var2, vVar, new p4.s0(d0Var2, (Object) ((p4.b1) obj2), (Object) vVar, (Object) list, 2));
                p4.o1 o1Var2 = new p4.o1(0);
                String str2 = h2.l0.f13783a;
                ?? obj6 = new Object();
                h2.l0.W(handler2, new di.ga(obj6, c5Var2, o1Var2, 10));
                return obj6;
        }
    }
}
