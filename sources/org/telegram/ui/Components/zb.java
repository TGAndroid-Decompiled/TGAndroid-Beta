package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class zb extends xa implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 f40907a;
    public Runnable f40908b;
    public Runnable f40909c;
    public bc d;
    public final TextView f40910e;
    public boolean f40911f;
    public final Drawable h;
    public final Drawable f40912n;

    public zb(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, boolean z10) {
        super(context);
        int x02;
        this.f40907a = h6Var;
        int i7 = org.telegram.ui.ActionBar.m6.uj;
        if (h6Var != null) {
            x02 = h6Var.h(i7);
        } else {
            x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        }
        if (z9) {
            TextView textView = new TextView(context);
            this.f40910e = textView;
            textView.setBackground(org.telegram.ui.ActionBar.m6.h0((x02 & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
            org.telegram.messenger.camera.q.o(textView, i7, h6Var, null, 2131743885);
            textView.setGravity(16);
            float f10 = z10 ? 34.0f : 12.0f;
            boolean z11 = org.telegram.messenger.id.f23161a0;
            c8.sa.a(textView, z11 ? 12.0f : f10, 8.0f, z11 ? f10 : 12.0f, 8.0f);
            addView(textView, c8.ha.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z10) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131231001);
            org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.MULTIPLY);
            if (!z9) {
                imageView.setBackground(org.telegram.ui.ActionBar.m6.h0((x02 & 16777215) | 419430400, 1, -1));
                this.f40912n = imageView.getBackground();
            }
            c8.sa.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, c8.ha.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new g0(this, 4));
    }

    @Override
    public final void c(bc bcVar) {
        this.d = bcVar;
    }

    @Override
    public final void d() {
        this.d = null;
        Runnable runnable = this.f40909c;
        if (runnable != null && !this.f40911f) {
            runnable.run();
        }
    }

    public final void e(CharSequence charSequence) {
        TextView textView = this.f40910e;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void f() {
        if (this.d != null) {
            this.f40911f = true;
            Runnable runnable = this.f40908b;
            if (runnable != null) {
                runnable.run();
            }
            bc bcVar = this.d;
            if (bcVar != null) {
                bcVar.b();
            }
        }
    }

    @Override
    public final void updateColors() {
        int x02;
        Drawable drawable;
        try {
            int i7 = org.telegram.ui.ActionBar.m6.uj;
            org.telegram.ui.ActionBar.h6 h6Var = this.f40907a;
            if (h6Var != null) {
                x02 = h6Var.h(i7);
            } else {
                x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            }
            int i10 = (x02 & 16777215) | 419430400;
            TextView textView = this.f40910e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                org.telegram.ui.ActionBar.m6.H1(drawable, i10, true);
            }
            Drawable drawable2 = this.f40912n;
            if (drawable2 != null) {
                org.telegram.ui.ActionBar.m6.H1(drawable2, i10, true);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public zb(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        this(context, h6Var, z9, !z9);
    }
}
