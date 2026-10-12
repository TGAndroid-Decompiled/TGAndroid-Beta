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
public final class pg0 extends FrameLayout {
    public static final int E = 0;
    public final zg0 f39215a;
    public final ViewGroup f39216b;
    public final View f39217c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.g41 f39218f;
    public final org.telegram.ui.Components.l20 h;
    public final TextView f39219n;
    public final TextView f39220r;
    public final TextView f39221s;
    public final TextView v;
    public final FrameLayout f39222w;
    public boolean f39223x;
    public final PointF f39224y;

    public pg0(Context context, ViewGroup viewGroup, View view, String str, final zg0 zg0Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        PointF pointF = new PointF();
        this.f39224y = pointF;
        this.f39216b = viewGroup;
        this.f39217c = view;
        this.f39215a = zg0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new mg0(this));
        addView(view2, w7.a6.d(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, w7.a6.d(-1.0f, -1));
        org.telegram.ui.Components.g41 g41Var = new org.telegram.ui.Components.g41(getContext());
        this.f39218f = g41Var;
        g41Var.setTransformType(1);
        g41Var.setDrawBackground(false);
        org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20(context, null, false);
        this.h = l20Var;
        l20Var.addView(g41Var, w7.a6.e(56, 56, 17));
        l20Var.a(g41Var);
        l20Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        zg0Var.a(this);
                        return;
                    default:
                        zg0Var.a(this);
                        return;
                }
            }
        });
        l20Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(l20Var, w7.a6.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39222w = frameLayout;
        addView(frameLayout, w7.a6.a(140.0f, 24.0f, 0.0f, 24.0f, 0.0f, -1, 49));
        TextView textView = new TextView(context);
        this.f39219n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        TextView h = org.telegram.ui.Cells.d0.h(frameLayout, textView, w7.a6.a(-2.0f, 24.0f, 20.0f, 24.0f, 0.0f, -1, i10), context);
        this.f39220r = h;
        h.setText(str);
        h.setTextSize(1, 18.0f);
        h.setTypeface(AndroidUtilities.bold());
        h.setSingleLine();
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(h, w7.a6.a(-2.0f, 24.0f, 48.0f, 24.0f, 0.0f, -1, i11));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.f39221s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i14 = org.telegram.ui.ActionBar.g6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.g6.H0(dp2, org.telegram.ui.ActionBar.g6.x0(null, i14, false)));
        textView2.setOnClickListener(new mg0(this, zg0Var));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i15 = dp / 2;
        textView2.setPadding(dp, i15, dp, i15);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        float f7 = 8;
        TextView h10 = org.telegram.ui.Cells.d0.h(frameLayout, textView2, w7.a6.a(-2.0f, f7, f7, f7, f7, -2, i12 | 80), context);
        this.v = h10;
        h10.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        h10.setSingleLine();
        h10.setTextSize(1, 16.0f);
        h10.setBackground(org.telegram.ui.ActionBar.g6.H0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.x0(null, i14, false)));
        h10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        zg0Var.a(this);
                        return;
                    default:
                        zg0Var.a(this);
                        return;
                }
            }
        });
        h10.setTypeface(typeface);
        h10.setPadding(dp, i15, dp, i15);
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout.addView(h10, w7.a6.a(-2.0f, f7, f7, f7, f7, -2, i13 | 80));
        ih.j.b(view, viewGroup, pointF);
        l20Var.setTranslationX(pointF.x);
        l20Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f39223x) {
            return;
        }
        this.f39223x = true;
        this.f39215a.f42617a.V.f34546b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new og0(this, 1));
        duration.addUpdateListener(new lg0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.es.f24771f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.O9, false);
        org.telegram.ui.Components.g41 g41Var = this.f39218f;
        g41Var.setColor(x02);
        g41Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.P9, false));
        this.f39222w.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19972h5, false)));
        this.f39219n.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20138q5, false));
        this.f39220r.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20007j5, false));
        int i10 = org.telegram.ui.ActionBar.g6.Wh;
        this.f39221s.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        this.h.g();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        FrameLayout frameLayout = this.f39222w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
