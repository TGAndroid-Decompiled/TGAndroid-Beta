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
import org.telegram.ui.xb1;
public final class r41 extends FrameLayout {
    public final ImageView f30272a;
    public final org.telegram.ui.pk f30273b;
    public final xb1 f30274c;
    public final TextView d;
    public final p41 f30275e;
    public final View f30276f;
    public final t41 h;

    public r41(t41 t41Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.h = t41Var;
        View view = new View(context);
        int themedColor = t41Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20894h5);
        String str = t41Var.f30971s;
        view.setBackgroundColor(themedColor);
        addView(view, w7.z5.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f30272a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i12 = org.telegram.ui.ActionBar.i6.f20930j5;
        int themedColor2 = t41Var.getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(t41Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20913i6), 1, -1));
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final r41 f29226b;

            {
                this.f29226b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.d6 d6Var;
                switch (r2) {
                    case 0:
                        this.f29226b.h.dismiss();
                        return;
                    default:
                        r41 r41Var = this.f29226b;
                        p41 p41Var = r41Var.f30275e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(r41Var.getContext(), null);
                        Drawable mutate = r41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        t41 t41Var2 = r41Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(t41Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i13 = 0; i13 < locales.size(); i13++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i13);
                            if (!localeInfo.pluralLangCode.equals(t41Var2.f30971s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(t41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = r41Var.getContext();
                                if (i13 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                d6Var = ((org.telegram.ui.ActionBar.f3) t41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, context2, d6Var, z11, z10);
                                f1Var.setText(t41.y(t41.C(localeInfo.pluralLangCode, null, null)));
                                f1Var.setChecked(TextUtils.equals(t41Var2.v, localeInfo.pluralLangCode));
                                f1Var.setOnClickListener(new ai.d0(r41Var, runnableArr, localeInfo, 27));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new br0(n1Var, 24);
                        n1Var.f21413e = true;
                        n1Var.f21412c = 220;
                        n1Var.setOutsideTouchable(true);
                        n1Var.setClippingEnabled(true);
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n1Var.setFocusable(true);
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
                        n1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, w7.z5.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, context, 2);
        this.f30273b = pkVar;
        pkVar.setTextColor(t41Var.getThemedColor(i12));
        pkVar.setTextSize(1, 20.0f);
        pkVar.setTypeface(AndroidUtilities.bold());
        pkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        pkVar.setPivotX(0.0f);
        pkVar.setPivotY(0.0f);
        addView(pkVar, w7.z5.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        xb1 xb1Var = new xb1(this, context, 11);
        this.f30274c = xb1Var;
        if (LocaleController.isRTL) {
            xb1Var.setGravity(5);
        }
        xb1Var.setPivotX(0.0f);
        xb1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(t41Var.getThemedColor(org.telegram.ui.ActionBar.i6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(t41.y(t41.C(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i13 = org.telegram.ui.ActionBar.i6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(t41Var.getThemedColor(i13), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        p41 p41Var = new p41(this, context);
        this.f30275e = p41Var;
        if (LocaleController.isRTL) {
            p41Var.setGravity(5);
        }
        p41Var.b(0.25f, 350L, tr.h);
        p41Var.setTextColor(t41Var.getThemedColor(i13));
        p41Var.setTextSize(AndroidUtilities.dp(14.0f));
        p41Var.setText(t41.y(t41.C(t41Var.v, null, null)));
        p41Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        p41Var.setOnClickListener(new View.OnClickListener(this) {
            public final r41 f29226b;

            {
                this.f29226b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.d6 d6Var;
                switch (r2) {
                    case 0:
                        this.f29226b.h.dismiss();
                        return;
                    default:
                        r41 r41Var = this.f29226b;
                        p41 p41Var2 = r41Var.f30275e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(r41Var.getContext(), null);
                        Drawable mutate = r41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        t41 t41Var2 = r41Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(t41Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i132 = 0; i132 < locales.size(); i132++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i132);
                            if (!localeInfo.pluralLangCode.equals(t41Var2.f30971s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(t41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = r41Var.getContext();
                                if (i132 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                d6Var = ((org.telegram.ui.ActionBar.f3) t41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, context2, d6Var, z11, z10);
                                f1Var.setText(t41.y(t41.C(localeInfo.pluralLangCode, null, null)));
                                f1Var.setChecked(TextUtils.equals(t41Var2.v, localeInfo.pluralLangCode));
                                f1Var.setOnClickListener(new ai.d0(r41Var, runnableArr, localeInfo, 27));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new br0(n1Var, 24);
                        n1Var.f21413e = true;
                        n1Var.f21412c = 220;
                        n1Var.setOutsideTouchable(true);
                        n1Var.setClippingEnabled(true);
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n1Var.setFocusable(true);
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
            xb1Var.addView(p41Var, w7.z5.t(-2, -2, 16, 0, 0, i11, 0));
            if (this.d != null) {
                xb1Var.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 0, 0));
                xb1Var.addView(this.d, w7.z5.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                xb1Var.addView(textView2, w7.z5.t(-2, -2, 16, 0, 0, 4, 0));
                xb1Var.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            xb1Var.addView(p41Var, w7.z5.t(-2, -2, 16, i10, 0, 0, 0));
        }
        addView(xb1Var, w7.z5.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.f30276f = view2;
        view2.setBackgroundColor(t41Var.getThemedColor(org.telegram.ui.ActionBar.i6.V5));
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
        float a2 = w7.q.a((f7 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
        if (!t41.u(this.h)) {
            a2 = 1.0f;
        }
        float interpolation = tr.f31148g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.pk pkVar = this.f30273b;
        pkVar.setScaleX(lerp);
        pkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        pkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        xb1 xb1Var = this.f30274c;
        if (!z10) {
            pkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            xb1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        xb1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
        float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation);
        ImageView imageView = this.f30272a;
        imageView.setTranslationX(lerp2);
        float f10 = 1.0f - interpolation;
        imageView.setAlpha(f10);
        float lerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation);
        View view = this.f30276f;
        view.setTranslationY(lerp3);
        view.setAlpha(f10);
    }
}
