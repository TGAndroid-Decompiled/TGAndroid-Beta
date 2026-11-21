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
public final class jh0 implements LeadingMarginSpan {
    public final float[] E;
    public final Path F;
    public final Paint G;
    public final float[] H;
    public final Path I;
    public int J;
    public e0.g K;
    public SpannableString L;
    public final boolean f36507a;
    public boolean f36508b = true;
    public int f36509c;
    public int d;
    public boolean f36510e;
    public boolean f36511f;
    public boolean h;
    public boolean f36512n;
    public boolean f36513r;
    public final ih0 f36514s;
    public oi.w5 f36515w;
    public final Drawable f36516x;
    public final Paint f36517y;

    public jh0(boolean z10, boolean z11, ih0 ih0Var) {
        Paint paint = new Paint(1);
        this.f36517y = paint;
        this.E = new float[8];
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new float[8];
        this.I = new Path();
        this.J = -1;
        this.f36507a = z10;
        this.f36514s = ih0Var;
        this.f36510e = z11;
        this.f36516x = i5.c.g(org.telegram.messenger.t0.f26941b, 2131231967);
        paint2.setColor(this.J);
        paint.setColor(i0.a.o(this.J, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        int i7;
        int i10;
        int i11;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        ih0[] ih0VarArr = (ih0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ih0.class);
        int i12 = 0;
        while (true) {
            int i13 = 1;
            if (i12 >= ih0VarArr.length) {
                break;
            }
            ih0 ih0Var = ih0VarArr[i12];
            int spanStart = spannableStringBuilder.getSpanStart(ih0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(ih0Var);
            treeSet.add(Integer.valueOf(spanStart));
            Integer valueOf = Integer.valueOf(spanStart);
            if (hashMap.containsKey(Integer.valueOf(spanStart))) {
                i10 = ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue();
            } else {
                i10 = 0;
            }
            if (ih0Var.f36263a.f36510e) {
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
            spannableStringBuilder.removeSpan(ih0Var);
            spannableStringBuilder.removeSpan(ih0Var.f36263a);
            i12++;
        }
        Iterator it = treeSet.iterator();
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
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
                    c(spannableStringBuilder, i14, i7, z10);
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
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        if (i14 < spannableStringBuilder.length() && i15 > 0) {
            c(spannableStringBuilder, i14, spannableStringBuilder.length(), z10);
        }
    }

    public static void b(Spannable spannable, int i7, int i10, boolean z10) {
        jh0[] jh0VarArr = (jh0[]) spannable.getSpans(i7, i10, jh0.class);
        if (jh0VarArr != null && jh0VarArr.length > 0) {
            return;
        }
        int j3 = Utilities.j(i7, spannable.length(), 0);
        int j10 = Utilities.j(i10, spannable.length(), 0);
        ?? metricAffectingSpan = new MetricAffectingSpan();
        jh0 jh0Var = new jh0(false, z10, metricAffectingSpan);
        metricAffectingSpan.f36263a = jh0Var;
        jh0Var.f36509c = j3;
        jh0Var.d = j10;
        spannable.setSpan(metricAffectingSpan, j3, j10, 33);
        spannable.setSpan(jh0Var, j3, j10, 33);
    }

    public static int c(Editable editable, int i7, int i10, boolean z10) {
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
        jh0 jh0Var = new jh0(true, z10, metricAffectingSpan);
        metricAffectingSpan.f36263a = jh0Var;
        jh0Var.f36509c = j3;
        jh0Var.d = j10;
        editable.setSpan(jh0Var, Utilities.j(j3, editable.length(), 0), Utilities.j(j10, editable.length(), 0), 33);
        editable.setSpan(metricAffectingSpan, Utilities.j(j3, editable.length(), 0), Utilities.j(j10, editable.length(), 0), 33);
        editable.insert(Utilities.j(j10, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.j(j10, editable.length(), 0), Utilities.j(i11, editable.length(), 0));
        return i11;
    }

    public static java.util.ArrayList d(org.telegram.ui.Components.rt r19, android.text.Layout r20, java.util.ArrayList r21, boolean[] r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jh0.d(org.telegram.ui.Components.rt, android.text.Layout, java.util.ArrayList, boolean[]):java.util.ArrayList");
    }

    public static ArrayList e(Layout layout, ArrayList arrayList) {
        jh0[] jh0VarArr;
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
                for (jh0 jh0Var : (jh0[]) spanned.getSpans(0, spanned.length(), jh0.class)) {
                    boolean z10 = jh0Var.f36512n;
                    fh0 fh0Var = new fh0(null, layout, spanned, jh0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fh0Var);
                }
                return arrayList;
            } else if (arrayList != null) {
                arrayList.clear();
            }
        }
        return arrayList;
    }

    @Override
    public final int getLeadingMargin(boolean z10) {
        float f10;
        if (this.f36508b) {
            f10 = 8.0f;
        } else {
            f10 = 10.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    @Override
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i7, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z10, Layout layout) {
    }
}
