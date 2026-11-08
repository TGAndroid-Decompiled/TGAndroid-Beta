package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;
public final class mu extends b41 {
    public final nu f36117e;

    public mu(nu nuVar, String str) {
        super(str, (uy0) null);
        this.f36117e = nuVar;
    }

    @Override
    public final void onClick(View view) {
        nu nuVar = this.f36117e;
        ru ruVar = nuVar.f36450y;
        Pattern pattern = ru.M1;
        org.telegram.messenger.qp.s1(ruVar.f28616a).y3(getURL(), nuVar.f36450y.f37776j1, 1, null);
        nuVar.f36450y.L0();
        nuVar.f36450y.dismiss();
    }
}
