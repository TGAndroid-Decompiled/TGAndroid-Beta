package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;
public final class lu extends b41 {
    public final mu f35764e;

    public lu(mu muVar, String str) {
        super(str, (uy0) null);
        this.f35764e = muVar;
    }

    @Override
    public final void onClick(View view) {
        mu muVar = this.f35764e;
        qu quVar = muVar.f36099y;
        Pattern pattern = qu.M1;
        org.telegram.messenger.qp.s1(quVar.f28613a).y3(getURL(), muVar.f36099y.f37391j1, 1, null);
        muVar.f36099y.L0();
        muVar.f36099y.dismiss();
    }
}
