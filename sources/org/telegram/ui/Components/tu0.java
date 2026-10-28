package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class tu0 extends nm0 implements di.o7 {
    public int f33150f3;
    public int f33151g3;
    public int f33152h3;
    public int f33153i3;
    public boolean f33154j3;

    @Override
    public final void a(int[] iArr) {
        if (this.f33154j3) {
            iArr[0] = getPaddingTop() - AndroidUtilities.dp(2.0f);
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
            return;
        }
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f33152h3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f33153i3;
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f33150f3 = i11;
        this.f33151g3 = i13;
        super.setPadding(i10, i11, i12, i13);
    }
}
