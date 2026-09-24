package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class q3 {
    public TextPaint f36732a;
    public final SparseArray f36733b = new SparseArray();
    public final SparseArray f36734c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f36735f = new SparseArray();
    public final SparseArray f36736g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f36737i = new SparseArray();
    public final SparseArray f36738j = new SparseArray();
    public final SparseArray f36739k = new SparseArray();
    public final SparseArray f36740l = new SparseArray();
    public final SparseArray f36741m = new SparseArray();
    public final SparseArray f36742n = new SparseArray();
    public final SparseArray f36743o = new SparseArray();
    public final SparseArray f36744p = new SparseArray();
    public final SparseArray f36745q = new SparseArray();
    public final SparseArray f36746r = new SparseArray();
    public final SparseArray f36747s = new SparseArray();
    public final SparseArray f36748t = new SparseArray();
    public final SparseArray f36749u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f36750w = new SparseArray();
    public final SparseArray f36751x = new SparseArray();
    public final SparseArray f36752y = new SparseArray();
    public final SparseArray f36753z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(i4 i4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(i4Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.J6, false));
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
