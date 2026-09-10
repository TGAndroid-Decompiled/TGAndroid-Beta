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
public class AnimatedPhoneNumberEditText extends p40 {
    public String E;
    public bi.c1 F;
    public final ArrayList e;
    public final ArrayList f20809f;
    public final TextPaint h;
    public ObjectAnimator f20810n;
    public float f20811r;
    public String f20812s;
    public final o1.d v;
    public final ArrayList f20813w;
    public final ArrayList f20814x;
    public Boolean f20815y;

    public AnimatedPhoneNumberEditText(Context context) {
        super(context);
        this.e = new ArrayList();
        this.f20809f = new ArrayList();
        this.h = new TextPaint(1);
        this.f20812s = "";
        this.v = new o1.d(this, 1);
        this.f20813w = new ArrayList();
        this.f20814x = new ArrayList();
    }

    public static void j(AnimatedPhoneNumberEditText animatedPhoneNumberEditText, boolean z10, String str) {
        animatedPhoneNumberEditText.f20813w.clear();
        ArrayList arrayList = animatedPhoneNumberEditText.f20814x;
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
        return this.E;
    }

    public float getProgress() {
        return this.f20811r;
    }

    @Override
    public final void i(int i10) {
        ArrayList arrayList = this.f20813w;
        if (i10 < arrayList.size()) {
            this.f26018b.setAlpha((int) (((Float) arrayList.get(i10)).floatValue() * 255.0f));
        }
    }

    @Override
    public void setHintText(String str) {
        boolean isEmpty;
        String str2;
        float f7;
        boolean isEmpty2 = TextUtils.isEmpty(str);
        boolean z10 = !isEmpty2;
        Boolean bool = this.f20815y;
        ArrayList arrayList = this.f20813w;
        ArrayList arrayList2 = this.f20814x;
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
            this.f20815y = Boolean.valueOf(z10);
            isEmpty = TextUtils.isEmpty(getText());
        }
        if (!isEmpty2) {
            str2 = str;
        } else {
            str2 = this.E;
        }
        if (str2 == null) {
            str2 = "";
        }
        this.E = str;
        if (!isEmpty2 || !isEmpty) {
            super.setHintText(str);
        }
        if (isEmpty) {
            int length = str2.length();
            bi.c1 c1Var = new bi.c1(this, z10, str, 16);
            Runnable runnable = this.F;
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
                o1.k kVar = new o1.k(Integer.valueOf(i11), this.v);
                float f11 = f10 * 100.0f;
                o1.l lVar = new o1.l(f11);
                lVar.b(500.0f);
                lVar.a(1.0f);
                lVar.f14140i = f11;
                kVar.f14134u = lVar;
                kVar.f14125b = 100.0f * f7;
                kVar.f14126c = true;
                arrayList2.add(kVar);
                arrayList.add(Float.valueOf(f7));
                postDelayed(new rg(kVar, 7), i11 * 5);
            }
            this.F = c1Var;
            postDelayed(c1Var, (length * 5) + 150);
        }
    }

    public void setNewText(String str) {
        ArrayList arrayList;
        boolean z10;
        String str2;
        TextPaint textPaint;
        ArrayList arrayList2 = this.f20809f;
        if (arrayList2 != null && (arrayList = this.e) != null && !Objects.equals(this.f20812s, str)) {
            ObjectAnimator objectAnimator = this.f20810n;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f20810n = null;
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            int i10 = 0;
            if (TextUtils.isEmpty(this.f20812s) && !TextUtils.isEmpty(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f20811r = 0.0f;
            while (i10 < str.length()) {
                int i11 = i10 + 1;
                String substring = str.substring(i10, i11);
                if (!arrayList2.isEmpty() && i10 < this.f20812s.length()) {
                    str2 = this.f20812s.substring(i10, i11);
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
                this.f20810n = ofFloat;
                ofFloat.setDuration(150L);
                this.f20810n.addListener(new org.telegram.ui.Cells.v5(this, 17));
                this.f20810n.start();
            }
            this.f20812s = str;
            invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f20811r == f7) {
            return;
        }
        this.f20811r = f7;
        invalidate();
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.h.setColor(i10);
    }

    @Override
    public final void setTextSize(int i10, float f7) {
        super.setTextSize(i10, f7);
        this.h.setTextSize(TypedValue.applyDimension(i10, f7, getResources().getDisplayMetrics()));
    }
}
