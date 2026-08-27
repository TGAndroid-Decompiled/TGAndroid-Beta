package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class m80 {

    public View f30618a;

    public org.telegram.ui.Cells.a1 f30619b;

    public final ArrayList f30620c = new ArrayList();
    public int d = 0;

    public final ArrayList f30621e = new ArrayList();

    public int f30622f = 0;

    public m80() {
    }

    public static t80 i(Layout layout, CharacterStyle characterStyle, float f10) {
        if (layout == null || characterStyle == null || !(layout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) layout.getText();
        j80 j80Var = new j80(0);
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanEnd = spanned.getSpanEnd(characterStyle);
        j80Var.d(layout, spanStart, f10);
        layout.getSelectionPath(spanStart, spanEnd, j80Var);
        t80 t80Var = new t80();
        t80Var.f32711x = j80Var;
        t80Var.C = true;
        t80Var.j(4.0f);
        t80Var.k();
        return t80Var;
    }

    public final void a(q80 q80Var, Object obj) {
        this.f30620c.add(new Pair(q80Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(t80 t80Var, Object obj) {
        this.f30621e.add(new Pair(t80Var, obj));
        this.f30622f++;
        h(obj, true);
    }

    public final void c() {
        d(true);
    }

    public final void d(boolean z10) {
        if (z10) {
            for (int i10 = 0; i10 < this.d; i10++) {
                j(i10);
            }
        } else {
            if (this.d <= 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                int i12 = this.d;
                ArrayList arrayList = this.f30620c;
                if (i11 >= i12) {
                    arrayList.clear();
                    this.d = 0;
                    h(null, true);
                    return;
                } else {
                    ((q80) ((Pair) arrayList.get(i11)).first).c();
                    h(((Pair) arrayList.get(i11)).second, false);
                    i11++;
                }
            }
        }
    }

    public final void e() {
        for (int i10 = 0; i10 < this.f30622f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f30622f) {
            ((t80) ((Pair) this.f30621e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            z10 = ((q80) ((Pair) this.f30620c.get(i11)).first).a(canvas) || z10;
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f30622f; i10++) {
            ArrayList arrayList = this.f30621e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((t80) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.f30620c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                z10 = ((q80) ((Pair) arrayList2.get(i11)).first).a(canvas) || z10;
            }
        }
        h(obj, false);
        return z10;
    }

    public final void h(Object obj, boolean z10) {
        View view;
        View view2;
        if (obj instanceof View) {
            ((View) obj).invalidate();
        } else if (obj instanceof org.telegram.ui.f3) {
            org.telegram.ui.f3 f3Var = (org.telegram.ui.f3) obj;
            if (!f3Var.f37918c && (view2 = f3Var.f37917b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.f30618a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.a1 a1Var = this.f30619b;
        if (a1Var != null) {
            a1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 < 0 || i10 >= this.d) {
            return;
        }
        Pair pair = (Pair) this.f30620c.get(i10);
        q80 q80Var = (q80) pair.first;
        if (q80Var.f31848p < 0) {
            q80Var.f31848p = Math.max(q80Var.f31847o + q80Var.f31849q, SystemClock.elapsedRealtime());
            h(pair.second, true);
            AndroidUtilities.runOnUIThread(new l80(this, q80Var, 1), Math.max(0L, (q80Var.f31848p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public final void k(q80 q80Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (q80Var == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = this.d;
            arrayList = this.f30620c;
            if (i10 >= i11) {
                pair = null;
                break;
            } else {
                if (((Pair) arrayList.get(i10)).first == q80Var) {
                    pair = (Pair) arrayList.get(i10);
                    break;
                }
                i10++;
            }
        }
        if (pair == null) {
            return;
        }
        if (!z10) {
            arrayList.remove(pair);
            q80Var.c();
            this.d = arrayList.size();
            h(pair.second, true);
            return;
        }
        if (q80Var.f31848p < 0) {
            q80Var.f31848p = Math.max(q80Var.f31847o + q80Var.f31849q, SystemClock.elapsedRealtime());
            h(pair.second, true);
            AndroidUtilities.runOnUIThread(new l80(this, q80Var, 0), Math.max(0L, (q80Var.f31848p - SystemClock.elapsedRealtime()) + 175));
        }
    }

    public final void l(t80 t80Var, boolean z10) {
        if (t80Var == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f30622f; i10++) {
            if (((Pair) this.f30621e.get(i10)).first == t80Var) {
                m(i10, z10);
                return;
            }
        }
    }

    public final void m(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f30622f) {
            return;
        }
        ArrayList arrayList = this.f30621e;
        Pair pair = (Pair) arrayList.get(i10);
        if (pair == null) {
            return;
        }
        t80 t80Var = (t80) pair.first;
        if (!z10) {
            arrayList.remove(pair);
            t80Var.f32692b = -1L;
            t80Var.f32693c = -1L;
            this.f30622f = arrayList.size();
            h(pair.second, true);
            return;
        }
        if (t80Var.b()) {
            l(t80Var, false);
            return;
        }
        if (!t80Var.c()) {
            t80Var.a();
        }
        AndroidUtilities.runOnUIThread(new xq(26, this, t80Var), t80Var.f32693c > 0 ? 320 - (SystemClock.elapsedRealtime() - t80Var.f32693c) : 0L);
    }

    public m80(View view) {
        this.f30618a = view;
    }
}
