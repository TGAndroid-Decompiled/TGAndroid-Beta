package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;
public final class lu extends v31 {
    public final mu f35739e;

    public lu(mu muVar, String str) {
        super(str, (ty0) null);
        this.f35739e = muVar;
    }

    @Override
    public final void onClick(View view) {
        mu muVar = this.f35739e;
        qu quVar = muVar.f36145y;
        Pattern pattern = qu.M1;
        org.telegram.messenger.qp.s1(quVar.f28612a).y3(getURL(), muVar.f36145y.f37506j1, 1, null);
        muVar.f36145y.L0();
        muVar.f36145y.dismiss();
    }
}
