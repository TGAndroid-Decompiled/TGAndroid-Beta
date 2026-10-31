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
import java.util.ArrayList;
import java.util.Arrays;
public class k9 extends w9 {
    public boolean E0;
    public int f22188r0;
    public int f22191u0;
    public s4.a0 f22196z0;
    public int f22186p0 = -1;
    public int f22187q0 = -1;
    public int f22189s0 = -1;
    public int f22190t0 = -1;
    public int f22192v0 = -1;
    public final SparseArray f22193w0 = new SparseArray();
    public final SparseArray f22194x0 = new SparseArray();
    public final SparseIntArray f22195y0 = new SparseIntArray();
    public final ArrayList A0 = new ArrayList();
    public int B0 = -1;
    public int C0 = -1;
    public int D0 = 0;

    public k9() {
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
    public final void A(int i10, int i11, boolean z10, float f7, float f10, r9 r9Var) {
        j9 j9Var = (j9) r9Var;
        if (z10 && j9Var == this.W && f10 == f7) {
            if (this.f23427j) {
                this.f23443u = i10;
                return;
            } else {
                this.v = i10;
                return;
            }
        }
        super.A(i10, i11, z10, f7, f10, j9Var);
    }

    @Override
    public void F() {
        int i10;
        int d02 = d0((j9) this.W);
        if (this.E0) {
            i10 = this.f22187q0;
        } else {
            i10 = this.f22190t0;
        }
        if (d02 == this.f22186p0 && i10 == this.f22187q0) {
            this.f22188r0 = this.f23443u;
        }
        if (d02 == this.f22189s0 && i10 == this.f22190t0) {
            this.f22191u0 = this.v;
        }
    }

    @Override
    public final void L(r9 r9Var, r9 r9Var2) {
        j9 j9Var = (j9) r9Var;
        j9 j9Var2 = (j9) r9Var2;
        int d02 = d0(j9Var);
        if (d02 >= 0) {
            this.f22189s0 = d02;
            this.f22186p0 = d02;
            int i10 = this.f22192v0;
            this.f22190t0 = i10;
            this.f22187q0 = i10;
            ArrayList arrayList = this.A0;
            arrayList.clear();
            j9Var.h(arrayList);
            int size = arrayList.size();
            this.f22195y0.put(d02, size);
            for (int i11 = 0; i11 < size; i11++) {
                W(d02, i11, (u9) arrayList.get(i11));
            }
        }
    }

    @Override
    public final void N() {
        j9 j9Var;
        if (x()) {
            this.E0 = false;
            int i10 = this.f22189s0;
            if (i10 >= 0) {
                s4.a0 a0Var = this.f22196z0;
                if (a0Var != null) {
                    j9Var = (j9) a0Var.m(i10);
                } else if (i10 < this.F.getChildCount()) {
                    j9Var = (j9) this.F.getChildAt(this.f22189s0);
                } else {
                    j9Var = null;
                }
                if (j9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = j9Var;
                if (this.f22186p0 != this.f22189s0) {
                    this.f23443u = 0;
                } else if (this.f22187q0 != this.f22190t0) {
                    this.f23443u = 0;
                } else {
                    this.f23443u = this.f22188r0;
                }
                this.v = this.f22191u0;
                CharSequence s10 = s(j9Var, false);
                if (this.v > s10.length()) {
                    this.v = s10.length();
                }
                ArrayList arrayList = this.A0;
                arrayList.clear();
                ((j9) this.W).h(arrayList);
                int i11 = this.f22190t0;
                if (i11 >= 0 && i11 < arrayList.size()) {
                    this.f23412a = ((u9) arrayList.get(this.f22190t0)).getX();
                    this.f23414b = ((u9) arrayList.get(this.f22190t0)).getY();
                }
            }
        }
    }

    @Override
    public final void O() {
        j9 j9Var;
        if (x()) {
            this.E0 = true;
            int i10 = this.f22186p0;
            if (i10 >= 0) {
                s4.a0 a0Var = this.f22196z0;
                if (a0Var != null) {
                    j9Var = (j9) a0Var.m(i10);
                } else if (this.f22189s0 < this.F.getChildCount()) {
                    j9Var = (j9) this.F.getChildAt(this.f22186p0);
                } else {
                    j9Var = null;
                }
                if (j9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = j9Var;
                if (this.f22186p0 != this.f22189s0) {
                    this.v = s(j9Var, false).length();
                } else if (this.f22187q0 != this.f22190t0) {
                    this.v = s(j9Var, false).length();
                } else {
                    this.v = this.f22191u0;
                }
                this.f23443u = this.f22188r0;
                ArrayList arrayList = this.A0;
                arrayList.clear();
                ((j9) this.W).h(arrayList);
                int i11 = this.f22187q0;
                if (i11 >= 0 && i11 < arrayList.size()) {
                    this.f23412a = ((u9) arrayList.get(this.f22187q0)).getX();
                    this.f23414b = ((u9) arrayList.get(this.f22187q0)).getY();
                }
            }
        }
    }

    @Override
    public final boolean P(int i10, int i11) {
        int i12;
        if (this.Z) {
            if (i11 > ((j9) this.W).getTop() && i11 < ((j9) this.W).getBottom()) {
                if (this.E0) {
                    i12 = this.f22187q0;
                } else {
                    i12 = this.f22190t0;
                }
                int c02 = c0((int) (i10 - ((j9) this.W).getX()), (int) (i11 - ((j9) this.W).getY()), (j9) this.W);
                if (c02 != i12 && c02 >= 0) {
                    j9 j9Var = (j9) this.W;
                    g0(j9Var, j9Var, c02);
                    return true;
                }
            } else {
                int childCount = this.F.getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= childCount) {
                        break;
                    }
                    if (f0(this.F.getChildAt(i13))) {
                        j9 j9Var2 = (j9) this.F.getChildAt(i13);
                        if (i11 > j9Var2.getTop() && i11 < j9Var2.getBottom()) {
                            int c03 = c0((int) (i10 - j9Var2.getX()), (int) (i11 - j9Var2.getY()), j9Var2);
                            if (c03 >= 0) {
                                g0((j9) this.W, j9Var2, c03);
                                this.W = j9Var2;
                                return true;
                            }
                        }
                    }
                    i13++;
                }
            }
        }
        return false;
    }

    public final void W(int i10, int i11, u9 u9Var) {
        int i12 = i10 + (i11 << 16);
        this.f22193w0.put(i12, Y(u9Var.getText()));
        CharSequence prefix = u9Var.getPrefix();
        SparseArray sparseArray = this.f22194x0;
        if (prefix == null) {
            sparseArray.remove(i12);
        } else {
            sparseArray.put(i12, Y(prefix));
        }
    }

    public final void X(int i10, String str) {
        this.f22193w0.put(i10, Y(str));
        this.f22194x0.remove(i10);
        SparseIntArray sparseIntArray = this.f22195y0;
        sparseIntArray.put(i10, Math.max(1, sparseIntArray.get(i10)));
    }

    public final void Z(Canvas canvas, j9 j9Var, int i10) {
        u9 u9Var;
        int i11 = org.telegram.ui.ActionBar.t6.f21028ig;
        this.f23436o.setColor(org.telegram.ui.ActionBar.t6.w0(i11, this.f23423g0));
        this.f23438p.setColor(org.telegram.ui.ActionBar.t6.w0(i11, this.f23423g0));
        int d02 = d0(j9Var);
        if (d02 >= 0) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            j9Var.h(arrayList);
            if (i10 >= 0 && i10 < arrayList.size() && (u9Var = (u9) arrayList.get(i10)) != null && u9Var.a() != null && u9Var.a().getText() != null) {
                int i12 = this.f22191u0;
                int length = u9Var.a().getText().length();
                if (i12 > length) {
                    i12 = length;
                }
                int i13 = this.f22186p0;
                if (d02 == i13 && d02 == this.f22189s0) {
                    int i14 = this.f22187q0;
                    int i15 = this.f22190t0;
                    if (i14 == i15 && i14 == i10) {
                        h(canvas, u9Var.a(), this.f22188r0, i12, true, true, 0.0f);
                        return;
                    } else if (i10 == i14) {
                        h(canvas, u9Var.a(), this.f22188r0, length, true, false, 0.0f);
                        return;
                    } else {
                        int i16 = i12;
                        if (i10 == i15) {
                            h(canvas, u9Var.a(), 0, i16, false, true, 0.0f);
                            return;
                        } else if (i10 > i14 && i10 < i15) {
                            h(canvas, u9Var.a(), 0, length, false, false, 0.0f);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                int i17 = i12;
                if (d02 == i13 && this.f22187q0 == i10) {
                    h(canvas, u9Var.a(), this.f22188r0, length, true, false, 0.0f);
                    return;
                }
                int i18 = this.f22189s0;
                if (d02 == i18 && this.f22190t0 == i10) {
                    h(canvas, u9Var.a(), 0, i17, false, true, 0.0f);
                } else if ((d02 > i13 && d02 < i18) || ((d02 == i13 && i10 > this.f22187q0) || (d02 == i18 && i10 < this.f22190t0))) {
                    h(canvas, u9Var.a(), 0, length, false, false, 0.0f);
                }
            }
        }
    }

    public final boolean a0() {
        int i10;
        int length;
        if (x() && this.W != null && this.f22186p0 == this.f22189s0 && (i10 = this.f22187q0) == this.f22190t0) {
            if (i10 < 0) {
                i10 = 0;
            }
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((j9) this.W).h(arrayList);
            if (!arrayList.isEmpty() && i10 < arrayList.size() && (length = ((u9) arrayList.get(i10)).a().getText().length()) > 0 && (this.f22188r0 > 0 || this.f22191u0 < length)) {
                return j0((j9) this.W, i10, 0, length);
            }
        }
        return false;
    }

    public final boolean b0(int i10, int i11, j9 j9Var) {
        int compare;
        int i12;
        int i13;
        int i14;
        int d02 = d0(j9Var);
        if (d02 < 0) {
            return false;
        }
        if (this.B0 < 0) {
            this.B0 = this.f22186p0;
            this.D0 = this.f22187q0;
            this.C0 = this.f22188r0;
        }
        h0(j9Var, d02);
        int i15 = this.B0;
        int i16 = this.D0;
        int i17 = this.C0;
        if (d02 != i15) {
            compare = Integer.compare(d02, i15);
        } else if (i10 != i16) {
            compare = Integer.compare(i10, i16);
        } else {
            compare = Integer.compare(i11, i17);
        }
        if (compare < 0) {
            i14 = this.B0;
            i12 = this.D0;
            i13 = this.C0;
        } else {
            int i18 = this.B0;
            i12 = i10;
            i10 = this.D0;
            i13 = i11;
            i11 = this.C0;
            d02 = i18;
            i14 = d02;
        }
        if (d02 == i14 && i10 == i12 && i11 == i13) {
            f(false);
            return true;
        }
        this.f22186p0 = d02;
        this.f22187q0 = i10;
        this.f22188r0 = i11;
        this.f22189s0 = i14;
        this.f22190t0 = i12;
        this.f22191u0 = i13;
        N();
        w();
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.invalidate();
        }
        f fVar = this.m0;
        org.telegram.messenger.i0.r(fVar);
        org.telegram.messenger.i0.g3(fVar);
        return true;
    }

    @Override
    public final boolean c(int i10) {
        if (this.f22186p0 == this.f22189s0 && this.f22187q0 == this.f22190t0) {
            return super.c(i10);
        }
        return true;
    }

    public final int c0(int i10, int i11, j9 j9Var) {
        int i12 = 0;
        if (j9Var instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) j9Var;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof j9) {
                    float f7 = i11;
                    if (f7 > childAt.getY() && f7 < childAt.getY() + childAt.getHeight()) {
                        return c0((int) (i10 - childAt.getX()), (int) (f7 - childAt.getY()), (j9) childAt);
                    }
                }
            }
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        j9Var.h(arrayList);
        if (arrayList.isEmpty()) {
            return -1;
        }
        int size = arrayList.size() - 1;
        int i14 = Integer.MAX_VALUE;
        int i15 = -1;
        int i16 = Integer.MAX_VALUE;
        while (true) {
            if (size >= 0) {
                u9 u9Var = (u9) arrayList.get(size);
                int y3 = u9Var.getY();
                int height = u9Var.a().getHeight() + y3;
                if (i11 >= y3 && i11 < height) {
                    break;
                }
                int min = Math.min(Math.abs(i11 - y3), Math.abs(i11 - height));
                if (min < i16) {
                    i15 = size;
                    i16 = min;
                }
                size--;
            } else {
                i12 = i16;
                size = i15;
                break;
            }
        }
        if (size < 0) {
            return -1;
        }
        int row = ((u9) arrayList.get(size)).getRow();
        if (row > 0 && i12 < org.telegram.messenger.i0.L(24.0f)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                u9 u9Var2 = (u9) arrayList.get(size2);
                if (u9Var2.getRow() == row) {
                    int x10 = u9Var2.getX();
                    int width = u9Var2.a().getWidth() + u9Var2.getX();
                    if (i10 >= x10 && i10 <= width) {
                        return size2;
                    }
                    int min2 = Math.min(Math.abs(i10 - x10), Math.abs(i10 - width));
                    if (min2 < i14) {
                        size = size2;
                        i14 = min2;
                    }
                }
            }
        }
        return size;
    }

    @Override
    public final boolean d() {
        s4.a0 a0Var = this.f22196z0;
        if (a0Var == null) {
            return true;
        }
        int L0 = a0Var.L0();
        int N0 = this.f22196z0.N0();
        int i10 = this.f22186p0;
        if ((L0 >= i10 && L0 <= this.f22189s0) || (N0 >= i10 && N0 <= this.f22189s0)) {
            return true;
        }
        if (i10 >= L0 && this.f22189s0 <= N0) {
            return true;
        }
        return false;
    }

    public final int d0(j9 j9Var) {
        ViewGroup viewGroup;
        View view = (View) j9Var;
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
    public final CharSequence s(j9 j9Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.A0;
        arrayList.clear();
        j9Var.h(arrayList);
        if (z10) {
            i10 = this.f22192v0;
        } else if (this.E0) {
            i10 = this.f22187q0;
        } else {
            i10 = this.f22190t0;
        }
        if (!arrayList.isEmpty() && i10 >= 0 && i10 < arrayList.size()) {
            return ((u9) arrayList.get(i10)).a().getText();
        }
        return "";
    }

    @Override
    public final void f(boolean z10) {
        super.f(z10);
        this.f22186p0 = -1;
        this.f22189s0 = -1;
        this.f22187q0 = -1;
        this.f22190t0 = -1;
        this.f22193w0.clear();
        this.f22195y0.clear();
        this.B0 = -1;
        this.C0 = -1;
    }

    public final boolean f0(View view) {
        if (view instanceof j9) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((j9) view).h(arrayList);
            if (view instanceof org.telegram.ui.s2) {
                return true;
            }
            return !arrayList.isEmpty();
        }
        return false;
    }

    public final void g0(j9 j9Var, j9 j9Var2, int i10) {
        int i11;
        int i12;
        int d02 = d0(j9Var2);
        if (j9Var != null) {
            i11 = d0(j9Var);
        } else {
            i11 = -1;
        }
        w();
        if (this.R && (i12 = this.f22186p0) == this.f22189s0) {
            if (d02 == i12) {
                if (i10 < this.f22187q0) {
                    this.f22187q0 = i10;
                    O();
                    this.f23427j = true;
                    int i13 = this.v;
                    this.f22188r0 = i13;
                    this.f23443u = i13 - 1;
                } else {
                    this.f22190t0 = i10;
                    N();
                    this.f23427j = false;
                    this.f22191u0 = 0;
                }
            } else if (d02 < i12) {
                this.f22186p0 = d02;
                this.f22187q0 = i10;
                O();
                this.f23427j = true;
                int i14 = this.v;
                this.f22188r0 = i14;
                this.f23443u = i14 - 1;
            } else {
                this.f22189s0 = d02;
                this.f22190t0 = i10;
                N();
                this.f23427j = false;
                this.f22191u0 = 0;
            }
        } else if (this.f23427j) {
            if (d02 == i11) {
                int i15 = this.f22190t0;
                if (i10 > i15 && d02 >= this.f22189s0) {
                    this.f22189s0 = d02;
                    this.f22187q0 = i15;
                    this.f22190t0 = i10;
                    this.f22188r0 = this.f22191u0;
                    N();
                    this.f22191u0 = 0;
                    this.f23427j = false;
                } else {
                    this.f22186p0 = d02;
                    this.f22187q0 = i10;
                    O();
                    this.f22188r0 = this.v;
                }
            } else if (d02 <= this.f22189s0) {
                this.f22186p0 = d02;
                this.f22187q0 = i10;
                O();
                this.f22188r0 = this.v;
            } else {
                this.f22189s0 = d02;
                this.f22187q0 = this.f22190t0;
                this.f22190t0 = i10;
                this.f22188r0 = this.f22191u0;
                N();
                this.f22191u0 = 0;
                this.f23427j = false;
            }
        } else if (d02 == i11) {
            int i16 = this.f22187q0;
            if (i10 < i16 && d02 <= this.f22186p0) {
                this.f22186p0 = d02;
                this.f22190t0 = i16;
                this.f22187q0 = i10;
                this.f22191u0 = this.f22188r0;
                O();
                this.f23427j = true;
                this.f22188r0 = this.v;
            } else {
                this.f22189s0 = d02;
                this.f22190t0 = i10;
                N();
                this.f22191u0 = 0;
            }
        } else if (d02 >= this.f22186p0) {
            this.f22189s0 = d02;
            this.f22190t0 = i10;
            N();
            this.f22191u0 = 0;
        } else {
            this.f22186p0 = d02;
            this.f22190t0 = this.f22187q0;
            this.f22187q0 = i10;
            this.f22191u0 = this.f22188r0;
            O();
            this.f23427j = true;
            this.f22188r0 = this.v;
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        j9Var2.h(arrayList);
        int size = arrayList.size();
        this.f22195y0.put(d02, size);
        for (int i17 = 0; i17 < size; i17++) {
            W(d02, i17, (u9) arrayList.get(i17));
        }
    }

    public final void h0(j9 j9Var, int i10) {
        ArrayList arrayList = this.A0;
        arrayList.clear();
        j9Var.h(arrayList);
        int size = arrayList.size();
        this.f22195y0.put(i10, size);
        for (int i11 = 0; i11 < size; i11++) {
            W(i10, i11, (u9) arrayList.get(i11));
        }
    }

    @Override
    public final void i(int i10, ge.b bVar, boolean z10) {
        r9 r9Var;
        int i11;
        ArrayList arrayList = this.A0;
        arrayList.clear();
        bVar.e = null;
        if (z10) {
            r9Var = this.X;
        } else {
            r9Var = this.W;
        }
        j9 j9Var = (j9) r9Var;
        if (j9Var == null) {
            bVar.d = null;
            return;
        }
        j9Var.h(arrayList);
        if (z10) {
            i11 = this.f22192v0;
        } else if (this.E0) {
            i11 = this.f22187q0;
        } else {
            i11 = this.f22190t0;
        }
        if (i11 >= 0 && i11 < arrayList.size()) {
            bVar.d = ((u9) arrayList.get(i11)).a();
            bVar.e = ((u9) arrayList.get(i11)).c();
            bVar.f7471b = 0.0f;
            bVar.f7472c = 0.0f;
            return;
        }
        bVar.d = null;
    }

    public final void i0(int i10, int i11) {
        int length;
        j9 j9Var;
        if (i10 >= 0 && i11 >= i10) {
            CharSequence charSequence = (CharSequence) this.f22193w0.get(i11);
            if (charSequence == null) {
                length = 0;
            } else {
                length = charSequence.length();
            }
            if (this.F != null) {
                for (int i12 = 0; i12 < this.F.getChildCount(); i12++) {
                    View childAt = this.F.getChildAt(i12);
                    if (childAt instanceof j9) {
                        j9Var = (j9) childAt;
                        if (d0(j9Var) == i11) {
                            break;
                        }
                    }
                }
            }
            j9Var = null;
            this.W = j9Var;
            this.f23443u = 0;
            this.v = length;
            this.f22186p0 = i10;
            this.f22189s0 = i11;
            this.f22190t0 = 0;
            this.f22187q0 = 0;
            this.f22188r0 = 0;
            this.f22191u0 = length;
            SparseIntArray sparseIntArray = this.f22195y0;
            sparseIntArray.put(i10, Math.max(1, sparseIntArray.get(i10)));
            sparseIntArray.put(i11, Math.max(1, sparseIntArray.get(i11)));
            this.B0 = i10;
            this.C0 = 0;
            v9 v9Var = this.C;
            if (v9Var != null) {
                v9Var.setVisibility(0);
            }
            U();
            w();
            u();
            f fVar = this.m0;
            org.telegram.messenger.i0.r(fVar);
            org.telegram.messenger.i0.g3(fVar);
            w7.x5 x5Var = this.D;
            if (x5Var != null) {
                x5Var.a(true);
            }
        }
    }

    public final boolean j0(j9 j9Var, int i10, int i11, int i12) {
        int d02 = d0(j9Var);
        if (d02 < 0 || i11 == i12) {
            return false;
        }
        int min = Math.min(i11, i12);
        int max = Math.max(i11, i12);
        this.W = j9Var;
        this.f23443u = min;
        this.v = max;
        this.f22189s0 = d02;
        this.f22186p0 = d02;
        this.f22190t0 = i10;
        this.f22187q0 = i10;
        this.f22188r0 = min;
        this.f22191u0 = max;
        this.B0 = d02;
        this.C0 = i11;
        this.D0 = i10;
        h0(j9Var, d02);
        ArrayList arrayList = this.A0;
        if (!arrayList.isEmpty() && i10 >= 0 && i10 < arrayList.size()) {
            this.f23412a = ((u9) arrayList.get(i10)).getX();
            this.f23414b = ((u9) arrayList.get(i10)).getY();
        } else if (!arrayList.isEmpty()) {
            this.f23412a = ((u9) arrayList.get(0)).getX();
            this.f23414b = ((u9) arrayList.get(0)).getY();
        }
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.setVisibility(0);
        }
        U();
        w();
        u();
        f fVar = this.m0;
        org.telegram.messenger.i0.r(fVar);
        org.telegram.messenger.i0.g3(fVar);
        w7.x5 x5Var = this.D;
        if (x5Var != null) {
            x5Var.a(true);
        }
        j9Var.invalidate();
        return true;
    }

    @Override
    public final int k(int i10, int i11, int i12, int i13, r9 r9Var, boolean z10) {
        int i14;
        j9 j9Var = (j9) r9Var;
        if (j9Var != null) {
            int i15 = i10 - i12;
            int i16 = i11 - i13;
            ArrayList arrayList = this.A0;
            arrayList.clear();
            j9Var.h(arrayList);
            if (z10) {
                i14 = this.f22192v0;
            } else if (this.E0) {
                i14 = this.f22187q0;
            } else {
                i14 = this.f22190t0;
            }
            if (i14 >= 0 && i14 < arrayList.size()) {
                Layout a2 = ((u9) arrayList.get(i14)).a();
                if (i15 < 0) {
                    i15 = 1;
                }
                if (i16 < 0) {
                    i16 = 1;
                }
                if (i15 > a2.getWidth()) {
                    i15 = a2.getWidth();
                }
                if (i16 > a2.getLineBottom(a2.getLineCount() - 1)) {
                    i16 = a2.getLineBottom(a2.getLineCount() - 1) - 1;
                }
                int i17 = 0;
                while (true) {
                    if (i17 < a2.getLineCount()) {
                        if (i16 >= a2.getLineTop(i17) && i16 <= a2.getLineBottom(i17)) {
                            break;
                        }
                        i17++;
                    } else {
                        i17 = -1;
                        break;
                    }
                }
                if (i17 >= 0) {
                    return a2.getOffsetForHorizontal(i17, i15);
                }
            }
        }
        return -1;
    }

    public final void k0(View view, int i10, int i11) {
        if (view instanceof j9) {
            this.f23441s = i10;
            this.f23442t = i11;
            j9 j9Var = (j9) view;
            this.X = j9Var;
            int c02 = c0(i10, i11, j9Var);
            this.f22192v0 = c02;
            if (c02 < 0) {
                this.X = null;
                return;
            }
            ArrayList arrayList = this.A0;
            this.f23416c = ((u9) arrayList.get(c02)).getX();
            this.d = ((u9) arrayList.get(this.f22192v0)).getY();
        }
    }

    public final void l0() {
        if (this.X != null) {
            this.f23421f0.run();
        }
    }

    @Override
    public final int m() {
        int i10;
        if (this.W != null) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((j9) this.W).h(arrayList);
            if (this.E0) {
                i10 = this.f22187q0;
            } else {
                i10 = this.f22190t0;
            }
            if (i10 >= 0 && i10 < arrayList.size()) {
                Layout a2 = ((u9) arrayList.get(i10)).a();
                int i11 = Integer.MAX_VALUE;
                for (int i12 = 0; i12 < a2.getLineCount(); i12++) {
                    int lineBottom = a2.getLineBottom(i12) - a2.getLineTop(i12);
                    if (lineBottom < i11) {
                        i11 = lineBottom;
                    }
                }
                return i11;
            }
        }
        return 0;
    }

    @Override
    public final CharSequence r() {
        m9[] m9VarArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.f22186p0;
        while (true) {
            int i11 = this.f22189s0;
            if (i10 > i11) {
                break;
            }
            int i12 = this.f22186p0;
            SparseIntArray sparseIntArray = this.f22195y0;
            SparseArray sparseArray = this.f22193w0;
            SparseArray sparseArray2 = this.f22194x0;
            if (i10 == i12) {
                int i13 = i12 == i11 ? this.f22190t0 : sparseIntArray.get(i10) - 1;
                for (int i14 = this.f22187q0; i14 <= i13; i14++) {
                    int i15 = (i14 << 16) + i10;
                    CharSequence charSequence = (CharSequence) sparseArray.get(i15);
                    if (charSequence != null) {
                        int i16 = this.f22186p0;
                        int i17 = this.f22189s0;
                        if (i16 == i17 && i14 == this.f22190t0 && i14 == this.f22187q0) {
                            int i18 = this.f22191u0;
                            int i19 = this.f22188r0;
                            if (i18 >= i19) {
                                i19 = i18;
                                i18 = i19;
                            }
                            if (i18 < charSequence.length()) {
                                if (i19 > charSequence.length()) {
                                    i19 = charSequence.length();
                                }
                                spannableStringBuilder.append(charSequence.subSequence(i18, i19));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i16 == i17 && i14 == this.f22190t0) {
                            CharSequence charSequence2 = (CharSequence) sparseArray2.get(i15);
                            if (charSequence2 != null) {
                                spannableStringBuilder.append(charSequence2).append(' ');
                            }
                            int i20 = this.f22191u0;
                            if (i20 > charSequence.length()) {
                                i20 = charSequence.length();
                            }
                            spannableStringBuilder.append(charSequence.subSequence(0, i20));
                            spannableStringBuilder.append('\n');
                        } else if (i14 == this.f22187q0) {
                            int i21 = this.f22188r0;
                            if (i21 < charSequence.length()) {
                                spannableStringBuilder.append(charSequence.subSequence(i21, charSequence.length()));
                                spannableStringBuilder.append('\n');
                            }
                        } else {
                            CharSequence charSequence3 = (CharSequence) sparseArray2.get(i15);
                            if (charSequence3 != null) {
                                spannableStringBuilder.append(charSequence3).append(' ');
                            }
                            spannableStringBuilder.append(charSequence);
                            spannableStringBuilder.append('\n');
                        }
                    }
                }
            } else if (i10 == i11) {
                for (int i22 = 0; i22 <= this.f22190t0; i22++) {
                    int i23 = (i22 << 16) + i10;
                    CharSequence charSequence4 = (CharSequence) sparseArray.get(i23);
                    if (charSequence4 != null) {
                        if (this.f22186p0 == this.f22189s0 && i22 == this.f22190t0 && i22 == this.f22187q0) {
                            int i24 = this.f22191u0;
                            int i25 = this.f22188r0;
                            if (i25 < charSequence4.length()) {
                                if (i24 > charSequence4.length()) {
                                    i24 = charSequence4.length();
                                }
                                spannableStringBuilder.append(charSequence4.subSequence(i25, i24));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i22 == this.f22190t0) {
                            CharSequence charSequence5 = (CharSequence) sparseArray2.get(i23);
                            if (charSequence5 != null) {
                                spannableStringBuilder.append(charSequence5).append(' ');
                            }
                            int i26 = this.f22191u0;
                            if (i26 > charSequence4.length()) {
                                i26 = charSequence4.length();
                            }
                            spannableStringBuilder.append(charSequence4.subSequence(0, i26));
                            spannableStringBuilder.append('\n');
                        } else {
                            CharSequence charSequence6 = (CharSequence) sparseArray2.get(i23);
                            if (charSequence6 != null) {
                                spannableStringBuilder.append(charSequence6).append(' ');
                            }
                            spannableStringBuilder.append(charSequence4);
                            spannableStringBuilder.append('\n');
                        }
                    }
                }
            } else {
                int i27 = sparseIntArray.get(i10);
                for (int i28 = this.f22187q0; i28 < i27; i28++) {
                    int i29 = (i28 << 16) + i10;
                    CharSequence charSequence7 = (CharSequence) sparseArray2.get(i29);
                    if (charSequence7 != null) {
                        spannableStringBuilder.append(charSequence7).append(' ');
                    }
                    spannableStringBuilder.append((CharSequence) sparseArray.get(i29));
                    spannableStringBuilder.append('\n');
                }
            }
            i10++;
        }
        if (spannableStringBuilder.length() > 0) {
            p9[] p9VarArr = (p9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, p9.class);
            if (p9VarArr != null && p9VarArr.length > 0) {
                Arrays.sort(p9VarArr, new w0(spannableStringBuilder, 1));
                for (p9 p9Var : p9VarArr) {
                    int spanStart = spannableStringBuilder.getSpanStart(p9Var);
                    int spanEnd = spannableStringBuilder.getSpanEnd(p9Var);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        CharSequence charSequence8 = p9Var.f22467a;
                        if (charSequence8 == null) {
                            charSequence8 = "";
                        }
                        spannableStringBuilder.replace(spanStart, spanEnd, charSequence8);
                    }
                }
            }
            for (m9 m9Var : (m9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, m9.class)) {
                spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(m9Var), spannableStringBuilder.getSpanEnd(m9Var));
            }
            return spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1);
        }
        return null;
    }

    @Override
    public final void w() {
        super.w();
        if (this.F != null) {
            for (int i10 = 0; i10 < this.F.getChildCount(); i10++) {
                this.F.getChildAt(i10).invalidate();
            }
        }
    }
}
