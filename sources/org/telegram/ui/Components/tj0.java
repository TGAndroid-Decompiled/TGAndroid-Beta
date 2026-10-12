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
public final class tj0 implements LeadingMarginSpan {
    public final Path E;
    public final Paint F;
    public final float[] G;
    public final Path H;
    public int I;
    public lj0 J;
    public SpannableString K;
    public final boolean f29400a;
    public boolean f29401b = true;
    public int f29402c;
    public int d;
    public boolean e;
    public boolean f29403f;
    public boolean h;
    public boolean f29404n;
    public boolean f29405r;
    public final sj0 f29406s;
    public ji.e6 v;
    public final Drawable f29407w;
    public final Paint f29408x;
    public final float[] f29409y;

    public tj0(boolean z10, boolean z11, sj0 sj0Var) {
        Paint paint = new Paint(1);
        this.f29408x = paint;
        this.f29409y = new float[8];
        this.E = new Path();
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new float[8];
        this.H = new Path();
        this.I = -1;
        this.f29400a = z10;
        this.f29406s = sj0Var;
        this.e = z11;
        this.f29407w = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.mini_quote).mutate();
        paint2.setColor(this.I);
        paint.setColor(i0.a.k(this.I, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        int i10;
        int i11;
        int i12;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        sj0[] sj0VarArr = (sj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), sj0.class);
        int i13 = 0;
        while (true) {
            int i14 = 1;
            if (i13 >= sj0VarArr.length) {
                break;
            }
            sj0 sj0Var = sj0VarArr[i13];
            int spanStart = spannableStringBuilder.getSpanStart(sj0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(sj0Var);
            treeSet.add(Integer.valueOf(spanStart));
            Integer valueOf = Integer.valueOf(spanStart);
            if (hashMap.containsKey(Integer.valueOf(spanStart))) {
                i11 = ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue();
            } else {
                i11 = 0;
            }
            if (sj0Var.f29146a.e) {
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
            spannableStringBuilder.removeSpan(sj0Var);
            spannableStringBuilder.removeSpan(sj0Var.f29146a);
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
        tj0[] tj0VarArr = (tj0[]) spannable.getSpans(i10, i11, tj0.class);
        if (tj0VarArr != null && tj0VarArr.length > 0) {
            return;
        }
        int clamp = Utilities.clamp(i10, spannable.length(), 0);
        int clamp2 = Utilities.clamp(i11, spannable.length(), 0);
        ?? metricAffectingSpan = new MetricAffectingSpan();
        tj0 tj0Var = new tj0(false, z10, metricAffectingSpan);
        metricAffectingSpan.f29146a = tj0Var;
        tj0Var.f29402c = clamp;
        tj0Var.d = clamp2;
        spannable.setSpan(metricAffectingSpan, clamp, clamp2, 33);
        spannable.setSpan(tj0Var, clamp, clamp2, 33);
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
        tj0 tj0Var = new tj0(true, z10, metricAffectingSpan);
        metricAffectingSpan.f29146a = tj0Var;
        tj0Var.f29402c = clamp;
        tj0Var.d = clamp2;
        editable.setSpan(tj0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.setSpan(metricAffectingSpan, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.insert(Utilities.clamp(clamp2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.clamp(clamp2, editable.length(), 0), Utilities.clamp(i12, editable.length(), 0));
        return i12;
    }

    public static java.util.ArrayList d(org.telegram.ui.Components.pu r19, android.text.Layout r20, java.util.ArrayList r21, boolean[] r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tj0.d(org.telegram.ui.Components.pu, android.text.Layout, java.util.ArrayList, boolean[]):java.util.ArrayList");
    }

    public static ArrayList e(Layout layout, ArrayList arrayList) {
        tj0[] tj0VarArr;
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
                for (tj0 tj0Var : (tj0[]) spanned.getSpans(0, spanned.length(), tj0.class)) {
                    boolean z10 = tj0Var.f29404n;
                    pj0 pj0Var = new pj0(null, layout, spanned, tj0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(pj0Var);
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
        if (this.f29401b) {
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
