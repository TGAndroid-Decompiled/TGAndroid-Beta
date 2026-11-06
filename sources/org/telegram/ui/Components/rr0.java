package org.telegram.ui.Components;
public class rr0 extends pj0 implements di.f7 {
    public int f37823e3;
    public int f37824f3;
    public int f37825g3;
    public int f37826h3;
    public boolean f37827i3;

    @Override
    public final void a(int[] iArr) {
        if (this.f37827i3) {
            iArr[0] = getPaddingTop() - org.telegram.messenger.g0.L(2.0f);
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
            return;
        }
        iArr[0] = (getPaddingTop() - org.telegram.messenger.g0.L(2.0f)) - this.f37825g3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f37826h3;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f37823e3 = i10;
        this.f37824f3 = i12;
        super.setPadding(i7, i10, i11, i12);
    }
}
