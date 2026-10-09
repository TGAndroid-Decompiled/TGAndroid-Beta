package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class q3 {
    public TextPaint f40971a;
    public final SparseArray f40972b = new SparseArray();
    public final SparseArray f40973c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f40974e = new SparseArray();
    public final SparseArray f40975f = new SparseArray();
    public final SparseArray f40976g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f40977i = new SparseArray();
    public final SparseArray f40978j = new SparseArray();
    public final SparseArray f40979k = new SparseArray();
    public final SparseArray f40980l = new SparseArray();
    public final SparseArray f40981m = new SparseArray();
    public final SparseArray f40982n = new SparseArray();
    public final SparseArray f40983o = new SparseArray();
    public final SparseArray f40984p = new SparseArray();
    public final SparseArray f40985q = new SparseArray();
    public final SparseArray f40986r = new SparseArray();
    public final SparseArray f40987s = new SparseArray();
    public final SparseArray f40988t = new SparseArray();
    public final SparseArray f40989u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f40990w = new SparseArray();
    public final SparseArray f40991x = new SparseArray();
    public final SparseArray f40992y = new SparseArray();
    public final SparseArray f40993z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(i4 i4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(i4Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.J6, false));
                }
            }
        }
    }

    public static void b(int i10, TextPaint textPaint, Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4) {
        int i11 = i10 & 1;
        if (i11 != 0 && (i10 & 2) != 0) {
            textPaint.setTypeface(typeface2);
        } else if (i11 != 0) {
            textPaint.setTypeface(typeface3);
        } else if ((i10 & 2) != 0) {
            textPaint.setTypeface(typeface4);
        } else if ((i10 & 4) != 0) {
        } else {
            textPaint.setTypeface(typeface);
        }
    }
}
