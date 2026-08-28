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
public final class i80 {
    public View f29375a;
    public org.telegram.ui.Cells.b1 f29376b;
    public final ArrayList f29377c = new ArrayList();
    public int d = 0;
    public final ArrayList f29378e = new ArrayList();
    public int f29379f = 0;

    public i80() {
    }

    public static p80 i(Layout layout, CharacterStyle characterStyle, float f10) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            f80 f80Var = new f80(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            f80Var.d(layout, spanStart, f10);
            layout.getSelectionPath(spanStart, spanEnd, f80Var);
            p80 p80Var = new p80();
            p80Var.f31591x = f80Var;
            p80Var.C = true;
            p80Var.j(4.0f);
            p80Var.k();
            return p80Var;
        }
        return null;
    }

    public final void a(m80 m80Var, Object obj) {
        this.f29377c.add(new Pair(m80Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(p80 p80Var, Object obj) {
        this.f29378e.add(new Pair(p80Var, obj));
        this.f29379f++;
        h(obj, true);
    }

    public final void c() {
        d(true);
    }

    public final void d(boolean z10) {
        if (z10) {
            for (int i9 = 0; i9 < this.d; i9++) {
                j(i9);
            }
        } else if (this.d > 0) {
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                ArrayList arrayList = this.f29377c;
                if (i10 < i11) {
                    ((m80) ((Pair) arrayList.get(i10)).first).c();
                    h(((Pair) arrayList.get(i10)).second, false);
                    i10++;
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
        for (int i9 = 0; i9 < this.f29379f; i9++) {
            m(i9, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i9 = 0;
        boolean z10 = false;
        while (i9 < this.f29379f) {
            ((p80) ((Pair) this.f29378e.get(i9)).first).draw(canvas);
            i9++;
            z10 = true;
        }
        for (int i10 = 0; i10 < this.d; i10++) {
            if (!((m80) ((Pair) this.f29377c.get(i10)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i9 = 0; i9 < this.f29379f; i9++) {
            ArrayList arrayList = this.f29378e;
            if (((Pair) arrayList.get(i9)).second == obj) {
                ((p80) ((Pair) arrayList.get(i9)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i10 = 0; i10 < this.d; i10++) {
            ArrayList arrayList2 = this.f29377c;
            if (((Pair) arrayList2.get(i10)).second == obj) {
                if (!((m80) ((Pair) arrayList2.get(i10)).first).a(canvas) && !z10) {
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
        } else if (obj instanceof org.telegram.ui.e3) {
            org.telegram.ui.e3 e3Var = (org.telegram.ui.e3) obj;
            if (!e3Var.f37800c && (view2 = e3Var.f37799b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.f29375a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.b1 b1Var = this.f29376b;
        if (b1Var != null) {
            b1Var.run();
        }
    }

    public final void j(int i9) {
        if (i9 >= 0 && i9 < this.d) {
            Pair pair = (Pair) this.f29377c.get(i9);
            m80 m80Var = (m80) pair.first;
            if (m80Var.f30775p < 0) {
                m80Var.f30775p = Math.max(m80Var.f30774o + m80Var.f30776q, SystemClock.elapsedRealtime());
                h(pair.second, true);
                AndroidUtilities.runOnUIThread(new h80(this, m80Var, 1), Math.max(0L, (m80Var.f30775p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void k(m80 m80Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (m80Var != null) {
            int i9 = 0;
            while (true) {
                int i10 = this.d;
                arrayList = this.f29377c;
                if (i9 < i10) {
                    if (((Pair) arrayList.get(i9)).first == m80Var) {
                        pair = (Pair) arrayList.get(i9);
                        break;
                    }
                    i9++;
                } else {
                    pair = null;
                    break;
                }
            }
            if (pair != null) {
                if (z10) {
                    if (m80Var.f30775p < 0) {
                        m80Var.f30775p = Math.max(m80Var.f30774o + m80Var.f30776q, SystemClock.elapsedRealtime());
                        h(pair.second, true);
                        AndroidUtilities.runOnUIThread(new h80(this, m80Var, 0), Math.max(0L, (m80Var.f30775p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                m80Var.c();
                this.d = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public final void l(p80 p80Var, boolean z10) {
        if (p80Var != null) {
            for (int i9 = 0; i9 < this.f29379f; i9++) {
                if (((Pair) this.f29378e.get(i9)).first == p80Var) {
                    m(i9, z10);
                    return;
                }
            }
        }
    }

    public final void m(int i9, boolean z10) {
        if (i9 >= 0 && i9 < this.f29379f) {
            ArrayList arrayList = this.f29378e;
            Pair pair = (Pair) arrayList.get(i9);
            if (pair != null) {
                p80 p80Var = (p80) pair.first;
                if (z10) {
                    if (!p80Var.b()) {
                        if (!p80Var.c()) {
                            p80Var.a();
                        }
                        zq zqVar = new zq(26, this, p80Var);
                        long j10 = 0;
                        if (p80Var.f31573c > 0) {
                            j10 = 320 - (SystemClock.elapsedRealtime() - p80Var.f31573c);
                        }
                        AndroidUtilities.runOnUIThread(zqVar, j10);
                        return;
                    }
                    l(p80Var, false);
                    return;
                }
                arrayList.remove(pair);
                p80Var.f31572b = -1L;
                p80Var.f31573c = -1L;
                this.f29379f = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public i80(View view) {
        this.f29375a = view;
    }
}
