package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class g7 extends org.telegram.ui.Components.c81 {
    public org.telegram.ui.ActionBar.p1 f34457a;
    public final Context f34458b;
    public final org.telegram.ui.ActionBar.p2 f34459c;
    public final u7 d;

    public g7(u7 u7Var, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        this.d = u7Var;
        this.f34458b = context;
        this.f34459c = p2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) view;
        ArrayList arrayList = this.d.e;
        sl0Var.setAdapter(((t7) arrayList.get(i10)).f38561c);
        if (((t7) arrayList.get(i10)).f38560b != 1 && ((t7) arrayList.get(i10)).f38560b != 4) {
            view.getContext();
            sl0Var.setLayoutManager(new f2.i0());
        } else {
            view.getContext();
            sl0Var.setLayoutManager(new f2.w(3));
        }
        sl0Var.setTag(Integer.valueOf(((t7) arrayList.get(i10)).f38560b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(this.f34458b, null);
        f2.l lVar = (f2.l) sl0Var.getItemAnimator();
        lVar.C = false;
        lVar.f5818m = false;
        sl0Var.setClipToPadding(false);
        sl0Var.setPadding(0, 0, 0, this.d.f38860s);
        sl0Var.setOnItemClickListener(new f7(this, sl0Var));
        sl0Var.setOnItemLongClickListener(new d7(this, sl0Var, this.f34459c, 0));
        return sl0Var;
    }

    @Override
    public final int e() {
        return this.d.e.size();
    }

    @Override
    public final int f(int i10) {
        return ((t7) this.d.e.get(i10)).f38560b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((t7) this.d.e.get(i10)).f38559a;
    }
}
