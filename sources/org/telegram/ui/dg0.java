package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dg0 extends FrameLayout {
    public static final int B = 0;
    public final ng0 f33463a;
    public final ViewGroup f33464b;
    public final View f33465c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.e31 f33466f;
    public final org.telegram.ui.Components.a20 h;
    public final TextView f33467n;
    public final TextView f33468r;
    public final TextView f33469s;
    public final TextView v;
    public final FrameLayout f33470w;
    public boolean f33471x;
    public final PointF f33472y;

    public dg0(Context context, ViewGroup viewGroup, View view, String str, final ng0 ng0Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        PointF pointF = new PointF();
        this.f33472y = pointF;
        this.f33464b = viewGroup;
        this.f33465c = view;
        this.f33463a = ng0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new ag0(this));
        addView(view2, k7.b6.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.e31 e31Var = new org.telegram.ui.Components.e31(getContext());
        this.f33466f = e31Var;
        e31Var.setTransformType(1);
        e31Var.setDrawBackground(false);
        org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, null, false);
        this.h = a20Var;
        a20Var.addView(e31Var, k7.b6.e(56, 56, 17));
        a20Var.a(e31Var);
        a20Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        ng0Var.a(this);
                        return;
                    default:
                        ng0Var.a(this);
                        return;
                }
            }
        });
        a20Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(a20Var, k7.b6.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33470w = frameLayout;
        addView(frameLayout, k7.b6.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f33467n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        TextView h = ai.h(frameLayout, textView, k7.b6.d(-1, -2.0f, i10, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f33468r = h;
        h.setText(str);
        h.setTextSize(1, 18.0f);
        h.setTypeface(AndroidUtilities.bold());
        h.setSingleLine();
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(h, k7.b6.d(-1, -2.0f, i11, 24.0f, 48.0f, 24.0f, 0.0f));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.f33469s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i14 = org.telegram.ui.ActionBar.j6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.G0(dp2, org.telegram.ui.ActionBar.j6.w0(null, i14, false)));
        textView2.setOnClickListener(new ag0(this, ng0Var));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i15 = dp / 2;
        textView2.setPadding(dp, i15, dp, i15);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        float f10 = 8;
        TextView h9 = ai.h(frameLayout, textView2, k7.b6.d(-2, -2.0f, i12 | 80, f10, f10, f10, f10), context);
        this.v = h9;
        h9.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        h9.setSingleLine();
        h9.setTextSize(1, 16.0f);
        h9.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.w0(null, i14, false)));
        h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        ng0Var.a(this);
                        return;
                    default:
                        ng0Var.a(this);
                        return;
                }
            }
        });
        h9.setTypeface(typeface);
        h9.setPadding(dp, i15, dp, i15);
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout.addView(h9, k7.b6.d(-2, -2.0f, i13 | 80, f10, f10, f10, f10));
        ug.i.b(view, viewGroup, pointF);
        a20Var.setTranslationX(pointF.x);
        a20Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f33471x) {
            return;
        }
        this.f33471x = true;
        this.f33463a.f36511a.S.Y = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new cg0(this, 1));
        duration.addUpdateListener(new zf0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.mr.f27122f);
        duration.start();
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false);
        org.telegram.ui.Components.e31 e31Var = this.f33466f;
        e31Var.setColor(w02);
        e31Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.P9, false));
        this.f33470w.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19952h5, false)));
        this.f33467n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20114q5, false));
        this.f33468r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19987j5, false));
        int i10 = org.telegram.ui.ActionBar.j6.Wh;
        this.f33469s.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.h.g();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        FrameLayout frameLayout = this.f33470w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
