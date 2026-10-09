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
public final class ba0 {
    public View f24954a;
    public org.telegram.ui.Cells.b1 f24955b;
    public final ArrayList f24956c = new ArrayList();
    public int d = 0;
    public final ArrayList f24957e = new ArrayList();
    public int f24958f = 0;

    public ba0() {
    }

    public static ia0 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            y90 y90Var = new y90(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            y90Var.d(layout, spanStart, f7);
            layout.getSelectionPath(spanStart, spanEnd, y90Var);
            ia0 ia0Var = new ia0();
            ia0Var.f27341y = y90Var;
            ia0Var.D = true;
            ia0Var.k(4.0f);
            ia0Var.l();
            return ia0Var;
        }
        return null;
    }

    public final void a(fa0 fa0Var, Object obj) {
        this.f24956c.add(new Pair(fa0Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(ia0 ia0Var, Object obj) {
        this.f24957e.add(new Pair(ia0Var, obj));
        this.f24958f++;
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
                ArrayList arrayList = this.f24956c;
                if (i11 < i12) {
                    ((fa0) ((Pair) arrayList.get(i11)).first).c();
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
        for (int i10 = 0; i10 < this.f24958f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f24958f) {
            ((ia0) ((Pair) this.f24957e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            if (!((fa0) ((Pair) this.f24956c.get(i11)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f24958f; i10++) {
            ArrayList arrayList = this.f24957e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((ia0) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.f24956c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                if (!((fa0) ((Pair) arrayList2.get(i11)).first).a(canvas) && !z10) {
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
            if (!b3Var.f36112c && (view2 = b3Var.f36111b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.f24954a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.b1 b1Var = this.f24955b;
        if (b1Var != null) {
            b1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 >= 0 && i10 < this.d) {
            Pair pair = (Pair) this.f24956c.get(i10);
            fa0 fa0Var = (fa0) pair.first;
            if (fa0Var.f26337p < 0) {
                fa0Var.f26337p = Math.max(fa0Var.f26336o + fa0Var.f26338q, SystemClock.elapsedRealtime());
                h(pair.second, true);
                AndroidUtilities.runOnUIThread(new aa0(this, fa0Var, 1), Math.max(0L, (fa0Var.f26337p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void k(fa0 fa0Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (fa0Var != null) {
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                arrayList = this.f24956c;
                if (i10 < i11) {
                    if (((Pair) arrayList.get(i10)).first == fa0Var) {
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
                    if (fa0Var.f26337p < 0) {
                        fa0Var.f26337p = Math.max(fa0Var.f26336o + fa0Var.f26338q, SystemClock.elapsedRealtime());
                        h(pair.second, true);
                        AndroidUtilities.runOnUIThread(new aa0(this, fa0Var, 0), Math.max(0L, (fa0Var.f26337p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                fa0Var.c();
                this.d = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public final void l(ia0 ia0Var, boolean z10) {
        if (ia0Var != null) {
            for (int i10 = 0; i10 < this.f24958f; i10++) {
                if (((Pair) this.f24957e.get(i10)).first == ia0Var) {
                    m(i10, z10);
                    return;
                }
            }
        }
    }

    public final void m(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f24958f) {
            ArrayList arrayList = this.f24957e;
            Pair pair = (Pair) arrayList.get(i10);
            if (pair != null) {
                ia0 ia0Var = (ia0) pair.first;
                if (z10) {
                    if (!ia0Var.c()) {
                        if (!ia0Var.d()) {
                            ia0Var.a();
                        }
                        zr zrVar = new zr(26, this, ia0Var);
                        long j3 = 0;
                        if (ia0Var.f27322c > 0) {
                            j3 = 320 - (SystemClock.elapsedRealtime() - ia0Var.f27322c);
                        }
                        AndroidUtilities.runOnUIThread(zrVar, j3);
                        return;
                    }
                    l(ia0Var, false);
                    return;
                }
                arrayList.remove(pair);
                ia0Var.f27321b = -1L;
                ia0Var.f27322c = -1L;
                this.f24958f = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public ba0(View view) {
        this.f24954a = view;
    }
}
