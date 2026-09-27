package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class qi extends ri {
    public int f27744b;
    public final wi f27745c;

    public qi(wi wiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        this.f27745c = wiVar;
        setWillNotDraw(false);
        setFocusable(true);
        e6Var = ((org.telegram.ui.ActionBar.g3) wiVar).resourcesProvider;
        oh.b bVar = new oh.b(context);
        bVar.d = e6Var;
        bVar.Q = true;
        TextView textView = bVar.f15767a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.f15768b.setLayoutParams(w7.y5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f15774w = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.cl, e6Var);
        bVar.f15773s = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.al, e6Var);
        bVar.v = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.bl, e6Var);
        bVar.f();
        this.f28006a = bVar;
        addView(bVar, w7.y5.c(-1.0f, -1));
    }

    public final void a(int i10, String str, oh.a aVar) {
        this.f28006a.setText(str);
        this.f28006a.setTabAnimation(aVar);
        this.f27744b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f27744b == this.f27745c.W0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28006a.e(z10, false);
    }
}
