package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class o3 {
    public TextPaint f49765a;
    public final SparseArray f49766b = new SparseArray();
    public final SparseArray f49767c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f49768e = new SparseArray();
    public final SparseArray f49769f = new SparseArray();
    public final SparseArray f49770g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f49771i = new SparseArray();
    public final SparseArray f49772j = new SparseArray();
    public final SparseArray f49773k = new SparseArray();
    public final SparseArray f49774l = new SparseArray();
    public final SparseArray f49775m = new SparseArray();
    public final SparseArray f49776n = new SparseArray();
    public final SparseArray f49777o = new SparseArray();
    public final SparseArray f49778p = new SparseArray();
    public final SparseArray f49779q = new SparseArray();
    public final SparseArray f49780r = new SparseArray();
    public final SparseArray f49781s = new SparseArray();
    public final SparseArray f49782t = new SparseArray();
    public final SparseArray f49783u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f49784w = new SparseArray();
    public final SparseArray f49785x = new SparseArray();
    public final SparseArray f49786y = new SparseArray();
    public final SparseArray f49787z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(n50 n50Var, SparseArray sparseArray) {
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            int keyAt = sparseArray.keyAt(i7);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i7);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G6, false));
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.J6, false));
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
