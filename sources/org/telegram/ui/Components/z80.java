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
public final class z80 {
    public View f30500a;
    public org.telegram.ui.Cells.b1 f30501b;
    public final ArrayList f30502c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f30503f = 0;

    public z80() {
    }

    public static g90 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            w80 w80Var = new w80(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            w80Var.d(layout, spanStart, f7);
            layout.getSelectionPath(spanStart, spanEnd, w80Var);
            g90 g90Var = new g90();
            g90Var.f24280x = w80Var;
            g90Var.C = true;
            g90Var.j(4.0f);
            g90Var.k();
            return g90Var;
        }
        return null;
    }

    public final void a(d90 d90Var, Object obj) {
        this.f30502c.add(new Pair(d90Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(g90 g90Var, Object obj) {
        this.e.add(new Pair(g90Var, obj));
        this.f30503f++;
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
                ArrayList arrayList = this.f30502c;
                if (i11 < i12) {
                    ((d90) ((Pair) arrayList.get(i11)).first).c();
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
        for (int i10 = 0; i10 < this.f30503f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f30503f) {
            ((g90) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            if (!((d90) ((Pair) this.f30502c.get(i11)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f30503f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((g90) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.f30502c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                if (!((d90) ((Pair) arrayList2.get(i11)).first).a(canvas) && !z10) {
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
            if (!a3Var.f31675c && (view2 = a3Var.f31674b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.f30500a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.b1 b1Var = this.f30501b;
        if (b1Var != null) {
            b1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 >= 0 && i10 < this.d) {
            Pair pair = (Pair) this.f30502c.get(i10);
            d90 d90Var = (d90) pair.first;
            if (d90Var.f23255p < 0) {
                d90Var.f23255p = Math.max(d90Var.f23254o + d90Var.f23256q, SystemClock.elapsedRealtime());
                h(pair.second, true);
                AndroidUtilities.runOnUIThread(new y80(this, d90Var, 1), Math.max(0L, (d90Var.f23255p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void k(d90 d90Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (d90Var != null) {
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                arrayList = this.f30502c;
                if (i10 < i11) {
                    if (((Pair) arrayList.get(i10)).first == d90Var) {
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
                    if (d90Var.f23255p < 0) {
                        d90Var.f23255p = Math.max(d90Var.f23254o + d90Var.f23256q, SystemClock.elapsedRealtime());
                        h(pair.second, true);
                        AndroidUtilities.runOnUIThread(new y80(this, d90Var, 0), Math.max(0L, (d90Var.f23255p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                d90Var.c();
                this.d = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public final void l(g90 g90Var, boolean z10) {
        if (g90Var != null) {
            for (int i10 = 0; i10 < this.f30503f; i10++) {
                if (((Pair) this.e.get(i10)).first == g90Var) {
                    m(i10, z10);
                    return;
                }
            }
        }
    }

    public final void m(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f30503f) {
            ArrayList arrayList = this.e;
            Pair pair = (Pair) arrayList.get(i10);
            if (pair != null) {
                g90 g90Var = (g90) pair.first;
                if (z10) {
                    if (!g90Var.b()) {
                        if (!g90Var.c()) {
                            g90Var.a();
                        }
                        ny nyVar = new ny(14, this, g90Var);
                        long j3 = 0;
                        if (g90Var.f24263c > 0) {
                            j3 = 320 - (SystemClock.elapsedRealtime() - g90Var.f24263c);
                        }
                        AndroidUtilities.runOnUIThread(nyVar, j3);
                        return;
                    }
                    l(g90Var, false);
                    return;
                }
                arrayList.remove(pair);
                g90Var.f24262b = -1L;
                g90Var.f24263c = -1L;
                this.f30503f = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public z80(View view) {
        this.f30500a = view;
    }
}
