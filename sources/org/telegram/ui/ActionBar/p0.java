package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ch;
import org.telegram.ui.eh;
public final class p0 {
    public final int f29847a;
    public int f29848b;
    public int f29849c;
    public Drawable d;
    public CharSequence f29850e;
    public boolean f29851f;
    public View f29852g;
    public eh h;
    public int f29853i;
    public View f29854j;
    public ch f29855k;
    public int f29856l = 0;
    public int f29857m = 0;
    public Integer f29858n;
    public Integer f29859o;

    public p0(int i7) {
        this.f29847a = i7;
    }

    public final void a(int i7, int i10) {
        Integer num = this.f29858n;
        if (num == null || this.f29859o == null || num.intValue() != i7 || this.f29859o.intValue() != i10) {
            this.f29858n = Integer.valueOf(i7);
            this.f29859o = Integer.valueOf(i10);
            View view = this.f29854j;
            if (view instanceof z0) {
                ((z0) view).d(i7, i10);
            }
        }
    }

    public final void b(int i7) {
        if (i7 != this.f29849c) {
            this.f29849c = i7;
            View view = this.f29854j;
            if (view instanceof z0) {
                ((z0) view).setIcon(i7);
            }
        }
    }

    public final void c(ch chVar) {
        this.f29855k = chVar;
        View view = this.f29854j;
        if (view != null) {
            view.setOnClickListener(chVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f29850e = charSequence;
        View view = this.f29854j;
        if (view instanceof z0) {
            ((z0) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i7) {
        this.f29856l = i7;
        View view = this.f29854j;
        if (view != null) {
            view.setVisibility(i7);
        }
    }
}
