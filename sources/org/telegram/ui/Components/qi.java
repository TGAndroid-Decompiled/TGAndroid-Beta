package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class qi extends ri {
    public int f27358b;
    public final wi f27359c;

    public qi(wi wiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        this.f27359c = wiVar;
        setWillNotDraw(false);
        setFocusable(true);
        d6Var = ((org.telegram.ui.ActionBar.f3) wiVar).resourcesProvider;
        oh.b bVar = new oh.b(context);
        bVar.d = d6Var;
        bVar.Q = true;
        TextView textView = bVar.f15521a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.f15522b.setLayoutParams(w7.x5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f15528w = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.cl, d6Var);
        bVar.f15527s = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.al, d6Var);
        bVar.v = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.bl, d6Var);
        bVar.f();
        this.f27645a = bVar;
        addView(bVar, w7.x5.c(-1.0f, -1));
    }

    public final void a(int i10, String str, oh.a aVar) {
        this.f27645a.setText(str);
        this.f27645a.setTabAnimation(aVar);
        this.f27358b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f27358b == this.f27359c.W0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27645a.e(z10, false);
    }
}
