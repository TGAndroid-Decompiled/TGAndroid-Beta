package org.telegram.ui.Components;
public class as0 extends ck0 implements fi.w6 {
    public int f33440f3;
    public int f33441g3;
    public int f33442h3;
    public int f33443i3;
    public boolean j3;

    @Override
    public final void a(int[] iArr) {
        if (this.j3) {
            iArr[0] = getPaddingTop() - org.telegram.messenger.g0.L(2.0f);
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
            return;
        }
        iArr[0] = (getPaddingTop() - org.telegram.messenger.g0.L(2.0f)) - this.f33442h3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f33443i3;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f33440f3 = i10;
        this.f33441g3 = i12;
        super.setPadding(i7, i10, i11, i12);
    }
}
