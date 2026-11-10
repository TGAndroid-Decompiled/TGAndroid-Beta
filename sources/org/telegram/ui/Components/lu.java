package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;
public final class lu extends b41 {
    public final mu f35741e;

    public lu(mu muVar, String str) {
        super(str, (uy0) null);
        this.f35741e = muVar;
    }

    @Override
    public final void onClick(View view) {
        mu muVar = this.f35741e;
        qu quVar = muVar.f36103y;
        Pattern pattern = qu.P1;
        org.telegram.messenger.qp.s1(quVar.f28669a).y3(getURL(), muVar.f36103y.f37396m1, 1, null);
        muVar.f36103y.L0();
        muVar.f36103y.dismiss();
    }
}
