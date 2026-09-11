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
public final class a90 {
    public View f24307a;
    public org.telegram.ui.Cells.b1 f24308b;
    public final ArrayList f24309c = new ArrayList();
    public int d = 0;
    public final ArrayList f24310e = new ArrayList();
    public int f24311f = 0;

    public a90() {
    }

    public static h90 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            x80 x80Var = new x80(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            x80Var.d(layout, spanStart, f7);
            layout.getSelectionPath(spanStart, spanEnd, x80Var);
            h90 h90Var = new h90();
            h90Var.f26691x = x80Var;
            h90Var.C = true;
            h90Var.j(4.0f);
            h90Var.k();
            return h90Var;
        }
        return null;
    }

    public final void a(e90 e90Var, Object obj) {
        this.f24309c.add(new Pair(e90Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(h90 h90Var, Object obj) {
        this.f24310e.add(new Pair(h90Var, obj));
        this.f24311f++;
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
                ArrayList arrayList = this.f24309c;
                if (i11 < i12) {
                    ((e90) ((Pair) arrayList.get(i11)).first).c();
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
        for (int i10 = 0; i10 < this.f24311f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f24311f) {
            ((h90) ((Pair) this.f24310e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            if (!((e90) ((Pair) this.f24309c.get(i11)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f24311f; i10++) {
            ArrayList arrayList = this.f24310e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((h90) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.f24309c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                if (!((e90) ((Pair) arrayList2.get(i11)).first).a(canvas) && !z10) {
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
        } else if (obj instanceof org.telegram.ui.b3) {
            org.telegram.ui.b3 b3Var = (org.telegram.ui.b3) obj;
            if (!b3Var.f34612c && (view2 = b3Var.f34611b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.f24307a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.b1 b1Var = this.f24308b;
        if (b1Var != null) {
            b1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 >= 0 && i10 < this.d) {
            Pair pair = (Pair) this.f24309c.get(i10);
            e90 e90Var = (e90) pair.first;
            if (e90Var.f25630p < 0) {
                e90Var.f25630p = Math.max(e90Var.f25629o + e90Var.f25631q, SystemClock.elapsedRealtime());
                h(pair.second, true);
                AndroidUtilities.runOnUIThread(new z80(this, e90Var, 1), Math.max(0L, (e90Var.f25630p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void k(e90 e90Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (e90Var != null) {
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                arrayList = this.f24309c;
                if (i10 < i11) {
                    if (((Pair) arrayList.get(i10)).first == e90Var) {
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
                    if (e90Var.f25630p < 0) {
                        e90Var.f25630p = Math.max(e90Var.f25629o + e90Var.f25631q, SystemClock.elapsedRealtime());
                        h(pair.second, true);
                        AndroidUtilities.runOnUIThread(new z80(this, e90Var, 0), Math.max(0L, (e90Var.f25630p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                e90Var.c();
                this.d = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public final void l(h90 h90Var, boolean z10) {
        if (h90Var != null) {
            for (int i10 = 0; i10 < this.f24311f; i10++) {
                if (((Pair) this.f24310e.get(i10)).first == h90Var) {
                    m(i10, z10);
                    return;
                }
            }
        }
    }

    public final void m(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f24311f) {
            ArrayList arrayList = this.f24310e;
            Pair pair = (Pair) arrayList.get(i10);
            if (pair != null) {
                h90 h90Var = (h90) pair.first;
                if (z10) {
                    if (!h90Var.b()) {
                        if (!h90Var.c()) {
                            h90Var.a();
                        }
                        zu zuVar = new zu(20, this, h90Var);
                        long j3 = 0;
                        if (h90Var.f26673c > 0) {
                            j3 = 320 - (SystemClock.elapsedRealtime() - h90Var.f26673c);
                        }
                        AndroidUtilities.runOnUIThread(zuVar, j3);
                        return;
                    }
                    l(h90Var, false);
                    return;
                }
                arrayList.remove(pair);
                h90Var.f26672b = -1L;
                h90Var.f26673c = -1L;
                this.f24311f = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public a90(View view) {
        this.f24307a = view;
    }
}
