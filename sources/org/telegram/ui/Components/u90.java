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
public final class u90 {
    public View f30913a;
    public org.telegram.ui.Cells.b1 f30914b;
    public final ArrayList f30915c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f30916f = 0;

    public u90() {
    }

    public static ba0 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            r90 r90Var = new r90(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            r90Var.d(layout, spanStart, f7);
            layout.getSelectionPath(spanStart, spanEnd, r90Var);
            ba0 ba0Var = new ba0();
            ba0Var.f24892y = r90Var;
            ba0Var.D = true;
            ba0Var.k(4.0f);
            ba0Var.l();
            return ba0Var;
        }
        return null;
    }

    public final void a(y90 y90Var, Object obj) {
        this.f30915c.add(new Pair(y90Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(ba0 ba0Var, Object obj) {
        this.e.add(new Pair(ba0Var, obj));
        this.f30916f++;
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
                ArrayList arrayList = this.f30915c;
                if (i11 < i12) {
                    ((y90) ((Pair) arrayList.get(i11)).first).c();
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
        for (int i10 = 0; i10 < this.f30916f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f30916f) {
            ((ba0) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            if (!((y90) ((Pair) this.f30915c.get(i11)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f30916f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((ba0) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.f30915c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                if (!((y90) ((Pair) arrayList2.get(i11)).first).a(canvas) && !z10) {
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
            if (!d3Var.f36231c && (view2 = d3Var.f36230b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.f30913a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.b1 b1Var = this.f30914b;
        if (b1Var != null) {
            b1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 >= 0 && i10 < this.d) {
            Pair pair = (Pair) this.f30915c.get(i10);
            y90 y90Var = (y90) pair.first;
            if (y90Var.f32585p < 0) {
                y90Var.f32585p = Math.max(y90Var.f32584o + y90Var.f32586q, SystemClock.elapsedRealtime());
                h(pair.second, true);
                AndroidUtilities.runOnUIThread(new t90(this, y90Var, 1), Math.max(0L, (y90Var.f32585p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void k(y90 y90Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (y90Var != null) {
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                arrayList = this.f30915c;
                if (i10 < i11) {
                    if (((Pair) arrayList.get(i10)).first == y90Var) {
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
                    if (y90Var.f32585p < 0) {
                        y90Var.f32585p = Math.max(y90Var.f32584o + y90Var.f32586q, SystemClock.elapsedRealtime());
                        h(pair.second, true);
                        AndroidUtilities.runOnUIThread(new t90(this, y90Var, 0), Math.max(0L, (y90Var.f32585p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                y90Var.c();
                this.d = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public final void l(ba0 ba0Var, boolean z10) {
        if (ba0Var != null) {
            for (int i10 = 0; i10 < this.f30916f; i10++) {
                if (((Pair) this.e.get(i10)).first == ba0Var) {
                    m(i10, z10);
                    return;
                }
            }
        }
    }

    public final void m(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f30916f) {
            ArrayList arrayList = this.e;
            Pair pair = (Pair) arrayList.get(i10);
            if (pair != null) {
                ba0 ba0Var = (ba0) pair.first;
                if (z10) {
                    if (!ba0Var.c()) {
                        if (!ba0Var.d()) {
                            ba0Var.a();
                        }
                        yt ytVar = new yt(21, this, ba0Var);
                        long j10 = 0;
                        if (ba0Var.f24874c > 0) {
                            j10 = 320 - (SystemClock.elapsedRealtime() - ba0Var.f24874c);
                        }
                        AndroidUtilities.runOnUIThread(ytVar, j10);
                        return;
                    }
                    l(ba0Var, false);
                    return;
                }
                arrayList.remove(pair);
                ba0Var.f24873b = -1L;
                ba0Var.f24874c = -1L;
                this.f30916f = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public u90(View view) {
        this.f30913a = view;
    }
}
