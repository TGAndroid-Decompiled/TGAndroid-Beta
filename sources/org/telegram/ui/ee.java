package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.k71 f37237a;
    public final org.telegram.ui.ActionBar.e6 f37238b;
    public final int f37239c;
    public final int d;
    public final ai.p8 f37240e;
    public final ge f37241f;

    public ee(ge geVar, Context context, int i10, int i11, int i12, ai.p8 p8Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f37241f = geVar;
        this.d = i10;
        this.f37239c = i11;
        this.f37238b = e6Var;
        this.f37240e = p8Var;
        org.telegram.ui.Components.k71 k71Var = new org.telegram.ui.Components.k71(context, i11, i12, true, new b5(this, 3), new z0(this, 13), null, e6Var);
        this.f37237a = k71Var;
        addView(k71Var, w7.x5.d(-1.0f, -1));
        k71Var.setOnScrollListener(new ii.n3(1, this, p8Var));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37237a.W2.N(false);
    }
}
