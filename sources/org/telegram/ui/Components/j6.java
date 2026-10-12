package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Locale;
public final class j6 {
    public static final org.telegram.ui.Cells.t8 h = new org.telegram.ui.Cells.t8("progress", 3);
    public final TextPaint f26197c;
    public ObjectAnimator d;
    public final org.telegram.ui.Cells.u1 f26199g;
    public final ArrayList f26195a = new ArrayList();
    public final ArrayList f26196b = new ArrayList();
    public float e = 0.0f;
    public int f26198f = 1;

    public j6(org.telegram.ui.Cells.u1 u1Var, TextPaint textPaint) {
        this.f26197c = textPaint;
        this.f26199g = u1Var;
    }

    public final int a() {
        ArrayList arrayList = this.f26195a;
        int size = arrayList.size();
        float f7 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            f7 += ((StaticLayout) arrayList.get(i10)).getLineWidth(0);
        }
        return (int) Math.ceil(f7);
    }

    public final void b(int i10, boolean z10) {
        boolean z11;
        float f7;
        String str;
        TextPaint textPaint;
        float f10;
        ArrayList arrayList;
        int i11 = this.f26198f;
        ArrayList arrayList2 = this.f26195a;
        if (i11 == i10 && !arrayList2.isEmpty()) {
            return;
        }
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.d = null;
        }
        ArrayList arrayList3 = this.f26196b;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList2.clear();
        Locale locale = Locale.US;
        int i12 = this.f26198f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i12);
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(i10);
        String sb5 = sb4.toString();
        if (i10 > this.f26198f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f26198f = i10;
        float f11 = 0.0f;
        this.e = 0.0f;
        int i13 = 0;
        while (i13 < sb5.length()) {
            int i14 = i13 + 1;
            String substring = sb5.substring(i13, i14);
            if (!arrayList3.isEmpty() && i13 < sb3.length()) {
                str = sb3.substring(i13, i14);
            } else {
                str = null;
            }
            if (str != null && str.equals(substring)) {
                arrayList2.add((StaticLayout) arrayList3.get(i13));
                arrayList3.set(i13, null);
                f10 = f11;
                arrayList = arrayList3;
            } else {
                f10 = f11;
                arrayList = arrayList3;
                arrayList2.add(new StaticLayout(substring, this.f26197c, (int) Math.ceil(textPaint.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            }
            f11 = f10;
            i13 = i14;
            arrayList3 = arrayList;
        }
        float f12 = f11;
        ArrayList arrayList4 = arrayList3;
        if (z10 && !arrayList4.isEmpty()) {
            if (z11) {
                f7 = -1.0f;
            } else {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, h, f7, f12);
            this.d = ofFloat;
            ofFloat.setDuration(150L);
            this.d.addListener(new org.telegram.ui.u0(this, 29));
            this.d.start();
        }
        this.f26199g.invalidate();
    }
}
