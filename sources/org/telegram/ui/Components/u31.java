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
import org.telegram.ui.ib1;
public final class u31 extends FrameLayout {
    public final ImageView f31543a;
    public final org.telegram.ui.pk f31544b;
    public final ib1 f31545c;
    public final TextView d;
    public final s31 f31546e;
    public final View f31547f;
    public final w31 h;

    public u31(w31 w31Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.h = w31Var;
        View view = new View(context);
        int themedColor = w31Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5);
        String str = w31Var.f32636s;
        view.setBackgroundColor(themedColor);
        addView(view, k7.c6.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f31543a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i12 = org.telegram.ui.ActionBar.k6.f21766j5;
        int themedColor2 = w31Var.getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(w31Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21750i6), 1, -1));
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final u31 f30269b;

            {
                this.f30269b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z4;
                org.telegram.ui.ActionBar.g6 g6Var;
                switch (r2) {
                    case 0:
                        this.f30269b.h.dismiss();
                        return;
                    default:
                        u31 u31Var = this.f30269b;
                        s31 s31Var = u31Var.f31546e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(u31Var.getContext(), null);
                        Drawable mutate = u31Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        w31 w31Var2 = u31Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(w31Var2.getThemedColor(org.telegram.ui.ActionBar.k6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z10 = true;
                        for (int i13 = 0; i13 < locales.size(); i13++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i13);
                            if (!localeInfo.pluralLangCode.equals(w31Var2.f32636s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(w31Var2.v, localeInfo.pluralLangCode);
                                Context context2 = u31Var.getContext();
                                if (i13 == locales.size() - 1) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                g6Var = ((org.telegram.ui.ActionBar.h3) w31Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, context2, g6Var, z10, z4);
                                g1Var.setText(w31.y(w31.D(localeInfo.pluralLangCode, null, null)));
                                g1Var.setChecked(TextUtils.equals(w31Var2.v, localeInfo.pluralLangCode));
                                g1Var.setOnClickListener(new r31(u31Var, runnableArr, localeInfo, 0));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                                z10 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new oq0(p1Var, 22);
                        p1Var.f22218e = true;
                        p1Var.f22217c = 220;
                        p1Var.setOutsideTouchable(true);
                        p1Var.setClippingEnabled(true);
                        p1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        p1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        s31Var.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i14 = iArr[1];
                        if (i14 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i14 - measuredHeight2);
                        } else {
                            measuredHeight = (s31Var.getMeasuredHeight() + i14) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.h3) w31Var2).containerView;
                        p1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, k7.c6.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, context, 2);
        this.f31544b = pkVar;
        pkVar.setTextColor(w31Var.getThemedColor(i12));
        pkVar.setTextSize(1, 20.0f);
        pkVar.setTypeface(AndroidUtilities.bold());
        pkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        pkVar.setPivotX(0.0f);
        pkVar.setPivotY(0.0f);
        addView(pkVar, k7.c6.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        ib1 ib1Var = new ib1(this, context, 12);
        this.f31545c = ib1Var;
        if (LocaleController.isRTL) {
            ib1Var.setGravity(5);
        }
        ib1Var.setPivotX(0.0f);
        ib1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(w31Var.getThemedColor(org.telegram.ui.ActionBar.k6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(w31.y(w31.D(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i13 = org.telegram.ui.ActionBar.k6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(w31Var.getThemedColor(i13), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        s31 s31Var = new s31(this, context);
        this.f31546e = s31Var;
        if (LocaleController.isRTL) {
            s31Var.setGravity(5);
        }
        s31Var.b(0.25f, 350L, pr.h);
        s31Var.setTextColor(w31Var.getThemedColor(i13));
        s31Var.setTextSize(AndroidUtilities.dp(14.0f));
        s31Var.setText(w31.y(w31.D(w31Var.v, null, null)));
        s31Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        s31Var.setOnClickListener(new View.OnClickListener(this) {
            public final u31 f30269b;

            {
                this.f30269b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z4;
                org.telegram.ui.ActionBar.g6 g6Var;
                switch (r2) {
                    case 0:
                        this.f30269b.h.dismiss();
                        return;
                    default:
                        u31 u31Var = this.f30269b;
                        s31 s31Var2 = u31Var.f31546e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(u31Var.getContext(), null);
                        Drawable mutate = u31Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        w31 w31Var2 = u31Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(w31Var2.getThemedColor(org.telegram.ui.ActionBar.k6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z10 = true;
                        for (int i132 = 0; i132 < locales.size(); i132++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i132);
                            if (!localeInfo.pluralLangCode.equals(w31Var2.f32636s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(w31Var2.v, localeInfo.pluralLangCode);
                                Context context2 = u31Var.getContext();
                                if (i132 == locales.size() - 1) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                g6Var = ((org.telegram.ui.ActionBar.h3) w31Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, context2, g6Var, z10, z4);
                                g1Var.setText(w31.y(w31.D(localeInfo.pluralLangCode, null, null)));
                                g1Var.setChecked(TextUtils.equals(w31Var2.v, localeInfo.pluralLangCode));
                                g1Var.setOnClickListener(new r31(u31Var, runnableArr, localeInfo, 0));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                                z10 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new oq0(p1Var, 22);
                        p1Var.f22218e = true;
                        p1Var.f22217c = 220;
                        p1Var.setOutsideTouchable(true);
                        p1Var.setClippingEnabled(true);
                        p1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        p1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        s31Var2.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i14 = iArr[1];
                        if (i14 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i14 - measuredHeight2);
                        } else {
                            measuredHeight = (s31Var2.getMeasuredHeight() + i14) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.h3) w31Var2).containerView;
                        p1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
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
            ib1Var.addView(s31Var, k7.c6.t(-2, -2, 16, 0, 0, i11, 0));
            if (this.d != null) {
                ib1Var.addView(imageView2, k7.c6.t(-2, -2, 16, 0, 1, 0, 0));
                ib1Var.addView(this.d, k7.c6.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                ib1Var.addView(textView2, k7.c6.t(-2, -2, 16, 0, 0, 4, 0));
                ib1Var.addView(imageView2, k7.c6.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            ib1Var.addView(s31Var, k7.c6.t(-2, -2, 16, i10, 0, 0, 0));
        }
        addView(ib1Var, k7.c6.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.f31547f = view2;
        view2.setBackgroundColor(w31Var.getThemedColor(org.telegram.ui.ActionBar.k6.V5));
        view2.setAlpha(0.0f);
        addView(view2, k7.c6.d(-1, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        float a2 = k7.o.a((f10 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
        if (!w31.u(this.h)) {
            a2 = 1.0f;
        }
        float interpolation = pr.f30184g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.pk pkVar = this.f31544b;
        pkVar.setScaleX(lerp);
        pkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        pkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z4 = LocaleController.isRTL;
        ib1 ib1Var = this.f31545c;
        if (!z4) {
            pkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            ib1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        ib1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
        float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation);
        ImageView imageView = this.f31543a;
        imageView.setTranslationX(lerp2);
        float f11 = 1.0f - interpolation;
        imageView.setAlpha(f11);
        float lerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation);
        View view = this.f31547f;
        view.setTranslationY(lerp3);
        view.setAlpha(f11);
    }
}
