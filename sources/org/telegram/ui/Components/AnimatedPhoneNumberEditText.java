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

public class AnimatedPhoneNumberEditText extends u30 {
    public String A;
    public hh.t5 B;

    public final ArrayList f26062e;

    public final ArrayList f26063f;
    public final TextPaint h;

    public ObjectAnimator f26064n;

    public float f26065r;

    public String f26066s;
    public final o1.d v;

    public final ArrayList f26067w;

    public final ArrayList f26068x;

    public Boolean f26069y;

    public AnimatedPhoneNumberEditText(Context context) {
        super(context);
        this.f26062e = new ArrayList();
        this.f26063f = new ArrayList();
        this.h = new TextPaint(1);
        this.f26066s = "";
        this.v = new o1.d(this, 1);
        this.f26067w = new ArrayList();
        this.f26068x = new ArrayList();
    }

    public static void j(AnimatedPhoneNumberEditText animatedPhoneNumberEditText, boolean z10, String str) {
        animatedPhoneNumberEditText.f26067w.clear();
        ArrayList arrayList = animatedPhoneNumberEditText.f26068x;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((o1.j) obj).c();
        }
        if (z10) {
            return;
        }
        super.setHintText(str);
    }

    @Override
    public String getHintText() {
        return this.A;
    }

    public float getProgress() {
        return this.f26065r;
    }

    @Override
    public final void i(int i10) {
        ArrayList arrayList = this.f26067w;
        if (i10 < arrayList.size()) {
            this.f32955b.setAlpha((int) (((Float) arrayList.get(i10)).floatValue() * 255.0f));
        }
    }

    @Override
    public void setHintText(String str) {
        boolean zIsEmpty;
        boolean zIsEmpty2 = TextUtils.isEmpty(str);
        boolean z10 = !zIsEmpty2;
        Boolean bool = this.f26069y;
        ArrayList arrayList = this.f26067w;
        ArrayList arrayList2 = this.f26068x;
        if (bool == null || bool.booleanValue() != z10) {
            arrayList.clear();
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                ((o1.j) obj).c();
            }
            arrayList2.clear();
            this.f26069y = Boolean.valueOf(z10);
            zIsEmpty = TextUtils.isEmpty(getText());
        } else {
            zIsEmpty = false;
        }
        String str2 = !zIsEmpty2 ? str : this.A;
        if (str2 == null) {
            str2 = "";
        }
        this.A = str;
        if (!zIsEmpty2 || !zIsEmpty) {
            super.setHintText(str);
        }
        if (zIsEmpty) {
            int length = str2.length();
            hh.t5 t5Var = new hh.t5(this, z10, str, 14);
            Runnable runnable = this.B;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            for (int i11 = 0; i11 < length; i11++) {
                float f10 = 0.0f;
                float f11 = !zIsEmpty2 ? 0.0f : 1.0f;
                if (!zIsEmpty2) {
                    f10 = 1.0f;
                }
                o1.j jVar = new o1.j(Integer.valueOf(i11), this.v);
                float f12 = f10 * 100.0f;
                o1.k kVar = new o1.k(f12);
                kVar.b(500.0f);
                kVar.a(1.0f);
                kVar.f19154i = f12;
                jVar.f19147u = kVar;
                jVar.f19138b = 100.0f * f11;
                jVar.f19139c = true;
                arrayList2.add(jVar);
                arrayList.add(Float.valueOf(f11));
                postDelayed(new bg(jVar, 7), ((long) i11) * 5);
            }
            this.B = t5Var;
            postDelayed(t5Var, (((long) length) * 5) + 150);
        }
    }

    public void setNewText(String str) {
        ArrayList arrayList;
        TextPaint textPaint;
        ArrayList arrayList2 = this.f26063f;
        if (arrayList2 == null || (arrayList = this.f26062e) == null || Objects.equals(this.f26066s, str)) {
            return;
        }
        ObjectAnimator objectAnimator = this.f26064n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f26064n = null;
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList.clear();
        int i10 = 0;
        boolean z10 = TextUtils.isEmpty(this.f26066s) && !TextUtils.isEmpty(str);
        this.f26065r = 0.0f;
        while (i10 < str.length()) {
            int i11 = i10 + 1;
            String strSubstring = str.substring(i10, i11);
            String strSubstring2 = (arrayList2.isEmpty() || i10 >= this.f26066s.length()) ? null : this.f26066s.substring(i10, i11);
            if (z10 || strSubstring2 == null || !strSubstring2.equals(strSubstring)) {
                TextPaint textPaint2 = this.h;
                if (z10 && strSubstring2 == null) {
                    textPaint = textPaint2;
                    arrayList2.add(new StaticLayout("", textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                } else {
                    textPaint = textPaint2;
                }
                arrayList.add(new StaticLayout(strSubstring, textPaint, (int) Math.ceil(textPaint.measureText(strSubstring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            } else {
                arrayList.add((StaticLayout) arrayList2.get(i10));
                arrayList2.set(i10, null);
            }
            i10 = i11;
        }
        if (!arrayList2.isEmpty()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", -1.0f, 0.0f);
            this.f26064n = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(150L);
            this.f26064n.addListener(new org.telegram.ui.am(this, 5));
            this.f26064n.start();
        }
        this.f26066s = str;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f26065r == f10) {
            return;
        }
        this.f26065r = f10;
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
