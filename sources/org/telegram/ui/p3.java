package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class p3 {
    public TextPaint f40735a;
    public final SparseArray f40736b = new SparseArray();
    public final SparseArray f40737c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f40738e = new SparseArray();
    public final SparseArray f40739f = new SparseArray();
    public final SparseArray f40740g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f40741i = new SparseArray();
    public final SparseArray f40742j = new SparseArray();
    public final SparseArray f40743k = new SparseArray();
    public final SparseArray f40744l = new SparseArray();
    public final SparseArray f40745m = new SparseArray();
    public final SparseArray f40746n = new SparseArray();
    public final SparseArray f40747o = new SparseArray();
    public final SparseArray f40748p = new SparseArray();
    public final SparseArray f40749q = new SparseArray();
    public final SparseArray f40750r = new SparseArray();
    public final SparseArray f40751s = new SparseArray();
    public final SparseArray f40752t = new SparseArray();
    public final SparseArray f40753u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f40754w = new SparseArray();
    public final SparseArray f40755x = new SparseArray();
    public final SparseArray f40756y = new SparseArray();
    public final SparseArray f40757z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(h4 h4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(h4Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
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
