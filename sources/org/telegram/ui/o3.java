package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class o3 {
    public TextPaint f48225a;
    public final SparseArray f48226b = new SparseArray();
    public final SparseArray f48227c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f48228e = new SparseArray();
    public final SparseArray f48229f = new SparseArray();
    public final SparseArray f48230g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f48231i = new SparseArray();
    public final SparseArray f48232j = new SparseArray();
    public final SparseArray f48233k = new SparseArray();
    public final SparseArray f48234l = new SparseArray();
    public final SparseArray f48235m = new SparseArray();
    public final SparseArray f48236n = new SparseArray();
    public final SparseArray f48237o = new SparseArray();
    public final SparseArray f48238p = new SparseArray();
    public final SparseArray f48239q = new SparseArray();
    public final SparseArray f48240r = new SparseArray();
    public final SparseArray f48241s = new SparseArray();
    public final SparseArray f48242t = new SparseArray();
    public final SparseArray f48243u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f48244w = new SparseArray();
    public final SparseArray f48245x = new SparseArray();
    public final SparseArray f48246y = new SparseArray();
    public final SparseArray f48247z = new SparseArray();
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
