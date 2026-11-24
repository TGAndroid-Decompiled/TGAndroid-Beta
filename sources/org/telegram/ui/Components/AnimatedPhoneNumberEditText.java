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
public class AnimatedPhoneNumberEditText extends fe5 {
    public static final int b2 = 0;
    public final ArrayList P1;
    public final ArrayList Q1;
    public final TextPaint R1;
    public ObjectAnimator S1;
    public float T1;
    public String U1;
    public final sm V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public Boolean Y1;
    public String Z1;
    public mn6 a2;

    public AnimatedPhoneNumberEditText(Context context) {
        super(context);
        this.P1 = new ArrayList();
        this.Q1 = new ArrayList();
        this.R1 = new TextPaint(1);
        this.U1 = "";
        this.V1 = new sm(this, (byte) 0);
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
    }

    @Override
    public final void A(int i) {
        ArrayList arrayList = this.W1;
        if (i < arrayList.size()) {
            this.M1.setAlpha((int) (((Float) arrayList.get(i)).floatValue() * 255.0f));
        }
    }

    public final void B(String str, boolean z) {
        this.W1.clear();
        ArrayList arrayList = this.X1;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((yla) obj).d();
        }
        if (!z) {
            super.setHintText(str);
        }
    }

    @Override
    public String getHintText() {
        return this.Z1;
    }

    public float getProgress() {
        return this.T1;
    }

    @Override
    public void setHintText(String str) {
        boolean isEmpty;
        String str2;
        float f;
        boolean isEmpty2 = TextUtils.isEmpty(str);
        boolean z = !isEmpty2;
        Boolean bool = this.Y1;
        ArrayList arrayList = this.W1;
        ArrayList arrayList2 = this.X1;
        if (bool != null && bool.booleanValue() == z) {
            isEmpty = false;
        } else {
            arrayList.clear();
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((yla) obj).d();
            }
            arrayList2.clear();
            this.Y1 = Boolean.valueOf(z);
            isEmpty = TextUtils.isEmpty(getText());
        }
        if (!isEmpty2) {
            str2 = str;
        } else {
            str2 = this.Z1;
        }
        if (str2 == null) {
            str2 = "";
        }
        this.Z1 = str;
        if (!isEmpty2 || !isEmpty) {
            super.setHintText(str);
        }
        if (isEmpty) {
            int length = str2.length();
            mn6 mn6Var = new mn6(this, z, str, (byte) 6);
            Runnable runnable = this.a2;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            for (int i2 = 0; i2 < length; i2++) {
                float f2 = 0.0f;
                if (!isEmpty2) {
                    f = 0.0f;
                    f2 = 1.0f;
                } else {
                    f = 1.0f;
                }
                yla ylaVar = new yla(Integer.valueOf(i2), this.V1);
                float f3 = f2 * 100.0f;
                zla zlaVar = new zla(f3);
                zlaVar.b(500.0f);
                zlaVar.a(1.0f);
                zlaVar.i = f3;
                ylaVar.m = zlaVar;
                ylaVar.b = 100.0f * f;
                ylaVar.c = true;
                arrayList2.add(ylaVar);
                arrayList.add(Float.valueOf(f));
                postDelayed(new b1(ylaVar, (byte) 16), i2 * 5);
            }
            this.a2 = mn6Var;
            postDelayed(mn6Var, (length * 5) + 150);
        }
    }

    public void setNewText(String str) {
        ArrayList arrayList;
        boolean z;
        String str2;
        TextPaint textPaint;
        ArrayList arrayList2 = this.Q1;
        if (arrayList2 != null && (arrayList = this.P1) != null && !Objects.equals(this.U1, str)) {
            ObjectAnimator objectAnimator = this.S1;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.S1 = null;
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            int i = 0;
            if (TextUtils.isEmpty(this.U1) && !TextUtils.isEmpty(str)) {
                z = true;
            } else {
                z = false;
            }
            this.T1 = 0.0f;
            while (i < str.length()) {
                int i2 = i + 1;
                String substring = str.substring(i, i2);
                if (!arrayList2.isEmpty() && i < this.U1.length()) {
                    str2 = this.U1.substring(i, i2);
                } else {
                    str2 = null;
                }
                if (!z && str2 != null && str2.equals(substring)) {
                    arrayList.add((StaticLayout) arrayList2.get(i));
                    arrayList2.set(i, null);
                } else {
                    TextPaint textPaint2 = this.R1;
                    if (z && str2 == null) {
                        textPaint = textPaint2;
                        arrayList2.add(new StaticLayout("", textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                    } else {
                        textPaint = textPaint2;
                    }
                    arrayList.add(new StaticLayout(substring, textPaint, (int) Math.ceil(textPaint.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                }
                i = i2;
            }
            if (!arrayList2.isEmpty()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", -1.0f, 0.0f);
                this.S1 = ofFloat;
                ofFloat.setDuration(150L);
                this.S1.addListener(new defpackage.g0(this, (byte) 8));
                this.S1.start();
            }
            this.U1 = str;
            invalidate();
        }
    }

    public void setProgress(float f) {
        if (this.T1 == f) {
            return;
        }
        this.T1 = f;
        invalidate();
    }

    @Override
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.R1.setColor(i);
    }

    @Override
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.R1.setTextSize(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
    }
}
