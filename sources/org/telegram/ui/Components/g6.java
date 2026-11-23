package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Locale;
public final class g6 {
    public static final org.telegram.ui.Cells.p8 h = new org.telegram.ui.Cells.p8("progress", 3);
    public final TextPaint f35392c;
    public ObjectAnimator d;
    public final org.telegram.ui.Cells.r1 f35395g;
    public final ArrayList f35390a = new ArrayList();
    public final ArrayList f35391b = new ArrayList();
    public float f35393e = 0.0f;
    public int f35394f = 1;

    public g6(org.telegram.ui.Cells.r1 r1Var, TextPaint textPaint) {
        this.f35392c = textPaint;
        this.f35395g = r1Var;
    }

    public final int a() {
        ArrayList arrayList = this.f35390a;
        int size = arrayList.size();
        float f10 = 0.0f;
        for (int i7 = 0; i7 < size; i7++) {
            f10 += ((StaticLayout) arrayList.get(i7)).getLineWidth(0);
        }
        return (int) Math.ceil(f10);
    }

    public final void b(int i7, boolean z10) {
        boolean z11;
        float f10;
        String str;
        TextPaint textPaint;
        float f11;
        ArrayList arrayList;
        int i10 = this.f35394f;
        ArrayList arrayList2 = this.f35390a;
        if (i10 == i7 && !arrayList2.isEmpty()) {
            return;
        }
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.d = null;
        }
        ArrayList arrayList3 = this.f35391b;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList2.clear();
        Locale locale = Locale.US;
        int i11 = this.f35394f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(i7);
        String sb5 = sb4.toString();
        if (i7 > this.f35394f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f35394f = i7;
        float f12 = 0.0f;
        this.f35393e = 0.0f;
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
                arrayList2.add(new StaticLayout(substring, this.f35392c, (int) Math.ceil(textPaint.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
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
            this.d.addListener(new y(this, 1));
            this.d.start();
        }
        this.f35395g.invalidate();
    }
}
