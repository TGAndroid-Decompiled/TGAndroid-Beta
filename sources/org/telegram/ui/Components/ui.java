package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ui extends h51 {
    public static final int f29225a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        vi viVar = (vi) view;
        CharSequence charSequence = i51Var.f25565l;
        CharSequence charSequence2 = i51Var.f25566m;
        viVar.f29492b.setText(charSequence);
        viVar.f29493c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new vi(context, f6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
