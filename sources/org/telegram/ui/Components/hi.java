package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class hi extends ii {
    public int f29181b;
    public final ni f29182c;

    public hi(ni niVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        this.f29182c = niVar;
        setWillNotDraw(false);
        setFocusable(true);
        c6Var = ((org.telegram.ui.ActionBar.f3) niVar).resourcesProvider;
        zg.b bVar = new zg.b(context);
        bVar.d = c6Var;
        bVar.M = true;
        TextView textView = bVar.f50859a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.f50860b.setLayoutParams(i7.f6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f50867w = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.cl, c6Var);
        bVar.f50866s = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.al, c6Var);
        bVar.v = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.bl, c6Var);
        bVar.f();
        this.f29393a = bVar;
        addView(bVar, i7.f6.c(-1.0f, -1));
    }

    public final void a(int i10, String str, zg.a aVar) {
        this.f29393a.setText(str);
        this.f29393a.setTabAnimation(aVar);
        this.f29181b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f29181b == this.f29182c.S0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29393a.e(z10, false);
    }
}
