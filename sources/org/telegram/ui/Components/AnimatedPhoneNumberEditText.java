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
public class AnimatedPhoneNumberEditText extends r20 {
    public final ArrayList K1;
    public final ArrayList L1;
    public final TextPaint M1;
    public ObjectAnimator N1;
    public float O1;
    public String P1;
    public final a6 Q1;
    public final ArrayList R1;
    public final ArrayList S1;
    public Boolean T1;
    public String U1;
    public ci.v6 V1;

    public AnimatedPhoneNumberEditText(Context context) {
        super(context);
        this.K1 = new ArrayList();
        this.L1 = new ArrayList();
        this.M1 = new TextPaint(1);
        this.P1 = "";
        this.Q1 = new a6(this, 0);
        this.R1 = new ArrayList();
        this.S1 = new ArrayList();
    }

    public static void A(AnimatedPhoneNumberEditText animatedPhoneNumberEditText, boolean z10, String str) {
        animatedPhoneNumberEditText.R1.clear();
        ArrayList arrayList = animatedPhoneNumberEditText.S1;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((q1.g) obj).d();
        }
        if (!z10) {
            super.setHintText(str);
        }
    }

    @Override
    public String getHintText() {
        return this.U1;
    }

    public float getProgress() {
        return this.O1;
    }

    @Override
    public void setHintText(String str) {
        boolean isEmpty;
        String str2;
        float f10;
        boolean isEmpty2 = TextUtils.isEmpty(str);
        boolean z10 = !isEmpty2;
        Boolean bool = this.T1;
        ArrayList arrayList = this.R1;
        ArrayList arrayList2 = this.S1;
        if (bool != null && bool.booleanValue() == z10) {
            isEmpty = false;
        } else {
            arrayList.clear();
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                ((q1.g) obj).d();
            }
            arrayList2.clear();
            this.T1 = Boolean.valueOf(z10);
            isEmpty = TextUtils.isEmpty(getText());
        }
        if (!isEmpty2) {
            str2 = str;
        } else {
            str2 = this.U1;
        }
        if (str2 == null) {
            str2 = "";
        }
        this.U1 = str;
        if (!isEmpty2 || !isEmpty) {
            super.setHintText(str);
        }
        if (isEmpty) {
            int length = str2.length();
            ci.v6 v6Var = new ci.v6(this, z10, str, 18);
            Runnable runnable = this.V1;
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
                q1.g gVar = new q1.g(Integer.valueOf(i10), this.Q1);
                float f12 = f11 * 100.0f;
                q1.h hVar = new q1.h(f12);
                hVar.b(500.0f);
                hVar.a(1.0f);
                hVar.f53661i = f12;
                gVar.f53653m = hVar;
                gVar.f53644b = 100.0f * f10;
                gVar.f53645c = true;
                arrayList2.add(gVar);
                arrayList.add(Float.valueOf(f10));
                postDelayed(new vf(gVar, 7), i10 * 5);
            }
            this.V1 = v6Var;
            postDelayed(v6Var, (length * 5) + 150);
        }
    }

    public void setNewText(String str) {
        ArrayList arrayList;
        boolean z10;
        String str2;
        TextPaint textPaint;
        ArrayList arrayList2 = this.L1;
        if (arrayList2 != null && (arrayList = this.K1) != null && !Objects.equals(this.P1, str)) {
            ObjectAnimator objectAnimator = this.N1;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.N1 = null;
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            int i3 = 0;
            if (TextUtils.isEmpty(this.P1) && !TextUtils.isEmpty(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.O1 = 0.0f;
            while (i3 < str.length()) {
                int i10 = i3 + 1;
                String substring = str.substring(i3, i10);
                if (!arrayList2.isEmpty() && i3 < this.P1.length()) {
                    str2 = this.P1.substring(i3, i10);
                } else {
                    str2 = null;
                }
                if (!z10 && str2 != null && str2.equals(substring)) {
                    arrayList.add((StaticLayout) arrayList2.get(i3));
                    arrayList2.set(i3, null);
                } else {
                    TextPaint textPaint2 = this.M1;
                    if (z10 && str2 == null) {
                        textPaint = textPaint2;
                        arrayList2.add(new StaticLayout("", textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                    } else {
                        textPaint = textPaint2;
                    }
                    arrayList.add(new StaticLayout(substring, textPaint, (int) Math.ceil(textPaint.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                }
                i3 = i10;
            }
            if (!arrayList2.isEmpty()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", -1.0f, 0.0f);
                this.N1 = ofFloat;
                ofFloat.setDuration(150L);
                this.N1.addListener(new x5(this, 1));
                this.N1.start();
            }
            this.P1 = str;
            invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.O1 == f10) {
            return;
        }
        this.O1 = f10;
        invalidate();
    }

    @Override
    public void setTextColor(int i3) {
        super.setTextColor(i3);
        this.M1.setColor(i3);
    }

    @Override
    public final void setTextSize(int i3, float f10) {
        super.setTextSize(i3, f10);
        this.M1.setTextSize(TypedValue.applyDimension(i3, f10, getResources().getDisplayMetrics()));
    }

    @Override
    public final void z(int i3) {
        ArrayList arrayList = this.R1;
        if (i3 < arrayList.size()) {
            this.H1.setAlpha((int) (((Float) arrayList.get(i3)).floatValue() * 255.0f));
        }
    }
}
