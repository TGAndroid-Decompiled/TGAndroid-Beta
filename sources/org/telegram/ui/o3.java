package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class o3 {
    public TextPaint f50398a;
    public final SparseArray f50399b = new SparseArray();
    public final SparseArray f50400c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f50401e = new SparseArray();
    public final SparseArray f50402f = new SparseArray();
    public final SparseArray f50403g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f50404i = new SparseArray();
    public final SparseArray f50405j = new SparseArray();
    public final SparseArray f50406k = new SparseArray();
    public final SparseArray f50407l = new SparseArray();
    public final SparseArray f50408m = new SparseArray();
    public final SparseArray f50409n = new SparseArray();
    public final SparseArray f50410o = new SparseArray();
    public final SparseArray f50411p = new SparseArray();
    public final SparseArray f50412q = new SparseArray();
    public final SparseArray f50413r = new SparseArray();
    public final SparseArray f50414s = new SparseArray();
    public final SparseArray f50415t = new SparseArray();
    public final SparseArray f50416u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f50417w = new SparseArray();
    public final SparseArray f50418x = new SparseArray();
    public final SparseArray f50419y = new SparseArray();
    public final SparseArray f50420z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(p50 p50Var, SparseArray sparseArray) {
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            int keyAt = sparseArray.keyAt(i7);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i7);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.J6, false));
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
