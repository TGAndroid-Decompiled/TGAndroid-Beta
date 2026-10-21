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
import org.telegram.ui.qa1;
public final class r41 extends FrameLayout {
    public final ImageView f29820a;
    public final org.telegram.ui.kk f29821b;
    public final qa1 f29822c;
    public final TextView d;
    public final p41 e;
    public final View f29823f;
    public final View h;
    public final t41 f29824n;

    public r41(t41 t41Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.f29824n = t41Var;
        View view = new View(context);
        this.f29823f = view;
        int themedColor = t41Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21061h5);
        String str = t41Var.f30434s;
        view.setBackgroundColor(themedColor);
        addView(view, w7.z5.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f29820a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i12 = org.telegram.ui.ActionBar.h6.f21096j5;
        int themedColor2 = t41Var.getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(t41Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21079i6), 1, -1));
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final r41 f28686b;

            {
                this.f28686b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.d6 d6Var;
                switch (r2) {
                    case 0:
                        this.f28686b.f29824n.dismiss();
                        return;
                    default:
                        r41 r41Var = this.f28686b;
                        p41 p41Var = r41Var.e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(r41Var.getContext(), null);
                        Drawable mutate = r41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        t41 t41Var2 = r41Var.f29824n;
                        mutate.setColorFilter(new PorterDuffColorFilter(t41Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i13 = 0; i13 < locales.size(); i13++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i13);
                            if (!localeInfo.pluralLangCode.equals(t41Var2.f30434s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(t41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = r41Var.getContext();
                                if (i13 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                d6Var = ((org.telegram.ui.ActionBar.f3) t41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, context2, d6Var, z11, z10);
                                e1Var.setText(t41.A(t41.E(localeInfo.pluralLangCode, null, null)));
                                e1Var.setChecked(TextUtils.equals(t41Var2.v, localeInfo.pluralLangCode));
                                e1Var.setOnClickListener(new o41(r41Var, runnableArr, localeInfo, 0));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new hr0(m1Var, 22);
                        m1Var.e = true;
                        m1Var.f21577c = 220;
                        m1Var.setOutsideTouchable(true);
                        m1Var.setClippingEnabled(true);
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        p41Var.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i14 = iArr[1];
                        if (i14 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i14 - measuredHeight2);
                        } else {
                            measuredHeight = (p41Var.getMeasuredHeight() + i14) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.f3) t41Var2).containerView;
                        m1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, w7.z5.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.kk kkVar = new org.telegram.ui.kk(this, context, 2);
        this.f29821b = kkVar;
        kkVar.setTextColor(t41Var.getThemedColor(i12));
        kkVar.setTextSize(1, 20.0f);
        kkVar.setTypeface(AndroidUtilities.bold());
        kkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        kkVar.setPivotX(0.0f);
        kkVar.setPivotY(0.0f);
        addView(kkVar, w7.z5.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        qa1 qa1Var = new qa1(this, context, 13);
        this.f29822c = qa1Var;
        if (LocaleController.isRTL) {
            qa1Var.setGravity(5);
        }
        qa1Var.setPivotX(0.0f);
        qa1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(t41Var.getThemedColor(org.telegram.ui.ActionBar.h6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(t41.A(t41.E(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i13 = org.telegram.ui.ActionBar.h6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(t41Var.getThemedColor(i13), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        p41 p41Var = new p41(this, context);
        this.e = p41Var;
        if (LocaleController.isRTL) {
            p41Var.setGravity(5);
        }
        p41Var.b(0.25f, 350L, bs.h);
        p41Var.setTextColor(t41Var.getThemedColor(i13));
        p41Var.setTextSize(AndroidUtilities.dp(14.0f));
        p41Var.setText(t41.A(t41.E(t41Var.v, null, null)));
        p41Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        p41Var.setOnClickListener(new View.OnClickListener(this) {
            public final r41 f28686b;

            {
                this.f28686b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.d6 d6Var;
                switch (r2) {
                    case 0:
                        this.f28686b.f29824n.dismiss();
                        return;
                    default:
                        r41 r41Var = this.f28686b;
                        p41 p41Var2 = r41Var.e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(r41Var.getContext(), null);
                        Drawable mutate = r41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        t41 t41Var2 = r41Var.f29824n;
                        mutate.setColorFilter(new PorterDuffColorFilter(t41Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i132 = 0; i132 < locales.size(); i132++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i132);
                            if (!localeInfo.pluralLangCode.equals(t41Var2.f30434s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(t41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = r41Var.getContext();
                                if (i132 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                d6Var = ((org.telegram.ui.ActionBar.f3) t41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, context2, d6Var, z11, z10);
                                e1Var.setText(t41.A(t41.E(localeInfo.pluralLangCode, null, null)));
                                e1Var.setChecked(TextUtils.equals(t41Var2.v, localeInfo.pluralLangCode));
                                e1Var.setOnClickListener(new o41(r41Var, runnableArr, localeInfo, 0));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new hr0(m1Var, 22);
                        m1Var.e = true;
                        m1Var.f21577c = 220;
                        m1Var.setOutsideTouchable(true);
                        m1Var.setClippingEnabled(true);
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        p41Var2.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i14 = iArr[1];
                        if (i14 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i14 - measuredHeight2);
                        } else {
                            measuredHeight = (p41Var2.getMeasuredHeight() + i14) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.f3) t41Var2).containerView;
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
            qa1Var.addView(p41Var, w7.z5.t(-2, -2, 16, 0, 0, i11, 0));
            if (this.d != null) {
                qa1Var.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 0, 0));
                qa1Var.addView(this.d, w7.z5.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                qa1Var.addView(textView2, w7.z5.t(-2, -2, 16, 0, 0, 4, 0));
                qa1Var.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            qa1Var.addView(p41Var, w7.z5.t(-2, -2, 16, i10, 0, 0, 0));
        }
        addView(qa1Var, w7.z5.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        view2.setBackgroundColor(t41Var.getThemedColor(org.telegram.ui.ActionBar.h6.V5));
        view2.setAlpha(0.0f);
        addView(view2, w7.z5.d(-1, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        float a2 = w7.r.a((f7 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
        if (!t41.w(this.f29824n)) {
            a2 = 1.0f;
        }
        float interpolation = bs.f25022g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.kk kkVar = this.f29821b;
        kkVar.setScaleX(lerp);
        kkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        kkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        qa1 qa1Var = this.f29822c;
        if (!z10) {
            kkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            qa1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        qa1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
        float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation);
        ImageView imageView = this.f29820a;
        imageView.setTranslationX(lerp2);
        float f10 = 1.0f - interpolation;
        imageView.setAlpha(f10);
        float lerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(lerp3);
        view.setAlpha(f10);
    }
}
