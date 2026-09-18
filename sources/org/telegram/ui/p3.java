package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class p3 {
    public TextPaint f36307a;
    public final SparseArray f36308b = new SparseArray();
    public final SparseArray f36309c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f36310f = new SparseArray();
    public final SparseArray f36311g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f36312i = new SparseArray();
    public final SparseArray f36313j = new SparseArray();
    public final SparseArray f36314k = new SparseArray();
    public final SparseArray f36315l = new SparseArray();
    public final SparseArray f36316m = new SparseArray();
    public final SparseArray f36317n = new SparseArray();
    public final SparseArray f36318o = new SparseArray();
    public final SparseArray f36319p = new SparseArray();
    public final SparseArray f36320q = new SparseArray();
    public final SparseArray f36321r = new SparseArray();
    public final SparseArray f36322s = new SparseArray();
    public final SparseArray f36323t = new SparseArray();
    public final SparseArray f36324u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f36325w = new SparseArray();
    public final SparseArray f36326x = new SparseArray();
    public final SparseArray f36327y = new SparseArray();
    public final SparseArray f36328z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(h4 h4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(h4Var.b());
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
