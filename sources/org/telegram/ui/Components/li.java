package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class li extends mi {
    public int f28343b;
    public final ri f28344c;

    public li(ri riVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        this.f28344c = riVar;
        setWillNotDraw(false);
        setFocusable(true);
        g6Var = ((org.telegram.ui.ActionBar.h3) riVar).resourcesProvider;
        ph.b bVar = new ph.b(context);
        bVar.d = g6Var;
        bVar.Q = true;
        TextView textView = bVar.f44725a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.b(false);
        bVar.f44726b.setLayoutParams(w7.z5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f44732w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.cl, g6Var);
        bVar.f44731s = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.al, g6Var);
        bVar.v = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.bl, g6Var);
        bVar.a();
        this.f28603a = bVar;
        addView(bVar, w7.z5.c(-1.0f, -1));
    }

    public final void a(int i10, String str, ph.a aVar) {
        this.f28603a.setText(str);
        this.f28603a.setTabAnimation(aVar);
        this.f28343b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f28343b == this.f28344c.Z0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28603a.f(z10, false);
    }
}
