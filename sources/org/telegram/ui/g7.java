package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class g7 extends org.telegram.ui.Components.d81 {
    public org.telegram.ui.ActionBar.p1 f37000a;
    public final Context f37001b;
    public final org.telegram.ui.ActionBar.p2 f37002c;
    public final u7 d;

    public g7(u7 u7Var, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        this.d = u7Var;
        this.f37001b = context;
        this.f37002c = p2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) view;
        ArrayList arrayList = this.d.f41733e;
        sl0Var.setAdapter(((t7) arrayList.get(i10)).f41451c);
        if (((t7) arrayList.get(i10)).f41450b != 1 && ((t7) arrayList.get(i10)).f41450b != 4) {
            view.getContext();
            sl0Var.setLayoutManager(new f2.j0());
        } else {
            view.getContext();
            sl0Var.setLayoutManager(new f2.w(3));
        }
        sl0Var.setTag(Integer.valueOf(((t7) arrayList.get(i10)).f41450b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(this.f37001b, null);
        f2.l lVar = (f2.l) sl0Var.getItemAnimator();
        lVar.C = false;
        lVar.f5910m = false;
        sl0Var.setClipToPadding(false);
        sl0Var.setPadding(0, 0, 0, this.d.f41737s);
        sl0Var.setOnItemClickListener(new f7(this, sl0Var));
        sl0Var.setOnItemLongClickListener(new d7(this, sl0Var, this.f37002c, 0));
        return sl0Var;
    }

    @Override
    public final int e() {
        return this.d.f41733e.size();
    }

    @Override
    public final int f(int i10) {
        return ((t7) this.d.f41733e.get(i10)).f41450b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((t7) this.d.f41733e.get(i10)).f41449a;
    }
}
