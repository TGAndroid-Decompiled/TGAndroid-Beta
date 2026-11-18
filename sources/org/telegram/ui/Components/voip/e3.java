package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.mh0;
public final class e3 extends FrameLayout {
    public final l1 f40856a;
    public d3 f40857b;
    public int f40858c;
    public final TextView d;
    public final TextView f40859e;
    public int f40860f;

    public e3(Activity activity, l1 l1Var) {
        super(activity);
        this.f40856a = l1Var;
        setWillNotDraw(true);
        d3 d3Var = new d3(activity, l1Var);
        this.f40857b = d3Var;
        addView(d3Var, ma.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, ma.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.f40859e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, ma.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i7) {
        this.f40857b.f40825a = new mh0(2131623946, i7, i7, true, null);
        this.f40857b.f40826b = new mh0(2131623946, i7, i7, true, null);
        this.f40857b.f40826b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i7, int i10, int i11, boolean z10) {
        d3 d3Var = new d3(getContext(), this.f40856a);
        if (i7 == 2131623963) {
            mh0 mh0Var = new mh0(i7, i10, i10, true, null);
            d3Var.f40827c = mh0Var;
            mh0Var.R(d3Var);
        } else {
            d3Var.f40825a = new mh0(i7, i10, i10, true, null);
            mh0 mh0Var2 = new mh0(i7, i10, i10, true, null);
            d3Var.f40826b = mh0Var2;
            mh0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        d3Var.a(i11, z10, false);
        d3Var.setAlpha(0.0f);
        d3Var.setOnBtnClickedListener(this.f40857b.f40835y);
        addView(d3Var, ma.a(53.5f, 53.5f, 1));
        d3 d3Var2 = this.f40857b;
        this.f40857b = d3Var;
        d3Var.animate().alpha(1.0f).setDuration(250L).start();
        d3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new h60(7, this, d3Var2)).start();
    }

    public final void c(int i7) {
        this.f40857b.f40825a = new mh0(2131624206, i7, i7, true, null);
        this.f40857b.f40826b = new mh0(2131624206, i7, i7, true, null);
        this.f40857b.f40826b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.e3.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(c3 c3Var) {
        this.f40857b.setOnBtnClickedListener(c3Var);
    }
}
