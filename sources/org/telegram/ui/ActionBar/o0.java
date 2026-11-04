package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ah;
import org.telegram.ui.yg;
public final class o0 {
    public final int f28364a;
    public int f28365b;
    public int f28366c;
    public Drawable d;
    public CharSequence f28367e;
    public boolean f28368f;
    public View f28369g;
    public ah h;
    public int f28370i;
    public View f28371j;
    public yg f28372k;
    public int f28373l = 0;
    public int f28374m = 0;
    public Integer f28375n;
    public Integer f28376o;

    public o0(int i3) {
        this.f28364a = i3;
    }

    public final void a(int i3, int i10) {
        Integer num = this.f28375n;
        if (num == null || this.f28376o == null || num.intValue() != i3 || this.f28376o.intValue() != i10) {
            this.f28375n = Integer.valueOf(i3);
            this.f28376o = Integer.valueOf(i10);
            View view = this.f28371j;
            if (view instanceof y0) {
                ((y0) view).d(i3, i10);
            }
        }
    }

    public final void b(int i3) {
        if (i3 != this.f28366c) {
            this.f28366c = i3;
            View view = this.f28371j;
            if (view instanceof y0) {
                ((y0) view).setIcon(i3);
            }
        }
    }

    public final void c(yg ygVar) {
        this.f28372k = ygVar;
        View view = this.f28371j;
        if (view != null) {
            view.setOnClickListener(ygVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f28367e = charSequence;
        View view = this.f28371j;
        if (view instanceof y0) {
            ((y0) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i3) {
        this.f28373l = i3;
        View view = this.f28371j;
        if (view != null) {
            view.setVisibility(i3);
        }
    }
}
