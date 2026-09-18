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
public final class i90 {
    public View f24876a;
    public org.telegram.ui.Cells.b1 f24877b;
    public final ArrayList f24878c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f24879f = 0;

    public i90() {
    }

    public static p90 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            f90 f90Var = new f90(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            f90Var.d(layout, spanStart, f7);
            layout.getSelectionPath(spanStart, spanEnd, f90Var);
            p90 p90Var = new p90();
            p90Var.f27158x = f90Var;
            p90Var.C = true;
            p90Var.j(4.0f);
            p90Var.k();
            return p90Var;
        }
        return null;
    }

    public final void a(m90 m90Var, Object obj) {
        this.f24878c.add(new Pair(m90Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(p90 p90Var, Object obj) {
        this.e.add(new Pair(p90Var, obj));
        this.f24879f++;
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
                ArrayList arrayList = this.f24878c;
                if (i11 < i12) {
                    ((m90) ((Pair) arrayList.get(i11)).first).c();
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
        for (int i10 = 0; i10 < this.f24879f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f24879f) {
            ((p90) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            if (!((m90) ((Pair) this.f24878c.get(i11)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f24879f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((p90) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.f24878c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                if (!((m90) ((Pair) arrayList2.get(i11)).first).a(canvas) && !z10) {
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
        } else if (obj instanceof org.telegram.ui.a3) {
            org.telegram.ui.a3 a3Var = (org.telegram.ui.a3) obj;
            if (!a3Var.f31931c && (view2 = a3Var.f31930b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.f24876a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.b1 b1Var = this.f24877b;
        if (b1Var != null) {
            b1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 >= 0 && i10 < this.d) {
            Pair pair = (Pair) this.f24878c.get(i10);
            m90 m90Var = (m90) pair.first;
            if (m90Var.f26376p < 0) {
                m90Var.f26376p = Math.max(m90Var.f26375o + m90Var.f26377q, SystemClock.elapsedRealtime());
                h(pair.second, true);
                AndroidUtilities.runOnUIThread(new h90(this, m90Var, 1), Math.max(0L, (m90Var.f26376p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void k(m90 m90Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (m90Var != null) {
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                arrayList = this.f24878c;
                if (i10 < i11) {
                    if (((Pair) arrayList.get(i10)).first == m90Var) {
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
                    if (m90Var.f26376p < 0) {
                        m90Var.f26376p = Math.max(m90Var.f26375o + m90Var.f26377q, SystemClock.elapsedRealtime());
                        h(pair.second, true);
                        AndroidUtilities.runOnUIThread(new h90(this, m90Var, 0), Math.max(0L, (m90Var.f26376p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                m90Var.c();
                this.d = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public final void l(p90 p90Var, boolean z10) {
        if (p90Var != null) {
            for (int i10 = 0; i10 < this.f24879f; i10++) {
                if (((Pair) this.e.get(i10)).first == p90Var) {
                    m(i10, z10);
                    return;
                }
            }
        }
    }

    public final void m(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f24879f) {
            ArrayList arrayList = this.e;
            Pair pair = (Pair) arrayList.get(i10);
            if (pair != null) {
                p90 p90Var = (p90) pair.first;
                if (z10) {
                    if (!p90Var.b()) {
                        if (!p90Var.c()) {
                            p90Var.a();
                        }
                        uw uwVar = new uw(18, this, p90Var);
                        long j3 = 0;
                        if (p90Var.f27141c > 0) {
                            j3 = 320 - (SystemClock.elapsedRealtime() - p90Var.f27141c);
                        }
                        AndroidUtilities.runOnUIThread(uwVar, j3);
                        return;
                    }
                    l(p90Var, false);
                    return;
                }
                arrayList.remove(pair);
                p90Var.f27140b = -1L;
                p90Var.f27141c = -1L;
                this.f24879f = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public i90(View view) {
        this.f24876a = view;
    }
}
