package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class p3 {
    public TextPaint f40435a;
    public final SparseArray f40436b = new SparseArray();
    public final SparseArray f40437c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f40438f = new SparseArray();
    public final SparseArray f40439g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f40440i = new SparseArray();
    public final SparseArray f40441j = new SparseArray();
    public final SparseArray f40442k = new SparseArray();
    public final SparseArray f40443l = new SparseArray();
    public final SparseArray f40444m = new SparseArray();
    public final SparseArray f40445n = new SparseArray();
    public final SparseArray f40446o = new SparseArray();
    public final SparseArray f40447p = new SparseArray();
    public final SparseArray f40448q = new SparseArray();
    public final SparseArray f40449r = new SparseArray();
    public final SparseArray f40450s = new SparseArray();
    public final SparseArray f40451t = new SparseArray();
    public final SparseArray f40452u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f40453w = new SparseArray();
    public final SparseArray f40454x = new SparseArray();
    public final SparseArray f40455y = new SparseArray();
    public final SparseArray f40456z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(m60 m60Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J6, false));
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
