package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class su0 extends mm0 implements di.o7 {
    public int f32682f3;
    public int f32683g3;
    public int f32684h3;
    public int f32685i3;
    public boolean f32686j3;

    @Override
    public final void a(int[] iArr) {
        if (this.f32686j3) {
            iArr[0] = getPaddingTop() - AndroidUtilities.dp(2.0f);
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
            return;
        }
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f32684h3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f32685i3;
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f32682f3 = i11;
        this.f32683g3 = i13;
        super.setPadding(i10, i11, i12, i13);
    }
}
