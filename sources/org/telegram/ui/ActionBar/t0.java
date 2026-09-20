package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.yh;
public final class t0 {
    public final int f19757a;
    public int f19758b;
    public int f19759c;
    public Drawable d;
    public CharSequence e;
    public boolean f19760f;
    public View f19761g;
    public int h;
    public View f19762i;
    public yh f19763j;
    public int f19764k = 0;
    public int f19765l = 0;
    public Integer f19766m;
    public Integer f19767n;

    public t0(int i10) {
        this.f19757a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f19766m;
        if (num == null || this.f19767n == null || num.intValue() != i10 || this.f19767n.intValue() != i11) {
            this.f19766m = Integer.valueOf(i10);
            this.f19767n = Integer.valueOf(i11);
            View view = this.f19762i;
            if (view instanceof f1) {
                ((f1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f19759c) {
            this.f19759c = i10;
            View view = this.f19762i;
            if (view instanceof f1) {
                ((f1) view).setIcon(i10);
            }
        }
    }

    public final void c(yh yhVar) {
        this.f19763j = yhVar;
        View view = this.f19762i;
        if (view != null) {
            view.setOnClickListener(yhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f19762i;
        if (view instanceof f1) {
            ((f1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f19764k = i10;
        View view = this.f19762i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
