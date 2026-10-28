package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ni extends oi {
    public int f30923b;
    public final ti f30924c;

    public ni(ti tiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        this.f30924c = tiVar;
        setWillNotDraw(false);
        setFocusable(true);
        u6Var = ((org.telegram.ui.ActionBar.k3) tiVar).resourcesProvider;
        qh.b bVar = new qh.b(context);
        bVar.d = u6Var;
        bVar.Q = true;
        TextView textView = bVar.f47089a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.b(false);
        bVar.f47090b.setLayoutParams(kb1.h(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f47096w = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.cl, u6Var);
        bVar.f47095s = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.al, u6Var);
        bVar.v = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.bl, u6Var);
        bVar.a();
        this.f31294a = bVar;
        addView(bVar, kb1.g(-1.0f, -1));
    }

    public final void a(int i10, String str, qh.a aVar) {
        this.f31294a.setText(str);
        this.f31294a.setTabAnimation(aVar);
        this.f30923b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f30923b == this.f30924c.Z0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31294a.f(z10, false);
    }
}
