package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public class js0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.n5 f49051a;
    public final TextView f49052b;
    public final ImageView f49053c;
    public final ImageView d;
    public boolean f49054e;
    public ws0 f49055f;
    public org.telegram.ui.Components.m5 h;
    public Drawable f49056n;

    public js0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f49051a = n5Var;
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setTextSize(15);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        linearLayout.addView(n5Var, c8.ma.o(-1, -2));
        TextView textView = new TextView(context);
        this.f49052b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29786y6, i6Var);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(textView, c8.ma.q(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, c8.ma.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.f49053c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, c8.ma.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232061);
        org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.M6, i6Var, PorterDuff.Mode.SRC_ATOP);
        addView(imageView2, c8.ma.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(ws0 ws0Var, boolean z10) {
        long longValue;
        boolean q10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24770t0).q();
        ImageView imageView = this.d;
        if (q10 && ws0Var.f53469a == 12 && ws0Var.f53470b == 2131231150) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
                if (isAttachedToWindow()) {
                    this.h.a();
                }
            }
            Long i7 = org.telegram.messenger.o10.i(org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24770t0).f());
            if (i7 == null) {
                longValue = 0;
            } else {
                longValue = i7.longValue();
            }
            b(longValue, false);
        } else {
            imageView.setVisibility(0);
            org.telegram.ui.Components.m5 m5Var = this.h;
            if (m5Var != null) {
                m5Var.b();
                this.h = null;
            }
        }
        this.f49055f = ws0Var;
        this.f49051a.l(ws0Var.f53471c, false);
        this.f49052b.setText(ws0Var.d);
        this.f49053c.setImageResource(ws0Var.f53470b);
        this.f49054e = z10;
    }

    public final void b(long j3, boolean z10) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j3 == 0) {
            if (this.f49056n == null) {
                Drawable mutate = getContext().getResources().getDrawable(2131232312).mutate();
                this.f49056n = mutate;
                org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.f29729v6, null, PorterDuff.Mode.SRC_IN);
            }
            this.h.g(this.f49056n, z10);
            return;
        }
        this.h.j(j3, z10);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.f37364s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - this.h.f37364s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + this.h.f37364s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29729v6, false)));
            this.h.draw(canvas);
        }
        if (this.f49054e) {
            canvas.drawRect(org.telegram.messenger.g0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.n6.f29517k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.Components.m5 m5Var = this.h;
        if (m5Var != null) {
            m5Var.a();
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.ui.Components.m5 m5Var = this.h;
        if (m5Var != null) {
            m5Var.b();
        }
        super.onDetachedFromWindow();
    }
}
