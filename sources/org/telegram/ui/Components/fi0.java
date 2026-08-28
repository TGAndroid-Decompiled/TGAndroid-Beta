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
public final class fi0 implements LeadingMarginSpan {
    public final Path A;
    public final Paint B;
    public final float[] C;
    public final Path D;
    public int E;
    public xh0 F;
    public SpannableString G;
    public final boolean f28436a;
    public boolean f28437b = true;
    public int f28438c;
    public int d;
    public boolean f28439e;
    public boolean f28440f;
    public boolean h;
    public boolean f28441n;
    public boolean f28442r;
    public final ei0 f28443s;
    public ba0 v;
    public final Drawable f28444w;
    public final Paint f28445x;
    public final float[] f28446y;

    public fi0(boolean z10, boolean z11, ei0 ei0Var) {
        Paint paint = new Paint(1);
        this.f28445x = paint;
        this.f28446y = new float[8];
        this.A = new Path();
        Paint paint2 = new Paint(1);
        this.B = paint2;
        this.C = new float[8];
        this.D = new Path();
        this.E = -1;
        this.f28436a = z10;
        this.f28443s = ei0Var;
        this.f28439e = z11;
        this.f28444w = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.mini_quote).mutate();
        paint2.setColor(this.E);
        paint.setColor(i0.a.k(this.E, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        boolean z10;
        int i9;
        int i10;
        int i11;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        ei0[] ei0VarArr = (ei0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ei0.class);
        int i12 = 0;
        while (true) {
            int i13 = 1;
            if (i12 >= ei0VarArr.length) {
                break;
            }
            ei0 ei0Var = ei0VarArr[i12];
            int spanStart = spannableStringBuilder.getSpanStart(ei0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(ei0Var);
            treeSet.add(Integer.valueOf(spanStart));
            Integer valueOf = Integer.valueOf(spanStart);
            if (hashMap.containsKey(Integer.valueOf(spanStart))) {
                i10 = ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue();
            } else {
                i10 = 0;
            }
            if (ei0Var.f28034a.f28439e) {
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
            spannableStringBuilder.removeSpan(ei0Var);
            spannableStringBuilder.removeSpan(ei0Var.f28034a);
            i12++;
        }
        Iterator it = treeSet.iterator();
        int i14 = 0;
        int i15 = 0;
        loop1: while (true) {
            z10 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i14 != intValue) {
                    int i16 = intValue - 1;
                    if (i16 >= 0 && i16 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i16) == '\n') {
                        i9 = intValue - 1;
                    } else {
                        i9 = intValue;
                    }
                    if (i15 > 0) {
                        c(spannableStringBuilder, i14, i9, z10);
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
                    z10 = (intValue2 & 16) != 0 ? true : true;
                }
            }
        }
        if (i14 < spannableStringBuilder.length() && i15 > 0) {
            c(spannableStringBuilder, i14, spannableStringBuilder.length(), z10);
        }
    }

    public static void b(Spannable spannable, int i9, int i10, boolean z10) {
        fi0[] fi0VarArr = (fi0[]) spannable.getSpans(i9, i10, fi0.class);
        if (fi0VarArr != null && fi0VarArr.length > 0) {
            return;
        }
        int clamp = Utilities.clamp(i9, spannable.length(), 0);
        int clamp2 = Utilities.clamp(i10, spannable.length(), 0);
        ?? metricAffectingSpan = new MetricAffectingSpan();
        fi0 fi0Var = new fi0(false, z10, metricAffectingSpan);
        metricAffectingSpan.f28034a = fi0Var;
        fi0Var.f28438c = clamp;
        fi0Var.d = clamp2;
        spannable.setSpan(metricAffectingSpan, clamp, clamp2, 33);
        spannable.setSpan(fi0Var, clamp, clamp2, 33);
    }

    public static int c(Editable editable, int i9, int i10, boolean z10) {
        if (editable == 0) {
            return -1;
        }
        int clamp = Utilities.clamp(i9, editable.length(), 0);
        int clamp2 = Utilities.clamp(i10, editable.length(), 0);
        if (clamp > 0 && editable.charAt(clamp - 1) != '\n') {
            editable.insert(clamp, "\n");
            clamp++;
            clamp2++;
        }
        int i11 = clamp2 + 1;
        if (clamp2 >= editable.length() || editable.charAt(clamp2) != '\n') {
            editable.insert(clamp2, "\n");
        }
        ?? metricAffectingSpan = new MetricAffectingSpan();
        fi0 fi0Var = new fi0(true, z10, metricAffectingSpan);
        metricAffectingSpan.f28034a = fi0Var;
        fi0Var.f28438c = clamp;
        fi0Var.d = clamp2;
        editable.setSpan(fi0Var, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.setSpan(metricAffectingSpan, Utilities.clamp(clamp, editable.length(), 0), Utilities.clamp(clamp2, editable.length(), 0), 33);
        editable.insert(Utilities.clamp(clamp2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.clamp(clamp2, editable.length(), 0), Utilities.clamp(i11, editable.length(), 0));
        return i11;
    }

    public static java.util.ArrayList d(org.telegram.ui.Components.ot r19, android.text.Layout r20, java.util.ArrayList r21, boolean[] r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fi0.d(org.telegram.ui.Components.ot, android.text.Layout, java.util.ArrayList, boolean[]):java.util.ArrayList");
    }

    public static ArrayList e(Layout layout, ArrayList arrayList) {
        fi0[] fi0VarArr;
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
                for (fi0 fi0Var : (fi0[]) spanned.getSpans(0, spanned.length(), fi0.class)) {
                    boolean z10 = fi0Var.f28441n;
                    bi0 bi0Var = new bi0(null, layout, spanned, fi0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bi0Var);
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
        if (this.f28437b) {
            f10 = 8.0f;
        } else {
            f10 = 10.0f;
        }
        return AndroidUtilities.dp(f10);
    }

    @Override
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i9, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z10, Layout layout) {
    }
}
