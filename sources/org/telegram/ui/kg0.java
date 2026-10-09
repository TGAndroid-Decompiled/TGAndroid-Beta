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
public final class kg0 extends FrameLayout {
    public static final int E = 0;
    public final ug0 f39279a;
    public final ViewGroup f39280b;
    public final View f39281c;
    public final View d;
    public final View f39282e;
    public final org.telegram.ui.Components.k41 f39283f;
    public final org.telegram.ui.Components.p20 h;
    public final TextView f39284n;
    public final TextView f39285r;
    public final TextView f39286s;
    public final TextView v;
    public final FrameLayout f39287w;
    public boolean f39288x;
    public final PointF f39289y;

    public kg0(Context context, ViewGroup viewGroup, View view, String str, final ug0 ug0Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        PointF pointF = new PointF();
        this.f39289y = pointF;
        this.f39280b = viewGroup;
        this.f39281c = view;
        this.f39279a = ug0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new hg0(this));
        addView(view2, w7.x5.d(-1.0f, -1));
        View view3 = new View(getContext());
        this.f39282e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, w7.x5.d(-1.0f, -1));
        org.telegram.ui.Components.k41 k41Var = new org.telegram.ui.Components.k41(getContext());
        this.f39283f = k41Var;
        k41Var.setTransformType(1);
        k41Var.setDrawBackground(false);
        org.telegram.ui.Components.p20 p20Var = new org.telegram.ui.Components.p20(context, null, false);
        this.h = p20Var;
        p20Var.addView(k41Var, w7.x5.e(56, 56, 17));
        p20Var.a(k41Var);
        p20Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        ug0Var.a(this);
                        return;
                    default:
                        ug0Var.a(this);
                        return;
                }
            }
        });
        p20Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(p20Var, w7.x5.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39287w = frameLayout;
        addView(frameLayout, w7.x5.a(140.0f, 24.0f, 0.0f, 24.0f, 0.0f, -1, 49));
        TextView textView = new TextView(context);
        this.f39284n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, w7.x5.a(-2.0f, 24.0f, 20.0f, 24.0f, 0.0f, -1, i10), context);
        this.f39285r = g10;
        g10.setText(str);
        g10.setTextSize(1, 18.0f);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setSingleLine();
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(g10, w7.x5.a(-2.0f, 24.0f, 48.0f, 24.0f, 0.0f, -1, i11));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.f39286s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i14 = org.telegram.ui.ActionBar.i6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.i6.H0(dp2, org.telegram.ui.ActionBar.i6.x0(null, i14, false)));
        textView2.setOnClickListener(new hg0(this, ug0Var));
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
        TextView g11 = org.telegram.ui.Cells.c1.g(frameLayout, textView2, w7.x5.a(-2.0f, f7, f7, f7, f7, -2, i12 | 80), context);
        this.v = g11;
        g11.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        g11.setSingleLine();
        g11.setTextSize(1, 16.0f);
        g11.setBackground(org.telegram.ui.ActionBar.i6.H0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.i6.x0(null, i14, false)));
        g11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        ug0Var.a(this);
                        return;
                    default:
                        ug0Var.a(this);
                        return;
                }
            }
        });
        g11.setTypeface(typeface);
        g11.setPadding(dp, i15, dp, i15);
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout.addView(g11, w7.x5.a(-2.0f, f7, f7, f7, f7, -2, i13 | 80));
        hh.j.b(view, viewGroup, pointF);
        p20Var.setTranslationX(pointF.x);
        p20Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f39288x) {
            return;
        }
        this.f39288x = true;
        this.f39279a.f42429a.V.f43577b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new jg0(this, 1));
        duration.addUpdateListener(new gg0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.hs.f27118f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.O9, false);
        org.telegram.ui.Components.k41 k41Var = this.f39283f;
        k41Var.setColor(x02);
        k41Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.P9, false));
        this.f39287w.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false)));
        this.f39284n.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21036q5, false));
        this.f39285r.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20905j5, false));
        int i10 = org.telegram.ui.ActionBar.i6.Wh;
        this.f39286s.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        this.h.g();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        FrameLayout frameLayout = this.f39287w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
