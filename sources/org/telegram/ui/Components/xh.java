package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class xh extends yh {
    public int f40386b;
    public final di f40387c;

    public xh(di diVar, Context context) {
        super(context);
        this.f40387c = diVar;
        setWillNotDraw(false);
        setFocusable(true);
        int i7 = di.E4;
        org.telegram.ui.ActionBar.g6 g6Var = diVar.I0;
        qh.b bVar = new qh.b(context);
        bVar.d = g6Var;
        bVar.Q = true;
        TextView textView = bVar.f54150a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b(false);
        bVar.f54151b.setLayoutParams(c8.ha.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f54159x = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ql, g6Var);
        bVar.f54157s = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ol, g6Var);
        bVar.f54158w = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Pl, g6Var);
        bVar.a();
        this.f40720a = bVar;
        addView(bVar, c8.ha.c(-1.0f, -1));
    }

    public final void a(int i7, String str, qh.a aVar) {
        this.f40720a.setText(str);
        this.f40720a.setTabAnimation(aVar);
        this.f40386b = i7;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z9;
        super.onAttachedToWindow();
        if (this.f40386b == this.f40387c.Q2) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f40720a.f(z9, false);
    }
}
