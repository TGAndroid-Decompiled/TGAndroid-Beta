package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ja;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.y50;
public final class f3 extends FrameLayout {
    public final m1 f40612a;
    public e3 f40613b;
    public int f40614c;
    public final TextView d;
    public final TextView f40615e;
    public int f40616f;

    public f3(Activity activity, m1 m1Var) {
        super(activity);
        this.f40612a = m1Var;
        setWillNotDraw(true);
        e3 e3Var = new e3(activity, m1Var);
        this.f40613b = e3Var;
        addView(e3Var, ja.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, ja.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.f40615e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, ja.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i7) {
        this.f40613b.f40592a = new ch0(2131623946, i7, i7, true, null);
        this.f40613b.f40593b = new ch0(2131623946, i7, i7, true, null);
        this.f40613b.f40593b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i7, int i10, int i11, boolean z10) {
        e3 e3Var = new e3(getContext(), this.f40612a);
        if (i7 == 2131623963) {
            ch0 ch0Var = new ch0(i7, i10, i10, true, null);
            e3Var.f40594c = ch0Var;
            ch0Var.R(e3Var);
        } else {
            e3Var.f40592a = new ch0(i7, i10, i10, true, null);
            ch0 ch0Var2 = new ch0(i7, i10, i10, true, null);
            e3Var.f40593b = ch0Var2;
            ch0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        e3Var.a(i11, z10, false);
        e3Var.setAlpha(0.0f);
        e3Var.setOnBtnClickedListener(this.f40613b.f40602y);
        addView(e3Var, ja.a(53.5f, 53.5f, 1));
        e3 e3Var2 = this.f40613b;
        this.f40613b = e3Var;
        e3Var.animate().alpha(1.0f).setDuration(250L).start();
        e3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new y50(7, this, e3Var2)).start();
    }

    public final void c(int i7) {
        this.f40613b.f40592a = new ch0(2131624206, i7, i7, true, null);
        this.f40613b.f40593b = new ch0(2131624206, i7, i7, true, null);
        this.f40613b.f40593b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.f3.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(d3 d3Var) {
        this.f40613b.setOnBtnClickedListener(d3Var);
    }
}
