package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class md0 extends FrameLayout {
    public static final int G = 0;
    public final PointF E;
    public int F;
    public final f f47653a;
    public final ViewGroup f47654b;
    public final View f47655c;
    public final View d;
    public final View f47656e;
    public final org.telegram.ui.Components.n11 f47657f;
    public final org.telegram.ui.Components.l00 h;
    public final TextView f47658n;
    public final TextView f47659r;
    public final TextView f47660s;
    public final TextView f47661w;
    public final FrameLayout f47662x;
    public boolean f47663y;

    public md0(Context context, ViewGroup viewGroup, View view, String str, final f fVar) {
        super(context);
        int i3;
        int i10;
        int i11;
        int i12;
        PointF pointF = new PointF();
        this.E = pointF;
        this.f47654b = viewGroup;
        this.f47655c = view;
        this.f47653a = fVar;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new b40(this, 9));
        addView(view2, b8.mf.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.f47656e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, b8.mf.c(-1.0f, -1));
        org.telegram.ui.Components.n11 n11Var = new org.telegram.ui.Components.n11(getContext());
        this.f47657f = n11Var;
        n11Var.setTransformType(1);
        n11Var.setDrawBackground(false);
        org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(context, null, false);
        this.h = l00Var;
        l00Var.addView(n11Var, b8.mf.e(56, 56, 17));
        l00Var.a(n11Var);
        l00Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        md0 md0Var = this;
                        md0Var.getClass();
                        fVar.O1(md0Var);
                        return;
                    case 1:
                        md0 md0Var2 = this;
                        md0Var2.getClass();
                        fVar.getClass();
                        md0Var2.a();
                        return;
                    default:
                        md0 md0Var3 = this;
                        md0Var3.getClass();
                        fVar.O1(md0Var3);
                        return;
                }
            }
        });
        l00Var.setContentDescription(org.telegram.messenger.bd.M0(2131751355, null));
        addView(l00Var, b8.mf.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47662x = frameLayout;
        addView(frameLayout, b8.mf.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f47658n = textView;
        textView.setText(org.telegram.messenger.bd.M0(2131751816, null));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        TextView m10 = org.telegram.ui.Cells.f1.m(frameLayout, textView, b8.mf.d(-1, -2.0f, i3, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f47659r = m10;
        m10.setText(str);
        m10.setTextSize(1, 18.0f);
        m10.setTypeface(org.telegram.messenger.g0.o());
        m10.setSingleLine();
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(m10, b8.mf.d(-1, -2.0f, i10, 24.0f, 48.0f, 24.0f, 0.0f));
        int L = org.telegram.messenger.g0.L(16.0f);
        TextView textView2 = new TextView(context);
        this.f47660s = textView2;
        textView2.setText(org.telegram.messenger.bd.M0(2131751336, null));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i13 = org.telegram.ui.ActionBar.k6.Ki;
        textView2.setBackground(org.telegram.ui.ActionBar.k6.J0(L2, org.telegram.ui.ActionBar.k6.x0(null, i13, false)));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        md0 md0Var = this;
                        md0Var.getClass();
                        fVar.O1(md0Var);
                        return;
                    case 1:
                        md0 md0Var2 = this;
                        md0Var2.getClass();
                        fVar.getClass();
                        md0Var2.a();
                        return;
                    default:
                        md0 md0Var3 = this;
                        md0Var3.getClass();
                        fVar.O1(md0Var3);
                        return;
                }
            }
        });
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i14 = L / 2;
        textView2.setPadding(L, i14, L, i14);
        if (org.telegram.messenger.bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        float f10 = 8;
        TextView m11 = org.telegram.ui.Cells.f1.m(frameLayout, textView2, b8.mf.d(-2, -2.0f, i11 | 80, f10, f10, f10, f10), context);
        this.f47661w = m11;
        m11.setText(org.telegram.messenger.bd.M0(2131752152, null));
        m11.setSingleLine();
        m11.setTextSize(1, 16.0f);
        m11.setBackground(org.telegram.ui.ActionBar.k6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.k6.x0(null, i13, false)));
        m11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        md0 md0Var = this;
                        md0Var.getClass();
                        fVar.O1(md0Var);
                        return;
                    case 1:
                        md0 md0Var2 = this;
                        md0Var2.getClass();
                        fVar.getClass();
                        md0Var2.a();
                        return;
                    default:
                        md0 md0Var3 = this;
                        md0Var3.getClass();
                        fVar.O1(md0Var3);
                        return;
                }
            }
        });
        m11.setTypeface(typeface);
        m11.setPadding(L, i14, L, i14);
        if (org.telegram.messenger.bd.f21784a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        frameLayout.addView(m11, b8.mf.d(-2, -2.0f, i12 | 80, f10, f10, f10, f10));
        kh.k.b(view, viewGroup, pointF);
        l00Var.setTranslationX(pointF.x);
        l00Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f47663y) {
            return;
        }
        this.f47663y = true;
        ((wd0) this.f47653a.f45115b).f50785b0.f51951c0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new ld0(this, 1));
        duration.addUpdateListener(new jd0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.xq.f40452f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false);
        org.telegram.ui.Components.n11 n11Var = this.f47657f;
        n11Var.setColor(x02);
        n11Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false));
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false);
        FrameLayout frameLayout = this.f47662x;
        if (frameLayout.getBackground() == null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), x03));
        } else if (x03 != this.F) {
            org.telegram.ui.ActionBar.k6.C1(x03, frameLayout.getBackground());
            frameLayout.invalidate();
        }
        this.F = x03;
        this.f47658n.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28120q5, false));
        this.f47659r.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27988j5, false));
        int i3 = org.telegram.ui.ActionBar.k6.Ki;
        this.f47660s.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.f47661w.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.h.updateColors();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        FrameLayout frameLayout = this.f47662x;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - org.telegram.messenger.g0.L(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
