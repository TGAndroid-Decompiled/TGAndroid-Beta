package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class o3 {
    public TextPaint f50414a;
    public final SparseArray f50415b = new SparseArray();
    public final SparseArray f50416c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f50417e = new SparseArray();
    public final SparseArray f50418f = new SparseArray();
    public final SparseArray f50419g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f50420i = new SparseArray();
    public final SparseArray f50421j = new SparseArray();
    public final SparseArray f50422k = new SparseArray();
    public final SparseArray f50423l = new SparseArray();
    public final SparseArray f50424m = new SparseArray();
    public final SparseArray f50425n = new SparseArray();
    public final SparseArray f50426o = new SparseArray();
    public final SparseArray f50427p = new SparseArray();
    public final SparseArray f50428q = new SparseArray();
    public final SparseArray f50429r = new SparseArray();
    public final SparseArray f50430s = new SparseArray();
    public final SparseArray f50431t = new SparseArray();
    public final SparseArray f50432u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f50433w = new SparseArray();
    public final SparseArray f50434x = new SparseArray();
    public final SparseArray f50435y = new SparseArray();
    public final SparseArray f50436z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(p50 p50Var, SparseArray sparseArray) {
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            int keyAt = sparseArray.keyAt(i7);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i7);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.J6, false));
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
