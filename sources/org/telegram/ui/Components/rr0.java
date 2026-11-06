package org.telegram.ui.Components;
public class rr0 extends pj0 implements di.f7 {
    public int f37726e3;
    public int f37727f3;
    public int f37728g3;
    public int f37729h3;
    public boolean f37730i3;

    @Override
    public final void a(int[] iArr) {
        if (this.f37730i3) {
            iArr[0] = getPaddingTop() - org.telegram.messenger.g0.L(2.0f);
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
            return;
        }
        iArr[0] = (getPaddingTop() - org.telegram.messenger.g0.L(2.0f)) - this.f37728g3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f37729h3;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f37726e3 = i10;
        this.f37727f3 = i12;
        super.setPadding(i7, i10, i11, i12);
    }
}
