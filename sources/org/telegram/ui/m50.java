package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class m50 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.ys f47792a;
    public boolean f47793b;
    public int f47794c;
    public f10 d;
    public String f47795e;
    public final l50 f47796f;
    public final p50 h;

    public m50(p50 p50Var, Context context) {
        super(context);
        this.h = p50Var;
        this.f47796f = new l50(this);
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.t6.U(g10, org.telegram.ui.ActionBar.m6.f27998j5, null);
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.ys ysVar = new org.telegram.ui.Components.ys(context, null);
        this.f47792a = ysVar;
        ysVar.setLines(1);
        ysVar.setSingleLine(true);
        ysVar.setInputType(16384);
        ysVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.U(ysVar, org.telegram.ui.ActionBar.m6.Ie, null);
        org.telegram.ui.ActionBar.t6.G(ysVar, org.telegram.ui.ActionBar.m6.Vc, null);
        org.telegram.ui.ActionBar.t6.C(ysVar, org.telegram.ui.ActionBar.m6.f27990ig, null);
        int i7 = org.telegram.ui.ActionBar.m6.Je;
        org.telegram.ui.ActionBar.t6.l(ysVar, 34, i7, null);
        org.telegram.ui.ActionBar.t6.D(ysVar, i7, null);
        org.telegram.ui.ActionBar.t6.l(ysVar, 30, org.telegram.ui.ActionBar.m6.Ke, null);
        org.telegram.ui.ActionBar.t6.l(ysVar, 36, org.telegram.ui.ActionBar.m6.f28009jg, null);
        ysVar.setBackground(null);
        ysVar.setHint(org.telegram.messenger.id.M0(2131754433, null));
        addView(g10, c8.ha.t(-2, -2, 16, 20, 0, 0, 0));
        addView(ysVar, c8.ha.t(-1, -2, 16, -4, 0, 0, 0));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, this, null);
        setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f47793b) {
            canvas.drawLine(org.telegram.messenger.g0.L(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.ys ysVar = this.f47792a;
        try {
            ysVar.setHintColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Je, false));
            ysVar.setCursorColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ke, false));
            ysVar.setHandlesColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28009jg, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
