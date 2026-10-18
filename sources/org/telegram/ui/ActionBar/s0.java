package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.oh;
import org.telegram.ui.qh;
public final class s0 {
    public final int f21696a;
    public int f21697b;
    public int f21698c;
    public Drawable d;
    public CharSequence e;
    public boolean f21699f;
    public View f21700g;
    public qh h;
    public int f21701i;
    public View f21702j;
    public oh f21703k;
    public int f21704l = 0;
    public int f21705m = 0;
    public Integer f21706n;
    public Integer f21707o;

    public s0(int i10) {
        this.f21696a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21706n;
        if (num == null || this.f21707o == null || num.intValue() != i10 || this.f21707o.intValue() != i11) {
            this.f21706n = Integer.valueOf(i10);
            this.f21707o = Integer.valueOf(i11);
            View view = this.f21702j;
            if (view instanceof e1) {
                ((e1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21698c) {
            this.f21698c = i10;
            View view = this.f21702j;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(oh ohVar) {
        this.f21703k = ohVar;
        View view = this.f21702j;
        if (view != null) {
            view.setOnClickListener(ohVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f21702j;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21704l = i10;
        View view = this.f21702j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
