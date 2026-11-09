package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
public final class ka extends FrameLayout {
    public final org.telegram.ui.Components.x70 f47246a;
    public final org.telegram.ui.Cells.b2 f47247b;
    public Integer f47248c;
    public ValueAnimator d;
    public final la f47249e;

    public ka(la laVar, Activity activity) {
        super(activity);
        int i7;
        this.f47249e = laVar;
        laVar.F = this;
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.x70 x70Var = new org.telegram.ui.Components.x70(activity, null);
        this.f47246a = x70Var;
        x70Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.l6.F6;
        org.telegram.ui.ActionBar.s6.U(x70Var, i10, null);
        if (org.telegram.messenger.id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        x70Var.setGravity(i7);
        int i11 = org.telegram.ui.ActionBar.l6.J6;
        org.telegram.ui.ActionBar.s6.G(x70Var, i11, null);
        int i12 = org.telegram.ui.ActionBar.l6.K6;
        org.telegram.ui.ActionBar.s6.C(x70Var, i12, null);
        x70Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(2, activity, this);
        laVar.G = b2Var;
        this.f47247b = b2Var;
        b2Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.s6.U(b2Var, i10, null);
        b2Var.setGravity(org.telegram.messenger.id.f23157a0 ? 5 : 3);
        org.telegram.ui.ActionBar.s6.G(b2Var, i11, null);
        org.telegram.ui.ActionBar.s6.C(b2Var, i12, null);
        b2Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        addView(x70Var, c8.ha.e(-1, -2, 48));
        addView(b2Var, c8.ha.e(-1, -2, 48));
        if (laVar.f47548y != 0) {
            String M0 = org.telegram.messenger.id.M0(2131752938, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
            int indexOf = M0.indexOf(42);
            int lastIndexOf = M0.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.c41("https://fragment.com", (org.telegram.ui.Components.vy0) null), indexOf, lastIndexOf - 1, 33);
            }
            x70Var.setText(spannableStringBuilder);
            return;
        }
        x70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131743660, null)));
    }

    public static void a(final ka kaVar) {
        int intValue;
        int i7;
        float f10;
        org.telegram.ui.Components.x70 x70Var = kaVar.f47246a;
        org.telegram.ui.Cells.b2 b2Var = kaVar.f47247b;
        if (b2Var.getVisibility() == 0) {
            b2Var.measure(View.MeasureSpec.makeMeasureSpec((kaVar.getMeasuredWidth() - kaVar.getPaddingLeft()) - kaVar.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }
        ValueAnimator valueAnimator = kaVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = kaVar.f47248c;
        if (num == null) {
            intValue = kaVar.getMeasuredHeight();
        } else {
            intValue = num.intValue();
        }
        final int i10 = intValue;
        int height = x70Var.getHeight() + org.telegram.messenger.g0.L(27.0f);
        if (b2Var.getVisibility() == 0 && !TextUtils.isEmpty(b2Var.getText())) {
            i7 = org.telegram.messenger.g0.L(8.0f) + b2Var.getMeasuredHeight();
        } else {
            i7 = 0;
        }
        final int i11 = height + i7;
        final float translationY = x70Var.getTranslationY();
        if (b2Var.getVisibility() == 0 && !TextUtils.isEmpty(b2Var.getText())) {
            f10 = org.telegram.messenger.g0.L(8.0f) + b2Var.getMeasuredHeight();
        } else {
            f10 = 0.0f;
        }
        final float f11 = f10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        kaVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ka kaVar2 = ka.this;
                kaVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                kaVar2.f47246a.setTranslationY(org.telegram.messenger.g0.T1(translationY, f11, floatValue));
                kaVar2.f47248c = Integer.valueOf(org.telegram.messenger.g0.W1(floatValue, i10, i11));
                kaVar2.requestLayout();
            }
        });
        kaVar.d.setDuration(200L);
        kaVar.d.setInterpolator(org.telegram.ui.Components.xq.h);
        kaVar.d.start();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        Integer num = this.f47248c;
        if (num != null) {
            i10 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i7, i10);
    }
}
