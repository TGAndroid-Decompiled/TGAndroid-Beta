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
public final class j90 {
    public View f24318a;
    public org.telegram.ui.Cells.b1 f24319b;
    public final ArrayList f24320c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f24321f = 0;

    public j90() {
    }

    public static q90 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            g90 g90Var = new g90(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            g90Var.d(layout, spanStart, f7);
            layout.getSelectionPath(spanStart, spanEnd, g90Var);
            q90 q90Var = new q90();
            q90Var.f26364x = g90Var;
            q90Var.C = true;
            q90Var.j(4.0f);
            q90Var.k();
            return q90Var;
        }
        return null;
    }

    public final void a(n90 n90Var, Object obj) {
        this.f24320c.add(new Pair(n90Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(q90 q90Var, Object obj) {
        this.e.add(new Pair(q90Var, obj));
        this.f24321f++;
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
        } else if (this.d > 0) {
            int i11 = 0;
            while (true) {
                int i12 = this.d;
                ArrayList arrayList = this.f24320c;
                if (i11 < i12) {
                    ((n90) ((Pair) arrayList.get(i11)).first).c();
                    h(((Pair) arrayList.get(i11)).second, false);
                    i11++;
                } else {
                    arrayList.clear();
                    this.d = 0;
                    h(null, true);
                    return;
                }
            }
        }
    }

    public final void e() {
        for (int i10 = 0; i10 < this.f24321f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f24321f) {
            ((q90) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            if (!((n90) ((Pair) this.f24320c.get(i11)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f24321f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((q90) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.f24320c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                if (!((n90) ((Pair) arrayList2.get(i11)).first).a(canvas) && !z10) {
                    z10 = false;
                } else {
                    z10 = true;
                }
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
        } else if (obj instanceof org.telegram.ui.c3) {
            org.telegram.ui.c3 c3Var = (org.telegram.ui.c3) obj;
            if (!c3Var.f31511c && (view2 = c3Var.f31510b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.f24318a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.b1 b1Var = this.f24319b;
        if (b1Var != null) {
            b1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 >= 0 && i10 < this.d) {
            Pair pair = (Pair) this.f24320c.get(i10);
            n90 n90Var = (n90) pair.first;
            if (n90Var.f25472p < 0) {
                n90Var.f25472p = Math.max(n90Var.f25471o + n90Var.f25473q, SystemClock.elapsedRealtime());
                h(pair.second, true);
                AndroidUtilities.runOnUIThread(new i90(this, n90Var, 1), Math.max(0L, (n90Var.f25472p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void k(n90 n90Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (n90Var != null) {
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                arrayList = this.f24320c;
                if (i10 < i11) {
                    if (((Pair) arrayList.get(i10)).first == n90Var) {
                        pair = (Pair) arrayList.get(i10);
                        break;
                    }
                    i10++;
                } else {
                    pair = null;
                    break;
                }
            }
            if (pair != null) {
                if (z10) {
                    if (n90Var.f25472p < 0) {
                        n90Var.f25472p = Math.max(n90Var.f25471o + n90Var.f25473q, SystemClock.elapsedRealtime());
                        h(pair.second, true);
                        AndroidUtilities.runOnUIThread(new i90(this, n90Var, 0), Math.max(0L, (n90Var.f25472p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                n90Var.c();
                this.d = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public final void l(q90 q90Var, boolean z10) {
        if (q90Var != null) {
            for (int i10 = 0; i10 < this.f24321f; i10++) {
                if (((Pair) this.e.get(i10)).first == q90Var) {
                    m(i10, z10);
                    return;
                }
            }
        }
    }

    public final void m(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f24321f) {
            ArrayList arrayList = this.e;
            Pair pair = (Pair) arrayList.get(i10);
            if (pair != null) {
                q90 q90Var = (q90) pair.first;
                if (z10) {
                    if (!q90Var.b()) {
                        if (!q90Var.c()) {
                            q90Var.a();
                        }
                        hy hyVar = new hy(17, this, q90Var);
                        long j3 = 0;
                        if (q90Var.f26347c > 0) {
                            j3 = 320 - (SystemClock.elapsedRealtime() - q90Var.f26347c);
                        }
                        AndroidUtilities.runOnUIThread(hyVar, j3);
                        return;
                    }
                    l(q90Var, false);
                    return;
                }
                arrayList.remove(pair);
                q90Var.f26346b = -1L;
                q90Var.f26347c = -1L;
                this.f24321f = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public j90(View view) {
        this.f24318a = view;
    }
}
