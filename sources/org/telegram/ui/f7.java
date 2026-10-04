package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class f7 extends org.telegram.ui.Components.x81 {
    public org.telegram.ui.ActionBar.n1 f36202a;
    public final Context f36203b;
    public final li.m f36204c;
    public final a7 d;
    public final org.telegram.ui.Components.aw0 f36205e;
    public final v7 f36206f;

    public f7(v7 v7Var, Context context, li.m mVar, a7 a7Var, org.telegram.ui.Components.aw0 aw0Var) {
        this.f36206f = v7Var;
        this.f36203b = context;
        this.f36204c = mVar;
        this.d = a7Var;
        this.f36205e = aw0Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.zl0 c10 = v7.c(view);
        v7 v7Var = this.f36206f;
        ArrayList arrayList = v7Var.f41572e;
        c10.setAdapter(((t7) arrayList.get(i10)).f40700c);
        if (((t7) arrayList.get(i10)).f40699b != 1 && ((t7) arrayList.get(i10)).f40699b != 4) {
            view.getContext();
            c10.setLayoutManager(new s4.c0());
        } else {
            view.getContext();
            c10.setLayoutManager(new s4.s(3));
        }
        c10.setTag(Integer.valueOf(((t7) arrayList.get(i10)).f40699b));
        view.setTag(Integer.valueOf(((t7) arrayList.get(i10)).f40699b));
        if (this.f36205e != null) {
            ((org.telegram.ui.Components.bm0) v7Var.h).L(view);
        }
    }

    @Override
    public final View d(int i10) {
        Context context = this.f36203b;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        li.m mVar = this.f36204c;
        if (mVar != null) {
            mVar.b(zl0Var);
        }
        s4.j jVar = (s4.j) zl0Var.getItemAnimator();
        jVar.C = false;
        jVar.f46562m = false;
        zl0Var.setClipToPadding(false);
        if (i10 != 1 && i10 != 4 && mVar != null) {
            zl0Var.setSections(false);
        }
        zl0Var.setCaptureSectionsDecoratorAllowed(true);
        v7 v7Var = this.f36206f;
        if (i10 == 1) {
            zl0Var.setPadding(AndroidUtilities.dp(2.0f), 0, 0, v7Var.f41576s);
        } else {
            zl0Var.setPadding(0, 0, 0, v7Var.f41576s);
        }
        zl0Var.setOnItemClickListener(new e7(this, zl0Var));
        zl0Var.setOnItemLongClickListener(new c7(this, zl0Var, this.d, 0));
        if (this.f36205e == null) {
            return zl0Var;
        }
        return new u7(context, zl0Var);
    }

    @Override
    public final int e() {
        return this.f36206f.f41572e.size();
    }

    @Override
    public final int f(int i10) {
        return ((t7) this.f36206f.f41572e.get(i10)).f40699b;
    }

    @Override
    public final CharSequence g(int i10) {
        return ((t7) this.f36206f.f41572e.get(i10)).f40698a;
    }

    @Override
    public final int h(int i10) {
        return ((t7) this.f36206f.f41572e.get(i10)).f40699b;
    }
}
