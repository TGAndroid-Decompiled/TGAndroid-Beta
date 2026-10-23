package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ni extends oi {
    public int f28953b;
    public final ti f28954c;

    public ni(ti tiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        this.f28954c = tiVar;
        setWillNotDraw(false);
        setFocusable(true);
        g6Var = ((org.telegram.ui.ActionBar.h3) tiVar).resourcesProvider;
        ph.b bVar = new ph.b(context);
        bVar.d = g6Var;
        bVar.Q = true;
        TextView textView = bVar.f44726a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.b(false);
        bVar.f44727b.setLayoutParams(w7.z5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f44733w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.cl, g6Var);
        bVar.f44732s = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.al, g6Var);
        bVar.v = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.bl, g6Var);
        bVar.a();
        this.f29184a = bVar;
        addView(bVar, w7.z5.c(-1.0f, -1));
    }

    public final void a(int i10, String str, ph.a aVar) {
        this.f29184a.setText(str);
        this.f29184a.setTabAnimation(aVar);
        this.f28953b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f28953b == this.f28954c.Z0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29184a.f(z10, false);
    }
}
