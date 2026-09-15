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
    public final ug0 f35150a;
    public final ViewGroup f35151b;
    public final View f35152c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.f31 f35153f;
    public final org.telegram.ui.Components.y10 h;
    public final TextView f35154n;
    public final TextView f35155r;
    public final TextView f35156s;
    public final TextView v;
    public final FrameLayout f35157w;
    public boolean f35158x;
    public final PointF f35159y;

    public kg0(Context context, ViewGroup viewGroup, View view, String str, final ug0 ug0Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        PointF pointF = new PointF();
        this.f35159y = pointF;
        this.f35151b = viewGroup;
        this.f35152c = view;
        this.f35150a = ug0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new hg0(this));
        addView(view2, w7.x5.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.f31 f31Var = new org.telegram.ui.Components.f31(getContext());
        this.f35153f = f31Var;
        f31Var.setTransformType(1);
        f31Var.setDrawBackground(false);
        org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(context, null, false);
        this.h = y10Var;
        y10Var.addView(f31Var, w7.x5.e(56, 56, 17));
        y10Var.a(f31Var);
        y10Var.setOnClickListener(new View.OnClickListener() {
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
        y10Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(y10Var, w7.x5.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35157w = frameLayout;
        addView(frameLayout, w7.x5.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f35154n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        TextView f7 = org.telegram.ui.Cells.p6.f(frameLayout, textView, w7.x5.d(-1, -2.0f, i10, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f35155r = f7;
        f7.setText(str);
        f7.setTextSize(1, 18.0f);
        f7.setTypeface(AndroidUtilities.bold());
        f7.setSingleLine();
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(f7, w7.x5.d(-1, -2.0f, i11, 24.0f, 48.0f, 24.0f, 0.0f));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.f35156s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i14 = org.telegram.ui.ActionBar.i6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.i6.G0(dp2, org.telegram.ui.ActionBar.i6.w0(null, i14, false)));
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
        float f10 = 8;
        TextView f11 = org.telegram.ui.Cells.p6.f(frameLayout, textView2, w7.x5.d(-2, -2.0f, i12 | 80, f10, f10, f10, f10), context);
        this.v = f11;
        f11.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        f11.setSingleLine();
        f11.setTextSize(1, 16.0f);
        f11.setBackground(org.telegram.ui.ActionBar.i6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.i6.w0(null, i14, false)));
        f11.setOnClickListener(new View.OnClickListener() {
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
        f11.setTypeface(typeface);
        f11.setPadding(dp, i15, dp, i15);
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout.addView(f11, w7.x5.d(-2, -2.0f, i13 | 80, f10, f10, f10, f10));
        hh.k.b(view, viewGroup, pointF);
        y10Var.setTranslationX(pointF.x);
        y10Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f35158x) {
            return;
        }
        this.f35158x = true;
        this.f35150a.f37998a.V.f39196b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new jg0(this, 1));
        duration.addUpdateListener(new gg0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.qr.f27423f);
        duration.start();
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.O9, false);
        org.telegram.ui.Components.f31 f31Var = this.f35153f;
        f31Var.setColor(w02);
        f31Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.P9, false));
        this.f35157w.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18907h5, false)));
        this.f35154n.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19073q5, false));
        this.f35155r.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18943j5, false));
        int i10 = org.telegram.ui.ActionBar.i6.Wh;
        this.f35156s.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.h.g();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        FrameLayout frameLayout = this.f35157w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
