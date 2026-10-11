package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.vh;
import org.telegram.ui.xh;
public final class s0 {
    public final int f21468a;
    public int f21469b;
    public int f21470c;
    public Drawable d;
    public CharSequence f21471e;
    public boolean f21472f;
    public View f21473g;
    public xh h;
    public int f21474i;
    public View f21475j;
    public vh f21476k;
    public int f21477l = 0;
    public int f21478m = 0;
    public Integer f21479n;
    public Integer f21480o;

    public s0(int i10) {
        this.f21468a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21479n;
        if (num == null || this.f21480o == null || num.intValue() != i10 || this.f21480o.intValue() != i11) {
            this.f21479n = Integer.valueOf(i10);
            this.f21480o = Integer.valueOf(i11);
            View view = this.f21475j;
            if (view instanceof e1) {
                ((e1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21470c) {
            this.f21470c = i10;
            View view = this.f21475j;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(vh vhVar) {
        this.f21476k = vhVar;
        View view = this.f21475j;
        if (view != null) {
            view.setOnClickListener(vhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f21471e = charSequence;
        View view = this.f21475j;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21477l = i10;
        View view = this.f21475j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
