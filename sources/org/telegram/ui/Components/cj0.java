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
public final class cj0 implements LeadingMarginSpan {
    public final Path E;
    public final Paint F;
    public final float[] G;
    public final Path H;
    public int I;
    public ui0 J;
    public SpannableString K;
    public final boolean f22139a;
    public boolean f22140b = true;
    public int f22141c;
    public int d;
    public boolean e;
    public boolean f22142f;
    public boolean h;
    public boolean f22143n;
    public boolean f22144r;
    public final bj0 f22145s;
    public hi.c6 v;
    public final Drawable f22146w;
    public final Paint f22147x;
    public final float[] f22148y;

    public cj0(boolean z10, boolean z11, bj0 bj0Var) {
        Paint paint = new Paint(1);
        this.f22147x = paint;
        this.f22148y = new float[8];
        this.E = new Path();
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new float[8];
        this.H = new Path();
        this.I = -1;
        this.f22139a = z10;
        this.f22145s = bj0Var;
        this.e = z11;
        this.f22146w = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.mini_quote).mutate();
        paint2.setColor(this.I);
        paint.setColor(i0.a.k(this.I, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        bj0[] bj0VarArr = (bj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), bj0.class);
        int i13 = 0;
        while (true) {
            int i14 = 1;
            if (i13 >= bj0VarArr.length) {
                break;
            }
            bj0 bj0Var = bj0VarArr[i13];
            int spanStart = spannableStringBuilder.getSpanStart(bj0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(bj0Var);
            treeSet.add(Integer.valueOf(spanStart));
            Integer valueOf = Integer.valueOf(spanStart);
            if (hashMap.containsKey(Integer.valueOf(spanStart))) {
                i11 = ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue();
            } else {
                i11 = 0;
            }
            if (bj0Var.f21842a.e) {
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
            spannableStringBuilder.removeSpan(bj0Var);
            spannableStringBuilder.removeSpan(bj0Var.f21842a);
            i13++;
        }
        Iterator it = treeSet.iterator();
        int i15 = 0;
        int i16 = 0;
        loop1: while (true) {
            z10 = false;
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
                    z10 = (intValue2 & 16) != 0 ? true : true;
                }
            }
        }
        if (i15 < spannableStringBuilder.length() && i16 > 0) {
            c(spannableStringBuilder, i15, spannableStringBuilder.length(), z10);
        }
    }

    public static void b(Spannable spannable, int i10, int i11, boolean z10) {
        cj0[] cj0VarArr = (cj0[]) spannable.getSpans(i10, i11, cj0.class);
        if (cj0VarArr != null && cj0VarArr.length > 0) {
            return;
        }
        int clamp = Utilities.clamp(i10, spannable.length(), 0);
        int clamp2 = Utilities.clamp(i11, spannable.length(), 0);
        ?? metricAffectingSpan = new MetricAffectingSpan();
        cj0 cj0Var = new cj0(false, z10, metricAffectingSpan);
        metricAffectingSpan.f21842a = cj0Var;
        cj0Var.f22141c = clamp;
        cj0Var.d = clamp2;
        spannable.setSpan(metricAffectingSpan, clamp, clamp2, 33);
        spannable.setSpan(cj0Var, clamp, clamp2, 33);
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
        cj0 cj0Var = new cj0(true, z10, metricAffectingSpan);
        metricAffectingSpan.f21842a = cj0Var;
        cj0Var.f22141c = clamp;
        cj0Var.d = clamp2;
        editable.setSpan(cj0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.setSpan(metricAffectingSpan, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.insert(Utilities.clamp(clamp2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.clamp(clamp2, editable.length(), 0), Utilities.clamp(i12, editable.length(), 0));
        return i12;
    }

    public static java.util.ArrayList d(org.telegram.ui.Components.hu r19, android.text.Layout r20, java.util.ArrayList r21, boolean[] r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cj0.d(org.telegram.ui.Components.hu, android.text.Layout, java.util.ArrayList, boolean[]):java.util.ArrayList");
    }

    public static ArrayList e(Layout layout, ArrayList arrayList) {
        cj0[] cj0VarArr;
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
                for (cj0 cj0Var : (cj0[]) spanned.getSpans(0, spanned.length(), cj0.class)) {
                    boolean z10 = cj0Var.f22143n;
                    yi0 yi0Var = new yi0(null, layout, spanned, cj0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(yi0Var);
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
        if (this.f22140b) {
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
