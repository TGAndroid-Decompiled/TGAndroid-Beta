package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;
public final class lu extends a41 {
    public final mu f35744e;

    public lu(mu muVar, String str) {
        super(str, (ty0) null);
        this.f35744e = muVar;
    }

    @Override
    public final void onClick(View view) {
        mu muVar = this.f35744e;
        qu quVar = muVar.f36083y;
        Pattern pattern = qu.M1;
        org.telegram.messenger.qp.s1(quVar.f28612a).y3(getURL(), muVar.f36083y.f37396j1, 1, null);
        muVar.f36083y.L0();
        muVar.f36083y.dismiss();
    }
}
