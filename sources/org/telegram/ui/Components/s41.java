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
import org.telegram.ui.vb1;
public final class s41 extends FrameLayout {
    public final ImageView f30683a;
    public final org.telegram.ui.pk f30684b;
    public final vb1 f30685c;
    public final TextView d;
    public final q41 f30686e;
    public final View f30687f;
    public final u41 h;

    public s41(u41 u41Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.h = u41Var;
        View view = new View(context);
        int themedColor = u41Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20899h5);
        String str = u41Var.f31343s;
        view.setBackgroundColor(themedColor);
        addView(view, w7.z5.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f30683a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i12 = org.telegram.ui.ActionBar.i6.f20935j5;
        int themedColor2 = u41Var.getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(u41Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20918i6), 1, -1));
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final s41 f29591b;

            {
                this.f29591b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.d6 d6Var;
                switch (r2) {
                    case 0:
                        this.f29591b.h.dismiss();
                        return;
                    default:
                        s41 s41Var = this.f29591b;
                        q41 q41Var = s41Var.f30686e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(s41Var.getContext(), null);
                        Drawable mutate = s41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        u41 u41Var2 = s41Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(u41Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i13 = 0; i13 < locales.size(); i13++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i13);
                            if (!localeInfo.pluralLangCode.equals(u41Var2.f31343s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(u41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = s41Var.getContext();
                                if (i13 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                d6Var = ((org.telegram.ui.ActionBar.f3) u41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, context2, d6Var, z11, z10);
                                f1Var.setText(u41.y(u41.C(localeInfo.pluralLangCode, null, null)));
                                f1Var.setChecked(TextUtils.equals(u41Var2.v, localeInfo.pluralLangCode));
                                f1Var.setOnClickListener(new ai.d0(s41Var, runnableArr, localeInfo, 27));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new gq0(n1Var, 25);
                        n1Var.f21417e = true;
                        n1Var.f21416c = 220;
                        n1Var.setOutsideTouchable(true);
                        n1Var.setClippingEnabled(true);
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        q41Var.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i14 = iArr[1];
                        if (i14 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i14 - measuredHeight2);
                        } else {
                            measuredHeight = (q41Var.getMeasuredHeight() + i14) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.f3) u41Var2).containerView;
                        n1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, w7.z5.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, context, 2);
        this.f30684b = pkVar;
        pkVar.setTextColor(u41Var.getThemedColor(i12));
        pkVar.setTextSize(1, 20.0f);
        pkVar.setTypeface(AndroidUtilities.bold());
        pkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        pkVar.setPivotX(0.0f);
        pkVar.setPivotY(0.0f);
        addView(pkVar, w7.z5.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        vb1 vb1Var = new vb1(this, context, 11);
        this.f30685c = vb1Var;
        if (LocaleController.isRTL) {
            vb1Var.setGravity(5);
        }
        vb1Var.setPivotX(0.0f);
        vb1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(u41Var.getThemedColor(org.telegram.ui.ActionBar.i6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(u41.y(u41.C(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i13 = org.telegram.ui.ActionBar.i6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(u41Var.getThemedColor(i13), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        q41 q41Var = new q41(this, context);
        this.f30686e = q41Var;
        if (LocaleController.isRTL) {
            q41Var.setGravity(5);
        }
        q41Var.b(0.25f, 350L, tr.h);
        q41Var.setTextColor(u41Var.getThemedColor(i13));
        q41Var.setTextSize(AndroidUtilities.dp(14.0f));
        q41Var.setText(u41.y(u41.C(u41Var.v, null, null)));
        q41Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        q41Var.setOnClickListener(new View.OnClickListener(this) {
            public final s41 f29591b;

            {
                this.f29591b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.d6 d6Var;
                switch (r2) {
                    case 0:
                        this.f29591b.h.dismiss();
                        return;
                    default:
                        s41 s41Var = this.f29591b;
                        q41 q41Var2 = s41Var.f30686e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(s41Var.getContext(), null);
                        Drawable mutate = s41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        u41 u41Var2 = s41Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(u41Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i132 = 0; i132 < locales.size(); i132++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i132);
                            if (!localeInfo.pluralLangCode.equals(u41Var2.f31343s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(u41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = s41Var.getContext();
                                if (i132 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                d6Var = ((org.telegram.ui.ActionBar.f3) u41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, context2, d6Var, z11, z10);
                                f1Var.setText(u41.y(u41.C(localeInfo.pluralLangCode, null, null)));
                                f1Var.setChecked(TextUtils.equals(u41Var2.v, localeInfo.pluralLangCode));
                                f1Var.setOnClickListener(new ai.d0(s41Var, runnableArr, localeInfo, 27));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new gq0(n1Var, 25);
                        n1Var.f21417e = true;
                        n1Var.f21416c = 220;
                        n1Var.setOutsideTouchable(true);
                        n1Var.setClippingEnabled(true);
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        q41Var2.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i14 = iArr[1];
                        if (i14 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i14 - measuredHeight2);
                        } else {
                            measuredHeight = (q41Var2.getMeasuredHeight() + i14) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.f3) u41Var2).containerView;
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
            vb1Var.addView(q41Var, w7.z5.t(-2, -2, 16, 0, 0, i11, 0));
            if (this.d != null) {
                vb1Var.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 0, 0));
                vb1Var.addView(this.d, w7.z5.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                vb1Var.addView(textView2, w7.z5.t(-2, -2, 16, 0, 0, 4, 0));
                vb1Var.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            vb1Var.addView(q41Var, w7.z5.t(-2, -2, 16, i10, 0, 0, 0));
        }
        addView(vb1Var, w7.z5.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.f30687f = view2;
        view2.setBackgroundColor(u41Var.getThemedColor(org.telegram.ui.ActionBar.i6.V5));
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
        if (!u41.u(this.h)) {
            a2 = 1.0f;
        }
        float interpolation = tr.f31216g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.pk pkVar = this.f30684b;
        pkVar.setScaleX(lerp);
        pkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        pkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        vb1 vb1Var = this.f30685c;
        if (!z10) {
            pkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            vb1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        vb1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
        float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation);
        ImageView imageView = this.f30683a;
        imageView.setTranslationX(lerp2);
        float f10 = 1.0f - interpolation;
        imageView.setAlpha(f10);
        float lerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation);
        View view = this.f30687f;
        view.setTranslationY(lerp3);
        view.setAlpha(f10);
    }
}
