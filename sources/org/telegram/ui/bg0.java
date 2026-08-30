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
public final class bg0 extends FrameLayout {
    public static final int B = 0;
    public final lg0 f32954a;
    public final ViewGroup f32955b;
    public final View f32956c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.e31 f32957f;
    public final org.telegram.ui.Components.z10 h;
    public final TextView f32958n;
    public final TextView f32959r;
    public final TextView f32960s;
    public final TextView v;
    public final FrameLayout f32961w;
    public boolean f32962x;
    public final PointF f32963y;

    public bg0(Context context, ViewGroup viewGroup, View view, String str, final lg0 lg0Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        PointF pointF = new PointF();
        this.f32963y = pointF;
        this.f32955b = viewGroup;
        this.f32956c = view;
        this.f32954a = lg0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new yf0(this));
        addView(view2, k7.b6.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.e31 e31Var = new org.telegram.ui.Components.e31(getContext());
        this.f32957f = e31Var;
        e31Var.setTransformType(1);
        e31Var.setDrawBackground(false);
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(context, null, false);
        this.h = z10Var;
        z10Var.addView(e31Var, k7.b6.e(56, 56, 17));
        z10Var.a(e31Var);
        z10Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        lg0Var.a(this);
                        return;
                    default:
                        lg0Var.a(this);
                        return;
                }
            }
        });
        z10Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(z10Var, k7.b6.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32961w = frameLayout;
        addView(frameLayout, k7.b6.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f32958n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        TextView i14 = yh.i(frameLayout, textView, k7.b6.d(-1, -2.0f, i10, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f32959r = i14;
        i14.setText(str);
        i14.setTextSize(1, 18.0f);
        i14.setTypeface(AndroidUtilities.bold());
        i14.setSingleLine();
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(i14, k7.b6.d(-1, -2.0f, i11, 24.0f, 48.0f, 24.0f, 0.0f));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.f32960s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i15 = org.telegram.ui.ActionBar.j6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.G0(dp2, org.telegram.ui.ActionBar.j6.w0(null, i15, false)));
        textView2.setOnClickListener(new yf0(this, lg0Var));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i16 = dp / 2;
        textView2.setPadding(dp, i16, dp, i16);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        float f10 = 8;
        TextView i17 = yh.i(frameLayout, textView2, k7.b6.d(-2, -2.0f, i12 | 80, f10, f10, f10, f10), context);
        this.v = i17;
        i17.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        i17.setSingleLine();
        i17.setTextSize(1, 16.0f);
        i17.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.w0(null, i15, false)));
        i17.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        lg0Var.a(this);
                        return;
                    default:
                        lg0Var.a(this);
                        return;
                }
            }
        });
        i17.setTypeface(typeface);
        i17.setPadding(dp, i16, dp, i16);
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout.addView(i17, k7.b6.d(-2, -2.0f, i13 | 80, f10, f10, f10, f10));
        ug.i.b(view, viewGroup, pointF);
        z10Var.setTranslationX(pointF.x);
        z10Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f32962x) {
            return;
        }
        this.f32962x = true;
        this.f32954a.f36081a.S.Y = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new ag0(this, 1));
        duration.addUpdateListener(new xf0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.nr.f27346f);
        duration.start();
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false);
        org.telegram.ui.Components.e31 e31Var = this.f32957f;
        e31Var.setColor(w02);
        e31Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.P9, false));
        this.f32961w.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19977h5, false)));
        this.f32958n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20139q5, false));
        this.f32959r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false));
        int i10 = org.telegram.ui.ActionBar.j6.Wh;
        this.f32960s.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.h.g();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        FrameLayout frameLayout = this.f32961w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
