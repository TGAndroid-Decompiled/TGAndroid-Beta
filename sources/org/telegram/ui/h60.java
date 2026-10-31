package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class h60 extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.mt f37762a;
    public boolean f37763b;
    public int f37764c;
    public xs d;
    public String e;
    public final g60 f37765f;
    public final k60 h;

    public h60(k60 k60Var, Context context) {
        super(context);
        this.h = k60Var;
        this.f37765f = new g60(this);
        TextView g10 = org.telegram.messenger.m5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(g10, org.telegram.ui.ActionBar.t6.f21037j5, null);
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.mt mtVar = new org.telegram.ui.Components.mt(context, null);
        this.f37762a = mtVar;
        mtVar.setLines(1);
        mtVar.setSingleLine(true);
        mtVar.setInputType(16384);
        mtVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(mtVar, org.telegram.ui.ActionBar.t6.Ie, null);
        org.telegram.ui.ActionBar.a7.H(mtVar, org.telegram.ui.ActionBar.t6.Vc, null);
        org.telegram.ui.ActionBar.a7.D(mtVar, org.telegram.ui.ActionBar.t6.f21028ig, null);
        int i10 = org.telegram.ui.ActionBar.t6.Je;
        org.telegram.ui.ActionBar.a7.m(mtVar, 34, i10, null);
        org.telegram.ui.ActionBar.a7.E(mtVar, i10, null);
        org.telegram.ui.ActionBar.a7.m(mtVar, 30, org.telegram.ui.ActionBar.t6.Ke, null);
        org.telegram.ui.ActionBar.a7.m(mtVar, 36, org.telegram.ui.ActionBar.t6.f21048jg, null);
        mtVar.setBackground(null);
        mtVar.setHint(org.telegram.messenger.cd.L0(2131754433, null));
        addView(g10, w7.b6.t(-2, -2, 16, 20, 0, 0, 0));
        addView(mtVar, w7.b6.t(-1, -2, 16, -4, 0, 0, 0));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, this, null);
        setPadding(0, org.telegram.messenger.i0.L(5.0f), 0, org.telegram.messenger.i0.L(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37763b) {
            canvas.drawLine(org.telegram.messenger.i0.L(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.mt mtVar = this.f37762a;
        try {
            mtVar.setHintColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Je, false));
            mtVar.setCursorColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ke, false));
            mtVar.setHandlesColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21048jg, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
