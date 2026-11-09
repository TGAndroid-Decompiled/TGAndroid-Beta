package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;
public final class mu extends c41 {
    public final nu f36148e;

    public mu(nu nuVar, String str) {
        super(str, (vy0) null);
        this.f36148e = nuVar;
    }

    @Override
    public final void onClick(View view) {
        nu nuVar = this.f36148e;
        ru ruVar = nuVar.f36511y;
        Pattern pattern = ru.M1;
        org.telegram.messenger.qp.s1(ruVar.f28621a).y3(getURL(), nuVar.f36511y.f37807j1, 1, null);
        nuVar.f36511y.L0();
        nuVar.f36511y.dismiss();
    }
}
