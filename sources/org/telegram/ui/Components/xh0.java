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
public final class xh0 implements LeadingMarginSpan {
    public final float[] D;
    public final Path E;
    public final Paint F;
    public final float[] G;
    public final Path H;
    public int I;
    public e0.h J;
    public SpannableString K;
    public final boolean f32559a;
    public boolean f32560b = true;
    public int f32561c;
    public int d;
    public boolean e;
    public boolean f32562f;
    public boolean h;
    public boolean f32563n;
    public boolean f32564r;
    public final wh0 f32565s;
    public bi.m6 f32566w;
    public final Drawable f32567x;
    public final Paint f32568y;

    public xh0(boolean z10, boolean z11, wh0 wh0Var) {
        Paint paint = new Paint(1);
        this.f32568y = paint;
        this.D = new float[8];
        this.E = new Path();
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new float[8];
        this.H = new Path();
        this.I = -1;
        this.f32559a = z10;
        this.f32565s = wh0Var;
        this.e = z11;
        this.f32567x = i0.a.f(org.telegram.messenger.w0.f18945b, 2131231965);
        paint2.setColor(this.I);
        paint.setColor(i0.b.o(this.I, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        int i10;
        int i11;
        int i12;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        wh0[] wh0VarArr = (wh0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), wh0.class);
        int i13 = 0;
        while (true) {
            int i14 = 1;
            if (i13 >= wh0VarArr.length) {
                break;
            }
            wh0 wh0Var = wh0VarArr[i13];
            int spanStart = spannableStringBuilder.getSpanStart(wh0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(wh0Var);
            treeSet.add(Integer.valueOf(spanStart));
            Integer valueOf = Integer.valueOf(spanStart);
            if (hashMap.containsKey(Integer.valueOf(spanStart))) {
                i11 = ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue();
            } else {
                i11 = 0;
            }
            if (wh0Var.f32248a.e) {
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
            spannableStringBuilder.removeSpan(wh0Var);
            spannableStringBuilder.removeSpan(wh0Var.f32248a);
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
        xh0[] xh0VarArr = (xh0[]) spannable.getSpans(i10, i11, xh0.class);
        if (xh0VarArr != null && xh0VarArr.length > 0) {
            return;
        }
        int j10 = Utilities.j(i10, spannable.length(), 0);
        int j11 = Utilities.j(i11, spannable.length(), 0);
        ?? metricAffectingSpan = new MetricAffectingSpan();
        xh0 xh0Var = new xh0(false, z10, metricAffectingSpan);
        metricAffectingSpan.f32248a = xh0Var;
        xh0Var.f32561c = j10;
        xh0Var.d = j11;
        spannable.setSpan(metricAffectingSpan, j10, j11, 33);
        spannable.setSpan(xh0Var, j10, j11, 33);
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
        xh0 xh0Var = new xh0(true, z10, metricAffectingSpan);
        metricAffectingSpan.f32248a = xh0Var;
        xh0Var.f32561c = j10;
        xh0Var.d = j11;
        editable.setSpan(xh0Var, Utilities.j(j10, editable.length(), 0), Utilities.j(j11, editable.length(), 0), 33);
        editable.setSpan(metricAffectingSpan, Utilities.j(j10, editable.length(), 0), Utilities.j(j11, editable.length(), 0), 33);
        editable.insert(Utilities.j(j11, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.j(j11, editable.length(), 0), Utilities.j(i12, editable.length(), 0));
        return i12;
    }

    public static java.util.ArrayList d(org.telegram.ui.Components.qt r19, android.text.Layout r20, java.util.ArrayList r21, boolean[] r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xh0.d(org.telegram.ui.Components.qt, android.text.Layout, java.util.ArrayList, boolean[]):java.util.ArrayList");
    }

    public static ArrayList e(Layout layout, ArrayList arrayList) {
        xh0[] xh0VarArr;
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
                for (xh0 xh0Var : (xh0[]) spanned.getSpans(0, spanned.length(), xh0.class)) {
                    boolean z10 = xh0Var.f32563n;
                    th0 th0Var = new th0(null, layout, spanned, xh0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th0Var);
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
        if (this.f32560b) {
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
