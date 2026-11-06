package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class j50 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Components.ys f46842a;
    public boolean f46843b;
    public int f46844c;
    public q10 d;
    public String f46845e;
    public final i50 f46846f;
    public final m50 h;

    public j50(m50 m50Var, Context context) {
        super(context);
        this.h = m50Var;
        this.f46846f = new i50(this);
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(g10, org.telegram.ui.ActionBar.k6.f27957j5, null);
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.ys ysVar = new org.telegram.ui.Components.ys(context, null);
        this.f46842a = ysVar;
        ysVar.setLines(1);
        ysVar.setSingleLine(true);
        ysVar.setInputType(16384);
        ysVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(ysVar, org.telegram.ui.ActionBar.k6.Ie, null);
        org.telegram.ui.ActionBar.r6.H(ysVar, org.telegram.ui.ActionBar.k6.Vc, null);
        org.telegram.ui.ActionBar.r6.D(ysVar, org.telegram.ui.ActionBar.k6.f27949ig, null);
        int i7 = org.telegram.ui.ActionBar.k6.Je;
        org.telegram.ui.ActionBar.r6.m(ysVar, 34, i7, null);
        org.telegram.ui.ActionBar.r6.E(ysVar, i7, null);
        org.telegram.ui.ActionBar.r6.m(ysVar, 30, org.telegram.ui.ActionBar.k6.Ke, null);
        org.telegram.ui.ActionBar.r6.m(ysVar, 36, org.telegram.ui.ActionBar.k6.f27968jg, null);
        ysVar.setBackground(null);
        ysVar.setHint(org.telegram.messenger.hd.M0(2131754433, null));
        addView(g10, c8.ha.t(-2, -2, 16, 20, 0, 0, 0));
        addView(ysVar, c8.ha.t(-1, -2, 16, -4, 0, 0, 0));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, this, null);
        setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f46843b) {
            canvas.drawLine(org.telegram.messenger.g0.L(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.f27972k0);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.ys ysVar = this.f46842a;
        try {
            ysVar.setHintColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Je, false));
            ysVar.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ke, false));
            ysVar.setHandlesColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27968jg, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
