package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ch;
import org.telegram.ui.eh;
public final class o0 {
    public final int f29422a;
    public int f29423b;
    public int f29424c;
    public Drawable d;
    public CharSequence f29425e;
    public boolean f29426f;
    public View f29427g;
    public eh h;
    public int f29428i;
    public View f29429j;
    public ch f29430k;
    public int f29431l = 0;
    public int f29432m = 0;
    public Integer f29433n;
    public Integer f29434o;

    public o0(int i7) {
        this.f29422a = i7;
    }

    public final void a(int i7, int i10) {
        Integer num = this.f29433n;
        if (num == null || this.f29434o == null || num.intValue() != i7 || this.f29434o.intValue() != i10) {
            this.f29433n = Integer.valueOf(i7);
            this.f29434o = Integer.valueOf(i10);
            View view = this.f29429j;
            if (view instanceof z0) {
                ((z0) view).d(i7, i10);
            }
        }
    }

    public final void b(int i7) {
        if (i7 != this.f29424c) {
            this.f29424c = i7;
            View view = this.f29429j;
            if (view instanceof z0) {
                ((z0) view).setIcon(i7);
            }
        }
    }

    public final void c(ch chVar) {
        this.f29430k = chVar;
        View view = this.f29429j;
        if (view != null) {
            view.setOnClickListener(chVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f29425e = charSequence;
        View view = this.f29429j;
        if (view instanceof z0) {
            ((z0) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i7) {
        this.f29431l = i7;
        View view = this.f29429j;
        if (view != null) {
            view.setVisibility(i7);
        }
    }
}
