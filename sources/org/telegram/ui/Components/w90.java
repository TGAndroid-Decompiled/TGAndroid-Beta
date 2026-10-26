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
public final class w90 {
    public View f34391a;
    public org.telegram.ui.Cells.a1 f34392b;
    public final ArrayList f34393c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f34394f = 0;

    public w90() {
    }

    public static da0 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            s90 s90Var = new s90(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            s90Var.d(layout, spanStart, f7);
            layout.getSelectionPath(spanStart, spanEnd, s90Var);
            da0 da0Var = new da0();
            da0Var.f27481y = s90Var;
            da0Var.D = true;
            da0Var.k(4.0f);
            da0Var.l();
            return da0Var;
        }
        return null;
    }

    public final void a(aa0 aa0Var, Object obj) {
        this.f34393c.add(new Pair(aa0Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(da0 da0Var, Object obj) {
        this.e.add(new Pair(da0Var, obj));
        this.f34394f++;
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
                ArrayList arrayList = this.f34393c;
                if (i11 < i12) {
                    ((aa0) ((Pair) arrayList.get(i11)).first).c();
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
        for (int i10 = 0; i10 < this.f34394f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f34394f) {
            ((da0) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            if (!((aa0) ((Pair) this.f34393c.get(i11)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f34394f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((da0) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.f34393c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                if (!((aa0) ((Pair) arrayList2.get(i11)).first).a(canvas) && !z10) {
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
            if (!a3Var.f37630c && (view2 = a3Var.f37629b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.f34391a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.a1 a1Var = this.f34392b;
        if (a1Var != null) {
            a1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 >= 0 && i10 < this.d) {
            Pair pair = (Pair) this.f34393c.get(i10);
            aa0 aa0Var = (aa0) pair.first;
            if (aa0Var.f26454p < 0) {
                aa0Var.f26454p = Math.max(aa0Var.f26453o + aa0Var.f26455q, SystemClock.elapsedRealtime());
                h(pair.second, true);
                AndroidUtilities.runOnUIThread(new v90(this, aa0Var, 1), Math.max(0L, (aa0Var.f26454p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void k(aa0 aa0Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (aa0Var != null) {
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                arrayList = this.f34393c;
                if (i10 < i11) {
                    if (((Pair) arrayList.get(i10)).first == aa0Var) {
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
                    if (aa0Var.f26454p < 0) {
                        aa0Var.f26454p = Math.max(aa0Var.f26453o + aa0Var.f26455q, SystemClock.elapsedRealtime());
                        h(pair.second, true);
                        AndroidUtilities.runOnUIThread(new v90(this, aa0Var, 0), Math.max(0L, (aa0Var.f26454p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                aa0Var.c();
                this.d = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public final void l(da0 da0Var, boolean z10) {
        if (da0Var != null) {
            for (int i10 = 0; i10 < this.f34394f; i10++) {
                if (((Pair) this.e.get(i10)).first == da0Var) {
                    m(i10, z10);
                    return;
                }
            }
        }
    }

    public final void m(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f34394f) {
            ArrayList arrayList = this.e;
            Pair pair = (Pair) arrayList.get(i10);
            if (pair != null) {
                da0 da0Var = (da0) pair.first;
                if (z10) {
                    if (!da0Var.c()) {
                        if (!da0Var.d()) {
                            da0Var.a();
                        }
                        t90 t90Var = new t90(1, this, da0Var);
                        long j10 = 0;
                        if (da0Var.f27463c > 0) {
                            j10 = 320 - (SystemClock.elapsedRealtime() - da0Var.f27463c);
                        }
                        AndroidUtilities.runOnUIThread(t90Var, j10);
                        return;
                    }
                    l(da0Var, false);
                    return;
                }
                arrayList.remove(pair);
                da0Var.f27462b = -1L;
                da0Var.f27463c = -1L;
                this.f34394f = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public w90(View view) {
        this.f34391a = view;
    }
}
