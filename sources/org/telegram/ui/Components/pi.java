package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class pi extends qi {
    public int f28005b;
    public final vi f28006c;

    public pi(vi viVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        this.f28006c = viVar;
        setWillNotDraw(false);
        setFocusable(true);
        c6Var = ((org.telegram.ui.ActionBar.e3) viVar).resourcesProvider;
        ph.b bVar = new ph.b(context);
        bVar.d = c6Var;
        bVar.Q = true;
        TextView textView = bVar.f42917a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.f42918b.setLayoutParams(w7.z5.a(24.0f, 0.0f, 4.0f, 0.0f, 0.0f, 24, 49));
        bVar.f42924w = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.cl, c6Var);
        bVar.f42923s = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.al, c6Var);
        bVar.v = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.bl, c6Var);
        bVar.f();
        this.f28295a = bVar;
        addView(bVar, w7.z5.d(-1.0f, -1));
    }

    public final void a(int i10, String str, ph.a aVar) {
        this.f28295a.setText(str);
        this.f28295a.setTabAnimation(aVar);
        this.f28005b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f28005b == this.f28006c.Z0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28295a.e(z10, false);
    }
}
