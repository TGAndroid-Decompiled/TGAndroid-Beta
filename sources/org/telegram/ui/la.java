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
public final class la extends FrameLayout {
    public final org.telegram.ui.Components.l80 f40089a;
    public final org.telegram.ui.Cells.x1 f40090b;
    public Integer f40091c;
    public ValueAnimator d;
    public final ma f40092e;

    public la(ma maVar, Activity activity) {
        super(activity);
        int i9;
        this.f40092e = maVar;
        maVar.B = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(activity, null);
        this.f40089a = l80Var;
        l80Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.f6.F6;
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        l80Var.setGravity(i9);
        int i11 = org.telegram.ui.ActionBar.f6.J6;
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.f6.K6;
        l80Var.setHighlightColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        l80Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity, 2);
        maVar.C = x1Var;
        this.f40090b = x1Var;
        x1Var.setTextSize(1, 15.0f);
        x1Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        x1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        x1Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        x1Var.setHighlightColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        x1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(l80Var, g7.e6.e(-1, -2, 48));
        addView(x1Var, g7.e6.e(-1, -2, 48));
        if (maVar.f40370x != 0) {
            String string = LocaleController.getString(R.string.BotUsernameHelp);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.p41("https://fragment.com", (org.telegram.ui.Components.vz0) null), indexOf, lastIndexOf - 1, 33);
            }
            l80Var.setText(spannableStringBuilder);
            return;
        }
        org.telegram.ui.Cells.j2.p(R.string.UsernameHelp, l80Var);
    }

    public static void a(final la laVar) {
        int intValue;
        int i9;
        final float f10;
        org.telegram.ui.Components.l80 l80Var = laVar.f40089a;
        org.telegram.ui.Cells.x1 x1Var = laVar.f40090b;
        if (x1Var.getVisibility() == 0) {
            x1Var.measure(View.MeasureSpec.makeMeasureSpec((laVar.getMeasuredWidth() - laVar.getPaddingLeft()) - laVar.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }
        ValueAnimator valueAnimator = laVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = laVar.f40091c;
        if (num == null) {
            intValue = laVar.getMeasuredHeight();
        } else {
            intValue = num.intValue();
        }
        final int i10 = intValue;
        int height = l80Var.getHeight() + AndroidUtilities.dp(27.0f);
        if (x1Var.getVisibility() == 0 && !TextUtils.isEmpty(x1Var.getText())) {
            i9 = AndroidUtilities.dp(8.0f) + x1Var.getMeasuredHeight();
        } else {
            i9 = 0;
        }
        final int i11 = height + i9;
        final float translationY = l80Var.getTranslationY();
        if (x1Var.getVisibility() == 0 && !TextUtils.isEmpty(x1Var.getText())) {
            f10 = AndroidUtilities.dp(8.0f) + x1Var.getMeasuredHeight();
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        laVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                la laVar2 = la.this;
                laVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                laVar2.f40089a.setTranslationY(AndroidUtilities.lerp(translationY, f10, floatValue));
                laVar2.f40091c = Integer.valueOf(AndroidUtilities.lerp(i10, i11, floatValue));
                laVar2.requestLayout();
            }
        });
        laVar.d.setDuration(200L);
        laVar.d.setInterpolator(org.telegram.ui.Components.gr.h);
        laVar.d.start();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        Integer num = this.f40091c;
        if (num != null) {
            i10 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i9, i10);
    }
}
