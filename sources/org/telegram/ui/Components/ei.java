package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class ei extends fi {
    public int f34322b;
    public final ki f34323c;

    public ei(ki kiVar, Context context) {
        super(context);
        this.f34323c = kiVar;
        setWillNotDraw(false);
        setFocusable(true);
        int i7 = ki.I4;
        org.telegram.ui.ActionBar.e6 e6Var = kiVar.J0;
        qh.b bVar = new qh.b(context);
        bVar.d = e6Var;
        bVar.R = true;
        TextView textView = bVar.f55582a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b(false);
        bVar.f55583b.setLayoutParams(c8.ja.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f55591x = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Tl, e6Var);
        bVar.f55589s = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Rl, e6Var);
        bVar.f55590w = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Sl, e6Var);
        bVar.a();
        this.f34612a = bVar;
        addView(bVar, c8.ja.c(-1.0f, -1));
    }

    public final void a(int i7, String str, qh.a aVar) {
        this.f34612a.setText(str);
        this.f34612a.setTabAnimation(aVar);
        this.f34322b = i7;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f34322b == this.f34323c.U2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34612a.f(z10, false);
    }
}
