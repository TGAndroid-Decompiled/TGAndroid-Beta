package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class po implements View.OnClickListener {
    public final int f29679a;
    public final Context f29680b;
    public final int f29681c;
    public final Object d;
    public final Object f29682e;
    public final Object f29683f;

    public po(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f29679a = i11;
        this.d = obj;
        this.f29680b = context;
        this.f29682e = obj2;
        this.f29681c = i10;
        this.f29683f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29679a) {
            case 0:
                ((so) this.d).a();
                i2.s sVar = new i2.s(this.f29681c, (ro) this.f29683f, 7);
                e5.G(this.f29680b, (org.telegram.ui.ActionBar.d6) this.f29682e, sVar);
                return;
            default:
                qp qpVar = (qp) this.f29682e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f29683f;
                ((org.telegram.ui.ActionBar.f3) this.d).dismiss();
                Activity findActivity = AndroidUtilities.findActivity(this.f29680b);
                if (findActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", qpVar.f30147a.f24098q).apply();
                    org.telegram.ui.Components.voip.g2.g(findActivity, this.f29681c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
