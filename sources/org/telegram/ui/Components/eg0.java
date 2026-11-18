package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class eg0 extends up {
    public final ArrayList f34698c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context f34699e;
    public final Paint f34700f;
    public q9 f34701g;
    public final fg0 h;

    public eg0(fg0 fg0Var, Context context, org.telegram.ui.wv0 wv0Var) {
        this.h = fg0Var;
        this.f34699e = context;
        this.f34701g = wv0Var;
        Paint paint = new Paint(1);
        this.f34700f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        cg0 cg0Var = (cg0) obj;
        View view = cg0Var.f33992b;
        if (view != null) {
            lVar.removeView(view);
        }
        if (cg0Var.f33991a) {
            return;
        }
        ag0 ag0Var = cg0Var.f33993c;
        if (ag0Var.getImageReceiver().f22649n0 != null) {
            Drawable t6 = ag0Var.getImageReceiver().t();
            if (t6 instanceof b6) {
                ((b6) t6).w(ag0Var);
            }
        }
        ag0Var.setRoundRadius(0);
        lVar.removeView(ag0Var);
        ag0Var.getImageReceiver().c();
    }

    @Override
    public final int b() {
        return this.f34698c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f34698c.indexOf((cg0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eg0.e(c5.l, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        cg0 cg0Var = (cg0) obj;
        if (cg0Var.f33991a) {
            if (view == cg0Var.f33992b) {
                return true;
            }
            return false;
        } else if (view == cg0Var.f33993c) {
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
                ((q9) arrayList.get(i7)).getImageReceiver().c();
            }
            i7++;
        }
        ArrayList arrayList2 = this.f34698c;
        arrayList2.clear();
        arrayList.clear();
        fg0 fg0Var = this.h;
        int size2 = fg0Var.Y0.size();
        if (fg0Var.f35087j1) {
            size2++;
        }
        org.telegram.messenger.uo uoVar = fg0Var.T0;
        if (uoVar == null) {
            size = 0;
        } else {
            size = uoVar.f27199b.size();
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
        fg0 fg0Var = this.h;
        int size = fg0Var.Y0.size();
        if (fg0Var.f35087j1) {
            size++;
        }
        if (size >= 2) {
            return fg0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
