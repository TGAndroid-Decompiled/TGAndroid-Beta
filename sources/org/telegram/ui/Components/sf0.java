package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class sf0 extends ep {
    public final ArrayList f38048c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context f38049e;
    public final Paint f38050f;
    public l9 f38051g;
    public final tf0 h;

    public sf0(tf0 tf0Var, Context context, org.telegram.ui.yv0 yv0Var) {
        this.h = tf0Var;
        this.f38049e = context;
        this.f38051g = yv0Var;
        Paint paint = new Paint(1);
        this.f38050f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(c5.k kVar, Object obj) {
        qf0 qf0Var = (qf0) obj;
        View view = qf0Var.f37308b;
        if (view != null) {
            kVar.removeView(view);
        }
        if (qf0Var.f37307a) {
            return;
        }
        of0 of0Var = qf0Var.f37309c;
        if (of0Var.getImageReceiver().m0 != null) {
            Drawable t6 = of0Var.getImageReceiver().t();
            if (t6 instanceof v5) {
                ((v5) t6).w(of0Var);
            }
        }
        of0Var.setRoundRadius(0);
        kVar.removeView(of0Var);
        of0Var.getImageReceiver().c();
    }

    @Override
    public final int b() {
        return this.f38048c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f38048c.indexOf((qf0) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override
    public final CharSequence d(int i7) {
        return (k(i7) + 1) + "/" + this.h.getRealCount();
    }

    @Override
    public final java.lang.Object e(c5.k r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sf0.e(c5.k, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        qf0 qf0Var = (qf0) obj;
        if (qf0Var.f37307a) {
            if (view == qf0Var.f37308b) {
                return true;
            }
            return false;
        } else if (view == qf0Var.f37309c) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final void g() {
        ArrayList arrayList;
        int size;
        int i7 = 0;
        while (true) {
            arrayList = this.d;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((l9) arrayList.get(i7)).getImageReceiver().c();
            }
            i7++;
        }
        ArrayList arrayList2 = this.f38048c;
        arrayList2.clear();
        arrayList.clear();
        tf0 tf0Var = this.h;
        int size2 = tf0Var.X0.size();
        if (tf0Var.f38403i1) {
            size2++;
        }
        org.telegram.messenger.yo yoVar = tf0Var.S0;
        if (yoVar == null) {
            size = 0;
        } else {
            size = yoVar.f26704b.size();
        }
        int j3 = (j() * 2) + Math.max(size, size2);
        for (int i10 = 0; i10 < j3; i10++) {
            arrayList2.add(new Object());
            arrayList.add(null);
        }
        super.g();
    }

    @Override
    public final int j() {
        tf0 tf0Var = this.h;
        int size = tf0Var.X0.size();
        if (tf0Var.f38403i1) {
            size++;
        }
        if (size >= 2) {
            return tf0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
