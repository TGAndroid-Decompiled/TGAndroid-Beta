package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class q3 {
    public TextPaint f41161a;
    public final SparseArray f41162b = new SparseArray();
    public final SparseArray f41163c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f41164e = new SparseArray();
    public final SparseArray f41165f = new SparseArray();
    public final SparseArray f41166g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f41167i = new SparseArray();
    public final SparseArray f41168j = new SparseArray();
    public final SparseArray f41169k = new SparseArray();
    public final SparseArray f41170l = new SparseArray();
    public final SparseArray f41171m = new SparseArray();
    public final SparseArray f41172n = new SparseArray();
    public final SparseArray f41173o = new SparseArray();
    public final SparseArray f41174p = new SparseArray();
    public final SparseArray f41175q = new SparseArray();
    public final SparseArray f41176r = new SparseArray();
    public final SparseArray f41177s = new SparseArray();
    public final SparseArray f41178t = new SparseArray();
    public final SparseArray f41179u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f41180w = new SparseArray();
    public final SparseArray f41181x = new SparseArray();
    public final SparseArray f41182y = new SparseArray();
    public final SparseArray f41183z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(i4 i4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(i4Var.b());
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
