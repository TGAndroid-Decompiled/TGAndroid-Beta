package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class q3 {
    public TextPaint f39692a;
    public final SparseArray f39693b = new SparseArray();
    public final SparseArray f39694c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f39695e = new SparseArray();
    public final SparseArray f39696f = new SparseArray();
    public final SparseArray f39697g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f39698i = new SparseArray();
    public final SparseArray f39699j = new SparseArray();
    public final SparseArray f39700k = new SparseArray();
    public final SparseArray f39701l = new SparseArray();
    public final SparseArray f39702m = new SparseArray();
    public final SparseArray f39703n = new SparseArray();
    public final SparseArray f39704o = new SparseArray();
    public final SparseArray f39705p = new SparseArray();
    public final SparseArray f39706q = new SparseArray();
    public final SparseArray f39707r = new SparseArray();
    public final SparseArray f39708s = new SparseArray();
    public final SparseArray f39709t = new SparseArray();
    public final SparseArray f39710u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f39711w = new SparseArray();
    public final SparseArray f39712x = new SparseArray();
    public final SparseArray f39713y = new SparseArray();
    public final SparseArray f39714z = new SparseArray();
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
