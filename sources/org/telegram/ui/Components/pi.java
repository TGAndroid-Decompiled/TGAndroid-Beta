package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class pi extends qi {
    public int f27356b;
    public final vi f27357c;

    public pi(vi viVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.f27357c = viVar;
        setWillNotDraw(false);
        setFocusable(true);
        f6Var = ((org.telegram.ui.ActionBar.f3) viVar).resourcesProvider;
        oh.b bVar = new oh.b(context);
        bVar.d = f6Var;
        bVar.Q = true;
        TextView textView = bVar.f15732a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.f15733b.setLayoutParams(w7.y5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f15739w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, f6Var);
        bVar.f15738s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, f6Var);
        bVar.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bl, f6Var);
        bVar.f();
        this.f27577a = bVar;
        addView(bVar, w7.y5.c(-1.0f, -1));
    }

    public final void a(int i10, String str, oh.a aVar) {
        this.f27577a.setText(str);
        this.f27577a.setTabAnimation(aVar);
        this.f27356b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f27356b == this.f27357c.W0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27577a.e(z10, false);
    }
}
