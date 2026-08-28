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
public class AnimatedPhoneNumberEditText extends p30 {
    public String A;
    public gh.u5 B;
    public final ArrayList f26066e;
    public final ArrayList f26067f;
    public final TextPaint h;
    public ObjectAnimator f26068n;
    public float f26069r;
    public String f26070s;
    public final o1.d v;
    public final ArrayList f26071w;
    public final ArrayList f26072x;
    public Boolean f26073y;

    public AnimatedPhoneNumberEditText(Context context) {
        super(context);
        this.f26066e = new ArrayList();
        this.f26067f = new ArrayList();
        this.h = new TextPaint(1);
        this.f26070s = "";
        this.v = new o1.d(this, 1);
        this.f26071w = new ArrayList();
        this.f26072x = new ArrayList();
    }

    public static void j(AnimatedPhoneNumberEditText animatedPhoneNumberEditText, boolean z10, String str) {
        animatedPhoneNumberEditText.f26071w.clear();
        ArrayList arrayList = animatedPhoneNumberEditText.f26072x;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((o1.j) obj).c();
        }
        if (!z10) {
            super.setHintText(str);
        }
    }

    @Override
    public String getHintText() {
        return this.A;
    }

    public float getProgress() {
        return this.f26069r;
    }

    @Override
    public final void i(int i9) {
        ArrayList arrayList = this.f26071w;
        if (i9 < arrayList.size()) {
            this.f31530b.setAlpha((int) (((Float) arrayList.get(i9)).floatValue() * 255.0f));
        }
    }

    @Override
    public void setHintText(String str) {
        boolean isEmpty;
        String str2;
        float f10;
        boolean isEmpty2 = TextUtils.isEmpty(str);
        boolean z10 = !isEmpty2;
        Boolean bool = this.f26073y;
        ArrayList arrayList = this.f26071w;
        ArrayList arrayList2 = this.f26072x;
        if (bool != null && bool.booleanValue() == z10) {
            isEmpty = false;
        } else {
            arrayList.clear();
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                ((o1.j) obj).c();
            }
            arrayList2.clear();
            this.f26073y = Boolean.valueOf(z10);
            isEmpty = TextUtils.isEmpty(getText());
        }
        if (!isEmpty2) {
            str2 = str;
        } else {
            str2 = this.A;
        }
        if (str2 == null) {
            str2 = "";
        }
        this.A = str;
        if (!isEmpty2 || !isEmpty) {
            super.setHintText(str);
        }
        if (isEmpty) {
            int length = str2.length();
            gh.u5 u5Var = new gh.u5(this, z10, str, 14);
            Runnable runnable = this.B;
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
                o1.j jVar = new o1.j(Integer.valueOf(i10), this.v);
                float f12 = f11 * 100.0f;
                o1.k kVar = new o1.k(f12);
                kVar.b(500.0f);
                kVar.a(1.0f);
                kVar.f18807i = f12;
                jVar.f18800u = kVar;
                jVar.f18791b = 100.0f * f10;
                jVar.f18792c = true;
                arrayList2.add(jVar);
                arrayList.add(Float.valueOf(f10));
                postDelayed(new fg(jVar, 7), i10 * 5);
            }
            this.B = u5Var;
            postDelayed(u5Var, (length * 5) + 150);
        }
    }

    public void setNewText(String str) {
        ArrayList arrayList;
        boolean z10;
        String str2;
        TextPaint textPaint;
        ArrayList arrayList2 = this.f26067f;
        if (arrayList2 != null && (arrayList = this.f26066e) != null && !Objects.equals(this.f26070s, str)) {
            ObjectAnimator objectAnimator = this.f26068n;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f26068n = null;
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            int i9 = 0;
            if (TextUtils.isEmpty(this.f26070s) && !TextUtils.isEmpty(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f26069r = 0.0f;
            while (i9 < str.length()) {
                int i10 = i9 + 1;
                String substring = str.substring(i9, i10);
                if (!arrayList2.isEmpty() && i9 < this.f26070s.length()) {
                    str2 = this.f26070s.substring(i9, i10);
                } else {
                    str2 = null;
                }
                if (!z10 && str2 != null && str2.equals(substring)) {
                    arrayList.add((StaticLayout) arrayList2.get(i9));
                    arrayList2.set(i9, null);
                } else {
                    TextPaint textPaint2 = this.h;
                    if (z10 && str2 == null) {
                        textPaint = textPaint2;
                        arrayList2.add(new StaticLayout("", textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                    } else {
                        textPaint = textPaint2;
                    }
                    arrayList.add(new StaticLayout(substring, textPaint, (int) Math.ceil(textPaint.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                }
                i9 = i10;
            }
            if (!arrayList2.isEmpty()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", -1.0f, 0.0f);
                this.f26068n = ofFloat;
                ofFloat.setDuration(150L);
                this.f26068n.addListener(new org.telegram.ui.xp(this, 3));
                this.f26068n.start();
            }
            this.f26070s = str;
            invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f26069r == f10) {
            return;
        }
        this.f26069r = f10;
        invalidate();
    }

    @Override
    public void setTextColor(int i9) {
        super.setTextColor(i9);
        this.h.setColor(i9);
    }

    @Override
    public final void setTextSize(int i9, float f10) {
        super.setTextSize(i9, f10);
        this.h.setTextSize(TypedValue.applyDimension(i9, f10, getResources().getDisplayMetrics()));
    }
}
