package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class q3 {
    public TextPaint f42715a;
    public final SparseArray f42716b = new SparseArray();
    public final SparseArray f42717c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f42718f = new SparseArray();
    public final SparseArray f42719g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f42720i = new SparseArray();
    public final SparseArray f42721j = new SparseArray();
    public final SparseArray f42722k = new SparseArray();
    public final SparseArray f42723l = new SparseArray();
    public final SparseArray f42724m = new SparseArray();
    public final SparseArray f42725n = new SparseArray();
    public final SparseArray f42726o = new SparseArray();
    public final SparseArray f42727p = new SparseArray();
    public final SparseArray f42728q = new SparseArray();
    public final SparseArray f42729r = new SparseArray();
    public final SparseArray f42730s = new SparseArray();
    public final SparseArray f42731t = new SparseArray();
    public final SparseArray f42732u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f42733w = new SparseArray();
    public final SparseArray f42734x = new SparseArray();
    public final SparseArray f42735y = new SparseArray();
    public final SparseArray f42736z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(h70 h70Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(h70Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.J6, false));
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
