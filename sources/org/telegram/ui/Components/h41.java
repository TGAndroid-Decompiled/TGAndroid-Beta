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
public final class h41 extends FrameLayout {
    public final ImageView f24540a;
    public final org.telegram.ui.rk f24541b;
    public final dc1 f24542c;
    public final TextView d;
    public final f41 e;
    public final View f24543f;
    public final j41 h;

    public h41(j41 j41Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.h = j41Var;
        View view = new View(context);
        int themedColor = j41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19165h5);
        String str = j41Var.f25229s;
        view.setBackgroundColor(themedColor);
        addView(view, w7.y5.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f24540a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i12 = org.telegram.ui.ActionBar.j6.f19201j5;
        int themedColor2 = j41Var.getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(j41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19184i6), 1, -1));
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final h41 f23737b;

            {
                this.f23737b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.f6 f6Var;
                switch (r2) {
                    case 0:
                        this.f23737b.h.dismiss();
                        return;
                    default:
                        h41 h41Var = this.f23737b;
                        f41 f41Var = h41Var.e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(h41Var.getContext(), null);
                        Drawable mutate = h41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        j41 j41Var2 = h41Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(j41Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i13 = 0; i13 < locales.size(); i13++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i13);
                            if (!localeInfo.pluralLangCode.equals(j41Var2.f25229s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(j41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = h41Var.getContext();
                                if (i13 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                f6Var = ((org.telegram.ui.ActionBar.f3) j41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, context2, f6Var, z11, z10);
                                f1Var.setText(j41.y(j41.E(localeInfo.pluralLangCode, null, null)));
                                f1Var.setChecked(TextUtils.equals(j41Var2.v, localeInfo.pluralLangCode));
                                f1Var.setOnClickListener(new ai.d0(h41Var, runnableArr, localeInfo, 27));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new wq0(n1Var, 22);
                        n1Var.e = true;
                        n1Var.f19641c = 220;
                        n1Var.setOutsideTouchable(true);
                        n1Var.setClippingEnabled(true);
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        f41Var.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i14 = iArr[1];
                        if (i14 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i14 - measuredHeight2);
                        } else {
                            measuredHeight = (f41Var.getMeasuredHeight() + i14) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.f3) j41Var2).containerView;
                        n1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, w7.y5.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.rk rkVar = new org.telegram.ui.rk(this, context, 2);
        this.f24541b = rkVar;
        rkVar.setTextColor(j41Var.getThemedColor(i12));
        rkVar.setTextSize(1, 20.0f);
        rkVar.setTypeface(AndroidUtilities.bold());
        rkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        rkVar.setPivotX(0.0f);
        rkVar.setPivotY(0.0f);
        addView(rkVar, w7.y5.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        dc1 dc1Var = new dc1(this, context, 11);
        this.f24542c = dc1Var;
        if (LocaleController.isRTL) {
            dc1Var.setGravity(5);
        }
        dc1Var.setPivotX(0.0f);
        dc1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(j41Var.getThemedColor(org.telegram.ui.ActionBar.j6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(j41.y(j41.E(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i13 = org.telegram.ui.ActionBar.j6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(j41Var.getThemedColor(i13), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        f41 f41Var = new f41(this, context);
        this.e = f41Var;
        if (LocaleController.isRTL) {
            f41Var.setGravity(5);
        }
        f41Var.b(0.25f, 350L, qr.h);
        f41Var.setTextColor(j41Var.getThemedColor(i13));
        f41Var.setTextSize(AndroidUtilities.dp(14.0f));
        f41Var.setText(j41.y(j41.E(j41Var.v, null, null)));
        f41Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        f41Var.setOnClickListener(new View.OnClickListener(this) {
            public final h41 f23737b;

            {
                this.f23737b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.f6 f6Var;
                switch (r2) {
                    case 0:
                        this.f23737b.h.dismiss();
                        return;
                    default:
                        h41 h41Var = this.f23737b;
                        f41 f41Var2 = h41Var.e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(h41Var.getContext(), null);
                        Drawable mutate = h41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        j41 j41Var2 = h41Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(j41Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i132 = 0; i132 < locales.size(); i132++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i132);
                            if (!localeInfo.pluralLangCode.equals(j41Var2.f25229s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(j41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = h41Var.getContext();
                                if (i132 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                f6Var = ((org.telegram.ui.ActionBar.f3) j41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, context2, f6Var, z11, z10);
                                f1Var.setText(j41.y(j41.E(localeInfo.pluralLangCode, null, null)));
                                f1Var.setChecked(TextUtils.equals(j41Var2.v, localeInfo.pluralLangCode));
                                f1Var.setOnClickListener(new ai.d0(h41Var, runnableArr, localeInfo, 27));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new wq0(n1Var, 22);
                        n1Var.e = true;
                        n1Var.f19641c = 220;
                        n1Var.setOutsideTouchable(true);
                        n1Var.setClippingEnabled(true);
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        f41Var2.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i14 = iArr[1];
                        if (i14 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i14 - measuredHeight2);
                        } else {
                            measuredHeight = (f41Var2.getMeasuredHeight() + i14) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.f3) j41Var2).containerView;
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
            dc1Var.addView(f41Var, w7.y5.t(-2, -2, 16, 0, 0, i11, 0));
            if (this.d != null) {
                dc1Var.addView(imageView2, w7.y5.t(-2, -2, 16, 0, 1, 0, 0));
                dc1Var.addView(this.d, w7.y5.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                dc1Var.addView(textView2, w7.y5.t(-2, -2, 16, 0, 0, 4, 0));
                dc1Var.addView(imageView2, w7.y5.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            dc1Var.addView(f41Var, w7.y5.t(-2, -2, 16, i10, 0, 0, 0));
        }
        addView(dc1Var, w7.y5.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.f24543f = view2;
        view2.setBackgroundColor(j41Var.getThemedColor(org.telegram.ui.ActionBar.j6.V5));
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
        if (!j41.u(this.h)) {
            a2 = 1.0f;
        }
        float interpolation = qr.f27643g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.rk rkVar = this.f24541b;
        rkVar.setScaleX(lerp);
        rkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        rkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        dc1 dc1Var = this.f24542c;
        if (!z10) {
            rkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            dc1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        dc1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
        float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation);
        ImageView imageView = this.f24540a;
        imageView.setTranslationX(lerp2);
        float f10 = 1.0f - interpolation;
        imageView.setAlpha(f10);
        float lerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation);
        View view = this.f24543f;
        view.setTranslationY(lerp3);
        view.setAlpha(f10);
    }
}
