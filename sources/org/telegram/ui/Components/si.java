package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class si extends ti {
    public int f27055b;
    public final yi f27056c;

    public si(yi yiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.f27056c = yiVar;
        setWillNotDraw(false);
        setFocusable(true);
        f6Var = ((org.telegram.ui.ActionBar.h3) yiVar).resourcesProvider;
        nh.b bVar = new nh.b(context);
        bVar.d = f6Var;
        bVar.Q = true;
        TextView textView = bVar.f14059a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.f14060b.setLayoutParams(w7.a6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f14066w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, f6Var);
        bVar.f14065s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, f6Var);
        bVar.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bl, f6Var);
        bVar.f();
        this.f27412a = bVar;
        addView(bVar, w7.a6.c(-1.0f, -1));
    }

    public final void a(int i10, String str, nh.a aVar) {
        this.f27412a.setText(str);
        this.f27412a.setTabAnimation(aVar);
        this.f27055b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f27055b == this.f27056c.W0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27412a.e(z10, false);
    }
}
