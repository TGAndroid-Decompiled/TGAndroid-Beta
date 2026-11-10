package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class wh extends xh {
    public int f39971b;
    public final ci f39972c;

    public wh(ci ciVar, Context context) {
        super(context);
        this.f39972c = ciVar;
        setWillNotDraw(false);
        setFocusable(true);
        int i7 = ci.H4;
        org.telegram.ui.ActionBar.h6 h6Var = ciVar.I0;
        qh.b bVar = new qh.b(context);
        bVar.d = h6Var;
        bVar.Q = true;
        TextView textView = bVar.f54149a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b(false);
        bVar.f54150b.setLayoutParams(c8.ha.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f54158x = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ql, h6Var);
        bVar.f54156s = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ol, h6Var);
        bVar.f54157w = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Pl, h6Var);
        bVar.a();
        this.f40307a = bVar;
        addView(bVar, c8.ha.c(-1.0f, -1));
    }

    public final void a(int i7, String str, qh.a aVar) {
        this.f40307a.setText(str);
        this.f40307a.setTabAnimation(aVar);
        this.f39971b = i7;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z9;
        super.onAttachedToWindow();
        if (this.f39971b == this.f39972c.T2) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f40307a.f(z9, false);
    }
}
