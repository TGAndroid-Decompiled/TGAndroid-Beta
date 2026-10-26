package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class h7 extends org.telegram.ui.Components.m91 {
    public org.telegram.ui.ActionBar.o1 f39915a;
    public final Context f39916b;
    public final oi.q f39917c;
    public final c7 d;
    public final org.telegram.ui.Components.lw0 e;
    public final x7 f39918f;

    public h7(x7 x7Var, Context context, oi.q qVar, c7 c7Var, org.telegram.ui.Components.lw0 lw0Var) {
        this.f39918f = x7Var;
        this.f39916b = context;
        this.f39917c = qVar;
        this.d = c7Var;
        this.e = lw0Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        x7 x7Var = this.f39918f;
        org.telegram.ui.Components.mm0 c10 = x7Var.c(view);
        ArrayList arrayList = x7Var.f45681f;
        c10.setAdapter(((v7) arrayList.get(i10)).f44729c);
        if (((v7) arrayList.get(i10)).f44728b != 1 && ((v7) arrayList.get(i10)).f44728b != 4) {
            view.getContext();
            c10.setLayoutManager(new s4.c0());
        } else {
            view.getContext();
            c10.setLayoutManager(new s4.t(3));
        }
        c10.setTag(Integer.valueOf(((v7) arrayList.get(i10)).f44728b));
        view.setTag(Integer.valueOf(((v7) arrayList.get(i10)).f44728b));
        if (this.e != null) {
            ((org.telegram.ui.Components.om0) x7Var.f45682n).L(view);
        }
    }

    @Override
    public final View d(int i10) {
        Context context = this.f39916b;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        oi.q qVar = this.f39917c;
        if (qVar != null) {
            qVar.b(mm0Var);
        }
        s4.l lVar = (s4.l) mm0Var.getItemAnimator();
        lVar.C = false;
        lVar.f47763m = false;
        mm0Var.setClipToPadding(false);
        if (i10 != 1 && i10 != 4 && qVar != null) {
            mm0Var.setSections(false);
        }
        mm0Var.setCaptureSectionsDecoratorAllowed(true);
        x7 x7Var = this.f39918f;
        if (i10 == 1) {
            mm0Var.setPadding(AndroidUtilities.dp(2.0f), 0, 0, x7Var.v);
        } else {
            mm0Var.setPadding(0, 0, 0, x7Var.v);
        }
        mm0Var.setOnItemClickListener(new g7(this, mm0Var));
        mm0Var.setOnItemLongClickListener(new e7(this, mm0Var, this.d, 0));
        if (this.e == null) {
            return mm0Var;
        }
        return new w7(context, mm0Var);
    }

    @Override
    public final int e() {
        return this.f39918f.f45681f.size();
    }

    @Override
    public final int f(int i10) {
        return ((v7) this.f39918f.f45681f.get(i10)).f44728b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((v7) this.f39918f.f45681f.get(i10)).f44727a;
    }

    @Override
    public final int h(int i10) {
        return ((v7) this.f39918f.f45681f.get(i10)).f44728b;
    }
}
