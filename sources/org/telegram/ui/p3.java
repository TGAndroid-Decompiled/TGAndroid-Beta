package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class p3 {
    public TextPaint f36414a;
    public final SparseArray f36415b = new SparseArray();
    public final SparseArray f36416c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f36417f = new SparseArray();
    public final SparseArray f36418g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f36419i = new SparseArray();
    public final SparseArray f36420j = new SparseArray();
    public final SparseArray f36421k = new SparseArray();
    public final SparseArray f36422l = new SparseArray();
    public final SparseArray f36423m = new SparseArray();
    public final SparseArray f36424n = new SparseArray();
    public final SparseArray f36425o = new SparseArray();
    public final SparseArray f36426p = new SparseArray();
    public final SparseArray f36427q = new SparseArray();
    public final SparseArray f36428r = new SparseArray();
    public final SparseArray f36429s = new SparseArray();
    public final SparseArray f36430t = new SparseArray();
    public final SparseArray f36431u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f36432w = new SparseArray();
    public final SparseArray f36433x = new SparseArray();
    public final SparseArray f36434y = new SparseArray();
    public final SparseArray f36435z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(h4 h4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(h4Var.b());
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
