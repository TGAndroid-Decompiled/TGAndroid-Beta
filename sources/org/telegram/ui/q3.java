package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class q3 {
    public TextPaint f39591a;
    public final SparseArray f39592b = new SparseArray();
    public final SparseArray f39593c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f39594e = new SparseArray();
    public final SparseArray f39595f = new SparseArray();
    public final SparseArray f39596g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f39597i = new SparseArray();
    public final SparseArray f39598j = new SparseArray();
    public final SparseArray f39599k = new SparseArray();
    public final SparseArray f39600l = new SparseArray();
    public final SparseArray f39601m = new SparseArray();
    public final SparseArray f39602n = new SparseArray();
    public final SparseArray f39603o = new SparseArray();
    public final SparseArray f39604p = new SparseArray();
    public final SparseArray f39605q = new SparseArray();
    public final SparseArray f39606r = new SparseArray();
    public final SparseArray f39607s = new SparseArray();
    public final SparseArray f39608t = new SparseArray();
    public final SparseArray f39609u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f39610w = new SparseArray();
    public final SparseArray f39611x = new SparseArray();
    public final SparseArray f39612y = new SparseArray();
    public final SparseArray f39613z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(i4 i4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(i4Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J6, false));
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
