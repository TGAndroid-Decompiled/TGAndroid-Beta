package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.jw0;
import w7.b6;
public final class s2 extends FrameLayout {
    public final y0 f31716a;
    public r2 f31717b;
    public int f31718c;
    public final TextView d;
    public final TextView e;
    public int f31719f;

    public s2(Activity activity, y0 y0Var) {
        super(activity);
        this.f31716a = y0Var;
        setWillNotDraw(true);
        r2 r2Var = new r2(activity, y0Var);
        this.f31717b = r2Var;
        addView(r2Var, b6.a(53.5f, 53.5f, 1));
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
        this.f31717b.f31702a = new ci0(2131623946, i10, i10, true, null);
        this.f31717b.f31703b = new ci0(2131623946, i10, i10, true, null);
        this.f31717b.f31703b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        r2 r2Var = new r2(getContext(), this.f31716a);
        if (i10 == 2131623963) {
            ci0 ci0Var = new ci0(i10, i11, i11, true, null);
            r2Var.f31704c = ci0Var;
            ci0Var.R(r2Var);
        } else {
            r2Var.f31702a = new ci0(i10, i11, i11, true, null);
            ci0 ci0Var2 = new ci0(i10, i11, i11, true, null);
            r2Var.f31703b = ci0Var2;
            ci0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        r2Var.a(i12, z10, false);
        r2Var.setAlpha(0.0f);
        r2Var.setOnBtnClickedListener(this.f31717b.f31711y);
        addView(r2Var, b6.a(53.5f, 53.5f, 1));
        r2 r2Var2 = this.f31717b;
        this.f31717b = r2Var;
        r2Var.animate().alpha(1.0f).setDuration(250L).start();
        r2Var2.animate().alpha(0.0f).setDuration(250L).setListener(new jw0(2, (Object) this, (Object) r2Var2)).start();
    }

    public final void c(int i10) {
        this.f31717b.f31702a = new ci0(2131624203, i10, i10, true, null);
        this.f31717b.f31703b = new ci0(2131624203, i10, i10, true, null);
        this.f31717b.f31703b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.s2.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(q2 q2Var) {
        this.f31717b.setOnBtnClickedListener(q2Var);
    }
}
