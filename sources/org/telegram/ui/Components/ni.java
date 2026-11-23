package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class ni extends oi {
    public int f37834b;
    public final ti f37835c;

    public ni(ti tiVar, Context context) {
        super(context);
        this.f37835c = tiVar;
        setWillNotDraw(false);
        setFocusable(true);
        int i7 = ti.I4;
        org.telegram.ui.ActionBar.i6 i6Var = tiVar.J0;
        qh.b bVar = new qh.b(context);
        bVar.d = i6Var;
        bVar.R = true;
        TextView textView = bVar.f56279a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b(false);
        bVar.f56280b.setLayoutParams(c8.na.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f56288x = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Tl, i6Var);
        bVar.f56286s = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Rl, i6Var);
        bVar.f56287w = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Sl, i6Var);
        bVar.a();
        this.f38160a = bVar;
        addView(bVar, c8.na.c(-1.0f, -1));
    }

    public final void a(int i7, String str, qh.a aVar) {
        this.f38160a.setText(str);
        this.f38160a.setTabAnimation(aVar);
        this.f37834b = i7;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f37834b == this.f37835c.U2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38160a.f(z10, false);
    }
}
