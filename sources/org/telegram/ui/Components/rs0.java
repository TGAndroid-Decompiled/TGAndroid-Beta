package org.telegram.ui.Components;
public class rs0 extends tk0 implements th.l5 {
    public int f30011e3;
    public int f30012f3;
    public int f30013g3;
    public int f30014h3;
    public boolean f30015i3;

    @Override
    public final void a(int[] iArr) {
        if (this.f30015i3) {
            iArr[0] = getPaddingTop() - org.telegram.messenger.i0.L(2.0f);
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
            return;
        }
        iArr[0] = (getPaddingTop() - org.telegram.messenger.i0.L(2.0f)) - this.f30013g3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f30014h3;
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f30011e3 = i11;
        this.f30012f3 = i13;
        super.setPadding(i10, i11, i12, i13);
    }
}
