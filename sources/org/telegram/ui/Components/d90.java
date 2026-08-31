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
public final class d90 {
    public View f26231a;
    public org.telegram.ui.Cells.a1 f26232b;
    public final ArrayList f26233c = new ArrayList();
    public int d = 0;
    public final ArrayList f26234e = new ArrayList();
    public int f26235f = 0;

    public d90() {
    }

    public static k90 i(Layout layout, CharacterStyle characterStyle, float f10) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            z80 z80Var = new z80(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            z80Var.d(layout, spanStart, f10);
            layout.getSelectionPath(spanStart, spanEnd, z80Var);
            k90 k90Var = new k90();
            k90Var.f28348x = z80Var;
            k90Var.C = true;
            k90Var.j(4.0f);
            k90Var.k();
            return k90Var;
        }
        return null;
    }

    public final void a(h90 h90Var, Object obj) {
        this.f26233c.add(new Pair(h90Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(k90 k90Var, Object obj) {
        this.f26234e.add(new Pair(k90Var, obj));
        this.f26235f++;
        h(obj, true);
    }

    public final void c() {
        d(true);
    }

    public final void d(boolean z4) {
        if (z4) {
            for (int i10 = 0; i10 < this.d; i10++) {
                j(i10);
            }
        } else if (this.d > 0) {
            int i11 = 0;
            while (true) {
                int i12 = this.d;
                ArrayList arrayList = this.f26233c;
                if (i11 < i12) {
                    ((h90) ((Pair) arrayList.get(i11)).first).c();
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
        for (int i10 = 0; i10 < this.f26235f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z4 = false;
        while (i10 < this.f26235f) {
            ((k90) ((Pair) this.f26234e.get(i10)).first).draw(canvas);
            i10++;
            z4 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            if (!((h90) ((Pair) this.f26233c.get(i11)).first).a(canvas) && !z4) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        return z4;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z4 = false;
        for (int i10 = 0; i10 < this.f26235f; i10++) {
            ArrayList arrayList = this.f26234e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((k90) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z4 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.f26233c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                if (!((h90) ((Pair) arrayList2.get(i11)).first).a(canvas) && !z4) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            }
        }
        h(obj, false);
        return z4;
    }

    public final void h(Object obj, boolean z4) {
        View view;
        View view2;
        if (obj instanceof View) {
            ((View) obj).invalidate();
        } else if (obj instanceof org.telegram.ui.d3) {
            org.telegram.ui.d3 d3Var = (org.telegram.ui.d3) obj;
            if (!d3Var.f35981c && (view2 = d3Var.f35980b) != null) {
                view2.invalidate();
            }
        } else if (z4 && (view = this.f26231a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.a1 a1Var = this.f26232b;
        if (a1Var != null) {
            a1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 >= 0 && i10 < this.d) {
            Pair pair = (Pair) this.f26233c.get(i10);
            h90 h90Var = (h90) pair.first;
            if (h90Var.f27424p < 0) {
                h90Var.f27424p = Math.max(h90Var.f27423o + h90Var.f27425q, SystemClock.elapsedRealtime());
                h(pair.second, true);
                AndroidUtilities.runOnUIThread(new c90(this, h90Var, 1), Math.max(0L, (h90Var.f27424p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void k(h90 h90Var, boolean z4) {
        ArrayList arrayList;
        Pair pair;
        if (h90Var != null) {
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                arrayList = this.f26233c;
                if (i10 < i11) {
                    if (((Pair) arrayList.get(i10)).first == h90Var) {
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
                if (z4) {
                    if (h90Var.f27424p < 0) {
                        h90Var.f27424p = Math.max(h90Var.f27423o + h90Var.f27425q, SystemClock.elapsedRealtime());
                        h(pair.second, true);
                        AndroidUtilities.runOnUIThread(new c90(this, h90Var, 0), Math.max(0L, (h90Var.f27424p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                h90Var.c();
                this.d = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public final void l(k90 k90Var, boolean z4) {
        if (k90Var != null) {
            for (int i10 = 0; i10 < this.f26235f; i10++) {
                if (((Pair) this.f26234e.get(i10)).first == k90Var) {
                    m(i10, z4);
                    return;
                }
            }
        }
    }

    public final void m(int i10, boolean z4) {
        if (i10 >= 0 && i10 < this.f26235f) {
            ArrayList arrayList = this.f26234e;
            Pair pair = (Pair) arrayList.get(i10);
            if (pair != null) {
                k90 k90Var = (k90) pair.first;
                if (z4) {
                    if (!k90Var.b()) {
                        if (!k90Var.c()) {
                            k90Var.a();
                        }
                        a90 a90Var = new a90(1, this, k90Var);
                        long j10 = 0;
                        if (k90Var.f28330c > 0) {
                            j10 = 320 - (SystemClock.elapsedRealtime() - k90Var.f28330c);
                        }
                        AndroidUtilities.runOnUIThread(a90Var, j10);
                        return;
                    }
                    l(k90Var, false);
                    return;
                }
                arrayList.remove(pair);
                k90Var.f28329b = -1L;
                k90Var.f28330c = -1L;
                this.f26235f = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public d90(View view) {
        this.f26231a = view;
    }
}
