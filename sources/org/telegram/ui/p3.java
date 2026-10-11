package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class p3 {
    public TextPaint f40701a;
    public final SparseArray f40702b = new SparseArray();
    public final SparseArray f40703c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f40704e = new SparseArray();
    public final SparseArray f40705f = new SparseArray();
    public final SparseArray f40706g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f40707i = new SparseArray();
    public final SparseArray f40708j = new SparseArray();
    public final SparseArray f40709k = new SparseArray();
    public final SparseArray f40710l = new SparseArray();
    public final SparseArray f40711m = new SparseArray();
    public final SparseArray f40712n = new SparseArray();
    public final SparseArray f40713o = new SparseArray();
    public final SparseArray f40714p = new SparseArray();
    public final SparseArray f40715q = new SparseArray();
    public final SparseArray f40716r = new SparseArray();
    public final SparseArray f40717s = new SparseArray();
    public final SparseArray f40718t = new SparseArray();
    public final SparseArray f40719u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f40720w = new SparseArray();
    public final SparseArray f40721x = new SparseArray();
    public final SparseArray f40722y = new SparseArray();
    public final SparseArray f40723z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(h4 h4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(h4Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
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
