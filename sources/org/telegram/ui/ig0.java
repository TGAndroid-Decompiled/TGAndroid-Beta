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
public final class ig0 extends FrameLayout {
    public static final int E = 0;
    public final sg0 f37410a;
    public final ViewGroup f37411b;
    public final View f37412c;
    public final View d;
    public final View f37413e;
    public final org.telegram.ui.Components.e41 f37414f;
    public final org.telegram.ui.Components.c20 h;
    public final TextView f37415n;
    public final TextView f37416r;
    public final TextView f37417s;
    public final TextView v;
    public final FrameLayout f37418w;
    public boolean f37419x;
    public final PointF f37420y;

    public ig0(Context context, ViewGroup viewGroup, View view, String str, final sg0 sg0Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        PointF pointF = new PointF();
        this.f37420y = pointF;
        this.f37411b = viewGroup;
        this.f37412c = view;
        this.f37410a = sg0Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new fg0(this));
        addView(view2, w7.z5.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.f37413e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.e41 e41Var = new org.telegram.ui.Components.e41(getContext());
        this.f37414f = e41Var;
        e41Var.setTransformType(1);
        e41Var.setDrawBackground(false);
        org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(context, null, false);
        this.h = c20Var;
        c20Var.addView(e41Var, w7.z5.e(56, 56, 17));
        c20Var.a(e41Var);
        c20Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        sg0Var.a(this);
                        return;
                    default:
                        sg0Var.a(this);
                        return;
                }
            }
        });
        c20Var.setContentDescription(LocaleController.getString(R.string.Done));
        addView(c20Var, w7.z5.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37418w = frameLayout;
        addView(frameLayout, w7.z5.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f37415n = textView;
        textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        TextView i14 = org.telegram.ui.Cells.c1.i(frameLayout, textView, w7.z5.d(-1, -2.0f, i10, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f37416r = i14;
        i14.setText(str);
        i14.setTextSize(1, 18.0f);
        i14.setTypeface(AndroidUtilities.bold());
        i14.setSingleLine();
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(i14, w7.z5.d(-1, -2.0f, i11, 24.0f, 48.0f, 24.0f, 0.0f));
        int dp = AndroidUtilities.dp(16.0f);
        TextView textView2 = new TextView(context);
        this.f37417s = textView2;
        textView2.setText(LocaleController.getString(R.string.Edit));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i15 = org.telegram.ui.ActionBar.i6.Wh;
        textView2.setBackground(org.telegram.ui.ActionBar.i6.G0(dp2, org.telegram.ui.ActionBar.i6.w0(null, i15, false)));
        textView2.setOnClickListener(new fg0(this, sg0Var));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i16 = dp / 2;
        textView2.setPadding(dp, i16, dp, i16);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        float f7 = 8;
        TextView i17 = org.telegram.ui.Cells.c1.i(frameLayout, textView2, w7.z5.d(-2, -2.0f, i12 | 80, f7, f7, f7, f7), context);
        this.v = i17;
        i17.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        i17.setSingleLine();
        i17.setTextSize(1, 16.0f);
        i17.setBackground(org.telegram.ui.ActionBar.i6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.i6.w0(null, i15, false)));
        i17.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        sg0Var.a(this);
                        return;
                    default:
                        sg0Var.a(this);
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
        frameLayout.addView(i17, w7.z5.d(-2, -2.0f, i13 | 80, f7, f7, f7, f7));
        hh.k.b(view, viewGroup, pointF);
        c20Var.setTranslationX(pointF.x);
        c20Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f37419x) {
            return;
        }
        this.f37419x = true;
        this.f37410a.f40493a.V.f41239b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new hg0(this, 1));
        duration.addUpdateListener(new eg0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.tr.f31215f);
        duration.start();
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.O9, false);
        org.telegram.ui.Components.e41 e41Var = this.f37414f;
        e41Var.setColor(w02);
        e41Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.P9, false));
        this.f37418w.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20899h5, false)));
        this.f37415n.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21067q5, false));
        this.f37416r.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20935j5, false));
        int i10 = org.telegram.ui.ActionBar.i6.Wh;
        this.f37417s.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.v.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.h.g();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        FrameLayout frameLayout = this.f37418w;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - AndroidUtilities.dp(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
