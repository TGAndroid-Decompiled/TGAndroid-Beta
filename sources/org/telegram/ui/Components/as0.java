package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.SpannableString;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
public final class as0 implements Runnable {
    public final int f33546a;
    public final Object f33547b;
    public final Object f33548c;
    public final Object d;

    public as0(Object obj, Serializable serializable, ArrayList arrayList, int i7) {
        this.f33546a = i7;
        this.f33548c = obj;
        this.d = serializable;
        this.f33547b = arrayList;
    }

    private final void a() {
        boolean z10;
        Object obj;
        org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.f33548c;
        org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.f33547b;
        Bitmap bitmap = (Bitmap) this.d;
        w1Var.getClass();
        if (org.telegram.ui.web.w1.f53622f != null) {
            int i7 = 0;
            if ((v1Var.d <= 0 || v1Var.f53614e <= 0) && bitmap != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bitmap != null) {
                w1Var.d.put(v1Var.f53612b, bitmap);
                if (z10) {
                    int i10 = v1Var.d;
                    if (i10 == 0 && v1Var.f53614e == 0) {
                        v1Var.d = bitmap.getWidth();
                        v1Var.f53614e = bitmap.getHeight();
                    } else if (i10 == 0) {
                        v1Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * v1Var.f53614e);
                    } else if (v1Var.f53614e == 0) {
                        v1Var.f53614e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * v1Var.d);
                    }
                }
            }
            ArrayList arrayList = (ArrayList) org.telegram.ui.web.w1.f53622f.remove(v1Var.f53612b);
            if (arrayList != null) {
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj2 = arrayList.get(i7);
                    i7++;
                    Pair pair = (Pair) obj2;
                    ((ImageReceiver) pair.first).w0(bitmap);
                    if (z10 && (obj = pair.second) != null) {
                        ((Runnable) obj).run();
                    }
                }
            }
        }
    }

    private final void b() {
        p4.a0 a0Var = (p4.a0) this.f33548c;
        p4.v vVar = (p4.v) this.f33547b;
        KeyEvent keyEvent = (KeyEvent) this.d;
        p4.d0 d0Var = a0Var.f55276b;
        if (d0Var.i(vVar)) {
            d0Var.b(keyEvent, false, false);
        } else {
            p4.n0 n0Var = d0Var.h;
            q4.r rVar = vVar.f55567a;
            rVar.getClass();
            n0Var.getClass();
            n0Var.i0(1, new p4.g0(n0Var, 9), rVar, true);
        }
        a0Var.f55275a = null;
    }

    private final void c() {
        pi.k kVar = (pi.k) this.f33548c;
        ArrayList arrayList = (ArrayList) this.f33547b;
        ArrayList arrayList2 = (ArrayList) this.d;
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
        pi.k kVar = (pi.k) this.f33548c;
        View view = (View) this.f33547b;
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
        q2.j jVar = (q2.j) this.f33548c;
        int i7 = jVar.f55882a;
        x2.g0 g0Var = jVar.f55883b;
        this.f33547b.l(i7, g0Var, (nb.a) this.d);
    }

    private final void g() {
        SpannableString spannableString = (SpannableString) this.f33548c;
        qi.j.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) ((j6.k) this.f33547b).f17343b);
        ((n2.c0) this.d).run();
    }

    private final void h() {
        SpannableString spannableString = (SpannableString) this.f33548c;
        qi.j.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) ((j6.k) this.f33547b).f17343b);
        ((di.p9) this.d).a(spannableString);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.as0.run():void");
    }

    public as0(Object obj, Object obj2, Object obj3, int i7) {
        this.f33546a = i7;
        this.f33548c = obj;
        this.f33547b = obj2;
        this.d = obj3;
    }
}
