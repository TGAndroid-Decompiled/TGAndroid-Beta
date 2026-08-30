package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class fi extends gi {
    public int f24881b;
    public final li f24882c;

    public fi(li liVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.f24882c = liVar;
        setWillNotDraw(false);
        setFocusable(true);
        f6Var = ((org.telegram.ui.ActionBar.g3) liVar).resourcesProvider;
        bh.b bVar = new bh.b(context);
        bVar.d = f6Var;
        bVar.N = true;
        TextView textView = bVar.f1821a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.f1822b.setLayoutParams(k7.b6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f1828w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, f6Var);
        bVar.f1827s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, f6Var);
        bVar.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bl, f6Var);
        bVar.f();
        this.f25143a = bVar;
        addView(bVar, k7.b6.c(-1.0f, -1));
    }

    public final void a(int i10, String str, bh.a aVar) {
        this.f25143a.setText(str);
        this.f25143a.setTabAnimation(aVar);
        this.f24881b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z4;
        super.onAttachedToWindow();
        if (this.f24881b == this.f24882c.T0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f25143a.e(z4, false);
    }
}
