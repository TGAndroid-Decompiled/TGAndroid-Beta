package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class rf0 extends ep {
    public final ArrayList f37634c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context f37635e;
    public final Paint f37636f;
    public k9 f37637g;
    public final sf0 h;

    public rf0(sf0 sf0Var, Context context, org.telegram.ui.zv0 zv0Var) {
        this.h = sf0Var;
        this.f37635e = context;
        this.f37637g = zv0Var;
        Paint paint = new Paint(1);
        this.f37636f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(c5.k kVar, Object obj) {
        pf0 pf0Var = (pf0) obj;
        View view = pf0Var.f36907b;
        if (view != null) {
            kVar.removeView(view);
        }
        if (pf0Var.f36906a) {
            return;
        }
        nf0 nf0Var = pf0Var.f36908c;
        if (nf0Var.getImageReceiver().m0 != null) {
            Drawable t6 = nf0Var.getImageReceiver().t();
            if (t6 instanceof u5) {
                ((u5) t6).w(nf0Var);
            }
        }
        nf0Var.setRoundRadius(0);
        kVar.removeView(nf0Var);
        nf0Var.getImageReceiver().c();
    }

    @Override
    public final int b() {
        return this.f37634c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f37634c.indexOf((pf0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rf0.e(c5.k, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        pf0 pf0Var = (pf0) obj;
        if (pf0Var.f36906a) {
            if (view == pf0Var.f36907b) {
                return true;
            }
            return false;
        } else if (view == pf0Var.f36908c) {
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
                ((k9) arrayList.get(i7)).getImageReceiver().c();
            }
            i7++;
        }
        ArrayList arrayList2 = this.f37634c;
        arrayList2.clear();
        arrayList.clear();
        sf0 sf0Var = this.h;
        int size2 = sf0Var.X0.size();
        if (sf0Var.f37977i1) {
            size2++;
        }
        org.telegram.messenger.yo yoVar = sf0Var.S0;
        if (yoVar == null) {
            size = 0;
        } else {
            size = yoVar.f26708b.size();
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
        sf0 sf0Var = this.h;
        int size = sf0Var.X0.size();
        if (sf0Var.f37977i1) {
            size++;
        }
        if (size >= 2) {
            return sf0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
