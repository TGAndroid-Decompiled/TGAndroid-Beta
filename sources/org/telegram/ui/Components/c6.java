package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Locale;
public final class c6 {
    public static final hh.g h = new hh.g("progress", 5);
    public final TextPaint f23825c;
    public ObjectAnimator d;
    public final org.telegram.ui.Cells.s1 f23827g;
    public final ArrayList f23823a = new ArrayList();
    public final ArrayList f23824b = new ArrayList();
    public float e = 0.0f;
    public int f23826f = 1;

    public c6(org.telegram.ui.Cells.s1 s1Var, TextPaint textPaint) {
        this.f23825c = textPaint;
        this.f23827g = s1Var;
    }

    public final int a() {
        ArrayList arrayList = this.f23823a;
        int size = arrayList.size();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            f10 += ((StaticLayout) arrayList.get(i10)).getLineWidth(0);
        }
        return (int) Math.ceil(f10);
    }

    public final void b(int i10, boolean z4) {
        boolean z10;
        float f10;
        String str;
        TextPaint textPaint;
        ArrayList arrayList;
        int i11 = this.f23826f;
        ArrayList arrayList2 = this.f23823a;
        if (i11 == i10 && !arrayList2.isEmpty()) {
            return;
        }
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.d = null;
        }
        ArrayList arrayList3 = this.f23824b;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList2.clear();
        Locale locale = Locale.US;
        int i12 = this.f23826f;
        StringBuilder sb = new StringBuilder();
        sb.append(i12);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i10);
        String sb4 = sb3.toString();
        if (i10 > this.f23826f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23826f = i10;
        this.e = 0.0f;
        int i13 = 0;
        while (i13 < sb4.length()) {
            int i14 = i13 + 1;
            String substring = sb4.substring(i13, i14);
            if (!arrayList3.isEmpty() && i13 < sb2.length()) {
                str = sb2.substring(i13, i14);
            } else {
                str = null;
            }
            if (str != null && str.equals(substring)) {
                arrayList2.add((StaticLayout) arrayList3.get(i13));
                arrayList3.set(i13, null);
                arrayList = arrayList3;
            } else {
                arrayList = arrayList3;
                arrayList2.add(new StaticLayout(substring, this.f23825c, (int) Math.ceil(textPaint.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            }
            i13 = i14;
            arrayList3 = arrayList;
        }
        ArrayList arrayList4 = arrayList3;
        if (z4 && !arrayList4.isEmpty()) {
            if (z10) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, h, f10, 0.0f);
            this.d = ofFloat;
            ofFloat.setDuration(150L);
            this.d.addListener(new org.telegram.ui.u5(this, 25));
            this.d.start();
        }
        this.f23827g.invalidate();
    }
}
