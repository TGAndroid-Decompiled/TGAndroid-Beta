package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ri extends si {
    public int f28027b;
    public final xi f28028c;

    public ri(xi xiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        this.f28028c = xiVar;
        setWillNotDraw(false);
        setFocusable(true);
        d6Var = ((org.telegram.ui.ActionBar.e3) xiVar).resourcesProvider;
        oh.b bVar = new oh.b(context);
        bVar.d = d6Var;
        bVar.Q = true;
        TextView textView = bVar.f15745a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.f15746b.setLayoutParams(w7.y5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f15752w = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.cl, d6Var);
        bVar.f15751s = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.al, d6Var);
        bVar.v = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.bl, d6Var);
        bVar.f();
        this.f28263a = bVar;
        addView(bVar, w7.y5.c(-1.0f, -1));
    }

    public final void a(int i10, String str, oh.a aVar) {
        this.f28263a.setText(str);
        this.f28263a.setTabAnimation(aVar);
        this.f28027b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f28027b == this.f28028c.W0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28263a.e(z10, false);
    }
}
