package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Locale;
public final class b6 {
    public static final ch.g h = new ch.g("progress", 5);
    public final TextPaint f27048c;
    public ObjectAnimator d;
    public final org.telegram.ui.Cells.t1 f27051g;
    public final ArrayList f27046a = new ArrayList();
    public final ArrayList f27047b = new ArrayList();
    public float f27049e = 0.0f;
    public int f27050f = 1;

    public b6(org.telegram.ui.Cells.t1 t1Var, TextPaint textPaint) {
        this.f27048c = textPaint;
        this.f27051g = t1Var;
    }

    public final int a() {
        ArrayList arrayList = this.f27046a;
        int size = arrayList.size();
        float f10 = 0.0f;
        for (int i9 = 0; i9 < size; i9++) {
            f10 += ((StaticLayout) arrayList.get(i9)).getLineWidth(0);
        }
        return (int) Math.ceil(f10);
    }

    public final void b(int i9, boolean z10) {
        boolean z11;
        float f10;
        String str;
        TextPaint textPaint;
        ArrayList arrayList;
        int i10 = this.f27050f;
        ArrayList arrayList2 = this.f27046a;
        if (i10 == i9 && !arrayList2.isEmpty()) {
            return;
        }
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.d = null;
        }
        ArrayList arrayList3 = this.f27047b;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList2.clear();
        Locale locale = Locale.US;
        int i11 = this.f27050f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(i9);
        String sb5 = sb4.toString();
        if (i9 > this.f27050f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27050f = i9;
        this.f27049e = 0.0f;
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
                arrayList = arrayList3;
            } else {
                arrayList = arrayList3;
                arrayList2.add(new StaticLayout(substring, this.f27048c, (int) Math.ceil(textPaint.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            }
            i12 = i13;
            arrayList3 = arrayList;
        }
        ArrayList arrayList4 = arrayList3;
        if (z10 && !arrayList4.isEmpty()) {
            if (z11) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, h, f10, 0.0f);
            this.d = ofFloat;
            ofFloat.setDuration(150L);
            this.d.addListener(new org.telegram.ui.xp(this, 2));
            this.d.start();
        }
        this.f27051g.invalidate();
    }
}
