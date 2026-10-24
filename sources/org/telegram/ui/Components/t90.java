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
public final class t90 {
    public View f30763a;
    public org.telegram.ui.Cells.a1 f30764b;
    public final ArrayList f30765c = new ArrayList();
    public int d = 0;
    public final ArrayList e = new ArrayList();
    public int f30766f = 0;

    public t90() {
    }

    public static aa0 i(Layout layout, CharacterStyle characterStyle, float f7) {
        if (layout != null && characterStyle != null && (layout.getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) layout.getText();
            q90 q90Var = new q90(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            q90Var.d(layout, spanStart, f7);
            layout.getSelectionPath(spanStart, spanEnd, q90Var);
            aa0 aa0Var = new aa0();
            aa0Var.f24704y = q90Var;
            aa0Var.D = true;
            aa0Var.k(4.0f);
            aa0Var.l();
            return aa0Var;
        }
        return null;
    }

    public final void a(x90 x90Var, Object obj) {
        this.f30765c.add(new Pair(x90Var, obj));
        this.d++;
        h(obj, true);
    }

    public final void b(aa0 aa0Var, Object obj) {
        this.e.add(new Pair(aa0Var, obj));
        this.f30766f++;
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
                ArrayList arrayList = this.f30765c;
                if (i11 < i12) {
                    ((x90) ((Pair) arrayList.get(i11)).first).c();
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
        for (int i10 = 0; i10 < this.f30766f; i10++) {
            m(i10, true);
        }
    }

    public final boolean f(Canvas canvas) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f30766f) {
            ((aa0) ((Pair) this.e.get(i10)).first).draw(canvas);
            i10++;
            z10 = true;
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            if (!((x90) ((Pair) this.f30765c.get(i11)).first).a(canvas) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean g(Canvas canvas, Object obj) {
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f30766f; i10++) {
            ArrayList arrayList = this.e;
            if (((Pair) arrayList.get(i10)).second == obj) {
                ((aa0) ((Pair) arrayList.get(i10)).first).draw(canvas);
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < this.d; i11++) {
            ArrayList arrayList2 = this.f30765c;
            if (((Pair) arrayList2.get(i11)).second == obj) {
                if (!((x90) ((Pair) arrayList2.get(i11)).first).a(canvas) && !z10) {
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
            if (!c3Var.f36204c && (view2 = c3Var.f36203b) != null) {
                view2.invalidate();
            }
        } else if (z10 && (view = this.f30763a) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.a1 a1Var = this.f30764b;
        if (a1Var != null) {
            a1Var.run();
        }
    }

    public final void j(int i10) {
        if (i10 >= 0 && i10 < this.d) {
            Pair pair = (Pair) this.f30765c.get(i10);
            x90 x90Var = (x90) pair.first;
            if (x90Var.f32551p < 0) {
                x90Var.f32551p = Math.max(x90Var.f32550o + x90Var.f32552q, SystemClock.elapsedRealtime());
                h(pair.second, true);
                AndroidUtilities.runOnUIThread(new s90(this, x90Var, 1), Math.max(0L, (x90Var.f32551p - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final void k(x90 x90Var, boolean z10) {
        ArrayList arrayList;
        Pair pair;
        if (x90Var != null) {
            int i10 = 0;
            while (true) {
                int i11 = this.d;
                arrayList = this.f30765c;
                if (i10 < i11) {
                    if (((Pair) arrayList.get(i10)).first == x90Var) {
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
                    if (x90Var.f32551p < 0) {
                        x90Var.f32551p = Math.max(x90Var.f32550o + x90Var.f32552q, SystemClock.elapsedRealtime());
                        h(pair.second, true);
                        AndroidUtilities.runOnUIThread(new s90(this, x90Var, 0), Math.max(0L, (x90Var.f32551p - SystemClock.elapsedRealtime()) + 175));
                        return;
                    }
                    return;
                }
                arrayList.remove(pair);
                x90Var.c();
                this.d = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public final void l(aa0 aa0Var, boolean z10) {
        if (aa0Var != null) {
            for (int i10 = 0; i10 < this.f30766f; i10++) {
                if (((Pair) this.e.get(i10)).first == aa0Var) {
                    m(i10, z10);
                    return;
                }
            }
        }
    }

    public final void m(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f30766f) {
            ArrayList arrayList = this.e;
            Pair pair = (Pair) arrayList.get(i10);
            if (pair != null) {
                aa0 aa0Var = (aa0) pair.first;
                if (z10) {
                    if (!aa0Var.c()) {
                        if (!aa0Var.d()) {
                            aa0Var.a();
                        }
                        wt wtVar = new wt(21, this, aa0Var);
                        long j10 = 0;
                        if (aa0Var.f24686c > 0) {
                            j10 = 320 - (SystemClock.elapsedRealtime() - aa0Var.f24686c);
                        }
                        AndroidUtilities.runOnUIThread(wtVar, j10);
                        return;
                    }
                    l(aa0Var, false);
                    return;
                }
                arrayList.remove(pair);
                aa0Var.f24685b = -1L;
                aa0Var.f24686c = -1L;
                this.f30766f = arrayList.size();
                h(pair.second, true);
            }
        }
    }

    public t90(View view) {
        this.f30763a = view;
    }
}
