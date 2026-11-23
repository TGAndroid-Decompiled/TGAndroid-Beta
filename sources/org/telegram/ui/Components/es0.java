package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.SpannableString;
import android.util.Pair;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
public final class es0 implements Runnable {
    public final int f34975a;
    public final Object f34976b;
    public final Object f34977c;
    public final Object d;

    public es0(Object obj, Object obj2, Serializable serializable, int i7) {
        this.f34975a = i7;
        this.f34977c = obj;
        this.d = obj2;
        this.f34976b = serializable;
    }

    private final void a() {
        boolean z10;
        Object obj;
        org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.f34977c;
        org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.f34976b;
        Bitmap bitmap = (Bitmap) this.d;
        v1Var.getClass();
        if (org.telegram.ui.web.v1.f53378f != null) {
            int i7 = 0;
            if ((u1Var.d <= 0 || u1Var.f53335e <= 0) && bitmap != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bitmap != null) {
                v1Var.d.put(u1Var.f53333b, bitmap);
                if (z10) {
                    int i10 = u1Var.d;
                    if (i10 == 0 && u1Var.f53335e == 0) {
                        u1Var.d = bitmap.getWidth();
                        u1Var.f53335e = bitmap.getHeight();
                    } else if (i10 == 0) {
                        u1Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * u1Var.f53335e);
                    } else if (u1Var.f53335e == 0) {
                        u1Var.f53335e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * u1Var.d);
                    }
                }
            }
            ArrayList arrayList = (ArrayList) org.telegram.ui.web.v1.f53378f.remove(u1Var.f53333b);
            if (arrayList != null) {
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj2 = arrayList.get(i7);
                    i7++;
                    Pair pair = (Pair) obj2;
                    ((ImageReceiver) pair.first).v0(bitmap);
                    if (z10 && (obj = pair.second) != null) {
                        ((Runnable) obj).run();
                    }
                }
            }
        }
    }

    private final void b() {
        p4.e0 e0Var = (p4.e0) this.f34977c;
        p4.r0 r0Var = (p4.r0) this.f34976b;
        p4.w wVar = (p4.w) this.d;
        if (!e0Var.j()) {
            p4.i1 i1Var = e0Var.f55249t;
            r0Var.getClass();
            c8.jb.b(i1Var, wVar);
        }
    }

    private final void c() {
        pi.k kVar = (pi.k) this.f34977c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.f34976b;
        kVar.getClass();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((View) arrayList.get(i7)).setVisibility(0);
        }
        if (kVar.A.removeAll(arrayList2)) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                kVar.d((v4.f1) arrayList2.get(i10));
            }
            kVar.G();
        }
        kVar.K.removeAll(arrayList);
    }

    private final void d() {
        pi.k kVar = (pi.k) this.f34977c;
        View view = (View) this.f34976b;
        v4.f1 f1Var = (v4.f1) this.d;
        kVar.getClass();
        view.setVisibility(0);
        if (kVar.A.remove(f1Var)) {
            kVar.d(f1Var);
            kVar.G();
        }
        kVar.K.remove(view);
    }

    private final void f() {
        q2.j jVar = (q2.j) this.f34977c;
        int i7 = jVar.f55804a;
        x2.g0 g0Var = jVar.f55805b;
        this.f34976b.K(i7, g0Var, (Exception) this.d);
    }

    private final void g() {
        q2.j jVar = (q2.j) this.f34977c;
        int i7 = jVar.f55804a;
        x2.g0 g0Var = jVar.f55805b;
        this.f34976b.c(i7, g0Var, (nb.a) this.d);
    }

    private final void h() {
        SpannableString spannableString = (SpannableString) this.f34977c;
        qi.j.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) ((ji.l) this.f34976b).f17979b);
        ((oi.t) this.d).run();
    }

    private final void i() {
        SpannableString spannableString = (SpannableString) this.f34977c;
        qi.j.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) ((ji.l) this.f34976b).f17979b);
        ((di.p9) this.d).a(spannableString);
    }

    private final void j() {
        ((wg.u0) this.f34977c).a(new Pair((HashMap) this.f34976b, (ArrayList) this.d));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.es0.run():void");
    }

    public es0(Object obj, Object obj2, Object obj3, int i7) {
        this.f34975a = i7;
        this.f34977c = obj;
        this.f34976b = obj2;
        this.d = obj3;
    }
}
