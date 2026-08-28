package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ei extends fi {
    public int f28032b;
    public final ki f28033c;

    public ei(ki kiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b6 b6Var;
        this.f28033c = kiVar;
        setWillNotDraw(false);
        setFocusable(true);
        b6Var = ((org.telegram.ui.ActionBar.f3) kiVar).resourcesProvider;
        wg.b bVar = new wg.b(context);
        bVar.d = b6Var;
        bVar.M = true;
        TextView textView = bVar.f48828a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.f48829b.setLayoutParams(g7.e6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f48836w = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.cl, b6Var);
        bVar.f48835s = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.al, b6Var);
        bVar.v = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.bl, b6Var);
        bVar.f();
        this.f28435a = bVar;
        addView(bVar, g7.e6.c(-1.0f, -1));
    }

    public final void a(int i9, String str, wg.a aVar) {
        this.f28435a.setText(str);
        this.f28435a.setTabAnimation(aVar);
        this.f28032b = i9;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f28032b == this.f28033c.S0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28435a.e(z10, false);
    }
}
