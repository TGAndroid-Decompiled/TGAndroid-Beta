package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class po implements View.OnClickListener {
    public final int f29772a;
    public final Context f29773b;
    public final int f29774c;
    public final Object d;
    public final Object f29775e;
    public final Object f29776f;

    public po(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f29772a = i11;
        this.d = obj;
        this.f29773b = context;
        this.f29775e = obj2;
        this.f29774c = i10;
        this.f29776f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29772a) {
            case 0:
                ((so) this.d).a();
                i2.s sVar = new i2.s(this.f29774c, (ro) this.f29776f, 7);
                e5.G(this.f29773b, (org.telegram.ui.ActionBar.d6) this.f29775e, sVar);
                return;
            default:
                qp qpVar = (qp) this.f29775e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f29776f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f29773b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", qpVar.f30169a.f24101q).apply();
                    org.telegram.ui.Components.voip.g2.g(findActivity, this.f29774c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
