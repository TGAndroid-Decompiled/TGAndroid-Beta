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
public class AnimatedPhoneNumberEditText extends g30 {
    public final ArrayList P1;
    public final ArrayList Q1;
    public final TextPaint R1;
    public ObjectAnimator S1;
    public float T1;
    public String U1;
    public final h6 V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public Boolean Y1;
    public String Z1;
    public di.p6 f32632a2;

    public AnimatedPhoneNumberEditText(Context context) {
        super(context);
        this.P1 = new ArrayList();
        this.Q1 = new ArrayList();
        this.R1 = new TextPaint(1);
        this.U1 = "";
        this.V1 = new h6(this, 0);
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
    }

    public static void B(AnimatedPhoneNumberEditText animatedPhoneNumberEditText, boolean z10, String str) {
        animatedPhoneNumberEditText.W1.clear();
        ArrayList arrayList = animatedPhoneNumberEditText.X1;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((r1.g) obj).d();
        }
        if (!z10) {
            super.setHintText(str);
        }
    }

    @Override
    public final void A(int i7) {
        ArrayList arrayList = this.W1;
        if (i7 < arrayList.size()) {
            this.M1.setAlpha((int) (((Float) arrayList.get(i7)).floatValue() * 255.0f));
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
        float f10;
        boolean isEmpty2 = TextUtils.isEmpty(str);
        boolean z10 = !isEmpty2;
        Boolean bool = this.Y1;
        ArrayList arrayList = this.W1;
        ArrayList arrayList2 = this.X1;
        if (bool != null && bool.booleanValue() == z10) {
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
            this.Y1 = Boolean.valueOf(z10);
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
            di.p6 p6Var = new di.p6(this, z10, str, 18);
            Runnable runnable = this.f32632a2;
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
                r1.g gVar = new r1.g(Integer.valueOf(i10), this.V1);
                float f12 = f11 * 100.0f;
                r1.h hVar = new r1.h(f12);
                hVar.b(500.0f);
                hVar.a(1.0f);
                hVar.f56454i = f12;
                gVar.f56446m = hVar;
                gVar.f56437b = 100.0f * f10;
                gVar.f56438c = true;
                arrayList2.add(gVar);
                arrayList.add(Float.valueOf(f10));
                postDelayed(new ng(gVar, 7), i10 * 5);
            }
            this.f32632a2 = p6Var;
            postDelayed(p6Var, (length * 5) + 150);
        }
    }

    public void setNewText(String str) {
        ArrayList arrayList;
        boolean z10;
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
            int i7 = 0;
            if (TextUtils.isEmpty(this.U1) && !TextUtils.isEmpty(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.T1 = 0.0f;
            while (i7 < str.length()) {
                int i10 = i7 + 1;
                String substring = str.substring(i7, i10);
                if (!arrayList2.isEmpty() && i7 < this.U1.length()) {
                    str2 = this.U1.substring(i7, i10);
                } else {
                    str2 = null;
                }
                if (!z10 && str2 != null && str2.equals(substring)) {
                    arrayList.add((StaticLayout) arrayList2.get(i7));
                    arrayList2.set(i7, null);
                } else {
                    TextPaint textPaint2 = this.R1;
                    if (z10 && str2 == null) {
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
                this.S1 = ofFloat;
                ofFloat.setDuration(150L);
                this.S1.addListener(new x(this, 2));
                this.S1.start();
            }
            this.U1 = str;
            invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.T1 == f10) {
            return;
        }
        this.T1 = f10;
        invalidate();
    }

    @Override
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        this.R1.setColor(i7);
    }

    @Override
    public final void setTextSize(int i7, float f10) {
        super.setTextSize(i7, f10);
        this.R1.setTextSize(TypedValue.applyDimension(i7, f10, getResources().getDisplayMetrics()));
    }
}
