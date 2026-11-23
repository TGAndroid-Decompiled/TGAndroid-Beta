package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class gg0 extends wp {
    public final ArrayList f35568c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context f35569e;
    public final Paint f35570f;
    public q9 f35571g;
    public final hg0 h;

    public gg0(hg0 hg0Var, Context context, org.telegram.ui.wv0 wv0Var) {
        this.h = hg0Var;
        this.f35569e = context;
        this.f35571g = wv0Var;
        Paint paint = new Paint(1);
        this.f35570f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        eg0 eg0Var = (eg0) obj;
        View view = eg0Var.f34791b;
        if (view != null) {
            lVar.removeView(view);
        }
        if (eg0Var.f34790a) {
            return;
        }
        cg0 cg0Var = eg0Var.f34792c;
        if (cg0Var.getImageReceiver().f22680n0 != null) {
            Drawable t6 = cg0Var.getImageReceiver().t();
            if (t6 instanceof c6) {
                ((c6) t6).w(cg0Var);
            }
        }
        cg0Var.setRoundRadius(0);
        lVar.removeView(cg0Var);
        cg0Var.getImageReceiver().c();
    }

    @Override
    public final int b() {
        return this.f35568c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f35568c.indexOf((eg0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gg0.e(c5.l, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        eg0 eg0Var = (eg0) obj;
        if (eg0Var.f34790a) {
            if (view == eg0Var.f34791b) {
                return true;
            }
            return false;
        } else if (view == eg0Var.f34792c) {
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
        ArrayList arrayList2 = this.f35568c;
        arrayList2.clear();
        arrayList.clear();
        hg0 hg0Var = this.h;
        int size2 = hg0Var.Y0.size();
        if (hg0Var.f35888j1) {
            size2++;
        }
        org.telegram.messenger.vo voVar = hg0Var.T0;
        if (voVar == null) {
            size = 0;
        } else {
            size = voVar.f27447b.size();
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
        hg0 hg0Var = this.h;
        int size = hg0Var.Y0.size();
        if (hg0Var.f35888j1) {
            size++;
        }
        if (size >= 2) {
            return hg0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
