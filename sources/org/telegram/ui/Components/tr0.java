package org.telegram.ui.Components;
public class tr0 extends qj0 implements di.g7 {
    public int f38476e3;
    public int f38477f3;
    public int f38478g3;
    public int f38479h3;
    public boolean f38480i3;

    @Override
    public final void a(int[] iArr) {
        if (this.f38480i3) {
            iArr[0] = getPaddingTop() - org.telegram.messenger.g0.L(2.0f);
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
            return;
        }
        iArr[0] = (getPaddingTop() - org.telegram.messenger.g0.L(2.0f)) - this.f38478g3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f38479h3;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f38476e3 = i10;
        this.f38477f3 = i12;
        super.setPadding(i7, i10, i11, i12);
    }
}
