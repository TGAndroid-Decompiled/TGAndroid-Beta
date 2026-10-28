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
public final class x90 {
    public View f34707a;
    public org.telegram.ui.Cells.a1 f34708b;
    public final ArrayList f34709c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f34710f = 0;

    public x90() {
    }

    public static ea0 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            t90 t90Var = new t90(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            t90Var.d(layout, spanStart, f7);
            layout.getSelectionPath(spanStart, spanEnd, t90Var);
            ea0 ea0Var = new ea0();
            ea0Var.f27806y = t90Var;
            ea0Var.D = true;
            ea0Var.k(4.0f);
            ea0Var.l();
            return ea0Var;
        }
        return null;
    }

    public final void a(ba0 ba0Var, Object obj) {
        this.f34709c.add(new Pair(ba0Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(ea0 ea0Var, Object obj) {
        this.e.add(new Pair(ea0Var, obj));
        this.f34710f++;
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
                ArrayList arrayList = this.f34709c;
                if (i11 < i12) {
                    ((ba0) ((Pair) arrayList.get(i11)).first).c();
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
        for (int i10 = 0; i10 < this.f34710f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f34710f) {
            ((ea0) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            if (!((ba0) ((Pair) this.f34709c.get(i11)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f34710f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((ea0) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.f34709c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                if (!((ba0) ((Pair) arrayList2.get(i11)).first).a(canvas) && !z10) {
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
            if (!a3Var.f37662c && (view2 = a3Var.f37661b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.f34707a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.a1 a1Var = this.f34708b;
        if (a1Var != null) {
            a1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 >= 0 && i10 < this.d) {
            Pair pair = (Pair) this.f34709c.get(i10);
            ba0 ba0Var = (ba0) pair.first;
            if (ba0Var.f26787p < 0) {
                ba0Var.f26787p = Math.max(ba0Var.f26786o + ba0Var.f26788q, SystemClock.elapsedRealtime());
                h(pair.second, true);
                AndroidUtilities.runOnUIThread(new w90(this, ba0Var, 1), Math.max(0L, (ba0Var.f26787p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void k(ba0 ba0Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (ba0Var != null) {
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                arrayList = this.f34709c;
                if (i10 < i11) {
                    if (((Pair) arrayList.get(i10)).first == ba0Var) {
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
                    if (ba0Var.f26787p < 0) {
                        ba0Var.f26787p = Math.max(ba0Var.f26786o + ba0Var.f26788q, SystemClock.elapsedRealtime());
                        h(pair.second, true);
                        AndroidUtilities.runOnUIThread(new w90(this, ba0Var, 0), Math.max(0L, (ba0Var.f26787p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                ba0Var.c();
                this.d = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public final void l(ea0 ea0Var, boolean z10) {
        if (ea0Var != null) {
            for (int i10 = 0; i10 < this.f34710f; i10++) {
                if (((Pair) this.e.get(i10)).first == ea0Var) {
                    m(i10, z10);
                    return;
                }
            }
        }
    }

    public final void m(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f34710f) {
            ArrayList arrayList = this.e;
            Pair pair = (Pair) arrayList.get(i10);
            if (pair != null) {
                ea0 ea0Var = (ea0) pair.first;
                if (z10) {
                    if (!ea0Var.c()) {
                        if (!ea0Var.d()) {
                            ea0Var.a();
                        }
                        u90 u90Var = new u90(1, this, ea0Var);
                        long j10 = 0;
                        if (ea0Var.f27788c > 0) {
                            j10 = 320 - (SystemClock.elapsedRealtime() - ea0Var.f27788c);
                        }
                        AndroidUtilities.runOnUIThread(u90Var, j10);
                        return;
                    }
                    l(ea0Var, false);
                    return;
                }
                arrayList.remove(pair);
                ea0Var.f27787b = -1L;
                ea0Var.f27788c = -1L;
                this.f34710f = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public x90(View view) {
        this.f34707a = view;
    }
}
