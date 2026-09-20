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
public final class h90 {
    public View f24579a;
    public org.telegram.ui.Cells.b1 f24580b;
    public final ArrayList f24581c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f24582f = 0;

    public h90() {
    }

    public static o90 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            e90 e90Var = new e90(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            e90Var.d(layout, spanStart, f7);
            layout.getSelectionPath(spanStart, spanEnd, e90Var);
            o90 o90Var = new o90();
            o90Var.f26861x = e90Var;
            o90Var.C = true;
            o90Var.j(4.0f);
            o90Var.k();
            return o90Var;
        }
        return null;
    }

    public final void a(l90 l90Var, Object obj) {
        this.f24581c.add(new Pair(l90Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(o90 o90Var, Object obj) {
        this.e.add(new Pair(o90Var, obj));
        this.f24582f++;
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
                ArrayList arrayList = this.f24581c;
                if (i11 < i12) {
                    ((l90) ((Pair) arrayList.get(i11)).first).c();
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
        for (int i10 = 0; i10 < this.f24582f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f24582f) {
            ((o90) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            if (!((l90) ((Pair) this.f24581c.get(i11)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f24582f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((o90) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.f24581c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                if (!((l90) ((Pair) arrayList2.get(i11)).first).a(canvas) && !z10) {
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
            if (!a3Var.f31971c && (view2 = a3Var.f31970b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.f24579a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.b1 b1Var = this.f24580b;
        if (b1Var != null) {
            b1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 >= 0 && i10 < this.d) {
            Pair pair = (Pair) this.f24581c.get(i10);
            l90 l90Var = (l90) pair.first;
            if (l90Var.f26076p < 0) {
                l90Var.f26076p = Math.max(l90Var.f26075o + l90Var.f26077q, SystemClock.elapsedRealtime());
                h(pair.second, true);
                AndroidUtilities.runOnUIThread(new g90(this, l90Var, 1), Math.max(0L, (l90Var.f26076p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void k(l90 l90Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (l90Var != null) {
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                arrayList = this.f24581c;
                if (i10 < i11) {
                    if (((Pair) arrayList.get(i10)).first == l90Var) {
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
                    if (l90Var.f26076p < 0) {
                        l90Var.f26076p = Math.max(l90Var.f26075o + l90Var.f26077q, SystemClock.elapsedRealtime());
                        h(pair.second, true);
                        AndroidUtilities.runOnUIThread(new g90(this, l90Var, 0), Math.max(0L, (l90Var.f26076p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                l90Var.c();
                this.d = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public final void l(o90 o90Var, boolean z10) {
        if (o90Var != null) {
            for (int i10 = 0; i10 < this.f24582f; i10++) {
                if (((Pair) this.e.get(i10)).first == o90Var) {
                    m(i10, z10);
                    return;
                }
            }
        }
    }

    public final void m(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f24582f) {
            ArrayList arrayList = this.e;
            Pair pair = (Pair) arrayList.get(i10);
            if (pair != null) {
                o90 o90Var = (o90) pair.first;
                if (z10) {
                    if (!o90Var.b()) {
                        if (!o90Var.c()) {
                            o90Var.a();
                        }
                        bv bvVar = new bv(20, this, o90Var);
                        long j3 = 0;
                        if (o90Var.f26844c > 0) {
                            j3 = 320 - (SystemClock.elapsedRealtime() - o90Var.f26844c);
                        }
                        AndroidUtilities.runOnUIThread(bvVar, j3);
                        return;
                    }
                    l(o90Var, false);
                    return;
                }
                arrayList.remove(pair);
                o90Var.f26843b = -1L;
                o90Var.f26844c = -1L;
                this.f24582f = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public h90(View view) {
        this.f24579a = view;
    }
}
