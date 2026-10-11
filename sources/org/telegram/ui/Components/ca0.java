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
public final class ca0 {
    public View f25170a;
    public org.telegram.ui.Cells.b1 f25171b;
    public final ArrayList f25172c = new ArrayList();
    public int d = 0;
    public final ArrayList f25173e = new ArrayList();
    public int f25174f = 0;

    public ca0() {
    }

    public static ja0 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            z90 z90Var = new z90(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            z90Var.d(layout, spanStart, f7);
            layout.getSelectionPath(spanStart, spanEnd, z90Var);
            ja0 ja0Var = new ja0();
            ja0Var.f27660y = z90Var;
            ja0Var.D = true;
            ja0Var.k(4.0f);
            ja0Var.l();
            return ja0Var;
        }
        return null;
    }

    public final void a(ga0 ga0Var, Object obj) {
        this.f25172c.add(new Pair(ga0Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(ja0 ja0Var, Object obj) {
        this.f25173e.add(new Pair(ja0Var, obj));
        this.f25174f++;
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
                ArrayList arrayList = this.f25172c;
                if (i11 < i12) {
                    ((ga0) ((Pair) arrayList.get(i11)).first).c();
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
        for (int i10 = 0; i10 < this.f25174f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f25174f) {
            ((ja0) ((Pair) this.f25173e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            if (!((ga0) ((Pair) this.f25172c.get(i11)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f25174f; i10++) {
            ArrayList arrayList = this.f25173e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((ja0) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.f25172c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                if (!((ga0) ((Pair) arrayList2.get(i11)).first).a(canvas) && !z10) {
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
            if (!a3Var.f35857c && (view2 = a3Var.f35856b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.f25170a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.b1 b1Var = this.f25171b;
        if (b1Var != null) {
            b1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 >= 0 && i10 < this.d) {
            Pair pair = (Pair) this.f25172c.get(i10);
            ga0 ga0Var = (ga0) pair.first;
            if (ga0Var.f26669p < 0) {
                ga0Var.f26669p = Math.max(ga0Var.f26668o + ga0Var.f26670q, SystemClock.elapsedRealtime());
                h(pair.second, true);
                AndroidUtilities.runOnUIThread(new ba0(this, ga0Var, 1), Math.max(0L, (ga0Var.f26669p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void k(ga0 ga0Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (ga0Var != null) {
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                arrayList = this.f25172c;
                if (i10 < i11) {
                    if (((Pair) arrayList.get(i10)).first == ga0Var) {
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
                    if (ga0Var.f26669p < 0) {
                        ga0Var.f26669p = Math.max(ga0Var.f26668o + ga0Var.f26670q, SystemClock.elapsedRealtime());
                        h(pair.second, true);
                        AndroidUtilities.runOnUIThread(new ba0(this, ga0Var, 0), Math.max(0L, (ga0Var.f26669p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                ga0Var.c();
                this.d = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public final void l(ja0 ja0Var, boolean z10) {
        if (ja0Var != null) {
            for (int i10 = 0; i10 < this.f25174f; i10++) {
                if (((Pair) this.f25173e.get(i10)).first == ja0Var) {
                    m(i10, z10);
                    return;
                }
            }
        }
    }

    public final void m(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f25174f) {
            ArrayList arrayList = this.f25173e;
            Pair pair = (Pair) arrayList.get(i10);
            if (pair != null) {
                ja0 ja0Var = (ja0) pair.first;
                if (z10) {
                    if (!ja0Var.c()) {
                        if (!ja0Var.d()) {
                            ja0Var.a();
                        }
                        bs bsVar = new bs(25, this, ja0Var);
                        long j3 = 0;
                        if (ja0Var.f27641c > 0) {
                            j3 = 320 - (SystemClock.elapsedRealtime() - ja0Var.f27641c);
                        }
                        AndroidUtilities.runOnUIThread(bsVar, j3);
                        return;
                    }
                    l(ja0Var, false);
                    return;
                }
                arrayList.remove(pair);
                ja0Var.f27640b = -1L;
                ja0Var.f27641c = -1L;
                this.f25174f = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public ca0(View view) {
        this.f25170a = view;
    }
}
