package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;
public final class zu extends s41 {
    public final av f42993e;

    public zu(av avVar, String str) {
        super(str, (fz0) null);
        this.f42993e = avVar;
    }

    @Override
    public final void onClick(View view) {
        av avVar = this.f42993e;
        ev evVar = avVar.f33649y;
        Pattern pattern = ev.Q1;
        org.telegram.messenger.np.u1(evVar.f30173a).F3(getURL(), avVar.f33649y.n1, 1, null);
        avVar.f33649y.M0();
        avVar.f33649y.dismiss();
    }
}
