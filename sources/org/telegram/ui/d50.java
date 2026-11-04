package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class d50 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.xs f44562a;
    public boolean f44563b;
    public int f44564c;
    public ly d;
    public String f44565e;
    public final c50 f44566f;
    public final g50 h;

    public d50(g50 g50Var, Context context) {
        super(context);
        this.h = g50Var;
        this.f44566f = new c50(this);
        TextView g7 = org.telegram.messenger.k5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(g7, org.telegram.ui.ActionBar.k6.f27988j5, null);
        g7.setText("t.me/addemoji/");
        org.telegram.ui.Components.xs xsVar = new org.telegram.ui.Components.xs(context, null);
        this.f44562a = xsVar;
        xsVar.setLines(1);
        xsVar.setSingleLine(true);
        xsVar.setInputType(16384);
        xsVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(xsVar, org.telegram.ui.ActionBar.k6.Ie, null);
        org.telegram.ui.ActionBar.r6.H(xsVar, org.telegram.ui.ActionBar.k6.Vc, null);
        org.telegram.ui.ActionBar.r6.D(xsVar, org.telegram.ui.ActionBar.k6.ig, null);
        int i3 = org.telegram.ui.ActionBar.k6.Je;
        org.telegram.ui.ActionBar.r6.m(xsVar, 34, i3, null);
        org.telegram.ui.ActionBar.r6.E(xsVar, i3, null);
        org.telegram.ui.ActionBar.r6.m(xsVar, 30, org.telegram.ui.ActionBar.k6.Ke, null);
        org.telegram.ui.ActionBar.r6.m(xsVar, 36, org.telegram.ui.ActionBar.k6.f27998jg, null);
        xsVar.setBackground(null);
        xsVar.setHint(org.telegram.messenger.bd.M0(2131754433, null));
        addView(g7, b8.mf.t(-2, -2, 16, 20, 0, 0, 0));
        addView(xsVar, b8.mf.t(-1, -2, 16, -4, 0, 0, 0));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, this, null);
        setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f44563b) {
            canvas.drawLine(org.telegram.messenger.g0.L(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.xs xsVar = this.f44562a;
        try {
            xsVar.setHintColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Je, false));
            xsVar.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ke, false));
            xsVar.setHandlesColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27998jg, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
