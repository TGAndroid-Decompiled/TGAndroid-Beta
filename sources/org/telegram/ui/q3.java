package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class q3 {
    public TextPaint f36847a;
    public final SparseArray f36848b = new SparseArray();
    public final SparseArray f36849c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f36850f = new SparseArray();
    public final SparseArray f36851g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f36852i = new SparseArray();
    public final SparseArray f36853j = new SparseArray();
    public final SparseArray f36854k = new SparseArray();
    public final SparseArray f36855l = new SparseArray();
    public final SparseArray f36856m = new SparseArray();
    public final SparseArray f36857n = new SparseArray();
    public final SparseArray f36858o = new SparseArray();
    public final SparseArray f36859p = new SparseArray();
    public final SparseArray f36860q = new SparseArray();
    public final SparseArray f36861r = new SparseArray();
    public final SparseArray f36862s = new SparseArray();
    public final SparseArray f36863t = new SparseArray();
    public final SparseArray f36864u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f36865w = new SparseArray();
    public final SparseArray f36866x = new SparseArray();
    public final SparseArray f36867y = new SparseArray();
    public final SparseArray f36868z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(i4 i4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(i4Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.J6, false));
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
