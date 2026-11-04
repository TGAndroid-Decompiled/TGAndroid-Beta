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
public final class xg0 implements LeadingMarginSpan {
    public final float[] E;
    public final Path F;
    public final Paint G;
    public final float[] H;
    public final Path I;
    public int J;
    public e0.g K;
    public SpannableString L;
    public final boolean f40354a;
    public boolean f40355b = true;
    public int f40356c;
    public int d;
    public boolean f40357e;
    public boolean f40358f;
    public boolean h;
    public boolean f40359n;
    public boolean f40360r;
    public final wg0 f40361s;
    public mi.x5 f40362w;
    public final Drawable f40363x;
    public final Paint f40364y;

    public xg0(boolean z10, boolean z11, wg0 wg0Var) {
        Paint paint = new Paint(1);
        this.f40364y = paint;
        this.E = new float[8];
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new float[8];
        this.I = new Path();
        this.J = -1;
        this.f40354a = z10;
        this.f40361s = wg0Var;
        this.f40357e = z11;
        this.f40363x = k2.p1.g(org.telegram.messenger.t0.f25457b, 2131231966);
        paint2.setColor(this.J);
        paint.setColor(i0.a.o(this.J, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        int i3;
        int i10;
        int i11;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        wg0[] wg0VarArr = (wg0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), wg0.class);
        int i12 = 0;
        while (true) {
            int i13 = 1;
            if (i12 >= wg0VarArr.length) {
                break;
            }
            wg0 wg0Var = wg0VarArr[i12];
            int spanStart = spannableStringBuilder.getSpanStart(wg0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(wg0Var);
            treeSet.add(Integer.valueOf(spanStart));
            Integer valueOf = Integer.valueOf(spanStart);
            if (hashMap.containsKey(Integer.valueOf(spanStart))) {
                i10 = ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue();
            } else {
                i10 = 0;
            }
            if (wg0Var.f40007a.f40357e) {
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
            spannableStringBuilder.removeSpan(wg0Var);
            spannableStringBuilder.removeSpan(wg0Var.f40007a);
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
                    i3 = intValue - 1;
                } else {
                    i3 = intValue;
                }
                if (i15 > 0) {
                    c(spannableStringBuilder, i14, i3, z10);
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

    public static void b(Spannable spannable, int i3, int i10, boolean z10) {
        xg0[] xg0VarArr = (xg0[]) spannable.getSpans(i3, i10, xg0.class);
        if (xg0VarArr != null && xg0VarArr.length > 0) {
            return;
        }
        int j10 = Utilities.j(i3, spannable.length(), 0);
        int j11 = Utilities.j(i10, spannable.length(), 0);
        ?? metricAffectingSpan = new MetricAffectingSpan();
        xg0 xg0Var = new xg0(false, z10, metricAffectingSpan);
        metricAffectingSpan.f40007a = xg0Var;
        xg0Var.f40356c = j10;
        xg0Var.d = j11;
        spannable.setSpan(metricAffectingSpan, j10, j11, 33);
        spannable.setSpan(xg0Var, j10, j11, 33);
    }

    public static int c(Editable editable, int i3, int i10, boolean z10) {
        if (editable == 0) {
            return -1;
        }
        int j10 = Utilities.j(i3, editable.length(), 0);
        int j11 = Utilities.j(i10, editable.length(), 0);
        if (j10 > 0 && editable.charAt(j10 - 1) != '\n') {
            editable.insert(j10, "\n");
            j10++;
            j11++;
        }
        int i11 = j11 + 1;
        if (j11 >= editable.length() || editable.charAt(j11) != '\n') {
            editable.insert(j11, "\n");
        }
        ?? metricAffectingSpan = new MetricAffectingSpan();
        xg0 xg0Var = new xg0(true, z10, metricAffectingSpan);
        metricAffectingSpan.f40007a = xg0Var;
        xg0Var.f40356c = j10;
        xg0Var.d = j11;
        editable.setSpan(xg0Var, Utilities.j(j10, editable.length(), 0), Utilities.j(j11, editable.length(), 0), 33);
        editable.setSpan(metricAffectingSpan, Utilities.j(j10, editable.length(), 0), Utilities.j(j11, editable.length(), 0), 33);
        editable.insert(Utilities.j(j11, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.j(j11, editable.length(), 0), Utilities.j(i11, editable.length(), 0));
        return i11;
    }

    public static java.util.ArrayList d(org.telegram.ui.Components.bt r19, android.text.Layout r20, java.util.ArrayList r21, boolean[] r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xg0.d(org.telegram.ui.Components.bt, android.text.Layout, java.util.ArrayList, boolean[]):java.util.ArrayList");
    }

    public static ArrayList e(Layout layout, ArrayList arrayList) {
        xg0[] xg0VarArr;
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
                for (xg0 xg0Var : (xg0[]) spanned.getSpans(0, spanned.length(), xg0.class)) {
                    boolean z10 = xg0Var.f40359n;
                    tg0 tg0Var = new tg0(null, layout, spanned, xg0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(tg0Var);
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
        if (this.f40355b) {
            f10 = 8.0f;
        } else {
            f10 = 10.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    @Override
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i3, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z10, Layout layout) {
    }
}
