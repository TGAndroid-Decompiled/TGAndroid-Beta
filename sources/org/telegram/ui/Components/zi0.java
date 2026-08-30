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
public final class zi0 implements LeadingMarginSpan {
    public final Path B;
    public final Paint C;
    public final float[] D;
    public final Path E;
    public int F;
    public ri0 G;
    public SpannableString H;
    public final boolean f31352a;
    public boolean f31353b = true;
    public int f31354c;
    public int d;
    public boolean e;
    public boolean f31355f;
    public boolean h;
    public boolean f31356n;
    public boolean f31357r;
    public final yi0 f31358s;
    public ua0 v;
    public final Drawable f31359w;
    public final Paint f31360x;
    public final float[] f31361y;

    public zi0(boolean z4, boolean z10, yi0 yi0Var) {
        Paint paint = new Paint(1);
        this.f31360x = paint;
        this.f31361y = new float[8];
        this.B = new Path();
        Paint paint2 = new Paint(1);
        this.C = paint2;
        this.D = new float[8];
        this.E = new Path();
        this.F = -1;
        this.f31352a = z4;
        this.f31358s = yi0Var;
        this.e = z10;
        this.f31359w = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.mini_quote).mutate();
        paint2.setColor(this.F);
        paint.setColor(i0.a.k(this.F, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        boolean z4;
        int i10;
        int i11;
        int i12;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        yi0[] yi0VarArr = (yi0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), yi0.class);
        int i13 = 0;
        while (true) {
            int i14 = 1;
            if (i13 >= yi0VarArr.length) {
                break;
            }
            yi0 yi0Var = yi0VarArr[i13];
            int spanStart = spannableStringBuilder.getSpanStart(yi0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(yi0Var);
            treeSet.add(Integer.valueOf(spanStart));
            Integer valueOf = Integer.valueOf(spanStart);
            if (hashMap.containsKey(Integer.valueOf(spanStart))) {
                i11 = ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue();
            } else {
                i11 = 0;
            }
            if (yi0Var.f31025a.e) {
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
            spannableStringBuilder.removeSpan(yi0Var);
            spannableStringBuilder.removeSpan(yi0Var.f31025a);
            i13++;
        }
        Iterator it = treeSet.iterator();
        int i15 = 0;
        int i16 = 0;
        loop1: while (true) {
            z4 = false;
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
                        c(spannableStringBuilder, i15, i10, z4);
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
                    z4 = (intValue2 & 16) != 0 ? true : true;
                }
            }
        }
        if (i15 < spannableStringBuilder.length() && i16 > 0) {
            c(spannableStringBuilder, i15, spannableStringBuilder.length(), z4);
        }
    }

    public static void b(Spannable spannable, int i10, int i11, boolean z4) {
        zi0[] zi0VarArr = (zi0[]) spannable.getSpans(i10, i11, zi0.class);
        if (zi0VarArr != null && zi0VarArr.length > 0) {
            return;
        }
        int clamp = Utilities.clamp(i10, spannable.length(), 0);
        int clamp2 = Utilities.clamp(i11, spannable.length(), 0);
        ?? metricAffectingSpan = new MetricAffectingSpan();
        zi0 zi0Var = new zi0(false, z4, metricAffectingSpan);
        metricAffectingSpan.f31025a = zi0Var;
        zi0Var.f31354c = clamp;
        zi0Var.d = clamp2;
        spannable.setSpan(metricAffectingSpan, clamp, clamp2, 33);
        spannable.setSpan(zi0Var, clamp, clamp2, 33);
    }

    public static int c(Editable editable, int i10, int i11, boolean z4) {
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
        zi0 zi0Var = new zi0(true, z4, metricAffectingSpan);
        metricAffectingSpan.f31025a = zi0Var;
        zi0Var.f31354c = clamp;
        zi0Var.d = clamp2;
        editable.setSpan(zi0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.setSpan(metricAffectingSpan, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.insert(Utilities.clamp(clamp2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.clamp(clamp2, editable.length(), 0), Utilities.clamp(i12, editable.length(), 0));
        return i12;
    }

    public static java.util.ArrayList d(org.telegram.ui.Components.xt r19, android.text.Layout r20, java.util.ArrayList r21, boolean[] r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zi0.d(org.telegram.ui.Components.xt, android.text.Layout, java.util.ArrayList, boolean[]):java.util.ArrayList");
    }

    public static ArrayList e(Layout layout, ArrayList arrayList) {
        zi0[] zi0VarArr;
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
                for (zi0 zi0Var : (zi0[]) spanned.getSpans(0, spanned.length(), zi0.class)) {
                    boolean z4 = zi0Var.f31356n;
                    vi0 vi0Var = new vi0(null, layout, spanned, zi0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(vi0Var);
                }
                return arrayList;
            } else if (arrayList != null) {
                arrayList.clear();
            }
        }
        return arrayList;
    }

    @Override
    public final int getLeadingMargin(boolean z4) {
        float f10;
        if (this.f31353b) {
            f10 = 8.0f;
        } else {
            f10 = 10.0f;
        }
        return AndroidUtilities.dp(f10);
    }

    @Override
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z4, Layout layout) {
    }
}
