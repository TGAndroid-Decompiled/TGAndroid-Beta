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
import org.telegram.ui.ua1;
public final class i31 extends FrameLayout {
    public final ImageView f29310a;
    public final org.telegram.ui.jk f29311b;
    public final ua1 f29312c;
    public final TextView d;
    public final g31 f29313e;
    public final View f29314f;
    public final k31 h;

    public i31(k31 k31Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.h = k31Var;
        View view = new View(context);
        int themedColor = k31Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5);
        String str = k31Var.f29912s;
        view.setBackgroundColor(themedColor);
        addView(view, i7.f6.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f29310a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i12 = org.telegram.ui.ActionBar.g6.f23169j5;
        int themedColor2 = k31Var.getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(k31Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23152i6), 1, -1));
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final i31 f28303b;

            {
                this.f28303b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.c6 c6Var;
                switch (r2) {
                    case 0:
                        this.f28303b.h.dismiss();
                        return;
                    default:
                        i31 i31Var = this.f28303b;
                        g31 g31Var = i31Var.f29313e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i31Var.getContext(), null);
                        Drawable mutate = i31Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        k31 k31Var2 = i31Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(k31Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i13 = 0; i13 < locales.size(); i13++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i13);
                            if (!localeInfo.pluralLangCode.equals(k31Var2.f29912s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(k31Var2.v, localeInfo.pluralLangCode);
                                Context context2 = i31Var.getContext();
                                if (i13 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                c6Var = ((org.telegram.ui.ActionBar.f3) k31Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, context2, c6Var, z11, z10);
                                g1Var.setText(k31.y(k31.D(localeInfo.pluralLangCode, null, null)));
                                g1Var.setChecked(TextUtils.equals(k31Var2.v, localeInfo.pluralLangCode));
                                g1Var.setOnClickListener(new ya0(i31Var, runnableArr, localeInfo, 3));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new fq0(o1Var, 22);
                        o1Var.f23712e = true;
                        o1Var.f23711c = 220;
                        o1Var.setOutsideTouchable(true);
                        o1Var.setClippingEnabled(true);
                        o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        o1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        g31Var.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i14 = iArr[1];
                        if (i14 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i14 - measuredHeight2);
                        } else {
                            measuredHeight = (g31Var.getMeasuredHeight() + i14) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.f3) k31Var2).containerView;
                        o1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, i7.f6.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.jk jkVar = new org.telegram.ui.jk(this, context, 2);
        this.f29311b = jkVar;
        jkVar.setTextColor(k31Var.getThemedColor(i12));
        jkVar.setTextSize(1, 20.0f);
        jkVar.setTypeface(AndroidUtilities.bold());
        jkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        jkVar.setPivotX(0.0f);
        jkVar.setPivotY(0.0f);
        addView(jkVar, i7.f6.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        ua1 ua1Var = new ua1(this, context, 13);
        this.f29312c = ua1Var;
        if (LocaleController.isRTL) {
            ua1Var.setGravity(5);
        }
        ua1Var.setPivotX(0.0f);
        ua1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(k31Var.getThemedColor(org.telegram.ui.ActionBar.g6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(k31.y(k31.D(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i13 = org.telegram.ui.ActionBar.g6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(k31Var.getThemedColor(i13), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        g31 g31Var = new g31(this, context);
        this.f29313e = g31Var;
        if (LocaleController.isRTL) {
            g31Var.setGravity(5);
        }
        g31Var.b(0.25f, 350L, jr.h);
        g31Var.setTextColor(k31Var.getThemedColor(i13));
        g31Var.setTextSize(AndroidUtilities.dp(14.0f));
        g31Var.setText(k31.y(k31.D(k31Var.v, null, null)));
        g31Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        g31Var.setOnClickListener(new View.OnClickListener(this) {
            public final i31 f28303b;

            {
                this.f28303b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.c6 c6Var;
                switch (r2) {
                    case 0:
                        this.f28303b.h.dismiss();
                        return;
                    default:
                        i31 i31Var = this.f28303b;
                        g31 g31Var2 = i31Var.f29313e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i31Var.getContext(), null);
                        Drawable mutate = i31Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        k31 k31Var2 = i31Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(k31Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i132 = 0; i132 < locales.size(); i132++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i132);
                            if (!localeInfo.pluralLangCode.equals(k31Var2.f29912s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(k31Var2.v, localeInfo.pluralLangCode);
                                Context context2 = i31Var.getContext();
                                if (i132 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                c6Var = ((org.telegram.ui.ActionBar.f3) k31Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, context2, c6Var, z11, z10);
                                g1Var.setText(k31.y(k31.D(localeInfo.pluralLangCode, null, null)));
                                g1Var.setChecked(TextUtils.equals(k31Var2.v, localeInfo.pluralLangCode));
                                g1Var.setOnClickListener(new ya0(i31Var, runnableArr, localeInfo, 3));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new fq0(o1Var, 22);
                        o1Var.f23712e = true;
                        o1Var.f23711c = 220;
                        o1Var.setOutsideTouchable(true);
                        o1Var.setClippingEnabled(true);
                        o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        o1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        g31Var2.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i14 = iArr[1];
                        if (i14 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i14 - measuredHeight2);
                        } else {
                            measuredHeight = (g31Var2.getMeasuredHeight() + i14) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.f3) k31Var2).containerView;
                        o1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
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
            ua1Var.addView(g31Var, i7.f6.t(-2, -2, 16, 0, 0, i11, 0));
            if (this.d != null) {
                ua1Var.addView(imageView2, i7.f6.t(-2, -2, 16, 0, 1, 0, 0));
                ua1Var.addView(this.d, i7.f6.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                ua1Var.addView(textView2, i7.f6.t(-2, -2, 16, 0, 0, 4, 0));
                ua1Var.addView(imageView2, i7.f6.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            ua1Var.addView(g31Var, i7.f6.t(-2, -2, 16, i10, 0, 0, 0));
        }
        addView(ua1Var, i7.f6.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.f29314f = view2;
        view2.setBackgroundColor(k31Var.getThemedColor(org.telegram.ui.ActionBar.g6.V5));
        view2.setAlpha(0.0f);
        addView(view2, i7.f6.d(-1, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        float a2 = i7.w.a((f9 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
        if (!k31.u(this.h)) {
            a2 = 1.0f;
        }
        float interpolation = jr.f29801g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.jk jkVar = this.f29311b;
        jkVar.setScaleX(lerp);
        jkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        jkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        ua1 ua1Var = this.f29312c;
        if (!z10) {
            jkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            ua1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        ua1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
        float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation);
        ImageView imageView = this.f29310a;
        imageView.setTranslationX(lerp2);
        float f10 = 1.0f - interpolation;
        imageView.setAlpha(f10);
        float lerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation);
        View view = this.f29314f;
        view.setTranslationY(lerp3);
        view.setAlpha(f10);
    }
}
