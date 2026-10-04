package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ri extends si {
    public int f30406b;
    public final xi f30407c;

    public ri(xi xiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        this.f30407c = xiVar;
        setWillNotDraw(false);
        setFocusable(true);
        d6Var = ((org.telegram.ui.ActionBar.f3) xiVar).resourcesProvider;
        oh.b bVar = new oh.b(context);
        bVar.d = d6Var;
        bVar.Q = true;
        TextView textView = bVar.f17197a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.f17198b.setLayoutParams(w7.z5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f17205w = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.cl, d6Var);
        bVar.f17204s = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.al, d6Var);
        bVar.v = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.bl, d6Var);
        bVar.f();
        this.f30731a = bVar;
        addView(bVar, w7.z5.c(-1.0f, -1));
    }

    public final void a(int i10, String str, oh.a aVar) {
        this.f30731a.setText(str);
        this.f30731a.setTabAnimation(aVar);
        this.f30406b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f30406b == this.f30407c.W0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30731a.e(z10, false);
    }
}
