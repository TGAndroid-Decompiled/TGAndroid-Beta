package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;
public final class yu extends s41 {
    public final zu f42509e;

    public yu(zu zuVar, String str) {
        super(str, (fz0) null);
        this.f42509e = zuVar;
    }

    @Override
    public final void onClick(View view) {
        zu zuVar = this.f42509e;
        dv dvVar = zuVar.f42959y;
        Pattern pattern = dv.Q1;
        org.telegram.messenger.np.u1(dvVar.f30139a).F3(getURL(), zuVar.f42959y.n1, 1, null);
        zuVar.f42959y.M0();
        zuVar.f42959y.dismiss();
    }
}
