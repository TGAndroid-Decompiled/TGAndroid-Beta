package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.na;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.nh0;
public final class f3 extends FrameLayout {
    public final m1 f40888a;
    public e3 f40889b;
    public int f40890c;
    public final TextView d;
    public final TextView f40891e;
    public int f40892f;

    public f3(Activity activity, m1 m1Var) {
        super(activity);
        this.f40888a = m1Var;
        setWillNotDraw(true);
        e3 e3Var = new e3(activity, m1Var);
        this.f40889b = e3Var;
        addView(e3Var, na.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, na.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.f40891e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, na.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i7) {
        this.f40889b.f40868a = new nh0(2131623946, i7, i7, true, null);
        this.f40889b.f40869b = new nh0(2131623946, i7, i7, true, null);
        this.f40889b.f40869b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i7, int i10, int i11, boolean z10) {
        e3 e3Var = new e3(getContext(), this.f40888a);
        if (i7 == 2131623963) {
            nh0 nh0Var = new nh0(i7, i10, i10, true, null);
            e3Var.f40870c = nh0Var;
            nh0Var.R(e3Var);
        } else {
            e3Var.f40868a = new nh0(i7, i10, i10, true, null);
            nh0 nh0Var2 = new nh0(i7, i10, i10, true, null);
            e3Var.f40869b = nh0Var2;
            nh0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        e3Var.a(i11, z10, false);
        e3Var.setAlpha(0.0f);
        e3Var.setOnBtnClickedListener(this.f40889b.f40878y);
        addView(e3Var, na.a(53.5f, 53.5f, 1));
        e3 e3Var2 = this.f40889b;
        this.f40889b = e3Var;
        e3Var.animate().alpha(1.0f).setDuration(250L).start();
        e3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new f10(8, this, e3Var2)).start();
    }

    public final void c(int i7) {
        this.f40889b.f40868a = new nh0(2131624206, i7, i7, true, null);
        this.f40889b.f40869b = new nh0(2131624206, i7, i7, true, null);
        this.f40889b.f40869b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.f3.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(d3 d3Var) {
        this.f40889b.setOnBtnClickedListener(d3Var);
    }
}
