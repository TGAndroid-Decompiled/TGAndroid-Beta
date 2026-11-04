package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class p3 {
    public TextPaint f48430a;
    public final SparseArray f48431b = new SparseArray();
    public final SparseArray f48432c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f48433e = new SparseArray();
    public final SparseArray f48434f = new SparseArray();
    public final SparseArray f48435g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f48436i = new SparseArray();
    public final SparseArray f48437j = new SparseArray();
    public final SparseArray f48438k = new SparseArray();
    public final SparseArray f48439l = new SparseArray();
    public final SparseArray f48440m = new SparseArray();
    public final SparseArray f48441n = new SparseArray();
    public final SparseArray f48442o = new SparseArray();
    public final SparseArray f48443p = new SparseArray();
    public final SparseArray f48444q = new SparseArray();
    public final SparseArray f48445r = new SparseArray();
    public final SparseArray f48446s = new SparseArray();
    public final SparseArray f48447t = new SparseArray();
    public final SparseArray f48448u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f48449w = new SparseArray();
    public final SparseArray f48450x = new SparseArray();
    public final SparseArray f48451y = new SparseArray();
    public final SparseArray f48452z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(i50 i50Var, SparseArray sparseArray) {
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            int keyAt = sparseArray.keyAt(i3);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i3);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
                }
            }
        }
    }

    public static void b(int i3, TextPaint textPaint, Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4) {
        int i10 = i3 & 1;
        if (i10 != 0 && (i3 & 2) != 0) {
            textPaint.setTypeface(typeface2);
        } else if (i10 != 0) {
            textPaint.setTypeface(typeface3);
        } else if ((i3 & 2) != 0) {
            textPaint.setTypeface(typeface4);
        } else if ((i3 & 4) != 0) {
        } else {
            textPaint.setTypeface(typeface);
        }
    }
}
