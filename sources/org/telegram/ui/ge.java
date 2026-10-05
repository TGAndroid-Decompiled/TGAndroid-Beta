package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ge extends FrameLayout {
    public final org.telegram.ui.Components.e71 f36637a;
    public final org.telegram.ui.ActionBar.d6 f36638b;
    public final int f36639c;
    public final int d;
    public final ai.o8 f36640e;
    public final ie f36641f;

    public ge(ie ieVar, Context context, int i10, int i11, int i12, ai.o8 o8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f36641f = ieVar;
        this.d = i10;
        this.f36639c = i11;
        this.f36638b = d6Var;
        this.f36640e = o8Var;
        org.telegram.ui.Components.e71 e71Var = new org.telegram.ui.Components.e71(context, i11, i12, true, new c5(this, 3), new z0(this, 15), null, d6Var);
        this.f36637a = e71Var;
        setClipChildren(false);
        setClipToPadding(false);
        e71Var.setClipToPadding(false);
        e71Var.s1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
        e71Var.f26034f3.f32531r = false;
        e71Var.setCaptureSectionsDecoratorAllowed(true);
        e71Var.setOverScrollMode(0);
        addView(e71Var, w7.z5.c(-1.0f, -1));
        e71Var.setOnScrollListener(new ii.n3(1, this, o8Var));
        li.p pVar = ieVar.f37396w.f38583d1;
        if (pVar != null) {
            pVar.b(e71Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36637a.f26034f3.N(false);
    }
}
