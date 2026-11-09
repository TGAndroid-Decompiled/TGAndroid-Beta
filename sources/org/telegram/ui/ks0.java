package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public class ks0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.l5 f47358a;
    public final TextView f47359b;
    public final ImageView f47360c;
    public final ImageView d;
    public boolean f47361e;
    public xs0 f47362f;
    public org.telegram.ui.Components.g5 h;
    public Drawable f47363n;

    public ks0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f47358a = l5Var;
        l5Var.setTypeface(org.telegram.messenger.g0.o());
        l5Var.setTextSize(15);
        org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.G6, g6Var);
        linearLayout.addView(l5Var, c8.ha.o(-1, -2));
        TextView textView = new TextView(context);
        this.f47359b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28257y6, g6Var);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(textView, c8.ha.q(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, c8.ha.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.f47360c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, c8.ha.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232059);
        org.telegram.ui.ActionBar.s6.s(imageView2, org.telegram.ui.ActionBar.l6.M6, g6Var, PorterDuff.Mode.SRC_ATOP);
        addView(imageView2, c8.ha.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(xs0 xs0Var, boolean z9) {
        long longValue;
        boolean q10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).q();
        ImageView imageView = this.d;
        if (q10 && xs0Var.f51756a == 12 && xs0Var.f51757b == 2131231150) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
                if (isAttachedToWindow()) {
                    this.h.a();
                }
            }
            Long h = org.telegram.messenger.t10.h(org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).f());
            if (h == null) {
                longValue = 0;
            } else {
                longValue = h.longValue();
            }
            b(longValue, false);
        } else {
            imageView.setVisibility(0);
            org.telegram.ui.Components.g5 g5Var = this.h;
            if (g5Var != null) {
                g5Var.b();
                this.h = null;
            }
        }
        this.f47362f = xs0Var;
        this.f47358a.l(xs0Var.f51758c, false);
        this.f47359b.setText(xs0Var.d);
        this.f47360c.setImageResource(xs0Var.f51757b);
        this.f47361e = z9;
    }

    public final void b(long j3, boolean z9) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j3 == 0) {
            if (this.f47363n == null) {
                Drawable mutate = getContext().getResources().getDrawable(2131232310).mutate();
                this.f47363n = mutate;
                org.telegram.ui.ActionBar.s6.x(this, mutate, org.telegram.ui.ActionBar.l6.f28200v6, null, PorterDuff.Mode.SRC_IN);
            }
            this.h.g(this.f47363n, z9);
            return;
        }
        this.h.j(j3, z9);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.f33869s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - this.h.f33869s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + this.h.f33869s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28200v6, false)));
            this.h.draw(canvas);
        }
        if (this.f47361e) {
            canvas.drawRect(org.telegram.messenger.g0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.l6.f27988k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.Components.g5 g5Var = this.h;
        if (g5Var != null) {
            g5Var.a();
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.ui.Components.g5 g5Var = this.h;
        if (g5Var != null) {
            g5Var.b();
        }
        super.onDetachedFromWindow();
    }
}
