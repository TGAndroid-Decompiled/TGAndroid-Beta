package org.telegram.ui.Components;
public class rr0 extends pj0 implements di.f7 {
    public int f37747e3;
    public int f37748f3;
    public int f37749g3;
    public int f37750h3;
    public boolean f37751i3;

    @Override
    public final void a(int[] iArr) {
        if (this.f37751i3) {
            iArr[0] = getPaddingTop() - org.telegram.messenger.g0.L(2.0f);
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
            return;
        }
        iArr[0] = (getPaddingTop() - org.telegram.messenger.g0.L(2.0f)) - this.f37749g3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f37750h3;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f37747e3 = i10;
        this.f37748f3 = i12;
        super.setPadding(i7, i10, i11, i12);
    }
}
