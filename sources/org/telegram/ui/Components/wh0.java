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
public final class wh0 implements LeadingMarginSpan {
    public final float[] D;
    public final Path E;
    public final Paint F;
    public final float[] G;
    public final Path H;
    public int I;
    public e0.h J;
    public SpannableString K;
    public final boolean f32184a;
    public boolean f32185b = true;
    public int f32186c;
    public int d;
    public boolean e;
    public boolean f32187f;
    public boolean h;
    public boolean f32188n;
    public boolean f32189r;
    public final vh0 f32190s;
    public bi.m6 f32191w;
    public final Drawable f32192x;
    public final Paint f32193y;

    public wh0(boolean z10, boolean z11, vh0 vh0Var) {
        Paint paint = new Paint(1);
        this.f32193y = paint;
        this.D = new float[8];
        this.E = new Path();
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new float[8];
        this.H = new Path();
        this.I = -1;
        this.f32184a = z10;
        this.f32190s = vh0Var;
        this.e = z11;
        this.f32192x = i0.a.f(org.telegram.messenger.w0.f19025b, 2131231965);
        paint2.setColor(this.I);
        paint.setColor(i0.b.o(this.I, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        int i10;
        int i11;
        int i12;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        vh0[] vh0VarArr = (vh0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), vh0.class);
        int i13 = 0;
        while (true) {
            int i14 = 1;
            if (i13 >= vh0VarArr.length) {
                break;
            }
            vh0 vh0Var = vh0VarArr[i13];
            int spanStart = spannableStringBuilder.getSpanStart(vh0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(vh0Var);
            treeSet.add(Integer.valueOf(spanStart));
            Integer valueOf = Integer.valueOf(spanStart);
            if (hashMap.containsKey(Integer.valueOf(spanStart))) {
                i11 = ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue();
            } else {
                i11 = 0;
            }
            if (vh0Var.f31258a.e) {
                i14 = 16;
            }
            hashMap.put(valueOf, Integer.valueOf(i14 | i11));
            treeSet.add(Integer.valueOf(spanEnd));
            Integer valueOf2 = Integer.valueOf(spanEnd);
            if (hashMap.containsKey(Integer.valueOf(spanEnd))) {
                i12 = ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue();
            } else {
                i12 = 0;
            }
            hashMap.put(valueOf2, Integer.valueOf(i12 | 2));
            spannableStringBuilder.removeSpan(vh0Var);
            spannableStringBuilder.removeSpan(vh0Var.f31258a);
            i13++;
        }
        Iterator it = treeSet.iterator();
        int i15 = 0;
        int i16 = 0;
        boolean z10 = false;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            int intValue2 = ((Integer) hashMap.get(num)).intValue();
            if (i15 != intValue) {
                int i17 = intValue - 1;
                if (i17 >= 0 && i17 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i17) == '\n') {
                    i10 = intValue - 1;
                } else {
                    i10 = intValue;
                }
                if (i16 > 0) {
                    c(spannableStringBuilder, i15, i10, z10);
                }
                i15 = intValue + 1;
                if (i15 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                    i15 = intValue;
                }
            }
            if ((intValue2 & 2) != 0) {
                i16--;
            }
            if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                i16++;
                if ((intValue2 & 16) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        if (i15 < spannableStringBuilder.length() && i16 > 0) {
            c(spannableStringBuilder, i15, spannableStringBuilder.length(), z10);
        }
    }

    public static void b(Spannable spannable, int i10, int i11, boolean z10) {
        wh0[] wh0VarArr = (wh0[]) spannable.getSpans(i10, i11, wh0.class);
        if (wh0VarArr != null && wh0VarArr.length > 0) {
            return;
        }
        int j10 = Utilities.j(i10, spannable.length(), 0);
        int j11 = Utilities.j(i11, spannable.length(), 0);
        ?? metricAffectingSpan = new MetricAffectingSpan();
        wh0 wh0Var = new wh0(false, z10, metricAffectingSpan);
        metricAffectingSpan.f31258a = wh0Var;
        wh0Var.f32186c = j10;
        wh0Var.d = j11;
        spannable.setSpan(metricAffectingSpan, j10, j11, 33);
        spannable.setSpan(wh0Var, j10, j11, 33);
    }

    public static int c(Editable editable, int i10, int i11, boolean z10) {
        if (editable == 0) {
            return -1;
        }
        int j10 = Utilities.j(i10, editable.length(), 0);
        int j11 = Utilities.j(i11, editable.length(), 0);
        if (j10 > 0 && editable.charAt(j10 - 1) != '\n') {
            editable.insert(j10, "\n");
            j10++;
            j11++;
        }
        int i12 = j11 + 1;
        if (j11 >= editable.length() || editable.charAt(j11) != '\n') {
            editable.insert(j11, "\n");
        }
        ?? metricAffectingSpan = new MetricAffectingSpan();
        wh0 wh0Var = new wh0(true, z10, metricAffectingSpan);
        metricAffectingSpan.f31258a = wh0Var;
        wh0Var.f32186c = j10;
        wh0Var.d = j11;
        editable.setSpan(wh0Var, Utilities.j(j10, editable.length(), 0), Utilities.j(j11, editable.length(), 0), 33);
        editable.setSpan(metricAffectingSpan, Utilities.j(j10, editable.length(), 0), Utilities.j(j11, editable.length(), 0), 33);
        editable.insert(Utilities.j(j11, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.j(j11, editable.length(), 0), Utilities.j(i12, editable.length(), 0));
        return i12;
    }

    public static java.util.ArrayList d(org.telegram.ui.Components.qt r19, android.text.Layout r20, java.util.ArrayList r21, boolean[] r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wh0.d(org.telegram.ui.Components.qt, android.text.Layout, java.util.ArrayList, boolean[]):java.util.ArrayList");
    }

    public static ArrayList e(Layout layout, ArrayList arrayList) {
        wh0[] wh0VarArr;
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
                for (wh0 wh0Var : (wh0[]) spanned.getSpans(0, spanned.length(), wh0.class)) {
                    boolean z10 = wh0Var.f32188n;
                    sh0 sh0Var = new sh0(null, layout, spanned, wh0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(sh0Var);
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
        float f7;
        if (this.f32185b) {
            f7 = 8.0f;
        } else {
            f7 = 10.0f;
        }
        return org.telegram.messenger.i0.L(f7);
    }

    @Override
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
    }
}
