package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class g60 extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.mt f37359a;
    public boolean f37360b;
    public int f37361c;
    public org.telegram.ui.Components.voip.u d;
    public String e;
    public final f60 f37362f;
    public final j60 h;

    public g60(j60 j60Var, Context context) {
        super(context);
        this.h = j60Var;
        this.f37362f = new f60(this);
        TextView g10 = org.telegram.messenger.m5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(g10, org.telegram.ui.ActionBar.t6.f21038j5, null);
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.mt mtVar = new org.telegram.ui.Components.mt(context, null);
        this.f37359a = mtVar;
        mtVar.setLines(1);
        mtVar.setSingleLine(true);
        mtVar.setInputType(16384);
        mtVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(mtVar, org.telegram.ui.ActionBar.t6.Ie, null);
        org.telegram.ui.ActionBar.a7.H(mtVar, org.telegram.ui.ActionBar.t6.Vc, null);
        org.telegram.ui.ActionBar.a7.D(mtVar, org.telegram.ui.ActionBar.t6.f21029ig, null);
        int i10 = org.telegram.ui.ActionBar.t6.Je;
        org.telegram.ui.ActionBar.a7.m(mtVar, 34, i10, null);
        org.telegram.ui.ActionBar.a7.E(mtVar, i10, null);
        org.telegram.ui.ActionBar.a7.m(mtVar, 30, org.telegram.ui.ActionBar.t6.Ke, null);
        org.telegram.ui.ActionBar.a7.m(mtVar, 36, org.telegram.ui.ActionBar.t6.f21049jg, null);
        mtVar.setBackground(null);
        mtVar.setHint(org.telegram.messenger.dd.L0(2131754433, null));
        addView(g10, w7.b6.t(-2, -2, 16, 20, 0, 0, 0));
        addView(mtVar, w7.b6.t(-1, -2, 16, -4, 0, 0, 0));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, this, null);
        setPadding(0, org.telegram.messenger.i0.L(5.0f), 0, org.telegram.messenger.i0.L(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37360b) {
            canvas.drawLine(org.telegram.messenger.i0.L(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.mt mtVar = this.f37359a;
        try {
            mtVar.setHintColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Je, false));
            mtVar.setCursorColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ke, false));
            mtVar.setHandlesColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21049jg, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
