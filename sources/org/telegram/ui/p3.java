package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class p3 {
    public TextPaint f36503a;
    public final SparseArray f36504b = new SparseArray();
    public final SparseArray f36505c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f36506f = new SparseArray();
    public final SparseArray f36507g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f36508i = new SparseArray();
    public final SparseArray f36509j = new SparseArray();
    public final SparseArray f36510k = new SparseArray();
    public final SparseArray f36511l = new SparseArray();
    public final SparseArray f36512m = new SparseArray();
    public final SparseArray f36513n = new SparseArray();
    public final SparseArray f36514o = new SparseArray();
    public final SparseArray f36515p = new SparseArray();
    public final SparseArray f36516q = new SparseArray();
    public final SparseArray f36517r = new SparseArray();
    public final SparseArray f36518s = new SparseArray();
    public final SparseArray f36519t = new SparseArray();
    public final SparseArray f36520u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f36521w = new SparseArray();
    public final SparseArray f36522x = new SparseArray();
    public final SparseArray f36523y = new SparseArray();
    public final SparseArray f36524z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(h4 h4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(h4Var.b());
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
