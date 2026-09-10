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
    public final vg0 f34357a;
    public final ViewGroup f34358b;
    public final View f34359c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.s31 f34360f;
    public final org.telegram.ui.Components.h20 h;
    public final TextView f34361n;
    public final TextView f34362r;
    public final TextView f34363s;
    public final TextView v;
    public final FrameLayout f34364w;
    public boolean f34365x;
    public final PointF f34366y;

    public kg0(Context context, ViewGroup viewGroup, View view, String str, final vg0 vg0Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        PointF pointF = new PointF();
        this.f34366y = pointF;
        this.f34358b = viewGroup;
        this.f34359c = view;
        this.f34357a = vg0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new hg0(this));
        addView(view2, w7.a6.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, w7.a6.c(-1.0f, -1));
        org.telegram.ui.Components.s31 s31Var = new org.telegram.ui.Components.s31(getContext());
        this.f34360f = s31Var;
        s31Var.setTransformType(1);
        s31Var.setDrawBackground(false);
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, null, false);
        this.h = h20Var;
        h20Var.addView(s31Var, w7.a6.e(56, 56, 17));
        h20Var.a(s31Var);
        h20Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        vg0Var.a(this);
                        return;
                    default:
                        vg0Var.a(this);
                        return;
                }
            }
        });
        h20Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(h20Var, w7.a6.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34364w = frameLayout;
        addView(frameLayout, w7.a6.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f34361n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        TextView f7 = org.telegram.ui.Cells.r6.f(frameLayout, textView, w7.a6.d(-1, -2.0f, i10, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f34362r = f7;
        f7.setText(str);
        f7.setTextSize(1, 18.0f);
        f7.setTypeface(AndroidUtilities.bold());
        f7.setSingleLine();
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(f7, w7.a6.d(-1, -2.0f, i11, 24.0f, 48.0f, 24.0f, 0.0f));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.f34363s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i14 = org.telegram.ui.ActionBar.j6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.G0(dp2, org.telegram.ui.ActionBar.j6.w0(null, i14, false)));
        textView2.setOnClickListener(new hg0(this, vg0Var));
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
        TextView f11 = org.telegram.ui.Cells.r6.f(frameLayout, textView2, w7.a6.d(-2, -2.0f, i12 | 80, f10, f10, f10, f10), context);
        this.v = f11;
        f11.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        f11.setSingleLine();
        f11.setTextSize(1, 16.0f);
        f11.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.w0(null, i14, false)));
        f11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        vg0Var.a(this);
                        return;
                    default:
                        vg0Var.a(this);
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
        frameLayout.addView(f11, w7.a6.d(-2, -2.0f, i13 | 80, f10, f10, f10, f10));
        gh.k.b(view, viewGroup, pointF);
        h20Var.setTranslationX(pointF.x);
        h20Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f34365x) {
            return;
        }
        this.f34365x = true;
        this.f34357a.f37554a.V.f38720b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new jg0(this, 1));
        duration.addUpdateListener(new gg0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.wr.f28819f);
        duration.start();
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false);
        org.telegram.ui.Components.s31 s31Var = this.f34360f;
        s31Var.setColor(w02);
        s31Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.P9, false));
        this.f34364w.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false)));
        this.f34361n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18161q5, false));
        this.f34362r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false));
        int i10 = org.telegram.ui.ActionBar.j6.Wh;
        this.f34363s.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.h.g();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        FrameLayout frameLayout = this.f34364w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
