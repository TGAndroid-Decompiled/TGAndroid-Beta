package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;
public final class ku extends v31 {
    public final lu f35486e;

    public ku(lu luVar, String str) {
        super(str, (ty0) null);
        this.f35486e = luVar;
    }

    @Override
    public final void onClick(View view) {
        lu luVar = this.f35486e;
        pu puVar = luVar.f35890y;
        Pattern pattern = pu.N1;
        org.telegram.messenger.hp.s1(puVar.f28583a).y3(getURL(), luVar.f35890y.k1, 1, null);
        luVar.f35890y.L0();
        luVar.f35890y.dismiss();
    }
}
