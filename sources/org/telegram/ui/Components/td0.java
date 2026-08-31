package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
public final class td0 extends FrameLayout {
    public final int f31326a = 1;
    public final Object f31327b;
    public final Object f31328c;
    public final Object d;
    public Object f31329e;
    public Object f31330f;
    public Object h;

    public td0(xd0 xd0Var, Context context) {
        super(context);
        this.h = xd0Var;
        this.f31327b = new ArrayList(4);
        this.f31328c = new ArrayList(4);
        this.d = new StringBuilder(4);
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = new TextView(context);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 36.0f);
            textView.setGravity(17);
            textView.setAlpha(0.0f);
            textView.setPivotX(AndroidUtilities.dp(25.0f));
            textView.setPivotY(AndroidUtilities.dp(25.0f));
            addView(textView, k7.c6.e(50, 50, 51));
            ((ArrayList) this.f31327b).add(textView);
            TextView textView2 = new TextView(context);
            textView2.setTextColor(-1);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 36.0f);
            textView2.setGravity(17);
            textView2.setAlpha(0.0f);
            textView2.setText("•");
            textView2.setPivotX(AndroidUtilities.dp(25.0f));
            textView2.setPivotY(AndroidUtilities.dp(25.0f));
            addView(textView2, k7.c6.e(50, 50, 51));
            ((ArrayList) this.f31328c).add(textView2);
        }
    }

    public static void a(td0 td0Var, boolean z4) {
        ArrayList arrayList = (ArrayList) td0Var.f31328c;
        ArrayList arrayList2 = (ArrayList) td0Var.f31327b;
        StringBuilder sb = (StringBuilder) td0Var.d;
        if (sb.length() == 0) {
            return;
        }
        ye yeVar = (ye) td0Var.f31330f;
        if (yeVar != null) {
            AndroidUtilities.cancelRunOnUIThread(yeVar);
            td0Var.f31330f = null;
        }
        AnimatorSet animatorSet = (AnimatorSet) td0Var.f31329e;
        if (animatorSet != null) {
            animatorSet.cancel();
            td0Var.f31329e = null;
        }
        sb.delete(0, sb.length());
        if (z4) {
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < 4; i10++) {
                TextView textView = (TextView) arrayList2.get(i10);
                float alpha = textView.getAlpha();
                Property property = View.ALPHA;
                Property property2 = View.SCALE_Y;
                Property property3 = View.SCALE_X;
                if (alpha != 0.0f) {
                    arrayList3.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                }
                TextView textView2 = (TextView) arrayList.get(i10);
                if (textView2.getAlpha() != 0.0f) {
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property, 0.0f));
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            td0Var.f31329e = animatorSet2;
            animatorSet2.setDuration(150L);
            ((AnimatorSet) td0Var.f31329e).playTogether(arrayList3);
            ((AnimatorSet) td0Var.f31329e).addListener(new sd0(td0Var, 2));
            ((AnimatorSet) td0Var.f31329e).start();
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                ((TextView) arrayList2.get(i11)).setAlpha(0.0f);
                ((TextView) arrayList.get(i11)).setAlpha(0.0f);
            }
        }
        xd0.a((xd0) td0Var.h);
    }

    public void b(String str) {
        ArrayList arrayList = (ArrayList) this.f31328c;
        ArrayList arrayList2 = (ArrayList) this.f31327b;
        StringBuilder sb = (StringBuilder) this.d;
        if (sb.length() == 4) {
            return;
        }
        try {
            performHapticFeedback(3);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        ArrayList arrayList3 = new ArrayList();
        int length = sb.length();
        sb.append(str);
        TextView textView = (TextView) arrayList2.get(length);
        textView.setText(str);
        textView.setTranslationX(c(length));
        Property property = View.SCALE_X;
        arrayList3.add(ObjectAnimator.ofFloat(textView, property, 0.0f, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList3.add(ObjectAnimator.ofFloat(textView, property2, 0.0f, 1.0f));
        Property property3 = View.ALPHA;
        arrayList3.add(ObjectAnimator.ofFloat(textView, property3, 0.0f, 1.0f));
        float[] fArr = {AndroidUtilities.dp(20.0f), 0.0f};
        Property property4 = View.TRANSLATION_Y;
        arrayList3.add(ObjectAnimator.ofFloat(textView, property4, fArr));
        TextView textView2 = (TextView) arrayList.get(length);
        textView2.setTranslationX(c(length));
        textView2.setAlpha(0.0f);
        arrayList3.add(ObjectAnimator.ofFloat(textView2, property, 0.0f, 1.0f));
        arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, 0.0f, 1.0f));
        arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, AndroidUtilities.dp(20.0f), 0.0f));
        for (int i10 = length + 1; i10 < 4; i10++) {
            TextView textView3 = (TextView) arrayList2.get(i10);
            if (textView3.getAlpha() != 0.0f) {
                arrayList3.add(ObjectAnimator.ofFloat(textView3, property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, 0.0f));
            }
            TextView textView4 = (TextView) arrayList.get(i10);
            if (textView4.getAlpha() != 0.0f) {
                arrayList3.add(ObjectAnimator.ofFloat(textView4, property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView4, property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView4, property3, 0.0f));
            }
        }
        ye yeVar = (ye) this.f31330f;
        if (yeVar != null) {
            AndroidUtilities.cancelRunOnUIThread(yeVar);
        }
        ye yeVar2 = new ye(this, length, 2);
        this.f31330f = yeVar2;
        AndroidUtilities.runOnUIThread(yeVar2, 1500L);
        for (int i11 = 0; i11 < length; i11++) {
            TextView textView5 = (TextView) arrayList2.get(i11);
            float[] fArr2 = {c(i11)};
            Property property5 = View.TRANSLATION_X;
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property5, fArr2));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property2, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property3, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property4, 0.0f));
            TextView textView6 = (TextView) arrayList.get(i11);
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property5, c(i11)));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property2, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property3, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property4, 0.0f));
        }
        AnimatorSet animatorSet = (AnimatorSet) this.f31329e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31329e = animatorSet2;
        animatorSet2.setDuration(150L);
        ((AnimatorSet) this.f31329e).playTogether(arrayList3);
        ((AnimatorSet) this.f31329e).addListener(new sd0(this, 0));
        ((AnimatorSet) this.f31329e).start();
        xd0.a((xd0) this.h);
    }

    public int c(int i10) {
        return org.telegram.messenger.y3.D(30.0f, i10, (getMeasuredWidth() - (AndroidUtilities.dp(30.0f) * ((StringBuilder) this.d).length())) / 2) - AndroidUtilities.dp(10.0f);
    }

    public void d(boolean z4) {
        int i10;
        float f10;
        float f11;
        ImageView imageView = (ImageView) this.f31328c;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        TextView textView = (TextView) this.d;
        boolean z10 = LocaleController.isRTL;
        if (!z10 && z4) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        if (z10 && z4) {
            f11 = 53.0f;
        } else {
            f11 = 22.0f;
        }
        textView.setLayoutParams(k7.c6.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f31326a) {
            case 1:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f31330f;
                paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21660d7, (org.telegram.ui.ActionBar.g6) this.f31327b));
                canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    public void e(String str) {
        ((TextView) this.d).setText(str);
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f31326a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f31328c;
                ArrayList arrayList2 = (ArrayList) this.f31327b;
                ye yeVar = (ye) this.f31330f;
                if (yeVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(yeVar);
                    this.f31330f = null;
                }
                AnimatorSet animatorSet = (AnimatorSet) this.f31329e;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f31329e = null;
                }
                for (int i14 = 0; i14 < 4; i14++) {
                    if (i14 < ((StringBuilder) this.d).length()) {
                        TextView textView = (TextView) arrayList2.get(i14);
                        textView.setAlpha(0.0f);
                        textView.setScaleX(1.0f);
                        textView.setScaleY(1.0f);
                        textView.setTranslationY(0.0f);
                        textView.setTranslationX(c(i14));
                        TextView textView2 = (TextView) arrayList.get(i14);
                        textView2.setAlpha(1.0f);
                        textView2.setScaleX(1.0f);
                        textView2.setScaleY(1.0f);
                        textView2.setTranslationY(0.0f);
                        textView2.setTranslationX(c(i14));
                    } else {
                        ((TextView) arrayList2.get(i14)).setAlpha(0.0f);
                        ((TextView) arrayList.get(i14)).setAlpha(0.0f);
                    }
                }
                super.onLayout(z4, i10, i11, i12, i13);
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f31326a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public td0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f31330f = new Paint(1);
        this.f31327b = g6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.ui.b.g(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21766j5, g6Var));
        boolean z4 = LocaleController.isRTL;
        addView(textView, k7.c6.d(-1, -2.0f, 23, z4 ? 16.0f : 53.0f, 0.0f, z4 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f31328c = imageView;
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.f31329e = i2Var;
        imageView.setImageDrawable(i2Var);
        i2Var.a(-1);
        i2Var.b(-1);
        i2Var.f21458k = 220.0f;
        addView(imageView, k7.c6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 11));
    }
}
