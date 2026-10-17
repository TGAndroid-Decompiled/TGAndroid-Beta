package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ni extends oi {
    public int f28762b;
    public final ti f28763c;

    public ni(ti tiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        this.f28763c = tiVar;
        setWillNotDraw(false);
        setFocusable(true);
        d6Var = ((org.telegram.ui.ActionBar.f3) tiVar).resourcesProvider;
        ph.b bVar = new ph.b(context);
        bVar.d = d6Var;
        bVar.Q = true;
        TextView textView = bVar.f44327a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.f44328b.setLayoutParams(w7.z5.a(24.0f, 0.0f, 4.0f, 0.0f, 0.0f, 24, 49));
        bVar.f44334w = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.cl, d6Var);
        bVar.f44333s = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.al, d6Var);
        bVar.v = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.bl, d6Var);
        bVar.f();
        this.f28978a = bVar;
        addView(bVar, w7.z5.d(-1.0f, -1));
    }

    public final void a(int i10, String str, ph.a aVar) {
        this.f28978a.setText(str);
        this.f28978a.setTabAnimation(aVar);
        this.f28762b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f28762b == this.f28763c.Z0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28978a.e(z10, false);
    }
}
