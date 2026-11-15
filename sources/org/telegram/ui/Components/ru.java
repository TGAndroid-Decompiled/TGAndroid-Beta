package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;
public final class ru extends f41 {
    public final su f39064e;

    public ru(su suVar, String str) {
        super(str, (wy0) null);
        this.f39064e = suVar;
    }

    @Override
    public final void onClick(View view) {
        su suVar = this.f39064e;
        wu wuVar = suVar.f39434y;
        Pattern pattern = wu.Q1;
        org.telegram.messenger.np.s1(wuVar.f29679a).y3(getURL(), suVar.f39434y.n1, 1, null);
        suVar.f39434y.L0();
        suVar.f39434y.dismiss();
    }
}
