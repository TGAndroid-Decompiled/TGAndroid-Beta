package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class gi extends hi {
    public int f27181b;
    public final mi f27182c;

    public gi(mi miVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        this.f27182c = miVar;
        setWillNotDraw(false);
        setFocusable(true);
        g6Var = ((org.telegram.ui.ActionBar.h3) miVar).resourcesProvider;
        ch.b bVar = new ch.b(context);
        bVar.d = g6Var;
        bVar.N = true;
        TextView textView = bVar.f2519a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.f2520b.setLayoutParams(k7.c6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f2527w = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.cl, g6Var);
        bVar.f2526s = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.al, g6Var);
        bVar.v = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.bl, g6Var);
        bVar.f();
        this.f27509a = bVar;
        addView(bVar, k7.c6.c(-1.0f, -1));
    }

    public final void a(int i10, String str, ch.a aVar) {
        this.f27509a.setText(str);
        this.f27509a.setTabAnimation(aVar);
        this.f27181b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z4;
        super.onAttachedToWindow();
        if (this.f27181b == this.f27182c.T0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f27509a.e(z4, false);
    }
}
