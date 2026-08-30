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
public class AnimatedPhoneNumberEditText extends h40 {
    public String B;
    public lh.r5 C;
    public final ArrayList e;
    public final ArrayList f22722f;
    public final TextPaint h;
    public ObjectAnimator f22723n;
    public float f22724r;
    public String f22725s;
    public final o1.d v;
    public final ArrayList f22726w;
    public final ArrayList f22727x;
    public Boolean f22728y;

    public AnimatedPhoneNumberEditText(Context context) {
        super(context);
        this.e = new ArrayList();
        this.f22722f = new ArrayList();
        this.h = new TextPaint(1);
        this.f22725s = "";
        this.v = new o1.d(this, 1);
        this.f22726w = new ArrayList();
        this.f22727x = new ArrayList();
    }

    public static void j(AnimatedPhoneNumberEditText animatedPhoneNumberEditText, boolean z4, String str) {
        animatedPhoneNumberEditText.f22726w.clear();
        ArrayList arrayList = animatedPhoneNumberEditText.f22727x;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((o1.j) obj).c();
        }
        if (!z4) {
            super.setHintText(str);
        }
    }

    @Override
    public String getHintText() {
        return this.B;
    }

    public float getProgress() {
        return this.f22724r;
    }

    @Override
    public final void i(int i10) {
        ArrayList arrayList = this.f22726w;
        if (i10 < arrayList.size()) {
            this.f25322b.setAlpha((int) (((Float) arrayList.get(i10)).floatValue() * 255.0f));
        }
    }

    @Override
    public void setHintText(String str) {
        boolean isEmpty;
        String str2;
        float f10;
        boolean isEmpty2 = TextUtils.isEmpty(str);
        boolean z4 = !isEmpty2;
        Boolean bool = this.f22728y;
        ArrayList arrayList = this.f22726w;
        ArrayList arrayList2 = this.f22727x;
        if (bool != null && bool.booleanValue() == z4) {
            isEmpty = false;
        } else {
            arrayList.clear();
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                ((o1.j) obj).c();
            }
            arrayList2.clear();
            this.f22728y = Boolean.valueOf(z4);
            isEmpty = TextUtils.isEmpty(getText());
        }
        if (!isEmpty2) {
            str2 = str;
        } else {
            str2 = this.B;
        }
        if (str2 == null) {
            str2 = "";
        }
        this.B = str;
        if (!isEmpty2 || !isEmpty) {
            super.setHintText(str);
        }
        if (isEmpty) {
            int length = str2.length();
            lh.r5 r5Var = new lh.r5(this, z4, str, 12);
            Runnable runnable = this.C;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            for (int i11 = 0; i11 < length; i11++) {
                float f11 = 0.0f;
                if (!isEmpty2) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                if (!isEmpty2) {
                    f11 = 1.0f;
                }
                o1.j jVar = new o1.j(Integer.valueOf(i11), this.v);
                float f12 = f11 * 100.0f;
                o1.k kVar = new o1.k(f12);
                kVar.b(500.0f);
                kVar.a(1.0f);
                kVar.f16204i = f12;
                jVar.f16198u = kVar;
                jVar.f16190b = 100.0f * f10;
                jVar.f16191c = true;
                arrayList2.add(jVar);
                arrayList.add(Float.valueOf(f10));
                postDelayed(new fg(jVar, 7), i11 * 5);
            }
            this.C = r5Var;
            postDelayed(r5Var, (length * 5) + 150);
        }
    }

    public void setNewText(String str) {
        ArrayList arrayList;
        boolean z4;
        String str2;
        TextPaint textPaint;
        ArrayList arrayList2 = this.f22722f;
        if (arrayList2 != null && (arrayList = this.e) != null && !Objects.equals(this.f22725s, str)) {
            ObjectAnimator objectAnimator = this.f22723n;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f22723n = null;
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            int i10 = 0;
            if (TextUtils.isEmpty(this.f22725s) && !TextUtils.isEmpty(str)) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f22724r = 0.0f;
            while (i10 < str.length()) {
                int i11 = i10 + 1;
                String substring = str.substring(i10, i11);
                if (!arrayList2.isEmpty() && i10 < this.f22725s.length()) {
                    str2 = this.f22725s.substring(i10, i11);
                } else {
                    str2 = null;
                }
                if (!z4 && str2 != null && str2.equals(substring)) {
                    arrayList.add((StaticLayout) arrayList2.get(i10));
                    arrayList2.set(i10, null);
                } else {
                    TextPaint textPaint2 = this.h;
                    if (z4 && str2 == null) {
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
                this.f22723n = ofFloat;
                ofFloat.setDuration(150L);
                this.f22723n.addListener(new org.telegram.ui.s5(this, 26));
                this.f22723n.start();
            }
            this.f22725s = str;
            invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f22724r == f10) {
            return;
        }
        this.f22724r = f10;
        invalidate();
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.h.setColor(i10);
    }

    @Override
    public final void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        this.h.setTextSize(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
    }
}
