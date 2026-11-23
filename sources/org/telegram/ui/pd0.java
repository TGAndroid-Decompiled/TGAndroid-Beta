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
    public final f f50995a;
    public final ViewGroup f50996b;
    public final View f50997c;
    public final View d;
    public final View f50998e;
    public final org.telegram.ui.Components.j21 f50999f;
    public final org.telegram.ui.Components.a10 h;
    public final TextView f51000n;
    public final TextView f51001r;
    public final TextView f51002s;
    public final TextView f51003w;
    public final FrameLayout f51004x;
    public boolean f51005y;

    public pd0(Context context, ViewGroup viewGroup, View view, String str, final f fVar) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        PointF pointF = new PointF();
        this.E = pointF;
        this.f50996b = viewGroup;
        this.f50997c = view;
        this.f50995a = fVar;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new i40(this, 9));
        addView(view2, c8.na.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.f50998e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, c8.na.c(-1.0f, -1));
        org.telegram.ui.Components.j21 j21Var = new org.telegram.ui.Components.j21(getContext());
        this.f50999f = j21Var;
        j21Var.setTransformType(1);
        j21Var.setDrawBackground(false);
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, null, false);
        this.h = a10Var;
        a10Var.addView(j21Var, c8.na.e(56, 56, 17));
        a10Var.a(j21Var);
        a10Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        pd0 pd0Var = this;
                        pd0Var.getClass();
                        fVar.u1(pd0Var);
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
                        fVar.u1(pd0Var3);
                        return;
                }
            }
        });
        a10Var.setContentDescription(org.telegram.messenger.gd.N0(2131751342, null));
        addView(a10Var, c8.na.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51004x = frameLayout;
        addView(frameLayout, c8.na.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f51000n = textView;
        textView.setText(org.telegram.messenger.gd.N0(2131751804, null));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (org.telegram.messenger.gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, c8.na.d(-1, -2.0f, i7, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f51001r = m10;
        m10.setText(str);
        m10.setTextSize(1, 18.0f);
        m10.setTypeface(org.telegram.messenger.g0.o());
        m10.setSingleLine();
        if (org.telegram.messenger.gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(m10, c8.na.d(-1, -2.0f, i10, 24.0f, 48.0f, 24.0f, 0.0f));
        int L = org.telegram.messenger.g0.L(16.0f);
        TextView textView2 = new TextView(context);
        this.f51002s = textView2;
        textView2.setText(org.telegram.messenger.gd.N0(2131751323, null));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i13 = org.telegram.ui.ActionBar.n6.Ni;
        textView2.setBackground(org.telegram.ui.ActionBar.n6.J0(L2, org.telegram.ui.ActionBar.n6.x0(null, i13, false)));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        pd0 pd0Var = this;
                        pd0Var.getClass();
                        fVar.u1(pd0Var);
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
                        fVar.u1(pd0Var3);
                        return;
                }
            }
        });
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i14 = L / 2;
        textView2.setPadding(L, i14, L, i14);
        if (org.telegram.messenger.gd.f24314a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        float f10 = 8;
        TextView m11 = org.telegram.ui.Cells.c0.m(frameLayout, textView2, c8.na.d(-2, -2.0f, i11 | 80, f10, f10, f10, f10), context);
        this.f51003w = m11;
        m11.setText(org.telegram.messenger.gd.N0(2131752140, null));
        m11.setSingleLine();
        m11.setTextSize(1, 16.0f);
        m11.setBackground(org.telegram.ui.ActionBar.n6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.n6.x0(null, i13, false)));
        m11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        pd0 pd0Var = this;
                        pd0Var.getClass();
                        fVar.u1(pd0Var);
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
                        fVar.u1(pd0Var3);
                        return;
                }
            }
        });
        m11.setTypeface(typeface);
        m11.setPadding(L, i14, L, i14);
        if (org.telegram.messenger.gd.f24314a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        frameLayout.addView(m11, c8.na.d(-2, -2.0f, i12 | 80, f10, f10, f10, f10));
        jh.k.b(view, viewGroup, pointF);
        a10Var.setTranslationX(pointF.x);
        a10Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f51005y) {
            return;
        }
        this.f51005y = true;
        ((ce0) this.f50995a.f47651b).f46781h0.f47054c0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new od0(this, 1));
        duration.addUpdateListener(new md0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.kr.f36858f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.O9, false);
        org.telegram.ui.Components.j21 j21Var = this.f50999f;
        j21Var.setColor(x02);
        j21Var.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.P9, false));
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false);
        FrameLayout frameLayout = this.f51004x;
        if (frameLayout.getBackground() == null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(12.0f), x03));
        } else if (x03 != this.F) {
            org.telegram.ui.ActionBar.n6.C1(x03, frameLayout.getBackground());
            frameLayout.invalidate();
        }
        this.F = x03;
        this.f51000n.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29690q5, false));
        this.f51001r.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29559j5, false));
        int i7 = org.telegram.ui.ActionBar.n6.Ni;
        this.f51002s.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        this.f51003w.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        this.h.updateColors();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        FrameLayout frameLayout = this.f51004x;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - org.telegram.messenger.g0.L(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
