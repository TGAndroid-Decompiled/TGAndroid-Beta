package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Locale;
public final class y5 {
    public static final org.telegram.ui.Cells.n8 h = new org.telegram.ui.Cells.n8("progress", 3);
    public final TextPaint f40619c;
    public ObjectAnimator d;
    public final org.telegram.ui.Cells.q1 f40622g;
    public final ArrayList f40617a = new ArrayList();
    public final ArrayList f40618b = new ArrayList();
    public float f40620e = 0.0f;
    public int f40621f = 1;

    public y5(org.telegram.ui.Cells.q1 q1Var, TextPaint textPaint) {
        this.f40619c = textPaint;
        this.f40622g = q1Var;
    }

    public final int a() {
        ArrayList arrayList = this.f40617a;
        int size = arrayList.size();
        float f10 = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            f10 += ((StaticLayout) arrayList.get(i3)).getLineWidth(0);
        }
        return (int) Math.ceil(f10);
    }

    public final void b(int i3, boolean z10) {
        boolean z11;
        float f10;
        String str;
        TextPaint textPaint;
        float f11;
        ArrayList arrayList;
        int i10 = this.f40621f;
        ArrayList arrayList2 = this.f40617a;
        if (i10 == i3 && !arrayList2.isEmpty()) {
            return;
        }
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.d = null;
        }
        ArrayList arrayList3 = this.f40618b;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList2.clear();
        Locale locale = Locale.US;
        int i11 = this.f40621f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(i3);
        String sb5 = sb4.toString();
        if (i3 > this.f40621f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f40621f = i3;
        float f12 = 0.0f;
        this.f40620e = 0.0f;
        int i12 = 0;
        while (i12 < sb5.length()) {
            int i13 = i12 + 1;
            String substring = sb5.substring(i12, i13);
            if (!arrayList3.isEmpty() && i12 < sb3.length()) {
                str = sb3.substring(i12, i13);
            } else {
                str = null;
            }
            if (str != null && str.equals(substring)) {
                arrayList2.add((StaticLayout) arrayList3.get(i12));
                arrayList3.set(i12, null);
                f11 = f12;
                arrayList = arrayList3;
            } else {
                f11 = f12;
                arrayList = arrayList3;
                arrayList2.add(new StaticLayout(substring, this.f40619c, (int) Math.ceil(textPaint.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            }
            f12 = f11;
            i12 = i13;
            arrayList3 = arrayList;
        }
        float f13 = f12;
        ArrayList arrayList4 = arrayList3;
        if (z10 && !arrayList4.isEmpty()) {
            if (z11) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, h, f10, f13);
            this.d = ofFloat;
            ofFloat.setDuration(150L);
            this.d.addListener(new x5(this, 0));
            this.d.start();
        }
        this.f40622g.invalidate();
    }
}
