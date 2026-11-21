package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;
public final class zu extends s41 {
    public final av f42989e;

    public zu(av avVar, String str) {
        super(str, (fz0) null);
        this.f42989e = avVar;
    }

    @Override
    public final void onClick(View view) {
        av avVar = this.f42989e;
        ev evVar = avVar.f33636y;
        Pattern pattern = ev.Q1;
        org.telegram.messenger.mp.u1(evVar.f30170a).F3(getURL(), avVar.f33636y.n1, 1, null);
        avVar.f33636y.M0();
        avVar.f33636y.dismiss();
    }
}
