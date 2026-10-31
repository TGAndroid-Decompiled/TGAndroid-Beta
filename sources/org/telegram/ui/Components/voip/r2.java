package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.iw0;
import w7.b6;
public final class r2 extends FrameLayout {
    public final x0 f31637a;
    public q2 f31638b;
    public int f31639c;
    public final TextView d;
    public final TextView e;
    public int f31640f;

    public r2(Activity activity, x0 x0Var) {
        super(activity);
        this.f31637a = x0Var;
        setWillNotDraw(true);
        q2 q2Var = new q2(activity, x0Var);
        this.f31638b = q2Var;
        addView(q2Var, b6.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, b6.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, b6.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i10) {
        this.f31638b.f31590a = new bi0(2131623946, i10, i10, true, null);
        this.f31638b.f31591b = new bi0(2131623946, i10, i10, true, null);
        this.f31638b.f31591b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        q2 q2Var = new q2(getContext(), this.f31637a);
        if (i10 == 2131623963) {
            bi0 bi0Var = new bi0(i10, i11, i11, true, null);
            q2Var.f31592c = bi0Var;
            bi0Var.R(q2Var);
        } else {
            q2Var.f31590a = new bi0(i10, i11, i11, true, null);
            bi0 bi0Var2 = new bi0(i10, i11, i11, true, null);
            q2Var.f31591b = bi0Var2;
            bi0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        q2Var.a(i12, z10, false);
        q2Var.setAlpha(0.0f);
        q2Var.setOnBtnClickedListener(this.f31638b.f31599y);
        addView(q2Var, b6.a(53.5f, 53.5f, 1));
        q2 q2Var2 = this.f31638b;
        this.f31638b = q2Var;
        q2Var.animate().alpha(1.0f).setDuration(250L).start();
        q2Var2.animate().alpha(0.0f).setDuration(250L).setListener(new iw0(2, (Object) this, (Object) q2Var2)).start();
    }

    public final void c(int i10) {
        this.f31638b.f31590a = new bi0(2131624203, i10, i10, true, null);
        this.f31638b.f31591b = new bi0(2131624203, i10, i10, true, null);
        this.f31638b.f31591b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.r2.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(p2 p2Var) {
        this.f31638b.setOnBtnClickedListener(p2Var);
    }
}
