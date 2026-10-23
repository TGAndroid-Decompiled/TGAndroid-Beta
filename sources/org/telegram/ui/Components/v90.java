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
public final class v90 {
    public View f31391a;
    public org.telegram.ui.Cells.a1 f31392b;
    public final ArrayList f31393c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f31394f = 0;

    public v90() {
    }

    public static ca0 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            s90 s90Var = new s90(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            s90Var.d(layout, spanStart, f7);
            layout.getSelectionPath(spanStart, spanEnd, s90Var);
            ca0 ca0Var = new ca0();
            ca0Var.f25298y = s90Var;
            ca0Var.D = true;
            ca0Var.k(4.0f);
            ca0Var.l();
            return ca0Var;
        }
        return null;
    }

    public final void a(z90 z90Var, Object obj) {
        this.f31393c.add(new Pair(z90Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(ca0 ca0Var, Object obj) {
        this.e.add(new Pair(ca0Var, obj));
        this.f31394f++;
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
                ArrayList arrayList = this.f31393c;
                if (i11 < i12) {
                    ((z90) ((Pair) arrayList.get(i11)).first).c();
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
        for (int i10 = 0; i10 < this.f31394f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f31394f) {
            ((ca0) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            if (!((z90) ((Pair) this.f31393c.get(i11)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f31394f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((ca0) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.f31393c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                if (!((z90) ((Pair) arrayList2.get(i11)).first).a(canvas) && !z10) {
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
            if (!c3Var.f36229c && (view2 = c3Var.f36228b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.f31391a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.a1 a1Var = this.f31392b;
        if (a1Var != null) {
            a1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 >= 0 && i10 < this.d) {
            Pair pair = (Pair) this.f31393c.get(i10);
            z90 z90Var = (z90) pair.first;
            if (z90Var.f33184p < 0) {
                z90Var.f33184p = Math.max(z90Var.f33183o + z90Var.f33185q, SystemClock.elapsedRealtime());
                h(pair.second, true);
                AndroidUtilities.runOnUIThread(new u90(this, z90Var, 1), Math.max(0L, (z90Var.f33184p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void k(z90 z90Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (z90Var != null) {
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                arrayList = this.f31393c;
                if (i10 < i11) {
                    if (((Pair) arrayList.get(i10)).first == z90Var) {
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
                    if (z90Var.f33184p < 0) {
                        z90Var.f33184p = Math.max(z90Var.f33183o + z90Var.f33185q, SystemClock.elapsedRealtime());
                        h(pair.second, true);
                        AndroidUtilities.runOnUIThread(new u90(this, z90Var, 0), Math.max(0L, (z90Var.f33184p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                z90Var.c();
                this.d = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public final void l(ca0 ca0Var, boolean z10) {
        if (ca0Var != null) {
            for (int i10 = 0; i10 < this.f31394f; i10++) {
                if (((Pair) this.e.get(i10)).first == ca0Var) {
                    m(i10, z10);
                    return;
                }
            }
        }
    }

    public final void m(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f31394f) {
            ArrayList arrayList = this.e;
            Pair pair = (Pair) arrayList.get(i10);
            if (pair != null) {
                ca0 ca0Var = (ca0) pair.first;
                if (z10) {
                    if (!ca0Var.c()) {
                        if (!ca0Var.d()) {
                            ca0Var.a();
                        }
                        yt ytVar = new yt(21, this, ca0Var);
                        long j10 = 0;
                        if (ca0Var.f25280c > 0) {
                            j10 = 320 - (SystemClock.elapsedRealtime() - ca0Var.f25280c);
                        }
                        AndroidUtilities.runOnUIThread(ytVar, j10);
                        return;
                    }
                    l(ca0Var, false);
                    return;
                }
                arrayList.remove(pair);
                ca0Var.f25279b = -1L;
                ca0Var.f25280c = -1L;
                this.f31394f = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public v90(View view) {
        this.f31391a = view;
    }
}
