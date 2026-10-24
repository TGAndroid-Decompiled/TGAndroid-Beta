package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
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
public final class v41 extends FrameLayout {
    public final ImageView f31317a;
    public final org.telegram.ui.lk f31318b;
    public final ua1 f31319c;
    public final TextView d;
    public final t41 e;
    public final View f31320f;
    public final View h;
    public final x41 f31321n;

    public v41(x41 x41Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        org.telegram.ui.ActionBar.g6 g6Var5;
        org.telegram.ui.ActionBar.g6 g6Var6;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var7;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var8;
        this.f31321n = x41Var;
        View view = new View(context);
        this.f31320f = view;
        int i12 = org.telegram.ui.ActionBar.k6.f21255h5;
        g6Var = ((org.telegram.ui.ActionBar.h3) x41Var).resourcesProvider;
        String str = x41Var.f32517s;
        org.telegram.ui.ActionBar.r6.i(i12, view, g6Var);
        addView(view, w7.z5.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f31317a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i13 = org.telegram.ui.ActionBar.k6.f21290j5;
        g6Var2 = ((org.telegram.ui.ActionBar.h3) x41Var).resourcesProvider;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i13, g6Var2, mode);
        int i14 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(x41Var.getThemedColor(i14), 1, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
        g6Var3 = ((org.telegram.ui.ActionBar.h3) x41Var).resourcesProvider;
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, g6Var3);
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final v41 f30063b;

            {
                this.f30063b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.ui.ActionBar.g6 g6Var9;
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.g6 g6Var10;
                switch (r2) {
                    case 0:
                        this.f30063b.f31321n.dismiss();
                        return;
                    default:
                        v41 v41Var = this.f30063b;
                        t41 t41Var = v41Var.e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(v41Var.getContext(), null);
                        Drawable mutate = v41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i15 = org.telegram.ui.ActionBar.k6.G8;
                        x41 x41Var2 = v41Var.f31321n;
                        g6Var9 = ((org.telegram.ui.ActionBar.h3) x41Var2).resourcesProvider;
                        org.telegram.ui.ActionBar.r6.z(v41Var, mutate, i15, g6Var9, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i16 = 0; i16 < locales.size(); i16++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i16);
                            if (!localeInfo.pluralLangCode.equals(x41Var2.f32517s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(x41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = v41Var.getContext();
                                if (i16 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                g6Var10 = ((org.telegram.ui.ActionBar.h3) x41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, context2, g6Var10, z11, z10);
                                e1Var.setText(x41.J(x41.N(localeInfo.pluralLangCode, null, null)));
                                e1Var.setChecked(TextUtils.equals(x41Var2.v, localeInfo.pluralLangCode));
                                e1Var.setOnClickListener(new s41(v41Var, runnableArr, localeInfo, 0));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new jr0(m1Var, 23);
                        m1Var.e = true;
                        m1Var.f21632c = 220;
                        m1Var.setOutsideTouchable(true);
                        m1Var.setClippingEnabled(true);
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        t41Var.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i17 = iArr[1];
                        if (i17 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i17 - measuredHeight2);
                        } else {
                            measuredHeight = (t41Var.getMeasuredHeight() + i17) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.h3) x41Var2).containerView;
                        m1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, w7.z5.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.lk lkVar = new org.telegram.ui.lk(this, context, 2);
        this.f31318b = lkVar;
        g6Var4 = ((org.telegram.ui.ActionBar.h3) x41Var).resourcesProvider;
        org.telegram.ui.ActionBar.r6.W(lkVar, i13, g6Var4);
        lkVar.setTextSize(1, 20.0f);
        lkVar.setTypeface(AndroidUtilities.bold());
        lkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        lkVar.setPivotX(0.0f);
        lkVar.setPivotY(0.0f);
        addView(lkVar, w7.z5.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        ua1 ua1Var = new ua1(this, context, 13);
        this.f31319c = ua1Var;
        if (LocaleController.isRTL) {
            ua1Var.setGravity(5);
        }
        ua1Var.setPivotX(0.0f);
        ua1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            int i15 = org.telegram.ui.ActionBar.k6.Pi;
            g6Var8 = ((org.telegram.ui.ActionBar.h3) x41Var).resourcesProvider;
            org.telegram.ui.ActionBar.r6.W(textView, i15, g6Var8);
            textView.setTextSize(1, 14.0f);
            textView.setText(x41.J(x41.N(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i16 = org.telegram.ui.ActionBar.k6.Pi;
        g6Var5 = ((org.telegram.ui.ActionBar.h3) x41Var).resourcesProvider;
        org.telegram.ui.ActionBar.r6.t(imageView2, i16, g6Var5, mode);
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        t41 t41Var = new t41(this, context);
        this.e = t41Var;
        if (LocaleController.isRTL) {
            t41Var.setGravity(5);
        }
        t41Var.b(0.25f, 350L, zr.h);
        g6Var6 = ((org.telegram.ui.ActionBar.h3) x41Var).resourcesProvider;
        org.telegram.ui.ActionBar.r6.a0(t41Var, i16, g6Var6);
        t41Var.setTextSize(AndroidUtilities.dp(14.0f));
        t41Var.setText(x41.J(x41.N(x41Var.v, null, null)));
        t41Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        t41Var.setOnClickListener(new View.OnClickListener(this) {
            public final v41 f30063b;

            {
                this.f30063b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.ui.ActionBar.g6 g6Var9;
                int measuredHeight;
                ViewGroup viewGroup;
                boolean z10;
                org.telegram.ui.ActionBar.g6 g6Var10;
                switch (r2) {
                    case 0:
                        this.f30063b.f31321n.dismiss();
                        return;
                    default:
                        v41 v41Var = this.f30063b;
                        t41 t41Var2 = v41Var.e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(v41Var.getContext(), null);
                        Drawable mutate = v41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i152 = org.telegram.ui.ActionBar.k6.G8;
                        x41 x41Var2 = v41Var.f31321n;
                        g6Var9 = ((org.telegram.ui.ActionBar.h3) x41Var2).resourcesProvider;
                        org.telegram.ui.ActionBar.r6.z(v41Var, mutate, i152, g6Var9, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i162 = 0; i162 < locales.size(); i162++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i162);
                            if (!localeInfo.pluralLangCode.equals(x41Var2.f32517s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(x41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = v41Var.getContext();
                                if (i162 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                g6Var10 = ((org.telegram.ui.ActionBar.h3) x41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, context2, g6Var10, z11, z10);
                                e1Var.setText(x41.J(x41.N(localeInfo.pluralLangCode, null, null)));
                                e1Var.setChecked(TextUtils.equals(x41Var2.v, localeInfo.pluralLangCode));
                                e1Var.setOnClickListener(new s41(v41Var, runnableArr, localeInfo, 0));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new jr0(m1Var, 23);
                        m1Var.e = true;
                        m1Var.f21632c = 220;
                        m1Var.setOutsideTouchable(true);
                        m1Var.setClippingEnabled(true);
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        t41Var2.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i17 = iArr[1];
                        if (i17 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i17 - measuredHeight2);
                        } else {
                            measuredHeight = (t41Var2.getMeasuredHeight() + i17) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.h3) x41Var2).containerView;
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
            ua1Var.addView(t41Var, w7.z5.t(-2, -2, 16, 0, 0, i11, 0));
            if (this.d != null) {
                ua1Var.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 0, 0));
                ua1Var.addView(this.d, w7.z5.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                ua1Var.addView(textView2, w7.z5.t(-2, -2, 16, 0, 0, 4, 0));
                ua1Var.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            ua1Var.addView(t41Var, w7.z5.t(-2, -2, 16, i10, 0, 0, 0));
        }
        addView(ua1Var, w7.z5.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        int i17 = org.telegram.ui.ActionBar.k6.V5;
        g6Var7 = ((org.telegram.ui.ActionBar.h3) x41Var).resourcesProvider;
        org.telegram.ui.ActionBar.r6.i(i17, view2, g6Var7);
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
        if (!x41.E(this.f31321n)) {
            a2 = 1.0f;
        }
        float interpolation = zr.f33338g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.lk lkVar = this.f31318b;
        lkVar.setScaleX(lerp);
        lkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        lkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        ua1 ua1Var = this.f31319c;
        if (!z10) {
            lkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            ua1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        ua1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
        float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation);
        ImageView imageView = this.f31317a;
        imageView.setTranslationX(lerp2);
        float f10 = 1.0f - interpolation;
        imageView.setAlpha(f10);
        float lerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(lerp3);
        view.setAlpha(f10);
    }
}
