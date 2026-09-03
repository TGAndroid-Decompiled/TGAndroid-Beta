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
public final class qa extends FrameLayout {
    public final org.telegram.ui.Components.f90 f37365a;
    public final org.telegram.ui.Cells.w1 f37366b;
    public Integer f37367c;
    public ValueAnimator d;
    public final ra e;

    public qa(ra raVar, Activity activity) {
        super(activity);
        int i10;
        this.e = raVar;
        raVar.C = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(activity, null);
        this.f37365a = f90Var;
        f90Var.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.j6.F6;
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        f90Var.setGravity(i10);
        int i12 = org.telegram.ui.ActionBar.j6.J6;
        f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        int i13 = org.telegram.ui.ActionBar.j6.K6;
        f90Var.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        f90Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, activity, 2);
        raVar.D = w1Var;
        this.f37366b = w1Var;
        w1Var.setTextSize(1, 15.0f);
        w1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        w1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        w1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        w1Var.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        w1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(f90Var, k7.b6.e(-1, -2, 48));
        addView(w1Var, k7.b6.e(-1, -2, 48));
        if (raVar.f37783x != 0) {
            String string = LocaleController.getString(R.string.BotUsernameHelp);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.m51("https://fragment.com", (org.telegram.ui.Components.s01) null), indexOf, lastIndexOf - 1, 33);
            }
            f90Var.setText(spannableStringBuilder);
            return;
        }
        b.n(R.string.UsernameHelp, f90Var);
    }

    public static void a(final qa qaVar) {
        int intValue;
        int i10;
        final float f10;
        org.telegram.ui.Components.f90 f90Var = qaVar.f37365a;
        org.telegram.ui.Cells.w1 w1Var = qaVar.f37366b;
        if (w1Var.getVisibility() == 0) {
            w1Var.measure(View.MeasureSpec.makeMeasureSpec((qaVar.getMeasuredWidth() - qaVar.getPaddingLeft()) - qaVar.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }
        ValueAnimator valueAnimator = qaVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = qaVar.f37367c;
        if (num == null) {
            intValue = qaVar.getMeasuredHeight();
        } else {
            intValue = num.intValue();
        }
        final int i11 = intValue;
        int height = f90Var.getHeight() + AndroidUtilities.dp(27.0f);
        if (w1Var.getVisibility() == 0 && !TextUtils.isEmpty(w1Var.getText())) {
            i10 = AndroidUtilities.dp(8.0f) + w1Var.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        final int i12 = height + i10;
        final float translationY = f90Var.getTranslationY();
        if (w1Var.getVisibility() == 0 && !TextUtils.isEmpty(w1Var.getText())) {
            f10 = AndroidUtilities.dp(8.0f) + w1Var.getMeasuredHeight();
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        qaVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                qa qaVar2 = qa.this;
                qaVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                qaVar2.f37365a.setTranslationY(AndroidUtilities.lerp(translationY, f10, floatValue));
                qaVar2.f37367c = Integer.valueOf(AndroidUtilities.lerp(i11, i12, floatValue));
                qaVar2.requestLayout();
            }
        });
        qaVar.d.setDuration(200L);
        qaVar.d.setInterpolator(org.telegram.ui.Components.mr.h);
        qaVar.d.start();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Integer num = this.f37367c;
        if (num != null) {
            i11 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
