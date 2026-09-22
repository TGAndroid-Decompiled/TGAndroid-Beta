package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class p3 {
    public TextPaint f36462a;
    public final SparseArray f36463b = new SparseArray();
    public final SparseArray f36464c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f36465f = new SparseArray();
    public final SparseArray f36466g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f36467i = new SparseArray();
    public final SparseArray f36468j = new SparseArray();
    public final SparseArray f36469k = new SparseArray();
    public final SparseArray f36470l = new SparseArray();
    public final SparseArray f36471m = new SparseArray();
    public final SparseArray f36472n = new SparseArray();
    public final SparseArray f36473o = new SparseArray();
    public final SparseArray f36474p = new SparseArray();
    public final SparseArray f36475q = new SparseArray();
    public final SparseArray f36476r = new SparseArray();
    public final SparseArray f36477s = new SparseArray();
    public final SparseArray f36478t = new SparseArray();
    public final SparseArray f36479u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f36480w = new SparseArray();
    public final SparseArray f36481x = new SparseArray();
    public final SparseArray f36482y = new SparseArray();
    public final SparseArray f36483z = new SparseArray();
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
