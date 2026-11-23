package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
public final class ka extends FrameLayout {
    public final org.telegram.ui.Components.m80 f49220a;
    public final org.telegram.ui.Cells.c2 f49221b;
    public Integer f49222c;
    public ValueAnimator d;
    public final la f49223e;

    public ka(la laVar, Activity activity) {
        super(activity);
        int i7;
        this.f49223e = laVar;
        laVar.G = this;
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(activity, null);
        this.f49220a = m80Var;
        m80Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.m6.F6;
        org.telegram.ui.ActionBar.t6.U(m80Var, i10, null);
        if (org.telegram.messenger.hd.f24408a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        m80Var.setGravity(i7);
        int i11 = org.telegram.ui.ActionBar.m6.J6;
        org.telegram.ui.ActionBar.t6.G(m80Var, i11, null);
        int i12 = org.telegram.ui.ActionBar.m6.K6;
        org.telegram.ui.ActionBar.t6.C(m80Var, i12, null);
        m80Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(2, activity, this);
        laVar.H = c2Var;
        this.f49221b = c2Var;
        c2Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.t6.U(c2Var, i10, null);
        c2Var.setGravity(org.telegram.messenger.hd.f24408a0 ? 5 : 3);
        org.telegram.ui.ActionBar.t6.G(c2Var, i11, null);
        org.telegram.ui.ActionBar.t6.C(c2Var, i12, null);
        c2Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        addView(m80Var, c8.na.e(-1, -2, 48));
        addView(c2Var, c8.na.e(-1, -2, 48));
        if (laVar.f49517y != 0) {
            String N0 = org.telegram.messenger.hd.N0(2131752926, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
            int indexOf = N0.indexOf(42);
            int lastIndexOf = N0.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.s41("https://fragment.com", (org.telegram.ui.Components.fz0) null), indexOf, lastIndexOf - 1, 33);
            }
            m80Var.setText(spannableStringBuilder);
            return;
        }
        m80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131743417, null)));
    }

    public static void a(final ka kaVar) {
        int intValue;
        int i7;
        float f10;
        org.telegram.ui.Components.m80 m80Var = kaVar.f49220a;
        org.telegram.ui.Cells.c2 c2Var = kaVar.f49221b;
        if (c2Var.getVisibility() == 0) {
            c2Var.measure(View.MeasureSpec.makeMeasureSpec((kaVar.getMeasuredWidth() - kaVar.getPaddingLeft()) - kaVar.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }
        ValueAnimator valueAnimator = kaVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = kaVar.f49222c;
        if (num == null) {
            intValue = kaVar.getMeasuredHeight();
        } else {
            intValue = num.intValue();
        }
        final int i10 = intValue;
        int height = m80Var.getHeight() + org.telegram.messenger.g0.L(27.0f);
        if (c2Var.getVisibility() == 0 && !TextUtils.isEmpty(c2Var.getText())) {
            i7 = org.telegram.messenger.g0.L(8.0f) + c2Var.getMeasuredHeight();
        } else {
            i7 = 0;
        }
        final int i11 = height + i7;
        final float translationY = m80Var.getTranslationY();
        if (c2Var.getVisibility() == 0 && !TextUtils.isEmpty(c2Var.getText())) {
            f10 = org.telegram.messenger.g0.L(8.0f) + c2Var.getMeasuredHeight();
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
                kaVar2.f49220a.setTranslationY(org.telegram.messenger.g0.T1(translationY, f11, floatValue));
                kaVar2.f49222c = Integer.valueOf(org.telegram.messenger.g0.W1(floatValue, i10, i11));
                kaVar2.requestLayout();
            }
        });
        kaVar.d.setDuration(200L);
        kaVar.d.setInterpolator(org.telegram.ui.Components.nr.h);
        kaVar.d.start();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        Integer num = this.f49222c;
        if (num != null) {
            i10 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i7, i10);
    }
}
