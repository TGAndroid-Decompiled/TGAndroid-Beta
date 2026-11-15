package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class vb extends ua implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f40371a;
    public Runnable f40372b;
    public Runnable f40373c;
    public xb d;
    public final TextView f40374e;
    public boolean f40375f;
    public final Drawable h;
    public final Drawable f40376n;

    public vb(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        int x02;
        this.f40371a = e6Var;
        int i7 = org.telegram.ui.ActionBar.j6.xj;
        if (e6Var != null) {
            x02 = e6Var.h(i7);
        } else {
            x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        }
        if (z10) {
            TextView textView = new TextView(context);
            this.f40374e = textView;
            textView.setBackground(org.telegram.ui.ActionBar.j6.h0((x02 & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            i5.c.v(textView, 1, 14.0f);
            org.telegram.messenger.i20.q(textView, i7, e6Var, null, 2131743885);
            textView.setGravity(16);
            float f10 = z11 ? 34.0f : 12.0f;
            boolean z12 = org.telegram.messenger.hd.f24104a0;
            c8.va.a(textView, z12 ? 12.0f : f10, 8.0f, z12 ? f10 : 12.0f, 8.0f);
            addView(textView, c8.ja.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131231001);
            org.telegram.ui.ActionBar.q6.s(imageView, i7, e6Var, PorterDuff.Mode.MULTIPLY);
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.j6.h0((x02 & 16777215) | 419430400, 1, -1));
                this.f40376n = imageView.getBackground();
            }
            c8.va.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, c8.ja.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new e0(this, 4));
    }

    @Override
    public final void c(xb xbVar) {
        this.d = xbVar;
    }

    @Override
    public final void d() {
        this.d = null;
        Runnable runnable = this.f40373c;
        if (runnable != null && !this.f40375f) {
            runnable.run();
        }
    }

    public final void e(CharSequence charSequence) {
        TextView textView = this.f40374e;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void f() {
        if (this.d != null) {
            this.f40375f = true;
            Runnable runnable = this.f40372b;
            if (runnable != null) {
                runnable.run();
            }
            xb xbVar = this.d;
            if (xbVar != null) {
                xbVar.b();
            }
        }
    }

    @Override
    public final void updateColors() {
        int x02;
        Drawable drawable;
        try {
            int i7 = org.telegram.ui.ActionBar.j6.xj;
            org.telegram.ui.ActionBar.e6 e6Var = this.f40371a;
            if (e6Var != null) {
                x02 = e6Var.h(i7);
            } else {
                x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
            }
            int i10 = (x02 & 16777215) | 419430400;
            TextView textView = this.f40374e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                org.telegram.ui.ActionBar.j6.H1(drawable, i10, true);
            }
            Drawable drawable2 = this.f40376n;
            if (drawable2 != null) {
                org.telegram.ui.ActionBar.j6.H1(drawable2, i10, true);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public vb(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this(context, e6Var, z10, !z10);
    }
}
