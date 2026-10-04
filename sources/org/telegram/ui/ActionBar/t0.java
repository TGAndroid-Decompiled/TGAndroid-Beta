package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.vh;
public final class t0 {
    public final int f21509a;
    public int f21510b;
    public int f21511c;
    public Drawable d;
    public CharSequence f21512e;
    public boolean f21513f;
    public View f21514g;
    public int h;
    public View f21515i;
    public vh f21516j;
    public int f21517k = 0;
    public int f21518l = 0;
    public Integer f21519m;
    public Integer f21520n;

    public t0(int i10) {
        this.f21509a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21519m;
        if (num == null || this.f21520n == null || num.intValue() != i10 || this.f21520n.intValue() != i11) {
            this.f21519m = Integer.valueOf(i10);
            this.f21520n = Integer.valueOf(i11);
            View view = this.f21515i;
            if (view instanceof f1) {
                ((f1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21511c) {
            this.f21511c = i10;
            View view = this.f21515i;
            if (view instanceof f1) {
                ((f1) view).setIcon(i10);
            }
        }
    }

    public final void c(vh vhVar) {
        this.f21516j = vhVar;
        View view = this.f21515i;
        if (view != null) {
            view.setOnClickListener(vhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f21512e = charSequence;
        View view = this.f21515i;
        if (view instanceof f1) {
            ((f1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21517k = i10;
        View view = this.f21515i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
