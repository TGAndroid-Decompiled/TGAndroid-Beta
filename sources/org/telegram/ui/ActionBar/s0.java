package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.bi;
import org.telegram.ui.zh;
public final class s0 {
    public final int f21243a;
    public int f21244b;
    public int f21245c;
    public Drawable d;
    public CharSequence f21246e;
    public boolean f21247f;
    public View f21248g;
    public bi h;
    public int f21249i;
    public View f21250j;
    public zh f21251k;
    public int f21252l = 0;
    public int f21253m = 0;
    public Integer f21254n;
    public Integer f21255o;

    public s0(int i10) {
        this.f21243a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21254n;
        if (num == null || this.f21255o == null || num.intValue() != i10 || this.f21255o.intValue() != i11) {
            this.f21254n = Integer.valueOf(i10);
            this.f21255o = Integer.valueOf(i11);
            View view = this.f21250j;
            if (view instanceof e1) {
                ((e1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21245c) {
            this.f21245c = i10;
            View view = this.f21250j;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(zh zhVar) {
        this.f21251k = zhVar;
        View view = this.f21250j;
        if (view != null) {
            view.setOnClickListener(zhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f21246e = charSequence;
        View view = this.f21250j;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21252l = i10;
        View view = this.f21250j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
