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
import org.telegram.ui.ic1;
public final class v41 extends FrameLayout {
    public final ImageView f29562a;
    public final org.telegram.ui.xk f29563b;
    public final ic1 f29564c;
    public final TextView d;
    public final t41 e;
    public final View f29565f;
    public final View h;
    public final x41 f29566n;

    public v41(x41 x41Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.f29566n = x41Var;
        View view = new View(context);
        this.f29565f = view;
        int themedColor = x41Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5);
        String str = x41Var.f30869s;
        view.setBackgroundColor(themedColor);
        addView(view, w7.z5.a(44.0f, 0.0f, 12.0f, 0.0f, 0.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f29562a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i12 = org.telegram.ui.ActionBar.g6.f19707j5;
        int themedColor2 = x41Var.getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(x41Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19690i6), 1, -1));
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final v41 f28725b;

            {
                this.f28725b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.c6 c6Var;
                switch (r2) {
                    case 0:
                        this.f28725b.f29566n.dismiss();
                        return;
                    default:
                        v41 v41Var = this.f28725b;
                        t41 t41Var = v41Var.e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(v41Var.getContext(), null);
                        Drawable mutate = v41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        x41 x41Var2 = v41Var.f29566n;
                        mutate.setColorFilter(new PorterDuffColorFilter(x41Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i13 = 0; i13 < locales.size(); i13++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i13);
                            if (!localeInfo.pluralLangCode.equals(x41Var2.f30869s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(x41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = v41Var.getContext();
                                if (i13 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                c6Var = ((org.telegram.ui.ActionBar.e3) x41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, context2, c6Var, z11, z10);
                                e1Var.setText(x41.B(x41.F(localeInfo.pluralLangCode, null, null)));
                                e1Var.setChecked(TextUtils.equals(x41Var2.v, localeInfo.pluralLangCode));
                                e1Var.setOnClickListener(new bi.x(v41Var, runnableArr, localeInfo, 27));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new kr0(m1Var, 23);
                        m1Var.e = true;
                        m1Var.f20221c = 220;
                        m1Var.setOutsideTouchable(true);
                        m1Var.setClippingEnabled(true);
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        t41Var.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i14 = iArr[1];
                        if (i14 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i14 - measuredHeight2);
                        } else {
                            measuredHeight = (t41Var.getMeasuredHeight() + i14) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.e3) x41Var2).containerView;
                        m1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, w7.z5.a(54.0f, 1.0f, 1.0f, 1.0f, 1.0f, 54, 48));
        org.telegram.ui.xk xkVar = new org.telegram.ui.xk(this, context, 2);
        this.f29563b = xkVar;
        xkVar.setTextColor(x41Var.getThemedColor(i12));
        xkVar.setTextSize(1, 20.0f);
        xkVar.setTypeface(AndroidUtilities.bold());
        xkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        xkVar.setPivotX(0.0f);
        xkVar.setPivotY(0.0f);
        addView(xkVar, w7.z5.a(-2.0f, 22.0f, 20.0f, 22.0f, 0.0f, -1, 55));
        ic1 ic1Var = new ic1(this, context, 11);
        this.f29564c = ic1Var;
        if (LocaleController.isRTL) {
            ic1Var.setGravity(5);
        }
        ic1Var.setPivotX(0.0f);
        ic1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(x41Var.getThemedColor(org.telegram.ui.ActionBar.g6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(x41.B(x41.F(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i13 = org.telegram.ui.ActionBar.g6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(x41Var.getThemedColor(i13), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        t41 t41Var = new t41(this, context);
        this.e = t41Var;
        if (LocaleController.isRTL) {
            t41Var.setGravity(5);
        }
        t41Var.b(0.25f, 350L, es.h);
        t41Var.setTextColor(x41Var.getThemedColor(i13));
        t41Var.setTextSize(AndroidUtilities.dp(14.0f));
        t41Var.setText(x41.B(x41.F(x41Var.v, null, null)));
        t41Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        t41Var.setOnClickListener(new View.OnClickListener(this) {
            public final v41 f28725b;

            {
                this.f28725b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.c6 c6Var;
                switch (r2) {
                    case 0:
                        this.f28725b.f29566n.dismiss();
                        return;
                    default:
                        v41 v41Var = this.f28725b;
                        t41 t41Var2 = v41Var.e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(v41Var.getContext(), null);
                        Drawable mutate = v41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        x41 x41Var2 = v41Var.f29566n;
                        mutate.setColorFilter(new PorterDuffColorFilter(x41Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i132 = 0; i132 < locales.size(); i132++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i132);
                            if (!localeInfo.pluralLangCode.equals(x41Var2.f30869s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(x41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = v41Var.getContext();
                                if (i132 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                c6Var = ((org.telegram.ui.ActionBar.e3) x41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, context2, c6Var, z11, z10);
                                e1Var.setText(x41.B(x41.F(localeInfo.pluralLangCode, null, null)));
                                e1Var.setChecked(TextUtils.equals(x41Var2.v, localeInfo.pluralLangCode));
                                e1Var.setOnClickListener(new bi.x(v41Var, runnableArr, localeInfo, 27));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new kr0(m1Var, 23);
                        m1Var.e = true;
                        m1Var.f20221c = 220;
                        m1Var.setOutsideTouchable(true);
                        m1Var.setClippingEnabled(true);
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        t41Var2.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i14 = iArr[1];
                        if (i14 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i14 - measuredHeight2);
                        } else {
                            measuredHeight = (t41Var2.getMeasuredHeight() + i14) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.e3) x41Var2).containerView;
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
            ic1Var.addView(t41Var, w7.z5.t(-2, -2, 16, 0, 0, i11, 0));
            if (this.d != null) {
                ic1Var.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 0, 0));
                ic1Var.addView(this.d, w7.z5.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                ic1Var.addView(textView2, w7.z5.t(-2, -2, 16, 0, 0, 4, 0));
                ic1Var.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            ic1Var.addView(t41Var, w7.z5.t(-2, -2, 16, i10, 0, 0, 0));
        }
        addView(ic1Var, w7.z5.a(-2.0f, 22.0f, 43.0f, 22.0f, 0.0f, -1, 55));
        View view2 = new View(context);
        this.h = view2;
        view2.setBackgroundColor(x41Var.getThemedColor(org.telegram.ui.ActionBar.g6.V5));
        view2.setAlpha(0.0f);
        addView(view2, w7.z5.a(AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 0.0f, 56.0f, 0.0f, 0.0f, -1, 55));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        float a2 = w7.r.a((f7 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
        if (!x41.w(this.f29566n)) {
            a2 = 1.0f;
        }
        float interpolation = es.f24466g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.xk xkVar = this.f29563b;
        xkVar.setScaleX(lerp);
        xkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        xkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        ic1 ic1Var = this.f29564c;
        if (!z10) {
            xkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            ic1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        ic1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
        float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation);
        ImageView imageView = this.f29562a;
        imageView.setTranslationX(lerp2);
        float f10 = 1.0f - interpolation;
        imageView.setAlpha(f10);
        float lerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(lerp3);
        view.setAlpha(f10);
    }
}
