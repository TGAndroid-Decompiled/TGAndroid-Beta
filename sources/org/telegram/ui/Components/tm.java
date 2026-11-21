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
public final class tm implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.a20, org.telegram.messenger.oi, a5, org.telegram.messenger.jc, org.telegram.messenger.lr, p4.m0, m9.q, w5.b, v5.e, h2.j {
    public final int f39950a;
    public final Object f39951b;
    public final Object f39952c;
    public final Object d;

    public tm(Object obj, Object obj2, Object obj3, int i7) {
        this.f39950a = i7;
        this.f39951b = obj;
        this.f39952c = obj2;
        this.d = obj3;
    }

    @Override
    public void O(int r14, int r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tm.O(int, int, boolean):void");
    }

    @Override
    public void a(int i7, TLObject tLObject) {
        as asVar = (as) this.f39951b;
        ArrayList arrayList = (ArrayList) this.f39952c;
        ArrayList arrayList2 = (ArrayList) this.d;
        long d = org.telegram.messenger.n5.d(tLObject);
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            org.telegram.messenger.mp.u1(asVar.f30170a).h0(-asVar.U1.f28431id, ((Integer) arrayList.get(i11)).intValue(), d);
        }
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj = arrayList2.get(i10);
            i10++;
            org.telegram.messenger.mp.u1(asVar.f30170a).h0(asVar.Y1, ((Integer) obj).intValue(), d);
        }
    }

    @Override
    public void accept(Object obj) {
        ((x2.k0) obj).C(((a8.xa) this.f39951b).f713b, (x2.g0) this.f39952c, (x2.c0) this.d);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tm.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public void d(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f39951b;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f39952c;
        org.telegram.ui.Components.voip.b2.l(chat, null, true, null, g2Var.getParentActivity(), g2Var, (org.telegram.messenger.c) this.d);
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        switch (this.f39950a) {
            case 2:
                Runnable runnable = (Runnable) this.d;
                sx sxVar = ((rx) this.f39951b).f39358a;
                if (((String) this.f39952c).equals(sxVar.f39723w)) {
                    sxVar.f39724x = str;
                    sxVar.f39720n.addAll(arrayList);
                    runnable.run();
                    return;
                }
                return;
            default:
                ny nyVar = (ny) this.f39951b;
                HashMap hashMap = (HashMap) this.f39952c;
                Runnable runnable2 = (Runnable) this.d;
                HashMap hashMap2 = nyVar.f38006f;
                if (nyVar.f38011x.N == nyVar.f38003b) {
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        String str2 = ((org.telegram.messenger.ni) arrayList.get(i7)).f25955a;
                        ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
                        if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                            hashMap2.put(arrayList2, str2);
                            nyVar.h.add(arrayList2);
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
        Bundle bundle = (Bundle) this.f39952c;
        ResultReceiver resultReceiver = (ResultReceiver) this.d;
        p4.e0 e0Var = ((p4.n0) this.f39951b).h;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        m9.w n10 = e0Var.n(vVar);
        if (resultReceiver != null) {
            n10.b(new p4.z(1, n10, resultReceiver), m9.r.f20980a);
        }
    }

    @Override
    public Object g() {
        t5.a aVar = (t5.a) this.f39951b;
        o5.i iVar = (o5.i) this.f39952c;
        o5.h hVar = (o5.h) this.d;
        v5.g gVar = (v5.g) aVar.d;
        gVar.getClass();
        l5.d dVar = iVar.f21738c;
        String str = hVar.f21728a;
        String str2 = iVar.f21736a;
        String c10 = c8.gc.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            StringBuilder sb2 = new StringBuilder("Storing event with priority=");
            sb2.append(dVar);
            sb2.append(", name=");
            sb2.append(str);
            sb2.append(" for destination ");
            p5.c.t(sb2, str2, c10);
        }
        ((Long) gVar.c(new tm(gVar, hVar, iVar, 14))).getClass();
        aVar.f57655a.H(iVar, 1, false);
        return null;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.f39950a;
        Object obj = this.d;
        Object obj2 = this.f39952c;
        Object obj3 = this.f39951b;
        switch (i10) {
            case 0:
                tn tnVar = (tn) obj3;
                View view = (View) obj2;
                tnVar.getClass();
                view.setTag(null);
                tnVar.c0(view, (org.telegram.ui.Cells.b6) obj, false);
                return;
            case 5:
                jt0 jt0Var = (jt0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                ((fi.a6) obj2).F(arrayList);
                lc.b0(jt0Var.f36689y1).Q(2131624052, 36, org.telegram.messenger.gd.G(arrayList.size(), "BotPreviewsDeleted", new Object[0])).j();
                jt0Var.V(false);
                return;
            case 8:
                boolean[] zArr = (boolean[]) obj3;
                JsPromptResult jsPromptResult = (JsPromptResult) obj2;
                ot otVar = (ot) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(otVar.getText().toString());
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
                    org.telegram.messenger.mp.u1(k0Var.f30170a).X3(chat, false);
                    org.telegram.messenger.mp.u1(k0Var.f30170a).f0(chat.f28431id, user);
                }
                return;
        }
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        int i7;
        l01 l01Var = (l01) this.f39951b;
        mp mpVar = (mp) this.f39952c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        org.telegram.messenger.hc p10 = imageReceiver.p();
        if (z10 && p10 != null && (bitmap = p10.f24451c) != null) {
            Drawable drawable = mpVar.f37595b;
            if (drawable instanceof cb0) {
                cb0 cb0Var = (cb0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i7 = -100;
                } else {
                    i7 = 100;
                }
                cb0Var.s(i7, l01.e(bitmap));
                cb0Var.t(l01Var.M);
                l01Var.invalidate();
            }
        }
    }

    public tm(p4.n0 n0Var, p4.k1 k1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.f39950a = 9;
        this.f39951b = n0Var;
        this.f39952c = bundle;
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
        int i7 = this.f39950a;
        Object obj2 = this.d;
        Object obj3 = this.f39952c;
        Object obj4 = this.f39951b;
        switch (i7) {
            case 10:
                p4.e0 e0Var = (p4.e0) obj4;
                Handler handler = e0Var.f55237l;
                org.telegram.ui.Wallet.u4 u4Var = new org.telegram.ui.Wallet.u4(e0Var, (p4.v) obj3, new es0(e0Var, (p4.r0) obj2, (p4.w) obj, 21));
                p4.o1 o1Var = new p4.o1(0);
                String str = h2.l0.f13812a;
                ?? obj5 = new Object();
                h2.l0.W(handler, new di.a8(obj5, u4Var, o1Var, 11));
                return obj5;
            default:
                p4.e0 e0Var2 = (p4.e0) obj4;
                p4.v vVar = (p4.v) obj3;
                List list = (List) obj;
                Handler handler2 = e0Var2.f55237l;
                org.telegram.ui.Wallet.u4 u4Var2 = new org.telegram.ui.Wallet.u4(e0Var2, vVar, new p4.s0(e0Var2, (Object) ((p4.b1) obj2), (Object) vVar, (Object) list, 2));
                p4.o1 o1Var2 = new p4.o1(0);
                String str2 = h2.l0.f13812a;
                ?? obj6 = new Object();
                h2.l0.W(handler2, new di.a8(obj6, u4Var2, o1Var2, 11));
                return obj6;
        }
    }
}
