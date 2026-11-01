package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class p3 {
    public TextPaint f40331a;
    public final SparseArray f40332b = new SparseArray();
    public final SparseArray f40333c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f40334f = new SparseArray();
    public final SparseArray f40335g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f40336i = new SparseArray();
    public final SparseArray f40337j = new SparseArray();
    public final SparseArray f40338k = new SparseArray();
    public final SparseArray f40339l = new SparseArray();
    public final SparseArray f40340m = new SparseArray();
    public final SparseArray f40341n = new SparseArray();
    public final SparseArray f40342o = new SparseArray();
    public final SparseArray f40343p = new SparseArray();
    public final SparseArray f40344q = new SparseArray();
    public final SparseArray f40345r = new SparseArray();
    public final SparseArray f40346s = new SparseArray();
    public final SparseArray f40347t = new SparseArray();
    public final SparseArray f40348u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f40349w = new SparseArray();
    public final SparseArray f40350x = new SparseArray();
    public final SparseArray f40351y = new SparseArray();
    public final SparseArray f40352z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(l60 l60Var, SparseArray sparseArray) {
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
