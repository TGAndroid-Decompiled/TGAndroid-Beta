package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.NoCopySpan;
import android.text.SpanWatcher;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import b8.hf;
import java.util.ArrayList;
import java.util.Arrays;
public class h9 extends u9 {
    public boolean E0;
    public int f29354r0;
    public int f29357u0;
    public u4.b0 f29362z0;
    public int f29352p0 = -1;
    public int f29353q0 = -1;
    public int f29355s0 = -1;
    public int f29356t0 = -1;
    public int f29358v0 = -1;
    public final SparseArray f29359w0 = new SparseArray();
    public final SparseArray f29360x0 = new SparseArray();
    public final SparseIntArray f29361y0 = new SparseIntArray();
    public final ArrayList A0 = new ArrayList();
    public int B0 = -1;
    public int C0 = -1;
    public int D0 = 0;

    public h9() {
        this.Z = true;
    }

    public static CharSequence Y(CharSequence charSequence) {
        Object[] spans;
        if (charSequence == null) {
            return "";
        }
        if (!(charSequence instanceof Spanned)) {
            return charSequence.toString();
        }
        Spanned spanned = (Spanned) charSequence;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.toString());
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            if (!(obj instanceof TextWatcher) && !(obj instanceof SpanWatcher) && !(obj instanceof NoCopySpan)) {
                int spanStart = spanned.getSpanStart(obj);
                int spanEnd = spanned.getSpanEnd(obj);
                if (spanStart >= 0 && spanEnd >= spanStart && spanStart <= spannableStringBuilder.length()) {
                    spannableStringBuilder.setSpan(obj, spanStart, Math.min(spanEnd, spannableStringBuilder.length()), spanned.getSpanFlags(obj));
                }
            }
        }
        return spannableStringBuilder;
    }

    @Override
    public final void A(int i3, int i10, boolean z10, float f10, float f11, p9 p9Var) {
        g9 g9Var = (g9) p9Var;
        if (z10 && g9Var == this.W && f11 == f10) {
            if (this.f30675j) {
                this.f30691u = i3;
                return;
            } else {
                this.v = i3;
                return;
            }
        }
        super.A(i3, i10, z10, f10, f11, g9Var);
    }

    @Override
    public void F() {
        int i3;
        int d02 = d0((g9) this.W);
        if (this.E0) {
            i3 = this.f29353q0;
        } else {
            i3 = this.f29356t0;
        }
        if (d02 == this.f29352p0 && i3 == this.f29353q0) {
            this.f29354r0 = this.f30691u;
        }
        if (d02 == this.f29355s0 && i3 == this.f29356t0) {
            this.f29357u0 = this.v;
        }
    }

    @Override
    public final void L(p9 p9Var, p9 p9Var2) {
        g9 g9Var = (g9) p9Var;
        g9 g9Var2 = (g9) p9Var2;
        int d02 = d0(g9Var);
        if (d02 >= 0) {
            this.f29355s0 = d02;
            this.f29352p0 = d02;
            int i3 = this.f29358v0;
            this.f29356t0 = i3;
            this.f29353q0 = i3;
            ArrayList arrayList = this.A0;
            arrayList.clear();
            g9Var.k(arrayList);
            int size = arrayList.size();
            this.f29361y0.put(d02, size);
            for (int i10 = 0; i10 < size; i10++) {
                W(d02, i10, (s9) arrayList.get(i10));
            }
        }
    }

    @Override
    public final void N() {
        g9 g9Var;
        if (x()) {
            this.E0 = false;
            int i3 = this.f29355s0;
            if (i3 >= 0) {
                u4.b0 b0Var = this.f29362z0;
                if (b0Var != null) {
                    g9Var = (g9) b0Var.m(i3);
                } else if (i3 < this.F.getChildCount()) {
                    g9Var = (g9) this.F.getChildAt(this.f29355s0);
                } else {
                    g9Var = null;
                }
                if (g9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = g9Var;
                if (this.f29352p0 != this.f29355s0) {
                    this.f30691u = 0;
                } else if (this.f29353q0 != this.f29356t0) {
                    this.f30691u = 0;
                } else {
                    this.f30691u = this.f29354r0;
                }
                this.v = this.f29357u0;
                CharSequence s6 = s(g9Var, false);
                if (this.v > s6.length()) {
                    this.v = s6.length();
                }
                ArrayList arrayList = this.A0;
                arrayList.clear();
                ((g9) this.W).k(arrayList);
                int i10 = this.f29356t0;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    this.f30659a = ((s9) arrayList.get(this.f29356t0)).getX();
                    this.f30661b = ((s9) arrayList.get(this.f29356t0)).getY();
                }
            }
        }
    }

    @Override
    public final void O() {
        g9 g9Var;
        if (x()) {
            this.E0 = true;
            int i3 = this.f29352p0;
            if (i3 >= 0) {
                u4.b0 b0Var = this.f29362z0;
                if (b0Var != null) {
                    g9Var = (g9) b0Var.m(i3);
                } else if (this.f29355s0 < this.F.getChildCount()) {
                    g9Var = (g9) this.F.getChildAt(this.f29352p0);
                } else {
                    g9Var = null;
                }
                if (g9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = g9Var;
                if (this.f29352p0 != this.f29355s0) {
                    this.v = s(g9Var, false).length();
                } else if (this.f29353q0 != this.f29356t0) {
                    this.v = s(g9Var, false).length();
                } else {
                    this.v = this.f29357u0;
                }
                this.f30691u = this.f29354r0;
                ArrayList arrayList = this.A0;
                arrayList.clear();
                ((g9) this.W).k(arrayList);
                int i10 = this.f29353q0;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    this.f30659a = ((s9) arrayList.get(this.f29353q0)).getX();
                    this.f30661b = ((s9) arrayList.get(this.f29353q0)).getY();
                }
            }
        }
    }

    @Override
    public final boolean P(int i3, int i10) {
        int i11;
        if (this.Z) {
            if (i10 > ((g9) this.W).getTop() && i10 < ((g9) this.W).getBottom()) {
                if (this.E0) {
                    i11 = this.f29353q0;
                } else {
                    i11 = this.f29356t0;
                }
                int c02 = c0((int) (i3 - ((g9) this.W).getX()), (int) (i10 - ((g9) this.W).getY()), (g9) this.W);
                if (c02 != i11 && c02 >= 0) {
                    g9 g9Var = (g9) this.W;
                    g0(g9Var, g9Var, c02);
                    return true;
                }
            } else {
                int childCount = this.F.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    if (f0(this.F.getChildAt(i12))) {
                        g9 g9Var2 = (g9) this.F.getChildAt(i12);
                        if (i10 > g9Var2.getTop() && i10 < g9Var2.getBottom()) {
                            int c03 = c0((int) (i3 - g9Var2.getX()), (int) (i10 - g9Var2.getY()), g9Var2);
                            if (c03 >= 0) {
                                g0((g9) this.W, g9Var2, c03);
                                this.W = g9Var2;
                                return true;
                            }
                        }
                    }
                    i12++;
                }
            }
        }
        return false;
    }

    public final void W(int i3, int i10, s9 s9Var) {
        int i11 = i3 + (i10 << 16);
        this.f29359w0.put(i11, Y(s9Var.getText()));
        CharSequence prefix = s9Var.getPrefix();
        SparseArray sparseArray = this.f29360x0;
        if (prefix == null) {
            sparseArray.remove(i11);
        } else {
            sparseArray.put(i11, Y(prefix));
        }
    }

    public final void X(int i3, String str) {
        this.f29359w0.put(i3, Y(str));
        this.f29360x0.remove(i3);
        SparseIntArray sparseIntArray = this.f29361y0;
        sparseIntArray.put(i3, Math.max(1, sparseIntArray.get(i3)));
    }

    public final void Z(Canvas canvas, g9 g9Var, int i3) {
        s9 s9Var;
        int i10 = org.telegram.ui.ActionBar.k6.ig;
        this.f30684o.setColor(org.telegram.ui.ActionBar.k6.w0(i10, this.f30671g0));
        this.f30686p.setColor(org.telegram.ui.ActionBar.k6.w0(i10, this.f30671g0));
        int d02 = d0(g9Var);
        if (d02 >= 0) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            g9Var.k(arrayList);
            if (i3 >= 0 && i3 < arrayList.size() && (s9Var = (s9) arrayList.get(i3)) != null && s9Var.a() != null && s9Var.a().getText() != null) {
                int i11 = this.f29357u0;
                int length = s9Var.a().getText().length();
                if (i11 > length) {
                    i11 = length;
                }
                int i12 = this.f29352p0;
                if (d02 == i12 && d02 == this.f29355s0) {
                    int i13 = this.f29353q0;
                    int i14 = this.f29356t0;
                    if (i13 == i14 && i13 == i3) {
                        h(canvas, s9Var.a(), this.f29354r0, i11, true, true, 0.0f);
                        return;
                    } else if (i3 == i13) {
                        h(canvas, s9Var.a(), this.f29354r0, length, true, false, 0.0f);
                        return;
                    } else {
                        int i15 = i11;
                        if (i3 == i14) {
                            h(canvas, s9Var.a(), 0, i15, false, true, 0.0f);
                            return;
                        } else if (i3 > i13 && i3 < i14) {
                            h(canvas, s9Var.a(), 0, length, false, false, 0.0f);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                int i16 = i11;
                if (d02 == i12 && this.f29353q0 == i3) {
                    h(canvas, s9Var.a(), this.f29354r0, length, true, false, 0.0f);
                    return;
                }
                int i17 = this.f29355s0;
                if (d02 == i17 && this.f29356t0 == i3) {
                    h(canvas, s9Var.a(), 0, i16, false, true, 0.0f);
                } else if ((d02 > i12 && d02 < i17) || ((d02 == i12 && i3 > this.f29353q0) || (d02 == i17 && i3 < this.f29356t0))) {
                    h(canvas, s9Var.a(), 0, length, false, false, 0.0f);
                }
            }
        }
    }

    public final boolean a0() {
        int i3;
        int length;
        if (x() && this.W != null && this.f29352p0 == this.f29355s0 && (i3 = this.f29353q0) == this.f29356t0) {
            if (i3 < 0) {
                i3 = 0;
            }
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((g9) this.W).k(arrayList);
            if (!arrayList.isEmpty() && i3 < arrayList.size() && (length = ((s9) arrayList.get(i3)).a().getText().length()) > 0 && (this.f29354r0 > 0 || this.f29357u0 < length)) {
                return j0((g9) this.W, i3, 0, length);
            }
        }
        return false;
    }

    public final boolean b0(int i3, int i10, g9 g9Var) {
        int compare;
        int i11;
        int i12;
        int i13;
        int d02 = d0(g9Var);
        if (d02 < 0) {
            return false;
        }
        if (this.B0 < 0) {
            this.B0 = this.f29352p0;
            this.D0 = this.f29353q0;
            this.C0 = this.f29354r0;
        }
        h0(g9Var, d02);
        int i14 = this.B0;
        int i15 = this.D0;
        int i16 = this.C0;
        if (d02 != i14) {
            compare = Integer.compare(d02, i14);
        } else if (i3 != i15) {
            compare = Integer.compare(i3, i15);
        } else {
            compare = Integer.compare(i10, i16);
        }
        if (compare < 0) {
            i13 = this.B0;
            i11 = this.D0;
            i12 = this.C0;
        } else {
            int i17 = this.B0;
            i11 = i3;
            i3 = this.D0;
            i12 = i10;
            i10 = this.C0;
            d02 = i17;
            i13 = d02;
        }
        if (d02 == i13 && i3 == i11 && i10 == i12) {
            f(false);
            return true;
        }
        this.f29352p0 = d02;
        this.f29353q0 = i3;
        this.f29354r0 = i10;
        this.f29355s0 = i13;
        this.f29356t0 = i11;
        this.f29357u0 = i12;
        N();
        w();
        t9 t9Var = this.C;
        if (t9Var != null) {
            t9Var.invalidate();
        }
        f fVar = this.m0;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.h3(fVar);
        return true;
    }

    @Override
    public final boolean c(int i3) {
        if (this.f29352p0 == this.f29355s0 && this.f29353q0 == this.f29356t0) {
            return super.c(i3);
        }
        return true;
    }

    public final int c0(int i3, int i10, g9 g9Var) {
        int i11 = 0;
        if (g9Var instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) g9Var;
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                View childAt = viewGroup.getChildAt(i12);
                if (childAt instanceof g9) {
                    float f10 = i10;
                    if (f10 > childAt.getY() && f10 < childAt.getY() + childAt.getHeight()) {
                        return c0((int) (i3 - childAt.getX()), (int) (f10 - childAt.getY()), (g9) childAt);
                    }
                }
            }
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        g9Var.k(arrayList);
        if (arrayList.isEmpty()) {
            return -1;
        }
        int size = arrayList.size() - 1;
        int i13 = Integer.MAX_VALUE;
        int i14 = -1;
        int i15 = Integer.MAX_VALUE;
        while (true) {
            if (size >= 0) {
                s9 s9Var = (s9) arrayList.get(size);
                int y9 = s9Var.getY();
                int height = s9Var.a().getHeight() + y9;
                if (i10 >= y9 && i10 < height) {
                    break;
                }
                int min = Math.min(Math.abs(i10 - y9), Math.abs(i10 - height));
                if (min < i15) {
                    i14 = size;
                    i15 = min;
                }
                size--;
            } else {
                i11 = i15;
                size = i14;
                break;
            }
        }
        if (size < 0) {
            return -1;
        }
        int row = ((s9) arrayList.get(size)).getRow();
        if (row > 0 && i11 < org.telegram.messenger.g0.L(24.0f)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                s9 s9Var2 = (s9) arrayList.get(size2);
                if (s9Var2.getRow() == row) {
                    int x10 = s9Var2.getX();
                    int width = s9Var2.a().getWidth() + s9Var2.getX();
                    if (i3 >= x10 && i3 <= width) {
                        return size2;
                    }
                    int min2 = Math.min(Math.abs(i3 - x10), Math.abs(i3 - width));
                    if (min2 < i13) {
                        size = size2;
                        i13 = min2;
                    }
                }
            }
        }
        return size;
    }

    @Override
    public final boolean d() {
        u4.b0 b0Var = this.f29362z0;
        if (b0Var == null) {
            return true;
        }
        int L0 = b0Var.L0();
        int N0 = this.f29362z0.N0();
        int i3 = this.f29352p0;
        if ((L0 >= i3 && L0 <= this.f29355s0) || (N0 >= i3 && N0 <= this.f29355s0)) {
            return true;
        }
        if (i3 >= L0 && this.f29355s0 <= N0) {
            return true;
        }
        return false;
    }

    public final int d0(g9 g9Var) {
        ViewGroup viewGroup;
        View view = (View) g9Var;
        ViewParent parent = view.getParent();
        while (true) {
            viewGroup = this.F;
            if (parent != viewGroup && parent != null) {
                if (parent instanceof View) {
                    view = (View) parent;
                    parent = view.getParent();
                } else {
                    parent = null;
                    break;
                }
            } else {
                break;
            }
        }
        if (parent != null) {
            if (this.E != null) {
                return RecyclerView.R(view);
            }
            return viewGroup.indexOfChild(view);
        }
        return -1;
    }

    @Override
    public final CharSequence s(g9 g9Var, boolean z10) {
        int i3;
        ArrayList arrayList = this.A0;
        arrayList.clear();
        g9Var.k(arrayList);
        if (z10) {
            i3 = this.f29358v0;
        } else if (this.E0) {
            i3 = this.f29353q0;
        } else {
            i3 = this.f29356t0;
        }
        if (!arrayList.isEmpty() && i3 >= 0 && i3 < arrayList.size()) {
            return ((s9) arrayList.get(i3)).a().getText();
        }
        return "";
    }

    @Override
    public final void f(boolean z10) {
        super.f(z10);
        this.f29352p0 = -1;
        this.f29355s0 = -1;
        this.f29353q0 = -1;
        this.f29356t0 = -1;
        this.f29359w0.clear();
        this.f29361y0.clear();
        this.B0 = -1;
        this.C0 = -1;
    }

    public final boolean f0(View view) {
        if (view instanceof g9) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((g9) view).k(arrayList);
            if (view instanceof org.telegram.ui.t2) {
                return true;
            }
            return !arrayList.isEmpty();
        }
        return false;
    }

    public final void g0(g9 g9Var, g9 g9Var2, int i3) {
        int i10;
        int i11;
        int d02 = d0(g9Var2);
        if (g9Var != null) {
            i10 = d0(g9Var);
        } else {
            i10 = -1;
        }
        w();
        if (this.R && (i11 = this.f29352p0) == this.f29355s0) {
            if (d02 == i11) {
                if (i3 < this.f29353q0) {
                    this.f29353q0 = i3;
                    O();
                    this.f30675j = true;
                    int i12 = this.v;
                    this.f29354r0 = i12;
                    this.f30691u = i12 - 1;
                } else {
                    this.f29356t0 = i3;
                    N();
                    this.f30675j = false;
                    this.f29357u0 = 0;
                }
            } else if (d02 < i11) {
                this.f29352p0 = d02;
                this.f29353q0 = i3;
                O();
                this.f30675j = true;
                int i13 = this.v;
                this.f29354r0 = i13;
                this.f30691u = i13 - 1;
            } else {
                this.f29355s0 = d02;
                this.f29356t0 = i3;
                N();
                this.f30675j = false;
                this.f29357u0 = 0;
            }
        } else if (this.f30675j) {
            if (d02 == i10) {
                int i14 = this.f29356t0;
                if (i3 > i14 && d02 >= this.f29355s0) {
                    this.f29355s0 = d02;
                    this.f29353q0 = i14;
                    this.f29356t0 = i3;
                    this.f29354r0 = this.f29357u0;
                    N();
                    this.f29357u0 = 0;
                    this.f30675j = false;
                } else {
                    this.f29352p0 = d02;
                    this.f29353q0 = i3;
                    O();
                    this.f29354r0 = this.v;
                }
            } else if (d02 <= this.f29355s0) {
                this.f29352p0 = d02;
                this.f29353q0 = i3;
                O();
                this.f29354r0 = this.v;
            } else {
                this.f29355s0 = d02;
                this.f29353q0 = this.f29356t0;
                this.f29356t0 = i3;
                this.f29354r0 = this.f29357u0;
                N();
                this.f29357u0 = 0;
                this.f30675j = false;
            }
        } else if (d02 == i10) {
            int i15 = this.f29353q0;
            if (i3 < i15 && d02 <= this.f29352p0) {
                this.f29352p0 = d02;
                this.f29356t0 = i15;
                this.f29353q0 = i3;
                this.f29357u0 = this.f29354r0;
                O();
                this.f30675j = true;
                this.f29354r0 = this.v;
            } else {
                this.f29355s0 = d02;
                this.f29356t0 = i3;
                N();
                this.f29357u0 = 0;
            }
        } else if (d02 >= this.f29352p0) {
            this.f29355s0 = d02;
            this.f29356t0 = i3;
            N();
            this.f29357u0 = 0;
        } else {
            this.f29352p0 = d02;
            this.f29356t0 = this.f29353q0;
            this.f29353q0 = i3;
            this.f29357u0 = this.f29354r0;
            O();
            this.f30675j = true;
            this.f29354r0 = this.v;
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        g9Var2.k(arrayList);
        int size = arrayList.size();
        this.f29361y0.put(d02, size);
        for (int i16 = 0; i16 < size; i16++) {
            W(d02, i16, (s9) arrayList.get(i16));
        }
    }

    public final void h0(g9 g9Var, int i3) {
        ArrayList arrayList = this.A0;
        arrayList.clear();
        g9Var.k(arrayList);
        int size = arrayList.size();
        this.f29361y0.put(i3, size);
        for (int i10 = 0; i10 < size; i10++) {
            W(i3, i10, (s9) arrayList.get(i10));
        }
    }

    @Override
    public final void i(int i3, k9 k9Var, boolean z10) {
        p9 p9Var;
        int i10;
        ArrayList arrayList = this.A0;
        arrayList.clear();
        k9Var.f29512e = null;
        if (z10) {
            p9Var = this.X;
        } else {
            p9Var = this.W;
        }
        g9 g9Var = (g9) p9Var;
        if (g9Var == null) {
            k9Var.d = null;
            return;
        }
        g9Var.k(arrayList);
        if (z10) {
            i10 = this.f29358v0;
        } else if (this.E0) {
            i10 = this.f29353q0;
        } else {
            i10 = this.f29356t0;
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            k9Var.d = ((s9) arrayList.get(i10)).a();
            k9Var.f29512e = ((s9) arrayList.get(i10)).c();
            k9Var.f29510b = 0.0f;
            k9Var.f29511c = 0.0f;
            return;
        }
        k9Var.d = null;
    }

    public final void i0(int i3, int i10) {
        int length;
        g9 g9Var;
        if (i3 >= 0 && i10 >= i3) {
            CharSequence charSequence = (CharSequence) this.f29359w0.get(i10);
            if (charSequence == null) {
                length = 0;
            } else {
                length = charSequence.length();
            }
            if (this.F != null) {
                for (int i11 = 0; i11 < this.F.getChildCount(); i11++) {
                    View childAt = this.F.getChildAt(i11);
                    if (childAt instanceof g9) {
                        g9Var = (g9) childAt;
                        if (d0(g9Var) == i10) {
                            break;
                        }
                    }
                }
            }
            g9Var = null;
            this.W = g9Var;
            this.f30691u = 0;
            this.v = length;
            this.f29352p0 = i3;
            this.f29355s0 = i10;
            this.f29356t0 = 0;
            this.f29353q0 = 0;
            this.f29354r0 = 0;
            this.f29357u0 = length;
            SparseIntArray sparseIntArray = this.f29361y0;
            sparseIntArray.put(i3, Math.max(1, sparseIntArray.get(i3)));
            sparseIntArray.put(i10, Math.max(1, sparseIntArray.get(i10)));
            this.B0 = i3;
            this.C0 = 0;
            t9 t9Var = this.C;
            if (t9Var != null) {
                t9Var.setVisibility(0);
            }
            U();
            w();
            u();
            f fVar = this.m0;
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar);
            hf hfVar = this.D;
            if (hfVar != null) {
                hfVar.a(true);
            }
        }
    }

    public final boolean j0(g9 g9Var, int i3, int i10, int i11) {
        int d02 = d0(g9Var);
        if (d02 < 0 || i10 == i11) {
            return false;
        }
        int min = Math.min(i10, i11);
        int max = Math.max(i10, i11);
        this.W = g9Var;
        this.f30691u = min;
        this.v = max;
        this.f29355s0 = d02;
        this.f29352p0 = d02;
        this.f29356t0 = i3;
        this.f29353q0 = i3;
        this.f29354r0 = min;
        this.f29357u0 = max;
        this.B0 = d02;
        this.C0 = i10;
        this.D0 = i3;
        h0(g9Var, d02);
        ArrayList arrayList = this.A0;
        if (!arrayList.isEmpty() && i3 >= 0 && i3 < arrayList.size()) {
            this.f30659a = ((s9) arrayList.get(i3)).getX();
            this.f30661b = ((s9) arrayList.get(i3)).getY();
        } else if (!arrayList.isEmpty()) {
            this.f30659a = ((s9) arrayList.get(0)).getX();
            this.f30661b = ((s9) arrayList.get(0)).getY();
        }
        t9 t9Var = this.C;
        if (t9Var != null) {
            t9Var.setVisibility(0);
        }
        U();
        w();
        u();
        f fVar = this.m0;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.h3(fVar);
        hf hfVar = this.D;
        if (hfVar != null) {
            hfVar.a(true);
        }
        g9Var.invalidate();
        return true;
    }

    @Override
    public final int k(int i3, int i10, int i11, int i12, p9 p9Var, boolean z10) {
        int i13;
        g9 g9Var = (g9) p9Var;
        if (g9Var != null) {
            int i14 = i3 - i11;
            int i15 = i10 - i12;
            ArrayList arrayList = this.A0;
            arrayList.clear();
            g9Var.k(arrayList);
            if (z10) {
                i13 = this.f29358v0;
            } else if (this.E0) {
                i13 = this.f29353q0;
            } else {
                i13 = this.f29356t0;
            }
            if (i13 >= 0 && i13 < arrayList.size()) {
                Layout a10 = ((s9) arrayList.get(i13)).a();
                if (i14 < 0) {
                    i14 = 1;
                }
                if (i15 < 0) {
                    i15 = 1;
                }
                if (i14 > a10.getWidth()) {
                    i14 = a10.getWidth();
                }
                if (i15 > a10.getLineBottom(a10.getLineCount() - 1)) {
                    i15 = a10.getLineBottom(a10.getLineCount() - 1) - 1;
                }
                int i16 = 0;
                while (true) {
                    if (i16 < a10.getLineCount()) {
                        if (i15 >= a10.getLineTop(i16) && i15 <= a10.getLineBottom(i16)) {
                            break;
                        }
                        i16++;
                    } else {
                        i16 = -1;
                        break;
                    }
                }
                if (i16 >= 0) {
                    return a10.getOffsetForHorizontal(i16, i14);
                }
            }
        }
        return -1;
    }

    public final void k0(View view, int i3, int i10) {
        if (view instanceof g9) {
            this.f30689s = i3;
            this.f30690t = i10;
            g9 g9Var = (g9) view;
            this.X = g9Var;
            int c02 = c0(i3, i10, g9Var);
            this.f29358v0 = c02;
            if (c02 < 0) {
                this.X = null;
                return;
            }
            ArrayList arrayList = this.A0;
            this.f30663c = ((s9) arrayList.get(c02)).getX();
            this.d = ((s9) arrayList.get(this.f29358v0)).getY();
        }
    }

    public final void l0() {
        if (this.X != null) {
            this.f30669f0.run();
        }
    }

    @Override
    public final int m() {
        int i3;
        if (this.W != null) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((g9) this.W).k(arrayList);
            if (this.E0) {
                i3 = this.f29353q0;
            } else {
                i3 = this.f29356t0;
            }
            if (i3 >= 0 && i3 < arrayList.size()) {
                Layout a10 = ((s9) arrayList.get(i3)).a();
                int i10 = Integer.MAX_VALUE;
                for (int i11 = 0; i11 < a10.getLineCount(); i11++) {
                    int lineBottom = a10.getLineBottom(i11) - a10.getLineTop(i11);
                    if (lineBottom < i10) {
                        i10 = lineBottom;
                    }
                }
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final CharSequence r() {
        j9[] j9VarArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i3 = this.f29352p0;
        while (true) {
            int i10 = this.f29355s0;
            if (i3 > i10) {
                break;
            }
            int i11 = this.f29352p0;
            SparseIntArray sparseIntArray = this.f29361y0;
            SparseArray sparseArray = this.f29359w0;
            SparseArray sparseArray2 = this.f29360x0;
            if (i3 == i11) {
                int i12 = i11 == i10 ? this.f29356t0 : sparseIntArray.get(i3) - 1;
                for (int i13 = this.f29353q0; i13 <= i12; i13++) {
                    int i14 = (i13 << 16) + i3;
                    CharSequence charSequence = (CharSequence) sparseArray.get(i14);
                    if (charSequence != null) {
                        int i15 = this.f29352p0;
                        int i16 = this.f29355s0;
                        if (i15 == i16 && i13 == this.f29356t0 && i13 == this.f29353q0) {
                            int i17 = this.f29357u0;
                            int i18 = this.f29354r0;
                            if (i17 >= i18) {
                                i18 = i17;
                                i17 = i18;
                            }
                            if (i17 < charSequence.length()) {
                                if (i18 > charSequence.length()) {
                                    i18 = charSequence.length();
                                }
                                spannableStringBuilder.append(charSequence.subSequence(i17, i18));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i15 == i16 && i13 == this.f29356t0) {
                            CharSequence charSequence2 = (CharSequence) sparseArray2.get(i14);
                            if (charSequence2 != null) {
                                spannableStringBuilder.append(charSequence2).append(' ');
                            }
                            int i19 = this.f29357u0;
                            if (i19 > charSequence.length()) {
                                i19 = charSequence.length();
                            }
                            spannableStringBuilder.append(charSequence.subSequence(0, i19));
                            spannableStringBuilder.append('\n');
                        } else if (i13 == this.f29353q0) {
                            int i20 = this.f29354r0;
                            if (i20 < charSequence.length()) {
                                spannableStringBuilder.append(charSequence.subSequence(i20, charSequence.length()));
                                spannableStringBuilder.append('\n');
                            }
                        } else {
                            CharSequence charSequence3 = (CharSequence) sparseArray2.get(i14);
                            if (charSequence3 != null) {
                                spannableStringBuilder.append(charSequence3).append(' ');
                            }
                            spannableStringBuilder.append(charSequence);
                            spannableStringBuilder.append('\n');
                        }
                    }
                }
            } else if (i3 == i10) {
                for (int i21 = 0; i21 <= this.f29356t0; i21++) {
                    int i22 = (i21 << 16) + i3;
                    CharSequence charSequence4 = (CharSequence) sparseArray.get(i22);
                    if (charSequence4 != null) {
                        if (this.f29352p0 == this.f29355s0 && i21 == this.f29356t0 && i21 == this.f29353q0) {
                            int i23 = this.f29357u0;
                            int i24 = this.f29354r0;
                            if (i24 < charSequence4.length()) {
                                if (i23 > charSequence4.length()) {
                                    i23 = charSequence4.length();
                                }
                                spannableStringBuilder.append(charSequence4.subSequence(i24, i23));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i21 == this.f29356t0) {
                            CharSequence charSequence5 = (CharSequence) sparseArray2.get(i22);
                            if (charSequence5 != null) {
                                spannableStringBuilder.append(charSequence5).append(' ');
                            }
                            int i25 = this.f29357u0;
                            if (i25 > charSequence4.length()) {
                                i25 = charSequence4.length();
                            }
                            spannableStringBuilder.append(charSequence4.subSequence(0, i25));
                            spannableStringBuilder.append('\n');
                        } else {
                            CharSequence charSequence6 = (CharSequence) sparseArray2.get(i22);
                            if (charSequence6 != null) {
                                spannableStringBuilder.append(charSequence6).append(' ');
                            }
                            spannableStringBuilder.append(charSequence4);
                            spannableStringBuilder.append('\n');
                        }
                    }
                }
            } else {
                int i26 = sparseIntArray.get(i3);
                for (int i27 = this.f29353q0; i27 < i26; i27++) {
                    int i28 = (i27 << 16) + i3;
                    CharSequence charSequence7 = (CharSequence) sparseArray2.get(i28);
                    if (charSequence7 != null) {
                        spannableStringBuilder.append(charSequence7).append(' ');
                    }
                    spannableStringBuilder.append((CharSequence) sparseArray.get(i28));
                    spannableStringBuilder.append('\n');
                }
            }
            i3++;
        }
        if (spannableStringBuilder.length() > 0) {
            n9[] n9VarArr = (n9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, n9.class);
            if (n9VarArr != null && n9VarArr.length > 0) {
                Arrays.sort(n9VarArr, new x0(spannableStringBuilder, 1));
                for (n9 n9Var : n9VarArr) {
                    int spanStart = spannableStringBuilder.getSpanStart(n9Var);
                    int spanEnd = spannableStringBuilder.getSpanEnd(n9Var);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        CharSequence charSequence8 = n9Var.f29716a;
                        if (charSequence8 == null) {
                            charSequence8 = "";
                        }
                        spannableStringBuilder.replace(spanStart, spanEnd, charSequence8);
                    }
                }
            }
            for (j9 j9Var : (j9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, j9.class)) {
                spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(j9Var), spannableStringBuilder.getSpanEnd(j9Var));
            }
            return spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1);
        }
        return null;
    }

    @Override
    public final void w() {
        super.w();
        if (this.F != null) {
            for (int i3 = 0; i3 < this.F.getChildCount(); i3++) {
                this.F.getChildAt(i3).invalidate();
            }
        }
    }
}
