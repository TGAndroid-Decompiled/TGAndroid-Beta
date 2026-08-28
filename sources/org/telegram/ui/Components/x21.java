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
import org.telegram.ui.ta1;
public final class x21 extends FrameLayout {
    public final ImageView f34496a;
    public final org.telegram.ui.gk f34497b;
    public final ta1 f34498c;
    public final TextView d;
    public final v21 f34499e;
    public final View f34500f;
    public final z21 h;

    public x21(z21 z21Var, Context context) {
        super(context);
        int i9;
        int i10;
        this.h = z21Var;
        View view = new View(context);
        int themedColor = z21Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5);
        String str = z21Var.f35174s;
        view.setBackgroundColor(themedColor);
        addView(view, g7.e6.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f34496a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i11 = org.telegram.ui.ActionBar.f6.f23108j5;
        int themedColor2 = z21Var.getThemedColor(i11);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(z21Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23092i6), 1, -1));
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final x21 f32909b;

            {
                this.f32909b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.b6 b6Var;
                switch (r2) {
                    case 0:
                        this.f32909b.h.dismiss();
                        return;
                    default:
                        x21 x21Var = this.f32909b;
                        v21 v21Var = x21Var.f34499e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(x21Var.getContext(), null);
                        Drawable mutate = x21Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        z21 z21Var2 = x21Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(z21Var2.getThemedColor(org.telegram.ui.ActionBar.f6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i12 = 0; i12 < locales.size(); i12++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i12);
                            if (!localeInfo.pluralLangCode.equals(z21Var2.f35174s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(z21Var2.v, localeInfo.pluralLangCode);
                                Context context2 = x21Var.getContext();
                                if (i12 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                b6Var = ((org.telegram.ui.ActionBar.f3) z21Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, context2, b6Var, z11, z10);
                                g1Var.setText(z21.y(z21.D(localeInfo.pluralLangCode, null, null)));
                                g1Var.setChecked(TextUtils.equals(z21Var2.v, localeInfo.pluralLangCode));
                                g1Var.setOnClickListener(new gd0(x21Var, runnableArr, localeInfo, 2));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new tp0(o1Var, 22);
                        o1Var.f23690e = true;
                        o1Var.f23689c = 220;
                        o1Var.setOutsideTouchable(true);
                        o1Var.setClippingEnabled(true);
                        o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        o1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        v21Var.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i13 = iArr[1];
                        if (i13 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i13 - measuredHeight2);
                        } else {
                            measuredHeight = (v21Var.getMeasuredHeight() + i13) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.f3) z21Var2).containerView;
                        o1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, g7.e6.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.gk gkVar = new org.telegram.ui.gk(this, context, 2);
        this.f34497b = gkVar;
        gkVar.setTextColor(z21Var.getThemedColor(i11));
        gkVar.setTextSize(1, 20.0f);
        gkVar.setTypeface(AndroidUtilities.bold());
        gkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        gkVar.setPivotX(0.0f);
        gkVar.setPivotY(0.0f);
        addView(gkVar, g7.e6.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        ta1 ta1Var = new ta1(this, context, 12);
        this.f34498c = ta1Var;
        if (LocaleController.isRTL) {
            ta1Var.setGravity(5);
        }
        ta1Var.setPivotX(0.0f);
        ta1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(z21Var.getThemedColor(org.telegram.ui.ActionBar.f6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(z21.y(z21.D(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i12 = org.telegram.ui.ActionBar.f6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(z21Var.getThemedColor(i12), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        v21 v21Var = new v21(this, context);
        this.f34499e = v21Var;
        if (LocaleController.isRTL) {
            v21Var.setGravity(5);
        }
        v21Var.b(0.25f, 350L, gr.h);
        v21Var.setTextColor(z21Var.getThemedColor(i12));
        v21Var.setTextSize(AndroidUtilities.dp(14.0f));
        v21Var.setText(z21.y(z21.D(z21Var.v, null, null)));
        v21Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        v21Var.setOnClickListener(new View.OnClickListener(this) {
            public final x21 f32909b;

            {
                this.f32909b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.b6 b6Var;
                switch (r2) {
                    case 0:
                        this.f32909b.h.dismiss();
                        return;
                    default:
                        x21 x21Var = this.f32909b;
                        v21 v21Var2 = x21Var.f34499e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(x21Var.getContext(), null);
                        Drawable mutate = x21Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        z21 z21Var2 = x21Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(z21Var2.getThemedColor(org.telegram.ui.ActionBar.f6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i122 = 0; i122 < locales.size(); i122++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i122);
                            if (!localeInfo.pluralLangCode.equals(z21Var2.f35174s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(z21Var2.v, localeInfo.pluralLangCode);
                                Context context2 = x21Var.getContext();
                                if (i122 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                b6Var = ((org.telegram.ui.ActionBar.f3) z21Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, context2, b6Var, z11, z10);
                                g1Var.setText(z21.y(z21.D(localeInfo.pluralLangCode, null, null)));
                                g1Var.setChecked(TextUtils.equals(z21Var2.v, localeInfo.pluralLangCode));
                                g1Var.setOnClickListener(new gd0(x21Var, runnableArr, localeInfo, 2));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new tp0(o1Var, 22);
                        o1Var.f23690e = true;
                        o1Var.f23689c = 220;
                        o1Var.setOutsideTouchable(true);
                        o1Var.setClippingEnabled(true);
                        o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        o1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        v21Var2.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i13 = iArr[1];
                        if (i13 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i13 - measuredHeight2);
                        } else {
                            measuredHeight = (v21Var2.getMeasuredHeight() + i13) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.f3) z21Var2).containerView;
                        o1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                        return;
                }
            }
        });
        if (LocaleController.isRTL) {
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            ta1Var.addView(v21Var, g7.e6.t(-2, -2, 16, 0, 0, i10, 0));
            if (this.d != null) {
                ta1Var.addView(imageView2, g7.e6.t(-2, -2, 16, 0, 1, 0, 0));
                ta1Var.addView(this.d, g7.e6.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                ta1Var.addView(textView2, g7.e6.t(-2, -2, 16, 0, 0, 4, 0));
                ta1Var.addView(imageView2, g7.e6.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i9 = 3;
            } else {
                i9 = 0;
            }
            ta1Var.addView(v21Var, g7.e6.t(-2, -2, 16, i9, 0, 0, 0));
        }
        addView(ta1Var, g7.e6.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.f34500f = view2;
        view2.setBackgroundColor(z21Var.getThemedColor(org.telegram.ui.ActionBar.f6.V5));
        view2.setAlpha(0.0f);
        addView(view2, g7.e6.d(-1, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        float a2 = g7.n.a((f10 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
        if (!z21.u(this.h)) {
            a2 = 1.0f;
        }
        float interpolation = gr.f28845g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.gk gkVar = this.f34497b;
        gkVar.setScaleX(lerp);
        gkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        gkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        ta1 ta1Var = this.f34498c;
        if (!z10) {
            gkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            ta1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        ta1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
        float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation);
        ImageView imageView = this.f34496a;
        imageView.setTranslationX(lerp2);
        float f11 = 1.0f - interpolation;
        imageView.setAlpha(f11);
        float lerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation);
        View view = this.f34500f;
        view.setTranslationY(lerp3);
        view.setAlpha(f11);
    }
}
