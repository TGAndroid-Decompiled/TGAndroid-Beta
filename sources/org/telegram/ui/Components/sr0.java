package org.telegram.ui.Components;
public class sr0 extends uj0 implements fi.z6 {
    public int f39397f3;
    public int f39398g3;
    public int f39399h3;
    public int f39400i3;
    public boolean j3;

    @Override
    public final void a(int[] iArr) {
        if (this.j3) {
            iArr[0] = getPaddingTop() - org.telegram.messenger.g0.L(2.0f);
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
            return;
        }
        iArr[0] = (getPaddingTop() - org.telegram.messenger.g0.L(2.0f)) - this.f39399h3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f39400i3;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f39397f3 = i10;
        this.f39398g3 = i12;
        super.setPadding(i7, i10, i11, i12);
    }
}
