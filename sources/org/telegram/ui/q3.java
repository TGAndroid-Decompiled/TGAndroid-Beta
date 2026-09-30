package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class q3 {
    public TextPaint f36748a;
    public final SparseArray f36749b = new SparseArray();
    public final SparseArray f36750c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f36751f = new SparseArray();
    public final SparseArray f36752g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f36753i = new SparseArray();
    public final SparseArray f36754j = new SparseArray();
    public final SparseArray f36755k = new SparseArray();
    public final SparseArray f36756l = new SparseArray();
    public final SparseArray f36757m = new SparseArray();
    public final SparseArray f36758n = new SparseArray();
    public final SparseArray f36759o = new SparseArray();
    public final SparseArray f36760p = new SparseArray();
    public final SparseArray f36761q = new SparseArray();
    public final SparseArray f36762r = new SparseArray();
    public final SparseArray f36763s = new SparseArray();
    public final SparseArray f36764t = new SparseArray();
    public final SparseArray f36765u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f36766w = new SparseArray();
    public final SparseArray f36767x = new SparseArray();
    public final SparseArray f36768y = new SparseArray();
    public final SparseArray f36769z = new SparseArray();
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
