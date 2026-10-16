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
public final class aa0 {
    public View f23182a;
    public org.telegram.ui.Cells.b1 f23183b;
    public final ArrayList f23184c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f23185f = 0;

    public aa0() {
    }

    public static ha0 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            x90 x90Var = new x90(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            x90Var.d(layout, spanStart, f7);
            layout.getSelectionPath(spanStart, spanEnd, x90Var);
            ha0 ha0Var = new ha0();
            ha0Var.f25267y = x90Var;
            ha0Var.D = true;
            ha0Var.k(4.0f);
            ha0Var.l();
            return ha0Var;
        }
        return null;
    }

    public final void a(ea0 ea0Var, Object obj) {
        this.f23184c.add(new Pair(ea0Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(ha0 ha0Var, Object obj) {
        this.e.add(new Pair(ha0Var, obj));
        this.f23185f++;
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
                ArrayList arrayList = this.f23184c;
                if (i11 < i12) {
                    ((ea0) ((Pair) arrayList.get(i11)).first).c();
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
        for (int i10 = 0; i10 < this.f23185f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f23185f) {
            ((ha0) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            if (!((ea0) ((Pair) this.f23184c.get(i11)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f23185f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((ha0) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.f23184c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                if (!((ea0) ((Pair) arrayList2.get(i11)).first).a(canvas) && !z10) {
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
        } else if (obj instanceof org.telegram.ui.d3) {
            org.telegram.ui.d3 d3Var = (org.telegram.ui.d3) obj;
            if (!d3Var.f34857c && (view2 = d3Var.f34856b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.f23182a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.b1 b1Var = this.f23183b;
        if (b1Var != null) {
            b1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 >= 0 && i10 < this.d) {
            Pair pair = (Pair) this.f23184c.get(i10);
            ea0 ea0Var = (ea0) pair.first;
            if (ea0Var.f24364p < 0) {
                ea0Var.f24364p = Math.max(ea0Var.f24363o + ea0Var.f24365q, SystemClock.elapsedRealtime());
                h(pair.second, true);
                AndroidUtilities.runOnUIThread(new z90(this, ea0Var, 1), Math.max(0L, (ea0Var.f24364p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void k(ea0 ea0Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (ea0Var != null) {
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                arrayList = this.f23184c;
                if (i10 < i11) {
                    if (((Pair) arrayList.get(i10)).first == ea0Var) {
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
                    if (ea0Var.f24364p < 0) {
                        ea0Var.f24364p = Math.max(ea0Var.f24363o + ea0Var.f24365q, SystemClock.elapsedRealtime());
                        h(pair.second, true);
                        AndroidUtilities.runOnUIThread(new z90(this, ea0Var, 0), Math.max(0L, (ea0Var.f24364p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                ea0Var.c();
                this.d = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public final void l(ha0 ha0Var, boolean z10) {
        if (ha0Var != null) {
            for (int i10 = 0; i10 < this.f23185f; i10++) {
                if (((Pair) this.e.get(i10)).first == ha0Var) {
                    m(i10, z10);
                    return;
                }
            }
        }
    }

    public final void m(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f23185f) {
            ArrayList arrayList = this.e;
            Pair pair = (Pair) arrayList.get(i10);
            if (pair != null) {
                ha0 ha0Var = (ha0) pair.first;
                if (z10) {
                    if (!ha0Var.c()) {
                        if (!ha0Var.d()) {
                            ha0Var.a();
                        }
                        g90 g90Var = new g90(2, this, ha0Var);
                        long j10 = 0;
                        if (ha0Var.f25249c > 0) {
                            j10 = 320 - (SystemClock.elapsedRealtime() - ha0Var.f25249c);
                        }
                        AndroidUtilities.runOnUIThread(g90Var, j10);
                        return;
                    }
                    l(ha0Var, false);
                    return;
                }
                arrayList.remove(pair);
                ha0Var.f25248b = -1L;
                ha0Var.f25249c = -1L;
                this.f23185f = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public aa0(View view) {
        this.f23182a = view;
    }
}
