package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class o3 {
    public TextPaint f50423a;
    public final SparseArray f50424b = new SparseArray();
    public final SparseArray f50425c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f50426e = new SparseArray();
    public final SparseArray f50427f = new SparseArray();
    public final SparseArray f50428g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f50429i = new SparseArray();
    public final SparseArray f50430j = new SparseArray();
    public final SparseArray f50431k = new SparseArray();
    public final SparseArray f50432l = new SparseArray();
    public final SparseArray f50433m = new SparseArray();
    public final SparseArray f50434n = new SparseArray();
    public final SparseArray f50435o = new SparseArray();
    public final SparseArray f50436p = new SparseArray();
    public final SparseArray f50437q = new SparseArray();
    public final SparseArray f50438r = new SparseArray();
    public final SparseArray f50439s = new SparseArray();
    public final SparseArray f50440t = new SparseArray();
    public final SparseArray f50441u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f50442w = new SparseArray();
    public final SparseArray f50443x = new SparseArray();
    public final SparseArray f50444y = new SparseArray();
    public final SparseArray f50445z = new SparseArray();
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
