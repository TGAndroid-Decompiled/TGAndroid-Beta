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
public class j9 extends w9 {
    public boolean E0;
    public int f30891r0;
    public int f30894u0;
    public v4.b0 f30899z0;
    public int f30889p0 = -1;
    public int f30890q0 = -1;
    public int f30892s0 = -1;
    public int f30893t0 = -1;
    public int f30895v0 = -1;
    public final SparseArray f30896w0 = new SparseArray();
    public final SparseArray f30897x0 = new SparseArray();
    public final SparseIntArray f30898y0 = new SparseIntArray();
    public final ArrayList A0 = new ArrayList();
    public int B0 = -1;
    public int C0 = -1;
    public int D0 = 0;

    public j9() {
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
    public final void A(int i7, int i10, boolean z10, float f10, float f11, r9 r9Var) {
        i9 i9Var = (i9) r9Var;
        if (z10 && i9Var == this.W && f11 == f10) {
            if (this.f32250j) {
                this.f32266u = i7;
                return;
            } else {
                this.v = i7;
                return;
            }
        }
        super.A(i7, i10, z10, f10, f11, i9Var);
    }

    @Override
    public void F() {
        int i7;
        int d02 = d0((i9) this.W);
        if (this.E0) {
            i7 = this.f30890q0;
        } else {
            i7 = this.f30893t0;
        }
        if (d02 == this.f30889p0 && i7 == this.f30890q0) {
            this.f30891r0 = this.f32266u;
        }
        if (d02 == this.f30892s0 && i7 == this.f30893t0) {
            this.f30894u0 = this.v;
        }
    }

    @Override
    public final void L(r9 r9Var, r9 r9Var2) {
        i9 i9Var = (i9) r9Var;
        i9 i9Var2 = (i9) r9Var2;
        int d02 = d0(i9Var);
        if (d02 >= 0) {
            this.f30892s0 = d02;
            this.f30889p0 = d02;
            int i7 = this.f30895v0;
            this.f30893t0 = i7;
            this.f30890q0 = i7;
            ArrayList arrayList = this.A0;
            arrayList.clear();
            i9Var.k(arrayList);
            int size = arrayList.size();
            this.f30898y0.put(d02, size);
            for (int i10 = 0; i10 < size; i10++) {
                W(d02, i10, (u9) arrayList.get(i10));
            }
        }
    }

    @Override
    public final void N() {
        i9 i9Var;
        if (x()) {
            this.E0 = false;
            int i7 = this.f30892s0;
            if (i7 >= 0) {
                v4.b0 b0Var = this.f30899z0;
                if (b0Var != null) {
                    i9Var = (i9) b0Var.m(i7);
                } else if (i7 < this.F.getChildCount()) {
                    i9Var = (i9) this.F.getChildAt(this.f30892s0);
                } else {
                    i9Var = null;
                }
                if (i9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = i9Var;
                if (this.f30889p0 != this.f30892s0) {
                    this.f32266u = 0;
                } else if (this.f30890q0 != this.f30893t0) {
                    this.f32266u = 0;
                } else {
                    this.f32266u = this.f30891r0;
                }
                this.v = this.f30894u0;
                CharSequence s5 = s(i9Var, false);
                if (this.v > s5.length()) {
                    this.v = s5.length();
                }
                ArrayList arrayList = this.A0;
                arrayList.clear();
                ((i9) this.W).k(arrayList);
                int i10 = this.f30893t0;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    this.f32234a = ((u9) arrayList.get(this.f30893t0)).getX();
                    this.f32236b = ((u9) arrayList.get(this.f30893t0)).getY();
                }
            }
        }
    }

    @Override
    public final void O() {
        i9 i9Var;
        if (x()) {
            this.E0 = true;
            int i7 = this.f30889p0;
            if (i7 >= 0) {
                v4.b0 b0Var = this.f30899z0;
                if (b0Var != null) {
                    i9Var = (i9) b0Var.m(i7);
                } else if (this.f30892s0 < this.F.getChildCount()) {
                    i9Var = (i9) this.F.getChildAt(this.f30889p0);
                } else {
                    i9Var = null;
                }
                if (i9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = i9Var;
                if (this.f30889p0 != this.f30892s0) {
                    this.v = s(i9Var, false).length();
                } else if (this.f30890q0 != this.f30893t0) {
                    this.v = s(i9Var, false).length();
                } else {
                    this.v = this.f30894u0;
                }
                this.f32266u = this.f30891r0;
                ArrayList arrayList = this.A0;
                arrayList.clear();
                ((i9) this.W).k(arrayList);
                int i10 = this.f30890q0;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    this.f32234a = ((u9) arrayList.get(this.f30890q0)).getX();
                    this.f32236b = ((u9) arrayList.get(this.f30890q0)).getY();
                }
            }
        }
    }

    @Override
    public final boolean P(int i7, int i10) {
        int i11;
        if (this.Z) {
            if (i10 > ((i9) this.W).getTop() && i10 < ((i9) this.W).getBottom()) {
                if (this.E0) {
                    i11 = this.f30890q0;
                } else {
                    i11 = this.f30893t0;
                }
                int c02 = c0((int) (i7 - ((i9) this.W).getX()), (int) (i10 - ((i9) this.W).getY()), (i9) this.W);
                if (c02 != i11 && c02 >= 0) {
                    i9 i9Var = (i9) this.W;
                    g0(i9Var, i9Var, c02);
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
                        i9 i9Var2 = (i9) this.F.getChildAt(i12);
                        if (i10 > i9Var2.getTop() && i10 < i9Var2.getBottom()) {
                            int c03 = c0((int) (i7 - i9Var2.getX()), (int) (i10 - i9Var2.getY()), i9Var2);
                            if (c03 >= 0) {
                                g0((i9) this.W, i9Var2, c03);
                                this.W = i9Var2;
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

    public final void W(int i7, int i10, u9 u9Var) {
        int i11 = i7 + (i10 << 16);
        this.f30896w0.put(i11, Y(u9Var.getText()));
        CharSequence prefix = u9Var.getPrefix();
        SparseArray sparseArray = this.f30897x0;
        if (prefix == null) {
            sparseArray.remove(i11);
        } else {
            sparseArray.put(i11, Y(prefix));
        }
    }

    public final void X(int i7, String str) {
        this.f30896w0.put(i7, Y(str));
        this.f30897x0.remove(i7);
        SparseIntArray sparseIntArray = this.f30898y0;
        sparseIntArray.put(i7, Math.max(1, sparseIntArray.get(i7)));
    }

    public final void Z(Canvas canvas, i9 i9Var, int i7) {
        u9 u9Var;
        int i10 = org.telegram.ui.ActionBar.m6.f29503lg;
        this.f32259o.setColor(org.telegram.ui.ActionBar.m6.w0(i10, this.f32246g0));
        this.f32261p.setColor(org.telegram.ui.ActionBar.m6.w0(i10, this.f32246g0));
        int d02 = d0(i9Var);
        if (d02 >= 0) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            i9Var.k(arrayList);
            if (i7 >= 0 && i7 < arrayList.size() && (u9Var = (u9) arrayList.get(i7)) != null && u9Var.a() != null && u9Var.a().getText() != null) {
                int i11 = this.f30894u0;
                int length = u9Var.a().getText().length();
                if (i11 > length) {
                    i11 = length;
                }
                int i12 = this.f30889p0;
                if (d02 == i12 && d02 == this.f30892s0) {
                    int i13 = this.f30890q0;
                    int i14 = this.f30893t0;
                    if (i13 == i14 && i13 == i7) {
                        h(canvas, u9Var.a(), this.f30891r0, i11, true, true, 0.0f);
                        return;
                    } else if (i7 == i13) {
                        h(canvas, u9Var.a(), this.f30891r0, length, true, false, 0.0f);
                        return;
                    } else {
                        int i15 = i11;
                        if (i7 == i14) {
                            h(canvas, u9Var.a(), 0, i15, false, true, 0.0f);
                            return;
                        } else if (i7 > i13 && i7 < i14) {
                            h(canvas, u9Var.a(), 0, length, false, false, 0.0f);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                int i16 = i11;
                if (d02 == i12 && this.f30890q0 == i7) {
                    h(canvas, u9Var.a(), this.f30891r0, length, true, false, 0.0f);
                    return;
                }
                int i17 = this.f30892s0;
                if (d02 == i17 && this.f30893t0 == i7) {
                    h(canvas, u9Var.a(), 0, i16, false, true, 0.0f);
                } else if ((d02 > i12 && d02 < i17) || ((d02 == i12 && i7 > this.f30890q0) || (d02 == i17 && i7 < this.f30893t0))) {
                    h(canvas, u9Var.a(), 0, length, false, false, 0.0f);
                }
            }
        }
    }

    public final boolean a0() {
        int i7;
        int length;
        if (x() && this.W != null && this.f30889p0 == this.f30892s0 && (i7 = this.f30890q0) == this.f30893t0) {
            if (i7 < 0) {
                i7 = 0;
            }
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((i9) this.W).k(arrayList);
            if (!arrayList.isEmpty() && i7 < arrayList.size() && (length = ((u9) arrayList.get(i7)).a().getText().length()) > 0 && (this.f30891r0 > 0 || this.f30894u0 < length)) {
                return j0((i9) this.W, i7, 0, length);
            }
        }
        return false;
    }

    public final boolean b0(int i7, int i10, i9 i9Var) {
        int compare;
        int i11;
        int i12;
        int i13;
        int d02 = d0(i9Var);
        if (d02 < 0) {
            return false;
        }
        if (this.B0 < 0) {
            this.B0 = this.f30889p0;
            this.D0 = this.f30890q0;
            this.C0 = this.f30891r0;
        }
        h0(i9Var, d02);
        int i14 = this.B0;
        int i15 = this.D0;
        int i16 = this.C0;
        if (d02 != i14) {
            compare = Integer.compare(d02, i14);
        } else if (i7 != i15) {
            compare = Integer.compare(i7, i15);
        } else {
            compare = Integer.compare(i10, i16);
        }
        if (compare < 0) {
            i13 = this.B0;
            i11 = this.D0;
            i12 = this.C0;
        } else {
            int i17 = this.B0;
            i11 = i7;
            i7 = this.D0;
            i12 = i10;
            i10 = this.C0;
            d02 = i17;
            i13 = d02;
        }
        if (d02 == i13 && i7 == i11 && i10 == i12) {
            f(false);
            return true;
        }
        this.f30889p0 = d02;
        this.f30890q0 = i7;
        this.f30891r0 = i10;
        this.f30892s0 = i13;
        this.f30893t0 = i11;
        this.f30894u0 = i12;
        N();
        w();
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.invalidate();
        }
        f fVar = this.m0;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.g3(fVar);
        return true;
    }

    @Override
    public final boolean c(int i7) {
        if (this.f30889p0 == this.f30892s0 && this.f30890q0 == this.f30893t0) {
            return super.c(i7);
        }
        return true;
    }

    public final int c0(int i7, int i10, i9 i9Var) {
        int i11 = 0;
        if (i9Var instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) i9Var;
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                View childAt = viewGroup.getChildAt(i12);
                if (childAt instanceof i9) {
                    float f10 = i10;
                    if (f10 > childAt.getY() && f10 < childAt.getY() + childAt.getHeight()) {
                        return c0((int) (i7 - childAt.getX()), (int) (f10 - childAt.getY()), (i9) childAt);
                    }
                }
            }
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        i9Var.k(arrayList);
        if (arrayList.isEmpty()) {
            return -1;
        }
        int size = arrayList.size() - 1;
        int i13 = Integer.MAX_VALUE;
        int i14 = -1;
        int i15 = Integer.MAX_VALUE;
        while (true) {
            if (size >= 0) {
                u9 u9Var = (u9) arrayList.get(size);
                int y10 = u9Var.getY();
                int height = u9Var.a().getHeight() + y10;
                if (i10 >= y10 && i10 < height) {
                    break;
                }
                int min = Math.min(Math.abs(i10 - y10), Math.abs(i10 - height));
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
        int row = ((u9) arrayList.get(size)).getRow();
        if (row > 0 && i11 < org.telegram.messenger.g0.L(24.0f)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                u9 u9Var2 = (u9) arrayList.get(size2);
                if (u9Var2.getRow() == row) {
                    int x10 = u9Var2.getX();
                    int width = u9Var2.a().getWidth() + u9Var2.getX();
                    if (i7 >= x10 && i7 <= width) {
                        return size2;
                    }
                    int min2 = Math.min(Math.abs(i7 - x10), Math.abs(i7 - width));
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
        v4.b0 b0Var = this.f30899z0;
        if (b0Var == null) {
            return true;
        }
        int L0 = b0Var.L0();
        int N0 = this.f30899z0.N0();
        int i7 = this.f30889p0;
        if ((L0 >= i7 && L0 <= this.f30892s0) || (N0 >= i7 && N0 <= this.f30892s0)) {
            return true;
        }
        if (i7 >= L0 && this.f30892s0 <= N0) {
            return true;
        }
        return false;
    }

    public final int d0(i9 i9Var) {
        ViewGroup viewGroup;
        View view = (View) i9Var;
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
    public final CharSequence s(i9 i9Var, boolean z10) {
        int i7;
        ArrayList arrayList = this.A0;
        arrayList.clear();
        i9Var.k(arrayList);
        if (z10) {
            i7 = this.f30895v0;
        } else if (this.E0) {
            i7 = this.f30890q0;
        } else {
            i7 = this.f30893t0;
        }
        if (!arrayList.isEmpty() && i7 >= 0 && i7 < arrayList.size()) {
            return ((u9) arrayList.get(i7)).a().getText();
        }
        return "";
    }

    @Override
    public final void f(boolean z10) {
        super.f(z10);
        this.f30889p0 = -1;
        this.f30892s0 = -1;
        this.f30890q0 = -1;
        this.f30893t0 = -1;
        this.f30896w0.clear();
        this.f30898y0.clear();
        this.B0 = -1;
        this.C0 = -1;
    }

    public final boolean f0(View view) {
        if (view instanceof i9) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((i9) view).k(arrayList);
            if (view instanceof org.telegram.ui.s2) {
                return true;
            }
            return !arrayList.isEmpty();
        }
        return false;
    }

    public final void g0(i9 i9Var, i9 i9Var2, int i7) {
        int i10;
        int i11;
        int d02 = d0(i9Var2);
        if (i9Var != null) {
            i10 = d0(i9Var);
        } else {
            i10 = -1;
        }
        w();
        if (this.R && (i11 = this.f30889p0) == this.f30892s0) {
            if (d02 == i11) {
                if (i7 < this.f30890q0) {
                    this.f30890q0 = i7;
                    O();
                    this.f32250j = true;
                    int i12 = this.v;
                    this.f30891r0 = i12;
                    this.f32266u = i12 - 1;
                } else {
                    this.f30893t0 = i7;
                    N();
                    this.f32250j = false;
                    this.f30894u0 = 0;
                }
            } else if (d02 < i11) {
                this.f30889p0 = d02;
                this.f30890q0 = i7;
                O();
                this.f32250j = true;
                int i13 = this.v;
                this.f30891r0 = i13;
                this.f32266u = i13 - 1;
            } else {
                this.f30892s0 = d02;
                this.f30893t0 = i7;
                N();
                this.f32250j = false;
                this.f30894u0 = 0;
            }
        } else if (this.f32250j) {
            if (d02 == i10) {
                int i14 = this.f30893t0;
                if (i7 > i14 && d02 >= this.f30892s0) {
                    this.f30892s0 = d02;
                    this.f30890q0 = i14;
                    this.f30893t0 = i7;
                    this.f30891r0 = this.f30894u0;
                    N();
                    this.f30894u0 = 0;
                    this.f32250j = false;
                } else {
                    this.f30889p0 = d02;
                    this.f30890q0 = i7;
                    O();
                    this.f30891r0 = this.v;
                }
            } else if (d02 <= this.f30892s0) {
                this.f30889p0 = d02;
                this.f30890q0 = i7;
                O();
                this.f30891r0 = this.v;
            } else {
                this.f30892s0 = d02;
                this.f30890q0 = this.f30893t0;
                this.f30893t0 = i7;
                this.f30891r0 = this.f30894u0;
                N();
                this.f30894u0 = 0;
                this.f32250j = false;
            }
        } else if (d02 == i10) {
            int i15 = this.f30890q0;
            if (i7 < i15 && d02 <= this.f30889p0) {
                this.f30889p0 = d02;
                this.f30893t0 = i15;
                this.f30890q0 = i7;
                this.f30894u0 = this.f30891r0;
                O();
                this.f32250j = true;
                this.f30891r0 = this.v;
            } else {
                this.f30892s0 = d02;
                this.f30893t0 = i7;
                N();
                this.f30894u0 = 0;
            }
        } else if (d02 >= this.f30889p0) {
            this.f30892s0 = d02;
            this.f30893t0 = i7;
            N();
            this.f30894u0 = 0;
        } else {
            this.f30889p0 = d02;
            this.f30893t0 = this.f30890q0;
            this.f30890q0 = i7;
            this.f30894u0 = this.f30891r0;
            O();
            this.f32250j = true;
            this.f30891r0 = this.v;
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        i9Var2.k(arrayList);
        int size = arrayList.size();
        this.f30898y0.put(d02, size);
        for (int i16 = 0; i16 < size; i16++) {
            W(d02, i16, (u9) arrayList.get(i16));
        }
    }

    public final void h0(i9 i9Var, int i7) {
        ArrayList arrayList = this.A0;
        arrayList.clear();
        i9Var.k(arrayList);
        int size = arrayList.size();
        this.f30898y0.put(i7, size);
        for (int i10 = 0; i10 < size; i10++) {
            W(i7, i10, (u9) arrayList.get(i10));
        }
    }

    @Override
    public final void i(int i7, m9 m9Var, boolean z10) {
        r9 r9Var;
        int i10;
        ArrayList arrayList = this.A0;
        arrayList.clear();
        m9Var.f31080e = null;
        if (z10) {
            r9Var = this.X;
        } else {
            r9Var = this.W;
        }
        i9 i9Var = (i9) r9Var;
        if (i9Var == null) {
            m9Var.d = null;
            return;
        }
        i9Var.k(arrayList);
        if (z10) {
            i10 = this.f30895v0;
        } else if (this.E0) {
            i10 = this.f30890q0;
        } else {
            i10 = this.f30893t0;
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            m9Var.d = ((u9) arrayList.get(i10)).a();
            m9Var.f31080e = ((u9) arrayList.get(i10)).c();
            m9Var.f31078b = 0.0f;
            m9Var.f31079c = 0.0f;
            return;
        }
        m9Var.d = null;
    }

    public final void i0(int i7, int i10) {
        int length;
        i9 i9Var;
        if (i7 >= 0 && i10 >= i7) {
            CharSequence charSequence = (CharSequence) this.f30896w0.get(i10);
            if (charSequence == null) {
                length = 0;
            } else {
                length = charSequence.length();
            }
            if (this.F != null) {
                for (int i11 = 0; i11 < this.F.getChildCount(); i11++) {
                    View childAt = this.F.getChildAt(i11);
                    if (childAt instanceof i9) {
                        i9Var = (i9) childAt;
                        if (d0(i9Var) == i10) {
                            break;
                        }
                    }
                }
            }
            i9Var = null;
            this.W = i9Var;
            this.f32266u = 0;
            this.v = length;
            this.f30889p0 = i7;
            this.f30892s0 = i10;
            this.f30893t0 = 0;
            this.f30890q0 = 0;
            this.f30891r0 = 0;
            this.f30894u0 = length;
            SparseIntArray sparseIntArray = this.f30898y0;
            sparseIntArray.put(i7, Math.max(1, sparseIntArray.get(i7)));
            sparseIntArray.put(i10, Math.max(1, sparseIntArray.get(i10)));
            this.B0 = i7;
            this.C0 = 0;
            v9 v9Var = this.C;
            if (v9Var != null) {
                v9Var.setVisibility(0);
            }
            U();
            w();
            u();
            f fVar = this.m0;
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.g3(fVar);
            c8.ia iaVar = this.D;
            if (iaVar != null) {
                iaVar.a(true);
            }
        }
    }

    public final boolean j0(i9 i9Var, int i7, int i10, int i11) {
        int d02 = d0(i9Var);
        if (d02 < 0 || i10 == i11) {
            return false;
        }
        int min = Math.min(i10, i11);
        int max = Math.max(i10, i11);
        this.W = i9Var;
        this.f32266u = min;
        this.v = max;
        this.f30892s0 = d02;
        this.f30889p0 = d02;
        this.f30893t0 = i7;
        this.f30890q0 = i7;
        this.f30891r0 = min;
        this.f30894u0 = max;
        this.B0 = d02;
        this.C0 = i10;
        this.D0 = i7;
        h0(i9Var, d02);
        ArrayList arrayList = this.A0;
        if (!arrayList.isEmpty() && i7 >= 0 && i7 < arrayList.size()) {
            this.f32234a = ((u9) arrayList.get(i7)).getX();
            this.f32236b = ((u9) arrayList.get(i7)).getY();
        } else if (!arrayList.isEmpty()) {
            this.f32234a = ((u9) arrayList.get(0)).getX();
            this.f32236b = ((u9) arrayList.get(0)).getY();
        }
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.setVisibility(0);
        }
        U();
        w();
        u();
        f fVar = this.m0;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.g3(fVar);
        c8.ia iaVar = this.D;
        if (iaVar != null) {
            iaVar.a(true);
        }
        i9Var.invalidate();
        return true;
    }

    @Override
    public final int k(int i7, int i10, int i11, int i12, r9 r9Var, boolean z10) {
        int i13;
        i9 i9Var = (i9) r9Var;
        if (i9Var != null) {
            int i14 = i7 - i11;
            int i15 = i10 - i12;
            ArrayList arrayList = this.A0;
            arrayList.clear();
            i9Var.k(arrayList);
            if (z10) {
                i13 = this.f30895v0;
            } else if (this.E0) {
                i13 = this.f30890q0;
            } else {
                i13 = this.f30893t0;
            }
            if (i13 >= 0 && i13 < arrayList.size()) {
                Layout a10 = ((u9) arrayList.get(i13)).a();
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

    public final void k0(View view, int i7, int i10) {
        if (view instanceof i9) {
            this.f32264s = i7;
            this.f32265t = i10;
            i9 i9Var = (i9) view;
            this.X = i9Var;
            int c02 = c0(i7, i10, i9Var);
            this.f30895v0 = c02;
            if (c02 < 0) {
                this.X = null;
                return;
            }
            ArrayList arrayList = this.A0;
            this.f32238c = ((u9) arrayList.get(c02)).getX();
            this.d = ((u9) arrayList.get(this.f30895v0)).getY();
        }
    }

    public final void l0() {
        if (this.X != null) {
            this.f32244f0.run();
        }
    }

    @Override
    public final int m() {
        int i7;
        if (this.W != null) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((i9) this.W).k(arrayList);
            if (this.E0) {
                i7 = this.f30890q0;
            } else {
                i7 = this.f30893t0;
            }
            if (i7 >= 0 && i7 < arrayList.size()) {
                Layout a10 = ((u9) arrayList.get(i7)).a();
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
        l9[] l9VarArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i7 = this.f30889p0;
        while (true) {
            int i10 = this.f30892s0;
            if (i7 > i10) {
                break;
            }
            int i11 = this.f30889p0;
            SparseIntArray sparseIntArray = this.f30898y0;
            SparseArray sparseArray = this.f30896w0;
            SparseArray sparseArray2 = this.f30897x0;
            if (i7 == i11) {
                int i12 = i11 == i10 ? this.f30893t0 : sparseIntArray.get(i7) - 1;
                for (int i13 = this.f30890q0; i13 <= i12; i13++) {
                    int i14 = (i13 << 16) + i7;
                    CharSequence charSequence = (CharSequence) sparseArray.get(i14);
                    if (charSequence != null) {
                        int i15 = this.f30889p0;
                        int i16 = this.f30892s0;
                        if (i15 == i16 && i13 == this.f30893t0 && i13 == this.f30890q0) {
                            int i17 = this.f30894u0;
                            int i18 = this.f30891r0;
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
                        } else if (i15 == i16 && i13 == this.f30893t0) {
                            CharSequence charSequence2 = (CharSequence) sparseArray2.get(i14);
                            if (charSequence2 != null) {
                                spannableStringBuilder.append(charSequence2).append(' ');
                            }
                            int i19 = this.f30894u0;
                            if (i19 > charSequence.length()) {
                                i19 = charSequence.length();
                            }
                            spannableStringBuilder.append(charSequence.subSequence(0, i19));
                            spannableStringBuilder.append('\n');
                        } else if (i13 == this.f30890q0) {
                            int i20 = this.f30891r0;
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
            } else if (i7 == i10) {
                for (int i21 = 0; i21 <= this.f30893t0; i21++) {
                    int i22 = (i21 << 16) + i7;
                    CharSequence charSequence4 = (CharSequence) sparseArray.get(i22);
                    if (charSequence4 != null) {
                        if (this.f30889p0 == this.f30892s0 && i21 == this.f30893t0 && i21 == this.f30890q0) {
                            int i23 = this.f30894u0;
                            int i24 = this.f30891r0;
                            if (i24 < charSequence4.length()) {
                                if (i23 > charSequence4.length()) {
                                    i23 = charSequence4.length();
                                }
                                spannableStringBuilder.append(charSequence4.subSequence(i24, i23));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i21 == this.f30893t0) {
                            CharSequence charSequence5 = (CharSequence) sparseArray2.get(i22);
                            if (charSequence5 != null) {
                                spannableStringBuilder.append(charSequence5).append(' ');
                            }
                            int i25 = this.f30894u0;
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
                int i26 = sparseIntArray.get(i7);
                for (int i27 = this.f30890q0; i27 < i26; i27++) {
                    int i28 = (i27 << 16) + i7;
                    CharSequence charSequence7 = (CharSequence) sparseArray2.get(i28);
                    if (charSequence7 != null) {
                        spannableStringBuilder.append(charSequence7).append(' ');
                    }
                    spannableStringBuilder.append((CharSequence) sparseArray.get(i28));
                    spannableStringBuilder.append('\n');
                }
            }
            i7++;
        }
        if (spannableStringBuilder.length() > 0) {
            p9[] p9VarArr = (p9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, p9.class);
            if (p9VarArr != null && p9VarArr.length > 0) {
                Arrays.sort(p9VarArr, new z0(spannableStringBuilder, 1));
                for (p9 p9Var : p9VarArr) {
                    int spanStart = spannableStringBuilder.getSpanStart(p9Var);
                    int spanEnd = spannableStringBuilder.getSpanEnd(p9Var);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        CharSequence charSequence8 = p9Var.f31256a;
                        if (charSequence8 == null) {
                            charSequence8 = "";
                        }
                        spannableStringBuilder.replace(spanStart, spanEnd, charSequence8);
                    }
                }
            }
            for (l9 l9Var : (l9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, l9.class)) {
                spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(l9Var), spannableStringBuilder.getSpanEnd(l9Var));
            }
            return spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1);
        }
        return null;
    }

    @Override
    public final void w() {
        super.w();
        if (this.F != null) {
            for (int i7 = 0; i7 < this.F.getChildCount(); i7++) {
                this.F.getChildAt(i7).invalidate();
            }
        }
    }
}
