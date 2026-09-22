package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.xh;
public final class t0 {
    public final int f19534a;
    public int f19535b;
    public int f19536c;
    public Drawable d;
    public CharSequence e;
    public boolean f19537f;
    public View f19538g;
    public int h;
    public View f19539i;
    public xh f19540j;
    public int f19541k = 0;
    public int f19542l = 0;
    public Integer f19543m;
    public Integer f19544n;

    public t0(int i10) {
        this.f19534a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f19543m;
        if (num == null || this.f19544n == null || num.intValue() != i10 || this.f19544n.intValue() != i11) {
            this.f19543m = Integer.valueOf(i10);
            this.f19544n = Integer.valueOf(i11);
            View view = this.f19539i;
            if (view instanceof f1) {
                ((f1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f19536c) {
            this.f19536c = i10;
            View view = this.f19539i;
            if (view instanceof f1) {
                ((f1) view).setIcon(i10);
            }
        }
    }

    public final void c(xh xhVar) {
        this.f19540j = xhVar;
        View view = this.f19539i;
        if (view != null) {
            view.setOnClickListener(xhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f19539i;
        if (view instanceof f1) {
            ((f1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f19541k = i10;
        View view = this.f19539i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
