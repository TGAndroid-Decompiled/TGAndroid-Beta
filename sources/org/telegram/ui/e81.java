package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class e81 extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f38780a;
    public final org.telegram.ui.Components.aa0 f38781b;
    public final org.telegram.ui.Components.aa0 f38782c;
    public final fi.d d;
    public final fi.d e;

    public e81(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f38780a = u6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.Components.aa0 K = org.telegram.ui.Components.kb1.K(context, 15.0f, i10, true, u6Var);
        this.f38781b = K;
        K.setGravity(17);
        addView(K, org.telegram.ui.Components.kb1.x(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.aa0 K2 = org.telegram.ui.Components.kb1.K(context, 13.0f, i10, false, u6Var);
        this.f38782c = K2;
        K2.setGravity(17);
        addView(K2, org.telegram.ui.Components.kb1.v(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        fi.d f7 = org.telegram.messenger.wh.f(24, context, u6Var, true);
        this.d = f7;
        fi.d f10 = org.telegram.messenger.wh.f(24, context, u6Var, true);
        this.e = f10;
        linearLayout.addView(f7, org.telegram.ui.Components.kb1.t(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(f10, org.telegram.ui.Components.kb1.t(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, org.telegram.ui.Components.kb1.x(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f38780a;
        this.f38781b.setTextColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        this.f38782c.setTextColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
    }
}
