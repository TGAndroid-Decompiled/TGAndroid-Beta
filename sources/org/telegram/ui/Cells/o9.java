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
import org.telegram.messenger.AndroidUtilities;
public class o9 extends ba {
    public boolean E0;
    public int f22611r0;
    public int f22614u0;
    public s4.d0 f22619z0;
    public int f22609p0 = -1;
    public int f22610q0 = -1;
    public int f22612s0 = -1;
    public int f22613t0 = -1;
    public int f22615v0 = -1;
    public final SparseArray f22616w0 = new SparseArray();
    public final SparseArray f22617x0 = new SparseArray();
    public final SparseIntArray f22618y0 = new SparseIntArray();
    public final ArrayList A0 = new ArrayList();
    public int B0 = -1;
    public int C0 = -1;
    public int D0 = 0;

    public o9() {
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
    public final void A(int i10, int i11, boolean z10, float f7, float f10, w9 w9Var) {
        n9 n9Var = (n9) w9Var;
        if (z10 && n9Var == this.W && f10 == f7) {
            if (this.f21868j) {
                this.f21884u = i10;
                return;
            } else {
                this.v = i10;
                return;
            }
        }
        super.A(i10, i11, z10, f7, f10, n9Var);
    }

    @Override
    public void F() {
        int i10;
        int d02 = d0((n9) this.W);
        if (this.E0) {
            i10 = this.f22610q0;
        } else {
            i10 = this.f22613t0;
        }
        if (d02 == this.f22609p0 && i10 == this.f22610q0) {
            this.f22611r0 = this.f21884u;
        }
        if (d02 == this.f22612s0 && i10 == this.f22613t0) {
            this.f22614u0 = this.v;
        }
    }

    @Override
    public final void L(w9 w9Var, w9 w9Var2) {
        n9 n9Var = (n9) w9Var;
        n9 n9Var2 = (n9) w9Var2;
        int d02 = d0(n9Var);
        if (d02 >= 0) {
            this.f22612s0 = d02;
            this.f22609p0 = d02;
            int i10 = this.f22615v0;
            this.f22613t0 = i10;
            this.f22610q0 = i10;
            ArrayList arrayList = this.A0;
            arrayList.clear();
            n9Var.fillTextLayoutBlocks(arrayList);
            int size = arrayList.size();
            this.f22618y0.put(d02, size);
            for (int i11 = 0; i11 < size; i11++) {
                W((z9) arrayList.get(i11), d02, i11);
            }
        }
    }

    @Override
    public final void N() {
        n9 n9Var;
        if (x()) {
            this.E0 = false;
            int i10 = this.f22612s0;
            if (i10 >= 0) {
                s4.d0 d0Var = this.f22619z0;
                if (d0Var != null) {
                    n9Var = (n9) d0Var.m(i10);
                } else if (i10 < this.F.getChildCount()) {
                    n9Var = (n9) this.F.getChildAt(this.f22612s0);
                } else {
                    n9Var = null;
                }
                if (n9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = n9Var;
                if (this.f22609p0 != this.f22612s0) {
                    this.f21884u = 0;
                } else if (this.f22610q0 != this.f22613t0) {
                    this.f21884u = 0;
                } else {
                    this.f21884u = this.f22611r0;
                }
                this.v = this.f22614u0;
                CharSequence s10 = s(n9Var, false);
                if (this.v > s10.length()) {
                    this.v = s10.length();
                }
                ArrayList arrayList = this.A0;
                arrayList.clear();
                ((n9) this.W).fillTextLayoutBlocks(arrayList);
                int i11 = this.f22613t0;
                if (i11 >= 0 && i11 < arrayList.size()) {
                    this.f21852a = ((z9) arrayList.get(this.f22613t0)).getX();
                    this.f21854b = ((z9) arrayList.get(this.f22613t0)).getY();
                }
            }
        }
    }

    @Override
    public final void O() {
        n9 n9Var;
        if (x()) {
            this.E0 = true;
            int i10 = this.f22609p0;
            if (i10 >= 0) {
                s4.d0 d0Var = this.f22619z0;
                if (d0Var != null) {
                    n9Var = (n9) d0Var.m(i10);
                } else if (this.f22612s0 < this.F.getChildCount()) {
                    n9Var = (n9) this.F.getChildAt(this.f22609p0);
                } else {
                    n9Var = null;
                }
                if (n9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = n9Var;
                if (this.f22609p0 != this.f22612s0) {
                    this.v = s(n9Var, false).length();
                } else if (this.f22610q0 != this.f22613t0) {
                    this.v = s(n9Var, false).length();
                } else {
                    this.v = this.f22614u0;
                }
                this.f21884u = this.f22611r0;
                ArrayList arrayList = this.A0;
                arrayList.clear();
                ((n9) this.W).fillTextLayoutBlocks(arrayList);
                int i11 = this.f22610q0;
                if (i11 >= 0 && i11 < arrayList.size()) {
                    this.f21852a = ((z9) arrayList.get(this.f22610q0)).getX();
                    this.f21854b = ((z9) arrayList.get(this.f22610q0)).getY();
                }
            }
        }
    }

    @Override
    public final boolean P(int i10, int i11) {
        int i12;
        if (this.Z) {
            if (i11 > ((n9) this.W).getTop() && i11 < ((n9) this.W).getBottom()) {
                if (this.E0) {
                    i12 = this.f22610q0;
                } else {
                    i12 = this.f22613t0;
                }
                int c02 = c0((int) (i10 - ((n9) this.W).getX()), (int) (i11 - ((n9) this.W).getY()), (n9) this.W);
                if (c02 != i12 && c02 >= 0) {
                    n9 n9Var = (n9) this.W;
                    g0(n9Var, n9Var, c02);
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
                        n9 n9Var2 = (n9) this.F.getChildAt(i13);
                        if (i11 > n9Var2.getTop() && i11 < n9Var2.getBottom()) {
                            int c03 = c0((int) (i10 - n9Var2.getX()), (int) (i11 - n9Var2.getY()), n9Var2);
                            if (c03 >= 0) {
                                g0((n9) this.W, n9Var2, c03);
                                this.W = n9Var2;
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

    public final void W(z9 z9Var, int i10, int i11) {
        int i12 = i10 + (i11 << 16);
        this.f22616w0.put(i12, Y(z9Var.getText()));
        CharSequence prefix = z9Var.getPrefix();
        SparseArray sparseArray = this.f22617x0;
        if (prefix == null) {
            sparseArray.remove(i12);
        } else {
            sparseArray.put(i12, Y(prefix));
        }
    }

    public final void X(int i10, String str) {
        this.f22616w0.put(i10, Y(str));
        this.f22617x0.remove(i10);
        SparseIntArray sparseIntArray = this.f22618y0;
        sparseIntArray.put(i10, Math.max(1, sparseIntArray.get(i10)));
    }

    public final void Z(Canvas canvas, n9 n9Var, int i10) {
        z9 z9Var;
        int i11 = org.telegram.ui.ActionBar.i6.f21119uf;
        this.f21877o.setColor(org.telegram.ui.ActionBar.i6.w0(i11, this.f21864g0));
        this.f21879p.setColor(org.telegram.ui.ActionBar.i6.w0(i11, this.f21864g0));
        int d02 = d0(n9Var);
        if (d02 >= 0) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            n9Var.fillTextLayoutBlocks(arrayList);
            if (i10 >= 0 && i10 < arrayList.size() && (z9Var = (z9) arrayList.get(i10)) != null && z9Var.getLayout() != null && z9Var.getLayout().getText() != null) {
                int i12 = this.f22614u0;
                int length = z9Var.getLayout().getText().length();
                if (i12 > length) {
                    i12 = length;
                }
                int i13 = this.f22609p0;
                if (d02 == i13 && d02 == this.f22612s0) {
                    int i14 = this.f22610q0;
                    int i15 = this.f22613t0;
                    if (i14 == i15 && i14 == i10) {
                        h(canvas, z9Var.getLayout(), this.f22611r0, i12, true, true, 0.0f);
                        return;
                    } else if (i10 == i14) {
                        h(canvas, z9Var.getLayout(), this.f22611r0, length, true, false, 0.0f);
                        return;
                    } else {
                        int i16 = i12;
                        if (i10 == i15) {
                            h(canvas, z9Var.getLayout(), 0, i16, false, true, 0.0f);
                            return;
                        } else if (i10 > i14 && i10 < i15) {
                            h(canvas, z9Var.getLayout(), 0, length, false, false, 0.0f);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                int i17 = i12;
                if (d02 == i13 && this.f22610q0 == i10) {
                    h(canvas, z9Var.getLayout(), this.f22611r0, length, true, false, 0.0f);
                    return;
                }
                int i18 = this.f22612s0;
                if (d02 == i18 && this.f22613t0 == i10) {
                    h(canvas, z9Var.getLayout(), 0, i17, false, true, 0.0f);
                } else if ((d02 > i13 && d02 < i18) || ((d02 == i13 && i10 > this.f22610q0) || (d02 == i18 && i10 < this.f22613t0))) {
                    h(canvas, z9Var.getLayout(), 0, length, false, false, 0.0f);
                }
            }
        }
    }

    public final boolean a0() {
        int i10;
        int length;
        if (x() && this.W != null && this.f22609p0 == this.f22612s0 && (i10 = this.f22610q0) == this.f22613t0) {
            if (i10 < 0) {
                i10 = 0;
            }
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((n9) this.W).fillTextLayoutBlocks(arrayList);
            if (!arrayList.isEmpty() && i10 < arrayList.size() && (length = ((z9) arrayList.get(i10)).getLayout().getText().length()) > 0 && (this.f22611r0 > 0 || this.f22614u0 < length)) {
                return j0((n9) this.W, i10, 0, length);
            }
        }
        return false;
    }

    public final boolean b0(int i10, int i11, n9 n9Var) {
        int compare;
        int i12;
        int i13;
        int i14;
        int d02 = d0(n9Var);
        if (d02 < 0) {
            return false;
        }
        if (this.B0 < 0) {
            this.B0 = this.f22609p0;
            this.D0 = this.f22610q0;
            this.C0 = this.f22611r0;
        }
        h0(n9Var, d02);
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
        this.f22609p0 = d02;
        this.f22610q0 = i10;
        this.f22611r0 = i11;
        this.f22612s0 = i14;
        this.f22613t0 = i12;
        this.f22614u0 = i13;
        N();
        w();
        aa aaVar = this.C;
        if (aaVar != null) {
            aaVar.invalidate();
        }
        g gVar = this.m0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
        return true;
    }

    @Override
    public final boolean c(int i10) {
        if (this.f22609p0 == this.f22612s0 && this.f22610q0 == this.f22613t0) {
            return super.c(i10);
        }
        return true;
    }

    public final int c0(int i10, int i11, n9 n9Var) {
        int i12 = 0;
        if (n9Var instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) n9Var;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof n9) {
                    float f7 = i11;
                    if (f7 > childAt.getY() && f7 < childAt.getY() + childAt.getHeight()) {
                        return c0((int) (i10 - childAt.getX()), (int) (f7 - childAt.getY()), (n9) childAt);
                    }
                }
            }
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        n9Var.fillTextLayoutBlocks(arrayList);
        if (arrayList.isEmpty()) {
            return -1;
        }
        int size = arrayList.size() - 1;
        int i14 = Integer.MAX_VALUE;
        int i15 = -1;
        int i16 = Integer.MAX_VALUE;
        while (true) {
            if (size >= 0) {
                z9 z9Var = (z9) arrayList.get(size);
                int y3 = z9Var.getY();
                int height = z9Var.getLayout().getHeight() + y3;
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
        int row = ((z9) arrayList.get(size)).getRow();
        if (row > 0 && i12 < AndroidUtilities.dp(24.0f)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                z9 z9Var2 = (z9) arrayList.get(size2);
                if (z9Var2.getRow() == row) {
                    int x10 = z9Var2.getX();
                    int width = z9Var2.getLayout().getWidth() + z9Var2.getX();
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
        s4.d0 d0Var = this.f22619z0;
        if (d0Var == null) {
            return true;
        }
        int L0 = d0Var.L0();
        int N0 = this.f22619z0.N0();
        int i10 = this.f22609p0;
        if ((L0 >= i10 && L0 <= this.f22612s0) || (N0 >= i10 && N0 <= this.f22612s0)) {
            return true;
        }
        if (i10 >= L0 && this.f22612s0 <= N0) {
            return true;
        }
        return false;
    }

    public final int d0(n9 n9Var) {
        ViewGroup viewGroup;
        View view = (View) n9Var;
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
    public final CharSequence s(n9 n9Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.A0;
        arrayList.clear();
        n9Var.fillTextLayoutBlocks(arrayList);
        if (z10) {
            i10 = this.f22615v0;
        } else if (this.E0) {
            i10 = this.f22610q0;
        } else {
            i10 = this.f22613t0;
        }
        if (!arrayList.isEmpty() && i10 >= 0 && i10 < arrayList.size()) {
            return ((z9) arrayList.get(i10)).getLayout().getText();
        }
        return "";
    }

    @Override
    public final void f(boolean z10) {
        super.f(z10);
        this.f22609p0 = -1;
        this.f22612s0 = -1;
        this.f22610q0 = -1;
        this.f22613t0 = -1;
        this.f22616w0.clear();
        this.f22618y0.clear();
        this.B0 = -1;
        this.C0 = -1;
    }

    public final boolean f0(View view) {
        if (view instanceof n9) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((n9) view).fillTextLayoutBlocks(arrayList);
            if (view instanceof org.telegram.ui.u2) {
                return true;
            }
            return !arrayList.isEmpty();
        }
        return false;
    }

    public final void g0(n9 n9Var, n9 n9Var2, int i10) {
        int i11;
        int i12;
        int d02 = d0(n9Var2);
        if (n9Var != null) {
            i11 = d0(n9Var);
        } else {
            i11 = -1;
        }
        w();
        if (this.R && (i12 = this.f22609p0) == this.f22612s0) {
            if (d02 == i12) {
                if (i10 < this.f22610q0) {
                    this.f22610q0 = i10;
                    O();
                    this.f21868j = true;
                    int i13 = this.v;
                    this.f22611r0 = i13;
                    this.f21884u = i13 - 1;
                } else {
                    this.f22613t0 = i10;
                    N();
                    this.f21868j = false;
                    this.f22614u0 = 0;
                }
            } else if (d02 < i12) {
                this.f22609p0 = d02;
                this.f22610q0 = i10;
                O();
                this.f21868j = true;
                int i14 = this.v;
                this.f22611r0 = i14;
                this.f21884u = i14 - 1;
            } else {
                this.f22612s0 = d02;
                this.f22613t0 = i10;
                N();
                this.f21868j = false;
                this.f22614u0 = 0;
            }
        } else if (this.f21868j) {
            if (d02 == i11) {
                int i15 = this.f22613t0;
                if (i10 > i15 && d02 >= this.f22612s0) {
                    this.f22612s0 = d02;
                    this.f22610q0 = i15;
                    this.f22613t0 = i10;
                    this.f22611r0 = this.f22614u0;
                    N();
                    this.f22614u0 = 0;
                    this.f21868j = false;
                } else {
                    this.f22609p0 = d02;
                    this.f22610q0 = i10;
                    O();
                    this.f22611r0 = this.v;
                }
            } else if (d02 <= this.f22612s0) {
                this.f22609p0 = d02;
                this.f22610q0 = i10;
                O();
                this.f22611r0 = this.v;
            } else {
                this.f22612s0 = d02;
                this.f22610q0 = this.f22613t0;
                this.f22613t0 = i10;
                this.f22611r0 = this.f22614u0;
                N();
                this.f22614u0 = 0;
                this.f21868j = false;
            }
        } else if (d02 == i11) {
            int i16 = this.f22610q0;
            if (i10 < i16 && d02 <= this.f22609p0) {
                this.f22609p0 = d02;
                this.f22613t0 = i16;
                this.f22610q0 = i10;
                this.f22614u0 = this.f22611r0;
                O();
                this.f21868j = true;
                this.f22611r0 = this.v;
            } else {
                this.f22612s0 = d02;
                this.f22613t0 = i10;
                N();
                this.f22614u0 = 0;
            }
        } else if (d02 >= this.f22609p0) {
            this.f22612s0 = d02;
            this.f22613t0 = i10;
            N();
            this.f22614u0 = 0;
        } else {
            this.f22609p0 = d02;
            this.f22613t0 = this.f22610q0;
            this.f22610q0 = i10;
            this.f22614u0 = this.f22611r0;
            O();
            this.f21868j = true;
            this.f22611r0 = this.v;
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        n9Var2.fillTextLayoutBlocks(arrayList);
        int size = arrayList.size();
        this.f22618y0.put(d02, size);
        for (int i17 = 0; i17 < size; i17++) {
            W((z9) arrayList.get(i17), d02, i17);
        }
    }

    public final void h0(n9 n9Var, int i10) {
        ArrayList arrayList = this.A0;
        arrayList.clear();
        n9Var.fillTextLayoutBlocks(arrayList);
        int size = arrayList.size();
        this.f22618y0.put(i10, size);
        for (int i11 = 0; i11 < size; i11++) {
            W((z9) arrayList.get(i11), i10, i11);
        }
    }

    @Override
    public final void i(int i10, r9 r9Var, boolean z10) {
        w9 w9Var;
        int i11;
        ArrayList arrayList = this.A0;
        arrayList.clear();
        r9Var.f22731e = null;
        if (z10) {
            w9Var = this.X;
        } else {
            w9Var = this.W;
        }
        n9 n9Var = (n9) w9Var;
        if (n9Var == null) {
            r9Var.f22729b = null;
            return;
        }
        n9Var.fillTextLayoutBlocks(arrayList);
        if (z10) {
            i11 = this.f22615v0;
        } else if (this.E0) {
            i11 = this.f22610q0;
        } else {
            i11 = this.f22613t0;
        }
        if (i11 >= 0 && i11 < arrayList.size()) {
            r9Var.f22729b = ((z9) arrayList.get(i11)).getLayout();
            r9Var.f22731e = ((z9) arrayList.get(i11)).getSelectionBounds();
            r9Var.f22730c = 0.0f;
            r9Var.d = 0.0f;
            return;
        }
        r9Var.f22729b = null;
    }

    public final void i0(int i10, int i11) {
        int length;
        n9 n9Var;
        if (i10 >= 0 && i11 >= i10) {
            CharSequence charSequence = (CharSequence) this.f22616w0.get(i11);
            if (charSequence == null) {
                length = 0;
            } else {
                length = charSequence.length();
            }
            if (this.F != null) {
                for (int i12 = 0; i12 < this.F.getChildCount(); i12++) {
                    View childAt = this.F.getChildAt(i12);
                    if (childAt instanceof n9) {
                        n9Var = (n9) childAt;
                        if (d0(n9Var) == i11) {
                            break;
                        }
                    }
                }
            }
            n9Var = null;
            this.W = n9Var;
            this.f21884u = 0;
            this.v = length;
            this.f22609p0 = i10;
            this.f22612s0 = i11;
            this.f22613t0 = 0;
            this.f22610q0 = 0;
            this.f22611r0 = 0;
            this.f22614u0 = length;
            SparseIntArray sparseIntArray = this.f22618y0;
            sparseIntArray.put(i10, Math.max(1, sparseIntArray.get(i10)));
            sparseIntArray.put(i11, Math.max(1, sparseIntArray.get(i11)));
            this.B0 = i10;
            this.C0 = 0;
            aa aaVar = this.C;
            if (aaVar != null) {
                aaVar.setVisibility(0);
            }
            U();
            w();
            u();
            g gVar = this.m0;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            w7.h0 h0Var = this.D;
            if (h0Var != null) {
                h0Var.a(true);
            }
        }
    }

    public final boolean j0(n9 n9Var, int i10, int i11, int i12) {
        int d02 = d0(n9Var);
        if (d02 < 0 || i11 == i12) {
            return false;
        }
        int min = Math.min(i11, i12);
        int max = Math.max(i11, i12);
        this.W = n9Var;
        this.f21884u = min;
        this.v = max;
        this.f22612s0 = d02;
        this.f22609p0 = d02;
        this.f22613t0 = i10;
        this.f22610q0 = i10;
        this.f22611r0 = min;
        this.f22614u0 = max;
        this.B0 = d02;
        this.C0 = i11;
        this.D0 = i10;
        h0(n9Var, d02);
        ArrayList arrayList = this.A0;
        if (!arrayList.isEmpty() && i10 >= 0 && i10 < arrayList.size()) {
            this.f21852a = ((z9) arrayList.get(i10)).getX();
            this.f21854b = ((z9) arrayList.get(i10)).getY();
        } else if (!arrayList.isEmpty()) {
            this.f21852a = ((z9) arrayList.get(0)).getX();
            this.f21854b = ((z9) arrayList.get(0)).getY();
        }
        aa aaVar = this.C;
        if (aaVar != null) {
            aaVar.setVisibility(0);
        }
        U();
        w();
        u();
        g gVar = this.m0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
        w7.h0 h0Var = this.D;
        if (h0Var != null) {
            h0Var.a(true);
        }
        n9Var.invalidate();
        return true;
    }

    @Override
    public final int k(int i10, int i11, int i12, int i13, w9 w9Var, boolean z10) {
        int i14;
        n9 n9Var = (n9) w9Var;
        if (n9Var != null) {
            int i15 = i10 - i12;
            int i16 = i11 - i13;
            ArrayList arrayList = this.A0;
            arrayList.clear();
            n9Var.fillTextLayoutBlocks(arrayList);
            if (z10) {
                i14 = this.f22615v0;
            } else if (this.E0) {
                i14 = this.f22610q0;
            } else {
                i14 = this.f22613t0;
            }
            if (i14 >= 0 && i14 < arrayList.size()) {
                Layout layout = ((z9) arrayList.get(i14)).getLayout();
                if (i15 < 0) {
                    i15 = 1;
                }
                if (i16 < 0) {
                    i16 = 1;
                }
                if (i15 > layout.getWidth()) {
                    i15 = layout.getWidth();
                }
                if (i16 > layout.getLineBottom(layout.getLineCount() - 1)) {
                    i16 = layout.getLineBottom(layout.getLineCount() - 1) - 1;
                }
                int i17 = 0;
                while (true) {
                    if (i17 < layout.getLineCount()) {
                        if (i16 >= layout.getLineTop(i17) && i16 <= layout.getLineBottom(i17)) {
                            break;
                        }
                        i17++;
                    } else {
                        i17 = -1;
                        break;
                    }
                }
                if (i17 >= 0) {
                    return layout.getOffsetForHorizontal(i17, i15);
                }
            }
        }
        return -1;
    }

    public final void k0(View view, int i10, int i11) {
        if (view instanceof n9) {
            this.f21882s = i10;
            this.f21883t = i11;
            n9 n9Var = (n9) view;
            this.X = n9Var;
            int c02 = c0(i10, i11, n9Var);
            this.f22615v0 = c02;
            if (c02 < 0) {
                this.X = null;
                return;
            }
            ArrayList arrayList = this.A0;
            this.f21856c = ((z9) arrayList.get(c02)).getX();
            this.d = ((z9) arrayList.get(this.f22615v0)).getY();
        }
    }

    public final void l0() {
        if (this.X != null) {
            this.f21862f0.run();
        }
    }

    @Override
    public final int m() {
        int i10;
        if (this.W != null) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((n9) this.W).fillTextLayoutBlocks(arrayList);
            if (this.E0) {
                i10 = this.f22610q0;
            } else {
                i10 = this.f22613t0;
            }
            if (i10 >= 0 && i10 < arrayList.size()) {
                Layout layout = ((z9) arrayList.get(i10)).getLayout();
                int i11 = Integer.MAX_VALUE;
                for (int i12 = 0; i12 < layout.getLineCount(); i12++) {
                    int lineBottom = layout.getLineBottom(i12) - layout.getLineTop(i12);
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
        q9[] q9VarArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.f22609p0;
        while (true) {
            int i11 = this.f22612s0;
            if (i10 > i11) {
                break;
            }
            int i12 = this.f22609p0;
            SparseIntArray sparseIntArray = this.f22618y0;
            SparseArray sparseArray = this.f22616w0;
            SparseArray sparseArray2 = this.f22617x0;
            if (i10 == i12) {
                int i13 = i12 == i11 ? this.f22613t0 : sparseIntArray.get(i10) - 1;
                for (int i14 = this.f22610q0; i14 <= i13; i14++) {
                    int i15 = (i14 << 16) + i10;
                    CharSequence charSequence = (CharSequence) sparseArray.get(i15);
                    if (charSequence != null) {
                        int i16 = this.f22609p0;
                        int i17 = this.f22612s0;
                        if (i16 == i17 && i14 == this.f22613t0 && i14 == this.f22610q0) {
                            int i18 = this.f22614u0;
                            int i19 = this.f22611r0;
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
                        } else if (i16 == i17 && i14 == this.f22613t0) {
                            CharSequence charSequence2 = (CharSequence) sparseArray2.get(i15);
                            if (charSequence2 != null) {
                                spannableStringBuilder.append(charSequence2).append(' ');
                            }
                            int i20 = this.f22614u0;
                            if (i20 > charSequence.length()) {
                                i20 = charSequence.length();
                            }
                            spannableStringBuilder.append(charSequence.subSequence(0, i20));
                            spannableStringBuilder.append('\n');
                        } else if (i14 == this.f22610q0) {
                            int i21 = this.f22611r0;
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
                for (int i22 = 0; i22 <= this.f22613t0; i22++) {
                    int i23 = (i22 << 16) + i10;
                    CharSequence charSequence4 = (CharSequence) sparseArray.get(i23);
                    if (charSequence4 != null) {
                        if (this.f22609p0 == this.f22612s0 && i22 == this.f22613t0 && i22 == this.f22610q0) {
                            int i24 = this.f22614u0;
                            int i25 = this.f22611r0;
                            if (i25 < charSequence4.length()) {
                                if (i24 > charSequence4.length()) {
                                    i24 = charSequence4.length();
                                }
                                spannableStringBuilder.append(charSequence4.subSequence(i25, i24));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i22 == this.f22613t0) {
                            CharSequence charSequence5 = (CharSequence) sparseArray2.get(i23);
                            if (charSequence5 != null) {
                                spannableStringBuilder.append(charSequence5).append(' ');
                            }
                            int i26 = this.f22614u0;
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
                for (int i28 = this.f22610q0; i28 < i27; i28++) {
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
            u9[] u9VarArr = (u9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, u9.class);
            if (u9VarArr != null && u9VarArr.length > 0) {
                Arrays.sort(u9VarArr, new p1(spannableStringBuilder, 1));
                for (u9 u9Var : u9VarArr) {
                    int spanStart = spannableStringBuilder.getSpanStart(u9Var);
                    int spanEnd = spannableStringBuilder.getSpanEnd(u9Var);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        CharSequence charSequence8 = u9Var.f23521a;
                        if (charSequence8 == null) {
                            charSequence8 = "";
                        }
                        spannableStringBuilder.replace(spanStart, spanEnd, charSequence8);
                    }
                }
            }
            for (q9 q9Var : (q9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, q9.class)) {
                spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(q9Var), spannableStringBuilder.getSpanEnd(q9Var));
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
