package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

public final class e7 extends org.telegram.ui.Components.g71 {

    public org.telegram.ui.ActionBar.n1 f37641a;

    public final Context f37642b;

    public final org.telegram.ui.ActionBar.n2 f37643c;
    public final s7 d;

    public e7(s7 s7Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = s7Var;
        this.f37642b = context;
        this.f37643c = n2Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.zk0 zk0Var = (org.telegram.ui.Components.zk0) view;
        ArrayList arrayList = this.d.f42533e;
        zk0Var.setAdapter(((r7) arrayList.get(i10)).f41826c);
        if (((r7) arrayList.get(i10)).f41825b == 1 || ((r7) arrayList.get(i10)).f41825b == 4) {
            view.getContext();
            zk0Var.setLayoutManager(new f2.x(3));
        } else {
            view.getContext();
            zk0Var.setLayoutManager(new f2.k0());
        }
        zk0Var.setTag(Integer.valueOf(((r7) arrayList.get(i10)).f41825b));
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(this.f37642b, null);
        f2.l lVar = (f2.l) zk0Var.getItemAnimator();
        lVar.C = false;
        lVar.f5819m = false;
        zk0Var.setClipToPadding(false);
        zk0Var.setPadding(0, 0, 0, this.d.f42537s);
        zk0Var.setOnItemClickListener(new d7(this, zk0Var));
        zk0Var.setOnItemLongClickListener(new b7(this, zk0Var, this.f37643c, 0));
        return zk0Var;
    }

    @Override
    public final int e() {
        return this.d.f42533e.size();
    }

    @Override
    public final int f(int i10) {
        return ((r7) this.d.f42533e.get(i10)).f41825b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((r7) this.d.f42533e.get(i10)).f41824a;
    }
}
