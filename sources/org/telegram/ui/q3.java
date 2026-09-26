package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class q3 {
    public TextPaint f36746a;
    public final SparseArray f36747b = new SparseArray();
    public final SparseArray f36748c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f36749f = new SparseArray();
    public final SparseArray f36750g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f36751i = new SparseArray();
    public final SparseArray f36752j = new SparseArray();
    public final SparseArray f36753k = new SparseArray();
    public final SparseArray f36754l = new SparseArray();
    public final SparseArray f36755m = new SparseArray();
    public final SparseArray f36756n = new SparseArray();
    public final SparseArray f36757o = new SparseArray();
    public final SparseArray f36758p = new SparseArray();
    public final SparseArray f36759q = new SparseArray();
    public final SparseArray f36760r = new SparseArray();
    public final SparseArray f36761s = new SparseArray();
    public final SparseArray f36762t = new SparseArray();
    public final SparseArray f36763u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f36764w = new SparseArray();
    public final SparseArray f36765x = new SparseArray();
    public final SparseArray f36766y = new SparseArray();
    public final SparseArray f36767z = new SparseArray();
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
