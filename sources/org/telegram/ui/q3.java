package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class q3 {
    public TextPaint f36257a;
    public final SparseArray f36258b = new SparseArray();
    public final SparseArray f36259c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f36260f = new SparseArray();
    public final SparseArray f36261g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f36262i = new SparseArray();
    public final SparseArray f36263j = new SparseArray();
    public final SparseArray f36264k = new SparseArray();
    public final SparseArray f36265l = new SparseArray();
    public final SparseArray f36266m = new SparseArray();
    public final SparseArray f36267n = new SparseArray();
    public final SparseArray f36268o = new SparseArray();
    public final SparseArray f36269p = new SparseArray();
    public final SparseArray f36270q = new SparseArray();
    public final SparseArray f36271r = new SparseArray();
    public final SparseArray f36272s = new SparseArray();
    public final SparseArray f36273t = new SparseArray();
    public final SparseArray f36274u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f36275w = new SparseArray();
    public final SparseArray f36276x = new SparseArray();
    public final SparseArray f36277y = new SparseArray();
    public final SparseArray f36278z = new SparseArray();
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
