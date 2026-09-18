package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.yh;
public final class t0 {
    public final int f19725a;
    public int f19726b;
    public int f19727c;
    public Drawable d;
    public CharSequence e;
    public boolean f19728f;
    public View f19729g;
    public int h;
    public View f19730i;
    public yh f19731j;
    public int f19732k = 0;
    public int f19733l = 0;
    public Integer f19734m;
    public Integer f19735n;

    public t0(int i10) {
        this.f19725a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f19734m;
        if (num == null || this.f19735n == null || num.intValue() != i10 || this.f19735n.intValue() != i11) {
            this.f19734m = Integer.valueOf(i10);
            this.f19735n = Integer.valueOf(i11);
            View view = this.f19730i;
            if (view instanceof f1) {
                ((f1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f19727c) {
            this.f19727c = i10;
            View view = this.f19730i;
            if (view instanceof f1) {
                ((f1) view).setIcon(i10);
            }
        }
    }

    public final void c(yh yhVar) {
        this.f19731j = yhVar;
        View view = this.f19730i;
        if (view != null) {
            view.setOnClickListener(yhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f19730i;
        if (view instanceof f1) {
            ((f1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f19732k = i10;
        View view = this.f19730i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
