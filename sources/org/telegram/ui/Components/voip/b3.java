package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.w50;
public final class b3 extends FrameLayout {
    public final i1 f39203a;
    public a3 f39204b;
    public int f39205c;
    public final TextView d;
    public final TextView f39206e;
    public int f39207f;

    public b3(Activity activity, i1 i1Var) {
        super(activity);
        this.f39203a = i1Var;
        setWillNotDraw(true);
        a3 a3Var = new a3(activity, i1Var);
        this.f39204b = a3Var;
        addView(a3Var, ha.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, ha.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.f39206e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, ha.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i7) {
        this.f39204b.f39186a = new ah0(2131623946, i7, i7, true, null);
        this.f39204b.f39187b = new ah0(2131623946, i7, i7, true, null);
        this.f39204b.f39187b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i7, int i10, int i11, boolean z9) {
        a3 a3Var = new a3(getContext(), this.f39203a);
        if (i7 == 2131623963) {
            ah0 ah0Var = new ah0(i7, i10, i10, true, null);
            a3Var.f39188c = ah0Var;
            ah0Var.R(a3Var);
        } else {
            a3Var.f39186a = new ah0(i7, i10, i10, true, null);
            ah0 ah0Var2 = new ah0(i7, i10, i10, true, null);
            a3Var.f39187b = ah0Var2;
            ah0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        a3Var.a(i11, z9, false);
        a3Var.setAlpha(0.0f);
        a3Var.setOnBtnClickedListener(this.f39204b.f39196y);
        addView(a3Var, ha.a(53.5f, 53.5f, 1));
        a3 a3Var2 = this.f39204b;
        this.f39204b = a3Var;
        a3Var.animate().alpha(1.0f).setDuration(250L).start();
        a3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new w50(7, this, a3Var2)).start();
    }

    public final void c(int i7) {
        this.f39204b.f39186a = new ah0(2131624205, i7, i7, true, null);
        this.f39204b.f39187b = new ah0(2131624205, i7, i7, true, null);
        this.f39204b.f39187b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.b3.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(z2 z2Var) {
        this.f39204b.setOnBtnClickedListener(z2Var);
    }
}
