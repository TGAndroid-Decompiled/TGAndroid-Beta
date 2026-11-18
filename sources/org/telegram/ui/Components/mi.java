package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class mi extends ni {
    public int f37515b;
    public final si f37516c;

    public mi(si siVar, Context context) {
        super(context);
        this.f37516c = siVar;
        setWillNotDraw(false);
        setFocusable(true);
        int i7 = si.I4;
        org.telegram.ui.ActionBar.i6 i6Var = siVar.J0;
        qh.b bVar = new qh.b(context);
        bVar.d = i6Var;
        bVar.R = true;
        TextView textView = bVar.f56156a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b(false);
        bVar.f56157b.setLayoutParams(c8.ma.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f56165x = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Tl, i6Var);
        bVar.f56163s = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Rl, i6Var);
        bVar.f56164w = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Sl, i6Var);
        bVar.a();
        this.f37793a = bVar;
        addView(bVar, c8.ma.c(-1.0f, -1));
    }

    public final void a(int i7, String str, qh.a aVar) {
        this.f37793a.setText(str);
        this.f37793a.setTabAnimation(aVar);
        this.f37515b = i7;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f37515b == this.f37516c.U2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37793a.f(z10, false);
    }
}
