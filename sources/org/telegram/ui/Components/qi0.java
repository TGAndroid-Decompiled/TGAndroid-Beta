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
public final class qi0 implements LeadingMarginSpan {
    public final Path A;
    public final Paint B;
    public final float[] C;
    public final Path D;
    public int E;
    public hi0 F;
    public SpannableString G;
    public final boolean f31956a;
    public boolean f31957b = true;
    public int f31958c;
    public int d;
    public boolean f31959e;
    public boolean f31960f;
    public boolean h;
    public boolean f31961n;
    public boolean f31962r;
    public final pi0 f31963s;
    public pa0 v;
    public final Drawable f31964w;
    public final Paint f31965x;
    public final float[] f31966y;

    public qi0(boolean z10, boolean z11, pi0 pi0Var) {
        Paint paint = new Paint(1);
        this.f31965x = paint;
        this.f31966y = new float[8];
        this.A = new Path();
        Paint paint2 = new Paint(1);
        this.B = paint2;
        this.C = new float[8];
        this.D = new Path();
        this.E = -1;
        this.f31956a = z10;
        this.f31963s = pi0Var;
        this.f31959e = z11;
        this.f31964w = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.mini_quote).mutate();
        paint2.setColor(this.E);
        paint.setColor(i0.a.k(this.E, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        pi0[] pi0VarArr = (pi0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), pi0.class);
        int i13 = 0;
        while (true) {
            int i14 = 1;
            if (i13 >= pi0VarArr.length) {
                break;
            }
            pi0 pi0Var = pi0VarArr[i13];
            int spanStart = spannableStringBuilder.getSpanStart(pi0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(pi0Var);
            treeSet.add(Integer.valueOf(spanStart));
            Integer valueOf = Integer.valueOf(spanStart);
            if (hashMap.containsKey(Integer.valueOf(spanStart))) {
                i11 = ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue();
            } else {
                i11 = 0;
            }
            if (pi0Var.f31683a.f31959e) {
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
            spannableStringBuilder.removeSpan(pi0Var);
            spannableStringBuilder.removeSpan(pi0Var.f31683a);
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
        qi0[] qi0VarArr = (qi0[]) spannable.getSpans(i10, i11, qi0.class);
        if (qi0VarArr != null && qi0VarArr.length > 0) {
            return;
        }
        int clamp = Utilities.clamp(i10, spannable.length(), 0);
        int clamp2 = Utilities.clamp(i11, spannable.length(), 0);
        ?? metricAffectingSpan = new MetricAffectingSpan();
        qi0 qi0Var = new qi0(false, z10, metricAffectingSpan);
        metricAffectingSpan.f31683a = qi0Var;
        qi0Var.f31958c = clamp;
        qi0Var.d = clamp2;
        spannable.setSpan(metricAffectingSpan, clamp, clamp2, 33);
        spannable.setSpan(qi0Var, clamp, clamp2, 33);
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
        qi0 qi0Var = new qi0(true, z10, metricAffectingSpan);
        metricAffectingSpan.f31683a = qi0Var;
        qi0Var.f31958c = clamp;
        qi0Var.d = clamp2;
        editable.setSpan(qi0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.setSpan(metricAffectingSpan, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.insert(Utilities.clamp(clamp2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.clamp(clamp2, editable.length(), 0), Utilities.clamp(i12, editable.length(), 0));
        return i12;
    }

    public static java.util.ArrayList d(org.telegram.ui.Components.ut r19, android.text.Layout r20, java.util.ArrayList r21, boolean[] r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qi0.d(org.telegram.ui.Components.ut, android.text.Layout, java.util.ArrayList, boolean[]):java.util.ArrayList");
    }

    public static ArrayList e(Layout layout, ArrayList arrayList) {
        qi0[] qi0VarArr;
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
                for (qi0 qi0Var : (qi0[]) spanned.getSpans(0, spanned.length(), qi0.class)) {
                    boolean z10 = qi0Var.f31961n;
                    mi0 mi0Var = new mi0(null, layout, spanned, qi0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(mi0Var);
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
        float f9;
        if (this.f31957b) {
            f9 = 8.0f;
        } else {
            f9 = 10.0f;
        }
        return AndroidUtilities.dp(f9);
    }

    @Override
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
    }
}
