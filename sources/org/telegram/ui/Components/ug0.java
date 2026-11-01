package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class ug0 extends mp {
    public final ArrayList f30960c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f30961f;
    public g9 f30962g;
    public final vg0 h;

    public ug0(vg0 vg0Var, Context context, org.telegram.ui.ix0 ix0Var) {
        this.h = vg0Var;
        this.e = context;
        this.f30962g = ix0Var;
        Paint paint = new Paint(1);
        this.f30961f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        sg0 sg0Var = (sg0) obj;
        View view = sg0Var.f30286b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (sg0Var.f30285a) {
            return;
        }
        qg0 qg0Var = sg0Var.f30287c;
        if (qg0Var.getImageReceiver().m0 != null) {
            Drawable t10 = qg0Var.getImageReceiver().t();
            if (t10 instanceof s5) {
                ((s5) t10).w(qg0Var);
            }
        }
        qg0Var.setRoundRadius(0);
        gVar.removeView(qg0Var);
        qg0Var.getImageReceiver().c();
    }

    @Override
    public final int b() {
        return this.f30960c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f30960c.indexOf((sg0) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override
    public final CharSequence d(int i10) {
        int size;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k(i10) + 1);
        sb2.append("/");
        org.telegram.messenger.ep epVar = this.h.S0;
        if (epVar == null) {
            size = 0;
        } else {
            size = epVar.f15623b.size();
        }
        sb2.append(size);
        return sb2.toString();
    }

    @Override
    public final java.lang.Object e(z4.g r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ug0.e(z4.g, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        sg0 sg0Var = (sg0) obj;
        if (sg0Var.f30285a) {
            if (view == sg0Var.f30286b) {
                return true;
            }
            return false;
        } else if (view == sg0Var.f30287c) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final void g() {
        ArrayList arrayList;
        int size;
        int i10 = 0;
        while (true) {
            arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g9) arrayList.get(i10)).getImageReceiver().c();
            }
            i10++;
        }
        ArrayList arrayList2 = this.f30960c;
        arrayList2.clear();
        arrayList.clear();
        vg0 vg0Var = this.h;
        int size2 = vg0Var.X0.size();
        if (vg0Var.f31293i1) {
            size2++;
        }
        org.telegram.messenger.ep epVar = vg0Var.S0;
        if (epVar == null) {
            size = 0;
        } else {
            size = epVar.f15623b.size();
        }
        int j10 = (j() * 2) + Math.max(size, size2);
        for (int i11 = 0; i11 < j10; i11++) {
            arrayList2.add(new Object());
            arrayList.add(null);
        }
        super.g();
    }

    @Override
    public final int j() {
        vg0 vg0Var = this.h;
        int size = vg0Var.X0.size();
        if (vg0Var.f31293i1) {
            size++;
        }
        if (size >= 2) {
            return vg0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
