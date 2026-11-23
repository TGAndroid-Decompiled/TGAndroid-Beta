package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class oi extends pi {
    public int f38208b;
    public final ui f38209c;

    public oi(ui uiVar, Context context) {
        super(context);
        this.f38209c = uiVar;
        setWillNotDraw(false);
        setFocusable(true);
        int i7 = ui.I4;
        org.telegram.ui.ActionBar.h6 h6Var = uiVar.J0;
        qh.b bVar = new qh.b(context);
        bVar.d = h6Var;
        bVar.R = true;
        TextView textView = bVar.f56166a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b(false);
        bVar.f56167b.setLayoutParams(c8.na.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f56175x = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Tl, h6Var);
        bVar.f56173s = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Rl, h6Var);
        bVar.f56174w = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Sl, h6Var);
        bVar.a();
        this.f38558a = bVar;
        addView(bVar, c8.na.c(-1.0f, -1));
    }

    public final void a(int i7, String str, qh.a aVar) {
        this.f38558a.setText(str);
        this.f38558a.setTabAnimation(aVar);
        this.f38208b = i7;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f38208b == this.f38209c.U2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38558a.f(z10, false);
    }
}
