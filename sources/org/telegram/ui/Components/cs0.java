package org.telegram.ui.Components;
public class cs0 extends ek0 implements fi.w6 {
    public int f34261f3;
    public int f34262g3;
    public int f34263h3;
    public int f34264i3;
    public boolean j3;

    @Override
    public final void a(int[] iArr) {
        if (this.j3) {
            iArr[0] = getPaddingTop() - org.telegram.messenger.g0.L(2.0f);
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
            return;
        }
        iArr[0] = (getPaddingTop() - org.telegram.messenger.g0.L(2.0f)) - this.f34263h3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f34264i3;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f34261f3 = i10;
        this.f34262g3 = i12;
        super.setPadding(i7, i10, i11, i12);
    }
}
