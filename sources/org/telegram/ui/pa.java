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
public final class pa extends FrameLayout {
    public final org.telegram.ui.Components.n90 f36451a;
    public final org.telegram.ui.Cells.y1 f36452b;
    public Integer f36453c;
    public ValueAnimator d;
    public final qa e;

    public pa(qa qaVar, Activity activity) {
        super(activity);
        int i10;
        this.e = qaVar;
        qaVar.F = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.n90 n90Var = new org.telegram.ui.Components.n90(activity, null);
        this.f36451a = n90Var;
        n90Var.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.h6.F6;
        n90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        n90Var.setGravity(i10);
        int i12 = org.telegram.ui.ActionBar.h6.J6;
        n90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        int i13 = org.telegram.ui.ActionBar.h6.K6;
        n90Var.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        n90Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(this, activity, 2);
        qaVar.G = y1Var;
        this.f36452b = y1Var;
        y1Var.setTextSize(1, 15.0f);
        y1Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        y1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        y1Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        y1Var.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        y1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(n90Var, w7.y5.e(-1, -2, 48));
        addView(y1Var, w7.y5.e(-1, -2, 48));
        if (qaVar.f36838x != 0) {
            String string = LocaleController.getString(R.string.BotUsernameHelp);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.z51("https://fragment.com", (org.telegram.ui.Components.b11) null), indexOf, lastIndexOf - 1, 33);
            }
            n90Var.setText(spannableStringBuilder);
            return;
        }
        org.telegram.ui.Cells.c1.q(R.string.UsernameHelp, n90Var);
    }

    public static void a(final pa paVar) {
        int intValue;
        int i10;
        final float f7;
        org.telegram.ui.Components.n90 n90Var = paVar.f36451a;
        org.telegram.ui.Cells.y1 y1Var = paVar.f36452b;
        if (y1Var.getVisibility() == 0) {
            y1Var.measure(View.MeasureSpec.makeMeasureSpec((paVar.getMeasuredWidth() - paVar.getPaddingLeft()) - paVar.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }
        ValueAnimator valueAnimator = paVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = paVar.f36453c;
        if (num == null) {
            intValue = paVar.getMeasuredHeight();
        } else {
            intValue = num.intValue();
        }
        final int i11 = intValue;
        int height = n90Var.getHeight() + AndroidUtilities.dp(27.0f);
        if (y1Var.getVisibility() == 0 && !TextUtils.isEmpty(y1Var.getText())) {
            i10 = AndroidUtilities.dp(8.0f) + y1Var.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        final int i12 = height + i10;
        final float translationY = n90Var.getTranslationY();
        if (y1Var.getVisibility() == 0 && !TextUtils.isEmpty(y1Var.getText())) {
            f7 = AndroidUtilities.dp(8.0f) + y1Var.getMeasuredHeight();
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        paVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                pa paVar2 = pa.this;
                paVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                paVar2.f36451a.setTranslationY(AndroidUtilities.lerp(translationY, f7, floatValue));
                paVar2.f36453c = Integer.valueOf(AndroidUtilities.lerp(i11, i12, floatValue));
                paVar2.requestLayout();
            }
        });
        paVar.d.setDuration(200L);
        paVar.d.setInterpolator(org.telegram.ui.Components.rr.h);
        paVar.d.start();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Integer num = this.f36453c;
        if (num != null) {
            i11 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
