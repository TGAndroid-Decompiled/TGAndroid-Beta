package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.s71 f38846a;
    public final org.telegram.ui.ActionBar.u6 f38847b;
    public final int f38848c;
    public final int d;
    public final ag.r0 e;
    public final ge f38849f;

    public ee(ge geVar, Context context, int i10, int i11, int i12, ag.r0 r0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f38849f = geVar;
        this.d = i10;
        this.f38848c = i11;
        this.f38847b = u6Var;
        this.e = r0Var;
        org.telegram.ui.Components.s71 s71Var = new org.telegram.ui.Components.s71(context, i11, i12, true, new e5(this, 3), new y0(this, 15), null, u6Var);
        this.f38846a = s71Var;
        setClipChildren(false);
        setClipToPadding(false);
        s71Var.setClipToPadding(false);
        s71Var.v1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
        s71Var.f32504g3.f29878r = false;
        s71Var.setCaptureSectionsDecoratorAllowed(true);
        s71Var.setOverScrollMode(0);
        addView(s71Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        s71Var.setOnScrollListener(new ai.u0(2, this, r0Var));
        oi.q qVar = geVar.f39603w.f40758d1;
        if (qVar != null) {
            qVar.b(s71Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38846a.f32504g3.O(false);
    }
}
