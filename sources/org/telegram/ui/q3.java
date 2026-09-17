package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class q3 {
    public TextPaint f39693a;
    public final SparseArray f39694b = new SparseArray();
    public final SparseArray f39695c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f39696e = new SparseArray();
    public final SparseArray f39697f = new SparseArray();
    public final SparseArray f39698g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f39699i = new SparseArray();
    public final SparseArray f39700j = new SparseArray();
    public final SparseArray f39701k = new SparseArray();
    public final SparseArray f39702l = new SparseArray();
    public final SparseArray f39703m = new SparseArray();
    public final SparseArray f39704n = new SparseArray();
    public final SparseArray f39705o = new SparseArray();
    public final SparseArray f39706p = new SparseArray();
    public final SparseArray f39707q = new SparseArray();
    public final SparseArray f39708r = new SparseArray();
    public final SparseArray f39709s = new SparseArray();
    public final SparseArray f39710t = new SparseArray();
    public final SparseArray f39711u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f39712w = new SparseArray();
    public final SparseArray f39713x = new SparseArray();
    public final SparseArray f39714y = new SparseArray();
    public final SparseArray f39715z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(i4 i4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(i4Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
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
