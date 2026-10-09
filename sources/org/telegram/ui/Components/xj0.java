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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class xj0 implements LeadingMarginSpan {
    public final Path E;
    public final Paint F;
    public final float[] G;
    public final Path H;
    public int I;
    public pj0 J;
    public SpannableString K;
    public final boolean f32888a;
    public boolean f32889b = true;
    public int f32890c;
    public int d;
    public boolean f32891e;
    public boolean f32892f;
    public boolean h;
    public boolean f32893n;
    public boolean f32894r;
    public final wj0 f32895s;
    public ii.b6 v;
    public final Drawable f32896w;
    public final Paint f32897x;
    public final float[] f32898y;

    public xj0(boolean z10, boolean z11, wj0 wj0Var) {
        Paint paint = new Paint(1);
        this.f32897x = paint;
        this.f32898y = new float[8];
        this.E = new Path();
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new float[8];
        this.H = new Path();
        this.I = -1;
        this.f32888a = z10;
        this.f32895s = wj0Var;
        this.f32891e = z11;
        this.f32896w = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.mini_quote).mutate();
        paint2.setColor(this.I);
        paint.setColor(i0.a.k(this.I, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        int i10;
        int i11;
        int i12;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        wj0[] wj0VarArr = (wj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), wj0.class);
        int i13 = 0;
        while (true) {
            int i14 = 1;
            if (i13 >= wj0VarArr.length) {
                break;
            }
            wj0 wj0Var = wj0VarArr[i13];
            int spanStart = spannableStringBuilder.getSpanStart(wj0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(wj0Var);
            treeSet.add(Integer.valueOf(spanStart));
            Integer valueOf = Integer.valueOf(spanStart);
            if (hashMap.containsKey(Integer.valueOf(spanStart))) {
                i11 = ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue();
            } else {
                i11 = 0;
            }
            if (wj0Var.f32625a.f32891e) {
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
            spannableStringBuilder.removeSpan(wj0Var);
            spannableStringBuilder.removeSpan(wj0Var.f32625a);
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
        xj0[] xj0VarArr = (xj0[]) spannable.getSpans(i10, i11, xj0.class);
        if (xj0VarArr != null && xj0VarArr.length > 0) {
            return;
        }
        int clamp = Utilities.clamp(i10, spannable.length(), 0);
        int clamp2 = Utilities.clamp(i11, spannable.length(), 0);
        ?? metricAffectingSpan = new MetricAffectingSpan();
        xj0 xj0Var = new xj0(false, z10, metricAffectingSpan);
        metricAffectingSpan.f32625a = xj0Var;
        xj0Var.f32890c = clamp;
        xj0Var.d = clamp2;
        spannable.setSpan(metricAffectingSpan, clamp, clamp2, 33);
        spannable.setSpan(xj0Var, clamp, clamp2, 33);
    }

    public static int c(Editable editable, int i10, int i11, boolean z10) {
        if (editable == 0) {
            return -1;
        }
        int clamp = Utilities.clamp(i10, editable.length(), 0);
        int clamp2 = Utilities.clamp(i11, editable.length(), 0);
        if (clamp > 0 && editable.charAt(clamp - 1) != '\n') {
            editable.insert(clamp, "\n");
            clamp++;
            clamp2++;
        }
        int i12 = clamp2 + 1;
        if (clamp2 >= editable.length() || editable.charAt(clamp2) != '\n') {
            editable.insert(clamp2, "\n");
        }
        ?? metricAffectingSpan = new MetricAffectingSpan();
        xj0 xj0Var = new xj0(true, z10, metricAffectingSpan);
        metricAffectingSpan.f32625a = xj0Var;
        xj0Var.f32890c = clamp;
        xj0Var.d = clamp2;
        editable.setSpan(xj0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.setSpan(metricAffectingSpan, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.insert(Utilities.clamp(clamp2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.clamp(clamp2, editable.length(), 0), Utilities.clamp(i12, editable.length(), 0));
        return i12;
    }

    public static java.util.ArrayList d(org.telegram.ui.Components.tu r19, android.text.Layout r20, java.util.ArrayList r21, boolean[] r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xj0.d(org.telegram.ui.Components.tu, android.text.Layout, java.util.ArrayList, boolean[]):java.util.ArrayList");
    }

    public static ArrayList e(Layout layout, ArrayList arrayList) {
        xj0[] xj0VarArr;
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
                for (xj0 xj0Var : (xj0[]) spanned.getSpans(0, spanned.length(), xj0.class)) {
                    boolean z10 = xj0Var.f32893n;
                    tj0 tj0Var = new tj0(null, layout, spanned, xj0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(tj0Var);
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
        if (this.f32889b) {
            f7 = 8.0f;
        } else {
            f7 = 10.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    @Override
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
    }
}
