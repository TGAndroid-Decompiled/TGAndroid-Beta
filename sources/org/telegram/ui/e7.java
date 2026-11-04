package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class e7 extends org.telegram.ui.Components.f61 {
    public org.telegram.ui.ActionBar.f1 f44909a;
    public final Context f44910b;
    public final pi.q f44911c;
    public final z6 d;
    public final org.telegram.ui.Components.gt0 f44912e;
    public final u7 f44913f;

    public e7(u7 u7Var, Context context, pi.q qVar, z6 z6Var, org.telegram.ui.Components.gt0 gt0Var) {
        this.f44913f = u7Var;
        this.f44910b = context;
        this.f44911c = qVar;
        this.d = z6Var;
        this.f44912e = gt0Var;
    }

    @Override
    public final void b(View view, int i3, int i10) {
        u7 u7Var = this.f44913f;
        org.telegram.ui.Components.tj0 c2 = u7Var.c(view);
        ArrayList arrayList = u7Var.f50000f;
        c2.setAdapter(((s7) arrayList.get(i3)).f49408c);
        if (((s7) arrayList.get(i3)).f49407b != 1 && ((s7) arrayList.get(i3)).f49407b != 4) {
            view.getContext();
            c2.setLayoutManager(new u4.b0());
        } else {
            view.getContext();
            c2.setLayoutManager(new u4.s(3));
        }
        c2.setTag(Integer.valueOf(((s7) arrayList.get(i3)).f49407b));
        view.setTag(Integer.valueOf(((s7) arrayList.get(i3)).f49407b));
        if (this.f44912e != null) {
            ((org.telegram.ui.Components.vj0) u7Var.f50001n).L(view);
        }
    }

    @Override
    public final View d(int i3) {
        Context context = this.f44910b;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        pi.q qVar = this.f44911c;
        if (qVar != null) {
            qVar.b(tj0Var);
        }
        u4.k kVar = (u4.k) tj0Var.getItemAnimator();
        kVar.C = false;
        kVar.f55567m = false;
        tj0Var.setClipToPadding(false);
        if (i3 != 1 && i3 != 4 && qVar != null) {
            tj0Var.setSections(false);
        }
        tj0Var.setCaptureSectionsDecoratorAllowed(true);
        u7 u7Var = this.f44913f;
        if (i3 == 1) {
            tj0Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, 0, u7Var.f50004w);
        } else {
            tj0Var.setPadding(0, 0, 0, u7Var.f50004w);
        }
        tj0Var.setOnItemClickListener(new d7(this, tj0Var));
        tj0Var.setOnItemLongClickListener(new b7(this, tj0Var, this.d, 0));
        if (this.f44912e == null) {
            return tj0Var;
        }
        return new t7(context, tj0Var);
    }

    @Override
    public final int e() {
        return this.f44913f.f50000f.size();
    }

    @Override
    public final int f(int i3) {
        return ((s7) this.f44913f.f50000f.get(i3)).f49407b;
    }

    @Override
    public final CharSequence g(int i3) {
        return ((s7) this.f44913f.f50000f.get(i3)).f49406a;
    }

    @Override
    public final int h(int i3) {
        return ((s7) this.f44913f.f50000f.get(i3)).f49407b;
    }
}
