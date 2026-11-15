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
    public static final int G = 0;
    public final PointF E;
    public int F;
    public final f f50238a;
    public final ViewGroup f50239b;
    public final View f50240c;
    public final View d;
    public final View f50241e;
    public final org.telegram.ui.Components.y11 f50242f;
    public final org.telegram.ui.Components.t00 h;
    public final TextView f50243n;
    public final TextView f50244r;
    public final TextView f50245s;
    public final TextView f50246w;
    public final FrameLayout f50247x;
    public boolean f50248y;

    public pd0(Context context, ViewGroup viewGroup, View view, String str, final f fVar) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        PointF pointF = new PointF();
        this.E = pointF;
        this.f50239b = viewGroup;
        this.f50240c = view;
        this.f50238a = fVar;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new g40(this, 9));
        addView(view2, c8.ja.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.f50241e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, c8.ja.c(-1.0f, -1));
        org.telegram.ui.Components.y11 y11Var = new org.telegram.ui.Components.y11(getContext());
        this.f50242f = y11Var;
        y11Var.setTransformType(1);
        y11Var.setDrawBackground(false);
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null, false);
        this.h = t00Var;
        t00Var.addView(y11Var, c8.ja.e(56, 56, 17));
        t00Var.a(y11Var);
        t00Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        pd0 pd0Var = this;
                        pd0Var.getClass();
                        fVar.w1(pd0Var);
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
                        fVar.w1(pd0Var3);
                        return;
                }
            }
        });
        t00Var.setContentDescription(org.telegram.messenger.hd.M0(2131751354, null));
        addView(t00Var, c8.ja.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50247x = frameLayout;
        addView(frameLayout, c8.ja.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f50243n = textView;
        textView.setText(org.telegram.messenger.hd.M0(2131751816, null));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (org.telegram.messenger.hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        TextView k10 = org.telegram.ui.Cells.y0.k(frameLayout, textView, c8.ja.d(-1, -2.0f, i7, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f50244r = k10;
        k10.setText(str);
        k10.setTextSize(1, 18.0f);
        k10.setTypeface(org.telegram.messenger.g0.o());
        k10.setSingleLine();
        if (org.telegram.messenger.hd.f24104a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(k10, c8.ja.d(-1, -2.0f, i10, 24.0f, 48.0f, 24.0f, 0.0f));
        int L = org.telegram.messenger.g0.L(16.0f);
        TextView textView2 = new TextView(context);
        this.f50245s = textView2;
        textView2.setText(org.telegram.messenger.hd.M0(2131751335, null));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i13 = org.telegram.ui.ActionBar.j6.Ni;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.J0(L2, org.telegram.ui.ActionBar.j6.x0(null, i13, false)));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        pd0 pd0Var = this;
                        pd0Var.getClass();
                        fVar.w1(pd0Var);
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
                        fVar.w1(pd0Var3);
                        return;
                }
            }
        });
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i14 = L / 2;
        textView2.setPadding(L, i14, L, i14);
        if (org.telegram.messenger.hd.f24104a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        float f10 = 8;
        TextView k11 = org.telegram.ui.Cells.y0.k(frameLayout, textView2, c8.ja.d(-2, -2.0f, i11 | 80, f10, f10, f10, f10), context);
        this.f50246w = k11;
        k11.setText(org.telegram.messenger.hd.M0(2131752152, null));
        k11.setSingleLine();
        k11.setTextSize(1, 16.0f);
        k11.setBackground(org.telegram.ui.ActionBar.j6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.j6.x0(null, i13, false)));
        k11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        pd0 pd0Var = this;
                        pd0Var.getClass();
                        fVar.w1(pd0Var);
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
                        fVar.w1(pd0Var3);
                        return;
                }
            }
        });
        k11.setTypeface(typeface);
        k11.setPadding(L, i14, L, i14);
        if (org.telegram.messenger.hd.f24104a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        frameLayout.addView(k11, c8.ja.d(-2, -2.0f, i12 | 80, f10, f10, f10, f10));
        jh.k.b(view, viewGroup, pointF);
        t00Var.setTranslationX(pointF.x);
        t00Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f50248y) {
            return;
        }
        this.f50248y = true;
        ((be0) this.f50238a.f46930b).f45693h0.f46079c0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new od0(this, 1));
        duration.addUpdateListener(new md0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.er.f34419f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.O9, false);
        org.telegram.ui.Components.y11 y11Var = this.f50242f;
        y11Var.setColor(x02);
        y11Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.P9, false));
        int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false);
        FrameLayout frameLayout = this.f50247x;
        if (frameLayout.getBackground() == null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(12.0f), x03));
        } else if (x03 != this.F) {
            org.telegram.ui.ActionBar.j6.C1(x03, frameLayout.getBackground());
            frameLayout.invalidate();
        }
        this.F = x03;
        this.f50243n.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29088q5, false));
        this.f50244r.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28957j5, false));
        int i7 = org.telegram.ui.ActionBar.j6.Ni;
        this.f50245s.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        this.f50246w.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        this.h.updateColors();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        FrameLayout frameLayout = this.f50247x;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - org.telegram.messenger.g0.L(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
