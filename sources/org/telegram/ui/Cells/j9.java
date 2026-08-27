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
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;

public class j9 extends w9 {
    public f2.k0 E0;
    public boolean J0;

    public int f24542w0;

    public int f24545z0;

    public int f24540u0 = -1;

    public int f24541v0 = -1;

    public int f24543x0 = -1;

    public int f24544y0 = -1;
    public int A0 = -1;
    public final SparseArray B0 = new SparseArray();
    public final SparseArray C0 = new SparseArray();
    public final SparseIntArray D0 = new SparseIntArray();
    public final ArrayList F0 = new ArrayList();
    public int G0 = -1;
    public int H0 = -1;
    public int I0 = 0;

    public j9() {
        this.Z = true;
        this.f25864d0 = true;
    }

    public static CharSequence Z(CharSequence charSequence) {
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
    public final void B(int i10, int i11, boolean z10, float f10, float f11, r9 r9Var) {
        i9 i9Var = (i9) r9Var;
        if (!z10 || i9Var != this.W || f11 != f10) {
            super.B(i10, i11, z10, f10, f11, i9Var);
        } else if (this.f25874j) {
            this.f25895u = i10;
        } else {
            this.v = i10;
        }
    }

    @Override
    public void G() {
        int iE0 = e0((i9) this.W);
        int i10 = this.J0 ? this.f24541v0 : this.f24544y0;
        if (iE0 == this.f24540u0 && i10 == this.f24541v0) {
            this.f24542w0 = this.f25895u;
        }
        if (iE0 == this.f24543x0 && i10 == this.f24544y0) {
            this.f24545z0 = this.v;
        }
    }

    @Override
    public final void M(r9 r9Var, r9 r9Var2) {
        i9 i9Var = (i9) r9Var;
        int iE0 = e0(i9Var);
        if (iE0 < 0) {
            return;
        }
        this.f24543x0 = iE0;
        this.f24540u0 = iE0;
        int i10 = this.A0;
        this.f24544y0 = i10;
        this.f24541v0 = i10;
        ArrayList arrayList = this.F0;
        arrayList.clear();
        i9Var.fillTextLayoutBlocks(arrayList);
        int size = arrayList.size();
        this.D0.put(iE0, size);
        for (int i11 = 0; i11 < size; i11++) {
            X((u9) arrayList.get(i11), iE0, i11);
        }
    }

    @Override
    public final void O() {
        i9 i9Var;
        if (y()) {
            this.J0 = false;
            int i10 = this.f24543x0;
            if (i10 >= 0) {
                f2.k0 k0Var = this.E0;
                if (k0Var != null) {
                    i9Var = (i9) k0Var.m(i10);
                } else {
                    i9Var = i10 < this.F.getChildCount() ? (i9) this.F.getChildAt(this.f24543x0) : null;
                }
                if (i9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = i9Var;
                if (this.f24540u0 == this.f24543x0 && this.f24541v0 == this.f24544y0) {
                    this.f25895u = this.f24542w0;
                } else {
                    this.f25895u = 0;
                }
                this.v = this.f24545z0;
                CharSequence charSequenceT = t(i9Var, false);
                if (this.v > charSequenceT.length()) {
                    this.v = charSequenceT.length();
                }
                ArrayList arrayList = this.F0;
                arrayList.clear();
                ((i9) this.W).fillTextLayoutBlocks(arrayList);
                int i11 = this.f24544y0;
                if (i11 < 0 || i11 >= arrayList.size()) {
                    return;
                }
                this.f25858a = ((u9) arrayList.get(this.f24544y0)).getX();
                this.f25860b = ((u9) arrayList.get(this.f24544y0)).getY();
            }
        }
    }

    @Override
    public final void P() {
        i9 i9Var;
        if (y()) {
            this.J0 = true;
            int i10 = this.f24540u0;
            if (i10 >= 0) {
                f2.k0 k0Var = this.E0;
                if (k0Var != null) {
                    i9Var = (i9) k0Var.m(i10);
                } else {
                    i9Var = this.f24543x0 < this.F.getChildCount() ? (i9) this.F.getChildAt(this.f24540u0) : null;
                }
                if (i9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = i9Var;
                if (this.f24540u0 == this.f24543x0 && this.f24541v0 == this.f24544y0) {
                    this.v = this.f24545z0;
                } else {
                    this.v = t(i9Var, false).length();
                }
                this.f25895u = this.f24542w0;
                ArrayList arrayList = this.F0;
                arrayList.clear();
                ((i9) this.W).fillTextLayoutBlocks(arrayList);
                int i11 = this.f24541v0;
                if (i11 < 0 || i11 >= arrayList.size()) {
                    return;
                }
                this.f25858a = ((u9) arrayList.get(this.f24541v0)).getX();
                this.f25860b = ((u9) arrayList.get(this.f24541v0)).getY();
            }
        }
    }

    @Override
    public final boolean Q(int i10, int i11) {
        if (this.Z) {
            if (i11 <= ((i9) this.W).getTop() || i11 >= ((i9) this.W).getBottom()) {
                int childCount = this.F.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    if (g0(this.F.getChildAt(i12))) {
                        i9 i9Var = (i9) this.F.getChildAt(i12);
                        if (i11 > i9Var.getTop() && i11 < i9Var.getBottom()) {
                            int iD0 = d0((int) (i10 - i9Var.getX()), (int) (i11 - i9Var.getY()), i9Var);
                            if (iD0 < 0) {
                                break;
                            }
                            h0((i9) this.W, i9Var, iD0);
                            this.W = i9Var;
                            return true;
                        }
                    }
                }
            } else {
                int i13 = this.J0 ? this.f24541v0 : this.f24544y0;
                int iD1 = d0((int) (i10 - ((i9) this.W).getX()), (int) (i11 - ((i9) this.W).getY()), (i9) this.W);
                if (iD1 != i13 && iD1 >= 0) {
                    i9 i9Var2 = (i9) this.W;
                    h0(i9Var2, i9Var2, iD1);
                    return true;
                }
            }
        }
        return false;
    }

    public final void X(u9 u9Var, int i10, int i11) {
        int i12 = i10 + (i11 << 16);
        this.B0.put(i12, Z(u9Var.getText()));
        CharSequence prefix = u9Var.getPrefix();
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

    public final void a0(Canvas canvas, i9 i9Var, int i10) {
        u9 u9Var;
        int i11 = org.telegram.ui.ActionBar.g6.f23366uf;
        this.f25883o.setColor(org.telegram.ui.ActionBar.g6.v0(i11, this.f25871h0));
        this.f25885p.setColor(org.telegram.ui.ActionBar.g6.v0(i11, this.f25871h0));
        int iE0 = e0(i9Var);
        if (iE0 < 0) {
            return;
        }
        ArrayList arrayList = this.F0;
        arrayList.clear();
        i9Var.fillTextLayoutBlocks(arrayList);
        if (i10 < 0 || i10 >= arrayList.size() || (u9Var = (u9) arrayList.get(i10)) == null || u9Var.getLayout() == null || u9Var.getLayout().getText() == null) {
            return;
        }
        int i12 = this.f24545z0;
        int length = u9Var.getLayout().getText().length();
        if (i12 > length) {
            i12 = length;
        }
        int i13 = this.f24540u0;
        if (iE0 == i13 && iE0 == this.f24543x0) {
            int i14 = this.f24541v0;
            int i15 = this.f24544y0;
            if (i14 == i15 && i14 == i10) {
                i(canvas, u9Var.getLayout(), this.f24542w0, i12, true, true, 0.0f);
                return;
            }
            if (i10 == i14) {
                i(canvas, u9Var.getLayout(), this.f24542w0, length, true, false, 0.0f);
                return;
            }
            int i16 = i12;
            if (i10 == i15) {
                i(canvas, u9Var.getLayout(), 0, i16, false, true, 0.0f);
                return;
            } else {
                if (i10 <= i14 || i10 >= i15) {
                    return;
                }
                i(canvas, u9Var.getLayout(), 0, length, false, false, 0.0f);
                return;
            }
        }
        int i17 = i12;
        if (iE0 == i13 && this.f24541v0 == i10) {
            i(canvas, u9Var.getLayout(), this.f24542w0, length, true, false, 0.0f);
            return;
        }
        int i18 = this.f24543x0;
        if (iE0 == i18 && this.f24544y0 == i10) {
            i(canvas, u9Var.getLayout(), 0, i17, false, true, 0.0f);
            return;
        }
        if ((iE0 <= i13 || iE0 >= i18) && ((iE0 != i13 || i10 <= this.f24541v0) && (iE0 != i18 || i10 >= this.f24544y0))) {
            return;
        }
        i(canvas, u9Var.getLayout(), 0, length, false, false, 0.0f);
    }

    public final boolean b0() {
        int i10;
        int length;
        if (y() && this.W != null && this.f24540u0 == this.f24543x0 && (i10 = this.f24541v0) == this.f24544y0) {
            if (i10 < 0) {
                i10 = 0;
            }
            ArrayList arrayList = this.F0;
            arrayList.clear();
            ((i9) this.W).fillTextLayoutBlocks(arrayList);
            if (!arrayList.isEmpty() && i10 < arrayList.size() && (length = ((u9) arrayList.get(i10)).getLayout().getText().length()) > 0 && (this.f24542w0 > 0 || this.f24545z0 < length)) {
                return k0((i9) this.W, i10, 0, length);
            }
        }
        return false;
    }

    @Override
    public final boolean c(int i10) {
        if (this.f24540u0 == this.f24543x0 && this.f24541v0 == this.f24544y0) {
            return super.c(i10);
        }
        return true;
    }

    public final boolean c0(int i10, int i11, i9 i9Var) {
        int iCompare;
        int i12;
        int i13;
        int i14;
        int iE0 = e0(i9Var);
        if (iE0 < 0) {
            return false;
        }
        if (this.G0 < 0) {
            this.G0 = this.f24540u0;
            this.I0 = this.f24541v0;
            this.H0 = this.f24542w0;
        }
        i0(i9Var, iE0);
        int i15 = this.G0;
        int i16 = this.I0;
        int i17 = this.H0;
        if (iE0 != i15) {
            iCompare = Integer.compare(iE0, i15);
        } else {
            iCompare = i10 != i16 ? Integer.compare(i10, i16) : Integer.compare(i11, i17);
        }
        if (iCompare < 0) {
            i14 = this.G0;
            i12 = this.I0;
            i13 = this.H0;
        } else {
            int i18 = this.G0;
            i12 = i10;
            i10 = this.I0;
            i13 = i11;
            i11 = this.H0;
            iE0 = i18;
            i14 = iE0;
        }
        if (iE0 == i14 && i10 == i12 && i11 == i13) {
            f(false);
            return true;
        }
        this.f24540u0 = iE0;
        this.f24541v0 = i10;
        this.f24542w0 = i11;
        this.f24543x0 = i14;
        this.f24544y0 = i12;
        this.f24545z0 = i13;
        O();
        x();
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.invalidate();
        }
        g gVar = this.f25890r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
        return true;
    }

    @Override
    public final boolean d() {
        f2.k0 k0Var = this.E0;
        if (k0Var == null) {
            return true;
        }
        int iL0 = k0Var.L0();
        int iN0 = this.E0.N0();
        int i10 = this.f24540u0;
        if ((iL0 < i10 || iL0 > this.f24543x0) && (iN0 < i10 || iN0 > this.f24543x0)) {
            return i10 >= iL0 && this.f24543x0 <= iN0;
        }
        return true;
    }

    public final int d0(int i10, int i11, i9 i9Var) {
        int i12 = 0;
        if (i9Var instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) i9Var;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof i9) {
                    float f10 = i11;
                    if (f10 > childAt.getY() && f10 < childAt.getY() + childAt.getHeight()) {
                        return d0((int) (i10 - childAt.getX()), (int) (f10 - childAt.getY()), (i9) childAt);
                    }
                }
            }
        }
        ArrayList arrayList = this.F0;
        arrayList.clear();
        i9Var.fillTextLayoutBlocks(arrayList);
        if (arrayList.isEmpty()) {
            return -1;
        }
        int size = arrayList.size() - 1;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        int i16 = -1;
        while (true) {
            if (size < 0) {
                i12 = i15;
                size = i16;
                break;
            }
            u9 u9Var = (u9) arrayList.get(size);
            int y10 = u9Var.getY();
            int height = u9Var.getLayout().getHeight() + y10;
            if (i11 >= y10 && i11 < height) {
                break;
            }
            int iMin = Math.min(Math.abs(i11 - y10), Math.abs(i11 - height));
            if (iMin < i15) {
                i16 = size;
                i15 = iMin;
            }
            size--;
        }
        if (size < 0) {
            return -1;
        }
        int row = ((u9) arrayList.get(size)).getRow();
        if (row > 0 && i12 < AndroidUtilities.dp(24.0f)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                u9 u9Var2 = (u9) arrayList.get(size2);
                if (u9Var2.getRow() == row) {
                    int x8 = u9Var2.getX();
                    int width = u9Var2.getLayout().getWidth() + u9Var2.getX();
                    if (i10 >= x8 && i10 <= width) {
                        return size2;
                    }
                    int iMin2 = Math.min(Math.abs(i10 - x8), Math.abs(i10 - width));
                    if (iMin2 < i14) {
                        size = size2;
                        i14 = iMin2;
                    }
                }
            }
        }
        return size;
    }

    public final int e0(i9 i9Var) {
        ViewGroup viewGroup;
        View view = (View) i9Var;
        ViewParent parent = view.getParent();
        while (true) {
            viewGroup = this.F;
            if (parent != viewGroup && parent != null) {
                if (!(parent instanceof View)) {
                    parent = null;
                    break;
                }
                view = parent;
                parent = view.getParent();
            } else {
                break;
            }
        }
        if (parent != null) {
            return this.E != null ? RecyclerView.R(view) : viewGroup.indexOfChild(view);
        }
        return -1;
    }

    @Override
    public final void f(boolean z10) {
        super.f(z10);
        this.f24540u0 = -1;
        this.f24543x0 = -1;
        this.f24541v0 = -1;
        this.f24544y0 = -1;
        this.B0.clear();
        this.D0.clear();
        this.G0 = -1;
        this.H0 = -1;
    }

    @Override
    public final CharSequence t(i9 i9Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.F0;
        arrayList.clear();
        i9Var.fillTextLayoutBlocks(arrayList);
        if (z10) {
            i10 = this.A0;
        } else {
            i10 = this.J0 ? this.f24541v0 : this.f24544y0;
        }
        return (arrayList.isEmpty() || i10 < 0 || i10 >= arrayList.size()) ? "" : ((u9) arrayList.get(i10)).getLayout().getText();
    }

    public final boolean g0(View view) {
        if (!(view instanceof i9)) {
            return false;
        }
        ArrayList arrayList = this.F0;
        arrayList.clear();
        ((i9) view).fillTextLayoutBlocks(arrayList);
        if (view instanceof org.telegram.ui.y2) {
            return true;
        }
        return !arrayList.isEmpty();
    }

    public final void h0(i9 i9Var, i9 i9Var2, int i10) {
        int i11;
        int iE0 = e0(i9Var2);
        int iE1 = i9Var != null ? e0(i9Var) : -1;
        x();
        if (this.R && (i11 = this.f24540u0) == this.f24543x0) {
            if (iE0 == i11) {
                if (i10 < this.f24541v0) {
                    this.f24541v0 = i10;
                    P();
                    this.f25874j = true;
                    int i12 = this.v;
                    this.f24542w0 = i12;
                    this.f25895u = i12 - 1;
                } else {
                    this.f24544y0 = i10;
                    O();
                    this.f25874j = false;
                    this.f24545z0 = 0;
                }
            } else if (iE0 < i11) {
                this.f24540u0 = iE0;
                this.f24541v0 = i10;
                P();
                this.f25874j = true;
                int i13 = this.v;
                this.f24542w0 = i13;
                this.f25895u = i13 - 1;
            } else {
                this.f24543x0 = iE0;
                this.f24544y0 = i10;
                O();
                this.f25874j = false;
                this.f24545z0 = 0;
            }
        } else if (this.f25874j) {
            if (iE0 == iE1) {
                int i14 = this.f24544y0;
                if (i10 <= i14 || iE0 < this.f24543x0) {
                    this.f24540u0 = iE0;
                    this.f24541v0 = i10;
                    P();
                    this.f24542w0 = this.v;
                } else {
                    this.f24543x0 = iE0;
                    this.f24541v0 = i14;
                    this.f24544y0 = i10;
                    this.f24542w0 = this.f24545z0;
                    O();
                    this.f24545z0 = 0;
                    this.f25874j = false;
                }
            } else if (iE0 <= this.f24543x0) {
                this.f24540u0 = iE0;
                this.f24541v0 = i10;
                P();
                this.f24542w0 = this.v;
            } else {
                this.f24543x0 = iE0;
                this.f24541v0 = this.f24544y0;
                this.f24544y0 = i10;
                this.f24542w0 = this.f24545z0;
                O();
                this.f24545z0 = 0;
                this.f25874j = false;
            }
        } else if (iE0 == iE1) {
            int i15 = this.f24541v0;
            if (i10 >= i15 || iE0 > this.f24540u0) {
                this.f24543x0 = iE0;
                this.f24544y0 = i10;
                O();
                this.f24545z0 = 0;
            } else {
                this.f24540u0 = iE0;
                this.f24544y0 = i15;
                this.f24541v0 = i10;
                this.f24545z0 = this.f24542w0;
                P();
                this.f25874j = true;
                this.f24542w0 = this.v;
            }
        } else if (iE0 >= this.f24540u0) {
            this.f24543x0 = iE0;
            this.f24544y0 = i10;
            O();
            this.f24545z0 = 0;
        } else {
            this.f24540u0 = iE0;
            this.f24544y0 = this.f24541v0;
            this.f24541v0 = i10;
            this.f24545z0 = this.f24542w0;
            P();
            this.f25874j = true;
            this.f24542w0 = this.v;
        }
        ArrayList arrayList = this.F0;
        arrayList.clear();
        i9Var2.fillTextLayoutBlocks(arrayList);
        int size = arrayList.size();
        this.D0.put(iE0, size);
        for (int i16 = 0; i16 < size; i16++) {
            X((u9) arrayList.get(i16), iE0, i16);
        }
    }

    public final void i0(i9 i9Var, int i10) {
        ArrayList arrayList = this.F0;
        arrayList.clear();
        i9Var.fillTextLayoutBlocks(arrayList);
        int size = arrayList.size();
        this.D0.put(i10, size);
        for (int i11 = 0; i11 < size; i11++) {
            X((u9) arrayList.get(i11), i10, i11);
        }
    }

    @Override
    public final void j(int i10, m9 m9Var, boolean z10) {
        int i11;
        ArrayList arrayList = this.F0;
        arrayList.clear();
        m9Var.f24690e = null;
        i9 i9Var = (i9) (z10 ? this.X : this.W);
        if (i9Var == null) {
            m9Var.f24688b = null;
            return;
        }
        i9Var.fillTextLayoutBlocks(arrayList);
        if (z10) {
            i11 = this.A0;
        } else {
            i11 = this.J0 ? this.f24541v0 : this.f24544y0;
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            m9Var.f24688b = null;
            return;
        }
        m9Var.f24688b = ((u9) arrayList.get(i11)).getLayout();
        m9Var.f24690e = ((u9) arrayList.get(i11)).getSelectionBounds();
        m9Var.f24689c = 0.0f;
        m9Var.d = 0.0f;
    }

    public final void j0(int i10, int i11) {
        i9 i9Var;
        if (i10 < 0 || i11 < i10) {
            return;
        }
        CharSequence charSequence = (CharSequence) this.B0.get(i11);
        int length = charSequence == null ? 0 : charSequence.length();
        if (this.F == null) {
            i9Var = null;
            break;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.F.getChildCount()) {
                i9Var = null;
                break;
            }
            KeyEvent.Callback childAt = this.F.getChildAt(i12);
            if (childAt instanceof i9) {
                i9Var = (i9) childAt;
                if (e0(i9Var) == i11) {
                    break;
                }
            }
            i12++;
        }
        this.W = i9Var;
        this.f25895u = 0;
        this.v = length;
        this.f24540u0 = i10;
        this.f24543x0 = i11;
        this.f24544y0 = 0;
        this.f24541v0 = 0;
        this.f24542w0 = 0;
        this.f24545z0 = length;
        SparseIntArray sparseIntArray = this.D0;
        sparseIntArray.put(i10, Math.max(1, sparseIntArray.get(i10)));
        sparseIntArray.put(i11, Math.max(1, sparseIntArray.get(i11)));
        this.G0 = i10;
        this.H0 = 0;
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.setVisibility(0);
        }
        V();
        x();
        v();
        g gVar = this.f25890r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
        h7.j0 j0Var = this.D;
        if (j0Var != null) {
            j0Var.a(true);
        }
    }

    public final boolean k0(i9 i9Var, int i10, int i11, int i12) {
        int iE0 = e0(i9Var);
        if (iE0 < 0 || i11 == i12) {
            return false;
        }
        int iMin = Math.min(i11, i12);
        int iMax = Math.max(i11, i12);
        this.W = i9Var;
        this.f25895u = iMin;
        this.v = iMax;
        this.f24543x0 = iE0;
        this.f24540u0 = iE0;
        this.f24544y0 = i10;
        this.f24541v0 = i10;
        this.f24542w0 = iMin;
        this.f24545z0 = iMax;
        this.G0 = iE0;
        this.H0 = i11;
        this.I0 = i10;
        i0(i9Var, iE0);
        ArrayList arrayList = this.F0;
        if (!arrayList.isEmpty() && i10 >= 0 && i10 < arrayList.size()) {
            this.f25858a = ((u9) arrayList.get(i10)).getX();
            this.f25860b = ((u9) arrayList.get(i10)).getY();
        } else if (!arrayList.isEmpty()) {
            this.f25858a = ((u9) arrayList.get(0)).getX();
            this.f25860b = ((u9) arrayList.get(0)).getY();
        }
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.setVisibility(0);
        }
        V();
        x();
        v();
        g gVar = this.f25890r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
        h7.j0 j0Var = this.D;
        if (j0Var != null) {
            j0Var.a(true);
        }
        i9Var.invalidate();
        return true;
    }

    @Override
    public final int l(int i10, int i11, int i12, int i13, r9 r9Var, boolean z10) {
        int i14;
        i9 i9Var = (i9) r9Var;
        if (i9Var != null) {
            int width = i10 - i12;
            int lineBottom = i11 - i13;
            ArrayList arrayList = this.F0;
            arrayList.clear();
            i9Var.fillTextLayoutBlocks(arrayList);
            if (z10) {
                i14 = this.A0;
            } else {
                i14 = this.J0 ? this.f24541v0 : this.f24544y0;
            }
            if (i14 >= 0 && i14 < arrayList.size()) {
                Layout layout = ((u9) arrayList.get(i14)).getLayout();
                if (width < 0) {
                    width = 1;
                }
                if (lineBottom < 0) {
                    lineBottom = 1;
                }
                if (width > layout.getWidth()) {
                    width = layout.getWidth();
                }
                if (lineBottom > layout.getLineBottom(layout.getLineCount() - 1)) {
                    lineBottom = layout.getLineBottom(layout.getLineCount() - 1) - 1;
                }
                int i15 = 0;
                while (i15 < layout.getLineCount()) {
                    if (lineBottom < layout.getLineTop(i15) || lineBottom > layout.getLineBottom(i15)) {
                        i15++;
                    } else if (i15 >= 0) {
                        return layout.getOffsetForHorizontal(i15, width);
                    }
                }
                i15 = -1;
                if (i15 >= 0) {
                    return layout.getOffsetForHorizontal(i15, width);
                }
            }
        }
        return -1;
    }

    public final void l0(View view, int i10, int i11) {
        if (view instanceof i9) {
            this.f25891s = i10;
            this.f25893t = i11;
            i9 i9Var = (i9) view;
            this.X = i9Var;
            int iD0 = d0(i10, i11, i9Var);
            this.A0 = iD0;
            if (iD0 < 0) {
                this.X = null;
                return;
            }
            ArrayList arrayList = this.F0;
            this.f25862c = ((u9) arrayList.get(iD0)).getX();
            this.d = ((u9) arrayList.get(this.A0)).getY();
        }
    }

    public final void m0() {
        if (this.X != null) {
            this.f25870g0.run();
        }
    }

    @Override
    public final int n() {
        if (this.W != null) {
            ArrayList arrayList = this.F0;
            arrayList.clear();
            ((i9) this.W).fillTextLayoutBlocks(arrayList);
            int i10 = this.J0 ? this.f24541v0 : this.f24544y0;
            if (i10 >= 0 && i10 < arrayList.size()) {
                Layout layout = ((u9) arrayList.get(i10)).getLayout();
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.f24540u0;
        while (true) {
            int i11 = this.f24543x0;
            if (i10 > i11) {
                break;
            }
            int i12 = this.f24540u0;
            SparseIntArray sparseIntArray = this.D0;
            SparseArray sparseArray = this.B0;
            SparseArray sparseArray2 = this.C0;
            if (i10 == i12) {
                int i13 = i12 == i11 ? this.f24544y0 : sparseIntArray.get(i10) - 1;
                for (int i14 = this.f24541v0; i14 <= i13; i14++) {
                    int i15 = (i14 << 16) + i10;
                    CharSequence charSequence = (CharSequence) sparseArray.get(i15);
                    if (charSequence != null) {
                        int i16 = this.f24540u0;
                        int i17 = this.f24543x0;
                        if (i16 == i17 && i14 == this.f24544y0 && i14 == this.f24541v0) {
                            int i18 = this.f24545z0;
                            int length = this.f24542w0;
                            if (i18 >= length) {
                                length = i18;
                                i18 = length;
                            }
                            if (i18 < charSequence.length()) {
                                if (length > charSequence.length()) {
                                    length = charSequence.length();
                                }
                                spannableStringBuilder.append(charSequence.subSequence(i18, length));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i16 == i17 && i14 == this.f24544y0) {
                            CharSequence charSequence2 = (CharSequence) sparseArray2.get(i15);
                            if (charSequence2 != null) {
                                spannableStringBuilder.append(charSequence2).append(' ');
                            }
                            int length2 = this.f24545z0;
                            if (length2 > charSequence.length()) {
                                length2 = charSequence.length();
                            }
                            spannableStringBuilder.append(charSequence.subSequence(0, length2));
                            spannableStringBuilder.append('\n');
                        } else if (i14 == this.f24541v0) {
                            int i19 = this.f24542w0;
                            if (i19 < charSequence.length()) {
                                spannableStringBuilder.append(charSequence.subSequence(i19, charSequence.length()));
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
                for (int i20 = 0; i20 <= this.f24544y0; i20++) {
                    int i21 = (i20 << 16) + i10;
                    CharSequence charSequence4 = (CharSequence) sparseArray.get(i21);
                    if (charSequence4 != null) {
                        if (this.f24540u0 == this.f24543x0 && i20 == this.f24544y0 && i20 == this.f24541v0) {
                            int length3 = this.f24545z0;
                            int i22 = this.f24542w0;
                            if (i22 < charSequence4.length()) {
                                if (length3 > charSequence4.length()) {
                                    length3 = charSequence4.length();
                                }
                                spannableStringBuilder.append(charSequence4.subSequence(i22, length3));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i20 == this.f24544y0) {
                            CharSequence charSequence5 = (CharSequence) sparseArray2.get(i21);
                            if (charSequence5 != null) {
                                spannableStringBuilder.append(charSequence5).append(' ');
                            }
                            int length4 = this.f24545z0;
                            if (length4 > charSequence4.length()) {
                                length4 = charSequence4.length();
                            }
                            spannableStringBuilder.append(charSequence4.subSequence(0, length4));
                            spannableStringBuilder.append('\n');
                        } else {
                            CharSequence charSequence6 = (CharSequence) sparseArray2.get(i21);
                            if (charSequence6 != null) {
                                spannableStringBuilder.append(charSequence6).append(' ');
                            }
                            spannableStringBuilder.append(charSequence4);
                            spannableStringBuilder.append('\n');
                        }
                    }
                }
            } else {
                int i23 = sparseIntArray.get(i10);
                for (int i24 = this.f24541v0; i24 < i23; i24++) {
                    int i25 = (i24 << 16) + i10;
                    CharSequence charSequence7 = (CharSequence) sparseArray2.get(i25);
                    if (charSequence7 != null) {
                        spannableStringBuilder.append(charSequence7).append(' ');
                    }
                    spannableStringBuilder.append((CharSequence) sparseArray.get(i25));
                    spannableStringBuilder.append('\n');
                }
            }
            i10++;
        }
        if (spannableStringBuilder.length() <= 0) {
            return null;
        }
        p9[] p9VarArr = (p9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, p9.class);
        if (p9VarArr != null && p9VarArr.length > 0) {
            Arrays.sort(p9VarArr, new n1(spannableStringBuilder, 1));
            for (p9 p9Var : p9VarArr) {
                int spanStart = spannableStringBuilder.getSpanStart(p9Var);
                int spanEnd = spannableStringBuilder.getSpanEnd(p9Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    CharSequence charSequence8 = p9Var.f25011a;
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
