package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ri0;
public final class q2 extends FrameLayout {
    public final x0 f39541a;
    public p2 f39542b;
    public int f39543c;
    public final TextView d;
    public final TextView f39544e;
    public int f39545f;

    public q2(Activity activity, x0 x0Var) {
        super(activity);
        this.f39541a = x0Var;
        setWillNotDraw(true);
        p2 p2Var = new p2(activity, x0Var);
        this.f39542b = p2Var;
        addView(p2Var, mf.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, mf.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.f39544e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, mf.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i3) {
        this.f39542b.f39516a = new ch0(2131623946, i3, i3, true, null);
        this.f39542b.f39517b = new ch0(2131623946, i3, i3, true, null);
        this.f39542b.f39517b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i3, int i10, int i11, boolean z10) {
        p2 p2Var = new p2(getContext(), this.f39541a);
        if (i3 == 2131623963) {
            ch0 ch0Var = new ch0(i3, i10, i10, true, null);
            p2Var.f39518c = ch0Var;
            ch0Var.R(p2Var);
        } else {
            p2Var.f39516a = new ch0(i3, i10, i10, true, null);
            ch0 ch0Var2 = new ch0(i3, i10, i10, true, null);
            p2Var.f39517b = ch0Var2;
            ch0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        p2Var.a(i11, z10, false);
        p2Var.setAlpha(0.0f);
        p2Var.setOnBtnClickedListener(this.f39542b.f39526y);
        addView(p2Var, mf.a(53.5f, 53.5f, 1));
        p2 p2Var2 = this.f39542b;
        this.f39542b = p2Var;
        p2Var.animate().alpha(1.0f).setDuration(250L).start();
        p2Var2.animate().alpha(0.0f).setDuration(250L).setListener(new ri0(6, this, p2Var2)).start();
    }

    public final void c(int i3) {
        this.f39542b.f39516a = new ch0(2131624205, i3, i3, true, null);
        this.f39542b.f39517b = new ch0(2131624205, i3, i3, true, null);
        this.f39542b.f39517b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r18, boolean r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.q2.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(o2 o2Var) {
        this.f39542b.setOnBtnClickedListener(o2Var);
    }
}
