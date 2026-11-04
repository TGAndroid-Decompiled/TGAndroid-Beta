package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class vh extends wh {
    public int f39114b;
    public final bi f39115c;

    public vh(bi biVar, Context context) {
        super(context);
        this.f39115c = biVar;
        setWillNotDraw(false);
        setFocusable(true);
        int i3 = bi.F4;
        org.telegram.ui.ActionBar.e6 e6Var = biVar.J0;
        rh.b bVar = new rh.b(context);
        bVar.d = e6Var;
        bVar.R = true;
        TextView textView = bVar.f54528a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b(false);
        bVar.f54529b.setLayoutParams(b8.mf.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f54537x = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ql, e6Var);
        bVar.f54535s = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ol, e6Var);
        bVar.f54536w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Pl, e6Var);
        bVar.a();
        this.f40008a = bVar;
        addView(bVar, b8.mf.c(-1.0f, -1));
    }

    public final void a(int i3, String str, rh.a aVar) {
        this.f40008a.setText(str);
        this.f40008a.setTabAnimation(aVar);
        this.f39114b = i3;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f39114b == this.f39115c.R2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40008a.f(z10, false);
    }
}
