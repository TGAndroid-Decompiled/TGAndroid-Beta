package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class pd0 extends FrameLayout {
    public static final int F = 0;
    public final PointF D;
    public int E;
    public final f f48801a;
    public final ViewGroup f48802b;
    public final View f48803c;
    public final View d;
    public final View f48804e;
    public final org.telegram.ui.Components.t11 f48805f;
    public final org.telegram.ui.Components.p00 h;
    public final TextView f48806n;
    public final TextView f48807r;
    public final TextView f48808s;
    public final TextView f48809w;
    public final FrameLayout f48810x;
    public boolean f48811y;

    public pd0(Context context, ViewGroup viewGroup, View view, String str, final f fVar) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        PointF pointF = new PointF();
        this.D = pointF;
        this.f48802b = viewGroup;
        this.f48803c = view;
        this.f48801a = fVar;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new g40(this, 9));
        addView(view2, c8.ha.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.f48804e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.t11 t11Var = new org.telegram.ui.Components.t11(getContext());
        this.f48805f = t11Var;
        t11Var.setTransformType(1);
        t11Var.setDrawBackground(false);
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null, false);
        this.h = p00Var;
        p00Var.addView(t11Var, c8.ha.e(56, 56, 17));
        p00Var.a(t11Var);
        p00Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        pd0 pd0Var = this;
                        pd0Var.getClass();
                        fVar.X1(pd0Var);
                        return;
                    case 1:
                        pd0 pd0Var2 = this;
                        pd0Var2.getClass();
                        fVar.getClass();
                        pd0Var2.a();
                        return;
                    default:
                        pd0 pd0Var3 = this;
                        pd0Var3.getClass();
                        fVar.X1(pd0Var3);
                        return;
                }
            }
        });
        p00Var.setContentDescription(org.telegram.messenger.hd.M0(2131751355, null));
        addView(p00Var, c8.ha.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48810x = frameLayout;
        addView(frameLayout, c8.ha.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f48806n = textView;
        textView.setText(org.telegram.messenger.hd.M0(2131751816, null));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (org.telegram.messenger.hd.f22878a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        TextView i13 = org.telegram.ui.Cells.f1.i(frameLayout, textView, c8.ha.d(-1, -2.0f, i7, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f48807r = i13;
        i13.setText(str);
        i13.setTextSize(1, 18.0f);
        i13.setTypeface(org.telegram.messenger.g0.o());
        i13.setSingleLine();
        if (org.telegram.messenger.hd.f22878a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(i13, c8.ha.d(-1, -2.0f, i10, 24.0f, 48.0f, 24.0f, 0.0f));
        int L = org.telegram.messenger.g0.L(16.0f);
        TextView textView2 = new TextView(context);
        this.f48808s = textView2;
        textView2.setText(org.telegram.messenger.hd.M0(2131751336, null));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i14 = org.telegram.ui.ActionBar.k6.Ki;
        textView2.setBackground(org.telegram.ui.ActionBar.k6.J0(L2, org.telegram.ui.ActionBar.k6.x0(null, i14, false)));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        pd0 pd0Var = this;
                        pd0Var.getClass();
                        fVar.X1(pd0Var);
                        return;
                    case 1:
                        pd0 pd0Var2 = this;
                        pd0Var2.getClass();
                        fVar.getClass();
                        pd0Var2.a();
                        return;
                    default:
                        pd0 pd0Var3 = this;
                        pd0Var3.getClass();
                        fVar.X1(pd0Var3);
                        return;
                }
            }
        });
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i15 = L / 2;
        textView2.setPadding(L, i15, L, i15);
        if (org.telegram.messenger.hd.f22878a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        float f10 = 8;
        TextView i16 = org.telegram.ui.Cells.f1.i(frameLayout, textView2, c8.ha.d(-2, -2.0f, i11 | 80, f10, f10, f10, f10), context);
        this.f48809w = i16;
        i16.setText(org.telegram.messenger.hd.M0(2131752152, null));
        i16.setSingleLine();
        i16.setTextSize(1, 16.0f);
        i16.setBackground(org.telegram.ui.ActionBar.k6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.k6.x0(null, i14, false)));
        i16.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        pd0 pd0Var = this;
                        pd0Var.getClass();
                        fVar.X1(pd0Var);
                        return;
                    case 1:
                        pd0 pd0Var2 = this;
                        pd0Var2.getClass();
                        fVar.getClass();
                        pd0Var2.a();
                        return;
                    default:
                        pd0 pd0Var3 = this;
                        pd0Var3.getClass();
                        fVar.X1(pd0Var3);
                        return;
                }
            }
        });
        i16.setTypeface(typeface);
        i16.setPadding(L, i15, L, i15);
        if (org.telegram.messenger.hd.f22878a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        frameLayout.addView(i16, c8.ha.d(-2, -2.0f, i12 | 80, f10, f10, f10, f10));
        jh.k.b(view, viewGroup, pointF);
        p00Var.setTranslationX(pointF.x);
        p00Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f48811y) {
            return;
        }
        this.f48811y = true;
        ((be0) this.f48801a.f45450b).f44301g0.f44759b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new od0(this, 1));
        duration.addUpdateListener(new md0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.xq.f40345f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false);
        org.telegram.ui.Components.t11 t11Var = this.f48805f;
        t11Var.setColor(x02);
        t11Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false));
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27922h5, false);
        FrameLayout frameLayout = this.f48810x;
        if (frameLayout.getBackground() == null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), x03));
        } else if (x03 != this.E) {
            org.telegram.ui.ActionBar.k6.C1(x03, frameLayout.getBackground());
            frameLayout.invalidate();
        }
        this.E = x03;
        this.f48806n.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28088q5, false));
        this.f48807r.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27957j5, false));
        int i7 = org.telegram.ui.ActionBar.k6.Ki;
        this.f48808s.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.f48809w.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.h.updateColors();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        FrameLayout frameLayout = this.f48810x;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - org.telegram.messenger.g0.L(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
