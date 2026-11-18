package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
public final class ka extends FrameLayout {
    public final org.telegram.ui.Components.k80 f49219a;
    public final org.telegram.ui.Cells.c2 f49220b;
    public Integer f49221c;
    public ValueAnimator d;
    public final la f49222e;

    public ka(la laVar, Activity activity) {
        super(activity);
        int i7;
        this.f49222e = laVar;
        laVar.G = this;
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.k80 k80Var = new org.telegram.ui.Components.k80(activity, null);
        this.f49219a = k80Var;
        k80Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.n6.F6;
        org.telegram.ui.ActionBar.u6.U(k80Var, i10, null);
        if (org.telegram.messenger.gd.f24213a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        k80Var.setGravity(i7);
        int i11 = org.telegram.ui.ActionBar.n6.J6;
        org.telegram.ui.ActionBar.u6.G(k80Var, i11, null);
        int i12 = org.telegram.ui.ActionBar.n6.K6;
        org.telegram.ui.ActionBar.u6.C(k80Var, i12, null);
        k80Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(2, activity, this);
        laVar.H = c2Var;
        this.f49220b = c2Var;
        c2Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.u6.U(c2Var, i10, null);
        c2Var.setGravity(org.telegram.messenger.gd.f24213a0 ? 5 : 3);
        org.telegram.ui.ActionBar.u6.G(c2Var, i11, null);
        org.telegram.ui.ActionBar.u6.C(c2Var, i12, null);
        c2Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        addView(k80Var, c8.ma.e(-1, -2, 48));
        addView(c2Var, c8.ma.e(-1, -2, 48));
        if (laVar.f49497y != 0) {
            String M0 = org.telegram.messenger.gd.M0(2131752927, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
            int indexOf = M0.indexOf(42);
            int lastIndexOf = M0.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.p41("https://fragment.com", (org.telegram.ui.Components.dz0) null), indexOf, lastIndexOf - 1, 33);
            }
            k80Var.setText(spannableStringBuilder);
            return;
        }
        k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131743423, null)));
    }

    public static void a(final ka kaVar) {
        int intValue;
        int i7;
        float f10;
        org.telegram.ui.Components.k80 k80Var = kaVar.f49219a;
        org.telegram.ui.Cells.c2 c2Var = kaVar.f49220b;
        if (c2Var.getVisibility() == 0) {
            c2Var.measure(View.MeasureSpec.makeMeasureSpec((kaVar.getMeasuredWidth() - kaVar.getPaddingLeft()) - kaVar.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }
        ValueAnimator valueAnimator = kaVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = kaVar.f49221c;
        if (num == null) {
            intValue = kaVar.getMeasuredHeight();
        } else {
            intValue = num.intValue();
        }
        final int i10 = intValue;
        int height = k80Var.getHeight() + org.telegram.messenger.g0.L(27.0f);
        if (c2Var.getVisibility() == 0 && !TextUtils.isEmpty(c2Var.getText())) {
            i7 = org.telegram.messenger.g0.L(8.0f) + c2Var.getMeasuredHeight();
        } else {
            i7 = 0;
        }
        final int i11 = height + i7;
        final float translationY = k80Var.getTranslationY();
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
                kaVar2.f49219a.setTranslationY(org.telegram.messenger.g0.T1(translationY, f11, floatValue));
                kaVar2.f49221c = Integer.valueOf(org.telegram.messenger.g0.W1(floatValue, i10, i11));
                kaVar2.requestLayout();
            }
        });
        kaVar.d.setDuration(200L);
        kaVar.d.setInterpolator(org.telegram.ui.Components.lr.h);
        kaVar.d.start();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        Integer num = this.f49221c;
        if (num != null) {
            i10 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i7, i10);
    }
}
