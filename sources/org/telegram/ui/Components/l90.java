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
public final class l90 {
    public View f26012a;
    public org.telegram.ui.Cells.b1 f26013b;
    public final ArrayList f26014c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f26015f = 0;

    public l90() {
    }

    public static s90 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            i90 i90Var = new i90(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            i90Var.d(layout, spanStart, f7);
            layout.getSelectionPath(spanStart, spanEnd, i90Var);
            s90 s90Var = new s90();
            s90Var.f28221x = i90Var;
            s90Var.C = true;
            s90Var.j(4.0f);
            s90Var.k();
            return s90Var;
        }
        return null;
    }

    public final void a(p90 p90Var, Object obj) {
        this.f26014c.add(new Pair(p90Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(s90 s90Var, Object obj) {
        this.e.add(new Pair(s90Var, obj));
        this.f26015f++;
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
                ArrayList arrayList = this.f26014c;
                if (i11 < i12) {
                    ((p90) ((Pair) arrayList.get(i11)).first).c();
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
        for (int i10 = 0; i10 < this.f26015f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f26015f) {
            ((s90) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            if (!((p90) ((Pair) this.f26014c.get(i11)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f26015f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((s90) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.f26014c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                if (!((p90) ((Pair) arrayList2.get(i11)).first).a(canvas) && !z10) {
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
            if (!b3Var.f32299c && (view2 = b3Var.f32298b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.f26012a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.b1 b1Var = this.f26013b;
        if (b1Var != null) {
            b1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 >= 0 && i10 < this.d) {
            Pair pair = (Pair) this.f26014c.get(i10);
            p90 p90Var = (p90) pair.first;
            if (p90Var.f27265p < 0) {
                p90Var.f27265p = Math.max(p90Var.f27264o + p90Var.f27266q, SystemClock.elapsedRealtime());
                h(pair.second, true);
                AndroidUtilities.runOnUIThread(new k90(this, p90Var, 1), Math.max(0L, (p90Var.f27265p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void k(p90 p90Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (p90Var != null) {
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                arrayList = this.f26014c;
                if (i10 < i11) {
                    if (((Pair) arrayList.get(i10)).first == p90Var) {
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
                    if (p90Var.f27265p < 0) {
                        p90Var.f27265p = Math.max(p90Var.f27264o + p90Var.f27266q, SystemClock.elapsedRealtime());
                        h(pair.second, true);
                        AndroidUtilities.runOnUIThread(new k90(this, p90Var, 0), Math.max(0L, (p90Var.f27265p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                p90Var.c();
                this.d = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public final void l(s90 s90Var, boolean z10) {
        if (s90Var != null) {
            for (int i10 = 0; i10 < this.f26015f; i10++) {
                if (((Pair) this.e.get(i10)).first == s90Var) {
                    m(i10, z10);
                    return;
                }
            }
        }
    }

    public final void m(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f26015f) {
            ArrayList arrayList = this.e;
            Pair pair = (Pair) arrayList.get(i10);
            if (pair != null) {
                s90 s90Var = (s90) pair.first;
                if (z10) {
                    if (!s90Var.b()) {
                        if (!s90Var.c()) {
                            s90Var.a();
                        }
                        ww wwVar = new ww(19, this, s90Var);
                        long j3 = 0;
                        if (s90Var.f28204c > 0) {
                            j3 = 320 - (SystemClock.elapsedRealtime() - s90Var.f28204c);
                        }
                        AndroidUtilities.runOnUIThread(wwVar, j3);
                        return;
                    }
                    l(s90Var, false);
                    return;
                }
                arrayList.remove(pair);
                s90Var.f28203b = -1L;
                s90Var.f28204c = -1L;
                this.f26015f = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public l90(View view) {
        this.f26012a = view;
    }
}
