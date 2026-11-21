package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class o3 {
    public TextPaint f50419a;
    public final SparseArray f50420b = new SparseArray();
    public final SparseArray f50421c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f50422e = new SparseArray();
    public final SparseArray f50423f = new SparseArray();
    public final SparseArray f50424g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f50425i = new SparseArray();
    public final SparseArray f50426j = new SparseArray();
    public final SparseArray f50427k = new SparseArray();
    public final SparseArray f50428l = new SparseArray();
    public final SparseArray f50429m = new SparseArray();
    public final SparseArray f50430n = new SparseArray();
    public final SparseArray f50431o = new SparseArray();
    public final SparseArray f50432p = new SparseArray();
    public final SparseArray f50433q = new SparseArray();
    public final SparseArray f50434r = new SparseArray();
    public final SparseArray f50435s = new SparseArray();
    public final SparseArray f50436t = new SparseArray();
    public final SparseArray f50437u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f50438w = new SparseArray();
    public final SparseArray f50439x = new SparseArray();
    public final SparseArray f50440y = new SparseArray();
    public final SparseArray f50441z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(p50 p50Var, SparseArray sparseArray) {
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            int keyAt = sparseArray.keyAt(i7);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i7);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.J6, false));
                }
            }
        }
    }

    public static void b(int i7, TextPaint textPaint, Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4) {
        int i10 = i7 & 1;
        if (i10 != 0 && (i7 & 2) != 0) {
            textPaint.setTypeface(typeface2);
        } else if (i10 != 0) {
            textPaint.setTypeface(typeface3);
        } else if ((i7 & 2) != 0) {
            textPaint.setTypeface(typeface4);
        } else if ((i7 & 4) != 0) {
        } else {
            textPaint.setTypeface(typeface);
        }
    }
}
