package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class fg0 extends tp {
    public final ArrayList f35128c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context f35129e;
    public final Paint f35130f;
    public p9 f35131g;
    public final gg0 h;

    public fg0(gg0 gg0Var, Context context, org.telegram.ui.vv0 vv0Var) {
        this.h = gg0Var;
        this.f35129e = context;
        this.f35131g = vv0Var;
        Paint paint = new Paint(1);
        this.f35130f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        dg0 dg0Var = (dg0) obj;
        View view = dg0Var.f34327b;
        if (view != null) {
            lVar.removeView(view);
        }
        if (dg0Var.f34326a) {
            return;
        }
        bg0 bg0Var = dg0Var.f34328c;
        if (bg0Var.getImageReceiver().f22747n0 != null) {
            Drawable t6 = bg0Var.getImageReceiver().t();
            if (t6 instanceof b6) {
                ((b6) t6).w(bg0Var);
            }
        }
        bg0Var.setRoundRadius(0);
        lVar.removeView(bg0Var);
        bg0Var.getImageReceiver().c();
    }

    @Override
    public final int b() {
        return this.f35128c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f35128c.indexOf((dg0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fg0.e(c5.l, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        dg0 dg0Var = (dg0) obj;
        if (dg0Var.f34326a) {
            if (view == dg0Var.f34327b) {
                return true;
            }
            return false;
        } else if (view == dg0Var.f34328c) {
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
                ((p9) arrayList.get(i7)).getImageReceiver().c();
            }
            i7++;
        }
        ArrayList arrayList2 = this.f35128c;
        arrayList2.clear();
        arrayList.clear();
        gg0 gg0Var = this.h;
        int size2 = gg0Var.Y0.size();
        if (gg0Var.f35422j1) {
            size2++;
        }
        org.telegram.messenger.uo uoVar = gg0Var.T0;
        if (uoVar == null) {
            size = 0;
        } else {
            size = uoVar.f27303b.size();
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
        gg0 gg0Var = this.h;
        int size = gg0Var.Y0.size();
        if (gg0Var.f35422j1) {
            size++;
        }
        if (size >= 2) {
            return gg0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
