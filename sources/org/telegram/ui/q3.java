package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class q3 {
    public TextPaint f40969a;
    public final SparseArray f40970b = new SparseArray();
    public final SparseArray f40971c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f40972e = new SparseArray();
    public final SparseArray f40973f = new SparseArray();
    public final SparseArray f40974g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f40975i = new SparseArray();
    public final SparseArray f40976j = new SparseArray();
    public final SparseArray f40977k = new SparseArray();
    public final SparseArray f40978l = new SparseArray();
    public final SparseArray f40979m = new SparseArray();
    public final SparseArray f40980n = new SparseArray();
    public final SparseArray f40981o = new SparseArray();
    public final SparseArray f40982p = new SparseArray();
    public final SparseArray f40983q = new SparseArray();
    public final SparseArray f40984r = new SparseArray();
    public final SparseArray f40985s = new SparseArray();
    public final SparseArray f40986t = new SparseArray();
    public final SparseArray f40987u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f40988w = new SparseArray();
    public final SparseArray f40989x = new SparseArray();
    public final SparseArray f40990y = new SparseArray();
    public final SparseArray f40991z = new SparseArray();
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
