package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class i91 extends org.telegram.ui.Components.l61 {
    public static final int f36762a = 0;

    static {
        org.telegram.ui.Components.l61.setup(new org.telegram.ui.Components.l61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.a71 a71Var, org.telegram.ui.Components.i71 i71Var) {
        ((j91) view).set(m61Var.f26959z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.m61 m61Var2) {
        if (m61Var.f26959z == m61Var2.f26959z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new j91(context, c6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.m61 m61Var2) {
        if (m61Var.d == m61Var2.d) {
            return true;
        }
        return false;
    }
}
