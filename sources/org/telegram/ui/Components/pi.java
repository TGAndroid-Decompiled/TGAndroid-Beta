package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class pi extends qi {
    public int f27053b;
    public final vi f27054c;

    public pi(vi viVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        this.f27054c = viVar;
        setWillNotDraw(false);
        setFocusable(true);
        e6Var = ((org.telegram.ui.ActionBar.f3) viVar).resourcesProvider;
        oh.b bVar = new oh.b(context);
        bVar.d = e6Var;
        bVar.Q = true;
        TextView textView = bVar.f15546a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.f15547b.setLayoutParams(w7.x5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f15553w = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.cl, e6Var);
        bVar.f15552s = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.al, e6Var);
        bVar.v = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.bl, e6Var);
        bVar.f();
        this.f27361a = bVar;
        addView(bVar, w7.x5.c(-1.0f, -1));
    }

    public final void a(int i10, String str, oh.a aVar) {
        this.f27361a.setText(str);
        this.f27361a.setTabAnimation(aVar);
        this.f27053b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f27053b == this.f27054c.W0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27361a.e(z10, false);
    }
}
