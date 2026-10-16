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
public final class og0 extends FrameLayout {
    public static final int E = 0;
    public final yg0 f38641a;
    public final ViewGroup f38642b;
    public final View f38643c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.g41 f38644f;
    public final org.telegram.ui.Components.l20 h;
    public final TextView f38645n;
    public final TextView f38646r;
    public final TextView f38647s;
    public final TextView v;
    public final FrameLayout f38648w;
    public boolean f38649x;
    public final PointF f38650y;

    public og0(Context context, ViewGroup viewGroup, View view, String str, final yg0 yg0Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        PointF pointF = new PointF();
        this.f38650y = pointF;
        this.f38642b = viewGroup;
        this.f38643c = view;
        this.f38641a = yg0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new lg0(this));
        addView(view2, w7.z5.d(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, w7.z5.d(-1.0f, -1));
        org.telegram.ui.Components.g41 g41Var = new org.telegram.ui.Components.g41(getContext());
        this.f38644f = g41Var;
        g41Var.setTransformType(1);
        g41Var.setDrawBackground(false);
        org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20(context, null, false);
        this.h = l20Var;
        l20Var.addView(g41Var, w7.z5.e(56, 56, 17));
        l20Var.a(g41Var);
        l20Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        yg0Var.a(this);
                        return;
                    default:
                        yg0Var.a(this);
                        return;
                }
            }
        });
        l20Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(l20Var, w7.z5.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38648w = frameLayout;
        addView(frameLayout, w7.z5.a(140.0f, 24.0f, 0.0f, 24.0f, 0.0f, -1, 49));
        TextView textView = new TextView(context);
        this.f38645n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, w7.z5.a(-2.0f, 24.0f, 20.0f, 24.0f, 0.0f, -1, i10), context);
        this.f38646r = g10;
        g10.setText(str);
        g10.setTextSize(1, 18.0f);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setSingleLine();
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(g10, w7.z5.a(-2.0f, 24.0f, 48.0f, 24.0f, 0.0f, -1, i11));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.f38647s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i14 = org.telegram.ui.ActionBar.g6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.g6.H0(dp2, org.telegram.ui.ActionBar.g6.x0(null, i14, false)));
        textView2.setOnClickListener(new lg0(this, yg0Var));
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
        TextView g11 = org.telegram.ui.Cells.c1.g(frameLayout, textView2, w7.z5.a(-2.0f, f7, f7, f7, f7, -2, i12 | 80), context);
        this.v = g11;
        g11.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        g11.setSingleLine();
        g11.setTextSize(1, 16.0f);
        g11.setBackground(org.telegram.ui.ActionBar.g6.H0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.x0(null, i14, false)));
        g11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        yg0Var.a(this);
                        return;
                    default:
                        yg0Var.a(this);
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
        frameLayout.addView(g11, w7.z5.a(-2.0f, f7, f7, f7, f7, -2, i13 | 80));
        ih.j.b(view, viewGroup, pointF);
        l20Var.setTranslationX(pointF.x);
        l20Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f38649x) {
            return;
        }
        this.f38649x = true;
        this.f38641a.f41826a.V.f33908b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new ng0(this, 1));
        duration.addUpdateListener(new kg0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.es.f24465f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.O9, false);
        org.telegram.ui.Components.g41 g41Var = this.f38644f;
        g41Var.setColor(x02);
        g41Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.P9, false));
        this.f38648w.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false)));
        this.f38645n.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19838q5, false));
        this.f38646r.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false));
        int i10 = org.telegram.ui.ActionBar.g6.Wh;
        this.f38647s.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        this.h.g();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        FrameLayout frameLayout = this.f38648w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
