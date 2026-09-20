package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class p3 {
    public TextPaint f36435a;
    public final SparseArray f36436b = new SparseArray();
    public final SparseArray f36437c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f36438f = new SparseArray();
    public final SparseArray f36439g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f36440i = new SparseArray();
    public final SparseArray f36441j = new SparseArray();
    public final SparseArray f36442k = new SparseArray();
    public final SparseArray f36443l = new SparseArray();
    public final SparseArray f36444m = new SparseArray();
    public final SparseArray f36445n = new SparseArray();
    public final SparseArray f36446o = new SparseArray();
    public final SparseArray f36447p = new SparseArray();
    public final SparseArray f36448q = new SparseArray();
    public final SparseArray f36449r = new SparseArray();
    public final SparseArray f36450s = new SparseArray();
    public final SparseArray f36451t = new SparseArray();
    public final SparseArray f36452u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f36453w = new SparseArray();
    public final SparseArray f36454x = new SparseArray();
    public final SparseArray f36455y = new SparseArray();
    public final SparseArray f36456z = new SparseArray();
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
