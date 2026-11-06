package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class o3 {
    public TextPaint f48196a;
    public final SparseArray f48197b = new SparseArray();
    public final SparseArray f48198c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f48199e = new SparseArray();
    public final SparseArray f48200f = new SparseArray();
    public final SparseArray f48201g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f48202i = new SparseArray();
    public final SparseArray f48203j = new SparseArray();
    public final SparseArray f48204k = new SparseArray();
    public final SparseArray f48205l = new SparseArray();
    public final SparseArray f48206m = new SparseArray();
    public final SparseArray f48207n = new SparseArray();
    public final SparseArray f48208o = new SparseArray();
    public final SparseArray f48209p = new SparseArray();
    public final SparseArray f48210q = new SparseArray();
    public final SparseArray f48211r = new SparseArray();
    public final SparseArray f48212s = new SparseArray();
    public final SparseArray f48213t = new SparseArray();
    public final SparseArray f48214u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f48215w = new SparseArray();
    public final SparseArray f48216x = new SparseArray();
    public final SparseArray f48217y = new SparseArray();
    public final SparseArray f48218z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(o50 o50Var, SparseArray sparseArray) {
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            int keyAt = sparseArray.keyAt(i7);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i7);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
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
