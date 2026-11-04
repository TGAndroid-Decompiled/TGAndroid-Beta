package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class uf0 extends ep {
    public final ArrayList f38733c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context f38734e;
    public final Paint f38735f;
    public k9 f38736g;
    public final vf0 h;

    public uf0(vf0 vf0Var, Context context, org.telegram.ui.nv0 nv0Var) {
        this.h = vf0Var;
        this.f38734e = context;
        this.f38736g = nv0Var;
        Paint paint = new Paint(1);
        this.f38735f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(b5.l lVar, Object obj) {
        sf0 sf0Var = (sf0) obj;
        View view = sf0Var.f38008b;
        if (view != null) {
            lVar.removeView(view);
        }
        if (sf0Var.f38007a) {
            return;
        }
        qf0 qf0Var = sf0Var.f38009c;
        if (qf0Var.getImageReceiver().f21256n0 != null) {
            Drawable t10 = qf0Var.getImageReceiver().t();
            if (t10 instanceof t5) {
                ((t5) t10).w(qf0Var);
            }
        }
        qf0Var.setRoundRadius(0);
        lVar.removeView(qf0Var);
        qf0Var.getImageReceiver().c();
    }

    @Override
    public final int b() {
        return this.f38733c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f38733c.indexOf((sf0) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override
    public final CharSequence d(int i3) {
        return (k(i3) + 1) + "/" + this.h.getRealCount();
    }

    @Override
    public final java.lang.Object e(b5.l r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uf0.e(b5.l, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        sf0 sf0Var = (sf0) obj;
        if (sf0Var.f38007a) {
            if (view == sf0Var.f38008b) {
                return true;
            }
            return false;
        } else if (view == sf0Var.f38009c) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final void g() {
        ArrayList arrayList;
        int size;
        int i3 = 0;
        while (true) {
            arrayList = this.d;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i3) != null) {
                ((k9) arrayList.get(i3)).getImageReceiver().c();
            }
            i3++;
        }
        ArrayList arrayList2 = this.f38733c;
        arrayList2.clear();
        arrayList.clear();
        vf0 vf0Var = this.h;
        int size2 = vf0Var.Y0.size();
        if (vf0Var.f39101j1) {
            size2++;
        }
        org.telegram.messenger.po poVar = vf0Var.T0;
        if (poVar == null) {
            size = 0;
        } else {
            size = poVar.f24786b.size();
        }
        int j10 = (j() * 2) + Math.max(size, size2);
        for (int i10 = 0; i10 < j10; i10++) {
            arrayList2.add(new Object());
            arrayList.add(null);
        }
        super.g();
    }

    @Override
    public final int j() {
        vf0 vf0Var = this.h;
        int size = vf0Var.Y0.size();
        if (vf0Var.f39101j1) {
            size++;
        }
        if (size >= 2) {
            return vf0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
