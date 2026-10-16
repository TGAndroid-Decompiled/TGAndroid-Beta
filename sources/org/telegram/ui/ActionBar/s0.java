package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.bi;
import org.telegram.ui.zh;
public final class s0 {
    public final int f20314a;
    public int f20315b;
    public int f20316c;
    public Drawable d;
    public CharSequence e;
    public boolean f20317f;
    public View f20318g;
    public bi h;
    public int f20319i;
    public View f20320j;
    public zh f20321k;
    public int f20322l = 0;
    public int f20323m = 0;
    public Integer f20324n;
    public Integer f20325o;

    public s0(int i10) {
        this.f20314a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f20324n;
        if (num == null || this.f20325o == null || num.intValue() != i10 || this.f20325o.intValue() != i11) {
            this.f20324n = Integer.valueOf(i10);
            this.f20325o = Integer.valueOf(i11);
            View view = this.f20320j;
            if (view instanceof e1) {
                ((e1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f20316c) {
            this.f20316c = i10;
            View view = this.f20320j;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(zh zhVar) {
        this.f20321k = zhVar;
        View view = this.f20320j;
        if (view != null) {
            view.setOnClickListener(zhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f20320j;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f20322l = i10;
        View view = this.f20320j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
