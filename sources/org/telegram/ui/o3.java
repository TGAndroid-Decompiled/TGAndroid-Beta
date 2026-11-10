package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class o3 {
    public TextPaint f48380a;
    public final SparseArray f48381b = new SparseArray();
    public final SparseArray f48382c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f48383e = new SparseArray();
    public final SparseArray f48384f = new SparseArray();
    public final SparseArray f48385g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f48386i = new SparseArray();
    public final SparseArray f48387j = new SparseArray();
    public final SparseArray f48388k = new SparseArray();
    public final SparseArray f48389l = new SparseArray();
    public final SparseArray f48390m = new SparseArray();
    public final SparseArray f48391n = new SparseArray();
    public final SparseArray f48392o = new SparseArray();
    public final SparseArray f48393p = new SparseArray();
    public final SparseArray f48394q = new SparseArray();
    public final SparseArray f48395r = new SparseArray();
    public final SparseArray f48396s = new SparseArray();
    public final SparseArray f48397t = new SparseArray();
    public final SparseArray f48398u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f48399w = new SparseArray();
    public final SparseArray f48400x = new SparseArray();
    public final SparseArray f48401y = new SparseArray();
    public final SparseArray f48402z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(r50 r50Var, SparseArray sparseArray) {
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            int keyAt = sparseArray.keyAt(i7);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i7);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.J6, false));
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
