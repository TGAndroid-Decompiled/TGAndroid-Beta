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
public final class b90 {
    public View f23603a;
    public org.telegram.ui.Cells.a1 f23604b;
    public final ArrayList f23605c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f23606f = 0;

    public b90() {
    }

    public static i90 i(Layout layout, CharacterStyle characterStyle, float f10) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            y80 y80Var = new y80(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            y80Var.d(layout, spanStart, f10);
            layout.getSelectionPath(spanStart, spanEnd, y80Var);
            i90 i90Var = new i90();
            i90Var.f25651x = y80Var;
            i90Var.C = true;
            i90Var.j(4.0f);
            i90Var.k();
            return i90Var;
        }
        return null;
    }

    public final void a(f90 f90Var, Object obj) {
        this.f23605c.add(new Pair(f90Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(i90 i90Var, Object obj) {
        this.e.add(new Pair(i90Var, obj));
        this.f23606f++;
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
                ArrayList arrayList = this.f23605c;
                if (i11 < i12) {
                    ((f90) ((Pair) arrayList.get(i11)).first).c();
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
        for (int i10 = 0; i10 < this.f23606f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z4 = false;
        while (i10 < this.f23606f) {
            ((i90) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z4 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            if (!((f90) ((Pair) this.f23605c.get(i11)).first).a(canvas) && !z4) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        return z4;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z4 = false;
        for (int i10 = 0; i10 < this.f23606f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((i90) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z4 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.f23605c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                if (!((f90) ((Pair) arrayList2.get(i11)).first).a(canvas) && !z4) {
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
            if (!d3Var.f33495c && (view2 = d3Var.f33494b) != null) {
                view2.invalidate();
            }
        } else if (z4 && (view = this.f23603a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.a1 a1Var = this.f23604b;
        if (a1Var != null) {
            a1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 >= 0 && i10 < this.d) {
            Pair pair = (Pair) this.f23605c.get(i10);
            f90 f90Var = (f90) pair.first;
            if (f90Var.f24822p < 0) {
                f90Var.f24822p = Math.max(f90Var.f24821o + f90Var.f24823q, SystemClock.elapsedRealtime());
                h(pair.second, true);
                AndroidUtilities.runOnUIThread(new a90(this, f90Var, 1), Math.max(0L, (f90Var.f24822p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void k(f90 f90Var, boolean z4) {
        ArrayList arrayList;
        Pair pair;
        if (f90Var != null) {
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                arrayList = this.f23605c;
                if (i10 < i11) {
                    if (((Pair) arrayList.get(i10)).first == f90Var) {
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
                    if (f90Var.f24822p < 0) {
                        f90Var.f24822p = Math.max(f90Var.f24821o + f90Var.f24823q, SystemClock.elapsedRealtime());
                        h(pair.second, true);
                        AndroidUtilities.runOnUIThread(new a90(this, f90Var, 0), Math.max(0L, (f90Var.f24822p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                f90Var.c();
                this.d = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public final void l(i90 i90Var, boolean z4) {
        if (i90Var != null) {
            for (int i10 = 0; i10 < this.f23606f; i10++) {
                if (((Pair) this.e.get(i10)).first == i90Var) {
                    m(i10, z4);
                    return;
                }
            }
        }
    }

    public final void m(int i10, boolean z4) {
        if (i10 >= 0 && i10 < this.f23606f) {
            ArrayList arrayList = this.e;
            Pair pair = (Pair) arrayList.get(i10);
            if (pair != null) {
                i90 i90Var = (i90) pair.first;
                if (z4) {
                    if (!i90Var.b()) {
                        if (!i90Var.c()) {
                            i90Var.a();
                        }
                        i80 i80Var = new i80(2, this, i90Var);
                        long j10 = 0;
                        if (i90Var.f25634c > 0) {
                            j10 = 320 - (SystemClock.elapsedRealtime() - i90Var.f25634c);
                        }
                        AndroidUtilities.runOnUIThread(i80Var, j10);
                        return;
                    }
                    l(i90Var, false);
                    return;
                }
                arrayList.remove(pair);
                i90Var.f25633b = -1L;
                i90Var.f25634c = -1L;
                this.f23606f = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public b90(View view) {
        this.f23603a = view;
    }
}
