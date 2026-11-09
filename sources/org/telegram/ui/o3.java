package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class o3 {
    public TextPaint f48307a;
    public final SparseArray f48308b = new SparseArray();
    public final SparseArray f48309c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f48310e = new SparseArray();
    public final SparseArray f48311f = new SparseArray();
    public final SparseArray f48312g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f48313i = new SparseArray();
    public final SparseArray f48314j = new SparseArray();
    public final SparseArray f48315k = new SparseArray();
    public final SparseArray f48316l = new SparseArray();
    public final SparseArray f48317m = new SparseArray();
    public final SparseArray f48318n = new SparseArray();
    public final SparseArray f48319o = new SparseArray();
    public final SparseArray f48320p = new SparseArray();
    public final SparseArray f48321q = new SparseArray();
    public final SparseArray f48322r = new SparseArray();
    public final SparseArray f48323s = new SparseArray();
    public final SparseArray f48324t = new SparseArray();
    public final SparseArray f48325u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f48326w = new SparseArray();
    public final SparseArray f48327x = new SparseArray();
    public final SparseArray f48328y = new SparseArray();
    public final SparseArray f48329z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(q50 q50Var, SparseArray sparseArray) {
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            int keyAt = sparseArray.keyAt(i7);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i7);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.J6, false));
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
