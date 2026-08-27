package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Locale;

public final class b6 {
    public static final dh.g h = new dh.g("progress", 5);

    public final TextPaint f26949c;
    public ObjectAnimator d;

    public final org.telegram.ui.Cells.s1 f26952g;

    public final ArrayList f26947a = new ArrayList();

    public final ArrayList f26948b = new ArrayList();

    public float f26950e = 0.0f;

    public int f26951f = 1;

    public b6(org.telegram.ui.Cells.s1 s1Var, TextPaint textPaint) {
        this.f26949c = textPaint;
        this.f26952g = s1Var;
    }

    public final int a() {
        ArrayList arrayList = this.f26947a;
        int size = arrayList.size();
        float lineWidth = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            lineWidth += ((StaticLayout) arrayList.get(i10)).getLineWidth(0);
        }
        return (int) Math.ceil(lineWidth);
    }

    public final void b(int i10, boolean z10) {
        int i11 = this.f26951f;
        ArrayList arrayList = this.f26947a;
        if (i11 != i10 || arrayList.isEmpty()) {
            ObjectAnimator objectAnimator = this.d;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.d = null;
            }
            ArrayList arrayList2 = this.f26948b;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            Locale locale = Locale.US;
            int i12 = this.f26951f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i12);
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i10);
            String string2 = sb3.toString();
            boolean z11 = i10 > this.f26951f;
            this.f26951f = i10;
            this.f26950e = 0.0f;
            int i13 = 0;
            while (i13 < string2.length()) {
                int i14 = i13 + 1;
                String strSubstring = string2.substring(i13, i14);
                String strSubstring2 = (arrayList2.isEmpty() || i13 >= string.length()) ? null : string.substring(i13, i14);
                if (strSubstring2 == null || !strSubstring2.equals(strSubstring)) {
                    TextPaint textPaint = this.f26949c;
                    arrayList.add(new StaticLayout(strSubstring, textPaint, (int) Math.ceil(textPaint.measureText(strSubstring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                } else {
                    arrayList.add((StaticLayout) arrayList2.get(i13));
                    arrayList2.set(i13, null);
                }
                i13 = i14;
                arrayList2 = arrayList2;
            }
            ArrayList arrayList3 = arrayList2;
            if (z10 && !arrayList3.isEmpty()) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, h, z11 ? -1.0f : 1.0f, 0.0f);
                this.d = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(150L);
                this.d.addListener(new org.telegram.ui.am(this, 4));
                this.d.start();
            }
            this.f26952g.invalidate();
        }
    }
}
