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
public final class mg0 extends FrameLayout {
    public static final int E = 0;
    public final wg0 f35743a;
    public final ViewGroup f35744b;
    public final View f35745c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.v31 f35746f;
    public final org.telegram.ui.Components.y10 h;
    public final TextView f35747n;
    public final TextView f35748r;
    public final TextView f35749s;
    public final TextView v;
    public final FrameLayout f35750w;
    public boolean f35751x;
    public final PointF f35752y;

    public mg0(Context context, ViewGroup viewGroup, View view, String str, final wg0 wg0Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        PointF pointF = new PointF();
        this.f35752y = pointF;
        this.f35744b = viewGroup;
        this.f35745c = view;
        this.f35743a = wg0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new jg0(this));
        addView(view2, w7.y5.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, w7.y5.c(-1.0f, -1));
        org.telegram.ui.Components.v31 v31Var = new org.telegram.ui.Components.v31(getContext());
        this.f35746f = v31Var;
        v31Var.setTransformType(1);
        v31Var.setDrawBackground(false);
        org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(context, null, false);
        this.h = y10Var;
        y10Var.addView(v31Var, w7.y5.e(56, 56, 17));
        y10Var.a(v31Var);
        y10Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        wg0Var.a(this);
                        return;
                    default:
                        wg0Var.a(this);
                        return;
                }
            }
        });
        y10Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(y10Var, w7.y5.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35750w = frameLayout;
        addView(frameLayout, w7.y5.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f35747n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        TextView h = org.telegram.ui.Cells.c1.h(frameLayout, textView, w7.y5.d(-1, -2.0f, i10, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f35748r = h;
        h.setText(str);
        h.setTextSize(1, 18.0f);
        h.setTypeface(AndroidUtilities.bold());
        h.setSingleLine();
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(h, w7.y5.d(-1, -2.0f, i11, 24.0f, 48.0f, 24.0f, 0.0f));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.f35749s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i14 = org.telegram.ui.ActionBar.j6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.G0(dp2, org.telegram.ui.ActionBar.j6.w0(null, i14, false)));
        textView2.setOnClickListener(new jg0(this, wg0Var));
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
        TextView h10 = org.telegram.ui.Cells.c1.h(frameLayout, textView2, w7.y5.d(-2, -2.0f, i12 | 80, f7, f7, f7, f7), context);
        this.v = h10;
        h10.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        h10.setSingleLine();
        h10.setTextSize(1, 16.0f);
        h10.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.w0(null, i14, false)));
        h10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        wg0Var.a(this);
                        return;
                    default:
                        wg0Var.a(this);
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
        frameLayout.addView(h10, w7.y5.d(-2, -2.0f, i13 | 80, f7, f7, f7, f7));
        hh.k.b(view, viewGroup, pointF);
        y10Var.setTranslationX(pointF.x);
        y10Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f35751x) {
            return;
        }
        this.f35751x = true;
        this.f35743a.f39167a.V.f39932b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new lg0(this, 1));
        duration.addUpdateListener(new ig0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.qr.f27653f);
        duration.start();
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false);
        org.telegram.ui.Components.v31 v31Var = this.f35746f;
        v31Var.setColor(w02);
        v31Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.P9, false));
        this.f35750w.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19180h5, false)));
        this.f35747n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19347q5, false));
        this.f35748r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19216j5, false));
        int i10 = org.telegram.ui.ActionBar.j6.Wh;
        this.f35749s.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.h.g();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        FrameLayout frameLayout = this.f35750w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
