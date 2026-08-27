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

public final class ma extends FrameLayout {

    public final org.telegram.ui.Components.p80 f40420a;

    public final org.telegram.ui.Cells.w1 f40421b;

    public Integer f40422c;
    public ValueAnimator d;

    public final na f40423e;

    public ma(na naVar, Activity activity) {
        super(activity);
        this.f40423e = naVar;
        naVar.B = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(activity, null);
        this.f40420a = p80Var;
        p80Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.g6.F6;
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        p80Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i11 = org.telegram.ui.ActionBar.g6.J6;
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.g6.K6;
        p80Var.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        p80Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, activity, 2);
        naVar.C = w1Var;
        this.f40421b = w1Var;
        w1Var.setTextSize(1, 15.0f);
        w1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        w1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        w1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        w1Var.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        w1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(p80Var, h7.z5.e(-1, -2, 48));
        addView(w1Var, h7.z5.e(-1, -2, 48));
        if (naVar.f40709x == 0) {
            org.telegram.ui.Cells.pa.q(R.string.UsernameHelp, p80Var);
            return;
        }
        String string = LocaleController.getString(R.string.BotUsernameHelp);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int iIndexOf = string.indexOf(42);
        int iLastIndexOf = string.lastIndexOf(42);
        if (iIndexOf != -1 && iLastIndexOf != -1 && iIndexOf != iLastIndexOf) {
            spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.r41("https://fragment.com", (org.telegram.ui.Components.xz0) null), iIndexOf, iLastIndexOf - 1, 33);
        }
        p80Var.setText(spannableStringBuilder);
    }

    public static void a(final ma maVar) {
        int iDp;
        final float fDp;
        org.telegram.ui.Components.p80 p80Var = maVar.f40420a;
        org.telegram.ui.Cells.w1 w1Var = maVar.f40421b;
        if (w1Var.getVisibility() == 0) {
            w1Var.measure(View.MeasureSpec.makeMeasureSpec((maVar.getMeasuredWidth() - maVar.getPaddingLeft()) - maVar.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }
        ValueAnimator valueAnimator = maVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = maVar.f40422c;
        final int measuredHeight = num == null ? maVar.getMeasuredHeight() : num.intValue();
        int height = p80Var.getHeight() + AndroidUtilities.dp(27.0f);
        if (w1Var.getVisibility() != 0 || TextUtils.isEmpty(w1Var.getText())) {
            iDp = 0;
        } else {
            iDp = AndroidUtilities.dp(8.0f) + w1Var.getMeasuredHeight();
        }
        final int i10 = height + iDp;
        final float translationY = p80Var.getTranslationY();
        if (w1Var.getVisibility() != 0 || TextUtils.isEmpty(w1Var.getText())) {
            fDp = 0.0f;
        } else {
            fDp = AndroidUtilities.dp(8.0f) + w1Var.getMeasuredHeight();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        maVar.d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ma maVar2 = this.f40027a;
                maVar2.getClass();
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                maVar2.f40420a.setTranslationY(AndroidUtilities.lerp(translationY, fDp, fFloatValue));
                maVar2.f40422c = Integer.valueOf(AndroidUtilities.lerp(measuredHeight, i10, fFloatValue));
                maVar2.requestLayout();
            }
        });
        maVar.d.setDuration(200L);
        maVar.d.setInterpolator(org.telegram.ui.Components.er.h);
        maVar.d.start();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Integer num = this.f40422c;
        if (num != null) {
            i11 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
