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
public class AnimatedPhoneNumberEditText extends n30 {
    public final ArrayList J1;
    public final ArrayList K1;
    public final TextPaint L1;
    public ObjectAnimator M1;
    public float N1;
    public String O1;
    public final o1.d P1;
    public final ArrayList Q1;
    public final ArrayList R1;
    public Boolean S1;
    public String T1;
    public ag.j0 U1;

    public AnimatedPhoneNumberEditText(Context context) {
        super(context);
        this.J1 = new ArrayList();
        this.K1 = new ArrayList();
        this.L1 = new TextPaint(1);
        this.O1 = "";
        this.P1 = new o1.d(this, 1);
        this.Q1 = new ArrayList();
        this.R1 = new ArrayList();
    }

    public static void A(AnimatedPhoneNumberEditText animatedPhoneNumberEditText, boolean z10, String str) {
        animatedPhoneNumberEditText.Q1.clear();
        ArrayList arrayList = animatedPhoneNumberEditText.R1;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((o1.j) obj).d();
        }
        if (!z10) {
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
        float f7;
        boolean isEmpty2 = TextUtils.isEmpty(str);
        boolean z10 = !isEmpty2;
        Boolean bool = this.S1;
        ArrayList arrayList = this.Q1;
        ArrayList arrayList2 = this.R1;
        if (bool != null && bool.booleanValue() == z10) {
            isEmpty = false;
        } else {
            arrayList.clear();
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                ((o1.j) obj).d();
            }
            arrayList2.clear();
            this.S1 = Boolean.valueOf(z10);
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
            ag.j0 j0Var = new ag.j0(this, z10, str, 15);
            Runnable runnable = this.U1;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            for (int i11 = 0; i11 < length; i11++) {
                float f10 = 0.0f;
                if (!isEmpty2) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                if (!isEmpty2) {
                    f10 = 1.0f;
                }
                o1.j jVar = new o1.j(Integer.valueOf(i11), this.P1);
                float f11 = f10 * 100.0f;
                o1.k kVar = new o1.k(f11);
                kVar.b(500.0f);
                kVar.a(1.0f);
                kVar.f13965i = f11;
                jVar.f13958m = kVar;
                jVar.f13950b = 100.0f * f7;
                jVar.f13951c = true;
                arrayList2.add(jVar);
                arrayList.add(Float.valueOf(f7));
                postDelayed(new tf(jVar, 8), i11 * 5);
            }
            this.U1 = j0Var;
            postDelayed(j0Var, (length * 5) + 150);
        }
    }

    public void setNewText(String str) {
        ArrayList arrayList;
        boolean z10;
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
            int i10 = 0;
            if (TextUtils.isEmpty(this.O1) && !TextUtils.isEmpty(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.N1 = 0.0f;
            while (i10 < str.length()) {
                int i11 = i10 + 1;
                String substring = str.substring(i10, i11);
                if (!arrayList2.isEmpty() && i10 < this.O1.length()) {
                    str2 = this.O1.substring(i10, i11);
                } else {
                    str2 = null;
                }
                if (!z10 && str2 != null && str2.equals(substring)) {
                    arrayList.add((StaticLayout) arrayList2.get(i10));
                    arrayList2.set(i10, null);
                } else {
                    TextPaint textPaint2 = this.L1;
                    if (z10 && str2 == null) {
                        textPaint = textPaint2;
                        arrayList2.add(new StaticLayout("", textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                    } else {
                        textPaint = textPaint2;
                    }
                    arrayList.add(new StaticLayout(substring, textPaint, (int) Math.ceil(textPaint.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                }
                i10 = i11;
            }
            if (!arrayList2.isEmpty()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", -1.0f, 0.0f);
                this.M1 = ofFloat;
                ofFloat.setDuration(150L);
                this.M1.addListener(new w5(this, 1));
                this.M1.start();
            }
            this.O1 = str;
            invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.N1 == f7) {
            return;
        }
        this.N1 = f7;
        invalidate();
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.L1.setColor(i10);
    }

    @Override
    public final void setTextSize(int i10, float f7) {
        super.setTextSize(i10, f7);
        this.L1.setTextSize(TypedValue.applyDimension(i10, f7, getResources().getDisplayMetrics()));
    }

    @Override
    public final void z(int i10) {
        ArrayList arrayList = this.Q1;
        if (i10 < arrayList.size()) {
            this.G1.setAlpha((int) (((Float) arrayList.get(i10)).floatValue() * 255.0f));
        }
    }
}
