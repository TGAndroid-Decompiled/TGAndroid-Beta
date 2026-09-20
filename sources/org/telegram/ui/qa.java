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
    public final org.telegram.ui.Components.k90 f36836a;
    public final org.telegram.ui.Cells.y1 f36837b;
    public Integer f36838c;
    public ValueAnimator d;
    public final ra e;

    public qa(ra raVar, Activity activity) {
        super(activity);
        int i10;
        this.e = raVar;
        raVar.F = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.k90 k90Var = new org.telegram.ui.Components.k90(activity, null);
        this.f36836a = k90Var;
        k90Var.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.j6.F6;
        k90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        k90Var.setGravity(i10);
        int i12 = org.telegram.ui.ActionBar.j6.J6;
        k90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        int i13 = org.telegram.ui.ActionBar.j6.K6;
        k90Var.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        k90Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(this, activity, 2);
        raVar.G = y1Var;
        this.f36837b = y1Var;
        y1Var.setTextSize(1, 15.0f);
        y1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        y1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        y1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        y1Var.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        y1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(k90Var, w7.y5.e(-1, -2, 48));
        addView(y1Var, w7.y5.e(-1, -2, 48));
        if (raVar.f37086x != 0) {
            String string = LocaleController.getString(R.string.BotUsernameHelp);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.a61("https://fragment.com", (org.telegram.ui.Components.c11) null), indexOf, lastIndexOf - 1, 33);
            }
            k90Var.setText(spannableStringBuilder);
            return;
        }
        org.telegram.ui.Cells.c1.r(R.string.UsernameHelp, k90Var);
    }

    public static void a(final qa qaVar) {
        int intValue;
        int i10;
        final float f7;
        org.telegram.ui.Components.k90 k90Var = qaVar.f36836a;
        org.telegram.ui.Cells.y1 y1Var = qaVar.f36837b;
        if (y1Var.getVisibility() == 0) {
            y1Var.measure(View.MeasureSpec.makeMeasureSpec((qaVar.getMeasuredWidth() - qaVar.getPaddingLeft()) - qaVar.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }
        ValueAnimator valueAnimator = qaVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = qaVar.f36838c;
        if (num == null) {
            intValue = qaVar.getMeasuredHeight();
        } else {
            intValue = num.intValue();
        }
        final int i11 = intValue;
        int height = k90Var.getHeight() + AndroidUtilities.dp(27.0f);
        if (y1Var.getVisibility() == 0 && !TextUtils.isEmpty(y1Var.getText())) {
            i10 = AndroidUtilities.dp(8.0f) + y1Var.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        final int i12 = height + i10;
        final float translationY = k90Var.getTranslationY();
        if (y1Var.getVisibility() == 0 && !TextUtils.isEmpty(y1Var.getText())) {
            f7 = AndroidUtilities.dp(8.0f) + y1Var.getMeasuredHeight();
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        qaVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                qa qaVar2 = qa.this;
                qaVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                qaVar2.f36836a.setTranslationY(AndroidUtilities.lerp(translationY, f7, floatValue));
                qaVar2.f36838c = Integer.valueOf(AndroidUtilities.lerp(i11, i12, floatValue));
                qaVar2.requestLayout();
            }
        });
        qaVar.d.setDuration(200L);
        qaVar.d.setInterpolator(org.telegram.ui.Components.qr.h);
        qaVar.d.start();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Integer num = this.f36838c;
        if (num != null) {
            i11 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
