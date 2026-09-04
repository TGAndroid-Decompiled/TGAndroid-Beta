package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.xh;
public final class t0 {
    public final int f21334a;
    public int f21335b;
    public int f21336c;
    public Drawable d;
    public CharSequence f21337e;
    public boolean f21338f;
    public View f21339g;
    public int h;
    public View f21340i;
    public xh f21341j;
    public int f21342k = 0;
    public int f21343l = 0;
    public Integer f21344m;
    public Integer f21345n;

    public t0(int i10) {
        this.f21334a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21344m;
        if (num == null || this.f21345n == null || num.intValue() != i10 || this.f21345n.intValue() != i11) {
            this.f21344m = Integer.valueOf(i10);
            this.f21345n = Integer.valueOf(i11);
            View view = this.f21340i;
            if (view instanceof f1) {
                ((f1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21336c) {
            this.f21336c = i10;
            View view = this.f21340i;
            if (view instanceof f1) {
                ((f1) view).setIcon(i10);
            }
        }
    }

    public final void c(xh xhVar) {
        this.f21341j = xhVar;
        View view = this.f21340i;
        if (view != null) {
            view.setOnClickListener(xhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f21337e = charSequence;
        View view = this.f21340i;
        if (view instanceof f1) {
            ((f1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21342k = i10;
        View view = this.f21340i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
