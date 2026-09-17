package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class q3 {
    public TextPaint f39720a;
    public final SparseArray f39721b = new SparseArray();
    public final SparseArray f39722c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f39723e = new SparseArray();
    public final SparseArray f39724f = new SparseArray();
    public final SparseArray f39725g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f39726i = new SparseArray();
    public final SparseArray f39727j = new SparseArray();
    public final SparseArray f39728k = new SparseArray();
    public final SparseArray f39729l = new SparseArray();
    public final SparseArray f39730m = new SparseArray();
    public final SparseArray f39731n = new SparseArray();
    public final SparseArray f39732o = new SparseArray();
    public final SparseArray f39733p = new SparseArray();
    public final SparseArray f39734q = new SparseArray();
    public final SparseArray f39735r = new SparseArray();
    public final SparseArray f39736s = new SparseArray();
    public final SparseArray f39737t = new SparseArray();
    public final SparseArray f39738u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f39739w = new SparseArray();
    public final SparseArray f39740x = new SparseArray();
    public final SparseArray f39741y = new SparseArray();
    public final SparseArray f39742z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(i4 i4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(i4Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
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
