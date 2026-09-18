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
import org.telegram.ui.bc1;
public final class i41 extends FrameLayout {
    public final ImageView f24845a;
    public final org.telegram.ui.rk f24846b;
    public final bc1 f24847c;
    public final TextView d;
    public final g41 e;
    public final View f24848f;
    public final k41 h;

    public i41(k41 k41Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.h = k41Var;
        View view = new View(context);
        int themedColor = k41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19133h5);
        String str = k41Var.f25582s;
        view.setBackgroundColor(themedColor);
        addView(view, w7.y5.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f24845a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i12 = org.telegram.ui.ActionBar.j6.f19169j5;
        int themedColor2 = k41Var.getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(k41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19152i6), 1, -1));
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final i41 f24017b;

            {
                this.f24017b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.e6 e6Var;
                switch (r2) {
                    case 0:
                        this.f24017b.h.dismiss();
                        return;
                    default:
                        i41 i41Var = this.f24017b;
                        g41 g41Var = i41Var.e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i41Var.getContext(), null);
                        Drawable mutate = i41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        k41 k41Var2 = i41Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(k41Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i13 = 0; i13 < locales.size(); i13++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i13);
                            if (!localeInfo.pluralLangCode.equals(k41Var2.f25582s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(k41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = i41Var.getContext();
                                if (i13 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                e6Var = ((org.telegram.ui.ActionBar.f3) k41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, context2, e6Var, z11, z10);
                                f1Var.setText(k41.y(k41.E(localeInfo.pluralLangCode, null, null)));
                                f1Var.setChecked(TextUtils.equals(k41Var2.v, localeInfo.pluralLangCode));
                                f1Var.setOnClickListener(new ai.d0(i41Var, runnableArr, localeInfo, 27));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new xq0(n1Var, 22);
                        n1Var.e = true;
                        n1Var.f19609c = 220;
                        n1Var.setOutsideTouchable(true);
                        n1Var.setClippingEnabled(true);
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        g41Var.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i14 = iArr[1];
                        if (i14 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i14 - measuredHeight2);
                        } else {
                            measuredHeight = (g41Var.getMeasuredHeight() + i14) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.f3) k41Var2).containerView;
                        n1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, w7.y5.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.rk rkVar = new org.telegram.ui.rk(this, context, 2);
        this.f24846b = rkVar;
        rkVar.setTextColor(k41Var.getThemedColor(i12));
        rkVar.setTextSize(1, 20.0f);
        rkVar.setTypeface(AndroidUtilities.bold());
        rkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        rkVar.setPivotX(0.0f);
        rkVar.setPivotY(0.0f);
        addView(rkVar, w7.y5.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        bc1 bc1Var = new bc1(this, context, 11);
        this.f24847c = bc1Var;
        if (LocaleController.isRTL) {
            bc1Var.setGravity(5);
        }
        bc1Var.setPivotX(0.0f);
        bc1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(k41Var.getThemedColor(org.telegram.ui.ActionBar.j6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(k41.y(k41.E(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i13 = org.telegram.ui.ActionBar.j6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(k41Var.getThemedColor(i13), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        g41 g41Var = new g41(this, context);
        this.e = g41Var;
        if (LocaleController.isRTL) {
            g41Var.setGravity(5);
        }
        g41Var.b(0.25f, 350L, qr.h);
        g41Var.setTextColor(k41Var.getThemedColor(i13));
        g41Var.setTextSize(AndroidUtilities.dp(14.0f));
        g41Var.setText(k41.y(k41.E(k41Var.v, null, null)));
        g41Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        g41Var.setOnClickListener(new View.OnClickListener(this) {
            public final i41 f24017b;

            {
                this.f24017b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.e6 e6Var;
                switch (r2) {
                    case 0:
                        this.f24017b.h.dismiss();
                        return;
                    default:
                        i41 i41Var = this.f24017b;
                        g41 g41Var2 = i41Var.e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i41Var.getContext(), null);
                        Drawable mutate = i41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        k41 k41Var2 = i41Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(k41Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i132 = 0; i132 < locales.size(); i132++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i132);
                            if (!localeInfo.pluralLangCode.equals(k41Var2.f25582s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(k41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = i41Var.getContext();
                                if (i132 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                e6Var = ((org.telegram.ui.ActionBar.f3) k41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, context2, e6Var, z11, z10);
                                f1Var.setText(k41.y(k41.E(localeInfo.pluralLangCode, null, null)));
                                f1Var.setChecked(TextUtils.equals(k41Var2.v, localeInfo.pluralLangCode));
                                f1Var.setOnClickListener(new ai.d0(i41Var, runnableArr, localeInfo, 27));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new xq0(n1Var, 22);
                        n1Var.e = true;
                        n1Var.f19609c = 220;
                        n1Var.setOutsideTouchable(true);
                        n1Var.setClippingEnabled(true);
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        g41Var2.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i14 = iArr[1];
                        if (i14 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i14 - measuredHeight2);
                        } else {
                            measuredHeight = (g41Var2.getMeasuredHeight() + i14) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.f3) k41Var2).containerView;
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
            bc1Var.addView(g41Var, w7.y5.t(-2, -2, 16, 0, 0, i11, 0));
            if (this.d != null) {
                bc1Var.addView(imageView2, w7.y5.t(-2, -2, 16, 0, 1, 0, 0));
                bc1Var.addView(this.d, w7.y5.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                bc1Var.addView(textView2, w7.y5.t(-2, -2, 16, 0, 0, 4, 0));
                bc1Var.addView(imageView2, w7.y5.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            bc1Var.addView(g41Var, w7.y5.t(-2, -2, 16, i10, 0, 0, 0));
        }
        addView(bc1Var, w7.y5.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.f24848f = view2;
        view2.setBackgroundColor(k41Var.getThemedColor(org.telegram.ui.ActionBar.j6.V5));
        view2.setAlpha(0.0f);
        addView(view2, w7.y5.d(-1, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        float a2 = w7.q.a((f7 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
        if (!k41.u(this.h)) {
            a2 = 1.0f;
        }
        float interpolation = qr.f27716g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.rk rkVar = this.f24846b;
        rkVar.setScaleX(lerp);
        rkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        rkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        bc1 bc1Var = this.f24847c;
        if (!z10) {
            rkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            bc1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        bc1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
        float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation);
        ImageView imageView = this.f24845a;
        imageView.setTranslationX(lerp2);
        float f10 = 1.0f - interpolation;
        imageView.setAlpha(f10);
        float lerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation);
        View view = this.f24848f;
        view.setTranslationY(lerp3);
        view.setAlpha(f10);
    }
}
