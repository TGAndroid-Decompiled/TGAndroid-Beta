package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class j50 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Components.zs f46845a;
    public boolean f46846b;
    public int f46847c;
    public q10 d;
    public String f46848e;
    public final i50 f46849f;
    public final m50 h;

    public j50(m50 m50Var, Context context) {
        super(context);
        this.h = m50Var;
        this.f46849f = new i50(this);
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(g10, org.telegram.ui.ActionBar.k6.f27960j5, null);
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.zs zsVar = new org.telegram.ui.Components.zs(context, null);
        this.f46845a = zsVar;
        zsVar.setLines(1);
        zsVar.setSingleLine(true);
        zsVar.setInputType(16384);
        zsVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(zsVar, org.telegram.ui.ActionBar.k6.Ie, null);
        org.telegram.ui.ActionBar.r6.H(zsVar, org.telegram.ui.ActionBar.k6.Vc, null);
        org.telegram.ui.ActionBar.r6.D(zsVar, org.telegram.ui.ActionBar.k6.f27952ig, null);
        int i7 = org.telegram.ui.ActionBar.k6.Je;
        org.telegram.ui.ActionBar.r6.m(zsVar, 34, i7, null);
        org.telegram.ui.ActionBar.r6.E(zsVar, i7, null);
        org.telegram.ui.ActionBar.r6.m(zsVar, 30, org.telegram.ui.ActionBar.k6.Ke, null);
        org.telegram.ui.ActionBar.r6.m(zsVar, 36, org.telegram.ui.ActionBar.k6.f27971jg, null);
        zsVar.setBackground(null);
        zsVar.setHint(org.telegram.messenger.id.M0(2131754433, null));
        addView(g10, c8.ha.t(-2, -2, 16, 20, 0, 0, 0));
        addView(zsVar, c8.ha.t(-1, -2, 16, -4, 0, 0, 0));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, this, null);
        setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f46846b) {
            canvas.drawLine(org.telegram.messenger.g0.L(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.f27975k0);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.zs zsVar = this.f46845a;
        try {
            zsVar.setHintColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Je, false));
            zsVar.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ke, false));
            zsVar.setHandlesColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27971jg, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
