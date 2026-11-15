package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;
public final class ru extends f41 {
    public final su f39067e;

    public ru(su suVar, String str) {
        super(str, (wy0) null);
        this.f39067e = suVar;
    }

    @Override
    public final void onClick(View view) {
        su suVar = this.f39067e;
        wu wuVar = suVar.f39436y;
        Pattern pattern = wu.Q1;
        org.telegram.messenger.np.s1(wuVar.f29679a).y3(getURL(), suVar.f39436y.n1, 1, null);
        suVar.f39436y.L0();
        suVar.f39436y.dismiss();
    }
}
