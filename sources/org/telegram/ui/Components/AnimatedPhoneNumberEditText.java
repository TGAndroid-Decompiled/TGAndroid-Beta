package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import j$.util.Objects;
import java.util.ArrayList;
public class AnimatedPhoneNumberEditText extends v20 {
    public final ArrayList J1;
    public final ArrayList K1;
    public final TextPaint L1;
    public ObjectAnimator M1;
    public float N1;
    public String O1;
    public final c6 P1;
    public final ArrayList Q1;
    public final ArrayList R1;
    public Boolean S1;
    public String T1;
    public bi.u7 U1;

    public AnimatedPhoneNumberEditText(Context context) {
        super(context);
        this.J1 = new ArrayList();
        this.K1 = new ArrayList();
        this.L1 = new TextPaint(1);
        this.O1 = "";
        this.P1 = new c6(this, 0);
        this.Q1 = new ArrayList();
        this.R1 = new ArrayList();
    }

    public static void A(AnimatedPhoneNumberEditText animatedPhoneNumberEditText, boolean z9, String str) {
        animatedPhoneNumberEditText.Q1.clear();
        ArrayList arrayList = animatedPhoneNumberEditText.R1;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((r1.g) obj).d();
        }
        if (!z9) {
            super.setHintText(str);
        }
    }

    @Override
    public String getHintText() {
        return this.T1;
    }

    public float getProgress() {
        return this.N1;
    }

    @Override
    public void setHintText(String str) {
        boolean isEmpty;
        String str2;
        float f10;
        boolean isEmpty2 = TextUtils.isEmpty(str);
        boolean z9 = !isEmpty2;
        Boolean bool = this.S1;
        ArrayList arrayList = this.Q1;
        ArrayList arrayList2 = this.R1;
        if (bool != null && bool.booleanValue() == z9) {
            isEmpty = false;
        } else {
            arrayList.clear();
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                ((r1.g) obj).d();
            }
            arrayList2.clear();
            this.S1 = Boolean.valueOf(z9);
            isEmpty = TextUtils.isEmpty(getText());
        }
        if (!isEmpty2) {
            str2 = str;
        } else {
            str2 = this.T1;
        }
        if (str2 == null) {
            str2 = "";
        }
        this.T1 = str;
        if (!isEmpty2 || !isEmpty) {
            super.setHintText(str);
        }
        if (isEmpty) {
            int length = str2.length();
            bi.u7 u7Var = new bi.u7(this, z9, str, 18);
            Runnable runnable = this.U1;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            for (int i10 = 0; i10 < length; i10++) {
                float f11 = 0.0f;
                if (!isEmpty2) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                if (!isEmpty2) {
                    f11 = 1.0f;
                }
                r1.g gVar = new r1.g(Integer.valueOf(i10), this.P1);
                float f12 = f11 * 100.0f;
                r1.h hVar = new r1.h(f12);
                hVar.b(500.0f);
                hVar.a(1.0f);
                hVar.f54275i = f12;
                gVar.f54267m = hVar;
                gVar.f54258b = 100.0f * f10;
                gVar.f54259c = true;
                arrayList2.add(gVar);
                arrayList.add(Float.valueOf(f10));
                postDelayed(new xf(gVar, 7), i10 * 5);
            }
            this.U1 = u7Var;
            postDelayed(u7Var, (length * 5) + 150);
        }
    }

    public void setNewText(String str) {
        ArrayList arrayList;
        boolean z9;
        String str2;
        TextPaint textPaint;
        ArrayList arrayList2 = this.K1;
        if (arrayList2 != null && (arrayList = this.J1) != null && !Objects.equals(this.O1, str)) {
            ObjectAnimator objectAnimator = this.M1;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.M1 = null;
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            int i7 = 0;
            if (TextUtils.isEmpty(this.O1) && !TextUtils.isEmpty(str)) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.N1 = 0.0f;
            while (i7 < str.length()) {
                int i10 = i7 + 1;
                String substring = str.substring(i7, i10);
                if (!arrayList2.isEmpty() && i7 < this.O1.length()) {
                    str2 = this.O1.substring(i7, i10);
                } else {
                    str2 = null;
                }
                if (!z9 && str2 != null && str2.equals(substring)) {
                    arrayList.add((StaticLayout) arrayList2.get(i7));
                    arrayList2.set(i7, null);
                } else {
                    TextPaint textPaint2 = this.L1;
                    if (z9 && str2 == null) {
                        textPaint = textPaint2;
                        arrayList2.add(new StaticLayout("", textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                    } else {
                        textPaint = textPaint2;
                    }
                    arrayList.add(new StaticLayout(substring, textPaint, (int) Math.ceil(textPaint.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                }
                i7 = i10;
            }
            if (!arrayList2.isEmpty()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", -1.0f, 0.0f);
                this.M1 = ofFloat;
                ofFloat.setDuration(150L);
                this.M1.addListener(new z5(this, 1));
                this.M1.start();
            }
            this.O1 = str;
            invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.N1 == f10) {
            return;
        }
        this.N1 = f10;
        invalidate();
    }

    @Override
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        this.L1.setColor(i7);
    }

    @Override
    public final void setTextSize(int i7, float f10) {
        super.setTextSize(i7, f10);
        this.L1.setTextSize(TypedValue.applyDimension(i7, f10, getResources().getDisplayMetrics()));
    }

    @Override
    public final void z(int i7) {
        ArrayList arrayList = this.Q1;
        if (i7 < arrayList.size()) {
            this.G1.setAlpha((int) (((Float) arrayList.get(i7)).floatValue() * 255.0f));
        }
    }
}
