package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class o3 {
    public TextPaint f50492a;
    public final SparseArray f50493b = new SparseArray();
    public final SparseArray f50494c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f50495e = new SparseArray();
    public final SparseArray f50496f = new SparseArray();
    public final SparseArray f50497g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f50498i = new SparseArray();
    public final SparseArray f50499j = new SparseArray();
    public final SparseArray f50500k = new SparseArray();
    public final SparseArray f50501l = new SparseArray();
    public final SparseArray f50502m = new SparseArray();
    public final SparseArray f50503n = new SparseArray();
    public final SparseArray f50504o = new SparseArray();
    public final SparseArray f50505p = new SparseArray();
    public final SparseArray f50506q = new SparseArray();
    public final SparseArray f50507r = new SparseArray();
    public final SparseArray f50508s = new SparseArray();
    public final SparseArray f50509t = new SparseArray();
    public final SparseArray f50510u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f50511w = new SparseArray();
    public final SparseArray f50512x = new SparseArray();
    public final SparseArray f50513y = new SparseArray();
    public final SparseArray f50514z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(p50 p50Var, SparseArray sparseArray) {
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            int keyAt = sparseArray.keyAt(i7);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i7);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.J6, false));
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
