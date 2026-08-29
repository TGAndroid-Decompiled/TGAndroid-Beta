package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Locale;
public final class g6 {
    public static final fh.g h = new fh.g("progress", 5);
    public final TextPaint f28764c;
    public ObjectAnimator d;
    public final org.telegram.ui.Cells.s1 f28767g;
    public final ArrayList f28762a = new ArrayList();
    public final ArrayList f28763b = new ArrayList();
    public float f28765e = 0.0f;
    public int f28766f = 1;

    public g6(org.telegram.ui.Cells.s1 s1Var, TextPaint textPaint) {
        this.f28764c = textPaint;
        this.f28767g = s1Var;
    }

    public final int a() {
        ArrayList arrayList = this.f28762a;
        int size = arrayList.size();
        float f9 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            f9 += ((StaticLayout) arrayList.get(i10)).getLineWidth(0);
        }
        return (int) Math.ceil(f9);
    }

    public final void b(int i10, boolean z10) {
        boolean z11;
        float f9;
        String str;
        TextPaint textPaint;
        ArrayList arrayList;
        int i11 = this.f28766f;
        ArrayList arrayList2 = this.f28762a;
        if (i11 == i10 && !arrayList2.isEmpty()) {
            return;
        }
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.d = null;
        }
        ArrayList arrayList3 = this.f28763b;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList2.clear();
        Locale locale = Locale.US;
        int i12 = this.f28766f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i12);
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(i10);
        String sb5 = sb4.toString();
        if (i10 > this.f28766f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28766f = i10;
        this.f28765e = 0.0f;
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
                arrayList = arrayList3;
            } else {
                arrayList = arrayList3;
                arrayList2.add(new StaticLayout(substring, this.f28764c, (int) Math.ceil(textPaint.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            }
            i13 = i14;
            arrayList3 = arrayList;
        }
        ArrayList arrayList4 = arrayList3;
        if (z10 && !arrayList4.isEmpty()) {
            if (z11) {
                f9 = -1.0f;
            } else {
                f9 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, h, f9, 0.0f);
            this.d = ofFloat;
            ofFloat.setDuration(150L);
            this.d.addListener(new org.telegram.ui.bm(this, 4));
            this.d.start();
        }
        this.f28767g.invalidate();
    }
}
