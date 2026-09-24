package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.uh;
public final class s0 {
    public final int f19714a;
    public int f19715b;
    public int f19716c;
    public Drawable d;
    public CharSequence e;
    public boolean f19717f;
    public View f19718g;
    public int h;
    public View f19719i;
    public uh f19720j;
    public int f19721k = 0;
    public int f19722l = 0;
    public Integer f19723m;
    public Integer f19724n;

    public s0(int i10) {
        this.f19714a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f19723m;
        if (num == null || this.f19724n == null || num.intValue() != i10 || this.f19724n.intValue() != i11) {
            this.f19723m = Integer.valueOf(i10);
            this.f19724n = Integer.valueOf(i11);
            View view = this.f19719i;
            if (view instanceof e1) {
                ((e1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f19716c) {
            this.f19716c = i10;
            View view = this.f19719i;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(uh uhVar) {
        this.f19720j = uhVar;
        View view = this.f19719i;
        if (view != null) {
            view.setOnClickListener(uhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f19719i;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f19721k = i10;
        View view = this.f19719i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
