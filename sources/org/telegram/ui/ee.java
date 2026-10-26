package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.r71 f39091a;
    public final org.telegram.ui.ActionBar.u6 f39092b;
    public final int f39093c;
    public final int d;
    public final ag.r0 e;
    public final ge f39094f;

    public ee(ge geVar, Context context, int i10, int i11, int i12, ag.r0 r0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f39094f = geVar;
        this.d = i10;
        this.f39093c = i11;
        this.f39092b = u6Var;
        this.e = r0Var;
        org.telegram.ui.Components.r71 r71Var = new org.telegram.ui.Components.r71(context, i11, i12, true, new e5(this, 3), new y0(this, 15), null, u6Var);
        this.f39091a = r71Var;
        setClipChildren(false);
        setClipToPadding(false);
        r71Var.setClipToPadding(false);
        r71Var.v1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
        r71Var.f32152g3.f29507r = false;
        r71Var.setCaptureSectionsDecoratorAllowed(true);
        r71Var.setOverScrollMode(0);
        addView(r71Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        r71Var.setOnScrollListener(new ai.u0(2, this, r0Var));
        oi.q qVar = geVar.f39626w.f40896d1;
        if (qVar != null) {
            qVar.b(r71Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39091a.f32152g3.O(false);
    }
}
