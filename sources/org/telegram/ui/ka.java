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
public final class ka extends FrameLayout {
    public final org.telegram.ui.Components.y80 f39816a;
    public final org.telegram.ui.Cells.w1 f39817b;
    public Integer f39818c;
    public ValueAnimator d;
    public final la f39819e;

    public ka(la laVar, Activity activity) {
        super(activity);
        int i10;
        this.f39819e = laVar;
        laVar.B = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(activity, null);
        this.f39816a = y80Var;
        y80Var.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.g6.F6;
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        y80Var.setGravity(i10);
        int i12 = org.telegram.ui.ActionBar.g6.J6;
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        int i13 = org.telegram.ui.ActionBar.g6.K6;
        y80Var.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        y80Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, activity, 2);
        laVar.C = w1Var;
        this.f39817b = w1Var;
        w1Var.setTextSize(1, 15.0f);
        w1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        w1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        w1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        w1Var.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        w1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(y80Var, i7.f6.e(-1, -2, 48));
        addView(w1Var, i7.f6.e(-1, -2, 48));
        if (laVar.f40148x != 0) {
            String string = LocaleController.getString(R.string.BotUsernameHelp);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.a51("https://fragment.com", (org.telegram.ui.Components.h01) null), indexOf, lastIndexOf - 1, 33);
            }
            y80Var.setText(spannableStringBuilder);
            return;
        }
        b.o(R.string.UsernameHelp, y80Var);
    }

    public static void a(final ka kaVar) {
        int intValue;
        int i10;
        final float f9;
        org.telegram.ui.Components.y80 y80Var = kaVar.f39816a;
        org.telegram.ui.Cells.w1 w1Var = kaVar.f39817b;
        if (w1Var.getVisibility() == 0) {
            w1Var.measure(View.MeasureSpec.makeMeasureSpec((kaVar.getMeasuredWidth() - kaVar.getPaddingLeft()) - kaVar.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }
        ValueAnimator valueAnimator = kaVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = kaVar.f39818c;
        if (num == null) {
            intValue = kaVar.getMeasuredHeight();
        } else {
            intValue = num.intValue();
        }
        final int i11 = intValue;
        int height = y80Var.getHeight() + AndroidUtilities.dp(27.0f);
        if (w1Var.getVisibility() == 0 && !TextUtils.isEmpty(w1Var.getText())) {
            i10 = AndroidUtilities.dp(8.0f) + w1Var.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        final int i12 = height + i10;
        final float translationY = y80Var.getTranslationY();
        if (w1Var.getVisibility() == 0 && !TextUtils.isEmpty(w1Var.getText())) {
            f9 = AndroidUtilities.dp(8.0f) + w1Var.getMeasuredHeight();
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        kaVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ka kaVar2 = ka.this;
                kaVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                kaVar2.f39816a.setTranslationY(AndroidUtilities.lerp(translationY, f9, floatValue));
                kaVar2.f39818c = Integer.valueOf(AndroidUtilities.lerp(i11, i12, floatValue));
                kaVar2.requestLayout();
            }
        });
        kaVar.d.setDuration(200L);
        kaVar.d.setInterpolator(org.telegram.ui.Components.jr.h);
        kaVar.d.start();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Integer num = this.f39818c;
        if (num != null) {
            i11 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
