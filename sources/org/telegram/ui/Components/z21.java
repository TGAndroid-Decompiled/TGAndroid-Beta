package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ra1;

public final class z21 extends FrameLayout {

    public final ImageView f35139a;

    public final org.telegram.ui.ik f35140b;

    public final ra1 f35141c;
    public final TextView d;

    public final x21 f35142e;

    public final View f35143f;
    public final b31 h;

    public z21(b31 b31Var, Context context) {
        super(context);
        this.h = b31Var;
        View view = new View(context);
        int themedColor = b31Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5);
        String str = b31Var.f26912s;
        view.setBackgroundColor(themedColor);
        addView(view, h7.z5.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f35139a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i10 = org.telegram.ui.ActionBar.g6.f23161j5;
        int themedColor2 = b31Var.getThemedColor(i10);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(b31Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6), 1, -1));
        imageView.setAlpha(0.0f);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) {

            public final z21 f34099b;

            {
                this.f34099b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                switch (i11) {
                    case 0:
                        this.f34099b.h.dismiss();
                        break;
                    default:
                        z21 z21Var = this.f34099b;
                        x21 x21Var = z21Var.f35142e;
                        y21 y21Var = new y21(z21Var.getContext(), null);
                        Drawable drawableMutate = z21Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        b31 b31Var2 = z21Var.h;
                        drawableMutate.setColorFilter(new PorterDuffColorFilter(b31Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
                        y21Var.setBackground(drawableMutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        int i12 = 0;
                        boolean z10 = true;
                        while (i12 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i12);
                            if (!localeInfo.pluralLangCode.equals(b31Var2.f26912s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(b31Var2.v, localeInfo.pluralLangCode);
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, z21Var.getContext(), ((org.telegram.ui.ActionBar.e3) b31Var2).resourcesProvider, z10, i12 == locales.size() - 1);
                                f1Var.setText(b31.z(b31.E(localeInfo.pluralLangCode, null, null)));
                                f1Var.setChecked(TextUtils.equals(b31Var2.v, localeInfo.pluralLangCode));
                                f1Var.setOnClickListener(new ld0(z21Var, runnableArr, localeInfo, 2));
                                y21Var.addView(f1Var);
                                z10 = false;
                            }
                            i12++;
                        }
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(y21Var, -2, -2);
                        runnableArr[0] = new up0(n1Var, 22);
                        n1Var.f23684e = true;
                        n1Var.f23683c = 220;
                        n1Var.setOutsideTouchable(true);
                        n1Var.setClippingEnabled(true);
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        x21Var.getLocationInWindow(iArr);
                        y21Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = y21Var.getMeasuredHeight();
                        int i13 = iArr[1];
                        if (i13 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i13 - measuredHeight2);
                        } else {
                            measuredHeight = (x21Var.getMeasuredHeight() + i13) - AndroidUtilities.dp(8.0f);
                        }
                        n1Var.showAtLocation(((org.telegram.ui.ActionBar.e3) b31Var2).containerView, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                        break;
                }
            }
        });
        addView(imageView, h7.z5.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.ik ikVar = new org.telegram.ui.ik(this, context, 2);
        this.f35140b = ikVar;
        ikVar.setTextColor(b31Var.getThemedColor(i10));
        ikVar.setTextSize(1, 20.0f);
        ikVar.setTypeface(AndroidUtilities.bold());
        ikVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        ikVar.setPivotX(0.0f);
        ikVar.setPivotY(0.0f);
        addView(ikVar, h7.z5.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        ra1 ra1Var = new ra1(this, context, 13);
        this.f35141c = ra1Var;
        if (LocaleController.isRTL) {
            ra1Var.setGravity(5);
        }
        ra1Var.setPivotX(0.0f);
        ra1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(b31Var.getThemedColor(org.telegram.ui.ActionBar.g6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(b31.z(b31.E(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i12 = org.telegram.ui.ActionBar.g6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(b31Var.getThemedColor(i12), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        x21 x21Var = new x21(this, context);
        this.f35142e = x21Var;
        if (LocaleController.isRTL) {
            x21Var.setGravity(5);
        }
        x21Var.b(0.25f, 350L, er.h);
        x21Var.setTextColor(b31Var.getThemedColor(i12));
        x21Var.setTextSize(AndroidUtilities.dp(14.0f));
        x21Var.setText(b31.z(b31.E(b31Var.v, null, null)));
        x21Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        final int i13 = 1;
        x21Var.setOnClickListener(new View.OnClickListener(this) {

            public final z21 f34099b;

            {
                this.f34099b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                switch (i13) {
                    case 0:
                        this.f34099b.h.dismiss();
                        break;
                    default:
                        z21 z21Var = this.f34099b;
                        x21 x21Var2 = z21Var.f35142e;
                        y21 y21Var = new y21(z21Var.getContext(), null);
                        Drawable drawableMutate = z21Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        b31 b31Var2 = z21Var.h;
                        drawableMutate.setColorFilter(new PorterDuffColorFilter(b31Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
                        y21Var.setBackground(drawableMutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        int i14 = 0;
                        boolean z10 = true;
                        while (i14 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i14);
                            if (!localeInfo.pluralLangCode.equals(b31Var2.f26912s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(b31Var2.v, localeInfo.pluralLangCode);
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, z21Var.getContext(), ((org.telegram.ui.ActionBar.e3) b31Var2).resourcesProvider, z10, i14 == locales.size() - 1);
                                f1Var.setText(b31.z(b31.E(localeInfo.pluralLangCode, null, null)));
                                f1Var.setChecked(TextUtils.equals(b31Var2.v, localeInfo.pluralLangCode));
                                f1Var.setOnClickListener(new ld0(z21Var, runnableArr, localeInfo, 2));
                                y21Var.addView(f1Var);
                                z10 = false;
                            }
                            i14++;
                        }
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(y21Var, -2, -2);
                        runnableArr[0] = new up0(n1Var, 22);
                        n1Var.f23684e = true;
                        n1Var.f23683c = 220;
                        n1Var.setOutsideTouchable(true);
                        n1Var.setClippingEnabled(true);
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        x21Var2.getLocationInWindow(iArr);
                        y21Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                        int measuredHeight2 = y21Var.getMeasuredHeight();
                        int i15 = iArr[1];
                        if (i15 > (AndroidUtilities.displaySize.y * 0.9f) - measuredHeight2) {
                            measuredHeight = AndroidUtilities.dp(8.0f) + (i15 - measuredHeight2);
                        } else {
                            measuredHeight = (x21Var2.getMeasuredHeight() + i15) - AndroidUtilities.dp(8.0f);
                        }
                        n1Var.showAtLocation(((org.telegram.ui.ActionBar.e3) b31Var2).containerView, 51, iArr[0] - AndroidUtilities.dp(8.0f), measuredHeight);
                        break;
                }
            }
        });
        if (LocaleController.isRTL) {
            ra1Var.addView(x21Var, h7.z5.t(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
            if (this.d != null) {
                ra1Var.addView(imageView2, h7.z5.t(-2, -2, 16, 0, 1, 0, 0));
                ra1Var.addView(this.d, h7.z5.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                ra1Var.addView(textView2, h7.z5.t(-2, -2, 16, 0, 0, 4, 0));
                ra1Var.addView(imageView2, h7.z5.t(-2, -2, 16, 0, 1, 0, 0));
            }
            ra1Var.addView(x21Var, h7.z5.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(ra1Var, h7.z5.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.f35143f = view2;
        view2.setBackgroundColor(b31Var.getThemedColor(org.telegram.ui.ActionBar.g6.V5));
        view2.setAlpha(0.0f);
        addView(view2, h7.z5.d(-1, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        float fA = h7.n.a((f10 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
        if (!b31.v(this.h)) {
            fA = 1.0f;
        }
        float interpolation = er.f28123g.getInterpolation(fA);
        float fLerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.ik ikVar = this.f35140b;
        ikVar.setScaleX(fLerp);
        ikVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        ikVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        ra1 ra1Var = this.f35141c;
        if (!z10) {
            ikVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            ra1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        ra1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
        float fLerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation);
        ImageView imageView = this.f35139a;
        imageView.setTranslationX(fLerp2);
        float f11 = 1.0f - interpolation;
        imageView.setAlpha(f11);
        float fLerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation);
        View view = this.f35143f;
        view.setTranslationY(fLerp3);
        view.setAlpha(f11);
    }
}
