package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class q3 {
    public TextPaint f41015a;
    public final SparseArray f41016b = new SparseArray();
    public final SparseArray f41017c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f41018e = new SparseArray();
    public final SparseArray f41019f = new SparseArray();
    public final SparseArray f41020g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f41021i = new SparseArray();
    public final SparseArray f41022j = new SparseArray();
    public final SparseArray f41023k = new SparseArray();
    public final SparseArray f41024l = new SparseArray();
    public final SparseArray f41025m = new SparseArray();
    public final SparseArray f41026n = new SparseArray();
    public final SparseArray f41027o = new SparseArray();
    public final SparseArray f41028p = new SparseArray();
    public final SparseArray f41029q = new SparseArray();
    public final SparseArray f41030r = new SparseArray();
    public final SparseArray f41031s = new SparseArray();
    public final SparseArray f41032t = new SparseArray();
    public final SparseArray f41033u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f41034w = new SparseArray();
    public final SparseArray f41035x = new SparseArray();
    public final SparseArray f41036y = new SparseArray();
    public final SparseArray f41037z = new SparseArray();
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
