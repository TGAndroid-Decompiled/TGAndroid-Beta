package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ch;
import org.telegram.ui.eh;
public final class p0 {
    public final int f29845a;
    public int f29846b;
    public int f29847c;
    public Drawable d;
    public CharSequence f29848e;
    public boolean f29849f;
    public View f29850g;
    public eh h;
    public int f29851i;
    public View f29852j;
    public ch f29853k;
    public int f29854l = 0;
    public int f29855m = 0;
    public Integer f29856n;
    public Integer f29857o;

    public p0(int i7) {
        this.f29845a = i7;
    }

    public final void a(int i7, int i10) {
        Integer num = this.f29856n;
        if (num == null || this.f29857o == null || num.intValue() != i7 || this.f29857o.intValue() != i10) {
            this.f29856n = Integer.valueOf(i7);
            this.f29857o = Integer.valueOf(i10);
            View view = this.f29852j;
            if (view instanceof z0) {
                ((z0) view).d(i7, i10);
            }
        }
    }

    public final void b(int i7) {
        if (i7 != this.f29847c) {
            this.f29847c = i7;
            View view = this.f29852j;
            if (view instanceof z0) {
                ((z0) view).setIcon(i7);
            }
        }
    }

    public final void c(ch chVar) {
        this.f29853k = chVar;
        View view = this.f29852j;
        if (view != null) {
            view.setOnClickListener(chVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f29848e = charSequence;
        View view = this.f29852j;
        if (view instanceof z0) {
            ((z0) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i7) {
        this.f29854l = i7;
        View view = this.f29852j;
        if (view != null) {
            view.setVisibility(i7);
        }
    }
}
