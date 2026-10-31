package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
public final class na extends FrameLayout {
    public final org.telegram.ui.Components.p80 f39885a;
    public final org.telegram.ui.Cells.b2 f39886b;
    public Integer f39887c;
    public ValueAnimator d;
    public final oa e;

    public na(oa oaVar, Activity activity) {
        super(activity);
        int i10;
        this.e = oaVar;
        oaVar.F = this;
        setPadding(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(activity, null);
        this.f39885a = p80Var;
        p80Var.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.t6.F6;
        org.telegram.ui.ActionBar.a7.V(p80Var, i11, null);
        if (org.telegram.messenger.cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        p80Var.setGravity(i10);
        int i12 = org.telegram.ui.ActionBar.t6.J6;
        org.telegram.ui.ActionBar.a7.H(p80Var, i12, null);
        int i13 = org.telegram.ui.ActionBar.t6.K6;
        org.telegram.ui.ActionBar.a7.D(p80Var, i13, null);
        p80Var.setPadding(org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f), 0);
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(this, activity, 2);
        oaVar.G = b2Var;
        this.f39886b = b2Var;
        b2Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.a7.V(b2Var, i11, null);
        b2Var.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        org.telegram.ui.ActionBar.a7.H(b2Var, i12, null);
        org.telegram.ui.ActionBar.a7.D(b2Var, i13, null);
        b2Var.setPadding(org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f), 0);
        addView(p80Var, w7.b6.e(-1, -2, 48));
        addView(b2Var, w7.b6.e(-1, -2, 48));
        if (oaVar.f40214y != 0) {
            String L0 = org.telegram.messenger.cd.L0(2131752938, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L0);
            int indexOf = L0.indexOf(42);
            int lastIndexOf = L0.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51("https://fragment.com", (org.telegram.ui.Components.yz0) null), indexOf, lastIndexOf - 1, 33);
            }
            p80Var.setText(spannableStringBuilder);
            return;
        }
        p80Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131743686, null)));
    }

    public static void a(final na naVar) {
        int intValue;
        int i10;
        float f7;
        org.telegram.ui.Components.p80 p80Var = naVar.f39885a;
        org.telegram.ui.Cells.b2 b2Var = naVar.f39886b;
        if (b2Var.getVisibility() == 0) {
            b2Var.measure(View.MeasureSpec.makeMeasureSpec((naVar.getMeasuredWidth() - naVar.getPaddingLeft()) - naVar.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }
        ValueAnimator valueAnimator = naVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = naVar.f39887c;
        if (num == null) {
            intValue = naVar.getMeasuredHeight();
        } else {
            intValue = num.intValue();
        }
        final int i11 = intValue;
        int height = p80Var.getHeight() + org.telegram.messenger.i0.L(27.0f);
        if (b2Var.getVisibility() == 0 && !TextUtils.isEmpty(b2Var.getText())) {
            i10 = org.telegram.messenger.i0.L(8.0f) + b2Var.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        final int i12 = height + i10;
        final float translationY = p80Var.getTranslationY();
        if (b2Var.getVisibility() == 0 && !TextUtils.isEmpty(b2Var.getText())) {
            f7 = org.telegram.messenger.i0.L(8.0f) + b2Var.getMeasuredHeight();
        } else {
            f7 = 0.0f;
        }
        final float f10 = f7;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        naVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                na naVar2 = na.this;
                naVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                naVar2.f39885a.setTranslationY(org.telegram.messenger.i0.T1(translationY, f10, floatValue));
                naVar2.f39887c = Integer.valueOf(org.telegram.messenger.i0.W1(floatValue, i11, i12));
                naVar2.requestLayout();
            }
        });
        naVar.d.setDuration(200L);
        naVar.d.setInterpolator(org.telegram.ui.Components.gr.h);
        naVar.d.start();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Integer num = this.f39887c;
        if (num != null) {
            i11 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
