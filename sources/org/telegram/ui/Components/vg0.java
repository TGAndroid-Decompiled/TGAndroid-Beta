package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import org.telegram.messenger.Utilities;
public final class vg0 implements LeadingMarginSpan {
    public final float[] D;
    public final Path E;
    public final Paint F;
    public final float[] G;
    public final Path H;
    public int I;
    public e0.g J;
    public SpannableString K;
    public final boolean f39059a;
    public boolean f39060b = true;
    public int f39061c;
    public int d;
    public boolean f39062e;
    public boolean f39063f;
    public boolean h;
    public boolean f39064n;
    public boolean f39065r;
    public final ug0 f39066s;
    public li.w5 f39067w;
    public final Drawable f39068x;
    public final Paint f39069y;

    public vg0(boolean z9, boolean z10, ug0 ug0Var) {
        Paint paint = new Paint(1);
        this.f39069y = paint;
        this.D = new float[8];
        this.E = new Path();
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new float[8];
        this.H = new Path();
        this.I = -1;
        this.f39059a = z9;
        this.f39066s = ug0Var;
        this.f39062e = z10;
        this.f39068x = jg.g.h(org.telegram.messenger.t0.f25566b, 2131231966);
        paint2.setColor(this.I);
        paint.setColor(i0.a.o(this.I, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        int i7;
        int i10;
        int i11;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        ug0[] ug0VarArr = (ug0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ug0.class);
        int i12 = 0;
        while (true) {
            int i13 = 1;
            if (i12 >= ug0VarArr.length) {
                break;
            }
            ug0 ug0Var = ug0VarArr[i12];
            int spanStart = spannableStringBuilder.getSpanStart(ug0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(ug0Var);
            treeSet.add(Integer.valueOf(spanStart));
            Integer valueOf = Integer.valueOf(spanStart);
            if (hashMap.containsKey(Integer.valueOf(spanStart))) {
                i10 = ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue();
            } else {
                i10 = 0;
            }
            if (ug0Var.f38719a.f39062e) {
                i13 = 16;
            }
            hashMap.put(valueOf, Integer.valueOf(i13 | i10));
            treeSet.add(Integer.valueOf(spanEnd));
            Integer valueOf2 = Integer.valueOf(spanEnd);
            if (hashMap.containsKey(Integer.valueOf(spanEnd))) {
                i11 = ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue();
            } else {
                i11 = 0;
            }
            hashMap.put(valueOf2, Integer.valueOf(i11 | 2));
            spannableStringBuilder.removeSpan(ug0Var);
            spannableStringBuilder.removeSpan(ug0Var.f38719a);
            i12++;
        }
        Iterator it = treeSet.iterator();
        int i14 = 0;
        int i15 = 0;
        boolean z9 = false;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            int intValue2 = ((Integer) hashMap.get(num)).intValue();
            if (i14 != intValue) {
                int i16 = intValue - 1;
                if (i16 >= 0 && i16 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i16) == '\n') {
                    i7 = intValue - 1;
                } else {
                    i7 = intValue;
                }
                if (i15 > 0) {
                    c(spannableStringBuilder, i14, i7, z9);
                }
                i14 = intValue + 1;
                if (i14 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                    i14 = intValue;
                }
            }
            if ((intValue2 & 2) != 0) {
                i15--;
            }
            if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                i15++;
                if ((intValue2 & 16) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
        }
        if (i14 < spannableStringBuilder.length() && i15 > 0) {
            c(spannableStringBuilder, i14, spannableStringBuilder.length(), z9);
        }
    }

    public static void b(Spannable spannable, int i7, int i10, boolean z9) {
        vg0[] vg0VarArr = (vg0[]) spannable.getSpans(i7, i10, vg0.class);
        if (vg0VarArr != null && vg0VarArr.length > 0) {
            return;
        }
        int j3 = Utilities.j(i7, spannable.length(), 0);
        int j10 = Utilities.j(i10, spannable.length(), 0);
        ?? metricAffectingSpan = new MetricAffectingSpan();
        vg0 vg0Var = new vg0(false, z9, metricAffectingSpan);
        metricAffectingSpan.f38719a = vg0Var;
        vg0Var.f39061c = j3;
        vg0Var.d = j10;
        spannable.setSpan(metricAffectingSpan, j3, j10, 33);
        spannable.setSpan(vg0Var, j3, j10, 33);
    }

    public static int c(Editable editable, int i7, int i10, boolean z9) {
        if (editable == 0) {
            return -1;
        }
        int j3 = Utilities.j(i7, editable.length(), 0);
        int j10 = Utilities.j(i10, editable.length(), 0);
        if (j3 > 0 && editable.charAt(j3 - 1) != '\n') {
            editable.insert(j3, "\n");
            j3++;
            j10++;
        }
        int i11 = j10 + 1;
        if (j10 >= editable.length() || editable.charAt(j10) != '\n') {
            editable.insert(j10, "\n");
        }
        ?? metricAffectingSpan = new MetricAffectingSpan();
        vg0 vg0Var = new vg0(true, z9, metricAffectingSpan);
        metricAffectingSpan.f38719a = vg0Var;
        vg0Var.f39061c = j3;
        vg0Var.d = j10;
        editable.setSpan(vg0Var, Utilities.j(j3, editable.length(), 0), Utilities.j(j10, editable.length(), 0), 33);
        editable.setSpan(metricAffectingSpan, Utilities.j(j3, editable.length(), 0), Utilities.j(j10, editable.length(), 0), 33);
        editable.insert(Utilities.j(j10, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.j(j10, editable.length(), 0), Utilities.j(i11, editable.length(), 0));
        return i11;
    }

    public static java.util.ArrayList d(org.telegram.ui.Components.dt r19, android.text.Layout r20, java.util.ArrayList r21, boolean[] r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vg0.d(org.telegram.ui.Components.dt, android.text.Layout, java.util.ArrayList, boolean[]):java.util.ArrayList");
    }

    public static ArrayList e(Layout layout, ArrayList arrayList) {
        vg0[] vg0VarArr;
        if (layout == null) {
            if (arrayList != null) {
                arrayList.clear();
                return arrayList;
            }
        } else {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spanned)) {
                Spanned spanned = (Spanned) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                for (vg0 vg0Var : (vg0[]) spanned.getSpans(0, spanned.length(), vg0.class)) {
                    boolean z9 = vg0Var.f39064n;
                    rg0 rg0Var = new rg0(null, layout, spanned, vg0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(rg0Var);
                }
                return arrayList;
            } else if (arrayList != null) {
                arrayList.clear();
            }
        }
        return arrayList;
    }

    @Override
    public final int getLeadingMargin(boolean z9) {
        float f10;
        if (this.f39060b) {
            f10 = 8.0f;
        } else {
            f10 = 10.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    @Override
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i7, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z9, Layout layout) {
    }
}
