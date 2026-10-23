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
import org.telegram.ui.va1;
public final class w41 extends FrameLayout {
    public final ImageView f32153a;
    public final org.telegram.ui.lk f32154b;
    public final va1 f32155c;
    public final TextView d;
    public final u41 e;
    public final View f32156f;
    public final View h;
    public final y41 f32157n;

    public w41(y41 y41Var, Context context) {
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
        this.f32157n = y41Var;
        View view = new View(context);
        this.f32156f = view;
        int i12 = org.telegram.ui.ActionBar.k6.f21254h5;
        g6Var = ((org.telegram.ui.ActionBar.h3) y41Var).resourcesProvider;
        String str = y41Var.f32812s;
        org.telegram.ui.ActionBar.r6.i(i12, view, g6Var);
        addView(view, w7.z5.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f32153a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i13 = org.telegram.ui.ActionBar.k6.f21289j5;
        g6Var2 = ((org.telegram.ui.ActionBar.h3) y41Var).resourcesProvider;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i13, g6Var2, mode);
        int i14 = org.telegram.ui.ActionBar.k6.f21272i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(y41Var.getThemedColor(i14), 1, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
        g6Var3 = ((org.telegram.ui.ActionBar.h3) y41Var).resourcesProvider;
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, g6Var3);
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final w41 f30382b;

            {
                this.f30382b = this;
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
                        this.f30382b.f32157n.dismiss();
                        return;
                    default:
                        w41 w41Var = this.f30382b;
                        u41 u41Var = w41Var.e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(w41Var.getContext(), null);
                        Drawable mutate = w41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i15 = org.telegram.ui.ActionBar.k6.G8;
                        y41 y41Var2 = w41Var.f32157n;
                        g6Var9 = ((org.telegram.ui.ActionBar.h3) y41Var2).resourcesProvider;
                        org.telegram.ui.ActionBar.r6.z(w41Var, mutate, i15, g6Var9, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i16 = 0; i16 < locales.size(); i16++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i16);
                            if (!localeInfo.pluralLangCode.equals(y41Var2.f32812s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(y41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = w41Var.getContext();
                                if (i16 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                g6Var10 = ((org.telegram.ui.ActionBar.h3) y41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, context2, g6Var10, z11, z10);
                                e1Var.setText(y41.J(y41.N(localeInfo.pluralLangCode, null, null)));
                                e1Var.setChecked(TextUtils.equals(y41Var2.v, localeInfo.pluralLangCode));
                                e1Var.setOnClickListener(new t41(w41Var, runnableArr, localeInfo, 0));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new kr0(m1Var, 23);
                        m1Var.e = true;
                        m1Var.f21631c = 220;
                        m1Var.setOutsideTouchable(true);
                        m1Var.setClippingEnabled(true);
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        u41Var.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i17 = iArr[1];
                        if (i17 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i17 - measuredHeight2);
                        } else {
                            measuredHeight = (u41Var.getMeasuredHeight() + i17) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.h3) y41Var2).containerView;
                        m1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, w7.z5.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.lk lkVar = new org.telegram.ui.lk(this, context, 2);
        this.f32154b = lkVar;
        g6Var4 = ((org.telegram.ui.ActionBar.h3) y41Var).resourcesProvider;
        org.telegram.ui.ActionBar.r6.W(lkVar, i13, g6Var4);
        lkVar.setTextSize(1, 20.0f);
        lkVar.setTypeface(AndroidUtilities.bold());
        lkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        lkVar.setPivotX(0.0f);
        lkVar.setPivotY(0.0f);
        addView(lkVar, w7.z5.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        va1 va1Var = new va1(this, context, 13);
        this.f32155c = va1Var;
        if (LocaleController.isRTL) {
            va1Var.setGravity(5);
        }
        va1Var.setPivotX(0.0f);
        va1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            int i15 = org.telegram.ui.ActionBar.k6.Pi;
            g6Var8 = ((org.telegram.ui.ActionBar.h3) y41Var).resourcesProvider;
            org.telegram.ui.ActionBar.r6.W(textView, i15, g6Var8);
            textView.setTextSize(1, 14.0f);
            textView.setText(y41.J(y41.N(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i16 = org.telegram.ui.ActionBar.k6.Pi;
        g6Var5 = ((org.telegram.ui.ActionBar.h3) y41Var).resourcesProvider;
        org.telegram.ui.ActionBar.r6.t(imageView2, i16, g6Var5, mode);
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        u41 u41Var = new u41(this, context);
        this.e = u41Var;
        if (LocaleController.isRTL) {
            u41Var.setGravity(5);
        }
        u41Var.b(0.25f, 350L, bs.h);
        g6Var6 = ((org.telegram.ui.ActionBar.h3) y41Var).resourcesProvider;
        org.telegram.ui.ActionBar.r6.a0(u41Var, i16, g6Var6);
        u41Var.setTextSize(AndroidUtilities.dp(14.0f));
        u41Var.setText(y41.J(y41.N(y41Var.v, null, null)));
        u41Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        u41Var.setOnClickListener(new View.OnClickListener(this) {
            public final w41 f30382b;

            {
                this.f30382b = this;
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
                        this.f30382b.f32157n.dismiss();
                        return;
                    default:
                        w41 w41Var = this.f30382b;
                        u41 u41Var2 = w41Var.e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(w41Var.getContext(), null);
                        Drawable mutate = w41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i152 = org.telegram.ui.ActionBar.k6.G8;
                        y41 y41Var2 = w41Var.f32157n;
                        g6Var9 = ((org.telegram.ui.ActionBar.h3) y41Var2).resourcesProvider;
                        org.telegram.ui.ActionBar.r6.z(w41Var, mutate, i152, g6Var9, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z11 = true;
                        for (int i162 = 0; i162 < locales.size(); i162++) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i162);
                            if (!localeInfo.pluralLangCode.equals(y41Var2.f32812s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(y41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = w41Var.getContext();
                                if (i162 == locales.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                g6Var10 = ((org.telegram.ui.ActionBar.h3) y41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, context2, g6Var10, z11, z10);
                                e1Var.setText(y41.J(y41.N(localeInfo.pluralLangCode, null, null)));
                                e1Var.setChecked(TextUtils.equals(y41Var2.v, localeInfo.pluralLangCode));
                                e1Var.setOnClickListener(new t41(w41Var, runnableArr, localeInfo, 0));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new kr0(m1Var, 23);
                        m1Var.e = true;
                        m1Var.f21631c = 220;
                        m1Var.setOutsideTouchable(true);
                        m1Var.setClippingEnabled(true);
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        u41Var2.getLocationInWindow(iArr);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i17 = iArr[1];
                        if (i17 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i17 - measuredHeight2);
                        } else {
                            measuredHeight = (u41Var2.getMeasuredHeight() + i17) - AndroidUtilities.dp(8.0f);
                        }
                        viewGroup = ((org.telegram.ui.ActionBar.h3) y41Var2).containerView;
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
            va1Var.addView(u41Var, w7.z5.t(-2, -2, 16, 0, 0, i11, 0));
            if (this.d != null) {
                va1Var.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 0, 0));
                va1Var.addView(this.d, w7.z5.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                va1Var.addView(textView2, w7.z5.t(-2, -2, 16, 0, 0, 4, 0));
                va1Var.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            va1Var.addView(u41Var, w7.z5.t(-2, -2, 16, i10, 0, 0, 0));
        }
        addView(va1Var, w7.z5.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        int i17 = org.telegram.ui.ActionBar.k6.V5;
        g6Var7 = ((org.telegram.ui.ActionBar.h3) y41Var).resourcesProvider;
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
        if (!y41.E(this.f32157n)) {
            a2 = 1.0f;
        }
        float interpolation = bs.f25134g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.lk lkVar = this.f32154b;
        lkVar.setScaleX(lerp);
        lkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        lkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        va1 va1Var = this.f32155c;
        if (!z10) {
            lkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            va1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        va1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
        float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation);
        ImageView imageView = this.f32153a;
        imageView.setTranslationX(lerp2);
        float f10 = 1.0f - interpolation;
        imageView.setAlpha(f10);
        float lerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(lerp3);
        view.setAlpha(f10);
    }
}
