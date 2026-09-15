package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class p3 {
    public TextPaint f36400a;
    public final SparseArray f36401b = new SparseArray();
    public final SparseArray f36402c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f36403f = new SparseArray();
    public final SparseArray f36404g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f36405i = new SparseArray();
    public final SparseArray f36406j = new SparseArray();
    public final SparseArray f36407k = new SparseArray();
    public final SparseArray f36408l = new SparseArray();
    public final SparseArray f36409m = new SparseArray();
    public final SparseArray f36410n = new SparseArray();
    public final SparseArray f36411o = new SparseArray();
    public final SparseArray f36412p = new SparseArray();
    public final SparseArray f36413q = new SparseArray();
    public final SparseArray f36414r = new SparseArray();
    public final SparseArray f36415s = new SparseArray();
    public final SparseArray f36416t = new SparseArray();
    public final SparseArray f36417u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f36418w = new SparseArray();
    public final SparseArray f36419x = new SparseArray();
    public final SparseArray f36420y = new SparseArray();
    public final SparseArray f36421z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(h4 h4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(h4Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J6, false));
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
