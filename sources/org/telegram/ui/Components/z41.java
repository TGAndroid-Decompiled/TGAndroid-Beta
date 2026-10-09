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
import org.telegram.ui.dc1;
public final class z41 extends FrameLayout {
    public final ImageView f33467a;
    public final org.telegram.ui.tk f33468b;
    public final dc1 f33469c;
    public final TextView d;
    public final x41 f33470e;
    public final View f33471f;
    public final View h;
    public final b51 f33472n;

    public z41(b51 b51Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.f33472n = b51Var;
        View view = new View(context);
        this.f33471f = view;
        int themedColor = b51Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20868h5);
        String str = b51Var.f24910s;
        view.setBackgroundColor(themedColor);
        addView(view, w7.x5.a(44.0f, 0.0f, 12.0f, 0.0f, 0.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f33467a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i12 = org.telegram.ui.ActionBar.i6.f20905j5;
        int themedColor2 = b51Var.getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(b51Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20888i6), 1, -1));
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final z41 f32544b;

            {
                this.f32544b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.e6 e6Var;
                switch (r2) {
                    case 0:
                        this.f32544b.f33472n.dismiss();
                        return;
                    default:
                        z41 z41Var = this.f32544b;
                        x41 x41Var = z41Var.f33470e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(z41Var.getContext(), null);
                        Drawable mutate = z41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        b51 b51Var2 = z41Var.f33472n;
                        mutate.setColorFilter(new PorterDuffColorFilter(b51Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i13 = 0; i13 < locales.size(); i13++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i13);
                            if (!localeInfo.pluralLangCode.equals(b51Var2.f24910s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(b51Var2.v, localeInfo.pluralLangCode);
                                Context context2 = z41Var.getContext();
                                if (i13 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                e6Var = ((org.telegram.ui.ActionBar.f3) b51Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, context2, e6Var, z11, z10);
                                f1Var.setText(b51.B(b51.F(localeInfo.pluralLangCode, null, null)));
                                f1Var.setChecked(TextUtils.equals(b51Var2.v, localeInfo.pluralLangCode));
                                f1Var.setOnClickListener(new ai.d0(z41Var, runnableArr, localeInfo, 27));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new or0(n1Var, 22);
                        n1Var.f21415e = true;
                        n1Var.f21414c = 220;
                        n1Var.setOutsideTouchable(true);
                        n1Var.setClippingEnabled(true);
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        x41Var.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i14 = iArr[1];
                        if (i14 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i14 - measuredHeight2);
                        } else {
                            measuredHeight = (x41Var.getMeasuredHeight() + i14) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.f3) b51Var2).containerView;
                        n1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, w7.x5.a(54.0f, 1.0f, 1.0f, 1.0f, 1.0f, 54, 48));
        org.telegram.ui.tk tkVar = new org.telegram.ui.tk(this, context, 2);
        this.f33468b = tkVar;
        tkVar.setTextColor(b51Var.getThemedColor(i12));
        tkVar.setTextSize(1, 20.0f);
        tkVar.setTypeface(AndroidUtilities.bold());
        tkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        tkVar.setPivotX(0.0f);
        tkVar.setPivotY(0.0f);
        addView(tkVar, w7.x5.a(-2.0f, 22.0f, 20.0f, 22.0f, 0.0f, -1, 55));
        dc1 dc1Var = new dc1(this, context, 11);
        this.f33469c = dc1Var;
        if (LocaleController.isRTL) {
            dc1Var.setGravity(5);
        }
        dc1Var.setPivotX(0.0f);
        dc1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(b51Var.getThemedColor(org.telegram.ui.ActionBar.i6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(b51.B(b51.F(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i13 = org.telegram.ui.ActionBar.i6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(b51Var.getThemedColor(i13), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        x41 x41Var = new x41(this, context);
        this.f33470e = x41Var;
        if (LocaleController.isRTL) {
            x41Var.setGravity(5);
        }
        x41Var.b(0.25f, 350L, hs.h);
        x41Var.setTextColor(b51Var.getThemedColor(i13));
        x41Var.setTextSize(AndroidUtilities.dp(14.0f));
        x41Var.setText(b51.B(b51.F(b51Var.v, null, null)));
        x41Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        x41Var.setOnClickListener(new View.OnClickListener(this) {
            public final z41 f32544b;

            {
                this.f32544b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.e6 e6Var;
                switch (r2) {
                    case 0:
                        this.f32544b.f33472n.dismiss();
                        return;
                    default:
                        z41 z41Var = this.f32544b;
                        x41 x41Var2 = z41Var.f33470e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(z41Var.getContext(), null);
                        Drawable mutate = z41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        b51 b51Var2 = z41Var.f33472n;
                        mutate.setColorFilter(new PorterDuffColorFilter(b51Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i132 = 0; i132 < locales.size(); i132++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i132);
                            if (!localeInfo.pluralLangCode.equals(b51Var2.f24910s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(b51Var2.v, localeInfo.pluralLangCode);
                                Context context2 = z41Var.getContext();
                                if (i132 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                e6Var = ((org.telegram.ui.ActionBar.f3) b51Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, context2, e6Var, z11, z10);
                                f1Var.setText(b51.B(b51.F(localeInfo.pluralLangCode, null, null)));
                                f1Var.setChecked(TextUtils.equals(b51Var2.v, localeInfo.pluralLangCode));
                                f1Var.setOnClickListener(new ai.d0(z41Var, runnableArr, localeInfo, 27));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new or0(n1Var, 22);
                        n1Var.f21415e = true;
                        n1Var.f21414c = 220;
                        n1Var.setOutsideTouchable(true);
                        n1Var.setClippingEnabled(true);
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        x41Var2.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i14 = iArr[1];
                        if (i14 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i14 - measuredHeight2);
                        } else {
                            measuredHeight = (x41Var2.getMeasuredHeight() + i14) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.f3) b51Var2).containerView;
                        n1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
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
            dc1Var.addView(x41Var, w7.x5.t(-2, -2, 16, 0, 0, i11, 0));
            if (this.d != null) {
                dc1Var.addView(imageView2, w7.x5.t(-2, -2, 16, 0, 1, 0, 0));
                dc1Var.addView(this.d, w7.x5.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                dc1Var.addView(textView2, w7.x5.t(-2, -2, 16, 0, 0, 4, 0));
                dc1Var.addView(imageView2, w7.x5.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            dc1Var.addView(x41Var, w7.x5.t(-2, -2, 16, i10, 0, 0, 0));
        }
        addView(dc1Var, w7.x5.a(-2.0f, 22.0f, 43.0f, 22.0f, 0.0f, -1, 55));
        View view2 = new View(context);
        this.h = view2;
        view2.setBackgroundColor(b51Var.getThemedColor(org.telegram.ui.ActionBar.i6.V5));
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
        if (!b51.w(this.f33472n)) {
            a2 = 1.0f;
        }
        float interpolation = hs.f27119g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.tk tkVar = this.f33468b;
        tkVar.setScaleX(lerp);
        tkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        tkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        dc1 dc1Var = this.f33469c;
        if (!z10) {
            tkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            dc1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        dc1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
        float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation);
        ImageView imageView = this.f33467a;
        imageView.setTranslationX(lerp2);
        float f10 = 1.0f - interpolation;
        imageView.setAlpha(f10);
        float lerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(lerp3);
        view.setAlpha(f10);
    }
}
