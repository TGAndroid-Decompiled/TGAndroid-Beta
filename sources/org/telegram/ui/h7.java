package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class h7 extends org.telegram.ui.Components.n91 {
    public org.telegram.ui.ActionBar.o1 f39799a;
    public final Context f39800b;
    public final oi.q f39801c;
    public final c7 d;
    public final org.telegram.ui.Components.mw0 e;
    public final x7 f39802f;

    public h7(x7 x7Var, Context context, oi.q qVar, c7 c7Var, org.telegram.ui.Components.mw0 mw0Var) {
        this.f39802f = x7Var;
        this.f39800b = context;
        this.f39801c = qVar;
        this.d = c7Var;
        this.e = mw0Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        x7 x7Var = this.f39802f;
        org.telegram.ui.Components.nm0 c10 = x7Var.c(view);
        ArrayList arrayList = x7Var.f45611f;
        c10.setAdapter(((v7) arrayList.get(i10)).f44198c);
        if (((v7) arrayList.get(i10)).f44197b != 1 && ((v7) arrayList.get(i10)).f44197b != 4) {
            view.getContext();
            c10.setLayoutManager(new s4.c0());
        } else {
            view.getContext();
            c10.setLayoutManager(new s4.t(3));
        }
        c10.setTag(Integer.valueOf(((v7) arrayList.get(i10)).f44197b));
        view.setTag(Integer.valueOf(((v7) arrayList.get(i10)).f44197b));
        if (this.e != null) {
            ((org.telegram.ui.Components.pm0) x7Var.f45612n).L(view);
        }
    }

    @Override
    public final View d(int i10) {
        Context context = this.f39800b;
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        oi.q qVar = this.f39801c;
        if (qVar != null) {
            qVar.b(nm0Var);
        }
        s4.l lVar = (s4.l) nm0Var.getItemAnimator();
        lVar.C = false;
        lVar.f47798m = false;
        nm0Var.setClipToPadding(false);
        if (i10 != 1 && i10 != 4 && qVar != null) {
            nm0Var.setSections(false);
        }
        nm0Var.setCaptureSectionsDecoratorAllowed(true);
        x7 x7Var = this.f39802f;
        if (i10 == 1) {
            nm0Var.setPadding(AndroidUtilities.dp(2.0f), 0, 0, x7Var.v);
        } else {
            nm0Var.setPadding(0, 0, 0, x7Var.v);
        }
        nm0Var.setOnItemClickListener(new g7(this, nm0Var));
        nm0Var.setOnItemLongClickListener(new e7(this, nm0Var, this.d, 0));
        if (this.e == null) {
            return nm0Var;
        }
        return new w7(context, nm0Var);
    }

    @Override
    public final int e() {
        return this.f39802f.f45611f.size();
    }

    @Override
    public final int f(int i10) {
        return ((v7) this.f39802f.f45611f.get(i10)).f44197b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((v7) this.f39802f.f45611f.get(i10)).f44196a;
    }

    @Override
    public final int h(int i10) {
        return ((v7) this.f39802f.f45611f.get(i10)).f44197b;
    }
}
