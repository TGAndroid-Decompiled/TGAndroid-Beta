package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.ApplicationLoaderImpl;
public final class r41 extends org.telegram.ui.ActionBar.t2 {
    public final Drawable f37647j1;
    public final q41 k1;
    public AnimatorSet f37648l1;
    public final View m1;
    public final LinearLayout f37649n1;
    public int f37650o1;
    public final int[] f37651p1;

    public r41(Context context, org.telegram.messenger.d1 d1Var) {
        super(context, false);
        this.f37651p1 = new int[2];
        setCanceledOnTouchOutside(false);
        this.f28619v0 = false;
        this.f28621w0 = false;
        Drawable g7 = k2.p1.g(context, 2131232726);
        this.f37647j1 = g7;
        g7.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false), PorterDuff.Mode.MULTIPLY));
        kw0 kw0Var = new kw0(2, context, this);
        kw0Var.setWillNotDraw(false);
        this.f28586b = kw0Var;
        q41 q41Var = new q41(this, context);
        this.k1 = q41Var;
        q41Var.setFillViewport(true);
        q41Var.setWillNotDraw(false);
        q41Var.setClipToPadding(false);
        q41Var.setVerticalScrollBarEnabled(false);
        kw0Var.addView(q41Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f37649n1 = linearLayout;
        linearLayout.setOrientation(1);
        q41Var.addView(linearLayout, b8.mf.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        int i3 = org.telegram.ui.ActionBar.k6.f27988j5;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(org.telegram.messenger.bd.M0(2131754229, null));
        linearLayout.addView(textView, b8.mf.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new org.telegram.messenger.c0(false));
        int i10 = org.telegram.ui.ActionBar.k6.f28006k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        textView2.setText(org.telegram.messenger.bd.a0(null, null, 2131754242, d1Var.f22118a, Integer.valueOf(d1Var.f22120c)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, b8.mf.t(-2, -2, 49, 23, 0, 23, 5));
        String str = d1Var.f22119b;
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new org.telegram.messenger.c0(false));
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            textView3.setText(org.telegram.messenger.i6.m(str, textView3.getPaint().getFontMetricsInt(), false, null, 0));
            org.telegram.messenger.hs.i(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, b8.mf.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams.bottomMargin = org.telegram.messenger.g0.L(130.0f);
        View view = new View(context);
        this.m1 = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        kw0Var.addView(view, layoutParams);
        gi.d dVar = new gi.d(context, null, true);
        File g10 = org.telegram.messenger.t0.f25456a.g();
        if (g10 != null) {
            dVar.i(org.telegram.messenger.bd.a0(null, null, 2131754225, new Object[0]), false, true);
            dVar.setOnClickListener(new ux0(6, (Object) this, (Object) g10));
        } else {
            dVar.i(org.telegram.messenger.bd.a0(null, null, 2131754227, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final r41 f37064b;

                {
                    this.f37064b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f25456a).q()) {
                                org.telegram.messenger.h1.e().b(false);
                            }
                            this.f37064b.dismiss();
                            return;
                        default:
                            this.f37064b.dismiss();
                            return;
                    }
                }
            });
        }
        kw0Var.addView(dVar, b8.mf.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        gi.d dVar2 = new gi.d(context, null, false);
        dVar2.i(org.telegram.messenger.bd.M0(2131754224, null), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final r41 f37064b;

            {
                this.f37064b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f25456a).q()) {
                            org.telegram.messenger.h1.e().b(false);
                        }
                        this.f37064b.dismiss();
                        return;
                    default:
                        this.f37064b.dismiss();
                        return;
                }
            }
        });
        kw0Var.addView(dVar2, b8.mf.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void I0(r41 r41Var) {
        LinearLayout linearLayout = r41Var.f37649n1;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = r41Var.f37651p1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - org.telegram.messenger.g0.L(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= r41Var.f28586b.getTranslationY() + (r41Var.f28589c.getMeasuredHeight() - org.telegram.messenger.g0.L(113.0f))) {
            r41Var.J0(false);
        } else {
            r41Var.J0(true);
        }
        if (r41Var.f37650o1 != max) {
            r41Var.f37650o1 = max;
            r41Var.k1.invalidate();
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void J0(boolean z10) {
        Integer num;
        float f10;
        View view = this.m1;
        if ((z10 && view.getTag() != null) || (!z10 && view.getTag() == null)) {
            if (z10) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            if (z10) {
                view.setVisibility(0);
            }
            AnimatorSet animatorSet = this.f37648l1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f37648l1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f37648l1.setDuration(150L);
            this.f37648l1.addListener(new s9(24, this, z10));
            this.f37648l1.start();
        }
    }
}
