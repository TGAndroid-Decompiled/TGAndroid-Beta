package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.uh;
public final class t0 {
    public final int f19501a;
    public int f19502b;
    public int f19503c;
    public Drawable d;
    public CharSequence e;
    public boolean f19504f;
    public View f19505g;
    public int h;
    public View f19506i;
    public uh f19507j;
    public int f19508k = 0;
    public int f19509l = 0;
    public Integer f19510m;
    public Integer f19511n;

    public t0(int i10) {
        this.f19501a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f19510m;
        if (num == null || this.f19511n == null || num.intValue() != i10 || this.f19511n.intValue() != i11) {
            this.f19510m = Integer.valueOf(i10);
            this.f19511n = Integer.valueOf(i11);
            View view = this.f19506i;
            if (view instanceof f1) {
                ((f1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f19503c) {
            this.f19503c = i10;
            View view = this.f19506i;
            if (view instanceof f1) {
                ((f1) view).setIcon(i10);
            }
        }
    }

    public final void c(uh uhVar) {
        this.f19507j = uhVar;
        View view = this.f19506i;
        if (view != null) {
            view.setOnClickListener(uhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f19506i;
        if (view instanceof f1) {
            ((f1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f19508k = i10;
        View view = this.f19506i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
