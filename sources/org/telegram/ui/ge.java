package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ge extends FrameLayout {
    public final org.telegram.ui.Components.c71 f36598a;
    public final org.telegram.ui.ActionBar.d6 f36599b;
    public final int f36600c;
    public final int d;
    public final ai.o8 f36601e;
    public final ie f36602f;

    public ge(ie ieVar, Context context, int i10, int i11, int i12, ai.o8 o8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f36602f = ieVar;
        this.d = i10;
        this.f36600c = i11;
        this.f36599b = d6Var;
        this.f36601e = o8Var;
        org.telegram.ui.Components.c71 c71Var = new org.telegram.ui.Components.c71(context, i11, i12, true, new c5(this, 3), new z0(this, 15), null, d6Var);
        this.f36598a = c71Var;
        setClipChildren(false);
        setClipToPadding(false);
        c71Var.setClipToPadding(false);
        c71Var.t1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
        c71Var.f25245f3.f31307r = false;
        c71Var.setCaptureSectionsDecoratorAllowed(true);
        c71Var.setOverScrollMode(0);
        addView(c71Var, w7.z5.c(-1.0f, -1));
        c71Var.setOnScrollListener(new ii.n3(1, this, o8Var));
        li.m mVar = ieVar.f37408w.f38549g2;
        if (mVar != null) {
            mVar.b(c71Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36598a.f25245f3.N(false);
    }
}
