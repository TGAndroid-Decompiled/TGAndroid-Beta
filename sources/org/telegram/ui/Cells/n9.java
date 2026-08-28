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
public class n9 extends aa {
    public f2.m0 E0;
    public boolean J0;
    public int f24776w0;
    public int f24779z0;
    public int f24774u0 = -1;
    public int f24775v0 = -1;
    public int f24777x0 = -1;
    public int f24778y0 = -1;
    public int A0 = -1;
    public final SparseArray B0 = new SparseArray();
    public final SparseArray C0 = new SparseArray();
    public final SparseIntArray D0 = new SparseIntArray();
    public final ArrayList F0 = new ArrayList();
    public int G0 = -1;
    public int H0 = -1;
    public int I0 = 0;

    public n9() {
        this.Z = true;
        this.f24077d0 = true;
    }

    public static CharSequence Z(CharSequence charSequence) {
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
    public final void B(int i9, int i10, boolean z10, float f10, float f11, v9 v9Var) {
        m9 m9Var = (m9) v9Var;
        if (z10 && m9Var == this.W && f11 == f10) {
            if (this.f24087j) {
                this.f24108u = i9;
                return;
            } else {
                this.v = i9;
                return;
            }
        }
        super.B(i9, i10, z10, f10, f11, m9Var);
    }

    @Override
    public void G() {
        int i9;
        int e02 = e0((m9) this.W);
        if (this.J0) {
            i9 = this.f24775v0;
        } else {
            i9 = this.f24778y0;
        }
        if (e02 == this.f24774u0 && i9 == this.f24775v0) {
            this.f24776w0 = this.f24108u;
        }
        if (e02 == this.f24777x0 && i9 == this.f24778y0) {
            this.f24779z0 = this.v;
        }
    }

    @Override
    public final void M(v9 v9Var, v9 v9Var2) {
        m9 m9Var = (m9) v9Var;
        m9 m9Var2 = (m9) v9Var2;
        int e02 = e0(m9Var);
        if (e02 >= 0) {
            this.f24777x0 = e02;
            this.f24774u0 = e02;
            int i9 = this.A0;
            this.f24778y0 = i9;
            this.f24775v0 = i9;
            ArrayList arrayList = this.F0;
            arrayList.clear();
            m9Var.fillTextLayoutBlocks(arrayList);
            int size = arrayList.size();
            this.D0.put(e02, size);
            for (int i10 = 0; i10 < size; i10++) {
                X((y9) arrayList.get(i10), e02, i10);
            }
        }
    }

    @Override
    public final void O() {
        m9 m9Var;
        if (y()) {
            this.J0 = false;
            int i9 = this.f24777x0;
            if (i9 >= 0) {
                f2.m0 m0Var = this.E0;
                if (m0Var != null) {
                    m9Var = (m9) m0Var.m(i9);
                } else if (i9 < this.F.getChildCount()) {
                    m9Var = (m9) this.F.getChildAt(this.f24777x0);
                } else {
                    m9Var = null;
                }
                if (m9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = m9Var;
                if (this.f24774u0 != this.f24777x0) {
                    this.f24108u = 0;
                } else if (this.f24775v0 != this.f24778y0) {
                    this.f24108u = 0;
                } else {
                    this.f24108u = this.f24776w0;
                }
                this.v = this.f24779z0;
                CharSequence t10 = t(m9Var, false);
                if (this.v > t10.length()) {
                    this.v = t10.length();
                }
                ArrayList arrayList = this.F0;
                arrayList.clear();
                ((m9) this.W).fillTextLayoutBlocks(arrayList);
                int i10 = this.f24778y0;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    this.f24071a = ((y9) arrayList.get(this.f24778y0)).getX();
                    this.f24073b = ((y9) arrayList.get(this.f24778y0)).getY();
                }
            }
        }
    }

    @Override
    public final void P() {
        m9 m9Var;
        if (y()) {
            this.J0 = true;
            int i9 = this.f24774u0;
            if (i9 >= 0) {
                f2.m0 m0Var = this.E0;
                if (m0Var != null) {
                    m9Var = (m9) m0Var.m(i9);
                } else if (this.f24777x0 < this.F.getChildCount()) {
                    m9Var = (m9) this.F.getChildAt(this.f24774u0);
                } else {
                    m9Var = null;
                }
                if (m9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = m9Var;
                if (this.f24774u0 != this.f24777x0) {
                    this.v = t(m9Var, false).length();
                } else if (this.f24775v0 != this.f24778y0) {
                    this.v = t(m9Var, false).length();
                } else {
                    this.v = this.f24779z0;
                }
                this.f24108u = this.f24776w0;
                ArrayList arrayList = this.F0;
                arrayList.clear();
                ((m9) this.W).fillTextLayoutBlocks(arrayList);
                int i10 = this.f24775v0;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    this.f24071a = ((y9) arrayList.get(this.f24775v0)).getX();
                    this.f24073b = ((y9) arrayList.get(this.f24775v0)).getY();
                }
            }
        }
    }

    @Override
    public final boolean Q(int i9, int i10) {
        int i11;
        if (this.Z) {
            if (i10 > ((m9) this.W).getTop() && i10 < ((m9) this.W).getBottom()) {
                if (this.J0) {
                    i11 = this.f24775v0;
                } else {
                    i11 = this.f24778y0;
                }
                int d02 = d0((int) (i9 - ((m9) this.W).getX()), (int) (i10 - ((m9) this.W).getY()), (m9) this.W);
                if (d02 != i11 && d02 >= 0) {
                    m9 m9Var = (m9) this.W;
                    h0(m9Var, m9Var, d02);
                    return true;
                }
            } else {
                int childCount = this.F.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    if (g0(this.F.getChildAt(i12))) {
                        m9 m9Var2 = (m9) this.F.getChildAt(i12);
                        if (i10 > m9Var2.getTop() && i10 < m9Var2.getBottom()) {
                            int d03 = d0((int) (i9 - m9Var2.getX()), (int) (i10 - m9Var2.getY()), m9Var2);
                            if (d03 >= 0) {
                                h0((m9) this.W, m9Var2, d03);
                                this.W = m9Var2;
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

    public final void X(y9 y9Var, int i9, int i10) {
        int i11 = i9 + (i10 << 16);
        this.B0.put(i11, Z(y9Var.getText()));
        CharSequence prefix = y9Var.getPrefix();
        SparseArray sparseArray = this.C0;
        if (prefix == null) {
            sparseArray.remove(i11);
        } else {
            sparseArray.put(i11, Z(prefix));
        }
    }

    public final void Y(int i9, String str) {
        this.B0.put(i9, Z(str));
        this.C0.remove(i9);
        SparseIntArray sparseIntArray = this.D0;
        sparseIntArray.put(i9, Math.max(1, sparseIntArray.get(i9)));
    }

    public final void a0(Canvas canvas, m9 m9Var, int i9) {
        y9 y9Var;
        int i10 = org.telegram.ui.ActionBar.f6.f23312uf;
        this.f24096o.setColor(org.telegram.ui.ActionBar.f6.v0(i10, this.f24084h0));
        this.f24098p.setColor(org.telegram.ui.ActionBar.f6.v0(i10, this.f24084h0));
        int e02 = e0(m9Var);
        if (e02 >= 0) {
            ArrayList arrayList = this.F0;
            arrayList.clear();
            m9Var.fillTextLayoutBlocks(arrayList);
            if (i9 >= 0 && i9 < arrayList.size() && (y9Var = (y9) arrayList.get(i9)) != null && y9Var.getLayout() != null && y9Var.getLayout().getText() != null) {
                int i11 = this.f24779z0;
                int length = y9Var.getLayout().getText().length();
                if (i11 > length) {
                    i11 = length;
                }
                int i12 = this.f24774u0;
                if (e02 == i12 && e02 == this.f24777x0) {
                    int i13 = this.f24775v0;
                    int i14 = this.f24778y0;
                    if (i13 == i14 && i13 == i9) {
                        i(canvas, y9Var.getLayout(), this.f24776w0, i11, true, true, 0.0f);
                        return;
                    } else if (i9 == i13) {
                        i(canvas, y9Var.getLayout(), this.f24776w0, length, true, false, 0.0f);
                        return;
                    } else {
                        int i15 = i11;
                        if (i9 == i14) {
                            i(canvas, y9Var.getLayout(), 0, i15, false, true, 0.0f);
                            return;
                        } else if (i9 > i13 && i9 < i14) {
                            i(canvas, y9Var.getLayout(), 0, length, false, false, 0.0f);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                int i16 = i11;
                if (e02 == i12 && this.f24775v0 == i9) {
                    i(canvas, y9Var.getLayout(), this.f24776w0, length, true, false, 0.0f);
                    return;
                }
                int i17 = this.f24777x0;
                if (e02 == i17 && this.f24778y0 == i9) {
                    i(canvas, y9Var.getLayout(), 0, i16, false, true, 0.0f);
                } else if ((e02 > i12 && e02 < i17) || ((e02 == i12 && i9 > this.f24775v0) || (e02 == i17 && i9 < this.f24778y0))) {
                    i(canvas, y9Var.getLayout(), 0, length, false, false, 0.0f);
                }
            }
        }
    }

    public final boolean b0() {
        int i9;
        int length;
        if (y() && this.W != null && this.f24774u0 == this.f24777x0 && (i9 = this.f24775v0) == this.f24778y0) {
            if (i9 < 0) {
                i9 = 0;
            }
            ArrayList arrayList = this.F0;
            arrayList.clear();
            ((m9) this.W).fillTextLayoutBlocks(arrayList);
            if (!arrayList.isEmpty() && i9 < arrayList.size() && (length = ((y9) arrayList.get(i9)).getLayout().getText().length()) > 0 && (this.f24776w0 > 0 || this.f24779z0 < length)) {
                return k0((m9) this.W, i9, 0, length);
            }
        }
        return false;
    }

    @Override
    public final boolean c(int i9) {
        if (this.f24774u0 == this.f24777x0 && this.f24775v0 == this.f24778y0) {
            return super.c(i9);
        }
        return true;
    }

    public final boolean c0(int i9, int i10, m9 m9Var) {
        int compare;
        int i11;
        int i12;
        int i13;
        int e02 = e0(m9Var);
        if (e02 < 0) {
            return false;
        }
        if (this.G0 < 0) {
            this.G0 = this.f24774u0;
            this.I0 = this.f24775v0;
            this.H0 = this.f24776w0;
        }
        i0(m9Var, e02);
        int i14 = this.G0;
        int i15 = this.I0;
        int i16 = this.H0;
        if (e02 != i14) {
            compare = Integer.compare(e02, i14);
        } else if (i9 != i15) {
            compare = Integer.compare(i9, i15);
        } else {
            compare = Integer.compare(i10, i16);
        }
        if (compare < 0) {
            i13 = this.G0;
            i11 = this.I0;
            i12 = this.H0;
        } else {
            int i17 = this.G0;
            i11 = i9;
            i9 = this.I0;
            i12 = i10;
            i10 = this.H0;
            e02 = i17;
            i13 = e02;
        }
        if (e02 == i13 && i9 == i11 && i10 == i12) {
            f(false);
            return true;
        }
        this.f24774u0 = e02;
        this.f24775v0 = i9;
        this.f24776w0 = i10;
        this.f24777x0 = i13;
        this.f24778y0 = i11;
        this.f24779z0 = i12;
        O();
        x();
        z9 z9Var = this.C;
        if (z9Var != null) {
            z9Var.invalidate();
        }
        g gVar = this.f24103r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
        return true;
    }

    @Override
    public final boolean d() {
        f2.m0 m0Var = this.E0;
        if (m0Var == null) {
            return true;
        }
        int L0 = m0Var.L0();
        int N0 = this.E0.N0();
        int i9 = this.f24774u0;
        if ((L0 >= i9 && L0 <= this.f24777x0) || (N0 >= i9 && N0 <= this.f24777x0)) {
            return true;
        }
        if (i9 >= L0 && this.f24777x0 <= N0) {
            return true;
        }
        return false;
    }

    public final int d0(int i9, int i10, m9 m9Var) {
        int i11 = 0;
        if (m9Var instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) m9Var;
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                View childAt = viewGroup.getChildAt(i12);
                if (childAt instanceof m9) {
                    float f10 = i10;
                    if (f10 > childAt.getY() && f10 < childAt.getY() + childAt.getHeight()) {
                        return d0((int) (i9 - childAt.getX()), (int) (f10 - childAt.getY()), (m9) childAt);
                    }
                }
            }
        }
        ArrayList arrayList = this.F0;
        arrayList.clear();
        m9Var.fillTextLayoutBlocks(arrayList);
        if (arrayList.isEmpty()) {
            return -1;
        }
        int size = arrayList.size() - 1;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = -1;
        while (true) {
            if (size >= 0) {
                y9 y9Var = (y9) arrayList.get(size);
                int y10 = y9Var.getY();
                int height = y9Var.getLayout().getHeight() + y10;
                if (i10 >= y10 && i10 < height) {
                    break;
                }
                int min = Math.min(Math.abs(i10 - y10), Math.abs(i10 - height));
                if (min < i14) {
                    i15 = size;
                    i14 = min;
                }
                size--;
            } else {
                i11 = i14;
                size = i15;
                break;
            }
        }
        if (size < 0) {
            return -1;
        }
        int row = ((y9) arrayList.get(size)).getRow();
        if (row > 0 && i11 < AndroidUtilities.dp(24.0f)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                y9 y9Var2 = (y9) arrayList.get(size2);
                if (y9Var2.getRow() == row) {
                    int x10 = y9Var2.getX();
                    int width = y9Var2.getLayout().getWidth() + y9Var2.getX();
                    if (i9 >= x10 && i9 <= width) {
                        return size2;
                    }
                    int min2 = Math.min(Math.abs(i9 - x10), Math.abs(i9 - width));
                    if (min2 < i13) {
                        size = size2;
                        i13 = min2;
                    }
                }
            }
        }
        return size;
    }

    public final int e0(m9 m9Var) {
        ViewGroup viewGroup;
        View view = (View) m9Var;
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
    public final void f(boolean z10) {
        super.f(z10);
        this.f24774u0 = -1;
        this.f24777x0 = -1;
        this.f24775v0 = -1;
        this.f24778y0 = -1;
        this.B0.clear();
        this.D0.clear();
        this.G0 = -1;
        this.H0 = -1;
    }

    @Override
    public final CharSequence t(m9 m9Var, boolean z10) {
        int i9;
        ArrayList arrayList = this.F0;
        arrayList.clear();
        m9Var.fillTextLayoutBlocks(arrayList);
        if (z10) {
            i9 = this.A0;
        } else if (this.J0) {
            i9 = this.f24775v0;
        } else {
            i9 = this.f24778y0;
        }
        if (!arrayList.isEmpty() && i9 >= 0 && i9 < arrayList.size()) {
            return ((y9) arrayList.get(i9)).getLayout().getText();
        }
        return "";
    }

    public final boolean g0(View view) {
        if (view instanceof m9) {
            ArrayList arrayList = this.F0;
            arrayList.clear();
            ((m9) view).fillTextLayoutBlocks(arrayList);
            if (view instanceof org.telegram.ui.x2) {
                return true;
            }
            return !arrayList.isEmpty();
        }
        return false;
    }

    public final void h0(m9 m9Var, m9 m9Var2, int i9) {
        int i10;
        int i11;
        int e02 = e0(m9Var2);
        if (m9Var != null) {
            i10 = e0(m9Var);
        } else {
            i10 = -1;
        }
        x();
        if (this.R && (i11 = this.f24774u0) == this.f24777x0) {
            if (e02 == i11) {
                if (i9 < this.f24775v0) {
                    this.f24775v0 = i9;
                    P();
                    this.f24087j = true;
                    int i12 = this.v;
                    this.f24776w0 = i12;
                    this.f24108u = i12 - 1;
                } else {
                    this.f24778y0 = i9;
                    O();
                    this.f24087j = false;
                    this.f24779z0 = 0;
                }
            } else if (e02 < i11) {
                this.f24774u0 = e02;
                this.f24775v0 = i9;
                P();
                this.f24087j = true;
                int i13 = this.v;
                this.f24776w0 = i13;
                this.f24108u = i13 - 1;
            } else {
                this.f24777x0 = e02;
                this.f24778y0 = i9;
                O();
                this.f24087j = false;
                this.f24779z0 = 0;
            }
        } else if (this.f24087j) {
            if (e02 == i10) {
                int i14 = this.f24778y0;
                if (i9 > i14 && e02 >= this.f24777x0) {
                    this.f24777x0 = e02;
                    this.f24775v0 = i14;
                    this.f24778y0 = i9;
                    this.f24776w0 = this.f24779z0;
                    O();
                    this.f24779z0 = 0;
                    this.f24087j = false;
                } else {
                    this.f24774u0 = e02;
                    this.f24775v0 = i9;
                    P();
                    this.f24776w0 = this.v;
                }
            } else if (e02 <= this.f24777x0) {
                this.f24774u0 = e02;
                this.f24775v0 = i9;
                P();
                this.f24776w0 = this.v;
            } else {
                this.f24777x0 = e02;
                this.f24775v0 = this.f24778y0;
                this.f24778y0 = i9;
                this.f24776w0 = this.f24779z0;
                O();
                this.f24779z0 = 0;
                this.f24087j = false;
            }
        } else if (e02 == i10) {
            int i15 = this.f24775v0;
            if (i9 < i15 && e02 <= this.f24774u0) {
                this.f24774u0 = e02;
                this.f24778y0 = i15;
                this.f24775v0 = i9;
                this.f24779z0 = this.f24776w0;
                P();
                this.f24087j = true;
                this.f24776w0 = this.v;
            } else {
                this.f24777x0 = e02;
                this.f24778y0 = i9;
                O();
                this.f24779z0 = 0;
            }
        } else if (e02 >= this.f24774u0) {
            this.f24777x0 = e02;
            this.f24778y0 = i9;
            O();
            this.f24779z0 = 0;
        } else {
            this.f24774u0 = e02;
            this.f24778y0 = this.f24775v0;
            this.f24775v0 = i9;
            this.f24779z0 = this.f24776w0;
            P();
            this.f24087j = true;
            this.f24776w0 = this.v;
        }
        ArrayList arrayList = this.F0;
        arrayList.clear();
        m9Var2.fillTextLayoutBlocks(arrayList);
        int size = arrayList.size();
        this.D0.put(e02, size);
        for (int i16 = 0; i16 < size; i16++) {
            X((y9) arrayList.get(i16), e02, i16);
        }
    }

    public final void i0(m9 m9Var, int i9) {
        ArrayList arrayList = this.F0;
        arrayList.clear();
        m9Var.fillTextLayoutBlocks(arrayList);
        int size = arrayList.size();
        this.D0.put(i9, size);
        for (int i10 = 0; i10 < size; i10++) {
            X((y9) arrayList.get(i10), i9, i10);
        }
    }

    @Override
    public final void j(int i9, q9 q9Var, boolean z10) {
        v9 v9Var;
        int i10;
        ArrayList arrayList = this.F0;
        arrayList.clear();
        q9Var.f24922e = null;
        if (z10) {
            v9Var = this.X;
        } else {
            v9Var = this.W;
        }
        m9 m9Var = (m9) v9Var;
        if (m9Var == null) {
            q9Var.f24920b = null;
            return;
        }
        m9Var.fillTextLayoutBlocks(arrayList);
        if (z10) {
            i10 = this.A0;
        } else if (this.J0) {
            i10 = this.f24775v0;
        } else {
            i10 = this.f24778y0;
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            q9Var.f24920b = ((y9) arrayList.get(i10)).getLayout();
            q9Var.f24922e = ((y9) arrayList.get(i10)).getSelectionBounds();
            q9Var.f24921c = 0.0f;
            q9Var.d = 0.0f;
            return;
        }
        q9Var.f24920b = null;
    }

    public final void j0(int i9, int i10) {
        int length;
        m9 m9Var;
        if (i9 >= 0 && i10 >= i9) {
            CharSequence charSequence = (CharSequence) this.B0.get(i10);
            if (charSequence == null) {
                length = 0;
            } else {
                length = charSequence.length();
            }
            if (this.F != null) {
                for (int i11 = 0; i11 < this.F.getChildCount(); i11++) {
                    View childAt = this.F.getChildAt(i11);
                    if (childAt instanceof m9) {
                        m9Var = (m9) childAt;
                        if (e0(m9Var) == i10) {
                            break;
                        }
                    }
                }
            }
            m9Var = null;
            this.W = m9Var;
            this.f24108u = 0;
            this.v = length;
            this.f24774u0 = i9;
            this.f24777x0 = i10;
            this.f24778y0 = 0;
            this.f24775v0 = 0;
            this.f24776w0 = 0;
            this.f24779z0 = length;
            SparseIntArray sparseIntArray = this.D0;
            sparseIntArray.put(i9, Math.max(1, sparseIntArray.get(i9)));
            sparseIntArray.put(i10, Math.max(1, sparseIntArray.get(i10)));
            this.G0 = i9;
            this.H0 = 0;
            z9 z9Var = this.C;
            if (z9Var != null) {
                z9Var.setVisibility(0);
            }
            V();
            x();
            v();
            g gVar = this.f24103r0;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            g7.a6 a6Var = this.D;
            if (a6Var != null) {
                a6Var.a(true);
            }
        }
    }

    public final boolean k0(m9 m9Var, int i9, int i10, int i11) {
        int e02 = e0(m9Var);
        if (e02 < 0 || i10 == i11) {
            return false;
        }
        int min = Math.min(i10, i11);
        int max = Math.max(i10, i11);
        this.W = m9Var;
        this.f24108u = min;
        this.v = max;
        this.f24777x0 = e02;
        this.f24774u0 = e02;
        this.f24778y0 = i9;
        this.f24775v0 = i9;
        this.f24776w0 = min;
        this.f24779z0 = max;
        this.G0 = e02;
        this.H0 = i10;
        this.I0 = i9;
        i0(m9Var, e02);
        ArrayList arrayList = this.F0;
        if (!arrayList.isEmpty() && i9 >= 0 && i9 < arrayList.size()) {
            this.f24071a = ((y9) arrayList.get(i9)).getX();
            this.f24073b = ((y9) arrayList.get(i9)).getY();
        } else if (!arrayList.isEmpty()) {
            this.f24071a = ((y9) arrayList.get(0)).getX();
            this.f24073b = ((y9) arrayList.get(0)).getY();
        }
        z9 z9Var = this.C;
        if (z9Var != null) {
            z9Var.setVisibility(0);
        }
        V();
        x();
        v();
        g gVar = this.f24103r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
        g7.a6 a6Var = this.D;
        if (a6Var != null) {
            a6Var.a(true);
        }
        m9Var.invalidate();
        return true;
    }

    @Override
    public final int l(int i9, int i10, int i11, int i12, v9 v9Var, boolean z10) {
        int i13;
        m9 m9Var = (m9) v9Var;
        if (m9Var != null) {
            int i14 = i9 - i11;
            int i15 = i10 - i12;
            ArrayList arrayList = this.F0;
            arrayList.clear();
            m9Var.fillTextLayoutBlocks(arrayList);
            if (z10) {
                i13 = this.A0;
            } else if (this.J0) {
                i13 = this.f24775v0;
            } else {
                i13 = this.f24778y0;
            }
            if (i13 >= 0 && i13 < arrayList.size()) {
                Layout layout = ((y9) arrayList.get(i13)).getLayout();
                if (i14 < 0) {
                    i14 = 1;
                }
                if (i15 < 0) {
                    i15 = 1;
                }
                if (i14 > layout.getWidth()) {
                    i14 = layout.getWidth();
                }
                if (i15 > layout.getLineBottom(layout.getLineCount() - 1)) {
                    i15 = layout.getLineBottom(layout.getLineCount() - 1) - 1;
                }
                int i16 = 0;
                while (true) {
                    if (i16 < layout.getLineCount()) {
                        if (i15 >= layout.getLineTop(i16) && i15 <= layout.getLineBottom(i16)) {
                            break;
                        }
                        i16++;
                    } else {
                        i16 = -1;
                        break;
                    }
                }
                if (i16 >= 0) {
                    return layout.getOffsetForHorizontal(i16, i14);
                }
            }
        }
        return -1;
    }

    public final void l0(View view, int i9, int i10) {
        if (view instanceof m9) {
            this.f24104s = i9;
            this.f24106t = i10;
            m9 m9Var = (m9) view;
            this.X = m9Var;
            int d02 = d0(i9, i10, m9Var);
            this.A0 = d02;
            if (d02 < 0) {
                this.X = null;
                return;
            }
            ArrayList arrayList = this.F0;
            this.f24075c = ((y9) arrayList.get(d02)).getX();
            this.d = ((y9) arrayList.get(this.A0)).getY();
        }
    }

    public final void m0() {
        if (this.X != null) {
            this.f24083g0.run();
        }
    }

    @Override
    public final int n() {
        int i9;
        if (this.W != null) {
            ArrayList arrayList = this.F0;
            arrayList.clear();
            ((m9) this.W).fillTextLayoutBlocks(arrayList);
            if (this.J0) {
                i9 = this.f24775v0;
            } else {
                i9 = this.f24778y0;
            }
            if (i9 >= 0 && i9 < arrayList.size()) {
                Layout layout = ((y9) arrayList.get(i9)).getLayout();
                int i10 = Integer.MAX_VALUE;
                for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
                    int lineBottom = layout.getLineBottom(i11) - layout.getLineTop(i11);
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
    public final CharSequence s() {
        p9[] p9VarArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i9 = this.f24774u0;
        while (true) {
            int i10 = this.f24777x0;
            if (i9 > i10) {
                break;
            }
            int i11 = this.f24774u0;
            SparseIntArray sparseIntArray = this.D0;
            SparseArray sparseArray = this.B0;
            SparseArray sparseArray2 = this.C0;
            if (i9 == i11) {
                int i12 = i11 == i10 ? this.f24778y0 : sparseIntArray.get(i9) - 1;
                for (int i13 = this.f24775v0; i13 <= i12; i13++) {
                    int i14 = (i13 << 16) + i9;
                    CharSequence charSequence = (CharSequence) sparseArray.get(i14);
                    if (charSequence != null) {
                        int i15 = this.f24774u0;
                        int i16 = this.f24777x0;
                        if (i15 == i16 && i13 == this.f24778y0 && i13 == this.f24775v0) {
                            int i17 = this.f24779z0;
                            int i18 = this.f24776w0;
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
                        } else if (i15 == i16 && i13 == this.f24778y0) {
                            CharSequence charSequence2 = (CharSequence) sparseArray2.get(i14);
                            if (charSequence2 != null) {
                                spannableStringBuilder.append(charSequence2).append(' ');
                            }
                            int i19 = this.f24779z0;
                            if (i19 > charSequence.length()) {
                                i19 = charSequence.length();
                            }
                            spannableStringBuilder.append(charSequence.subSequence(0, i19));
                            spannableStringBuilder.append('\n');
                        } else if (i13 == this.f24775v0) {
                            int i20 = this.f24776w0;
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
            } else if (i9 == i10) {
                for (int i21 = 0; i21 <= this.f24778y0; i21++) {
                    int i22 = (i21 << 16) + i9;
                    CharSequence charSequence4 = (CharSequence) sparseArray.get(i22);
                    if (charSequence4 != null) {
                        if (this.f24774u0 == this.f24777x0 && i21 == this.f24778y0 && i21 == this.f24775v0) {
                            int i23 = this.f24779z0;
                            int i24 = this.f24776w0;
                            if (i24 < charSequence4.length()) {
                                if (i23 > charSequence4.length()) {
                                    i23 = charSequence4.length();
                                }
                                spannableStringBuilder.append(charSequence4.subSequence(i24, i23));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i21 == this.f24778y0) {
                            CharSequence charSequence5 = (CharSequence) sparseArray2.get(i22);
                            if (charSequence5 != null) {
                                spannableStringBuilder.append(charSequence5).append(' ');
                            }
                            int i25 = this.f24779z0;
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
                int i26 = sparseIntArray.get(i9);
                for (int i27 = this.f24775v0; i27 < i26; i27++) {
                    int i28 = (i27 << 16) + i9;
                    CharSequence charSequence7 = (CharSequence) sparseArray2.get(i28);
                    if (charSequence7 != null) {
                        spannableStringBuilder.append(charSequence7).append(' ');
                    }
                    spannableStringBuilder.append((CharSequence) sparseArray.get(i28));
                    spannableStringBuilder.append('\n');
                }
            }
            i9++;
        }
        if (spannableStringBuilder.length() > 0) {
            t9[] t9VarArr = (t9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, t9.class);
            if (t9VarArr != null && t9VarArr.length > 0) {
                Arrays.sort(t9VarArr, new o1(spannableStringBuilder, 1));
                for (t9 t9Var : t9VarArr) {
                    int spanStart = spannableStringBuilder.getSpanStart(t9Var);
                    int spanEnd = spannableStringBuilder.getSpanEnd(t9Var);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        CharSequence charSequence8 = t9Var.f25719a;
                        if (charSequence8 == null) {
                            charSequence8 = "";
                        }
                        spannableStringBuilder.replace(spanStart, spanEnd, charSequence8);
                    }
                }
            }
            for (p9 p9Var : (p9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, p9.class)) {
                spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(p9Var), spannableStringBuilder.getSpanEnd(p9Var));
            }
            return spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1);
        }
        return null;
    }

    @Override
    public final void x() {
        super.x();
        if (this.F != null) {
            for (int i9 = 0; i9 < this.F.getChildCount(); i9++) {
                this.F.getChildAt(i9).invalidate();
            }
        }
    }
}
