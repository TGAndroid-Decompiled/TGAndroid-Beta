package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class ac extends ya implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f31747a;
    public Runnable f31748b;
    public Runnable f31749c;
    public cc d;
    public final TextView f31750e;
    public boolean f31751f;
    public final Drawable h;
    public final Drawable f31752n;

    public ac(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, boolean z10) {
        super(context);
        int x02;
        this.f31747a = f6Var;
        int i7 = org.telegram.ui.ActionBar.k6.uj;
        if (f6Var != null) {
            x02 = f6Var.h(i7);
        } else {
            x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        }
        if (z9) {
            TextView textView = new TextView(context);
            this.f31750e = textView;
            textView.setBackground(org.telegram.ui.ActionBar.k6.h0((x02 & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
            org.telegram.messenger.camera.q.o(textView, i7, f6Var, null, 2131743886);
            textView.setGravity(16);
            float f10 = z10 ? 34.0f : 12.0f;
            boolean z11 = org.telegram.messenger.hd.f22871a0;
            c8.ra.a(textView, z11 ? 12.0f : f10, 8.0f, z11 ? f10 : 12.0f, 8.0f);
            addView(textView, c8.ha.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z10) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131231001);
            org.telegram.ui.ActionBar.r6.t(imageView, i7, f6Var, PorterDuff.Mode.MULTIPLY);
            if (!z9) {
                imageView.setBackground(org.telegram.ui.ActionBar.k6.h0((x02 & 16777215) | 419430400, 1, -1));
                this.f31752n = imageView.getBackground();
            }
            c8.ra.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, c8.ha.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new h0(this, 4));
    }

    @Override
    public final void c(cc ccVar) {
        this.d = ccVar;
    }

    @Override
    public final void d() {
        this.d = null;
        Runnable runnable = this.f31749c;
        if (runnable != null && !this.f31751f) {
            runnable.run();
        }
    }

    public final void e(CharSequence charSequence) {
        TextView textView = this.f31750e;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void f() {
        if (this.d != null) {
            this.f31751f = true;
            Runnable runnable = this.f31748b;
            if (runnable != null) {
                runnable.run();
            }
            cc ccVar = this.d;
            if (ccVar != null) {
                ccVar.b();
            }
        }
    }

    @Override
    public final void updateColors() {
        int x02;
        Drawable drawable;
        try {
            int i7 = org.telegram.ui.ActionBar.k6.uj;
            org.telegram.ui.ActionBar.f6 f6Var = this.f31747a;
            if (f6Var != null) {
                x02 = f6Var.h(i7);
            } else {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
            }
            int i10 = (x02 & 16777215) | 419430400;
            TextView textView = this.f31750e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                org.telegram.ui.ActionBar.k6.H1(drawable, i10, true);
            }
            Drawable drawable2 = this.f31752n;
            if (drawable2 != null) {
                org.telegram.ui.ActionBar.k6.H1(drawable2, i10, true);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public ac(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        this(context, f6Var, z9, !z9);
    }
}
