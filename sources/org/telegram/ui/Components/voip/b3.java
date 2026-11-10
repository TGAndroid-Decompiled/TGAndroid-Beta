package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.zg0;
public final class b3 extends FrameLayout {
    public final i1 f39123a;
    public a3 f39124b;
    public int f39125c;
    public final TextView d;
    public final TextView f39126e;
    public int f39127f;

    public b3(Activity activity, i1 i1Var) {
        super(activity);
        this.f39123a = i1Var;
        setWillNotDraw(true);
        a3 a3Var = new a3(activity, i1Var);
        this.f39124b = a3Var;
        addView(a3Var, ha.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, ha.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.f39126e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, ha.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i7) {
        this.f39124b.f39106a = new zg0(2131623946, i7, i7, true, null);
        this.f39124b.f39107b = new zg0(2131623946, i7, i7, true, null);
        this.f39124b.f39107b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i7, int i10, int i11, boolean z9) {
        a3 a3Var = new a3(getContext(), this.f39123a);
        if (i7 == 2131623963) {
            zg0 zg0Var = new zg0(i7, i10, i10, true, null);
            a3Var.f39108c = zg0Var;
            zg0Var.R(a3Var);
        } else {
            a3Var.f39106a = new zg0(i7, i10, i10, true, null);
            zg0 zg0Var2 = new zg0(i7, i10, i10, true, null);
            a3Var.f39107b = zg0Var2;
            zg0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        a3Var.a(i11, z9, false);
        a3Var.setAlpha(0.0f);
        a3Var.setOnBtnClickedListener(this.f39124b.f39116y);
        addView(a3Var, ha.a(53.5f, 53.5f, 1));
        a3 a3Var2 = this.f39124b;
        this.f39124b = a3Var;
        a3Var.animate().alpha(1.0f).setDuration(250L).start();
        a3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new v50(7, this, a3Var2)).start();
    }

    public final void c(int i7) {
        this.f39124b.f39106a = new zg0(2131624205, i7, i7, true, null);
        this.f39124b.f39107b = new zg0(2131624205, i7, i7, true, null);
        this.f39124b.f39107b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.b3.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(z2 z2Var) {
        this.f39124b.setOnBtnClickedListener(z2Var);
    }
}
