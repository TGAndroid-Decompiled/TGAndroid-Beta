package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class xh extends yh {
    public int f40315b;
    public final di f40316c;

    public xh(di diVar, Context context) {
        super(context);
        this.f40316c = diVar;
        setWillNotDraw(false);
        setFocusable(true);
        int i7 = di.E4;
        org.telegram.ui.ActionBar.f6 f6Var = diVar.I0;
        qh.b bVar = new qh.b(context);
        bVar.d = f6Var;
        bVar.Q = true;
        TextView textView = bVar.f54137a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b(false);
        bVar.f54138b.setLayoutParams(c8.ha.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f54146x = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ql, f6Var);
        bVar.f54144s = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ol, f6Var);
        bVar.f54145w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Pl, f6Var);
        bVar.a();
        this.f40672a = bVar;
        addView(bVar, c8.ha.c(-1.0f, -1));
    }

    public final void a(int i7, String str, qh.a aVar) {
        this.f40672a.setText(str);
        this.f40672a.setTabAnimation(aVar);
        this.f40315b = i7;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z9;
        super.onAttachedToWindow();
        if (this.f40315b == this.f40316c.Q2) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f40672a.f(z9, false);
    }
}
