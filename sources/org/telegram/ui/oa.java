package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class oa extends FrameLayout {
    public final org.telegram.ui.Components.g90 f39692a;
    public final org.telegram.ui.Cells.x1 f39693b;
    public Integer f39694c;
    public ValueAnimator d;
    public final pa f39695e;

    public oa(pa paVar, Activity activity) {
        super(activity);
        int i10;
        this.f39695e = paVar;
        paVar.C = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(activity, null);
        this.f39692a = g90Var;
        g90Var.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.k6.F6;
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        g90Var.setGravity(i10);
        int i12 = org.telegram.ui.ActionBar.k6.J6;
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        int i13 = org.telegram.ui.ActionBar.k6.K6;
        g90Var.setHighlightColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        g90Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity, 2);
        paVar.D = x1Var;
        this.f39693b = x1Var;
        x1Var.setTextSize(1, 15.0f);
        x1Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        x1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        x1Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        x1Var.setHighlightColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        x1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(g90Var, k7.c6.e(-1, -2, 48));
        addView(x1Var, k7.c6.e(-1, -2, 48));
        if (paVar.f40000x != 0) {
            String string = LocaleController.getString(R.string.BotUsernameHelp);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.n51("https://fragment.com", (org.telegram.ui.Components.t01) null), indexOf, lastIndexOf - 1, 33);
            }
            g90Var.setText(spannableStringBuilder);
            return;
        }
        b.n(R.string.UsernameHelp, g90Var);
    }

    public static void a(final oa oaVar) {
        int intValue;
        int i10;
        final float f10;
        org.telegram.ui.Components.g90 g90Var = oaVar.f39692a;
        org.telegram.ui.Cells.x1 x1Var = oaVar.f39693b;
        if (x1Var.getVisibility() == 0) {
            x1Var.measure(View.MeasureSpec.makeMeasureSpec((oaVar.getMeasuredWidth() - oaVar.getPaddingLeft()) - oaVar.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }
        ValueAnimator valueAnimator = oaVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = oaVar.f39694c;
        if (num == null) {
            intValue = oaVar.getMeasuredHeight();
        } else {
            intValue = num.intValue();
        }
        final int i11 = intValue;
        int height = g90Var.getHeight() + AndroidUtilities.dp(27.0f);
        if (x1Var.getVisibility() == 0 && !TextUtils.isEmpty(x1Var.getText())) {
            i10 = AndroidUtilities.dp(8.0f) + x1Var.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        final int i12 = height + i10;
        final float translationY = g90Var.getTranslationY();
        if (x1Var.getVisibility() == 0 && !TextUtils.isEmpty(x1Var.getText())) {
            f10 = AndroidUtilities.dp(8.0f) + x1Var.getMeasuredHeight();
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        oaVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                oa oaVar2 = oa.this;
                oaVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                oaVar2.f39692a.setTranslationY(AndroidUtilities.lerp(translationY, f10, floatValue));
                oaVar2.f39694c = Integer.valueOf(AndroidUtilities.lerp(i11, i12, floatValue));
                oaVar2.requestLayout();
            }
        });
        oaVar.d.setDuration(200L);
        oaVar.d.setInterpolator(org.telegram.ui.Components.pr.h);
        oaVar.d.start();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Integer num = this.f39694c;
        if (num != null) {
            i11 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
