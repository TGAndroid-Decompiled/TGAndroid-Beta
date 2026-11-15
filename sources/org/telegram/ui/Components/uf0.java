package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class uf0 extends np {
    public final ArrayList f40017c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context f40018e;
    public final Paint f40019f;
    public i9 f40020g;
    public final vf0 h;

    public uf0(vf0 vf0Var, Context context, org.telegram.ui.vv0 vv0Var) {
        this.h = vf0Var;
        this.f40018e = context;
        this.f40020g = vv0Var;
        Paint paint = new Paint(1);
        this.f40019f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        sf0 sf0Var = (sf0) obj;
        View view = sf0Var.f39299b;
        if (view != null) {
            lVar.removeView(view);
        }
        if (sf0Var.f39298a) {
            return;
        }
        qf0 qf0Var = sf0Var.f39300c;
        if (qf0Var.getImageReceiver().f22286n0 != null) {
            Drawable t6 = qf0Var.getImageReceiver().t();
            if (t6 instanceof t5) {
                ((t5) t6).w(qf0Var);
            }
        }
        qf0Var.setRoundRadius(0);
        lVar.removeView(qf0Var);
        qf0Var.getImageReceiver().c();
    }

    @Override
    public final int b() {
        return this.f40017c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f40017c.indexOf((sf0) obj);
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
    public final java.lang.Object e(c5.l r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uf0.e(c5.l, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        sf0 sf0Var = (sf0) obj;
        if (sf0Var.f39298a) {
            if (view == sf0Var.f39299b) {
                return true;
            }
            return false;
        } else if (view == sf0Var.f39300c) {
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
                ((i9) arrayList.get(i7)).getImageReceiver().c();
            }
            i7++;
        }
        ArrayList arrayList2 = this.f40017c;
        arrayList2.clear();
        arrayList.clear();
        vf0 vf0Var = this.h;
        int size2 = vf0Var.Y0.size();
        if (vf0Var.f40399j1) {
            size2++;
        }
        org.telegram.messenger.vo voVar = vf0Var.T0;
        if (voVar == null) {
            size = 0;
        } else {
            size = voVar.f27089b.size();
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
        vf0 vf0Var = this.h;
        int size = vf0Var.Y0.size();
        if (vf0Var.f40399j1) {
            size++;
        }
        if (size >= 2) {
            return vf0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
