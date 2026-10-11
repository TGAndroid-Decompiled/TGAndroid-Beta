package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.cc1;
public final class b51 extends FrameLayout {
    public final ImageView f24861a;
    public final org.telegram.ui.tk f24862b;
    public final cc1 f24863c;
    public final TextView d;
    public final z41 f24864e;
    public final View f24865f;
    public final View h;
    public final d51 f24866n;

    public b51(d51 d51Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.f24866n = d51Var;
        View view = new View(context);
        this.f24865f = view;
        int themedColor = d51Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20857h5);
        String str = d51Var.f25455s;
        view.setBackgroundColor(themedColor);
        addView(view, w7.x5.a(44.0f, 0.0f, 12.0f, 0.0f, 0.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f24861a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i12 = org.telegram.ui.ActionBar.h6.f20894j5;
        int themedColor2 = d51Var.getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(d51Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20877i6), 1, -1));
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final b51 f33090b;

            {
                this.f33090b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.d6 d6Var;
                switch (r2) {
                    case 0:
                        this.f33090b.f24866n.dismiss();
                        return;
                    default:
                        b51 b51Var = this.f33090b;
                        z41 z41Var = b51Var.f24864e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(b51Var.getContext(), null);
                        Drawable mutate = b51Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        d51 d51Var2 = b51Var.f24866n;
                        mutate.setColorFilter(new PorterDuffColorFilter(d51Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i13 = 0; i13 < locales.size(); i13++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i13);
                            if (!localeInfo.pluralLangCode.equals(d51Var2.f25455s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(d51Var2.v, localeInfo.pluralLangCode);
                                Context context2 = b51Var.getContext();
                                if (i13 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                d6Var = ((org.telegram.ui.ActionBar.e3) d51Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, context2, d6Var, z11, z10);
                                e1Var.setText(d51.B(d51.F(localeInfo.pluralLangCode, null, null)));
                                e1Var.setChecked(TextUtils.equals(d51Var2.v, localeInfo.pluralLangCode));
                                e1Var.setOnClickListener(new ai.d0(b51Var, runnableArr, localeInfo, 27));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new qr0(m1Var, 22);
                        m1Var.f21372e = true;
                        m1Var.f21371c = 220;
                        m1Var.setOutsideTouchable(true);
                        m1Var.setClippingEnabled(true);
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        z41Var.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i14 = iArr[1];
                        if (i14 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i14 - measuredHeight2);
                        } else {
                            measuredHeight = (z41Var.getMeasuredHeight() + i14) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.e3) d51Var2).containerView;
                        m1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, w7.x5.a(54.0f, 1.0f, 1.0f, 1.0f, 1.0f, 54, 48));
        org.telegram.ui.tk tkVar = new org.telegram.ui.tk(this, context, 2);
        this.f24862b = tkVar;
        tkVar.setTextColor(d51Var.getThemedColor(i12));
        tkVar.setTextSize(1, 20.0f);
        tkVar.setTypeface(AndroidUtilities.bold());
        tkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        tkVar.setPivotX(0.0f);
        tkVar.setPivotY(0.0f);
        addView(tkVar, w7.x5.a(-2.0f, 22.0f, 20.0f, 22.0f, 0.0f, -1, 55));
        cc1 cc1Var = new cc1(this, context, 11);
        this.f24863c = cc1Var;
        if (LocaleController.isRTL) {
            cc1Var.setGravity(5);
        }
        cc1Var.setPivotX(0.0f);
        cc1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(d51Var.getThemedColor(org.telegram.ui.ActionBar.h6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(d51.B(d51.F(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i13 = org.telegram.ui.ActionBar.h6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(d51Var.getThemedColor(i13), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        z41 z41Var = new z41(this, context);
        this.f24864e = z41Var;
        if (LocaleController.isRTL) {
            z41Var.setGravity(5);
        }
        z41Var.b(0.25f, 350L, is.h);
        z41Var.setTextColor(d51Var.getThemedColor(i13));
        z41Var.setTextSize(AndroidUtilities.dp(14.0f));
        z41Var.setText(d51.B(d51.F(d51Var.v, null, null)));
        z41Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        z41Var.setOnClickListener(new View.OnClickListener(this) {
            public final b51 f33090b;

            {
                this.f33090b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.d6 d6Var;
                switch (r2) {
                    case 0:
                        this.f33090b.f24866n.dismiss();
                        return;
                    default:
                        b51 b51Var = this.f33090b;
                        z41 z41Var2 = b51Var.f24864e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(b51Var.getContext(), null);
                        Drawable mutate = b51Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        d51 d51Var2 = b51Var.f24866n;
                        mutate.setColorFilter(new PorterDuffColorFilter(d51Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i132 = 0; i132 < locales.size(); i132++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i132);
                            if (!localeInfo.pluralLangCode.equals(d51Var2.f25455s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(d51Var2.v, localeInfo.pluralLangCode);
                                Context context2 = b51Var.getContext();
                                if (i132 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                d6Var = ((org.telegram.ui.ActionBar.e3) d51Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, context2, d6Var, z11, z10);
                                e1Var.setText(d51.B(d51.F(localeInfo.pluralLangCode, null, null)));
                                e1Var.setChecked(TextUtils.equals(d51Var2.v, localeInfo.pluralLangCode));
                                e1Var.setOnClickListener(new ai.d0(b51Var, runnableArr, localeInfo, 27));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new qr0(m1Var, 22);
                        m1Var.f21372e = true;
                        m1Var.f21371c = 220;
                        m1Var.setOutsideTouchable(true);
                        m1Var.setClippingEnabled(true);
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        z41Var2.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i14 = iArr[1];
                        if (i14 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i14 - measuredHeight2);
                        } else {
                            measuredHeight = (z41Var2.getMeasuredHeight() + i14) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.e3) d51Var2).containerView;
                        m1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                        return;
                }
            }
        });
        if (LocaleController.isRTL) {
            if (this.d != null) {
                i11 = 3;
            } else {
                i11 = 0;
            }
            cc1Var.addView(z41Var, w7.x5.t(-2, -2, 16, 0, 0, i11, 0));
            if (this.d != null) {
                cc1Var.addView(imageView2, w7.x5.t(-2, -2, 16, 0, 1, 0, 0));
                cc1Var.addView(this.d, w7.x5.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                cc1Var.addView(textView2, w7.x5.t(-2, -2, 16, 0, 0, 4, 0));
                cc1Var.addView(imageView2, w7.x5.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            cc1Var.addView(z41Var, w7.x5.t(-2, -2, 16, i10, 0, 0, 0));
        }
        addView(cc1Var, w7.x5.a(-2.0f, 22.0f, 43.0f, 22.0f, 0.0f, -1, 55));
        View view2 = new View(context);
        this.h = view2;
        view2.setBackgroundColor(d51Var.getThemedColor(org.telegram.ui.ActionBar.h6.V5));
        view2.setAlpha(0.0f);
        addView(view2, w7.x5.a(AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 0.0f, 56.0f, 0.0f, 0.0f, -1, 55));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        float a2 = w7.o.a((f7 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
        if (!d51.w(this.f24866n)) {
            a2 = 1.0f;
        }
        float interpolation = is.f27452g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.tk tkVar = this.f24862b;
        tkVar.setScaleX(lerp);
        tkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        tkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        cc1 cc1Var = this.f24863c;
        if (!z10) {
            tkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            cc1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        cc1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
        float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation);
        ImageView imageView = this.f24861a;
        imageView.setTranslationX(lerp2);
        float f10 = 1.0f - interpolation;
        imageView.setAlpha(f10);
        float lerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(lerp3);
        view.setAlpha(f10);
    }
}
