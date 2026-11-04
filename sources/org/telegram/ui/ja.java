package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
public final class ja extends FrameLayout {
    public final org.telegram.ui.Components.s70 f46577a;
    public final org.telegram.ui.Cells.b2 f46578b;
    public Integer f46579c;
    public ValueAnimator d;
    public final ka f46580e;

    public ja(ka kaVar, Activity activity) {
        super(activity);
        int i3;
        this.f46580e = kaVar;
        kaVar.G = this;
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(activity, null);
        this.f46577a = s70Var;
        s70Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.k6.F6;
        org.telegram.ui.ActionBar.r6.V(s70Var, i10, null);
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        s70Var.setGravity(i3);
        int i11 = org.telegram.ui.ActionBar.k6.J6;
        org.telegram.ui.ActionBar.r6.H(s70Var, i11, null);
        int i12 = org.telegram.ui.ActionBar.k6.K6;
        org.telegram.ui.ActionBar.r6.D(s70Var, i12, null);
        s70Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(2, activity, this);
        kaVar.H = b2Var;
        this.f46578b = b2Var;
        b2Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.r6.V(b2Var, i10, null);
        b2Var.setGravity(org.telegram.messenger.bd.f21784a0 ? 5 : 3);
        org.telegram.ui.ActionBar.r6.H(b2Var, i11, null);
        org.telegram.ui.ActionBar.r6.D(b2Var, i12, null);
        b2Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        addView(s70Var, b8.mf.e(-1, -2, 48));
        addView(b2Var, b8.mf.e(-1, -2, 48));
        if (kaVar.f46848y != 0) {
            String M0 = org.telegram.messenger.bd.M0(2131752938, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
            int indexOf = M0.indexOf(42);
            int lastIndexOf = M0.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.v31("https://fragment.com", (org.telegram.ui.Components.ty0) null), indexOf, lastIndexOf - 1, 33);
            }
            s70Var.setText(spannableStringBuilder);
            return;
        }
        s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131743670, null)));
    }

    public static void a(final ja jaVar) {
        int intValue;
        int i3;
        float f10;
        org.telegram.ui.Components.s70 s70Var = jaVar.f46577a;
        org.telegram.ui.Cells.b2 b2Var = jaVar.f46578b;
        if (b2Var.getVisibility() == 0) {
            b2Var.measure(View.MeasureSpec.makeMeasureSpec((jaVar.getMeasuredWidth() - jaVar.getPaddingLeft()) - jaVar.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }
        ValueAnimator valueAnimator = jaVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = jaVar.f46579c;
        if (num == null) {
            intValue = jaVar.getMeasuredHeight();
        } else {
            intValue = num.intValue();
        }
        final int i10 = intValue;
        int height = s70Var.getHeight() + org.telegram.messenger.g0.L(27.0f);
        if (b2Var.getVisibility() == 0 && !TextUtils.isEmpty(b2Var.getText())) {
            i3 = org.telegram.messenger.g0.L(8.0f) + b2Var.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        final int i11 = height + i3;
        final float translationY = s70Var.getTranslationY();
        if (b2Var.getVisibility() == 0 && !TextUtils.isEmpty(b2Var.getText())) {
            f10 = org.telegram.messenger.g0.L(8.0f) + b2Var.getMeasuredHeight();
        } else {
            f10 = 0.0f;
        }
        final float f11 = f10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        jaVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ja jaVar2 = ja.this;
                jaVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                jaVar2.f46577a.setTranslationY(org.telegram.messenger.g0.T1(translationY, f11, floatValue));
                jaVar2.f46579c = Integer.valueOf(org.telegram.messenger.g0.W1(floatValue, i10, i11));
                jaVar2.requestLayout();
            }
        });
        jaVar.d.setDuration(200L);
        jaVar.d.setInterpolator(org.telegram.ui.Components.xq.h);
        jaVar.d.start();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        Integer num = this.f46579c;
        if (num != null) {
            i10 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i3, i10);
    }
}
