package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class q3 {
    public TextPaint f36747a;
    public final SparseArray f36748b = new SparseArray();
    public final SparseArray f36749c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f36750f = new SparseArray();
    public final SparseArray f36751g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f36752i = new SparseArray();
    public final SparseArray f36753j = new SparseArray();
    public final SparseArray f36754k = new SparseArray();
    public final SparseArray f36755l = new SparseArray();
    public final SparseArray f36756m = new SparseArray();
    public final SparseArray f36757n = new SparseArray();
    public final SparseArray f36758o = new SparseArray();
    public final SparseArray f36759p = new SparseArray();
    public final SparseArray f36760q = new SparseArray();
    public final SparseArray f36761r = new SparseArray();
    public final SparseArray f36762s = new SparseArray();
    public final SparseArray f36763t = new SparseArray();
    public final SparseArray f36764u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f36765w = new SparseArray();
    public final SparseArray f36766x = new SparseArray();
    public final SparseArray f36767y = new SparseArray();
    public final SparseArray f36768z = new SparseArray();
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
