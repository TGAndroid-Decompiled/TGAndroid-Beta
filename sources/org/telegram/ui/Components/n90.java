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
public final class n90 {
    public View f26626a;
    public org.telegram.ui.Cells.b1 f26627b;
    public final ArrayList f26628c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f26629f = 0;

    public n90() {
    }

    public static u90 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            k90 k90Var = new k90(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            k90Var.d(layout, spanStart, f7);
            layout.getSelectionPath(spanStart, spanEnd, k90Var);
            u90 u90Var = new u90();
            u90Var.f28821x = k90Var;
            u90Var.C = true;
            u90Var.j(4.0f);
            u90Var.k();
            return u90Var;
        }
        return null;
    }

    public final void a(r90 r90Var, Object obj) {
        this.f26628c.add(new Pair(r90Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(u90 u90Var, Object obj) {
        this.e.add(new Pair(u90Var, obj));
        this.f26629f++;
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
                ArrayList arrayList = this.f26628c;
                if (i11 < i12) {
                    ((r90) ((Pair) arrayList.get(i11)).first).c();
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
        for (int i10 = 0; i10 < this.f26629f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f26629f) {
            ((u90) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            if (!((r90) ((Pair) this.f26628c.get(i11)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f26629f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((u90) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.f26628c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                if (!((r90) ((Pair) arrayList2.get(i11)).first).a(canvas) && !z10) {
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
            if (!b3Var.f32375c && (view2 = b3Var.f32374b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.f26626a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.b1 b1Var = this.f26627b;
        if (b1Var != null) {
            b1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 >= 0 && i10 < this.d) {
            Pair pair = (Pair) this.f26628c.get(i10);
            r90 r90Var = (r90) pair.first;
            if (r90Var.f27888p < 0) {
                r90Var.f27888p = Math.max(r90Var.f27887o + r90Var.f27889q, SystemClock.elapsedRealtime());
                h(pair.second, true);
                AndroidUtilities.runOnUIThread(new m90(this, r90Var, 1), Math.max(0L, (r90Var.f27888p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void k(r90 r90Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (r90Var != null) {
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                arrayList = this.f26628c;
                if (i10 < i11) {
                    if (((Pair) arrayList.get(i10)).first == r90Var) {
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
                    if (r90Var.f27888p < 0) {
                        r90Var.f27888p = Math.max(r90Var.f27887o + r90Var.f27889q, SystemClock.elapsedRealtime());
                        h(pair.second, true);
                        AndroidUtilities.runOnUIThread(new m90(this, r90Var, 0), Math.max(0L, (r90Var.f27888p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                r90Var.c();
                this.d = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public final void l(u90 u90Var, boolean z10) {
        if (u90Var != null) {
            for (int i10 = 0; i10 < this.f26629f; i10++) {
                if (((Pair) this.e.get(i10)).first == u90Var) {
                    m(i10, z10);
                    return;
                }
            }
        }
    }

    public final void m(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f26629f) {
            ArrayList arrayList = this.e;
            Pair pair = (Pair) arrayList.get(i10);
            if (pair != null) {
                u90 u90Var = (u90) pair.first;
                if (z10) {
                    if (!u90Var.b()) {
                        if (!u90Var.c()) {
                            u90Var.a();
                        }
                        xw xwVar = new xw(19, this, u90Var);
                        long j3 = 0;
                        if (u90Var.f28804c > 0) {
                            j3 = 320 - (SystemClock.elapsedRealtime() - u90Var.f28804c);
                        }
                        AndroidUtilities.runOnUIThread(xwVar, j3);
                        return;
                    }
                    l(u90Var, false);
                    return;
                }
                arrayList.remove(pair);
                u90Var.f28803b = -1L;
                u90Var.f28804c = -1L;
                this.f26629f = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public n90(View view) {
        this.f26626a = view;
    }
}
