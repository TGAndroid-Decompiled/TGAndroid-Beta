package org.telegram.ui.Components;
public class qr0 extends tj0 implements ei.g7 {
    public int f37515f3;
    public int f37516g3;
    public int f37517h3;
    public int i3;
    public boolean f37518j3;

    @Override
    public final void a(int[] iArr) {
        if (this.f37518j3) {
            iArr[0] = getPaddingTop() - org.telegram.messenger.g0.L(2.0f);
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
            return;
        }
        iArr[0] = (getPaddingTop() - org.telegram.messenger.g0.L(2.0f)) - this.f37517h3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.i3;
    }

    @Override
    public final void setPadding(int i3, int i10, int i11, int i12) {
        this.f37515f3 = i10;
        this.f37516g3 = i12;
        super.setPadding(i3, i10, i11, i12);
    }
}
