package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Locale;
public final class g6 {
    public static final org.telegram.ui.Cells.u8 h = new org.telegram.ui.Cells.u8("progress", 3);
    public final TextPaint f23251c;
    public ObjectAnimator d;
    public final org.telegram.ui.Cells.t1 f23253g;
    public final ArrayList f23249a = new ArrayList();
    public final ArrayList f23250b = new ArrayList();
    public float e = 0.0f;
    public int f23252f = 1;

    public g6(org.telegram.ui.Cells.t1 t1Var, TextPaint textPaint) {
        this.f23251c = textPaint;
        this.f23253g = t1Var;
    }

    public final int a() {
        ArrayList arrayList = this.f23249a;
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
        ArrayList arrayList;
        int i11 = this.f23252f;
        ArrayList arrayList2 = this.f23249a;
        if (i11 == i10 && !arrayList2.isEmpty()) {
            return;
        }
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.d = null;
        }
        ArrayList arrayList3 = this.f23250b;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList2.clear();
        Locale locale = Locale.US;
        int i12 = this.f23252f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i12);
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(i10);
        String sb5 = sb4.toString();
        if (i10 > this.f23252f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23252f = i10;
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
                arrayList = arrayList3;
            } else {
                arrayList = arrayList3;
                arrayList2.add(new StaticLayout(substring, this.f23251c, (int) Math.ceil(textPaint.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            }
            i13 = i14;
            arrayList3 = arrayList;
        }
        ArrayList arrayList4 = arrayList3;
        if (z10 && !arrayList4.isEmpty()) {
            if (z11) {
                f7 = -1.0f;
            } else {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, h, f7, 0.0f);
            this.d = ofFloat;
            ofFloat.setDuration(150L);
            this.d.addListener(new org.telegram.ui.Cells.v5(this, 16));
            this.d.start();
        }
        this.f23253g.invalidate();
    }
}
