package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

public final class he1 extends ue1 {

    public final we1 f38793e3;

    public he1(we1 we1Var, Context context) {
        super(we1Var, context);
        this.f38793e3 = we1Var;
    }

    @Override
    public final boolean S0() {
        ArrayList arrayList = this.f38793e3.f43722b;
        return (getAdapter() == null || this.T1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((ne1) arrayList.get(0)).f40813c == null || ((ne1) arrayList.get(0)).f40813c.f22432id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f38793e3.y0();
    }
}
