package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class wh extends xh {
    public int f32182b;
    public final bi f32183c;

    public wh(bi biVar, Context context) {
        super(context);
        this.f32183c = biVar;
        setWillNotDraw(false);
        setFocusable(true);
        int i10 = bi.E4;
        org.telegram.ui.ActionBar.p6 p6Var = biVar.I0;
        gh.b bVar = new gh.b(context);
        bVar.d = p6Var;
        bVar.Q = true;
        TextView textView = bVar.f7518a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        bVar.b(false);
        bVar.f7519b.setLayoutParams(w7.b6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f7526x = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ql, p6Var);
        bVar.f7524s = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ol, p6Var);
        bVar.f7525w = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Pl, p6Var);
        bVar.a();
        this.f32471a = bVar;
        addView(bVar, w7.b6.c(-1.0f, -1));
    }

    public final void a(int i10, String str, gh.a aVar) {
        this.f32471a.setText(str);
        this.f32471a.setTabAnimation(aVar);
        this.f32182b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f32182b == this.f32183c.Q2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32471a.f(z10, false);
    }
}
