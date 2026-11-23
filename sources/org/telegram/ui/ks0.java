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
    public final org.telegram.ui.ActionBar.m5 f49348a;
    public final TextView f49349b;
    public final ImageView f49350c;
    public final ImageView d;
    public boolean f49351e;
    public xs0 f49352f;
    public org.telegram.ui.Components.n5 h;
    public Drawable f49353n;

    public ks0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f49348a = m5Var;
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setTextSize(15);
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        linearLayout.addView(m5Var, c8.na.o(-1, -2));
        TextView textView = new TextView(context);
        this.f49349b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29739y6, h6Var);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(textView, c8.na.q(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, c8.na.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.f49350c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, c8.na.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232061);
        org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.M6, h6Var, PorterDuff.Mode.SRC_ATOP);
        addView(imageView2, c8.na.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(xs0 xs0Var, boolean z10) {
        long longValue;
        boolean q10 = org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24932t0).q();
        ImageView imageView = this.d;
        if (q10 && xs0Var.f53918a == 12 && xs0Var.f53919b == 2131231150) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
                if (isAttachedToWindow()) {
                    this.h.a();
                }
            }
            Long i7 = org.telegram.messenger.p10.i(org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24932t0).f());
            if (i7 == null) {
                longValue = 0;
            } else {
                longValue = i7.longValue();
            }
            b(longValue, false);
        } else {
            imageView.setVisibility(0);
            org.telegram.ui.Components.n5 n5Var = this.h;
            if (n5Var != null) {
                n5Var.b();
                this.h = null;
            }
        }
        this.f49352f = xs0Var;
        this.f49348a.l(xs0Var.f53920c, false);
        this.f49349b.setText(xs0Var.d);
        this.f49350c.setImageResource(xs0Var.f53919b);
        this.f49351e = z10;
    }

    public final void b(long j3, boolean z10) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j3 == 0) {
            if (this.f49353n == null) {
                Drawable mutate = getContext().getResources().getDrawable(2131232312).mutate();
                this.f49353n = mutate;
                org.telegram.ui.ActionBar.t6.x(this, mutate, org.telegram.ui.ActionBar.m6.f29682v6, null, PorterDuff.Mode.SRC_IN);
            }
            this.h.g(this.f49353n, z10);
            return;
        }
        this.h.j(j3, z10);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.f37736s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - this.h.f37736s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + this.h.f37736s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29682v6, false)));
            this.h.draw(canvas);
        }
        if (this.f49351e) {
            canvas.drawRect(org.telegram.messenger.g0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.m6.f29470k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.Components.n5 n5Var = this.h;
        if (n5Var != null) {
            n5Var.a();
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.ui.Components.n5 n5Var = this.h;
        if (n5Var != null) {
            n5Var.b();
        }
        super.onDetachedFromWindow();
    }
}
