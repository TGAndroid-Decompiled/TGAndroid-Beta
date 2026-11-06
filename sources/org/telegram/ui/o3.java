package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class o3 {
    public TextPaint f48224a;
    public final SparseArray f48225b = new SparseArray();
    public final SparseArray f48226c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f48227e = new SparseArray();
    public final SparseArray f48228f = new SparseArray();
    public final SparseArray f48229g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f48230i = new SparseArray();
    public final SparseArray f48231j = new SparseArray();
    public final SparseArray f48232k = new SparseArray();
    public final SparseArray f48233l = new SparseArray();
    public final SparseArray f48234m = new SparseArray();
    public final SparseArray f48235n = new SparseArray();
    public final SparseArray f48236o = new SparseArray();
    public final SparseArray f48237p = new SparseArray();
    public final SparseArray f48238q = new SparseArray();
    public final SparseArray f48239r = new SparseArray();
    public final SparseArray f48240s = new SparseArray();
    public final SparseArray f48241t = new SparseArray();
    public final SparseArray f48242u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f48243w = new SparseArray();
    public final SparseArray f48244x = new SparseArray();
    public final SparseArray f48245y = new SparseArray();
    public final SparseArray f48246z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(o50 o50Var, SparseArray sparseArray) {
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            int keyAt = sparseArray.keyAt(i7);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i7);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
                }
            }
        }
    }

    public static void b(int i7, TextPaint textPaint, Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4) {
        int i10 = i7 & 1;
        if (i10 != 0 && (i7 & 2) != 0) {
            textPaint.setTypeface(typeface2);
        } else if (i10 != 0) {
            textPaint.setTypeface(typeface3);
        } else if ((i7 & 2) != 0) {
            textPaint.setTypeface(typeface4);
        } else if ((i7 & 4) != 0) {
        } else {
            textPaint.setTypeface(typeface);
        }
    }
}
