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
public class l9 extends y9 {
    public f2.i0 E0;
    public boolean J0;
    public int f21333w0;
    public int f21336z0;
    public int f21331u0 = -1;
    public int f21332v0 = -1;
    public int f21334x0 = -1;
    public int f21335y0 = -1;
    public int A0 = -1;
    public final SparseArray B0 = new SparseArray();
    public final SparseArray C0 = new SparseArray();
    public final SparseIntArray D0 = new SparseIntArray();
    public final ArrayList F0 = new ArrayList();
    public int G0 = -1;
    public int H0 = -1;
    public int I0 = 0;

    public l9() {
        this.Z = true;
        this.f22607d0 = true;
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
    public final void B(int i10, int i11, boolean z4, float f10, float f11, t9 t9Var) {
        k9 k9Var = (k9) t9Var;
        if (z4 && k9Var == this.W && f11 == f10) {
            if (this.f22616j) {
                this.f22637u = i10;
                return;
            } else {
                this.v = i10;
                return;
            }
        }
        super.B(i10, i11, z4, f10, f11, k9Var);
    }

    @Override
    public void G() {
        int i10;
        int e02 = e0((k9) this.W);
        if (this.J0) {
            i10 = this.f21332v0;
        } else {
            i10 = this.f21335y0;
        }
        if (e02 == this.f21331u0 && i10 == this.f21332v0) {
            this.f21333w0 = this.f22637u;
        }
        if (e02 == this.f21334x0 && i10 == this.f21335y0) {
            this.f21336z0 = this.v;
        }
    }

    @Override
    public final void M(t9 t9Var, t9 t9Var2) {
        k9 k9Var = (k9) t9Var;
        k9 k9Var2 = (k9) t9Var2;
        int e02 = e0(k9Var);
        if (e02 >= 0) {
            this.f21334x0 = e02;
            this.f21331u0 = e02;
            int i10 = this.A0;
            this.f21335y0 = i10;
            this.f21332v0 = i10;
            ArrayList arrayList = this.F0;
            arrayList.clear();
            k9Var.fillTextLayoutBlocks(arrayList);
            int size = arrayList.size();
            this.D0.put(e02, size);
            for (int i11 = 0; i11 < size; i11++) {
                X((w9) arrayList.get(i11), e02, i11);
            }
        }
    }

    @Override
    public final void O() {
        k9 k9Var;
        if (y()) {
            this.J0 = false;
            int i10 = this.f21334x0;
            if (i10 >= 0) {
                f2.i0 i0Var = this.E0;
                if (i0Var != null) {
                    k9Var = (k9) i0Var.m(i10);
                } else if (i10 < this.F.getChildCount()) {
                    k9Var = (k9) this.F.getChildAt(this.f21334x0);
                } else {
                    k9Var = null;
                }
                if (k9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = k9Var;
                if (this.f21331u0 != this.f21334x0) {
                    this.f22637u = 0;
                } else if (this.f21332v0 != this.f21335y0) {
                    this.f22637u = 0;
                } else {
                    this.f22637u = this.f21333w0;
                }
                this.v = this.f21336z0;
                CharSequence t6 = t(k9Var, false);
                if (this.v > t6.length()) {
                    this.v = t6.length();
                }
                ArrayList arrayList = this.F0;
                arrayList.clear();
                ((k9) this.W).fillTextLayoutBlocks(arrayList);
                int i11 = this.f21335y0;
                if (i11 >= 0 && i11 < arrayList.size()) {
                    this.f22601a = ((w9) arrayList.get(this.f21335y0)).getX();
                    this.f22603b = ((w9) arrayList.get(this.f21335y0)).getY();
                }
            }
        }
    }

    @Override
    public final void P() {
        k9 k9Var;
        if (y()) {
            this.J0 = true;
            int i10 = this.f21331u0;
            if (i10 >= 0) {
                f2.i0 i0Var = this.E0;
                if (i0Var != null) {
                    k9Var = (k9) i0Var.m(i10);
                } else if (this.f21334x0 < this.F.getChildCount()) {
                    k9Var = (k9) this.F.getChildAt(this.f21331u0);
                } else {
                    k9Var = null;
                }
                if (k9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = k9Var;
                if (this.f21331u0 != this.f21334x0) {
                    this.v = t(k9Var, false).length();
                } else if (this.f21332v0 != this.f21335y0) {
                    this.v = t(k9Var, false).length();
                } else {
                    this.v = this.f21336z0;
                }
                this.f22637u = this.f21333w0;
                ArrayList arrayList = this.F0;
                arrayList.clear();
                ((k9) this.W).fillTextLayoutBlocks(arrayList);
                int i11 = this.f21332v0;
                if (i11 >= 0 && i11 < arrayList.size()) {
                    this.f22601a = ((w9) arrayList.get(this.f21332v0)).getX();
                    this.f22603b = ((w9) arrayList.get(this.f21332v0)).getY();
                }
            }
        }
    }

    @Override
    public final boolean Q(int i10, int i11) {
        int i12;
        if (this.Z) {
            if (i11 > ((k9) this.W).getTop() && i11 < ((k9) this.W).getBottom()) {
                if (this.J0) {
                    i12 = this.f21332v0;
                } else {
                    i12 = this.f21335y0;
                }
                int d02 = d0((int) (i10 - ((k9) this.W).getX()), (int) (i11 - ((k9) this.W).getY()), (k9) this.W);
                if (d02 != i12 && d02 >= 0) {
                    k9 k9Var = (k9) this.W;
                    h0(k9Var, k9Var, d02);
                    return true;
                }
            } else {
                int childCount = this.F.getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= childCount) {
                        break;
                    }
                    if (g0(this.F.getChildAt(i13))) {
                        k9 k9Var2 = (k9) this.F.getChildAt(i13);
                        if (i11 > k9Var2.getTop() && i11 < k9Var2.getBottom()) {
                            int d03 = d0((int) (i10 - k9Var2.getX()), (int) (i11 - k9Var2.getY()), k9Var2);
                            if (d03 >= 0) {
                                h0((k9) this.W, k9Var2, d03);
                                this.W = k9Var2;
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

    public final void X(w9 w9Var, int i10, int i11) {
        int i12 = i10 + (i11 << 16);
        this.B0.put(i12, Z(w9Var.getText()));
        CharSequence prefix = w9Var.getPrefix();
        SparseArray sparseArray = this.C0;
        if (prefix == null) {
            sparseArray.remove(i12);
        } else {
            sparseArray.put(i12, Z(prefix));
        }
    }

    public final void Y(int i10, String str) {
        this.B0.put(i10, Z(str));
        this.C0.remove(i10);
        SparseIntArray sparseIntArray = this.D0;
        sparseIntArray.put(i10, Math.max(1, sparseIntArray.get(i10)));
    }

    public final void a0(Canvas canvas, k9 k9Var, int i10) {
        w9 w9Var;
        int i11 = org.telegram.ui.ActionBar.j6.f20191uf;
        this.f22625o.setColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f22613h0));
        this.f22627p.setColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f22613h0));
        int e02 = e0(k9Var);
        if (e02 >= 0) {
            ArrayList arrayList = this.F0;
            arrayList.clear();
            k9Var.fillTextLayoutBlocks(arrayList);
            if (i10 >= 0 && i10 < arrayList.size() && (w9Var = (w9) arrayList.get(i10)) != null && w9Var.getLayout() != null && w9Var.getLayout().getText() != null) {
                int i12 = this.f21336z0;
                int length = w9Var.getLayout().getText().length();
                if (i12 > length) {
                    i12 = length;
                }
                int i13 = this.f21331u0;
                if (e02 == i13 && e02 == this.f21334x0) {
                    int i14 = this.f21332v0;
                    int i15 = this.f21335y0;
                    if (i14 == i15 && i14 == i10) {
                        i(canvas, w9Var.getLayout(), this.f21333w0, i12, true, true, 0.0f);
                        return;
                    } else if (i10 == i14) {
                        i(canvas, w9Var.getLayout(), this.f21333w0, length, true, false, 0.0f);
                        return;
                    } else {
                        int i16 = i12;
                        if (i10 == i15) {
                            i(canvas, w9Var.getLayout(), 0, i16, false, true, 0.0f);
                            return;
                        } else if (i10 > i14 && i10 < i15) {
                            i(canvas, w9Var.getLayout(), 0, length, false, false, 0.0f);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                int i17 = i12;
                if (e02 == i13 && this.f21332v0 == i10) {
                    i(canvas, w9Var.getLayout(), this.f21333w0, length, true, false, 0.0f);
                    return;
                }
                int i18 = this.f21334x0;
                if (e02 == i18 && this.f21335y0 == i10) {
                    i(canvas, w9Var.getLayout(), 0, i17, false, true, 0.0f);
                } else if ((e02 > i13 && e02 < i18) || ((e02 == i13 && i10 > this.f21332v0) || (e02 == i18 && i10 < this.f21335y0))) {
                    i(canvas, w9Var.getLayout(), 0, length, false, false, 0.0f);
                }
            }
        }
    }

    public final boolean b0() {
        int i10;
        int length;
        if (y() && this.W != null && this.f21331u0 == this.f21334x0 && (i10 = this.f21332v0) == this.f21335y0) {
            if (i10 < 0) {
                i10 = 0;
            }
            ArrayList arrayList = this.F0;
            arrayList.clear();
            ((k9) this.W).fillTextLayoutBlocks(arrayList);
            if (!arrayList.isEmpty() && i10 < arrayList.size() && (length = ((w9) arrayList.get(i10)).getLayout().getText().length()) > 0 && (this.f21333w0 > 0 || this.f21336z0 < length)) {
                return k0((k9) this.W, i10, 0, length);
            }
        }
        return false;
    }

    @Override
    public final boolean c(int i10) {
        if (this.f21331u0 == this.f21334x0 && this.f21332v0 == this.f21335y0) {
            return super.c(i10);
        }
        return true;
    }

    public final boolean c0(int i10, int i11, k9 k9Var) {
        int compare;
        int i12;
        int i13;
        int i14;
        int e02 = e0(k9Var);
        if (e02 < 0) {
            return false;
        }
        if (this.G0 < 0) {
            this.G0 = this.f21331u0;
            this.I0 = this.f21332v0;
            this.H0 = this.f21333w0;
        }
        i0(k9Var, e02);
        int i15 = this.G0;
        int i16 = this.I0;
        int i17 = this.H0;
        if (e02 != i15) {
            compare = Integer.compare(e02, i15);
        } else if (i10 != i16) {
            compare = Integer.compare(i10, i16);
        } else {
            compare = Integer.compare(i11, i17);
        }
        if (compare < 0) {
            i14 = this.G0;
            i12 = this.I0;
            i13 = this.H0;
        } else {
            int i18 = this.G0;
            i12 = i10;
            i10 = this.I0;
            i13 = i11;
            i11 = this.H0;
            e02 = i18;
            i14 = e02;
        }
        if (e02 == i14 && i10 == i12 && i11 == i13) {
            f(false);
            return true;
        }
        this.f21331u0 = e02;
        this.f21332v0 = i10;
        this.f21333w0 = i11;
        this.f21334x0 = i14;
        this.f21335y0 = i12;
        this.f21336z0 = i13;
        O();
        x();
        x9 x9Var = this.C;
        if (x9Var != null) {
            x9Var.invalidate();
        }
        g gVar = this.f22632r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
        return true;
    }

    @Override
    public final boolean d() {
        f2.i0 i0Var = this.E0;
        if (i0Var == null) {
            return true;
        }
        int L0 = i0Var.L0();
        int N0 = this.E0.N0();
        int i10 = this.f21331u0;
        if ((L0 >= i10 && L0 <= this.f21334x0) || (N0 >= i10 && N0 <= this.f21334x0)) {
            return true;
        }
        if (i10 >= L0 && this.f21334x0 <= N0) {
            return true;
        }
        return false;
    }

    public final int d0(int i10, int i11, k9 k9Var) {
        int i12 = 0;
        if (k9Var instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) k9Var;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof k9) {
                    float f10 = i11;
                    if (f10 > childAt.getY() && f10 < childAt.getY() + childAt.getHeight()) {
                        return d0((int) (i10 - childAt.getX()), (int) (f10 - childAt.getY()), (k9) childAt);
                    }
                }
            }
        }
        ArrayList arrayList = this.F0;
        arrayList.clear();
        k9Var.fillTextLayoutBlocks(arrayList);
        if (arrayList.isEmpty()) {
            return -1;
        }
        int size = arrayList.size() - 1;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        int i16 = -1;
        while (true) {
            if (size >= 0) {
                w9 w9Var = (w9) arrayList.get(size);
                int y10 = w9Var.getY();
                int height = w9Var.getLayout().getHeight() + y10;
                if (i11 >= y10 && i11 < height) {
                    break;
                }
                int min = Math.min(Math.abs(i11 - y10), Math.abs(i11 - height));
                if (min < i15) {
                    i16 = size;
                    i15 = min;
                }
                size--;
            } else {
                i12 = i15;
                size = i16;
                break;
            }
        }
        if (size < 0) {
            return -1;
        }
        int row = ((w9) arrayList.get(size)).getRow();
        if (row > 0 && i12 < AndroidUtilities.dp(24.0f)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                w9 w9Var2 = (w9) arrayList.get(size2);
                if (w9Var2.getRow() == row) {
                    int x10 = w9Var2.getX();
                    int width = w9Var2.getLayout().getWidth() + w9Var2.getX();
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

    public final int e0(k9 k9Var) {
        ViewGroup viewGroup;
        View view = (View) k9Var;
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
    public final void f(boolean z4) {
        super.f(z4);
        this.f21331u0 = -1;
        this.f21334x0 = -1;
        this.f21332v0 = -1;
        this.f21335y0 = -1;
        this.B0.clear();
        this.D0.clear();
        this.G0 = -1;
        this.H0 = -1;
    }

    @Override
    public final CharSequence t(k9 k9Var, boolean z4) {
        int i10;
        ArrayList arrayList = this.F0;
        arrayList.clear();
        k9Var.fillTextLayoutBlocks(arrayList);
        if (z4) {
            i10 = this.A0;
        } else if (this.J0) {
            i10 = this.f21332v0;
        } else {
            i10 = this.f21335y0;
        }
        if (!arrayList.isEmpty() && i10 >= 0 && i10 < arrayList.size()) {
            return ((w9) arrayList.get(i10)).getLayout().getText();
        }
        return "";
    }

    public final boolean g0(View view) {
        if (view instanceof k9) {
            ArrayList arrayList = this.F0;
            arrayList.clear();
            ((k9) view).fillTextLayoutBlocks(arrayList);
            if (view instanceof org.telegram.ui.y2) {
                return true;
            }
            return !arrayList.isEmpty();
        }
        return false;
    }

    public final void h0(k9 k9Var, k9 k9Var2, int i10) {
        int i11;
        int i12;
        int e02 = e0(k9Var2);
        if (k9Var != null) {
            i11 = e0(k9Var);
        } else {
            i11 = -1;
        }
        x();
        if (this.R && (i12 = this.f21331u0) == this.f21334x0) {
            if (e02 == i12) {
                if (i10 < this.f21332v0) {
                    this.f21332v0 = i10;
                    P();
                    this.f22616j = true;
                    int i13 = this.v;
                    this.f21333w0 = i13;
                    this.f22637u = i13 - 1;
                } else {
                    this.f21335y0 = i10;
                    O();
                    this.f22616j = false;
                    this.f21336z0 = 0;
                }
            } else if (e02 < i12) {
                this.f21331u0 = e02;
                this.f21332v0 = i10;
                P();
                this.f22616j = true;
                int i14 = this.v;
                this.f21333w0 = i14;
                this.f22637u = i14 - 1;
            } else {
                this.f21334x0 = e02;
                this.f21335y0 = i10;
                O();
                this.f22616j = false;
                this.f21336z0 = 0;
            }
        } else if (this.f22616j) {
            if (e02 == i11) {
                int i15 = this.f21335y0;
                if (i10 > i15 && e02 >= this.f21334x0) {
                    this.f21334x0 = e02;
                    this.f21332v0 = i15;
                    this.f21335y0 = i10;
                    this.f21333w0 = this.f21336z0;
                    O();
                    this.f21336z0 = 0;
                    this.f22616j = false;
                } else {
                    this.f21331u0 = e02;
                    this.f21332v0 = i10;
                    P();
                    this.f21333w0 = this.v;
                }
            } else if (e02 <= this.f21334x0) {
                this.f21331u0 = e02;
                this.f21332v0 = i10;
                P();
                this.f21333w0 = this.v;
            } else {
                this.f21334x0 = e02;
                this.f21332v0 = this.f21335y0;
                this.f21335y0 = i10;
                this.f21333w0 = this.f21336z0;
                O();
                this.f21336z0 = 0;
                this.f22616j = false;
            }
        } else if (e02 == i11) {
            int i16 = this.f21332v0;
            if (i10 < i16 && e02 <= this.f21331u0) {
                this.f21331u0 = e02;
                this.f21335y0 = i16;
                this.f21332v0 = i10;
                this.f21336z0 = this.f21333w0;
                P();
                this.f22616j = true;
                this.f21333w0 = this.v;
            } else {
                this.f21334x0 = e02;
                this.f21335y0 = i10;
                O();
                this.f21336z0 = 0;
            }
        } else if (e02 >= this.f21331u0) {
            this.f21334x0 = e02;
            this.f21335y0 = i10;
            O();
            this.f21336z0 = 0;
        } else {
            this.f21331u0 = e02;
            this.f21335y0 = this.f21332v0;
            this.f21332v0 = i10;
            this.f21336z0 = this.f21333w0;
            P();
            this.f22616j = true;
            this.f21333w0 = this.v;
        }
        ArrayList arrayList = this.F0;
        arrayList.clear();
        k9Var2.fillTextLayoutBlocks(arrayList);
        int size = arrayList.size();
        this.D0.put(e02, size);
        for (int i17 = 0; i17 < size; i17++) {
            X((w9) arrayList.get(i17), e02, i17);
        }
    }

    public final void i0(k9 k9Var, int i10) {
        ArrayList arrayList = this.F0;
        arrayList.clear();
        k9Var.fillTextLayoutBlocks(arrayList);
        int size = arrayList.size();
        this.D0.put(i10, size);
        for (int i11 = 0; i11 < size; i11++) {
            X((w9) arrayList.get(i11), i10, i11);
        }
    }

    @Override
    public final void j(int i10, o9 o9Var, boolean z4) {
        t9 t9Var;
        int i11;
        ArrayList arrayList = this.F0;
        arrayList.clear();
        o9Var.e = null;
        if (z4) {
            t9Var = this.X;
        } else {
            t9Var = this.W;
        }
        k9 k9Var = (k9) t9Var;
        if (k9Var == null) {
            o9Var.f21488b = null;
            return;
        }
        k9Var.fillTextLayoutBlocks(arrayList);
        if (z4) {
            i11 = this.A0;
        } else if (this.J0) {
            i11 = this.f21332v0;
        } else {
            i11 = this.f21335y0;
        }
        if (i11 >= 0 && i11 < arrayList.size()) {
            o9Var.f21488b = ((w9) arrayList.get(i11)).getLayout();
            o9Var.e = ((w9) arrayList.get(i11)).getSelectionBounds();
            o9Var.f21489c = 0.0f;
            o9Var.d = 0.0f;
            return;
        }
        o9Var.f21488b = null;
    }

    public final void j0(int i10, int i11) {
        int length;
        k9 k9Var;
        if (i10 >= 0 && i11 >= i10) {
            CharSequence charSequence = (CharSequence) this.B0.get(i11);
            if (charSequence == null) {
                length = 0;
            } else {
                length = charSequence.length();
            }
            if (this.F != null) {
                for (int i12 = 0; i12 < this.F.getChildCount(); i12++) {
                    View childAt = this.F.getChildAt(i12);
                    if (childAt instanceof k9) {
                        k9Var = (k9) childAt;
                        if (e0(k9Var) == i11) {
                            break;
                        }
                    }
                }
            }
            k9Var = null;
            this.W = k9Var;
            this.f22637u = 0;
            this.v = length;
            this.f21331u0 = i10;
            this.f21334x0 = i11;
            this.f21335y0 = 0;
            this.f21332v0 = 0;
            this.f21333w0 = 0;
            this.f21336z0 = length;
            SparseIntArray sparseIntArray = this.D0;
            sparseIntArray.put(i10, Math.max(1, sparseIntArray.get(i10)));
            sparseIntArray.put(i11, Math.max(1, sparseIntArray.get(i11)));
            this.G0 = i10;
            this.H0 = 0;
            x9 x9Var = this.C;
            if (x9Var != null) {
                x9Var.setVisibility(0);
            }
            V();
            x();
            v();
            g gVar = this.f22632r0;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            k7.x5 x5Var = this.D;
            if (x5Var != null) {
                x5Var.a(true);
            }
        }
    }

    public final boolean k0(k9 k9Var, int i10, int i11, int i12) {
        int e02 = e0(k9Var);
        if (e02 < 0 || i11 == i12) {
            return false;
        }
        int min = Math.min(i11, i12);
        int max = Math.max(i11, i12);
        this.W = k9Var;
        this.f22637u = min;
        this.v = max;
        this.f21334x0 = e02;
        this.f21331u0 = e02;
        this.f21335y0 = i10;
        this.f21332v0 = i10;
        this.f21333w0 = min;
        this.f21336z0 = max;
        this.G0 = e02;
        this.H0 = i11;
        this.I0 = i10;
        i0(k9Var, e02);
        ArrayList arrayList = this.F0;
        if (!arrayList.isEmpty() && i10 >= 0 && i10 < arrayList.size()) {
            this.f22601a = ((w9) arrayList.get(i10)).getX();
            this.f22603b = ((w9) arrayList.get(i10)).getY();
        } else if (!arrayList.isEmpty()) {
            this.f22601a = ((w9) arrayList.get(0)).getX();
            this.f22603b = ((w9) arrayList.get(0)).getY();
        }
        x9 x9Var = this.C;
        if (x9Var != null) {
            x9Var.setVisibility(0);
        }
        V();
        x();
        v();
        g gVar = this.f22632r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
        k7.x5 x5Var = this.D;
        if (x5Var != null) {
            x5Var.a(true);
        }
        k9Var.invalidate();
        return true;
    }

    @Override
    public final int l(int i10, int i11, int i12, int i13, t9 t9Var, boolean z4) {
        int i14;
        k9 k9Var = (k9) t9Var;
        if (k9Var != null) {
            int i15 = i10 - i12;
            int i16 = i11 - i13;
            ArrayList arrayList = this.F0;
            arrayList.clear();
            k9Var.fillTextLayoutBlocks(arrayList);
            if (z4) {
                i14 = this.A0;
            } else if (this.J0) {
                i14 = this.f21332v0;
            } else {
                i14 = this.f21335y0;
            }
            if (i14 >= 0 && i14 < arrayList.size()) {
                Layout layout = ((w9) arrayList.get(i14)).getLayout();
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

    public final void l0(View view, int i10, int i11) {
        if (view instanceof k9) {
            this.f22633s = i10;
            this.f22635t = i11;
            k9 k9Var = (k9) view;
            this.X = k9Var;
            int d02 = d0(i10, i11, k9Var);
            this.A0 = d02;
            if (d02 < 0) {
                this.X = null;
                return;
            }
            ArrayList arrayList = this.F0;
            this.f22605c = ((w9) arrayList.get(d02)).getX();
            this.d = ((w9) arrayList.get(this.A0)).getY();
        }
    }

    public final void m0() {
        if (this.X != null) {
            this.f22612g0.run();
        }
    }

    @Override
    public final int n() {
        int i10;
        if (this.W != null) {
            ArrayList arrayList = this.F0;
            arrayList.clear();
            ((k9) this.W).fillTextLayoutBlocks(arrayList);
            if (this.J0) {
                i10 = this.f21332v0;
            } else {
                i10 = this.f21335y0;
            }
            if (i10 >= 0 && i10 < arrayList.size()) {
                Layout layout = ((w9) arrayList.get(i10)).getLayout();
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
    public final CharSequence s() {
        n9[] n9VarArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.f21331u0;
        while (true) {
            int i11 = this.f21334x0;
            if (i10 > i11) {
                break;
            }
            int i12 = this.f21331u0;
            SparseIntArray sparseIntArray = this.D0;
            SparseArray sparseArray = this.B0;
            SparseArray sparseArray2 = this.C0;
            if (i10 == i12) {
                int i13 = i12 == i11 ? this.f21335y0 : sparseIntArray.get(i10) - 1;
                for (int i14 = this.f21332v0; i14 <= i13; i14++) {
                    int i15 = (i14 << 16) + i10;
                    CharSequence charSequence = (CharSequence) sparseArray.get(i15);
                    if (charSequence != null) {
                        int i16 = this.f21331u0;
                        int i17 = this.f21334x0;
                        if (i16 == i17 && i14 == this.f21335y0 && i14 == this.f21332v0) {
                            int i18 = this.f21336z0;
                            int i19 = this.f21333w0;
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
                        } else if (i16 == i17 && i14 == this.f21335y0) {
                            CharSequence charSequence2 = (CharSequence) sparseArray2.get(i15);
                            if (charSequence2 != null) {
                                spannableStringBuilder.append(charSequence2).append(' ');
                            }
                            int i20 = this.f21336z0;
                            if (i20 > charSequence.length()) {
                                i20 = charSequence.length();
                            }
                            spannableStringBuilder.append(charSequence.subSequence(0, i20));
                            spannableStringBuilder.append('\n');
                        } else if (i14 == this.f21332v0) {
                            int i21 = this.f21333w0;
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
                for (int i22 = 0; i22 <= this.f21335y0; i22++) {
                    int i23 = (i22 << 16) + i10;
                    CharSequence charSequence4 = (CharSequence) sparseArray.get(i23);
                    if (charSequence4 != null) {
                        if (this.f21331u0 == this.f21334x0 && i22 == this.f21335y0 && i22 == this.f21332v0) {
                            int i24 = this.f21336z0;
                            int i25 = this.f21333w0;
                            if (i25 < charSequence4.length()) {
                                if (i24 > charSequence4.length()) {
                                    i24 = charSequence4.length();
                                }
                                spannableStringBuilder.append(charSequence4.subSequence(i25, i24));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i22 == this.f21335y0) {
                            CharSequence charSequence5 = (CharSequence) sparseArray2.get(i23);
                            if (charSequence5 != null) {
                                spannableStringBuilder.append(charSequence5).append(' ');
                            }
                            int i26 = this.f21336z0;
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
                for (int i28 = this.f21332v0; i28 < i27; i28++) {
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
            r9[] r9VarArr = (r9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, r9.class);
            if (r9VarArr != null && r9VarArr.length > 0) {
                Arrays.sort(r9VarArr, new n1(spannableStringBuilder, 1));
                for (r9 r9Var : r9VarArr) {
                    int spanStart = spannableStringBuilder.getSpanStart(r9Var);
                    int spanEnd = spannableStringBuilder.getSpanEnd(r9Var);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        CharSequence charSequence8 = r9Var.f21893a;
                        if (charSequence8 == null) {
                            charSequence8 = "";
                        }
                        spannableStringBuilder.replace(spanStart, spanEnd, charSequence8);
                    }
                }
            }
            for (n9 n9Var : (n9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, n9.class)) {
                spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(n9Var), spannableStringBuilder.getSpanEnd(n9Var));
            }
            return spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1);
        }
        return null;
    }

    @Override
    public final void x() {
        super.x();
        if (this.F != null) {
            for (int i10 = 0; i10 < this.F.getChildCount(); i10++) {
                this.F.getChildAt(i10).invalidate();
            }
        }
    }
}
