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
public class AnimatedPhoneNumberEditText extends d40 {
    public String A;
    public jh.r5 B;
    public final ArrayList f26077e;
    public final ArrayList f26078f;
    public final TextPaint h;
    public ObjectAnimator f26079n;
    public float f26080r;
    public String f26081s;
    public final o1.e v;
    public final ArrayList f26082w;
    public final ArrayList f26083x;
    public Boolean f26084y;

    public AnimatedPhoneNumberEditText(Context context) {
        super(context);
        this.f26077e = new ArrayList();
        this.f26078f = new ArrayList();
        this.h = new TextPaint(1);
        this.f26081s = "";
        this.v = new o1.e(this, 1);
        this.f26082w = new ArrayList();
        this.f26083x = new ArrayList();
    }

    public static void j(AnimatedPhoneNumberEditText animatedPhoneNumberEditText, boolean z10, String str) {
        animatedPhoneNumberEditText.f26082w.clear();
        ArrayList arrayList = animatedPhoneNumberEditText.f26083x;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((o1.k) obj).c();
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
        return this.f26080r;
    }

    @Override
    public final void i(int i10) {
        ArrayList arrayList = this.f26082w;
        if (i10 < arrayList.size()) {
            this.f27649b.setAlpha((int) (((Float) arrayList.get(i10)).floatValue() * 255.0f));
        }
    }

    @Override
    public void setHintText(String str) {
        boolean isEmpty;
        String str2;
        float f9;
        boolean isEmpty2 = TextUtils.isEmpty(str);
        boolean z10 = !isEmpty2;
        Boolean bool = this.f26084y;
        ArrayList arrayList = this.f26082w;
        ArrayList arrayList2 = this.f26083x;
        if (bool != null && bool.booleanValue() == z10) {
            isEmpty = false;
        } else {
            arrayList.clear();
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                ((o1.k) obj).c();
            }
            arrayList2.clear();
            this.f26084y = Boolean.valueOf(z10);
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
            jh.r5 r5Var = new jh.r5(this, z10, str, 14);
            Runnable runnable = this.B;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            for (int i11 = 0; i11 < length; i11++) {
                float f10 = 0.0f;
                if (!isEmpty2) {
                    f9 = 0.0f;
                } else {
                    f9 = 1.0f;
                }
                if (!isEmpty2) {
                    f10 = 1.0f;
                }
                o1.k kVar = new o1.k(Integer.valueOf(i11), this.v);
                float f11 = f10 * 100.0f;
                o1.l lVar = new o1.l(f11);
                lVar.b(500.0f);
                lVar.a(1.0f);
                lVar.f19052i = f11;
                kVar.f19045u = lVar;
                kVar.f19036b = 100.0f * f9;
                kVar.f19037c = true;
                arrayList2.add(kVar);
                arrayList.add(Float.valueOf(f9));
                postDelayed(new ig(kVar, 7), i11 * 5);
            }
            this.B = r5Var;
            postDelayed(r5Var, (length * 5) + 150);
        }
    }

    public void setNewText(String str) {
        ArrayList arrayList;
        boolean z10;
        String str2;
        TextPaint textPaint;
        ArrayList arrayList2 = this.f26078f;
        if (arrayList2 != null && (arrayList = this.f26077e) != null && !Objects.equals(this.f26081s, str)) {
            ObjectAnimator objectAnimator = this.f26079n;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f26079n = null;
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            int i10 = 0;
            if (TextUtils.isEmpty(this.f26081s) && !TextUtils.isEmpty(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f26080r = 0.0f;
            while (i10 < str.length()) {
                int i11 = i10 + 1;
                String substring = str.substring(i10, i11);
                if (!arrayList2.isEmpty() && i10 < this.f26081s.length()) {
                    str2 = this.f26081s.substring(i10, i11);
                } else {
                    str2 = null;
                }
                if (!z10 && str2 != null && str2.equals(substring)) {
                    arrayList.add((StaticLayout) arrayList2.get(i10));
                    arrayList2.set(i10, null);
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
                i10 = i11;
            }
            if (!arrayList2.isEmpty()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", -1.0f, 0.0f);
                this.f26079n = ofFloat;
                ofFloat.setDuration(150L);
                this.f26079n.addListener(new org.telegram.ui.bm(this, 5));
                this.f26079n.start();
            }
            this.f26081s = str;
            invalidate();
        }
    }

    public void setProgress(float f9) {
        if (this.f26080r == f9) {
            return;
        }
        this.f26080r = f9;
        invalidate();
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.h.setColor(i10);
    }

    @Override
    public final void setTextSize(int i10, float f9) {
        super.setTextSize(i10, f9);
        this.h.setTextSize(TypedValue.applyDimension(i10, f9, getResources().getDisplayMetrics()));
    }
}
