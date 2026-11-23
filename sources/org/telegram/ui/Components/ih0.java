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
public final class ih0 implements LeadingMarginSpan {
    public final float[] E;
    public final Path F;
    public final Paint G;
    public final float[] H;
    public final Path I;
    public int J;
    public e0.g K;
    public SpannableString L;
    public final boolean f36011a;
    public boolean f36012b = true;
    public int f36013c;
    public int d;
    public boolean f36014e;
    public boolean f36015f;
    public boolean h;
    public boolean f36016n;
    public boolean f36017r;
    public final hh0 f36018s;
    public oi.w5 f36019w;
    public final Drawable f36020x;
    public final Paint f36021y;

    public ih0(boolean z10, boolean z11, hh0 hh0Var) {
        Paint paint = new Paint(1);
        this.f36021y = paint;
        this.E = new float[8];
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new float[8];
        this.I = new Path();
        this.J = -1;
        this.f36011a = z10;
        this.f36018s = hh0Var;
        this.f36014e = z11;
        this.f36020x = i5.c.g(org.telegram.messenger.t0.f27013b, 2131231970);
        paint2.setColor(this.J);
        paint.setColor(i0.a.o(this.J, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        int i7;
        int i10;
        int i11;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        hh0[] hh0VarArr = (hh0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), hh0.class);
        int i12 = 0;
        while (true) {
            int i13 = 1;
            if (i12 >= hh0VarArr.length) {
                break;
            }
            hh0 hh0Var = hh0VarArr[i12];
            int spanStart = spannableStringBuilder.getSpanStart(hh0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(hh0Var);
            treeSet.add(Integer.valueOf(spanStart));
            Integer valueOf = Integer.valueOf(spanStart);
            if (hashMap.containsKey(Integer.valueOf(spanStart))) {
                i10 = ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue();
            } else {
                i10 = 0;
            }
            if (hh0Var.f35741a.f36014e) {
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
            spannableStringBuilder.removeSpan(hh0Var);
            spannableStringBuilder.removeSpan(hh0Var.f35741a);
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
        ih0[] ih0VarArr = (ih0[]) spannable.getSpans(i7, i10, ih0.class);
        if (ih0VarArr != null && ih0VarArr.length > 0) {
            return;
        }
        int j3 = Utilities.j(i7, spannable.length(), 0);
        int j10 = Utilities.j(i10, spannable.length(), 0);
        ?? metricAffectingSpan = new MetricAffectingSpan();
        ih0 ih0Var = new ih0(false, z10, metricAffectingSpan);
        metricAffectingSpan.f35741a = ih0Var;
        ih0Var.f36013c = j3;
        ih0Var.d = j10;
        spannable.setSpan(metricAffectingSpan, j3, j10, 33);
        spannable.setSpan(ih0Var, j3, j10, 33);
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
        ih0 ih0Var = new ih0(true, z10, metricAffectingSpan);
        metricAffectingSpan.f35741a = ih0Var;
        ih0Var.f36013c = j3;
        ih0Var.d = j10;
        editable.setSpan(ih0Var, Utilities.j(j3, editable.length(), 0), Utilities.j(j10, editable.length(), 0), 33);
        editable.setSpan(metricAffectingSpan, Utilities.j(j3, editable.length(), 0), Utilities.j(j10, editable.length(), 0), 33);
        editable.insert(Utilities.j(j10, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.j(j10, editable.length(), 0), Utilities.j(i11, editable.length(), 0));
        return i11;
    }

    public static java.util.ArrayList d(org.telegram.ui.Components.pt r19, android.text.Layout r20, java.util.ArrayList r21, boolean[] r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ih0.d(org.telegram.ui.Components.pt, android.text.Layout, java.util.ArrayList, boolean[]):java.util.ArrayList");
    }

    public static ArrayList e(Layout layout, ArrayList arrayList) {
        ih0[] ih0VarArr;
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
                for (ih0 ih0Var : (ih0[]) spanned.getSpans(0, spanned.length(), ih0.class)) {
                    boolean z10 = ih0Var.f36016n;
                    eh0 eh0Var = new eh0(null, layout, spanned, ih0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(eh0Var);
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
        if (this.f36012b) {
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
