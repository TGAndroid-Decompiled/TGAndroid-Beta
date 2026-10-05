package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class q3 {
    public TextPaint f39680a;
    public final SparseArray f39681b = new SparseArray();
    public final SparseArray f39682c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f39683e = new SparseArray();
    public final SparseArray f39684f = new SparseArray();
    public final SparseArray f39685g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f39686i = new SparseArray();
    public final SparseArray f39687j = new SparseArray();
    public final SparseArray f39688k = new SparseArray();
    public final SparseArray f39689l = new SparseArray();
    public final SparseArray f39690m = new SparseArray();
    public final SparseArray f39691n = new SparseArray();
    public final SparseArray f39692o = new SparseArray();
    public final SparseArray f39693p = new SparseArray();
    public final SparseArray f39694q = new SparseArray();
    public final SparseArray f39695r = new SparseArray();
    public final SparseArray f39696s = new SparseArray();
    public final SparseArray f39697t = new SparseArray();
    public final SparseArray f39698u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f39699w = new SparseArray();
    public final SparseArray f39700x = new SparseArray();
    public final SparseArray f39701y = new SparseArray();
    public final SparseArray f39702z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(i4 i4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(i4Var.b());
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
