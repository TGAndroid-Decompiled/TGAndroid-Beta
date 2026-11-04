package org.telegram.ui.Components;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.webkit.JsPromptResult;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hr implements org.telegram.messenger.x10, org.telegram.messenger.ii, r4, org.telegram.ui.ActionBar.p1, org.telegram.messenger.ec, org.telegram.messenger.ir, v5.b, u5.e, g2.k, z2.k, SuccessContinuation {
    public final int f34485a;
    public final Object f34486b;
    public final Object f34487c;
    public final Object d;

    public hr(Object obj, Object obj2, Object obj3, int i3) {
        this.f34485a = i3;
        this.f34486b = obj;
        this.f34487c = obj2;
        this.d = obj3;
    }

    @Override
    public void L(int r14, int r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hr.L(int, int, boolean):void");
    }

    @Override
    public void a(int i3, TLObject tLObject) {
        lr lrVar = (lr) this.f34486b;
        ArrayList arrayList = (ArrayList) this.f34487c;
        ArrayList arrayList2 = (ArrayList) this.d;
        long d = org.telegram.messenger.m5.d(tLObject);
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            org.telegram.messenger.hp.s1(lrVar.f28583a).h0(-lrVar.R1.f27001id, ((Integer) arrayList.get(i11)).intValue(), d);
        }
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj = arrayList2.get(i10);
            i10++;
            org.telegram.messenger.hp.s1(lrVar.f28583a).h0(lrVar.V1, ((Integer) obj).intValue(), d);
        }
    }

    @Override
    public void accept(Object obj) {
        ((w2.k0) obj).D(((b8.kg) this.f34486b).f2722b, (w2.g0) this.f34487c, (w2.c0) this.d);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hr.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public g9.s1 c(int i3, d2.o1 o1Var, int[] iArr) {
        z2.i iVar = (z2.i) this.f34486b;
        String str = (String) this.f34487c;
        String str2 = (String) this.d;
        g9.f0 p10 = g9.i0.p();
        for (int i10 = 0; i10 < o1Var.f8252a; i10++) {
            p10.c(new z2.j(i3, o1Var, i10, iVar, iArr[i10], str, str2));
        }
        return p10.f();
    }

    @Override
    public Object d() {
        s5.a aVar = (s5.a) this.f34486b;
        n5.i iVar = (n5.i) this.f34487c;
        n5.h hVar = (n5.h) this.d;
        u5.g gVar = (u5.g) aVar.d;
        gVar.getClass();
        k5.d dVar = iVar.f20247c;
        String str = hVar.f20237a;
        String str2 = iVar.f20245a;
        String c2 = x7.m.c("SQLiteEventStore");
        if (Log.isLoggable(c2, 3)) {
            Log.d(c2, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new hr(gVar, hVar, iVar, 9))).getClass();
        aVar.f54667a.E(iVar, 1, false);
        return null;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10 = this.f34485a;
        Object obj = this.d;
        Object obj2 = this.f34487c;
        Object obj3 = this.f34486b;
        switch (i10) {
            case 4:
                ws0 ws0Var = (ws0) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ((ei.k6) obj).F(arrayList);
                fc.a0(ws0Var.f40142y1).Q(2131624051, 36, org.telegram.messenger.bd.G(arrayList.size(), "BotPreviewsDeleted", new Object[0])).j();
                ws0Var.V(false);
                return;
            case 7:
                boolean[] zArr = (boolean[]) obj3;
                JsPromptResult jsPromptResult = (JsPromptResult) obj2;
                xs xsVar = (xs) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(xsVar.getText().toString());
                    return;
                }
                return;
            default:
                vg.i0 i0Var = (vg.i0) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                i0Var.dismiss();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                    org.telegram.messenger.hp.s1(i0Var.f28583a).Q3(chat, false);
                    org.telegram.messenger.hp.s1(i0Var.f28583a).f0(chat.f27001id, user);
                }
                return;
        }
    }

    @Override
    public void h(String str, ArrayList arrayList) {
        switch (this.f34485a) {
            case 1:
                Runnable runnable = (Runnable) this.d;
                ex exVar = ((dx) this.f34486b).f33204a;
                if (((String) this.f34487c).equals(exVar.f33497w)) {
                    exVar.f33498x = str;
                    exVar.f33494n.addAll(arrayList);
                    runnable.run();
                    return;
                }
                return;
            default:
                xx xxVar = (xx) this.f34486b;
                HashMap hashMap = (HashMap) this.f34487c;
                Runnable runnable2 = (Runnable) this.d;
                HashMap hashMap2 = xxVar.f40543f;
                if (xxVar.f40548x.N == xxVar.f40540b) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        String str2 = ((org.telegram.messenger.hi) arrayList.get(i3)).f22931a;
                        ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
                        if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                            hashMap2.put(arrayList2, str2);
                            xxVar.h.add(arrayList2);
                        }
                    }
                    runnable2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        int i3;
        yz0 yz0Var = (yz0) this.f34486b;
        uo uoVar = (uo) this.f34487c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        org.telegram.messenger.cc p10 = imageReceiver.p();
        if (z10 && p10 != null && (bitmap = p10.f22007c) != null) {
            Drawable drawable = uoVar.f38833b;
            if (drawable instanceof la0) {
                la0 la0Var = (la0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i3 = -100;
                } else {
                    i3 = 100;
                }
                la0Var.s(yz0.e(bitmap), i3);
                la0Var.t(yz0Var.M);
                yz0Var.invalidate();
            }
        }
    }

    @Override
    public void o(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f34486b;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f34487c;
        org.telegram.ui.Components.voip.n1.l(chat, null, true, null, d2Var.getParentActivity(), d2Var, (org.telegram.messenger.c) this.d);
    }

    @Override
    public Task then(Object obj) {
        String d;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f34486b;
        String str = (String) this.f34487c;
        za.q qVar = (za.q) this.d;
        String str2 = (String) obj;
        he0 c2 = FirebaseMessaging.c(firebaseMessaging.f7945b);
        n9.h hVar = firebaseMessaging.f7944a;
        hVar.a();
        if ("[DEFAULT]".equals(hVar.f20297b)) {
            d = "";
        } else {
            d = hVar.d();
        }
        String a10 = firebaseMessaging.f7950i.a();
        synchronized (c2) {
            String a11 = za.q.a(System.currentTimeMillis(), str2, a10);
            if (a11 != null) {
                SharedPreferences.Editor edit = c2.f34373a.edit();
                edit.putString(d + "|T|" + str + "|*", a11);
                edit.commit();
            }
        }
        if (firebaseMessaging.d.s() || qVar == null || !str2.equals(qVar.f60314a)) {
            n9.h hVar2 = firebaseMessaging.f7944a;
            hVar2.a();
            String str3 = hVar2.f20297b;
            if ("[DEFAULT]".equals(str3)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    hVar2.a();
                    sb2.append(str3);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                boolean s6 = firebaseMessaging.d.s();
                Intent intent = new Intent();
                intent.putExtra("token", str2);
                if (s6) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new za.g(firebaseMessaging.f7945b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    public hr(ws0 ws0Var, ei.k6 k6Var, ArrayList arrayList) {
        this.f34485a = 4;
        this.f34486b = ws0Var;
        this.d = k6Var;
        this.f34487c = arrayList;
    }

    @Override
    public void D(ImageReceiver imageReceiver) {
    }

    @Override
    public void F0(int i3, Drawable drawable) {
    }
}
