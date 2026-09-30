package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.uh;
public final class s0 {
    public final int f19745a;
    public int f19746b;
    public int f19747c;
    public Drawable d;
    public CharSequence e;
    public boolean f19748f;
    public View f19749g;
    public int h;
    public View f19750i;
    public uh f19751j;
    public int f19752k = 0;
    public int f19753l = 0;
    public Integer f19754m;
    public Integer f19755n;

    public s0(int i10) {
        this.f19745a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f19754m;
        if (num == null || this.f19755n == null || num.intValue() != i10 || this.f19755n.intValue() != i11) {
            this.f19754m = Integer.valueOf(i10);
            this.f19755n = Integer.valueOf(i11);
            View view = this.f19750i;
            if (view instanceof e1) {
                ((e1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f19747c) {
            this.f19747c = i10;
            View view = this.f19750i;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(uh uhVar) {
        this.f19751j = uhVar;
        View view = this.f19750i;
        if (view != null) {
            view.setOnClickListener(uhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f19750i;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f19752k = i10;
        View view = this.f19750i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
