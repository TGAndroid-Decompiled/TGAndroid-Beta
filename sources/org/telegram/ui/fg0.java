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
public final class fg0 extends FrameLayout {
    public static final int E = 0;
    public final pg0 f33312a;
    public final ViewGroup f33313b;
    public final View f33314c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.e31 f33315f;
    public final org.telegram.ui.Components.z10 h;
    public final TextView f33316n;
    public final TextView f33317r;
    public final TextView f33318s;
    public final TextView v;
    public final FrameLayout f33319w;
    public boolean f33320x;
    public final PointF f33321y;

    public fg0(Context context, ViewGroup viewGroup, View view, String str, final pg0 pg0Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        PointF pointF = new PointF();
        this.f33321y = pointF;
        this.f33313b = viewGroup;
        this.f33314c = view;
        this.f33312a = pg0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new cg0(this));
        addView(view2, w7.x5.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.e31 e31Var = new org.telegram.ui.Components.e31(getContext());
        this.f33315f = e31Var;
        e31Var.setTransformType(1);
        e31Var.setDrawBackground(false);
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(context, null, false);
        this.h = z10Var;
        z10Var.addView(e31Var, w7.x5.e(56, 56, 17));
        z10Var.a(e31Var);
        z10Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        pg0Var.a(this);
                        return;
                    default:
                        pg0Var.a(this);
                        return;
                }
            }
        });
        z10Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(z10Var, w7.x5.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33319w = frameLayout;
        addView(frameLayout, w7.x5.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f33316n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        TextView f7 = org.telegram.ui.Cells.q3.f(frameLayout, textView, w7.x5.d(-1, -2.0f, i10, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f33317r = f7;
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
        this.f33318s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i14 = org.telegram.ui.ActionBar.h6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.h6.G0(dp2, org.telegram.ui.ActionBar.h6.w0(null, i14, false)));
        textView2.setOnClickListener(new cg0(this, pg0Var));
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
        TextView f11 = org.telegram.ui.Cells.q3.f(frameLayout, textView2, w7.x5.d(-2, -2.0f, i12 | 80, f10, f10, f10, f10), context);
        this.v = f11;
        f11.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        f11.setSingleLine();
        f11.setTextSize(1, 16.0f);
        f11.setBackground(org.telegram.ui.ActionBar.h6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.w0(null, i14, false)));
        f11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        pg0Var.a(this);
                        return;
                    default:
                        pg0Var.a(this);
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
        z10Var.setTranslationX(pointF.x);
        z10Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f33320x) {
            return;
        }
        this.f33320x = true;
        this.f33312a.f36108a.V.f36821b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new eg0(this, 1));
        duration.addUpdateListener(new bg0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.rr.f27701f);
        duration.start();
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.O9, false);
        org.telegram.ui.Components.e31 e31Var = this.f33315f;
        e31Var.setColor(w02);
        e31Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.P9, false));
        this.f33319w.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18859h5, false)));
        this.f33316n.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19025q5, false));
        this.f33317r.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18895j5, false));
        int i10 = org.telegram.ui.ActionBar.h6.Wh;
        this.f33318s.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.h.g();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        FrameLayout frameLayout = this.f33319w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
