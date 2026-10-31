package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class tg0 extends mp {
    public final ArrayList f30573c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f30574f;
    public g9 f30575g;
    public final ug0 h;

    public tg0(ug0 ug0Var, Context context, org.telegram.ui.jx0 jx0Var) {
        this.h = ug0Var;
        this.e = context;
        this.f30575g = jx0Var;
        Paint paint = new Paint(1);
        this.f30574f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        rg0 rg0Var = (rg0) obj;
        View view = rg0Var.f29910b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (rg0Var.f29909a) {
            return;
        }
        pg0 pg0Var = rg0Var.f29911c;
        if (pg0Var.getImageReceiver().m0 != null) {
            Drawable t10 = pg0Var.getImageReceiver().t();
            if (t10 instanceof s5) {
                ((s5) t10).w(pg0Var);
            }
        }
        pg0Var.setRoundRadius(0);
        gVar.removeView(pg0Var);
        pg0Var.getImageReceiver().c();
    }

    @Override
    public final int b() {
        return this.f30573c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f30573c.indexOf((rg0) obj);
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
        org.telegram.messenger.dp dpVar = this.h.S0;
        if (dpVar == null) {
            size = 0;
        } else {
            size = dpVar.f15288b.size();
        }
        sb2.append(size);
        return sb2.toString();
    }

    @Override
    public final java.lang.Object e(z4.g r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tg0.e(z4.g, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        rg0 rg0Var = (rg0) obj;
        if (rg0Var.f29909a) {
            if (view == rg0Var.f29910b) {
                return true;
            }
            return false;
        } else if (view == rg0Var.f29911c) {
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
        ArrayList arrayList2 = this.f30573c;
        arrayList2.clear();
        arrayList.clear();
        ug0 ug0Var = this.h;
        int size2 = ug0Var.X0.size();
        if (ug0Var.f30934i1) {
            size2++;
        }
        org.telegram.messenger.dp dpVar = ug0Var.S0;
        if (dpVar == null) {
            size = 0;
        } else {
            size = dpVar.f15288b.size();
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
        ug0 ug0Var = this.h;
        int size = ug0Var.X0.size();
        if (ug0Var.f30934i1) {
            size++;
        }
        if (size >= 2) {
            return ug0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
